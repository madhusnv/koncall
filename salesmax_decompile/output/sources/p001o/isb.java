package p001o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.C1794g;

/* loaded from: classes3.dex */
public final class isb extends C1792e {

    /* renamed from: B */
    public final Class f29194B;

    /* renamed from: C */
    public final int f29195C;

    /* renamed from: D */
    public final boolean f29196D;

    public isb(Context context, Class cls, int i, boolean z) {
        super(context);
        this.f29194B = cls;
        this.f29195C = i;
        this.f29196D = z;
    }

    @Override // androidx.appcompat.view.menu.C1792e
    /* renamed from: a */
    public MenuItem mo4040a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.f29195C) {
            i0();
            MenuItem menuItemMo4040a = super.mo4040a(i, i2, i3, charSequence);
            h0();
            return menuItemMo4040a;
        }
        String simpleName = this.f29194B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f29195C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.C1792e, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        if (this.f29196D) {
            C1794g c1794g = (C1794g) mo4040a(i, i2, i3, charSequence);
            lsb lsbVar = new lsb(m4061w(), this, c1794g);
            c1794g.m4092x(lsbVar);
            return lsbVar;
        }
        throw new UnsupportedOperationException(this.f29194B.getSimpleName() + " does not support submenus");
    }
}
