package t1;

import a1.C0007f;
import c3.C0847b;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2141e;
import i1.y0;
import java.util.List;
import k1.C3938m;
import k1.q1;
import k2.C3953b;
import k2.a1;
import k2.b1;
import k2.e1;
import k2.s0;
import k2.w0;
import m1.C4631m;
import n1.AbstractC4941a;
import pg.w9;
import q1.C6095w;
import rw.AbstractC6663m;
import s1.AbstractC6731z;
import s1.C6709d;
import s1.e0;
import s1.g0;
import s1.h0;
import s4.AbstractC6746b;
import s4.InterfaceC6747c;
import sq.m3;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t1.y */
/* loaded from: classes.dex */
public abstract class AbstractC7000y implements q1 {

    /* renamed from: A */
    public final e0 f33891A;

    /* renamed from: B */
    public final w0 f33892B;

    /* renamed from: C */
    public final w0 f33893C;

    /* renamed from: D */
    public final e1 f33894D;

    /* renamed from: E */
    public final e1 f33895E;

    /* renamed from: F */
    public final e1 f33896F;

    /* renamed from: G */
    public final e1 f33897G;

    /* renamed from: a */
    public boolean f33898a;

    /* renamed from: b */
    public C6993r f33899b;

    /* renamed from: c */
    public final e1 f33900c;

    /* renamed from: d */
    public final C0007f f33901d;

    /* renamed from: e */
    public int f33902e;

    /* renamed from: f */
    public int f33903f;

    /* renamed from: g */
    public long f33904g;

    /* renamed from: h */
    public long f33905h;

    /* renamed from: i */
    public float f33906i;

    /* renamed from: j */
    public float f33907j;

    /* renamed from: k */
    public final C3938m f33908k;

    /* renamed from: l */
    public final boolean f33909l;

    /* renamed from: m */
    public int f33910m;

    /* renamed from: n */
    public g0 f33911n;

    /* renamed from: o */
    public boolean f33912o;

    /* renamed from: p */
    public final e1 f33913p;

    /* renamed from: q */
    public InterfaceC6747c f33914q;

    /* renamed from: r */
    public final C4631m f33915r;

    /* renamed from: s */
    public final b1 f33916s;

    /* renamed from: t */
    public final b1 f33917t;

    /* renamed from: u */
    public final h0 f33918u;

    /* renamed from: v */
    public final l4.d0 f33919v;

    /* renamed from: w */
    public final C6709d f33920w;

    /* renamed from: x */
    public final e1 f33921x;

    /* renamed from: y */
    public final C6095w f33922y;

    /* renamed from: z */
    public long f33923z;

    public AbstractC7000y(float f6, int i10) {
        double d2 = f6;
        if (-0.5d > d2 || d2 > 0.5d) {
            AbstractC4941a.m9884a("currentPageOffsetFraction " + f6 + " is not within the range -0.5 to 0.5");
        }
        this.f33900c = C3953b.m8517t(new C0847b(0L));
        this.f33901d = new C0007f(i10, f6, this);
        this.f33902e = i10;
        this.f33904g = Long.MAX_VALUE;
        this.f33908k = new C3938m(new C6998w(this, 1));
        this.f33909l = true;
        this.f33910m = -1;
        this.f33913p = new e1(b0.f33757b, s0.f20544c);
        this.f33914q = b0.f33758c;
        this.f33915r = new C4631m();
        this.f33916s = new b1(-1);
        this.f33917t = new b1(i10);
        s0 s0Var = s0.f20547f;
        C3953b.m8513p(new C6981f(this, 2), s0Var);
        C3953b.m8513p(new C6981f(this, 3), s0Var);
        this.f33918u = new h0(new C6998w(this, 0));
        this.f33919v = new l4.d0(15);
        this.f33920w = new C6709d();
        this.f33921x = C3953b.m8517t(null);
        this.f33922y = new C6095w(this, 2);
        this.f33923z = AbstractC6746b.m12924b(0, 0, 15);
        this.f33891A = new e0();
        this.f33892B = AbstractC6731z.m12883h();
        this.f33893C = AbstractC6731z.m12883h();
        Boolean bool = Boolean.FALSE;
        this.f33894D = C3953b.m8517t(bool);
        this.f33895E = C3953b.m8517t(bool);
        this.f33896F = C3953b.m8517t(bool);
        this.f33897G = C3953b.m8517t(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r9.mo7521b(r7, r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m13258r(t1.AbstractC7000y r6, i1.y0 r7, ex.InterfaceC2141e r8, uw.InterfaceC7559c r9) {
        /*
            boolean r0 = r9 instanceof t1.C6999x
            if (r0 == 0) goto L13
            r0 = r9
            t1.x r0 = (t1.C6999x) r0
            int r1 = r0.f33890f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33890f = r1
            goto L18
        L13:
            t1.x r0 = new t1.x
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f33888d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f33890f
            qw.a0 r3 = qw.a0.f30746a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            t1.y r6 = r0.f33885a
            og.od.m10798c(r9)
            goto L81
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            ww.i r6 = r0.f33887c
            r8 = r6
            ex.e r8 = (ex.InterfaceC2141e) r8
            i1.y0 r7 = r0.f33886b
            t1.y r6 = r0.f33885a
            og.od.m10798c(r9)
            goto L5e
        L43:
            og.od.m10798c(r9)
            r0.f33885a = r6
            r0.f33886b = r7
            r9 = r8
            ww.i r9 = (ww.AbstractC8199i) r9
            r0.f33887c = r9
            r0.f33890f = r5
            s1.d r9 = r6.f33920w
            java.lang.Object r9 = r9.m12844h(r0)
            if (r9 != r1) goto L5a
            goto L5b
        L5a:
            r9 = r3
        L5b:
            if (r9 != r1) goto L5e
            goto L80
        L5e:
            k1.m r9 = r6.f33908k
            boolean r9 = r9.mo7520a()
            if (r9 != 0) goto L6f
            int r9 = r6.m13263j()
            k2.b1 r2 = r6.f33917t
            r2.m8527g(r9)
        L6f:
            k1.m r9 = r6.f33908k
            r0.f33885a = r6
            r2 = 0
            r0.f33886b = r2
            r0.f33887c = r2
            r0.f33890f = r4
            java.lang.Object r7 = r9.mo7521b(r7, r8, r0)
            if (r7 != r1) goto L81
        L80:
            return r1
        L81:
            r7 = -1
            k2.b1 r6 = r6.f33916s
            r6.m8527g(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.AbstractC7000y.m13258r(t1.y, i1.y0, ex.e, uw.c):java.lang.Object");
    }

    /* renamed from: s */
    public static Object m13259s(AbstractC7000y abstractC7000y, int i10, AbstractC8199i abstractC8199i) {
        abstractC7000y.getClass();
        Object objMo7521b = abstractC7000y.mo7521b(y0.Default, new m3(abstractC7000y, i10, null, 3), abstractC8199i);
        return objMo7521b == EnumC7794a.COROUTINE_SUSPENDED ? objMo7521b : qw.a0.f30746a;
    }

    @Override // k1.q1
    /* renamed from: a */
    public final boolean mo7520a() {
        return this.f33908k.mo7520a();
    }

    @Override // k1.q1
    /* renamed from: b */
    public final Object mo7521b(y0 y0Var, InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        return m13258r(this, y0Var, interfaceC2141e, interfaceC7559c);
    }

    @Override // k1.q1
    /* renamed from: c */
    public final boolean mo7522c() {
        return ((Boolean) this.f33895E.getValue()).booleanValue();
    }

    @Override // k1.q1
    /* renamed from: d */
    public final boolean mo7523d() {
        return ((Boolean) this.f33894D.getValue()).booleanValue();
    }

    @Override // k1.q1
    /* renamed from: e */
    public final float mo7524e(float f6) {
        return this.f33908k.mo7524e(f6);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m13260f(int r13, h1.a1 r14, ww.AbstractC8193c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof t1.C6996u
            if (r0 == 0) goto L13
            r0 = r15
            t1.u r0 = (t1.C6996u) r0
            int r1 = r0.f33876f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33876f = r1
            goto L18
        L13:
            t1.u r0 = new t1.u
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f33874d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f33876f
            r3 = 0
            qw.a0 r4 = qw.a0.f30746a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L41
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            og.od.m10798c(r15)
            return r4
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            int r13 = r0.f33873c
            h1.a1 r14 = r0.f33872b
            t1.y r2 = r0.f33871a
            og.od.m10798c(r15)
            r7 = r2
        L3f:
            r10 = r14
            goto L77
        L41:
            og.od.m10798c(r15)
            int r15 = r12.m13263j()
            if (r13 != r15) goto L59
            a1.f r15 = r12.f33901d
            java.lang.Object r15 = r15.f39d
            k2.a1 r15 = (k2.a1) r15
            float r15 = r15.m8490f()
            int r15 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r15 != 0) goto L59
            goto Lbc
        L59:
            int r15 = r12.mo13252l()
            if (r15 != 0) goto L60
            goto Lbc
        L60:
            r0.f33871a = r12
            r0.f33872b = r14
            r0.f33873c = r13
            r0.f33876f = r6
            s1.d r15 = r12.f33920w
            java.lang.Object r15 = r15.m12844h(r0)
            if (r15 != r1) goto L71
            goto L72
        L71:
            r15 = r4
        L72:
            if (r15 != r1) goto L75
            goto Lbb
        L75:
            r7 = r12
            goto L3f
        L77:
            double r14 = (double) r3
            r8 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r2 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r2 > 0) goto L85
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r14 > 0) goto L85
            goto L9b
        L85:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "pageOffsetFraction "
            r14.<init>(r15)
            r14.append(r3)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            n1.AbstractC4941a.m9884a(r14)
        L9b:
            int r8 = r7.m13262i(r13)
            int r13 = r7.m13266n()
            float r13 = (float) r13
            float r9 = r3 * r13
            t1.v r6 = new t1.v
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = 0
            r0.f33871a = r13
            r0.f33872b = r13
            r0.f33876f = r5
            i1.y0 r13 = i1.y0.Default
            java.lang.Object r13 = r7.mo7521b(r13, r6, r0)
            if (r13 != r1) goto Lbc
        Lbb:
            return r1
        Lbc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.AbstractC7000y.m13260f(int, h1.a1, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x011d A[Catch: all -> 0x012d, TryCatch #0 {all -> 0x012d, blocks: (B:57:0x00ca, B:59:0x00dd, B:61:0x00e1, B:63:0x00ed, B:74:0x0127, B:69:0x011d, B:66:0x0105), top: B:87:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127 A[Catch: all -> 0x012d, TRY_LEAVE, TryCatch #0 {all -> 0x012d, blocks: (B:57:0x00ca, B:59:0x00dd, B:61:0x00e1, B:63:0x00ed, B:74:0x0127, B:69:0x011d, B:66:0x0105), top: B:87:0x00ca }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13261h(t1.C6993r r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.AbstractC7000y.m13261h(t1.r, boolean, boolean):void");
    }

    /* renamed from: i */
    public final int m13262i(int i10) {
        if (mo13252l() > 0) {
            return w9.m11912c(i10, 0, mo13252l() - 1);
        }
        return 0;
    }

    /* renamed from: j */
    public final int m13263j() {
        return ((b1) this.f33901d.f38c).m8526f();
    }

    /* renamed from: k */
    public final C6993r m13264k() {
        return (C6993r) this.f33913p.getValue();
    }

    /* renamed from: l */
    public abstract int mo13252l();

    /* renamed from: m */
    public final int m13265m() {
        return ((C6993r) this.f33913p.getValue()).f33852b;
    }

    /* renamed from: n */
    public final int m13266n() {
        return ((C6993r) this.f33913p.getValue()).f33853c + m13265m();
    }

    /* renamed from: o */
    public final long m13267o() {
        return ((C0847b) this.f33900c.getValue()).f5352a;
    }

    /* renamed from: p */
    public final boolean m13268p() {
        return ((int) Float.intBitsToFloat((int) (m13267o() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (m13267o() & 4294967295L))) == 0;
    }

    /* renamed from: q */
    public final void m13269q(float f6, C6993r c6993r) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        int i10 = c6993r.f33858h;
        List list = c6993r.f33851a;
        if (this.f33909l && !list.isEmpty()) {
            boolean z6 = f6 > DefinitionKt.NO_Float_VALUE;
            int i11 = z6 ? ((C6982g) AbstractC6663m.m12750N(list)).f33789a + i10 + 1 : (((C6982g) AbstractC6663m.m12742F(list)).f33789a - i10) - 1;
            if (i11 < 0 || i11 >= mo13252l()) {
                return;
            }
            if (i11 != this.f33910m) {
                if (this.f33912o != z6 && (g0Var3 = this.f33911n) != null) {
                    g0Var3.cancel();
                }
                this.f33912o = z6;
                this.f33910m = i11;
                this.f33911n = this.f33918u.m12849a(i11, this.f33923z);
            }
            if (z6) {
                if ((((C6982g) AbstractC6663m.m12750N(list)).f33800l + (c6993r.f33852b + c6993r.f33853c)) - c6993r.f33857g >= f6 || (g0Var2 = this.f33911n) == null) {
                    return;
                }
                g0Var2.mo12848a();
                return;
            }
            if (c6993r.f33856f - ((C6982g) AbstractC6663m.m12742F(list)).f33800l >= (-f6) || (g0Var = this.f33911n) == null) {
                return;
            }
            g0Var.mo12848a();
        }
    }

    /* renamed from: t */
    public final void m13270t(int i10, float f6, boolean z6) {
        C0007f c0007f = this.f33901d;
        ((b1) c0007f.f38c).m8527g(i10);
        ((s1.c0) c0007f.f41f).m12843b(i10);
        ((a1) c0007f.f39d).m8491g(f6);
        c0007f.f40e = null;
        if (!z6) {
            this.f33893C.setValue(qw.a0.f30746a);
            return;
        }
        v3.g0 g0Var = (v3.g0) this.f33921x.getValue();
        if (g0Var != null) {
            g0Var.m14600l();
        }
    }
}
