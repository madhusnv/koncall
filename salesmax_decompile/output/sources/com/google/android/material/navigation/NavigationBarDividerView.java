package com.google.android.material.navigation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C1794g;
import p001o.ksb;
import p001o.n9e;

/* loaded from: classes3.dex */
public class NavigationBarDividerView extends FrameLayout implements ksb {

    /* renamed from: a */
    public boolean f12711a;

    /* renamed from: b */
    public boolean f12712b;

    /* renamed from: c */
    public boolean f12713c;

    public NavigationBarDividerView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(n9e.m3_navigation_menu_divider, (ViewGroup) this, true);
        m14776a();
    }

    /* renamed from: a */
    public void m14776a() {
        setVisibility((!this.f12713c || (!this.f12711a && this.f12712b)) ? 8 : 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    /* renamed from: c */
    public void mo3948c(C1794g c1794g, int i) {
        m14776a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    /* renamed from: e */
    public boolean mo3949e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    public C1794g getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setDividersEnabled(boolean z) {
        this.f12713c = z;
        m14776a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    @Override // p001o.ksb
    public void setExpanded(boolean z) {
        this.f12711a = z;
        m14776a();
    }

    public void setIcon(Drawable drawable) {
    }

    @Override // p001o.ksb
    public void setOnlyShowWhenExpanded(boolean z) {
        this.f12712b = z;
        m14776a();
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
