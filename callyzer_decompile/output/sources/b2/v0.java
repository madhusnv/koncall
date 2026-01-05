package b2;

import c3.C0847b;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;
import x1.r1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 implements x1.d1 {

    /* renamed from: a */
    public final /* synthetic */ y0 f3845a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3846b;

    public v0(y0 y0Var, boolean z6) {
        this.f3845a = y0Var;
        this.f3846b = z6;
    }

    @Override // x1.d1
    /* renamed from: b */
    public final void mo1685b() {
        y0 y0Var = this.f3845a;
        y0Var.f3883r.setValue(null);
        y0Var.f3884s.setValue(null);
        y0Var.m1707q(true);
    }

    @Override // x1.d1
    /* renamed from: c */
    public final void mo1686c() {
        y0 y0Var = this.f3845a;
        y0Var.f3883r.setValue(null);
        y0Var.f3884s.setValue(null);
        y0Var.m1707q(true);
    }

    @Override // x1.d1
    /* renamed from: d */
    public final void mo1687d() {
        r1 r1VarM15480d;
        boolean z6 = this.f3846b;
        x1.j0 j0Var = z6 ? x1.j0.SelectionStart : x1.j0.SelectionEnd;
        y0 y0Var = this.f3845a;
        y0Var.f3883r.setValue(j0Var);
        long jM1629a = g0.m1629a(y0Var.m1700j(z6));
        x1.v0 v0Var = y0Var.f3869d;
        if (v0Var == null || (r1VarM15480d = v0Var.m15480d()) == null) {
            return;
        }
        long jM15469e = r1VarM15480d.m15469e(jM1629a);
        y0Var.f3880o = jM15469e;
        y0Var.f3884s.setValue(new C0847b(jM15469e));
        y0Var.f3882q = 0L;
        y0Var.f3885t = -1;
        x1.v0 v0Var2 = y0Var.f3869d;
        if (v0Var2 != null) {
            v0Var2.f39719q.setValue(Boolean.TRUE);
        }
        y0Var.m1707q(false);
    }

    @Override // x1.d1
    /* renamed from: e */
    public final void mo1688e(long j6) {
        y0 y0Var = this.f3845a;
        long jM2276g = C0847b.m2276g(y0Var.f3882q, j6);
        y0Var.f3882q = jM2276g;
        y0Var.f3884s.setValue(new C0847b(C0847b.m2276g(y0Var.f3880o, jM2276g)));
        C4381z c4381zM1701k = y0Var.m1701k();
        C0847b c0847bM1697g = y0Var.m1697g();
        AbstractC4154l.m8920c(c0847bM1697g);
        y0.m1691a(y0Var, c4381zM1701k, c0847bM1697g.f5352a, false, this.f3846b, C0561s.f3823g, true);
        y0Var.m1707q(false);
    }

    @Override // x1.d1
    public final void onCancel() {
    }

    @Override // x1.d1
    /* renamed from: a */
    public final void mo1684a(long j6) {
    }
}
