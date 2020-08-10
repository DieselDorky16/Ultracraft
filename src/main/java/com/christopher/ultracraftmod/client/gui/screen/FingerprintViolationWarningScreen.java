package com.christopher.ultracraftmod.client.gui.screen;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.chat.NarratorChatListener;
import net.minecraft.client.gui.screen.ErrorScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.Util;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.LoadingFailedException;
import net.minecraftforge.fml.ModLoadingException;
import net.minecraftforge.fml.ModLoadingWarning;
import net.minecraftforge.fml.client.gui.screen.LoadingErrorScreen;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

@OnlyIn(Dist.CLIENT)
public class FingerprintViolationWarningScreen extends ErrorScreen {
    private static final Logger LOGGER = LogManager.getLogger();
    private final Path modsDir;
    private final Path logFile;
    private final List<ModLoadingException> modLoadErrors;
    private final List<ModLoadingWarning> modLoadWarnings;
    private LoadingErrorScreen.LoadingEntryList entryList;
    private ITextComponent errorHeader;
    private ITextComponent warningHeader;
    private static final ITextComponent field_230157_b_ = (new TranslationTextComponent("alerts.fingerprintviolation.title")).mergeStyle(TextFormatting.BOLD);
    private static final ITextComponent field_230158_c_ = new TranslationTextComponent("alerts.fingerprintviolation.message");
    private static final ITextComponent field_238858_q_ = field_230157_b_.deepCopy().appendString("\n").append(field_230158_c_);
    private final List<ITextProperties> field_230163_h_ = Lists.newArrayList();

    public FingerprintViolationWarningScreen(LoadingFailedException loadingException, List<ModLoadingWarning> warnings) {
        super(NarratorChatListener.EMPTY, null);
        this.modLoadWarnings = warnings;
        this.modLoadErrors = loadingException == null ? Collections.emptyList() : loadingException.getErrors();
        this.modsDir = FMLPaths.MODSDIR.get();
        this.logFile = FMLPaths.GAMEDIR.get().resolve(Paths.get("logs","latest.log"));
    }


    protected void init() {
        super.init();
        this.field_230163_h_.clear();
        this.field_230163_h_.addAll(this.font.func_238425_b_(field_230158_c_, this.width - 50));
        int i = (this.field_230163_h_.size() + 1) * 9;
        this.addButton(new Button(this.width / 2 - 155, 100 + i, 150, 20, new TranslationTextComponent("menu.ultracraft.redownload"), (p_213019_0_) -> {
            p_213019_0_.active = false;
            Util.getOSType().openURI("https://www.planetminecraft.com/mod/ultracraft-4705139/");
        }));
        this.addButton(new Button(this.width / 2 - 155 + 160, 100 + i, 150, 20, DialogTexts.field_240637_h_, (p_230164_1_) -> {
            this.minecraft.shutdown();
        }));
    }

    public boolean shouldCloseOnEsc() {
        return false;
    }

    public String getNarrationMessage() {
        return field_238858_q_.getString();
    }

    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderDirtBackground(0);
        this.drawCenteredString(matrixStack, this.font, field_230157_b_, this.width / 2, 30, 16777215);
        int i = 70;

        for(ITextProperties itextproperties : this.field_230163_h_) {
            this.drawCenteredString(matrixStack, this.font, itextproperties, this.width / 2, i, 16777215);
            i += 9;
        }

        super.render(matrixStack, mouseX, mouseY, partialTicks);
    }
}