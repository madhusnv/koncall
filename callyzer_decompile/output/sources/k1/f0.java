package k1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import m1.C4619a;
import m1.C4620b;
import m1.InterfaceC4630l;
import p3.C5812j;
import p3.EnumC5813k;
import v3.AbstractC7642n;
import vx.C7806h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class f0 extends AbstractC7642n implements v3.u1 {

    /* renamed from: B */
    public p3.h0 f20081B;

    /* renamed from: s */
    public x0 f20082s;

    /* renamed from: t */
    public AbstractC4155m f20083t;

    /* renamed from: v */
    public boolean f20084v;

    /* renamed from: w */
    public InterfaceC4630l f20085w;

    /* renamed from: x */
    public C7806h f20086x;

    /* renamed from: y */
    public C4620b f20087y;

    /* renamed from: z */
    public boolean f20088z;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(InterfaceC2139c interfaceC2139c, boolean z6, InterfaceC4630l interfaceC4630l, x0 x0Var) {
        this.f20082s = x0Var;
        this.f20083t = (AbstractC4155m) interfaceC2139c;
        this.f20084v = z6;
        this.f20085w = interfaceC4630l;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O0(k1.f0 r5, ww.AbstractC8193c r6) {
        /*
            boolean r0 = r6 instanceof k1.b0
            if (r0 == 0) goto L13
            r0 = r6
            k1.b0 r0 = (k1.b0) r0
            int r1 = r0.f20025d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20025d = r1
            goto L18
        L13:
            k1.b0 r0 = new k1.b0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f20023b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20025d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            k1.f0 r5 = r0.f20022a
            og.od.m10798c(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            m1.b r6 = r5.f20087y
            if (r6 == 0) goto L4f
            m1.l r2 = r5.f20085w
            if (r2 == 0) goto L4c
            m1.a r4 = new m1.a
            r4.<init>(r6)
            r0.f20022a = r5
            r0.f20025d = r3
            java.lang.Object r6 = r2.mo9501a(r4, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r6 = 0
            r5.f20087y = r6
        L4f:
            r0 = 0
            r5.U0(r0)
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.f0.O0(k1.f0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P0(k1.f0 r6, k1.C3941p r7, ww.AbstractC8193c r8) {
        /*
            boolean r0 = r8 instanceof k1.c0
            if (r0 == 0) goto L13
            r0 = r8
            k1.c0 r0 = (k1.c0) r0
            int r1 = r0.f20037f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20037f = r1
            goto L18
        L13:
            k1.c0 r0 = new k1.c0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f20035d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20037f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            m1.b r6 = r0.f20034c
            k1.p r7 = r0.f20033b
            k1.f0 r0 = r0.f20032a
            og.od.m10798c(r8)
            goto L77
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            k1.p r7 = r0.f20033b
            k1.f0 r6 = r0.f20032a
            og.od.m10798c(r8)
            goto L5d
        L40:
            og.od.m10798c(r8)
            m1.b r8 = r6.f20087y
            if (r8 == 0) goto L5d
            m1.l r2 = r6.f20085w
            if (r2 == 0) goto L5d
            m1.a r5 = new m1.a
            r5.<init>(r8)
            r0.f20032a = r6
            r0.f20033b = r7
            r0.f20037f = r4
            java.lang.Object r8 = r2.mo9501a(r5, r0)
            if (r8 != r1) goto L5d
            goto L74
        L5d:
            m1.b r8 = new m1.b
            r8.<init>()
            m1.l r2 = r6.f20085w
            if (r2 == 0) goto L79
            r0.f20032a = r6
            r0.f20033b = r7
            r0.f20034c = r8
            r0.f20037f = r3
            java.lang.Object r0 = r2.mo9501a(r8, r0)
            if (r0 != r1) goto L75
        L74:
            return r1
        L75:
            r0 = r6
            r6 = r8
        L77:
            r8 = r6
            r6 = r0
        L79:
            r6.f20087y = r8
            long r7 = r7.f20201a
            r6.T0(r7)
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.f0.P0(k1.f0, k1.p, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q0(k1.f0 r5, k1.C3942q r6, ww.AbstractC8193c r7) {
        /*
            boolean r0 = r7 instanceof k1.d0
            if (r0 == 0) goto L13
            r0 = r7
            k1.d0 r0 = (k1.d0) r0
            int r1 = r0.f20057e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20057e = r1
            goto L18
        L13:
            k1.d0 r0 = new k1.d0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f20055c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20057e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            k1.q r6 = r0.f20054b
            k1.f0 r5 = r0.f20053a
            og.od.m10798c(r7)
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r7)
            m1.b r7 = r5.f20087y
            if (r7 == 0) goto L53
            m1.l r2 = r5.f20085w
            if (r2 == 0) goto L50
            m1.c r4 = new m1.c
            r4.<init>(r7)
            r0.f20053a = r5
            r0.f20054b = r6
            r0.f20057e = r3
            java.lang.Object r7 = r2.mo9501a(r4, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r7 = 0
            r5.f20087y = r7
        L53:
            long r6 = r6.f20214a
            r5.U0(r6)
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.f0.Q0(k1.f0, k1.q, ww.c):java.lang.Object");
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
        this.f20088z = false;
        R0();
    }

    public final void R0() {
        C4620b c4620b = this.f20087y;
        if (c4620b != null) {
            InterfaceC4630l interfaceC4630l = this.f20085w;
            if (interfaceC4630l != null) {
                interfaceC4630l.mo9502b(new C4619a(c4620b));
            }
            this.f20087y = null;
        }
    }

    @Override // v3.u1
    /* renamed from: S */
    public void mo6316S(C5812j c5812j, EnumC5813k enumC5813k, long j6) {
        if (this.f20084v && this.f20081B == null) {
            b2.a1 a1Var = new b2.a1(3, this);
            C5812j c5812j2 = p3.b0.f28413a;
            p3.h0 h0Var = new p3.h0(null, null, a1Var);
            L0(h0Var);
            this.f20081B = h0Var;
        }
        p3.h0 h0Var2 = this.f20081B;
        if (h0Var2 != null) {
            h0Var2.mo6316S(c5812j, enumC5813k, j6);
        }
    }

    public abstract Object S0(e0 e0Var, e0 e0Var2);

    public abstract void T0(long j6);

    public abstract void U0(long j6);

    public abstract boolean V0();

    /* JADX WARN: Multi-variable type inference failed */
    public final void W0(InterfaceC2139c interfaceC2139c, boolean z6, InterfaceC4630l interfaceC4630l, x0 x0Var, boolean z10) {
        p3.h0 h0Var;
        this.f20083t = (AbstractC4155m) interfaceC2139c;
        boolean z11 = true;
        if (this.f20084v != z6) {
            this.f20084v = z6;
            if (!z6) {
                R0();
                p3.h0 h0Var2 = this.f20081B;
                if (h0Var2 != null) {
                    M0(h0Var2);
                }
                this.f20081B = null;
            }
            z10 = true;
        }
        if (!AbstractC4154l.m8918a(this.f20085w, interfaceC4630l)) {
            R0();
            this.f20085w = interfaceC4630l;
        }
        if (this.f20082s != x0Var) {
            this.f20082s = x0Var;
        } else {
            z11 = z10;
        }
        if (!z11 || (h0Var = this.f20081B) == null) {
            return;
        }
        h0Var.N0();
    }

    @Override // v3.u1
    /* renamed from: x */
    public final void mo6317x() {
        p3.h0 h0Var = this.f20081B;
        if (h0Var != null) {
            h0Var.mo6317x();
        }
    }
}
