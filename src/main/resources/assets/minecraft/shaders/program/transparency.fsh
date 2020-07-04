#version 110

uniform sampler2D DiffuseSampler;
uniform sampler2D DiffuseDepthSampler;
uniform sampler2D TranslucentSampler;
uniform sampler2D TranslucentDepthSampler;
uniform sampler2D ItemEntitySampler;
uniform sampler2D ItemEntityDepthSampler;
uniform sampler2D ParticlesSampler;
uniform sampler2D ParticlesDepthSampler;
uniform sampler2D WeatherSampler;
uniform sampler2D WeatherDepthSampler;
uniform sampler2D CloudsSampler;
uniform sampler2D CloudsDepthSampler;

varying vec2 texCoord;

// TODO: local variable or access from array?

#define NUM_LAYERS 6
#define add_layer(color_sampler, depth_sampler) \
    { \
        vec4 color = texture2D(color_sampler, texCoord); \
        if (color.a > 0.0) { \
            float depth = texture2D(depth_sampler, texCoord).r; \
            if (depth < diffuse_depth) { \
                color_layers[layer_count] = color; \
                depth_layers[layer_count] = depth; \
                layer_count++; \
            } \
        } \
    }

vec4 color_layers[NUM_LAYERS];
float depth_layers[NUM_LAYERS];

int init_arrays() {
    vec4 diffuse_color = vec4(texture2D(DiffuseSampler, texCoord).rgb, 1.0);
    float diffuse_depth = texture2D(DiffuseDepthSampler, texCoord).r;
    
    int layer_count = 1;
    color_layers[0] = diffuse_color;
    depth_layers[0] = diffuse_depth;
    
    add_layer(TranslucentSampler, TranslucentDepthSampler);
    add_layer(ItemEntitySampler, ItemEntityDepthSampler);
    add_layer(ParticlesSampler, ParticlesDepthSampler);
    add_layer(WeatherSampler, WeatherDepthSampler);
    add_layer(CloudsSampler, CloudsDepthSampler);

    int j;
    for (int i = 1; i < layer_count; i++) {
        j = i;
        
        while (depth_layers[j] > depth_layers[j - 1]) {
            vec4 color = color_layers[j];
            color_layers[i] = color_layers[i - 1];
            color_layers[i - 1] = color;
            
            float depth = depth_layers[j];
            depth_layers[i] = depth_layers[i - 1];
            depth_layers[i - 1] = depth;
            
            if (--j == 0) break;
        }
    }
    
    return layer_count;
}

void main() {
    int count = init_arrays();

    vec3 OutTexel = vec3(0.0);
    
    for (int ii = 0; ii < count; ++ii) {
        vec4 color = color_layers[ii];
        OutTexel = mix(OutTexel, color.rgb, color.a);
    }
    
    gl_FragColor = vec4(OutTexel.rgb, 1.0);
    
    //gl_FragColor = vec4(vec3(float(count - 1) / 5.0), 1.0);
}
