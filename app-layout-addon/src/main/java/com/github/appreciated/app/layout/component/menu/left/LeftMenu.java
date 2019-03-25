package com.github.appreciated.app.layout.component.menu.left;

import com.github.appreciated.app.layout.builder.interfaces.NavigationElementContainer;

public class LeftMenu extends LeftSubmenuContainer implements NavigationElementContainer {

    public LeftMenu() {
        getElement().getThemeList().set("spacing",false);
        getElement().getThemeList().set("spacing-s",true);
    }
}
