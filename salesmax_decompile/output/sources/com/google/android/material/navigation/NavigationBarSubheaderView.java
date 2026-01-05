package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C1794g;
import p001o.gjh;
import p001o.ksb;
import p001o.n8e;
import p001o.n9e;

/* loaded from: classes3.dex */
public class NavigationBarSubheaderView extends FrameLayout implements ksb {

    /* renamed from: a */
    public final TextView f12756a;

    /* renamed from: b */
    public boolean f12757b;

    /* renamed from: c */
    public boolean f12758c;

    /* renamed from: d */
    public C1794g f12759d;

    /* renamed from: e */
    public ColorStateList f12760e;

    public NavigationBarSubheaderView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(n9e.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.f12756a = (TextView) findViewById(n8e.navigation_menu_subheader_label);
    }

    /* renamed from: a */
    public final void m14837a() {
        C1794g c1794g = this.f12759d;
        if (c1794g != null) {
            setVisibility((!c1794g.isVisible() || (!this.f12757b && this.f12758c)) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    /* renamed from: c */
    public void mo3948c(C1794g c1794g, int i) {
        this.f12759d = c1794g;
        c1794g.setCheckable(false);
        this.f12756a.setText(c1794g.getTitle());
        m14837a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    /* renamed from: e */
    public boolean mo3949e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    public C1794g getItemData() {
        return this.f12759d;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    @Override // p001o.ksb
    public void setExpanded(boolean z) {
        this.f12757b = z;
        m14837a();
    }

    public void setIcon(Drawable drawable) {
    }

    @Override // p001o.ksb
    public void setOnlyShowWhenExpanded(boolean z) {
        this.f12758c = z;
        m14837a();
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        gjh.m28914m(this.f12756a, i);
        ColorStateList colorStateList = this.f12760e;
        if (colorStateList != null) {
            this.f12756a.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f12760e = colorStateList;
        if (colorStateList != null) {
            this.f12756a.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
    }
}
