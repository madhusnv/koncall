package k2;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a */
    public int f20440a;

    /* renamed from: b */
    public C3972u f20441b;

    /* renamed from: c */
    public C3952a f20442c;

    /* renamed from: d */
    public InterfaceC2141e f20443d;

    /* renamed from: e */
    public int f20444e;

    /* renamed from: f */
    public e1.d0 f20445f;

    /* renamed from: g */
    public e1.j0 f20446g;

    public n1(C3972u c3972u) {
        this.f20441b = c3972u;
    }

    /* renamed from: a */
    public static boolean m8576a(c0 c0Var, e1.j0 j0Var) {
        AbstractC4154l.m8921d(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        d2 d2Var = c0Var.f20358c;
        if (d2Var == null) {
            d2Var = s0.f20547f;
        }
        return !d2Var.mo8534a(c0Var.m8530g().f20353f, j0Var.m5574g(c0Var));
    }

    /* renamed from: b */
    public final boolean m8577b() {
        if (this.f20441b != null) {
            C3952a c3952a = this.f20442c;
            if (c3952a != null ? c3952a.m8486a() : false) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final n0 m8578c(Object obj) {
        n0 n0VarM8673p;
        C3972u c3972u = this.f20441b;
        return (c3972u == null || (n0VarM8673p = c3972u.m8673p(this, obj)) == null) ? n0.IGNORED : n0VarM8673p;
    }

    /* renamed from: d */
    public final void m8579d() {
        C3972u c3972u = this.f20441b;
        if (c3972u != null) {
            c3972u.f20571q = true;
        }
        this.f20441b = null;
        this.f20445f = null;
        this.f20446g = null;
    }

    /* renamed from: e */
    public final void m8580e(boolean z6) {
        if (z6) {
            this.f20440a |= 32;
        } else {
            this.f20440a &= -33;
        }
    }

    /* renamed from: f */
    public final void m8581f(InterfaceC2141e interfaceC2141e) {
        this.f20443d = interfaceC2141e;
    }
}
