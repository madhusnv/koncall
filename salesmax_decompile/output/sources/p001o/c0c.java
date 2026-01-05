package p001o;

import java.util.Map;

/* loaded from: classes2.dex */
public class c0c {

    /* renamed from: a */
    public final fqb f17063a = new fqb(new wzb[16], 0);

    /* renamed from: a */
    public boolean mo20007a(Map map, mh9 mh9Var, vp8 vp8Var, boolean z) {
        sq8.m48649h(map, "changes");
        sq8.m48649h(mh9Var, "parentCoordinates");
        sq8.m48649h(vp8Var, "internalPointerEvent");
        fqb fqbVar = this.f17063a;
        int iM27354o = fqbVar.m27354o();
        if (iM27354o <= 0) {
            return false;
        }
        Object[] objArrM27353n = fqbVar.m27353n();
        int i = 0;
        boolean z2 = false;
        do {
            z2 = ((wzb) objArrM27353n[i]).mo20007a(map, mh9Var, vp8Var, z) || z2;
            i++;
        } while (i < iM27354o);
        return z2;
    }

    /* renamed from: b */
    public void mo20008b(vp8 vp8Var) {
        sq8.m48649h(vp8Var, "internalPointerEvent");
        int iM27354o = this.f17063a.m27354o();
        while (true) {
            iM27354o--;
            if (-1 >= iM27354o) {
                return;
            }
            if (((wzb) this.f17063a.m27353n()[iM27354o]).m55464k().m27356q()) {
                this.f17063a.m27361v(iM27354o);
            }
        }
    }

    /* renamed from: c */
    public final void m20009c() {
        this.f17063a.m27349i();
    }

    /* renamed from: d */
    public void mo20010d() {
        fqb fqbVar = this.f17063a;
        int iM27354o = fqbVar.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVar.m27353n();
            int i = 0;
            do {
                ((wzb) objArrM27353n[i]).mo20010d();
                i++;
            } while (i < iM27354o);
        }
    }

    /* renamed from: e */
    public boolean mo20011e(vp8 vp8Var) {
        sq8.m48649h(vp8Var, "internalPointerEvent");
        fqb fqbVar = this.f17063a;
        int iM27354o = fqbVar.m27354o();
        boolean z = false;
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVar.m27353n();
            int i = 0;
            boolean z2 = false;
            do {
                z2 = ((wzb) objArrM27353n[i]).mo20011e(vp8Var) || z2;
                i++;
            } while (i < iM27354o);
            z = z2;
        }
        mo20008b(vp8Var);
        return z;
    }

    /* renamed from: f */
    public boolean mo20012f(Map map, mh9 mh9Var, vp8 vp8Var, boolean z) {
        sq8.m48649h(map, "changes");
        sq8.m48649h(mh9Var, "parentCoordinates");
        sq8.m48649h(vp8Var, "internalPointerEvent");
        fqb fqbVar = this.f17063a;
        int iM27354o = fqbVar.m27354o();
        if (iM27354o <= 0) {
            return false;
        }
        Object[] objArrM27353n = fqbVar.m27353n();
        int i = 0;
        boolean z2 = false;
        do {
            z2 = ((wzb) objArrM27353n[i]).mo20012f(map, mh9Var, vp8Var, z) || z2;
            i++;
        } while (i < iM27354o);
        return z2;
    }

    /* renamed from: g */
    public final fqb m20013g() {
        return this.f17063a;
    }

    /* renamed from: h */
    public final void m20014h() {
        int i = 0;
        while (i < this.f17063a.m27354o()) {
            wzb wzbVar = (wzb) this.f17063a.m27353n()[i];
            if (wzbVar.m55463j().m17361J()) {
                i++;
                wzbVar.m20014h();
            } else {
                this.f17063a.m27361v(i);
                wzbVar.mo20010d();
            }
        }
    }
}
