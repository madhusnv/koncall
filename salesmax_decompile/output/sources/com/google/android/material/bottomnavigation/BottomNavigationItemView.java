package com.google.android.material.bottomnavigation;

import android.content.Context;
import com.google.android.material.navigation.NavigationBarItemView;
import p001o.n9e;
import p001o.x6e;

/* loaded from: classes3.dex */
public class BottomNavigationItemView extends NavigationBarItemView {
    public BottomNavigationItemView(Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public int getItemDefaultMarginResId() {
        return x6e.design_bottom_navigation_margin;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public int getItemLayoutResId() {
        return n9e.design_bottom_navigation_item;
    }
}
