package com.github.appreciated.app.layout.test.layouts.left.leftoverlay;

import com.github.appreciated.app.layout.component.applayout.AppLayout;
import com.github.appreciated.app.layout.component.applayout.LeftLayouts;
import com.github.appreciated.app.layout.test.base.AbstractLeftBehaviorBasicView;
import com.github.appreciated.app.layout.test.layouts.left.leftoverlay.view.*;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.router.RoutePrefix;

@RoutePrefix(absolute = true, value = "leftoverlay")
public class LeftOverlayBehaviourView extends AbstractLeftBehaviorBasicView {
    @Override
    public Class<? extends AppLayout> getVariant() {
        return LeftLayouts.LeftOverlay.class;
    }

    @Override
    public Class<? extends Component>[] getViews() {
        return new Class[]{View1.class, View2.class, View3.class, View4.class, View5.class, View6.class, View7.class, View8.class, View9.class};
    }


}
