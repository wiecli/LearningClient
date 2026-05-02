package learningclient.mixin;

import net.minecraft.client.gui.screen.ConfirmLinkScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.awt.*;


@Mixin(Screen.class)
public abstract class CreateClientButtonMixin {


    @Inject(method = "init*", at = @At(value = "RETURN"))
    public void init(CallbackInfo callbackInfo) {
        Screen screen = (Screen) (Object) this;
        ButtonWidget button = ButtonWidget.builder(
                Text.literal("GitHub"),
                buttonWidget -> {
                    if (buttonWidget.isClickable()) {
                        ConfirmLinkScreen.open((Screen) (Object) this, "https://github.com/wiecli");
                    }
                }
        ).dimensions(10, 20, 100, 20).build();

        screen.addDrawableChild(button);
    }

}
