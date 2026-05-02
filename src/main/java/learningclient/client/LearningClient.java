package learningclient.client;

import learningclient.module.ModuleManager;
import net.fabricmc.api.ClientModInitializer;

public class LearningClient implements ClientModInitializer {

    public static LearningClient instance = new LearningClient();

    public ModuleManager moduleManager = new ModuleManager();

    public String clientName = "Learning";
    public String clientVersion = "1.0b";


    @Override
    public void onInitializeClient() {
        moduleManager.registerModules();
    }
}
