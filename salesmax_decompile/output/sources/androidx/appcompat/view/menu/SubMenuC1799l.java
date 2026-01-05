package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C1792e;

/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes2.dex */
public class SubMenuC1799l extends C1792e implements SubMenu {

    /* renamed from: B */
    public C1792e f5690B;

    /* renamed from: C */
    public C1794g f5691C;

    public SubMenuC1799l(Context context, C1792e c1792e, C1794g c1794g) {
        super(context);
        this.f5690B = c1792e;
        this.f5691C = c1794g;
    }

    @Override // androidx.appcompat.view.menu.C1792e
    /* renamed from: F */
    public C1792e mo4019F() {
        return this.f5690B.mo4019F();
    }

    @Override // androidx.appcompat.view.menu.C1792e
    /* renamed from: I */
    public boolean mo4022I() {
        return this.f5690B.mo4022I();
    }

    @Override // androidx.appcompat.view.menu.C1792e
    /* renamed from: J */
    public boolean mo4023J() {
        return this.f5690B.mo4023J();
    }

    @Override // androidx.appcompat.view.menu.C1792e
    /* renamed from: K */
    public boolean mo4024K() {
        return this.f5690B.mo4024K();
    }

    @Override // androidx.appcompat.view.menu.C1792e
    /* renamed from: W */
    public void mo4036W(C1792e.a aVar) {
        this.f5690B.mo4036W(aVar);
    }

    @Override // androidx.appcompat.view.menu.C1792e
    /* renamed from: f */
    public boolean mo4045f(C1794g c1794g) {
        return this.f5690B.mo4045f(c1794g);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f5691C;
    }

    @Override // androidx.appcompat.view.menu.C1792e
    /* renamed from: h */
    public boolean mo4047h(C1792e c1792e, MenuItem menuItem) {
        return super.mo4047h(c1792e, menuItem) || this.f5690B.mo4047h(c1792e, menuItem);
    }

    public Menu j0() {
        return this.f5690B;
    }

    @Override // androidx.appcompat.view.menu.C1792e
    /* renamed from: m */
    public boolean mo4052m(C1794g c1794g) {
        return this.f5690B.mo4052m(c1794g);
    }

    @Override // androidx.appcompat.view.menu.C1792e, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f5690B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a0(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.d0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.e0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f5691C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C1792e, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f5690B.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.C1792e
    /* renamed from: v */
    public String mo4060v() {
        C1794g c1794g = this.f5691C;
        int itemId = c1794g != null ? c1794g.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo4060v() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m4039Z(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.c0(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f5691C.setIcon(i);
        return this;
    }
}
