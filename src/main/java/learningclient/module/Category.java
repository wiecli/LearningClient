package learningclient.module;

import lombok.Getter;

public enum Category {
    COMBAT("Combat"),
    MOVE("Movement"),
    PLAYER("Player"),
    MISC("Miscellaneous"),
    RENDER("Render")
    ;

    @Getter
    private final String displayTextCategory;

    Category(String displayTextCategory){
        this.displayTextCategory = displayTextCategory;
    }
}
