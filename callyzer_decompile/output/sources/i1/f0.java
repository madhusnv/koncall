package i1;

import a2.C0036i;
import a3.C0043b;
import d4.AbstractC1592t;
import d4.AbstractC1594v;
import d4.C1573a;
import d4.C1582j;
import d4.C1583k;
import d4.C1595w;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import hp.C2995b;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import lv.C4535g;
import lx.InterfaceC4574m;
import m1.C4622d;
import m1.C4623e;
import m1.InterfaceC4628j;
import m1.InterfaceC4630l;
import m2.C4640e;
import s3.AbstractC6744a;
import tx.C7263w;
import v3.AbstractC7634f;
import v3.AbstractC7642n;
import v3.InterfaceC7640l;
import v3.InterfaceC7645q;
import v3.a2;
import v3.w1;
import v3.x1;
import w2.AbstractC7878q;
import yx.C8810d;
import zt.C9069h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 extends AbstractC7642n implements w1, InterfaceC7645q, InterfaceC7640l, v3.l1, a2 {

    /* renamed from: B */
    public static final j0 f16855B = new j0(4);

    /* renamed from: s */
    public InterfaceC4630l f16856s;

    /* renamed from: t */
    public final InterfaceC2139c f16857t;

    /* renamed from: v */
    public C4622d f16858v;

    /* renamed from: w */
    public s1.d0 f16859w;

    /* renamed from: x */
    public v3.h1 f16860x;

    /* renamed from: y */
    public final b3.e0 f16861y;

    /* renamed from: z */
    public C0036i f16862z;

    public f0(InterfaceC4630l interfaceC4630l, int i10, C9069h c9069h) {
        this.f16856s = interfaceC4630l;
        this.f16857t = c9069h;
        b3.e0 e0Var = new b3.e0(i10, 4, new e0(2, this, f0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0));
        L0(e0Var);
        this.f16861y = e0Var;
    }

    @Override // w2.AbstractC7878q
    public final void F0() {
        s1.d0 d0Var = this.f16859w;
        if (d0Var != null) {
            d0Var.m12846b();
        }
        this.f16859w = null;
    }

    public final void O0(InterfaceC4630l interfaceC4630l, InterfaceC4628j interfaceC4628j) {
        if (!this.f37683p) {
            interfaceC4630l.mo9502b(interfaceC4628j);
            return;
        }
        tx.e1 e1Var = (tx.e1) ((C8810d) z0()).f42488a.o0(C7263w.f34689b);
        tx.c0.m13502y(z0(), null, null, new C2995b(interfaceC4630l, interfaceC4628j, e1Var != null ? e1Var.v0(new C3135n(2, interfaceC4630l, interfaceC4628j)) : null, null, 4), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final g0 P0() {
        a2 a2Var;
        C4535g c4535g;
        if (this.f37683p) {
            if (!this.f37670a.f37683p) {
                AbstractC6744a.m12907b("visitAncestors called on an unattached node");
            }
            AbstractC7878q abstractC7878q = this.f37670a.f37674e;
            v3.g0 g0VarM14563x = AbstractC7634f.m14563x(this);
            loop0: while (true) {
                if (g0VarM14563x == null) {
                    a2Var = null;
                    break;
                }
                if ((((AbstractC7878q) g0VarM14563x.f36832K.f22542f).f37673d & 262144) != 0) {
                    while (abstractC7878q != null) {
                        if ((abstractC7878q.f37672c & 262144) != 0) {
                            AbstractC7642n abstractC7642nM14545f = abstractC7878q;
                            ?? c4640e = 0;
                            while (abstractC7642nM14545f != 0) {
                                if (abstractC7642nM14545f instanceof a2) {
                                    a2Var = (a2) abstractC7642nM14545f;
                                    if (g0.f16872r.equals(a2Var.mo7492h())) {
                                        break loop0;
                                    }
                                } else if ((abstractC7642nM14545f.f37672c & 262144) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                    AbstractC7878q abstractC7878q2 = abstractC7642nM14545f.f36953r;
                                    int i10 = 0;
                                    abstractC7642nM14545f = abstractC7642nM14545f;
                                    c4640e = c4640e;
                                    while (abstractC7878q2 != null) {
                                        if ((abstractC7878q2.f37672c & 262144) != 0) {
                                            i10++;
                                            c4640e = c4640e;
                                            if (i10 == 1) {
                                                abstractC7642nM14545f = abstractC7878q2;
                                            } else {
                                                if (c4640e == 0) {
                                                    c4640e = new C4640e(new AbstractC7878q[16]);
                                                }
                                                if (abstractC7642nM14545f != 0) {
                                                    c4640e.m9506b(abstractC7642nM14545f);
                                                    abstractC7642nM14545f = 0;
                                                }
                                                c4640e.m9506b(abstractC7878q2);
                                            }
                                        }
                                        abstractC7878q2 = abstractC7878q2.f37675f;
                                        abstractC7642nM14545f = abstractC7642nM14545f;
                                        c4640e = c4640e;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC7642nM14545f = AbstractC7634f.m14545f(c4640e);
                            }
                        }
                        abstractC7878q = abstractC7878q.f37674e;
                    }
                }
                g0VarM14563x = g0VarM14563x.m14609v();
                abstractC7878q = (g0VarM14563x == null || (c4535g = g0VarM14563x.f36832K) == null) ? null : (x1) c4535g.f22541e;
            }
            if (a2Var instanceof g0) {
                return (g0) a2Var;
            }
        }
        return null;
    }

    public final void Q0(InterfaceC4630l interfaceC4630l) {
        C4622d c4622d;
        if (AbstractC4154l.m8918a(this.f16856s, interfaceC4630l)) {
            return;
        }
        InterfaceC4630l interfaceC4630l2 = this.f16856s;
        if (interfaceC4630l2 != null && (c4622d = this.f16858v) != null) {
            interfaceC4630l2.mo9502b(new C4623e(c4622d));
        }
        this.f16858v = null;
        this.f16856s = interfaceC4630l;
    }

    @Override // v3.InterfaceC7645q
    /* renamed from: W */
    public final void mo7495W(v3.h1 h1Var) {
        g0 g0VarP0;
        this.f16860x = h1Var;
        if (this.f16861y.N0().isFocused()) {
            if (!h1Var.T0().f37683p) {
                g0 g0VarP02 = P0();
                if (g0VarP02 != null) {
                    g0VarP02.L0(null);
                    return;
                }
                return;
            }
            v3.h1 h1Var2 = this.f16860x;
            if (h1Var2 == null || !h1Var2.T0().f37683p || (g0VarP0 = P0()) == null) {
                return;
            }
            g0VarP0.L0(this.f16860x);
        }
    }

    @Override // v3.l1
    public final void c0() {
        C4168z c4168z = new C4168z();
        AbstractC7634f.m14559t(this, new C0043b(12, c4168z, this));
        s1.d0 d0Var = (s1.d0) c4168z.f21164a;
        if (this.f16861y.N0().isFocused()) {
            s1.d0 d0Var2 = this.f16859w;
            if (d0Var2 != null) {
                d0Var2.m12846b();
            }
            if (d0Var != null) {
                d0Var.m12845a();
            } else {
                d0Var = null;
            }
            this.f16859w = d0Var;
        }
    }

    @Override // v3.a2
    /* renamed from: h */
    public final Object mo7492h() {
        return f16855B;
    }

    @Override // v3.w1
    public final void t0(InterfaceC1596x interfaceC1596x) {
        boolean zIsFocused = this.f16861y.N0().isFocused();
        InterfaceC4574m[] interfaceC4574mArr = AbstractC1594v.f7944a;
        C1595w c1595w = AbstractC1592t.f7927k;
        InterfaceC4574m interfaceC4574m = AbstractC1594v.f7944a[4];
        c1595w.m5236a(interfaceC1596x, Boolean.valueOf(zIsFocused));
        if (this.f16862z == null) {
            this.f16862z = new C0036i(17, this);
        }
        C1583k c1583k = (C1583k) interfaceC1596x;
        c1583k.m5202q(C1582j.f7863v, new C1573a(null, this.f16862z));
    }
}
