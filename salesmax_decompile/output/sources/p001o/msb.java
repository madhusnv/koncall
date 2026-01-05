package p001o;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.C1794g;

/* loaded from: classes3.dex */
public class msb extends C1792e {
    public msb(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C1792e, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1794g c1794g = (C1794g) mo4040a(i, i2, i3, charSequence);
        psb psbVar = new psb(m4061w(), this, c1794g);
        c1794g.m4092x(psbVar);
        return psbVar;
    }
}
