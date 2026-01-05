package p012n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n.s */
/* loaded from: classes.dex */
public final class SubMenuC4939s extends MenuC4929i implements SubMenu {

    /* renamed from: v */
    public final MenuC4929i f24613v;

    /* renamed from: w */
    public final MenuItemC4930j f24614w;

    public SubMenuC4939s(Context context, MenuC4929i menuC4929i, MenuItemC4930j menuItemC4930j) {
        super(context);
        this.f24613v = menuC4929i;
        this.f24614w = menuItemC4930j;
    }

    @Override // p012n.MenuC4929i
    /* renamed from: d */
    public final boolean mo9855d(MenuItemC4930j menuItemC4930j) {
        return this.f24613v.mo9855d(menuItemC4930j);
    }

    @Override // p012n.MenuC4929i
    /* renamed from: e */
    public final boolean mo9856e(MenuC4929i menuC4929i, MenuItem menuItem) {
        return super.mo9856e(menuC4929i, menuItem) || this.f24613v.mo9856e(menuC4929i, menuItem);
    }

    @Override // p012n.MenuC4929i
    /* renamed from: f */
    public final boolean mo9857f(MenuItemC4930j menuItemC4930j) {
        return this.f24613v.mo9857f(menuItemC4930j);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f24614w;
    }

    @Override // p012n.MenuC4929i
    /* renamed from: j */
    public final MenuC4929i mo9861j() {
        return this.f24613v.mo9861j();
    }

    @Override // p012n.MenuC4929i
    /* renamed from: l */
    public final boolean mo9863l() {
        return this.f24613v.mo9863l();
    }

    @Override // p012n.MenuC4929i
    /* renamed from: m */
    public final boolean mo9864m() {
        return this.f24613v.mo9864m();
    }

    @Override // p012n.MenuC4929i
    /* renamed from: n */
    public final boolean mo9865n() {
        return this.f24613v.mo9865n();
    }

    @Override // p012n.MenuC4929i, android.view.Menu
    public final void setGroupDividerEnabled(boolean z6) {
        this.f24613v.setGroupDividerEnabled(z6);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m9868q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m9868q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m9868q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f24614w.setIcon(drawable);
        return this;
    }

    @Override // p012n.MenuC4929i, android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f24613v.setQwertyMode(z6);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        m9868q(0, null, i10, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        m9868q(i10, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f24614w.setIcon(i10);
        return this;
    }
}
