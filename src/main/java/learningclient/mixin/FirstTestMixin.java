package learningclient.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.util.math.ColorHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class FirstTestMixin {

    @Inject(method = "render", at = @At(value = "HEAD"))
    public void render(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo callbackInfo){
        String hello =  "Hello Minecraft!";
        TextRenderer textRenderer = MinecraftClient.getInstance().textRenderer;
        context.drawTextWithShadow(textRenderer, hello, 2, 2, ColorHelper.getWhite(1.0F));
    }


}
