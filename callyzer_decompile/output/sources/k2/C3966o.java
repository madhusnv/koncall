package k2;

import android.os.Trace;
import cp.C1475f;
import e1.C1920v;
import e1.C1922x;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import f1.AbstractC2176a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import l2.C4328a;
import l2.C4329b;
import l2.C4330c;
import l2.C4332e;
import l2.C4340m;
import l2.C4341n;
import l2.C4343p;
import l2.C4344q;
import l2.C4345r;
import l2.C4350w;
import l2.C4351x;
import l2.C4353z;
import m2.C4640e;
import org.bouncycastle.asn1.x509.DisplayText;
import qw.C6361k;
import s2.AbstractC6740i;
import s2.C6734c;
import s2.C6737f;
import s2.C6738g;
import u2.AbstractC7316m;
import ug.C7439j;
import v2.AbstractC7628b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k2.o */
/* loaded from: classes.dex */
public final class C3966o implements InterfaceC3962k {

    /* renamed from: A */
    public int f20447A;

    /* renamed from: B */
    public boolean f20448B;

    /* renamed from: C */
    public final C3965n f20449C;

    /* renamed from: D */
    public final ArrayList f20450D;

    /* renamed from: E */
    public boolean f20451E;

    /* renamed from: F */
    public u1 f20452F;

    /* renamed from: G */
    public v1 f20453G;

    /* renamed from: H */
    public y1 f20454H;

    /* renamed from: I */
    public boolean f20455I;

    /* renamed from: J */
    public i1 f20456J;

    /* renamed from: K */
    public C4328a f20457K;

    /* renamed from: L */
    public final C4329b f20458L;

    /* renamed from: M */
    public C3952a f20459M;

    /* renamed from: N */
    public C4330c f20460N;

    /* renamed from: O */
    public boolean f20461O;

    /* renamed from: P */
    public int f20462P;

    /* renamed from: Q */
    public C3971t f20463Q;

    /* renamed from: a */
    public final C7439j f20464a;

    /* renamed from: b */
    public final AbstractC3969r f20465b;

    /* renamed from: c */
    public final v1 f20466c;

    /* renamed from: d */
    public final e1.m0 f20467d;

    /* renamed from: e */
    public final C4328a f20468e;

    /* renamed from: f */
    public final C4328a f20469f;

    /* renamed from: g */
    public final C3972u f20470g;

    /* renamed from: i */
    public h1 f20472i;

    /* renamed from: j */
    public int f20473j;

    /* renamed from: k */
    public int f20474k;

    /* renamed from: l */
    public int f20475l;

    /* renamed from: n */
    public int[] f20477n;

    /* renamed from: o */
    public C1920v f20478o;

    /* renamed from: p */
    public boolean f20479p;

    /* renamed from: q */
    public boolean f20480q;

    /* renamed from: u */
    public C1922x f20484u;

    /* renamed from: v */
    public boolean f20485v;

    /* renamed from: x */
    public boolean f20487x;

    /* renamed from: z */
    public int f20489z;

    /* renamed from: h */
    public final ArrayList f20471h = new ArrayList();

    /* renamed from: m */
    public final l0 f20476m = new l0();

    /* renamed from: r */
    public final ArrayList f20481r = new ArrayList();

    /* renamed from: s */
    public final l0 f20482s = new l0();

    /* renamed from: t */
    public i1 f20483t = C6738g.f32179d;

    /* renamed from: w */
    public final l0 f20486w = new l0();

    /* renamed from: y */
    public int f20488y = -1;

    public C3966o(C7439j c7439j, AbstractC3969r abstractC3969r, v1 v1Var, e1.m0 m0Var, C4328a c4328a, C4328a c4328a2, C3972u c3972u) {
        this.f20464a = c7439j;
        this.f20465b = abstractC3969r;
        this.f20466c = v1Var;
        this.f20467d = m0Var;
        this.f20468e = c4328a;
        this.f20469f = c4328a2;
        this.f20470g = c3972u;
        this.f20448B = abstractC3969r.mo8560e() || abstractC3969r.mo8558c();
        this.f20449C = new C3965n(0, this);
        this.f20450D = new ArrayList();
        u1 u1VarM8702j = v1Var.m8702j();
        u1VarM8702j.m8684c();
        this.f20452F = u1VarM8702j;
        v1 v1Var2 = new v1();
        if (abstractC3969r.mo8560e()) {
            v1Var2.m8701h();
        }
        if (abstractC3969r.mo8558c()) {
            v1Var2.f20603l = new C1922x();
        }
        this.f20453G = v1Var2;
        y1 y1VarM8703q = v1Var2.m8703q();
        y1VarM8703q.m8736e(true);
        this.f20454H = y1VarM8703q;
        this.f20458L = new C4329b(this, c4328a);
        u1 u1VarM8702j2 = this.f20453G.m8702j();
        try {
            C3952a c3952aM8682a = u1VarM8702j2.m8682a(0);
            u1VarM8702j2.m8684c();
            this.f20459M = c3952aM8682a;
            this.f20460N = new C4330c();
        } catch (Throwable th2) {
            u1VarM8702j2.m8684c();
            throw th2;
        }
    }

    /* renamed from: O */
    public static final int m8582O(C3966o c3966o, int i10, boolean z6, int i11) {
        u1 u1Var = c3966o.f20452F;
        C4329b c4329b = c3966o.f20458L;
        int[] iArr = u1Var.f20578b;
        int i12 = i10 * 5;
        int i13 = iArr[i12 + 1];
        if ((134217728 & i13) != 0) {
            int i14 = iArr[i12];
            Object objM8694m = u1Var.m8694m(i10, iArr);
            if (i14 == 206 && AbstractC4154l.m8918a(objM8694m, AbstractC3967p.f20496e)) {
                Object objM8688g = u1Var.m8688g(i10, 0);
                C3963l c3963l = objM8688g instanceof C3963l ? (C3963l) objM8688g : null;
                if (c3963l != null) {
                    for (C3966o c3966o2 : c3963l.f20418a.f20426e) {
                        v1 v1Var = c3966o2.f20466c;
                        if (v1Var.f20594b > 0 && (v1Var.f20593a[1] & 67108864) != 0) {
                            C3972u c3972u = c3966o2.f20470g;
                            synchronized (c3972u.f20560d) {
                                c3972u.m8671n();
                                e1.j0 j0Var = c3972u.f20570p;
                                c3972u.f20570p = fb.b0.m5941b();
                                try {
                                    c3972u.f20575v.f0(j0Var);
                                } catch (Exception e2) {
                                    c3972u.f20570p = j0Var;
                                    throw e2;
                                }
                            }
                            C4328a c4328a = new C4328a();
                            c3966o2.f20457K = c4328a;
                            u1 u1VarM8702j = c3966o2.f20466c.m8702j();
                            try {
                                c3966o2.f20452F = u1VarM8702j;
                                C4329b c4329b2 = c3966o2.f20458L;
                                C4328a c4328a2 = c4329b2.f21792b;
                                try {
                                    c4329b2.f21792b = c4328a;
                                    c3966o2.m8597N(0);
                                    C4329b c4329b3 = c3966o2.f20458L;
                                    c4329b3.m9058b();
                                    if (c4329b3.f21793c) {
                                        c4329b3.f21792b.f21789a.m9066g(l2.b0.f21803c);
                                        if (c4329b3.f21793c) {
                                            c4329b3.m9060d(false);
                                            c4329b3.m9060d(false);
                                            c4329b3.f21792b.f21789a.m9066g(C4340m.f21829c);
                                            c4329b3.f21793c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                u1VarM8702j.m8684c();
                            }
                        }
                        c3966o.f20465b.mo8568m(c3966o2.f20470g);
                    }
                }
                return u1Var.m8693l(i10);
            }
            if (!u1Var.m8690i(i10)) {
                return u1Var.m8693l(i10);
            }
        } else if ((i13 & 67108864) != 0) {
            int i15 = iArr[i12 + 3] + i10;
            int iM8582O = 0;
            for (int i16 = i10 + 1; i16 < i15; i16 += iArr[(i16 * 5) + 3]) {
                boolean zM8690i = u1Var.m8690i(i16);
                if (zM8690i) {
                    c4329b.m9059c();
                    Object objM8692k = u1Var.m8692k(i16);
                    c4329b.m9059c();
                    c4329b.f21798h.add(objM8692k);
                }
                iM8582O += m8582O(c3966o, i16, zM8690i || z6, zM8690i ? 0 : i11 + iM8582O);
                if (zM8690i) {
                    c4329b.m9059c();
                    c4329b.m9057a();
                }
            }
            if (!u1Var.m8690i(i10)) {
                return iM8582O;
            }
        } else if (!u1Var.m8690i(i10)) {
            return u1Var.m8693l(i10);
        }
        return 1;
    }

    /* renamed from: b */
    public static final void m8583b(C3966o c3966o, i1 i1Var, Object obj) {
        c3966o.m8605W(126665345, null);
        c3966o.m8588E();
        c3966o.k0(obj);
        int i10 = c3966o.f20462P;
        try {
            c3966o.f20462P = 126665345;
            if (c3966o.f20461O) {
                y1.m8712x(c3966o.f20454H);
            }
            boolean z6 = (c3966o.f20461O || AbstractC4154l.m8918a(c3966o.f20452F.m8686e(), i1Var)) ? false : true;
            if (z6) {
                c3966o.m8594K(i1Var);
            }
            c3966o.m8602T(AbstractC3967p.f20494c, 202, i1Var, 0);
            c3966o.f20456J = null;
            boolean z10 = c3966o.f20485v;
            c3966o.f20485v = z6;
            AbstractC6740i.m12901c(c3966o, new C6734c(new C1475f(11, obj), true, 316014703));
            c3966o.f20485v = z10;
            c3966o.m8623p(false);
            c3966o.f20456J = null;
            c3966o.f20462P = i10;
            c3966o.m8623p(false);
        } catch (Throwable th2) {
            c3966o.m8623p(false);
            c3966o.f20456J = null;
            c3966o.f20462P = i10;
            c3966o.m8623p(false);
            throw th2;
        }
    }

    /* renamed from: A */
    public final boolean m8584A() {
        if (!m8586C() || this.f20485v) {
            return true;
        }
        n1 n1VarM8633z = m8633z();
        return (n1VarM8633z == null || (n1VarM8633z.f20440a & 4) == 0) ? false : true;
    }

    /* renamed from: B */
    public final boolean m8585B() {
        return this.f20461O;
    }

    /* renamed from: C */
    public final boolean m8586C() {
        n1 n1VarM8633z;
        return (this.f20461O || this.f20487x || this.f20485v || (n1VarM8633z = m8633z()) == null || (n1VarM8633z.f20440a & 8) != 0) ? false : true;
    }

    /* renamed from: D */
    public final void m8587D(ArrayList arrayList) {
        C4328a c4328a = this.f20469f;
        C4329b c4329b = this.f20458L;
        C4328a c4328a2 = c4329b.f21792b;
        try {
            c4329b.f21792b = c4328a;
            c4328a.f21789a.m9066g(C4353z.f21846c);
            if (arrayList.size() <= 0) {
                c4329b.f21792b.f21789a.m9066g(C4341n.f21830c);
                c4329b.f21796f = 0;
            } else {
                C6361k c6361k = (C6361k) arrayList.get(0);
                v0 v0Var = (v0) c6361k.f30755a;
                v0Var.getClass();
                throw null;
            }
        } finally {
            c4329b.f21792b = c4328a2;
        }
    }

    /* renamed from: E */
    public final Object m8588E() {
        boolean z6 = this.f20461O;
        s0 s0Var = C3961j.f20408a;
        if (!z6) {
            Object objM8691j = this.f20452F.m8691j();
            if (!this.f20487x || (objM8691j instanceof C3963l)) {
                return objM8691j;
            }
        } else if (this.f20480q) {
            AbstractC3967p.m8636c("A call to createNode(), emitNode() or useNode() expected");
            return s0Var;
        }
        return s0Var;
    }

    /* renamed from: F */
    public final int m8589F(int i10) {
        int iM8695n = this.f20452F.m8695n(i10) + 1;
        int i11 = 0;
        while (iM8695n < i10) {
            if (!this.f20452F.m8689h(iM8695n)) {
                i11++;
            }
            iM8695n += x1.m8705a(iM8695n, this.f20452F.f20578b);
        }
        return i11;
    }

    /* renamed from: G */
    public final boolean m8590G(e1.j0 j0Var) {
        l2.j0 j0Var2 = this.f20468e.f21789a;
        if (!j0Var2.m9064e()) {
            AbstractC3967p.m8636c("Expected applyChanges() to have been called");
        }
        if (j0Var.f9002e <= 0 && this.f20481r.isEmpty()) {
            return false;
        }
        m8621n(j0Var, null);
        return j0Var2.m9065f();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8591H(k2.C3972u r9, k2.C3972u r10, java.lang.Integer r11, java.util.List r12, ex.InterfaceC2137a r13) {
        /*
            r8 = this;
            boolean r0 = r8.f20451E
            int r1 = r8.f20473j
            r2 = 1
            r8.f20451E = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.f20473j = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            qw.k r6 = (qw.C6361k) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.f30755a     // Catch: java.lang.Throwable -> L24
            k2.n1 r7 = (k2.n1) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.f30756b     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.e0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L62
        L26:
            r8.e0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L59
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L53
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L53
            if (r11 < 0) goto L53
            r9.f20572r = r10     // Catch: java.lang.Throwable -> L24
            r9.f20573s = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L4d
            r9.f20572r = r5     // Catch: java.lang.Throwable -> L24
            r9.f20573s = r2     // Catch: java.lang.Throwable -> L24
            goto L57
        L4d:
            r10 = move-exception
            r9.f20572r = r5     // Catch: java.lang.Throwable -> L24
            r9.f20573s = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L53:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L57:
            if (r10 != 0) goto L5d
        L59:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L5d:
            r8.f20451E = r0
            r8.f20473j = r1
            return r10
        L62:
            r8.f20451E = r0
            r8.f20473j = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3966o.m8591H(k2.u, k2.u, java.lang.Integer, java.util.List, ex.a):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8592I() {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3966o.m8592I():void");
    }

    /* renamed from: J */
    public final void m8593J() {
        int i10;
        m8597N(this.f20452F.f20583g);
        C4329b c4329b = this.f20458L;
        c4329b.m9060d(false);
        l0 l0Var = c4329b.f21794d;
        C3966o c3966o = c4329b.f21791a;
        u1 u1Var = c3966o.f20452F;
        if (u1Var.f20579c > 0 && l0Var.m8547a(-2) != (i10 = u1Var.f20585i)) {
            if (!c4329b.f21793c && c4329b.f21795e) {
                c4329b.m9060d(false);
                c4329b.f21792b.f21789a.m9066g(C4344q.f21833c);
                c4329b.f21793c = true;
            }
            if (i10 > 0) {
                C3952a c3952aM8682a = u1Var.m8682a(i10);
                l0Var.m8549c(i10);
                c4329b.m9060d(false);
                l2.j0 j0Var = c4329b.f21792b.f21789a;
                j0Var.m9066g(C4343p.f21832c);
                sc.c0.m12976b(j0Var, 0, c3952aM8682a);
                c4329b.f21793c = true;
            }
        }
        c4329b.f21792b.f21789a.m9066g(C4351x.f21844c);
        int i11 = c4329b.f21796f;
        u1 u1Var2 = c3966o.f20452F;
        c4329b.f21796f = u1Var2.f20578b[(u1Var2.f20583g * 5) + 3] + i11;
    }

    /* renamed from: K */
    public final void m8594K(i1 i1Var) {
        C1922x c1922x = this.f20484u;
        if (c1922x == null) {
            c1922x = new C1922x();
            this.f20484u = c1922x;
        }
        c1922x.m5663h(this.f20452F.f20583g, i1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8595L(int r7, int r8, int r9) {
        /*
            r6 = this;
            k2.u1 r0 = r6.f20452F
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.m8695n(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.m8695n(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.m8695n(r7)
            int r2 = r0.m8695n(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.m8695n(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.m8695n(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.m8695n(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.m8695n(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.m8695n(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.m8695n(r9)
            int r1 = r0.m8695n(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.m8690i(r7)
            if (r1 == 0) goto L7a
            l2.b r1 = r6.f20458L
            r1.m9057a()
        L7a:
            int r7 = r0.m8695n(r7)
            goto L6b
        L7f:
            r6.m8622o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3966o.m8595L(int, int, int):void");
    }

    /* renamed from: M */
    public final Object m8596M() {
        boolean z6 = this.f20461O;
        s0 s0Var = C3961j.f20408a;
        if (!z6) {
            Object objM8691j = this.f20452F.m8691j();
            if (!this.f20487x || (objM8691j instanceof C3963l)) {
                return objM8691j instanceof s1 ? ((s1) objM8691j).f20549a : objM8691j;
            }
        } else if (this.f20480q) {
            AbstractC3967p.m8636c("A call to createNode(), emitNode() or useNode() expected");
            return s0Var;
        }
        return s0Var;
    }

    /* renamed from: N */
    public final void m8597N(int i10) {
        boolean zM8690i = this.f20452F.m8690i(i10);
        C4329b c4329b = this.f20458L;
        if (zM8690i) {
            c4329b.m9059c();
            Object objM8692k = this.f20452F.m8692k(i10);
            c4329b.m9059c();
            c4329b.f21798h.add(objM8692k);
        }
        m8582O(this, i10, zM8690i, 0);
        c4329b.m9059c();
        if (zM8690i) {
            c4329b.m9057a();
        }
    }

    /* renamed from: P */
    public final boolean m8598P(int i10, boolean z6) {
        return ((i10 & 1) == 0 && (this.f20461O || this.f20487x)) || z6 || !m8586C();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8599Q() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3966o.m8599Q():void");
    }

    /* renamed from: R */
    public final void m8600R() {
        u1 u1Var = this.f20452F;
        int i10 = u1Var.f20585i;
        this.f20474k = i10 >= 0 ? u1Var.f20578b[(i10 * 5) + 1] & 67108863 : 0;
        u1Var.m8698q();
    }

    /* renamed from: S */
    public final void m8601S() {
        if (this.f20474k != 0) {
            AbstractC3967p.m8636c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f20461O) {
            return;
        }
        n1 n1VarM8633z = m8633z();
        if (n1VarM8633z != null) {
            int i10 = n1VarM8633z.f20440a;
            if ((i10 & 128) == 0) {
                n1VarM8633z.f20440a = i10 | 16;
            }
        }
        if (this.f20481r.isEmpty()) {
            m8600R();
        } else {
            m8592I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8602T(java.lang.Object r29, int r30, java.lang.Object r31, int r32) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3966o.m8602T(java.lang.Object, int, java.lang.Object, int):void");
    }

    /* renamed from: U */
    public final void m8603U() {
        m8602T(null, -127, null, 0);
    }

    /* renamed from: V */
    public final void m8604V(int i10, y0 y0Var) {
        m8602T(y0Var, i10, null, 0);
    }

    /* renamed from: W */
    public final void m8605W(int i10, Object obj) {
        m8602T(obj, i10, null, 0);
    }

    /* renamed from: X */
    public final void m8606X(Object obj, boolean z6) {
        if (z6) {
            u1 u1Var = this.f20452F;
            if (u1Var.f20587k <= 0) {
                if ((u1Var.f20578b[(u1Var.f20583g * 5) + 1] & 1073741824) == 0) {
                    j1.m8542a("Expected a node group");
                }
                u1Var.m8699r();
                return;
            }
            return;
        }
        if (obj != null && this.f20452F.m8686e() != obj) {
            C4329b c4329b = this.f20458L;
            c4329b.getClass();
            c4329b.m9060d(false);
            l2.j0 j0Var = c4329b.f21792b.f21789a;
            j0Var.m9066g(l2.e0.f21810c);
            sc.c0.m12976b(j0Var, 0, obj);
        }
        this.f20452F.m8699r();
    }

    /* renamed from: Y */
    public final void m8607Y(int i10) {
        int i11;
        int i12;
        if (this.f20472i != null) {
            m8602T(null, i10, null, 0);
            return;
        }
        if (this.f20480q) {
            AbstractC3967p.m8636c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f20462P = this.f20475l ^ Integer.rotateLeft(Integer.rotateLeft(this.f20462P, 3) ^ i10, 3);
        this.f20475l++;
        u1 u1Var = this.f20452F;
        boolean z6 = this.f20461O;
        s0 s0Var = C3961j.f20408a;
        if (z6) {
            u1Var.f20587k++;
            this.f20454H.m8727O(i10, s0Var, s0Var, false);
            m8630w(false, null);
            return;
        }
        if (u1Var.m8687f() == i10 && ((i12 = u1Var.f20583g) >= u1Var.f20584h || (u1Var.f20578b[(i12 * 5) + 1] & 536870912) == 0)) {
            u1Var.m8699r();
            m8630w(false, null);
            return;
        }
        if (u1Var.f20587k <= 0 && (i11 = u1Var.f20583g) != u1Var.f20584h) {
            int i13 = this.f20473j;
            m8593J();
            this.f20458L.m9061e(i13, u1Var.m8697p());
            AbstractC3967p.m8634a(this.f20481r, i11, u1Var.f20583g);
        }
        u1Var.f20587k++;
        this.f20461O = true;
        this.f20456J = null;
        if (this.f20454H.f20632w) {
            y1 y1VarM8703q = this.f20453G.m8703q();
            this.f20454H = y1VarM8703q;
            y1VarM8703q.m8722J();
            this.f20455I = false;
            this.f20456J = null;
        }
        y1 y1Var = this.f20454H;
        y1Var.m8735d();
        int i14 = y1Var.f20629t;
        y1Var.m8727O(i10, s0Var, s0Var, false);
        this.f20459M = y1Var.m8733b(i14);
        m8630w(false, null);
    }

    /* renamed from: Z */
    public final void m8608Z(int i10) {
        m8602T(null, i10, null, 0);
    }

    /* renamed from: a */
    public final void m8609a() {
        m8617j();
        this.f20471h.clear();
        this.f20476m.f20420b = 0;
        this.f20482s.f20420b = 0;
        this.f20486w.f20420b = 0;
        this.f20484u = null;
        C4330c c4330c = this.f20460N;
        c4330c.f21805b.m9062c();
        c4330c.f21804a.m9062c();
        this.f20462P = 0;
        this.f20489z = 0;
        this.f20480q = false;
        this.f20461O = false;
        this.f20487x = false;
        this.f20451E = false;
        this.f20488y = -1;
        u1 u1Var = this.f20452F;
        if (!u1Var.f20582f) {
            u1Var.m8684c();
        }
        if (this.f20454H.f20632w) {
            return;
        }
        m8631x();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k2.C3966o a0(int r5) {
        /*
            r4 = this;
            r4.m8607Y(r5)
            boolean r5 = r4.f20461O
            java.util.ArrayList r0 = r4.f20450D
            k2.u r1 = r4.f20470g
            if (r5 == 0) goto L21
            k2.n1 r5 = new k2.n1
            r5.<init>(r1)
            r0.add(r5)
            r4.k0(r5)
            int r0 = r4.f20447A
            r5.f20444e = r0
            int r0 = r5.f20440a
            r0 = r0 & (-17)
            r5.f20440a = r0
            return r4
        L21:
            k2.u1 r5 = r4.f20452F
            int r5 = r5.f20585i
            java.util.ArrayList r2 = r4.f20481r
            int r5 = k2.AbstractC3967p.m8639f(r2, r5)
            if (r5 < 0) goto L34
            java.lang.Object r5 = r2.remove(r5)
            k2.m0 r5 = (k2.m0) r5
            goto L35
        L34:
            r5 = 0
        L35:
            k2.u1 r2 = r4.f20452F
            java.lang.Object r2 = r2.m8691j()
            k2.s0 r3 = k2.C3961j.f20408a
            boolean r3 = kotlin.jvm.internal.AbstractC4154l.m8918a(r2, r3)
            if (r3 == 0) goto L4c
            k2.n1 r2 = new k2.n1
            r2.<init>(r1)
            r4.k0(r2)
            goto L53
        L4c:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.AbstractC4154l.m8921d(r2, r1)
            k2.n1 r2 = (k2.n1) r2
        L53:
            r1 = 0
            if (r5 != 0) goto L6f
            int r5 = r2.f20440a
            r3 = r5 & 64
            if (r3 == 0) goto L5e
            r3 = 1
            goto L5f
        L5e:
            r3 = r1
        L5f:
            if (r3 == 0) goto L65
            r5 = r5 & (-65)
            r2.f20440a = r5
        L65:
            if (r3 == 0) goto L68
            goto L6f
        L68:
            int r5 = r2.f20440a
            r5 = r5 & (-9)
            r2.f20440a = r5
            goto L75
        L6f:
            int r5 = r2.f20440a
            r5 = r5 | 8
            r2.f20440a = r5
        L75:
            r0.add(r2)
            int r5 = r4.f20447A
            r2.f20444e = r5
            int r5 = r2.f20440a
            r0 = r5 & (-17)
            r2.f20440a = r0
            r0 = r5 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L9a
            r5 = r5 & (-273(0xfffffffffffffeef, float:NaN))
            r5 = r5 | 512(0x200, float:7.17E-43)
            r2.f20440a = r5
            l2.b r5 = r4.f20458L
            l2.a r5 = r5.f21792b
            l2.j0 r5 = r5.f21789a
            l2.c0 r0 = l2.c0.f21806c
            r5.m9066g(r0)
            sc.c0.m12976b(r5, r1, r2)
        L9a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3966o.a0(int):k2.o");
    }

    public final void b0(Object obj) {
        if (!this.f20461O && this.f20452F.m8687f() == 207 && !AbstractC4154l.m8918a(this.f20452F.m8686e(), obj) && this.f20488y < 0) {
            this.f20488y = this.f20452F.f20583g;
            this.f20487x = true;
        }
        m8602T(null, 207, obj, 0);
    }

    /* renamed from: c */
    public final void m8610c(Object obj, InterfaceC2141e interfaceC2141e) {
        if (this.f20461O) {
            l2.j0 j0Var = this.f20460N.f21804a;
            j0Var.m9066g(l2.f0.f21812c);
            sc.c0.m12976b(j0Var, 0, obj);
            AbstractC4154l.m8921d(interfaceC2141e, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            kotlin.jvm.internal.d0.m8907d(2, interfaceC2141e);
            sc.c0.m12976b(j0Var, 1, interfaceC2141e);
            return;
        }
        C4329b c4329b = this.f20458L;
        c4329b.m9058b();
        l2.j0 j0Var2 = c4329b.f21792b.f21789a;
        j0Var2.m9066g(l2.f0.f21812c);
        AbstractC4154l.m8921d(interfaceC2141e, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.internal.d0.m8907d(2, interfaceC2141e);
        sc.c0.m12977c(j0Var2, 0, obj, 1, interfaceC2141e);
    }

    public final void c0() {
        m8602T(null, 125, null, 2);
        this.f20480q = true;
    }

    /* renamed from: d */
    public final boolean m8611d(float f6) {
        Object objM8588E = m8588E();
        if ((objM8588E instanceof Float) && f6 == ((Number) objM8588E).floatValue()) {
            return false;
        }
        k0(Float.valueOf(f6));
        return true;
    }

    public final void d0() {
        this.f20475l = 0;
        this.f20452F = this.f20466c.m8702j();
        m8602T(null, 100, null, 0);
        AbstractC3969r abstractC3969r = this.f20465b;
        abstractC3969r.mo8569n();
        this.f20483t = abstractC3969r.mo8561f();
        this.f20486w.m8549c(this.f20485v ? 1 : 0);
        this.f20485v = m8614g(this.f20483t);
        this.f20456J = null;
        if (!this.f20479p) {
            this.f20479p = abstractC3969r.mo8559d();
        }
        if (!this.f20448B) {
            this.f20448B = abstractC3969r.mo8560e();
        }
        Set set = (Set) C3953b.m8518u(this.f20483t, AbstractC7628b.f36786a);
        if (set != null) {
            C3971t c3971t = this.f20463Q;
            if (c3971t == null) {
                c3971t = new C3971t(this.f20470g);
                this.f20463Q = c3971t;
            }
            set.add(c3971t);
            abstractC3969r.mo8566k(set);
        }
        m8602T(null, abstractC3969r.mo8562g(), null, 0);
    }

    /* renamed from: e */
    public final boolean m8612e(int i10) {
        Object objM8588E = m8588E();
        if ((objM8588E instanceof Integer) && i10 == ((Number) objM8588E).intValue()) {
            return false;
        }
        k0(Integer.valueOf(i10));
        return true;
    }

    public final boolean e0(n1 n1Var, Object obj) {
        C3952a c3952a = n1Var.f20442c;
        if (c3952a == null) {
            return false;
        }
        int iM8700b = this.f20452F.f20577a.m8700b(c3952a);
        if (!this.f20451E || iM8700b < this.f20452F.f20583g) {
            return false;
        }
        ArrayList arrayList = this.f20481r;
        int iM8639f = AbstractC3967p.m8639f(arrayList, iM8700b);
        if (iM8639f < 0) {
            int i10 = -(iM8639f + 1);
            if (!(obj instanceof c0)) {
                obj = null;
            }
            arrayList.add(i10, new m0(n1Var, iM8700b, obj));
            return true;
        }
        m0 m0Var = (m0) arrayList.get(iM8639f);
        if (!(obj instanceof c0)) {
            m0Var.f20431c = null;
            return true;
        }
        Object obj2 = m0Var.f20431c;
        if (obj2 == null) {
            m0Var.f20431c = obj;
            return true;
        }
        if (obj2 instanceof e1.k0) {
            ((e1.k0) obj2).m5581a(obj);
            return true;
        }
        int i11 = e1.t0.f9058a;
        e1.k0 k0Var = new e1.k0(2);
        k0Var.m5591k(obj2);
        k0Var.m5591k(obj);
        m0Var.f20431c = k0Var;
        return true;
    }

    /* renamed from: f */
    public final boolean m8613f(long j6) {
        Object objM8588E = m8588E();
        if ((objM8588E instanceof Long) && j6 == ((Number) objM8588E).longValue()) {
            return false;
        }
        k0(Long.valueOf(j6));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(e1.j0 r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.Object[] r1 = r0.f8999b
            java.lang.Object[] r2 = r0.f9000c
            long[] r0 = r0.f8998a
            int r3 = r0.length
            int r3 = r3 + (-2)
            r4 = r17
            java.util.ArrayList r5 = r4.f20481r
            if (r3 < 0) goto L63
            r7 = 0
        L12:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5e
            int r10 = r7 - r3
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L2c:
            if (r12 >= r10) goto L5c
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L58
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1[r13]
            r13 = r2[r13]
            java.lang.String r15 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.AbstractC4154l.m8921d(r14, r15)
            k2.n1 r14 = (k2.n1) r14
            k2.a r15 = r14.f20442c
            if (r15 == 0) goto L58
            int r15 = r15.f20343a
            k2.s0 r6 = k2.s0.f20546e
            if (r13 != r6) goto L50
            r13 = 0
        L50:
            k2.m0 r6 = new k2.m0
            r6.<init>(r14, r15, r13)
            r5.add(r6)
        L58:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2c
        L5c:
            if (r10 != r11) goto L63
        L5e:
            if (r7 == r3) goto L63
            int r7 = r7 + 1
            goto L12
        L63:
            cj.a r0 = k2.AbstractC3967p.f20497f
            rw.AbstractC6666p.m12771u(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3966o.f0(e1.j0):void");
    }

    /* renamed from: g */
    public final boolean m8614g(Object obj) {
        if (AbstractC4154l.m8918a(m8588E(), obj)) {
            return false;
        }
        k0(obj);
        return true;
    }

    public final void g0(int i10, int i11) {
        if (l0(i10) != i11) {
            if (i10 < 0) {
                C1920v c1920v = this.f20478o;
                if (c1920v == null) {
                    c1920v = new C1920v();
                    this.f20478o = c1920v;
                }
                c1920v.m5643f(i10, i11);
                return;
            }
            int[] iArr = this.f20477n;
            if (iArr == null) {
                int i12 = this.f20452F.f20579c;
                int[] iArr2 = new int[i12];
                Arrays.fill(iArr2, 0, i12, -1);
                this.f20477n = iArr2;
                iArr = iArr2;
            }
            iArr[i10] = i11;
        }
    }

    /* renamed from: h */
    public final boolean m8615h(boolean z6) {
        Object objM8588E = m8588E();
        if ((objM8588E instanceof Boolean) && z6 == ((Boolean) objM8588E).booleanValue()) {
            return false;
        }
        k0(Boolean.valueOf(z6));
        return true;
    }

    public final void h0(int i10, int i11) {
        int iL0 = l0(i10);
        if (iL0 != i11) {
            int i12 = i11 - iL0;
            ArrayList arrayList = this.f20471h;
            int size = arrayList.size() - 1;
            while (i10 != -1) {
                int iL02 = l0(i10) + i12;
                g0(i10, iL02);
                int i13 = size;
                while (true) {
                    if (-1 < i13) {
                        h1 h1Var = (h1) arrayList.get(i13);
                        if (h1Var != null && h1Var.m8537a(i10, iL02)) {
                            size = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.f20452F.f20585i;
                } else if (this.f20452F.m8690i(i10)) {
                    return;
                } else {
                    i10 = this.f20452F.m8695n(i10);
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean m8616i(Object obj) {
        if (m8588E() == obj) {
            return false;
        }
        k0(obj);
        return true;
    }

    public final C6738g i0(i1 i1Var, C6738g c6738g) {
        C6738g c6738g2 = (C6738g) i1Var;
        c6738g2.getClass();
        C6737f c6737f = new C6737f(c6738g2);
        c6737f.f32178g = c6738g2;
        c6737f.putAll(c6738g);
        C6738g c6738gM12892f = c6737f.build();
        m8604V(204, AbstractC3967p.f20495d);
        m8588E();
        k0(c6738gM12892f);
        m8588E();
        k0(c6738g);
        m8623p(false);
        return c6738gM12892f;
    }

    /* renamed from: j */
    public final void m8617j() {
        this.f20472i = null;
        this.f20473j = 0;
        this.f20474k = 0;
        this.f20462P = 0;
        this.f20480q = false;
        C4329b c4329b = this.f20458L;
        c4329b.f21793c = false;
        c4329b.f21794d.f20420b = 0;
        c4329b.f21796f = 0;
        this.f20450D.clear();
        this.f20477n = null;
        this.f20478o = null;
    }

    public final void j0(Object obj) {
        int i10;
        u1 u1Var;
        int i11;
        y1 y1Var;
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            C3952a c3952aM8682a = null;
            if (this.f20461O) {
                y1 y1Var2 = this.f20454H;
                int i12 = y1Var2.f20629t;
                if (i12 > y1Var2.f20631v + 1) {
                    int i13 = i12 - 1;
                    int iM8715C = y1Var2.m8715C(i13, y1Var2.f20611b);
                    while (true) {
                        i11 = i13;
                        i13 = iM8715C;
                        y1Var = this.f20454H;
                        if (i13 == y1Var.f20631v || i13 < 0) {
                            break;
                        } else {
                            iM8715C = y1Var.m8715C(i13, y1Var.f20611b);
                        }
                    }
                    c3952aM8682a = y1Var.m8733b(i11);
                }
            } else {
                u1 u1Var2 = this.f20452F;
                int i14 = u1Var2.f20583g;
                if (i14 > u1Var2.f20585i + 1) {
                    int i15 = i14 - 1;
                    int iM8695n = u1Var2.m8695n(i15);
                    while (true) {
                        i10 = i15;
                        i15 = iM8695n;
                        u1Var = this.f20452F;
                        if (i15 == u1Var.f20585i || i15 < 0) {
                            break;
                        } else {
                            iM8695n = u1Var.m8695n(i15);
                        }
                    }
                    c3952aM8682a = u1Var.m8682a(i10);
                }
            }
            s1 s1Var = new s1(r1Var, c3952aM8682a);
            if (this.f20461O) {
                l2.j0 j0Var = this.f20458L.f21792b.f21789a;
                j0Var.m9066g(C4350w.f21843c);
                sc.c0.m12976b(j0Var, 0, s1Var);
            }
            this.f20467d.add(obj);
            obj = s1Var;
        }
        k0(obj);
    }

    /* renamed from: k */
    public final Object m8618k(l1 l1Var) {
        return C3953b.m8518u(m8620m(), l1Var);
    }

    public final void k0(Object obj) {
        if (this.f20461O) {
            y1 y1Var = this.f20454H;
            if (y1Var.f20623n <= 0 || y1Var.f20618i == y1Var.f20620k) {
                y1Var.m8716D(obj);
                return;
            }
            C1922x c1922x = y1Var.f20628s;
            if (c1922x == null) {
                c1922x = new C1922x();
            }
            y1Var.f20628s = c1922x;
            int i10 = y1Var.f20631v;
            Object objM5595b = c1922x.m5595b(i10);
            if (objM5595b == null) {
                objM5595b = new e1.e0();
                c1922x.m5663h(i10, objM5595b);
            }
            ((e1.e0) objM5595b).m5543a(obj);
            return;
        }
        u1 u1Var = this.f20452F;
        boolean z6 = u1Var.f20590n;
        C4329b c4329b = this.f20458L;
        if (!z6) {
            C3952a c3952aM8682a = u1Var.m8682a(u1Var.f20585i);
            l2.j0 j0Var = c4329b.f21792b.f21789a;
            j0Var.m9066g(C4332e.f21809c);
            sc.c0.m12977c(j0Var, 0, c3952aM8682a, 1, obj);
            return;
        }
        int iM8707c = (u1Var.f20588l - x1.m8707c(u1Var.f20585i, u1Var.f20578b)) - 1;
        if (c4329b.f21791a.f20452F.f20585i - c4329b.f21796f >= 0) {
            c4329b.m9060d(true);
            l2.j0 j0Var2 = c4329b.f21792b.f21789a;
            j0Var2.m9066g(C4345r.f21837g);
            sc.c0.m12976b(j0Var2, 0, obj);
            j0Var2.f21823c[j0Var2.f21824d - j0Var2.f21821a[j0Var2.f21822b - 1].f21818a] = iM8707c;
            return;
        }
        u1 u1Var2 = this.f20452F;
        C3952a c3952aM8682a2 = u1Var2.m8682a(u1Var2.f20585i);
        l2.j0 j0Var3 = c4329b.f21792b.f21789a;
        j0Var3.m9066g(C4345r.f21836f);
        sc.c0.m12977c(j0Var3, 0, obj, 1, c3952aM8682a2);
        j0Var3.f21823c[j0Var3.f21824d - j0Var3.f21821a[j0Var3.f21822b - 1].f21818a] = iM8707c;
    }

    /* renamed from: l */
    public final void m8619l(InterfaceC2137a interfaceC2137a) {
        if (!this.f20480q) {
            AbstractC3967p.m8636c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f20480q = false;
        if (!this.f20461O) {
            AbstractC3967p.m8636c("createNode() can only be called when inserting");
        }
        l0 l0Var = this.f20476m;
        int i10 = l0Var.f20419a[l0Var.f20420b - 1];
        y1 y1Var = this.f20454H;
        C3952a c3952aM8733b = y1Var.m8733b(y1Var.f20631v);
        this.f20474k++;
        C4330c c4330c = this.f20460N;
        l2.j0 j0Var = c4330c.f21804a;
        j0Var.m9066g(C4345r.f21834d);
        sc.c0.m12976b(j0Var, 0, interfaceC2137a);
        j0Var.f21823c[j0Var.f21824d - j0Var.f21821a[j0Var.f21822b - 1].f21818a] = i10;
        sc.c0.m12976b(j0Var, 1, c3952aM8733b);
        l2.j0 j0Var2 = c4330c.f21805b;
        j0Var2.m9066g(C4345r.f21835e);
        j0Var2.f21823c[j0Var2.f21824d - j0Var2.f21821a[j0Var2.f21822b - 1].f21818a] = i10;
        sc.c0.m12976b(j0Var2, 0, c3952aM8733b);
    }

    public final int l0(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f20477n;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.f20452F.m8693l(i10) : i11;
        }
        C1920v c1920v = this.f20478o;
        if (c1920v == null || c1920v.m5640c(i10) < 0) {
            return 0;
        }
        int iM5640c = c1920v.m5640c(i10);
        if (iM5640c >= 0) {
            return c1920v.f9068c[iM5640c];
        }
        AbstractC2176a.m5864e("Cannot find value for key " + i10);
        throw null;
    }

    /* renamed from: m */
    public final i1 m8620m() {
        i1 i1Var;
        i1 i1Var2 = this.f20456J;
        if (i1Var2 != null) {
            return i1Var2;
        }
        int iM8695n = this.f20452F.f20585i;
        boolean z6 = this.f20461O;
        y0 y0Var = AbstractC3967p.f20494c;
        if (z6 && this.f20455I) {
            int iM8715C = this.f20454H.f20631v;
            while (iM8715C > 0) {
                y1 y1Var = this.f20454H;
                if (y1Var.f20611b[y1Var.m8747q(iM8715C) * 5] == 202 && AbstractC4154l.m8918a(this.f20454H.m8748r(iM8715C), y0Var)) {
                    Object objM8746p = this.f20454H.m8746p(iM8715C);
                    AbstractC4154l.m8921d(objM8746p, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    i1 i1Var3 = (i1) objM8746p;
                    this.f20456J = i1Var3;
                    return i1Var3;
                }
                y1 y1Var2 = this.f20454H;
                iM8715C = y1Var2.m8715C(iM8715C, y1Var2.f20611b);
            }
        }
        if (this.f20452F.f20579c > 0) {
            while (iM8695n > 0) {
                u1 u1Var = this.f20452F;
                int[] iArr = u1Var.f20578b;
                if (iArr[iM8695n * 5] == 202 && AbstractC4154l.m8918a(u1Var.m8694m(iM8695n, iArr), y0Var)) {
                    C1922x c1922x = this.f20484u;
                    if (c1922x == null || (i1Var = (i1) c1922x.m5595b(iM8695n)) == null) {
                        u1 u1Var2 = this.f20452F;
                        Object objM8683b = u1Var2.m8683b(iM8695n, u1Var2.f20578b);
                        AbstractC4154l.m8921d(objM8683b, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        i1Var = (i1) objM8683b;
                    }
                    this.f20456J = i1Var;
                    return i1Var;
                }
                iM8695n = this.f20452F.m8695n(iM8695n);
            }
        }
        i1 i1Var4 = this.f20483t;
        this.f20456J = i1Var4;
        return i1Var4;
    }

    public final void m0() {
        if (!this.f20480q) {
            AbstractC3967p.m8636c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f20480q = false;
        if (this.f20461O) {
            AbstractC3967p.m8636c("useNode() called while inserting");
        }
        u1 u1Var = this.f20452F;
        Object objM8692k = u1Var.m8692k(u1Var.f20585i);
        C4329b c4329b = this.f20458L;
        c4329b.m9059c();
        c4329b.f21798h.add(objM8692k);
        if (this.f20487x && (objM8692k instanceof InterfaceC3960i)) {
            c4329b.m9058b();
            c4329b.f21792b.f21789a.m9066g(l2.h0.f21816c);
        }
    }

    /* renamed from: n */
    public final void m8621n(e1.j0 j0Var, C6734c c6734c) {
        ArrayList arrayList = this.f20481r;
        if (this.f20451E) {
            AbstractC3967p.m8636c("Reentrant composition is not supported");
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.f20447A = Long.hashCode(AbstractC7316m.m13686k().mo13652g());
            this.f20484u = null;
            f0(j0Var);
            this.f20473j = 0;
            this.f20451E = true;
            try {
                d0();
                Object objM8588E = m8588E();
                if (objM8588E != c6734c && c6734c != null) {
                    k0(c6734c);
                }
                C3965n c3965n = this.f20449C;
                C4640e c4640eM8511n = C3953b.m8511n();
                try {
                    c4640eM8511n.m9506b(c3965n);
                    y0 y0Var = AbstractC3967p.f20492a;
                    if (c6734c != null) {
                        m8604V(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, y0Var);
                        AbstractC6740i.m12901c(this, c6734c);
                        m8623p(false);
                    } else if (!this.f20485v || objM8588E == null || objM8588E.equals(C3961j.f20408a)) {
                        m8599Q();
                    } else {
                        m8604V(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, y0Var);
                        kotlin.jvm.internal.d0.m8907d(2, objM8588E);
                        AbstractC6740i.m12901c(this, (InterfaceC2141e) objM8588E);
                        m8623p(false);
                    }
                    c4640eM8511n.m9515m(c4640eM8511n.f22886c - 1);
                    m8629v();
                    this.f20451E = false;
                    arrayList.clear();
                    if (!this.f20454H.f20632w) {
                        AbstractC3967p.m8636c("Check failed");
                    }
                    m8631x();
                } catch (Throwable th2) {
                    c4640eM8511n.m9515m(c4640eM8511n.f22886c - 1);
                    throw th2;
                }
            } catch (Throwable th3) {
                this.f20451E = false;
                arrayList.clear();
                m8609a();
                if (!this.f20454H.f20632w) {
                    AbstractC3967p.m8636c("Check failed");
                }
                m8631x();
                throw th3;
            }
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: o */
    public final void m8622o(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        m8622o(this.f20452F.m8695n(i10), i11);
        if (this.f20452F.m8690i(i10)) {
            Object objM8692k = this.f20452F.m8692k(i10);
            C4329b c4329b = this.f20458L;
            c4329b.m9059c();
            c4329b.f21798h.add(objM8692k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0519  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8623p(boolean r43) {
        /*
            Method dump skipped, instructions count: 1619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3966o.m8623p(boolean):void");
    }

    /* renamed from: q */
    public final void m8624q() {
        m8623p(false);
        n1 n1VarM8633z = m8633z();
        if (n1VarM8633z != null) {
            int i10 = n1VarM8633z.f20440a;
            if ((i10 & 1) != 0) {
                n1VarM8633z.f20440a = i10 | 2;
            }
        }
    }

    /* renamed from: r */
    public final void m8625r() {
        m8623p(true);
    }

    /* renamed from: s */
    public final void m8626s() {
        m8623p(false);
    }

    /* renamed from: t */
    public final void m8627t() {
        m8623p(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c A[EDGE_INSN: B:57:0x007c->B:28:0x007c BREAK  A[LOOP:0: B:15:0x0037->B:27:0x0079], EDGE_INSN: B:58:0x007c->B:28:0x007c BREAK  A[LOOP:0: B:15:0x0037->B:27:0x0079]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k2.n1 m8628u() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3966o.m8628u():k2.n1");
    }

    /* renamed from: v */
    public final void m8629v() {
        m8623p(false);
        this.f20465b.mo8557b();
        m8623p(false);
        C4329b c4329b = this.f20458L;
        if (c4329b.f21793c) {
            c4329b.m9060d(false);
            c4329b.m9060d(false);
            c4329b.f21792b.f21789a.m9066g(C4340m.f21829c);
            c4329b.f21793c = false;
        }
        c4329b.m9058b();
        if (c4329b.f21794d.f20420b != 0) {
            AbstractC3967p.m8636c("Missed recording an endGroup()");
        }
        if (!this.f20471h.isEmpty()) {
            AbstractC3967p.m8636c("Start/end imbalance");
        }
        m8617j();
        this.f20452F.m8684c();
        this.f20485v = this.f20486w.m8548b() != 0;
    }

    /* renamed from: w */
    public final void m8630w(boolean z6, h1 h1Var) {
        this.f20471h.add(this.f20472i);
        this.f20472i = h1Var;
        int i10 = this.f20474k;
        l0 l0Var = this.f20476m;
        l0Var.m8549c(i10);
        l0Var.m8549c(this.f20475l);
        l0Var.m8549c(this.f20473j);
        if (z6) {
            this.f20473j = 0;
        }
        this.f20474k = 0;
        this.f20475l = 0;
    }

    /* renamed from: x */
    public final void m8631x() {
        v1 v1Var = new v1();
        if (this.f20448B) {
            v1Var.m8701h();
        }
        if (this.f20465b.mo8558c()) {
            v1Var.f20603l = new C1922x();
        }
        this.f20453G = v1Var;
        y1 y1VarM8703q = v1Var.m8703q();
        y1VarM8703q.m8736e(true);
        this.f20454H = y1VarM8703q;
    }

    /* renamed from: y */
    public final i1 m8632y() {
        return m8620m();
    }

    /* renamed from: z */
    public final n1 m8633z() {
        if (this.f20489z != 0) {
            return null;
        }
        ArrayList arrayList = this.f20450D;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (n1) arrayList.get(arrayList.size() - 1);
    }
}
