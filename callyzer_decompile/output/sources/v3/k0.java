package v3;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a */
    public final g0 f36928a;

    /* renamed from: b */
    public boolean f36929b;

    /* renamed from: c */
    public boolean f36930c;

    /* renamed from: e */
    public boolean f36932e;

    /* renamed from: f */
    public boolean f36933f;

    /* renamed from: g */
    public boolean f36934g;

    /* renamed from: h */
    public int f36935h;

    /* renamed from: i */
    public int f36936i;

    /* renamed from: j */
    public boolean f36937j;

    /* renamed from: k */
    public boolean f36938k;

    /* renamed from: l */
    public int f36939l;

    /* renamed from: m */
    public boolean f36940m;

    /* renamed from: n */
    public boolean f36941n;

    /* renamed from: o */
    public int f36942o;

    /* renamed from: q */
    public s0 f36944q;

    /* renamed from: d */
    public c0 f36931d = c0.Idle;

    /* renamed from: p */
    public final y0 f36943p = new y0(this);

    public k0(g0 g0Var) {
        this.f36928a = g0Var;
    }

    /* renamed from: a */
    public final h1 m14637a() {
        return (h1) this.f36928a.f36832K.f22540d;
    }

    /* renamed from: b */
    public final void m14638b(int i10) {
        int i11 = this.f36939l;
        this.f36939l = i10;
        if ((i11 == 0) != (i10 == 0)) {
            g0 g0VarM14609v = this.f36928a.m14609v();
            k0 k0Var = g0VarM14609v != null ? g0VarM14609v.f36833L : null;
            if (k0Var != null) {
                if (i10 == 0) {
                    k0Var.m14638b(k0Var.f36939l - 1);
                } else {
                    k0Var.m14638b(k0Var.f36939l + 1);
                }
            }
        }
    }

    /* renamed from: c */
    public final void m14639c(int i10) {
        int i11 = this.f36942o;
        this.f36942o = i10;
        if ((i11 == 0) != (i10 == 0)) {
            g0 g0VarM14609v = this.f36928a.m14609v();
            k0 k0Var = g0VarM14609v != null ? g0VarM14609v.f36833L : null;
            if (k0Var != null) {
                if (i10 == 0) {
                    k0Var.m14639c(k0Var.f36942o - 1);
                } else {
                    k0Var.m14639c(k0Var.f36942o + 1);
                }
            }
        }
    }

    /* renamed from: d */
    public final void m14640d(boolean z6) {
        if (this.f36938k != z6) {
            this.f36938k = z6;
            if (z6 && !this.f36937j) {
                m14638b(this.f36939l + 1);
            } else {
                if (z6 || this.f36937j) {
                    return;
                }
                m14638b(this.f36939l - 1);
            }
        }
    }

    /* renamed from: e */
    public final void m14641e(boolean z6) {
        if (this.f36937j != z6) {
            this.f36937j = z6;
            if (z6 && !this.f36938k) {
                m14638b(this.f36939l + 1);
            } else {
                if (z6 || this.f36938k) {
                    return;
                }
                m14638b(this.f36939l - 1);
            }
        }
    }

    /* renamed from: f */
    public final void m14642f(boolean z6) {
        if (this.f36941n != z6) {
            this.f36941n = z6;
            if (z6 && !this.f36940m) {
                m14639c(this.f36942o + 1);
            } else {
                if (z6 || this.f36940m) {
                    return;
                }
                m14639c(this.f36942o - 1);
            }
        }
    }

    /* renamed from: g */
    public final void m14643g(boolean z6) {
        if (this.f36940m != z6) {
            this.f36940m = z6;
            if (z6 && !this.f36941n) {
                m14639c(this.f36942o + 1);
            } else {
                if (z6 || this.f36941n) {
                    return;
                }
                m14639c(this.f36942o - 1);
            }
        }
    }

    /* renamed from: h */
    public final void m14644h() {
        y0 y0Var = this.f36943p;
        k0 k0Var = y0Var.f37057f;
        Object obj = y0Var.f37069t;
        g0 g0Var = this.f36928a;
        if ((obj != null || k0Var.m14637a().mo13310C() != null) && y0Var.f37068s) {
            y0Var.f37068s = false;
            y0Var.f37069t = k0Var.m14637a().mo13310C();
            g0 g0VarM14609v = g0Var.m14609v();
            if (g0VarM14609v != null) {
                g0.m14568W(g0VarM14609v, false, 7);
            }
        }
        s0 s0Var = this.f36944q;
        if (s0Var != null) {
            k0 k0Var2 = s0Var.f36992f;
            if (s0Var.f37009z == null) {
                o0 o0VarR0 = k0Var2.m14637a().R0();
                AbstractC4154l.m8920c(o0VarR0);
                if (o0VarR0.f36966m.mo13310C() == null) {
                    return;
                }
            }
            if (s0Var.f37008y) {
                s0Var.f37008y = false;
                o0 o0VarR02 = k0Var2.m14637a().R0();
                AbstractC4154l.m8920c(o0VarR02);
                s0Var.f37009z = o0VarR02.f36966m.mo13310C();
                if (AbstractC7634f.m14558s(g0Var)) {
                    g0 g0VarM14609v2 = g0Var.m14609v();
                    if (g0VarM14609v2 != null) {
                        g0.m14568W(g0VarM14609v2, false, 7);
                        return;
                    }
                    return;
                }
                g0 g0VarM14609v3 = g0Var.m14609v();
                if (g0VarM14609v3 != null) {
                    g0.m14567U(g0VarM14609v3, false, 7);
                }
            }
        }
    }
}
