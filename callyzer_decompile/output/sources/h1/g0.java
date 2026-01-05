package h1;

import ao.C0381t;
import cp.C1475f;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import m2.C4640e;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a */
    public final C4640e f15419a = new C4640e(new e0[16]);

    /* renamed from: b */
    public final k2.e1 f15420b = C3953b.m8517t(Boolean.FALSE);

    /* renamed from: c */
    public long f15421c = Long.MIN_VALUE;

    /* renamed from: d */
    public final k2.e1 f15422d = C3953b.m8517t(Boolean.TRUE);

    /* renamed from: a */
    public final void m6811a(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-318043801);
        int i11 = (c3966o.m8616i(this) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            Object objM8596M = c3966o.m8596M();
            InterfaceC7559c interfaceC7559c = null;
            k2.s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = C3953b.m8517t(null);
                c3966o.j0(objM8596M);
            }
            k2.w0 w0Var = (k2.w0) objM8596M;
            if (((Boolean) this.f15422d.getValue()).booleanValue() || ((Boolean) this.f15420b.getValue()).booleanValue()) {
                c3966o.m8607Y(1719883733);
                boolean zM8616i = c3966o.m8616i(this);
                Object objM8596M2 = c3966o.m8596M();
                if (zM8616i || objM8596M2 == s0Var) {
                    objM8596M2 = new C0381t(w0Var, this, interfaceC7559c, 15);
                    c3966o.j0(objM8596M2);
                }
                C3953b.m8503f((InterfaceC2141e) objM8596M2, this, c3966o);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(1721270456);
                c3966o.m8623p(false);
            }
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1475f(this, i10, 8);
        }
    }
}
