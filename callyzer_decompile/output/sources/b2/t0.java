package b2;

import c3.C0847b;
import l3.InterfaceC4354a;
import l4.C4381z;
import nc.AbstractC4992c;
import og.yf;
import x1.r1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 implements x1.d1 {

    /* renamed from: a */
    public final /* synthetic */ int f3834a;

    /* renamed from: b */
    public final /* synthetic */ y0 f3835b;

    public /* synthetic */ t0(y0 y0Var, int i10) {
        this.f3834a = i10;
        this.f3835b = y0Var;
    }

    @Override // x1.d1
    /* renamed from: a */
    public final void mo1684a(long j6) {
        r1 r1VarM15480d;
        y0 y0Var;
        long j10;
        r1 r1VarM15480d2;
        r1 r1VarM15480d3;
        switch (this.f3834a) {
            case 0:
                y0 y0Var2 = this.f3835b;
                long jM1629a = g0.m1629a(y0Var2.m1700j(true));
                x1.v0 v0Var = y0Var2.f3869d;
                if (v0Var != null && (r1VarM15480d = v0Var.m15480d()) != null) {
                    long jM15469e = r1VarM15480d.m15469e(jM1629a);
                    y0Var2.f3880o = jM15469e;
                    y0Var2.f3884s.setValue(new C0847b(jM15469e));
                    y0Var2.f3882q = 0L;
                    y0Var2.f3883r.setValue(x1.j0.Cursor);
                    y0Var2.m1707q(false);
                    break;
                }
                break;
            default:
                y0 y0Var3 = this.f3835b;
                k2.e1 e1Var = y0Var3.f3883r;
                if (y0Var3.m1699i() && ((x1.j0) e1Var.getValue()) == null) {
                    e1Var.setValue(x1.j0.SelectionEnd);
                    y0Var3.f3885t = -1;
                    y0Var3.m1702l();
                    x1.v0 v0Var2 = y0Var3.f3869d;
                    if (v0Var2 == null || (r1VarM15480d3 = v0Var2.m15480d()) == null || !r1VarM15480d3.m15467c(j6)) {
                        y0Var = y0Var3;
                        j10 = j6;
                        x1.v0 v0Var3 = y0Var.f3869d;
                        if (v0Var3 != null && (r1VarM15480d2 = v0Var3.m15480d()) != null) {
                            int iMo2753w = y0Var.f3867b.mo2753w(r1VarM15480d2.m15466b(true, j10));
                            C4381z c4381zM1692c = y0.m1692c(y0Var.m1701k().f21945a, yf.m11072a(iMo2753w, iMo2753w));
                            y0Var.m1696f(false);
                            InterfaceC4354a interfaceC4354a = y0Var.f3876k;
                            if (interfaceC4354a != null) {
                                interfaceC4354a.mo9067a(9);
                            }
                            y0Var.f3868c.invoke(c4381zM1692c);
                        }
                    } else if (y0Var3.m1701k().f21945a.f13620b.length() != 0) {
                        y0Var3.m1696f(false);
                        y0Var = y0Var3;
                        j10 = j6;
                        y0Var.f3881p = Integer.valueOf((int) (y0.m1691a(y0Var3, C4381z.m9153a(y0Var3.m1701k(), null, g4.n0.f13684b, 5), j6, true, false, C0561s.f3821e, true) >> 32));
                    }
                    y0Var.m1705o(x1.k0.None);
                    y0Var.f3880o = j10;
                    y0Var.f3884s.setValue(new C0847b(j10));
                    y0Var.f3882q = 0L;
                    break;
                }
                break;
        }
    }

    @Override // x1.d1
    /* renamed from: b */
    public final void mo1685b() {
        switch (this.f3834a) {
            case 0:
                y0 y0Var = this.f3835b;
                y0Var.f3883r.setValue(null);
                y0Var.f3884s.setValue(null);
                break;
            default:
                m1689i();
                break;
        }
    }

    @Override // x1.d1
    /* renamed from: c */
    public final void mo1686c() {
        switch (this.f3834a) {
            case 0:
                y0 y0Var = this.f3835b;
                y0Var.f3883r.setValue(null);
                y0Var.f3884s.setValue(null);
                break;
        }
    }

    @Override // x1.d1
    /* renamed from: d */
    public final void mo1687d() {
        int i10 = this.f3834a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    @Override // x1.d1
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1688e(long r21) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.t0.mo1688e(long):void");
    }

    /* renamed from: i */
    public void m1689i() {
        y0 y0Var = this.f3835b;
        y0Var.f3883r.setValue(null);
        y0Var.f3884s.setValue(null);
        y0Var.m1707q(true);
        y0Var.f3881p = null;
        boolean zM6455b = g4.n0.m6455b(y0Var.m1701k().f21946b);
        y0Var.m1705o(zM6455b ? x1.k0.Cursor : x1.k0.Selection);
        x1.v0 v0Var = y0Var.f3869d;
        if (v0Var != null) {
            v0Var.f39715m.setValue(Boolean.valueOf(!zM6455b && AbstractC4992c.m9903d(y0Var, true)));
        }
        x1.v0 v0Var2 = y0Var.f3869d;
        if (v0Var2 != null) {
            v0Var2.f39716n.setValue(Boolean.valueOf(!zM6455b && AbstractC4992c.m9903d(y0Var, false)));
        }
        x1.v0 v0Var3 = y0Var.f3869d;
        if (v0Var3 == null) {
            return;
        }
        v0Var3.f39717o.setValue(Boolean.valueOf(zM6455b && AbstractC4992c.m9903d(y0Var, true)));
    }

    @Override // x1.d1
    public final void onCancel() {
        switch (this.f3834a) {
            case 0:
                break;
            default:
                m1689i();
                break;
        }
    }

    /* renamed from: f */
    private final void m1680f() {
    }

    /* renamed from: g */
    private final void m1681g() {
    }

    /* renamed from: h */
    private final void m1682h() {
    }

    /* renamed from: j */
    private final void m1683j() {
    }
}
