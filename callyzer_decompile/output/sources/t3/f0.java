package t3;

import android.view.ViewGroup;
import com.sun.mail.util.AbstractC1452a;
import cp.C1476g;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import k2.AbstractC3969r;
import k2.C3953b;
import k2.C3966o;
import k2.C3972u;
import k2.InterfaceC3960i;
import k2.j1;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC4154l;
import m2.C4637b;
import m2.C4640e;
import s2.C6734c;
import s3.AbstractC6744a;
import u2.AbstractC7311h;
import u2.AbstractC7316m;
import u2.AbstractC7321r;
import ug.C7439j;
import w3.i3;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 implements InterfaceC3960i {

    /* renamed from: a */
    public final v3.g0 f33979a;

    /* renamed from: b */
    public AbstractC3969r f33980b;

    /* renamed from: c */
    public h1 f33981c;

    /* renamed from: d */
    public int f33982d;

    /* renamed from: e */
    public int f33983e;

    /* renamed from: f */
    public final e1.j0 f33984f;

    /* renamed from: g */
    public final e1.j0 f33985g;

    /* renamed from: h */
    public final a0 f33986h;

    /* renamed from: j */
    public final C7037x f33987j;

    /* renamed from: k */
    public final e1.j0 f33988k;

    /* renamed from: l */
    public final e1.y0 f33989l;

    /* renamed from: m */
    public final e1.j0 f33990m;

    /* renamed from: n */
    public final C4640e f33991n;

    /* renamed from: p */
    public int f33992p;

    /* renamed from: q */
    public int f33993q;

    /* renamed from: r */
    public final String f33994r;

    public f0(v3.g0 g0Var, h1 h1Var) {
        this.f33979a = g0Var;
        this.f33981c = h1Var;
        long[] jArr = e1.r0.f9045a;
        this.f33984f = new e1.j0();
        this.f33985g = new e1.j0();
        this.f33986h = new a0(this);
        this.f33987j = new C7037x(this);
        this.f33988k = new e1.j0();
        this.f33989l = new e1.y0();
        this.f33990m = new e1.j0();
        this.f33991n = new C4640e(new Object[16]);
        this.f33994r = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* renamed from: h */
    public static C3972u m13285h(C3972u c3972u, v3.g0 g0Var, boolean z6, AbstractC3969r abstractC3969r, C6734c c6734c) {
        if (c3972u == null || c3972u.f20576w) {
            ViewGroup.LayoutParams layoutParams = i3.f37809a;
            c3972u = new C3972u(abstractC3969r, new C7439j(g0Var));
        }
        if (!z6) {
            c3972u.m8667j(c6734c);
            return c3972u;
        }
        C3966o c3966o = c3972u.f20575v;
        c3966o.f20488y = 100;
        c3966o.f20487x = true;
        c3972u.m8667j(c6734c);
        if (c3966o.f20451E || c3966o.f20488y != 100) {
            j1.m8542a("Cannot disable reuse from root if it was caused by other groups");
        }
        c3966o.f20488y = -1;
        c3966o.f20487x = false;
        return c3972u;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // k2.InterfaceC3960i
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo8538a() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            v3.g0 r2 = r0.f33979a
            r2.f36858s = r1
            e1.j0 r1 = r0.f33984f
            java.lang.Object[] r3 = r1.f9000c
            long[] r4 = r1.f8998a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            t3.y r13 = (t3.C7038y) r13
            k2.u r13 = r13.f34042c
            if (r13 == 0) goto L47
            r13.dispose()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.m14586Q()
            r2.f36858s = r6
            r1.m5568a()
            e1.j0 r1 = r0.f33985g
            r1.m5568a()
            r0.f33993q = r6
            r0.f33992p = r6
            e1.j0 r1 = r0.f33988k
            r1.m5568a()
            r0.m13287d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.f0.mo8538a():void");
    }

    @Override // k2.InterfaceC3960i
    /* renamed from: b */
    public final void mo8539b() {
        m13288e(true);
    }

    /* renamed from: c */
    public final void m13286c(int i10) {
        boolean z6;
        boolean z10 = false;
        this.f33992p = 0;
        List listM14604q = this.f33979a.m14604q();
        C4637b c4637b = (C4637b) listM14604q;
        int i11 = (c4637b.f22878a.f22886c - this.f33993q) - 1;
        if (i10 <= i11) {
            this.f33989l.clear();
            if (i10 <= i11) {
                int i12 = i10;
                while (true) {
                    Object objM5574g = this.f33984f.m5574g((v3.g0) c4637b.get(i12));
                    AbstractC4154l.m8920c(objM5574g);
                    ((e1.f0) this.f33989l.f9090b).m5557a(((C7038y) objM5574g).f34040a);
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f33981c.mo13309j(this.f33989l);
            AbstractC7311h abstractC7311hM13706c = AbstractC7321r.m13706c();
            InterfaceC2139c interfaceC2139cMo13650e = abstractC7311hM13706c != null ? abstractC7311hM13706c.mo13650e() : null;
            AbstractC7311h abstractC7311hM13707d = AbstractC7321r.m13707d(abstractC7311hM13706c);
            z6 = false;
            while (i11 >= i10) {
                try {
                    v3.g0 g0Var = (v3.g0) ((C4637b) listM14604q).get(i11);
                    Object objM5574g2 = this.f33984f.m5574g(g0Var);
                    AbstractC4154l.m8920c(objM5574g2);
                    C7038y c7038y = (C7038y) objM5574g2;
                    Object obj = c7038y.f34040a;
                    if (((e1.f0) this.f33989l.f9090b).m5559c(obj)) {
                        this.f33992p++;
                        if (((Boolean) c7038y.f34045f.getValue()).booleanValue()) {
                            v3.k0 k0Var = g0Var.f36833L;
                            v3.y0 y0Var = k0Var.f36943p;
                            v3.e0 e0Var = v3.e0.NotUsed;
                            y0Var.f37063m = e0Var;
                            v3.s0 s0Var = k0Var.f36944q;
                            if (s0Var != null) {
                                s0Var.f36996k = e0Var;
                            }
                            c7038y.f34045f.setValue(Boolean.FALSE);
                            z6 = true;
                        }
                    } else {
                        v3.g0 g0Var2 = this.f33979a;
                        g0Var2.f36858s = true;
                        this.f33984f.m5577j(g0Var);
                        C3972u c3972u = c7038y.f34042c;
                        if (c3972u != null) {
                            c3972u.dispose();
                        }
                        this.f33979a.m14587R(i11, 1);
                        g0Var2.f36858s = false;
                    }
                    this.f33985g.m5577j(obj);
                    i11--;
                } catch (Throwable th2) {
                    AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
                    throw th2;
                }
            }
            AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
        } else {
            z6 = false;
        }
        if (z6) {
            synchronized (AbstractC7316m.f34890b) {
                e1.k0 k0Var2 = AbstractC7316m.f34897i.f34857h;
                if (k0Var2 != null) {
                    if (k0Var2.m5588h()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                AbstractC7316m.m13676a();
            }
        }
        m13287d();
    }

    /* renamed from: d */
    public final void m13287d() {
        int i10 = ((C4637b) this.f33979a.m14604q()).f22878a.f22886c;
        e1.j0 j0Var = this.f33984f;
        if (j0Var.f9002e != i10) {
            AbstractC6744a.m12906a("Inconsistency between the count of nodes tracked by the state (" + j0Var.f9002e + ") and the children count on the SubcomposeLayout (" + i10 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i10 - this.f33992p) - this.f33993q < 0) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Incorrect state. Total children ", ". Reusable children ");
            sbM4567n.append(this.f33992p);
            sbM4567n.append(". Precomposed children ");
            sbM4567n.append(this.f33993q);
            AbstractC6744a.m12906a(sbM4567n.toString());
        }
        e1.j0 j0Var2 = this.f33988k;
        if (j0Var2.f9002e == this.f33993q) {
            return;
        }
        AbstractC6744a.m12906a("Incorrect state. Precomposed children " + this.f33993q + ". Map size " + j0Var2.f9002e);
    }

    /* renamed from: e */
    public final void m13288e(boolean z6) {
        this.f33993q = 0;
        this.f33988k.m5568a();
        List listM14604q = this.f33979a.m14604q();
        int i10 = ((C4637b) listM14604q).f22878a.f22886c;
        if (this.f33992p != i10) {
            this.f33992p = i10;
            AbstractC7311h abstractC7311hM13706c = AbstractC7321r.m13706c();
            InterfaceC2139c interfaceC2139cMo13650e = abstractC7311hM13706c != null ? abstractC7311hM13706c.mo13650e() : null;
            AbstractC7311h abstractC7311hM13707d = AbstractC7321r.m13707d(abstractC7311hM13706c);
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    v3.g0 g0Var = (v3.g0) ((C4637b) listM14604q).get(i11);
                    C7038y c7038y = (C7038y) this.f33984f.m5574g(g0Var);
                    if (c7038y != null && ((Boolean) c7038y.f34045f.getValue()).booleanValue()) {
                        v3.k0 k0Var = g0Var.f36833L;
                        v3.y0 y0Var = k0Var.f36943p;
                        v3.e0 e0Var = v3.e0.NotUsed;
                        y0Var.f37063m = e0Var;
                        v3.s0 s0Var = k0Var.f36944q;
                        if (s0Var != null) {
                            s0Var.f36996k = e0Var;
                        }
                        if (z6) {
                            C3972u c3972u = c7038y.f34042c;
                            if (c3972u != null) {
                                c3972u.m8668k();
                            }
                            c7038y.f34045f = C3953b.m8517t(Boolean.FALSE);
                        } else {
                            c7038y.f34045f.setValue(Boolean.FALSE);
                        }
                        c7038y.f34040a = c1.f33970a;
                    }
                } catch (Throwable th2) {
                    AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
                    throw th2;
                }
            }
            AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
            this.f33985g.m5568a();
        }
        m13287d();
    }

    /* renamed from: f */
    public final d1 m13289f(Object obj, InterfaceC2141e interfaceC2141e) {
        v3.g0 g0Var = this.f33979a;
        if (!g0Var.m14578H()) {
            return new d0();
        }
        m13287d();
        if (!this.f33985g.m5570c(obj)) {
            this.f33990m.m5577j(obj);
            e1.j0 j0Var = this.f33988k;
            Object objM5574g = j0Var.m5574g(obj);
            if (objM5574g == null) {
                objM5574g = m13291i(obj);
                if (objM5574g != null) {
                    int iM9513k = ((C4637b) g0Var.m14604q()).f22878a.m9513k(objM5574g);
                    int i10 = ((C4637b) g0Var.m14604q()).f22878a.f22886c;
                    g0Var.f36858s = true;
                    g0Var.m14582L(iM9513k, i10, 1);
                    g0Var.f36858s = false;
                    this.f33993q++;
                } else {
                    int i11 = ((C4637b) g0Var.m14604q()).f22878a.f22886c;
                    v3.g0 g0Var2 = new v3.g0(2);
                    g0Var.f36858s = true;
                    g0Var.m14572B(i11, g0Var2);
                    g0Var.f36858s = false;
                    this.f33993q++;
                    objM5574g = g0Var2;
                }
                j0Var.m5579l(obj, objM5574g);
            }
            m13290g((v3.g0) objM5574g, obj, interfaceC2141e);
        }
        return new e0(this, obj);
    }

    /* renamed from: g */
    public final void m13290g(v3.g0 g0Var, Object obj, InterfaceC2141e interfaceC2141e) {
        boolean z6;
        e1.j0 j0Var = this.f33984f;
        Object objM5574g = j0Var.m5574g(g0Var);
        Object obj2 = objM5574g;
        if (objM5574g == null) {
            C6734c c6734c = AbstractC7021h.f34003a;
            C7038y c7038y = new C7038y();
            c7038y.f34040a = obj;
            c7038y.f34041b = c6734c;
            c7038y.f34042c = null;
            c7038y.f34045f = C3953b.m8517t(Boolean.TRUE);
            j0Var.m5579l(g0Var, c7038y);
            obj2 = c7038y;
        }
        C7038y c7038y2 = (C7038y) obj2;
        C3972u c3972u = c7038y2.f34042c;
        if (c3972u != null) {
            synchronized (c3972u.f20560d) {
                z6 = c3972u.f20570p.f9002e > 0;
            }
        } else {
            z6 = true;
        }
        if (c7038y2.f34041b != interfaceC2141e || z6 || c7038y2.f34043d) {
            c7038y2.f34041b = interfaceC2141e;
            AbstractC7311h abstractC7311hM13706c = AbstractC7321r.m13706c();
            InterfaceC2139c interfaceC2139cMo13650e = abstractC7311hM13706c != null ? abstractC7311hM13706c.mo13650e() : null;
            AbstractC7311h abstractC7311hM13707d = AbstractC7321r.m13707d(abstractC7311hM13706c);
            try {
                v3.g0 g0Var2 = this.f33979a;
                g0Var2.f36858s = true;
                InterfaceC2141e interfaceC2141e2 = c7038y2.f34041b;
                C3972u c3972u2 = c7038y2.f34042c;
                AbstractC3969r abstractC3969r = this.f33980b;
                if (abstractC3969r == null) {
                    AbstractC6744a.m12908c("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                c7038y2.f34042c = m13285h(c3972u2, g0Var, c7038y2.f34044e, abstractC3969r, new C6734c(new C1476g(24, c7038y2, interfaceC2141e2), true, -1750409193));
                c7038y2.f34044e = false;
                g0Var2.f36858s = false;
                AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
                c7038y2.f34043d = false;
            } catch (Throwable th2) {
                AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public final v3.g0 m13291i(Object obj) {
        e1.j0 j0Var;
        int i10;
        if (this.f33992p == 0) {
            return null;
        }
        v3.g0 g0Var = this.f33979a;
        C4637b c4637b = (C4637b) g0Var.m14604q();
        int i11 = c4637b.f22878a.f22886c - this.f33993q;
        int i12 = i11 - this.f33992p;
        int i13 = i11 - 1;
        int i14 = i13;
        while (true) {
            j0Var = this.f33984f;
            if (i14 < i12) {
                i10 = -1;
                break;
            }
            Object objM5574g = j0Var.m5574g((v3.g0) c4637b.get(i14));
            AbstractC4154l.m8920c(objM5574g);
            if (AbstractC4154l.m8918a(((C7038y) objM5574g).f34040a, obj)) {
                i10 = i14;
                break;
            }
            i14--;
        }
        if (i10 == -1) {
            while (i13 >= i12) {
                Object objM5574g2 = j0Var.m5574g((v3.g0) c4637b.get(i13));
                AbstractC4154l.m8920c(objM5574g2);
                C7038y c7038y = (C7038y) objM5574g2;
                Object obj2 = c7038y.f34040a;
                if (obj2 == c1.f33970a || this.f33981c.mo13308h(obj, obj2)) {
                    c7038y.f34040a = obj;
                    i14 = i13;
                    i10 = i14;
                    break;
                }
                i13--;
            }
            i14 = i13;
        }
        if (i10 == -1) {
            return null;
        }
        if (i14 != i12) {
            g0Var.f36858s = true;
            g0Var.m14582L(i14, i12, 1);
            g0Var.f36858s = false;
        }
        this.f33992p--;
        v3.g0 g0Var2 = (v3.g0) c4637b.get(i12);
        Object objM5574g3 = j0Var.m5574g(g0Var2);
        AbstractC4154l.m8920c(objM5574g3);
        C7038y c7038y2 = (C7038y) objM5574g3;
        c7038y2.f34045f = C3953b.m8517t(Boolean.TRUE);
        c7038y2.f34044e = true;
        c7038y2.f34043d = true;
        return g0Var2;
    }

    @Override // k2.InterfaceC3960i
    /* renamed from: j */
    public final void mo8540j() {
        m13288e(false);
    }
}
