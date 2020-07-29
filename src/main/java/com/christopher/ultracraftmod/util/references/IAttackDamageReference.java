package com.christopher.ultracraftmod.util.references;

public interface IAttackDamageReference {
    public static final float GOLD = 2.0F;
    public static final float WOODEN = 2.0F;
    public static final float STONE = 3.0F;
    public static final float IRON = 4.0F;
    public static final float DIAMOND = 5.0F;
    public static final float NETHERITE = 6.0F;

    public static interface AttackDamageDefaults {
        public static final float GOLD = 0.0F;
        public static final float WOODEN = 0.0F;
        public static final float STONE = 1.0F;
        public static final float IRON = 2.0F;
        public static final float DIAMOND = 3.0F;
        public static final float NETHERITE = 4.0F;
    }

    public static interface AttackDamageProperties {
        public static final float GOLD = 6.0F;
        public static final float WOODEN = 6.0F;
        public static final float STONE = 7.0F;
        public static final float IRON = 6.0F;
        public static final float DIAMOND = 5.0F;
        public static final float NETHERITE = 5.0F;

    }

    public static interface AttackSpeedProperties {
        public static final float GOLD = -2.5F;
        public static final float WOODEN = -2.7F;
        public static final float STONE = -2.7F;
        public static final float IRON = -2.6F;
        public static final float DIAMOND = -2.5F;
        public static final float NETHERITE = -2.5F;

    }

}
