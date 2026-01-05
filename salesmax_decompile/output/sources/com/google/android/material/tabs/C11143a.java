package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import p001o.gh0;
import p001o.xzi;

/* renamed from: com.google.android.material.tabs.a */
/* loaded from: classes3.dex */
public class C11143a {
    /* renamed from: a */
    public static RectF m15307a(TabLayout tabLayout, View view) {
        return view == null ? new RectF() : (tabLayout.m15219D() || !(view instanceof TabLayout.TabView)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : m15308b((TabLayout.TabView) view, 24);
    }

    /* renamed from: b */
    public static RectF m15308b(TabLayout.TabView tabView, int i) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int iM57071g = (int) xzi.m57071g(tabView.getContext(), i);
        if (contentWidth < iM57071g) {
            contentWidth = iM57071g;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(left - i2, top - (contentHeight / 2), i2 + left, top + (left / 2));
    }

    /* renamed from: c */
    public void m15309c(TabLayout tabLayout, View view, Drawable drawable) {
        RectF rectFM15307a = m15307a(tabLayout, view);
        drawable.setBounds((int) rectFM15307a.left, drawable.getBounds().top, (int) rectFM15307a.right, drawable.getBounds().bottom);
    }

    /* renamed from: d */
    public void mo15310d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFM15307a = m15307a(tabLayout, view);
        RectF rectFM15307a2 = m15307a(tabLayout, view2);
        drawable.setBounds(gh0.m28649c((int) rectFM15307a.left, (int) rectFM15307a2.left, f), drawable.getBounds().top, gh0.m28649c((int) rectFM15307a.right, (int) rectFM15307a2.right, f), drawable.getBounds().bottom);
    }
}
