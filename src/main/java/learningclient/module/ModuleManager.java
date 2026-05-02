package learningclient.module;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {

    public List<Module> moduleList = new ArrayList<>();

    public void registerModules(){
        moduleList.addAll(List.of(

        ));

    }

    public List<Module> getModuleList(){
        return moduleList;
    }

}
