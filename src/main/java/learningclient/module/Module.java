package learningclient.module;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Module {

    public String modName;
    public int key;
    public String modDesc;
    @Setter
    public boolean enabled;
    public Category category;
    public Module(String modName, Category category){
        this.modName = modName;
        this.category = category;
    }

    public Module setKey(int key){
        this.key = key;
        return this;
    }

    public Module setDesc(String text){
        this.modDesc = text;
        return this;
    }

    public void onEnable(){

    }

    public void onDisable(){

    }

    public void toggle(){
        enabled = !enabled;
        if(enabled){
            onEnable();
        }else{
            onDisable();
        }
    }
}
