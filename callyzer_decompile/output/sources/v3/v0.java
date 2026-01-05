package v3;

import c9.C0908c;
import c9.C0927v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import lv.C4535g;
import m2.C4640e;
import s3.AbstractC6744a;
import s4.C6745a;
import uf.C7427b;
import w2.AbstractC7878q;
import w3.C7902t;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a */
    public final g0 f37028a;

    /* renamed from: c */
    public boolean f37030c;

    /* renamed from: d */
    public boolean f37031d;

    /* renamed from: i */
    public C6745a f37036i;

    /* renamed from: b */
    public final C0908c f37029b = new C0908c(18);

    /* renamed from: e */
    public final C0927v f37032e = new C0927v(18);

    /* renamed from: f */
    public final C4640e f37033f = new C4640e(new g0[16]);

    /* renamed from: g */
    public final long f37034g = 1;

    /* renamed from: h */
    public final C4640e f37035h = new C4640e(new t0[16]);

    public v0(g0 g0Var) {
        this.f37028a = g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m14660b(v3.g0 r5, s4.C6745a r6) {
        /*
            v3.g0 r0 = r5.f36849h
            v3.k0 r1 = r5.f36833L
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            v3.s0 r0 = r1.f36944q
            kotlin.jvm.internal.AbstractC4154l.m8920c(r0)
            long r3 = r6.f32195a
            boolean r6 = r0.C0(r3)
            goto L2f
        L18:
            r6 = r2
            goto L2f
        L1a:
            v3.s0 r6 = r1.f36944q
            if (r6 == 0) goto L21
            s4.a r1 = r6.f37000p
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            kotlin.jvm.internal.AbstractC4154l.m8920c(r6)
            long r0 = r1.f32195a
            boolean r6 = r6.C0(r0)
        L2f:
            v3.g0 r0 = r5.m14609v()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            v3.g0 r1 = r0.f36849h
            r3 = 3
            if (r1 != 0) goto L40
            v3.g0.m14568W(r0, r2, r3)
            return r6
        L40:
            v3.e0 r1 = r5.m14607t()
            v3.e0 r4 = v3.e0.InMeasureBlock
            if (r1 != r4) goto L4c
            v3.g0.m14567U(r0, r2, r3)
            return r6
        L4c:
            v3.e0 r5 = r5.m14607t()
            v3.e0 r1 = v3.e0.InLayoutBlock
            if (r5 != r1) goto L57
            r0.m14589T(r2)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.v0.m14660b(v3.g0, s4.a):boolean");
    }

    /* renamed from: c */
    public static boolean m14661c(g0 g0Var, C6745a c6745a) {
        boolean zM14585O = c6745a != null ? g0Var.m14585O(c6745a) : g0.m14566P(g0Var);
        g0 g0VarM14609v = g0Var.m14609v();
        if (zM14585O && g0VarM14609v != null) {
            e0 e0Var = g0Var.f36833L.f36943p.f37063m;
            if (e0Var == e0.InMeasureBlock) {
                g0.m14568W(g0VarM14609v, false, 3);
                return zM14585O;
            }
            if (e0Var == e0.InLayoutBlock) {
                g0VarM14609v.m14590V(false);
            }
        }
        return zM14585O;
    }

    /* renamed from: h */
    public static boolean m14662h(g0 g0Var) {
        if (!g0Var.m14606s()) {
            return false;
        }
        do {
            if (!m14663i(g0Var)) {
                g0 g0VarM14609v = g0Var.m14609v();
                if ((g0VarM14609v != null ? g0VarM14609v.f36833L.f36931d : null) != c0.Measuring) {
                    return false;
                }
            }
            g0Var = g0Var.m14609v();
            if (g0Var == null) {
                return false;
            }
        } while (!g0Var.m14579I());
        return true;
    }

    /* renamed from: i */
    public static boolean m14663i(g0 g0Var) {
        y0 y0Var = g0Var.f36833L.f36943p;
        return y0Var.f37063m == e0.InMeasureBlock || y0Var.f37043B.m14618e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14664a(boolean r7) {
        /*
            r6 = this;
            r0 = 1
            c9.v r1 = r6.f37032e
            if (r7 == 0) goto L13
            java.lang.Object r7 = r1.f5668b
            m2.e r7 = (m2.C4640e) r7
            r7.m9511h()
            v3.g0 r2 = r6.f37028a
            r7.m9506b(r2)
            r2.f36841Z = r0
        L13:
            java.lang.Object r7 = r1.f5668b
            m2.e r7 = (m2.C4640e) r7
            v3.n1 r2 = v3.n1.f36960b
            r7.m9518q(r2)
            int r2 = r7.f22886c
            java.lang.Object r3 = r1.f5669c
            v3.g0[] r3 = (v3.g0[]) r3
            if (r3 == 0) goto L27
            int r4 = r3.length
            if (r4 >= r2) goto L2f
        L27:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r2)
            v3.g0[] r3 = new v3.g0[r3]
        L2f:
            r4 = 0
            r1.f5669c = r4
            r4 = 0
        L33:
            if (r4 >= r2) goto L3e
            java.lang.Object[] r5 = r7.f22884a
            r5 = r5[r4]
            r3[r4] = r5
            int r4 = r4 + 1
            goto L33
        L3e:
            r7.m9511h()
            int r2 = r2 - r0
        L42:
            r7 = -1
            if (r7 >= r2) goto L54
            r7 = r3[r2]
            kotlin.jvm.internal.AbstractC4154l.m8920c(r7)
            boolean r0 = r7.f36841Z
            if (r0 == 0) goto L51
            c9.C0927v.m2698f(r7)
        L51:
            int r2 = r2 + (-1)
            goto L42
        L54:
            r1.f5669c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.v0.m14664a(boolean):void");
    }

    /* renamed from: d */
    public final void m14665d() {
        C4640e c4640e = this.f37035h;
        int i10 = c4640e.f22886c;
        if (i10 != 0) {
            Object[] objArr = c4640e.f22884a;
            for (int i11 = 0; i11 < i10; i11++) {
                t0 t0Var = (t0) objArr[i11];
                g0 g0Var = t0Var.f37010a;
                boolean z6 = t0Var.f37012c;
                g0 g0Var2 = t0Var.f37010a;
                if (g0Var.m14578H()) {
                    if (t0Var.f37011b) {
                        g0.m14567U(g0Var2, z6, 2);
                    } else {
                        g0.m14568W(g0Var2, z6, 2);
                    }
                }
            }
            c4640e.m9511h();
        }
    }

    /* renamed from: e */
    public final void m14666e(g0 g0Var) {
        C4640e c4640eM14613z = g0Var.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (AbstractC4154l.m8918a(g0Var2.m14580J(), Boolean.TRUE) && !g0Var2.f44836h0) {
                if (((b2) ((C7427b) this.f37029b.f5574b).f35231b).contains(g0Var2)) {
                    g0Var2.m14581K();
                }
                m14666e(g0Var2);
            }
        }
    }

    /* renamed from: f */
    public final void m14667f(g0 g0Var, boolean z6) {
        if (!this.f37030c) {
            AbstractC6744a.m12907b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z6 ? g0Var.f36833L.f36932e : g0Var.m14606s()) {
            AbstractC6744a.m12906a("node not yet measured");
        }
        m14668g(g0Var, z6);
    }

    /* renamed from: g */
    public final void m14668g(g0 g0Var, boolean z6) {
        s0 s0Var;
        h0 h0Var;
        C4640e c4640eM14613z = g0Var.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if ((!z6 && m14663i(g0Var2)) || (z6 && (g0Var2.m14607t() == e0.InMeasureBlock || ((s0Var = g0Var2.f36833L.f36944q) != null && (h0Var = s0Var.f37004t) != null && h0Var.m14618e())))) {
                boolean zM14558s = AbstractC7634f.m14558s(g0Var2);
                k0 k0Var = g0Var2.f36833L;
                if (zM14558s && !z6) {
                    if (k0Var.f36932e && ((b2) ((C7427b) this.f37029b.f5574b).f35231b).contains(g0Var2)) {
                        m14672m(g0Var2, true, false);
                    } else {
                        m14667f(g0Var2, true);
                    }
                }
                if (z6 ? k0Var.f36932e : g0Var2.m14606s()) {
                    m14672m(g0Var2, z6, false);
                }
                if (!(z6 ? k0Var.f36932e : g0Var2.m14606s())) {
                    m14668g(g0Var2, z6);
                }
            }
        }
        if (z6 ? g0Var.f36833L.f36932e : g0Var.m14606s()) {
            m14672m(g0Var, z6, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [w2.q] */
    /* renamed from: j */
    public final boolean m14669j(C7902t c7902t) {
        boolean z6;
        AbstractC7878q abstractC7878q;
        AbstractC7878q abstractC7878qM14545f;
        g0 g0Var;
        C0908c c0908c = this.f37029b;
        g0 g0Var2 = this.f37028a;
        if (!g0Var2.m14578H()) {
            AbstractC6744a.m12906a("performMeasureAndLayout called with unattached root");
        }
        if (!g0Var2.m14579I()) {
            AbstractC6744a.m12906a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f37030c) {
            AbstractC6744a.m12906a("performMeasureAndLayout called during measure layout");
        }
        int i10 = 0;
        if (this.f37036i != null) {
            this.f37030c = true;
            this.f37031d = true;
            try {
                if (c0908c.m2580y()) {
                    z6 = false;
                    while (true) {
                        boolean zM2580y = c0908c.m2580y();
                        C7427b c7427b = (C7427b) c0908c.f5574b;
                        if (!zM2580y) {
                            break;
                        }
                        boolean zIsEmpty = ((b2) c7427b.f35231b).isEmpty();
                        boolean z10 = !zIsEmpty;
                        if (zIsEmpty) {
                            C7427b c7427b2 = (C7427b) c0908c.f5575c;
                            g0 g0Var3 = (g0) ((b2) c7427b2.f35231b).first();
                            c7427b2.m13820o(g0Var3);
                            g0Var = g0Var3;
                        } else {
                            g0Var = (g0) ((b2) c7427b.f35231b).first();
                            c7427b.m13820o(g0Var);
                        }
                        boolean zM14672m = m14672m(g0Var, z10, true);
                        if (g0Var == g0Var2 && zM14672m) {
                            z6 = true;
                        }
                    }
                    if (c7902t != null) {
                        c7902t.invoke();
                    }
                } else {
                    z6 = false;
                }
                this.f37030c = false;
                this.f37031d = false;
            } catch (Throwable th2) {
                this.f37030c = false;
                this.f37031d = false;
                throw th2;
            }
        } else {
            z6 = false;
        }
        C4640e c4640e = this.f37033f;
        Object[] objArr = c4640e.f22884a;
        int i11 = c4640e.f22886c;
        int i12 = 0;
        while (i12 < i11) {
            C4535g c4535g = ((g0) objArr[i12]).f36832K;
            C7649u c7649u = (C7649u) c4535g.f22539c;
            boolean zM14630g = i1.m14630g(128);
            if (zM14630g) {
                abstractC7878q = c7649u.f37016V;
            } else {
                abstractC7878q = c7649u.f37016V.f37674e;
                if (abstractC7878q == null) {
                }
                i12++;
                i10 = 0;
            }
            d3.i0 i0Var = h1.f36888L;
            AbstractC7878q abstractC7878qV0 = c7649u.V0(zM14630g);
            while (abstractC7878qV0 != null && (abstractC7878qV0.f37673d & 128) != 0) {
                if ((abstractC7878qV0.f37672c & 128) != 0) {
                    AbstractC7642n abstractC7642n = abstractC7878qV0;
                    C4640e c4640e2 = null;
                    while (abstractC7642n != 0) {
                        if (abstractC7642n instanceof InterfaceC7651w) {
                            ((InterfaceC7651w) abstractC7642n).f0((C7649u) c4535g.f22539c);
                        } else {
                            if ((abstractC7642n.f37672c & 128) != 0 && (abstractC7642n instanceof AbstractC7642n)) {
                                AbstractC7878q abstractC7878q2 = abstractC7642n.f36953r;
                                abstractC7878qM14545f = abstractC7642n;
                                c4640e2 = c4640e2;
                                while (abstractC7878q2 != null) {
                                    if ((abstractC7878q2.f37672c & 128) != 0) {
                                        i10++;
                                        c4640e2 = c4640e2;
                                        if (i10 == 1) {
                                            abstractC7878qM14545f = abstractC7878q2;
                                        } else {
                                            if (c4640e2 == null) {
                                                c4640e2 = new C4640e(new AbstractC7878q[16]);
                                            }
                                            if (abstractC7878qM14545f != null) {
                                                c4640e2.m9506b(abstractC7878qM14545f);
                                                abstractC7878qM14545f = null;
                                            }
                                            c4640e2.m9506b(abstractC7878q2);
                                        }
                                    }
                                    abstractC7878q2 = abstractC7878q2.f37675f;
                                    abstractC7878qM14545f = abstractC7878qM14545f;
                                    c4640e2 = c4640e2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            i10 = 0;
                            abstractC7642n = abstractC7878qM14545f;
                            c4640e2 = c4640e2;
                        }
                        abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e2);
                        i10 = 0;
                        abstractC7642n = abstractC7878qM14545f;
                        c4640e2 = c4640e2;
                    }
                }
                if (abstractC7878qV0 != abstractC7878q) {
                    abstractC7878qV0 = abstractC7878qV0.f37675f;
                    i10 = 0;
                }
            }
            i12++;
            i10 = 0;
        }
        c4640e.m9511h();
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, v3.g0] */
    /* renamed from: k */
    public final void m14670k(g0 g0Var, long j6) {
        AbstractC7878q abstractC7878q;
        AbstractC7878q abstractC7878qM14545f;
        if (g0Var.f44836h0) {
            return;
        }
        g0 g0Var2 = this.f37028a;
        if (g0Var.equals(g0Var2)) {
            AbstractC6744a.m12906a("measureAndLayout called on root");
        }
        if (!g0Var2.m14578H()) {
            AbstractC6744a.m12906a("performMeasureAndLayout called with unattached root");
        }
        if (!g0Var2.m14579I()) {
            AbstractC6744a.m12906a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f37030c) {
            AbstractC6744a.m12906a("performMeasureAndLayout called during measure layout");
        }
        int i10 = 0;
        if (this.f37036i != null) {
            this.f37030c = true;
            this.f37031d = false;
            try {
                C0908c c0908c = this.f37029b;
                ((C7427b) c0908c.f5574b).m13820o(g0Var);
                ((C7427b) c0908c.f5575c).m13820o(g0Var);
                if ((m14660b(g0Var, new C6745a(j6)) || g0Var.f36833L.f36933f) && AbstractC4154l.m8918a(g0Var.m14580J(), Boolean.TRUE)) {
                    g0Var.m14581K();
                }
                m14666e(g0Var);
                m14661c(g0Var, new C6745a(j6));
                if (g0Var.m14605r() && g0Var.m14579I()) {
                    g0Var.m14588S();
                    ((C4640e) this.f37032e.f5668b).m9506b(g0Var);
                    g0Var.f36841Z = true;
                }
                m14665d();
                this.f37030c = false;
                this.f37031d = false;
            } catch (Throwable th2) {
                this.f37030c = false;
                this.f37031d = false;
                throw th2;
            }
        }
        C4640e c4640e = this.f37033f;
        Object[] objArr = c4640e.f22884a;
        int i11 = c4640e.f22886c;
        int i12 = 0;
        while (i12 < i11) {
            C4535g c4535g = ((g0) objArr[i12]).f36832K;
            C7649u c7649u = (C7649u) c4535g.f22539c;
            boolean zM14630g = i1.m14630g(128);
            if (zM14630g) {
                abstractC7878q = c7649u.f37016V;
            } else {
                abstractC7878q = c7649u.f37016V.f37674e;
                if (abstractC7878q == null) {
                }
                i12++;
                i10 = 0;
            }
            d3.i0 i0Var = h1.f36888L;
            AbstractC7878q abstractC7878qV0 = c7649u.V0(zM14630g);
            while (abstractC7878qV0 != null && (abstractC7878qV0.f37673d & 128) != 0) {
                if ((abstractC7878qV0.f37672c & 128) != 0) {
                    AbstractC7642n abstractC7642n = abstractC7878qV0;
                    C4640e c4640e2 = null;
                    while (abstractC7642n != 0) {
                        if (abstractC7642n instanceof InterfaceC7651w) {
                            ((InterfaceC7651w) abstractC7642n).f0((C7649u) c4535g.f22539c);
                        } else {
                            if ((abstractC7642n.f37672c & 128) != 0 && (abstractC7642n instanceof AbstractC7642n)) {
                                AbstractC7878q abstractC7878q2 = abstractC7642n.f36953r;
                                int i13 = i10;
                                abstractC7878qM14545f = abstractC7642n;
                                c4640e2 = c4640e2;
                                while (abstractC7878q2 != null) {
                                    if ((abstractC7878q2.f37672c & 128) != 0) {
                                        i13++;
                                        c4640e2 = c4640e2;
                                        if (i13 == 1) {
                                            abstractC7878qM14545f = abstractC7878q2;
                                        } else {
                                            if (c4640e2 == null) {
                                                c4640e2 = new C4640e(new AbstractC7878q[16]);
                                            }
                                            if (abstractC7878qM14545f != null) {
                                                c4640e2.m9506b(abstractC7878qM14545f);
                                                abstractC7878qM14545f = null;
                                            }
                                            c4640e2.m9506b(abstractC7878q2);
                                        }
                                    }
                                    abstractC7878q2 = abstractC7878q2.f37675f;
                                    abstractC7878qM14545f = abstractC7878qM14545f;
                                    c4640e2 = c4640e2;
                                }
                                if (i13 == 1) {
                                }
                            }
                            i10 = 0;
                            abstractC7642n = abstractC7878qM14545f;
                            c4640e2 = c4640e2;
                        }
                        abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e2);
                        i10 = 0;
                        abstractC7642n = abstractC7878qM14545f;
                        c4640e2 = c4640e2;
                    }
                }
                if (abstractC7878qV0 != abstractC7878q) {
                    abstractC7878qV0 = abstractC7878qV0.f37675f;
                    i10 = 0;
                }
            }
            i12++;
            i10 = 0;
        }
        c4640e.m9511h();
    }

    /* renamed from: l */
    public final void m14671l() {
        C0908c c0908c = this.f37029b;
        if (c0908c.m2580y()) {
            g0 g0Var = this.f37028a;
            if (!g0Var.m14578H()) {
                AbstractC6744a.m12906a("performMeasureAndLayout called with unattached root");
            }
            if (!g0Var.m14579I()) {
                AbstractC6744a.m12906a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f37030c) {
                AbstractC6744a.m12906a("performMeasureAndLayout called during measure layout");
            }
            if (this.f37036i != null) {
                this.f37030c = true;
                this.f37031d = false;
                try {
                    if (!((b2) ((C7427b) c0908c.f5574b).f35231b).isEmpty()) {
                        if (g0Var.f36849h != null) {
                            m14674o(g0Var, true);
                        } else {
                            m14673n(g0Var);
                        }
                    }
                    m14674o(g0Var, false);
                    this.f37030c = false;
                    this.f37031d = false;
                } catch (Throwable th2) {
                    this.f37030c = false;
                    this.f37031d = false;
                    throw th2;
                }
            }
        }
    }

    /* renamed from: m */
    public final boolean m14672m(g0 g0Var, boolean z6, boolean z10) {
        C6745a c6745a;
        boolean zM14660b;
        t3.v0 placementScope;
        C7649u c7649u;
        g0 g0VarM14609v;
        s0 s0Var;
        h0 h0Var;
        s0 s0Var2;
        h0 h0Var2;
        boolean z11 = g0Var.f44836h0;
        k0 k0Var = g0Var.f36833L;
        if (z11 || (!g0Var.m14579I() && !k0Var.f36943p.f37071w && !m14662h(g0Var) && !AbstractC4154l.m8918a(g0Var.m14580J(), Boolean.TRUE) && ((!k0Var.f36932e || (g0Var.m14607t() != e0.InMeasureBlock && ((s0Var2 = k0Var.f36944q) == null || (h0Var2 = s0Var2.f37004t) == null || !h0Var2.m14618e()))) && !k0Var.f36943p.f37043B.m14618e() && ((s0Var = k0Var.f36944q) == null || (h0Var = s0Var.f37004t) == null || !h0Var.m14618e())))) {
            return false;
        }
        g0 g0Var2 = this.f37028a;
        if (g0Var == g0Var2) {
            c6745a = this.f37036i;
            AbstractC4154l.m8920c(c6745a);
        } else {
            c6745a = null;
        }
        if (z6) {
            zM14660b = k0Var.f36932e ? m14660b(g0Var, c6745a) : false;
            if (z10 && ((zM14660b || k0Var.f36933f) && AbstractC4154l.m8918a(g0Var.m14580J(), Boolean.TRUE))) {
                g0Var.m14581K();
            }
        } else {
            boolean zM14661c = g0Var.m14606s() ? m14661c(g0Var, c6745a) : false;
            if (z10 && g0Var.m14605r() && (g0Var == g0Var2 || ((g0VarM14609v = g0Var.m14609v()) != null && g0VarM14609v.m14579I() && k0Var.f36943p.f37071w))) {
                if (g0Var == g0Var2) {
                    if (g0Var.f36829G == e0.NotUsed) {
                        g0Var.m14596f();
                    }
                    g0 g0VarM14609v2 = g0Var.m14609v();
                    if (g0VarM14609v2 == null || (c7649u = (C7649u) g0VarM14609v2.f36832K.f22539c) == null || (placementScope = c7649u.f36957j) == null) {
                        placementScope = ((C7904v) j0.m14636a(g0Var)).getPlacementScope();
                    }
                    t3.v0.m13319g(placementScope, k0Var.f36943p, 0, 0);
                } else {
                    g0Var.m14588S();
                }
                ((C4640e) this.f37032e.f5668b).m9506b(g0Var);
                g0Var.f36841Z = true;
                ((C7904v) j0.m14636a(g0Var)).getRectManager().m5697d(g0Var);
            }
            zM14660b = zM14661c;
        }
        m14665d();
        return zM14660b;
    }

    /* renamed from: n */
    public final void m14673n(g0 g0Var) {
        C4640e c4640eM14613z = g0Var.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (m14663i(g0Var2)) {
                if (AbstractC7634f.m14558s(g0Var2)) {
                    m14674o(g0Var2, true);
                } else {
                    m14673n(g0Var2);
                }
            }
        }
    }

    /* renamed from: o */
    public final void m14674o(g0 g0Var, boolean z6) {
        C6745a c6745a;
        if (g0Var.f44836h0) {
            return;
        }
        if (g0Var == this.f37028a) {
            c6745a = this.f37036i;
            AbstractC4154l.m8920c(c6745a);
        } else {
            c6745a = null;
        }
        if (z6) {
            m14660b(g0Var, c6745a);
        } else {
            m14661c(g0Var, c6745a);
        }
    }

    /* renamed from: p */
    public final boolean m14675p(g0 g0Var, boolean z6) {
        int i10 = u0.f37018a[g0Var.f36833L.f36931d.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                this.f37035h.m9506b(new t0(g0Var, false, z6));
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!g0Var.m14606s() || z6) {
                    g0Var.f36833L.f36943p.f37072x = true;
                    if (!g0Var.f44836h0 && (g0Var.m14579I() || m14662h(g0Var))) {
                        g0 g0VarM14609v = g0Var.m14609v();
                        if (g0VarM14609v == null || !g0VarM14609v.m14606s()) {
                            this.f37029b.m2558a(g0Var, false);
                        }
                        if (!this.f37031d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    public final void m14676q(long j6) {
        C6745a c6745a = this.f37036i;
        if (c6745a == null ? false : C6745a.m12912c(c6745a.f32195a, j6)) {
            return;
        }
        if (this.f37030c) {
            AbstractC6744a.m12906a("updateRootConstraints called while measuring");
        }
        this.f37036i = new C6745a(j6);
        g0 g0Var = this.f37028a;
        g0 g0Var2 = g0Var.f36849h;
        k0 k0Var = g0Var.f36833L;
        if (g0Var2 != null) {
            k0Var.f36932e = true;
        }
        k0Var.f36943p.f37072x = true;
        this.f37029b.m2558a(g0Var, g0Var2 != null);
    }
}
