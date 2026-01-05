package p001o;

import p001o.nf8;

/* loaded from: classes2.dex */
public final class fea implements x61 {

    /* renamed from: a */
    public final nf8 f23192a;

    /* renamed from: b */
    public final int f23193b;

    public fea(int i, nf8 nf8Var) {
        this.f23193b = i;
        this.f23192a = nf8Var;
    }

    /* renamed from: a */
    public static x61 m26513a(int i, int i2, zwc zwcVar) {
        switch (i) {
            case 1718776947:
                return v6g.m52361d(i2, zwcVar);
            case 1751742049:
                return z61.m58834b(zwcVar);
            case 1752331379:
                return a71.m16532c(zwcVar);
            case 1852994675:
                return y6g.m57318a(zwcVar);
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static fea m26514c(int i, zwc zwcVar) {
        nf8.C15566a c15566a = new nf8.C15566a();
        int iM60026g = zwcVar.m60026g();
        int iM16534b = -2;
        while (zwcVar.m60020a() > 8) {
            int iM60040u = zwcVar.m60040u();
            int iM60025f = zwcVar.m60025f() + zwcVar.m60040u();
            zwcVar.m60016T(iM60025f);
            x61 x61VarM26514c = iM60040u == 1414744396 ? m26514c(zwcVar.m60040u(), zwcVar) : m26513a(iM60040u, iM16534b, zwcVar);
            if (x61VarM26514c != null) {
                if (x61VarM26514c.getType() == 1752331379) {
                    iM16534b = ((a71) x61VarM26514c).m16534b();
                }
                c15566a.mo32056a(x61VarM26514c);
            }
            zwcVar.m60017U(iM60025f);
            zwcVar.m60016T(iM60026g);
        }
        return new fea(i, c15566a.m40520k());
    }

    /* renamed from: b */
    public x61 m26515b(Class cls) {
        q4i it = this.f23192a.iterator();
        while (it.hasNext()) {
            x61 x61Var = (x61) it.next();
            if (x61Var.getClass() == cls) {
                return x61Var;
            }
        }
        return null;
    }

    @Override // p001o.x61
    public int getType() {
        return this.f23193b;
    }
}
