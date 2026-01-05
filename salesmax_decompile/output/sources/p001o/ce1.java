package p001o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes2.dex */
public abstract class ce1 {

    /* renamed from: a */
    public final Context f17978a;

    /* renamed from: b */
    public ktf f17979b;

    /* renamed from: c */
    public ktf f17980c;

    public ce1(Context context) {
        this.f17978a = context;
    }

    /* renamed from: c */
    public final MenuItem m21033c(MenuItem menuItem) {
        if (!(menuItem instanceof aeg)) {
            return menuItem;
        }
        aeg aegVar = (aeg) menuItem;
        if (this.f17979b == null) {
            this.f17979b = new ktf();
        }
        MenuItem menuItem2 = (MenuItem) this.f17979b.get(aegVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        zab zabVar = new zab(this.f17978a, aegVar);
        this.f17979b.put(aegVar, zabVar);
        return zabVar;
    }

    /* renamed from: d */
    public final SubMenu m21034d(SubMenu subMenu) {
        return subMenu;
    }

    /* renamed from: e */
    public final void m21035e() {
        ktf ktfVar = this.f17979b;
        if (ktfVar != null) {
            ktfVar.clear();
        }
        ktf ktfVar2 = this.f17980c;
        if (ktfVar2 != null) {
            ktfVar2.clear();
        }
    }

    /* renamed from: f */
    public final void m21036f(int i) {
        if (this.f17979b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f17979b.size()) {
            if (((aeg) this.f17979b.m36227g(i2)).getGroupId() == i) {
                this.f17979b.mo32670k(i2);
                i2--;
            }
            i2++;
        }
    }

    /* renamed from: g */
    public final void m21037g(int i) {
        if (this.f17979b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f17979b.size(); i2++) {
            if (((aeg) this.f17979b.m36227g(i2)).getItemId() == i) {
                this.f17979b.mo32670k(i2);
                return;
            }
        }
    }
}
