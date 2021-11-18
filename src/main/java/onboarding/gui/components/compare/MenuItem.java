package onboarding.gui.components.compare;


public class MenuItem {
    public enum MenuItemTypes {
        WEB_VIEW("Web View"),
        CHARTS("Charts"),
        MAP("Map"),
        UI_ELEMENTS("UI elements");

        private String type;

        MenuItemTypes(String type){
            this.type = type;
        }

        public String getType(){
            return type;
        }


    }

    private MenuItemTypes type;

    public MenuItem(String text){
        for(MenuItemTypes type: MenuItemTypes.values()){
            if(text.equals(type.getType())){
                this.type = type;
            }
        }
    }

    public MenuItemTypes getType(){
        return this.type;
    }
}
