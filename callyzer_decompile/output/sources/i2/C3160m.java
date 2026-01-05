package i2;

import c3.C0847b;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import k2.a1;
import o3.C5284g;
import o3.InterfaceC5278a;
import og.a2;
import pg.w9;
import s4.InterfaceC6747c;
import tx.c0;
import v3.AbstractC7634f;
import v3.AbstractC7642n;
import v3.InterfaceC7640l;
import w3.k1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i2.m */
/* loaded from: classes.dex */
public final class C3160m extends AbstractC7642n implements InterfaceC7640l, InterfaceC5278a {

    /* renamed from: s */
    public boolean f17069s;

    /* renamed from: t */
    public InterfaceC2137a f17070t;

    /* renamed from: w */
    public InterfaceC3161n f17072w;

    /* renamed from: x */
    public float f17073x;

    /* renamed from: v */
    public boolean f17071v = true;

    /* renamed from: y */
    public final C5284g f17074y = new C5284g(this, null);

    /* renamed from: z */
    public final a1 f17075z = new a1(DefinitionKt.NO_Float_VALUE);

    /* renamed from: B */
    public final a1 f17068B = new a1(DefinitionKt.NO_Float_VALUE);

    public C3160m(boolean z6, InterfaceC2137a interfaceC2137a, InterfaceC3161n interfaceC3161n, float f6) {
        this.f17069s = z6;
        this.f17070t = interfaceC2137a;
        this.f17072w = interfaceC3161n;
        this.f17073x = f6;
    }

    @Override // o3.InterfaceC5278a
    /* renamed from: B */
    public final long mo6161B(int i10, long j6) {
        if (!((Boolean) ((C3163p) this.f17072w).f17078a.f15361d.getValue()).booleanValue() && this.f17071v && i10 == 1 && C0847b.m2274e(j6) < DefinitionKt.NO_Float_VALUE) {
            return Q0(j6);
        }
        return 0L;
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
        L0(this.f17074y);
        c0.m13502y(z0(), null, null, new C3157j(this, null, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O0(ww.AbstractC8193c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof i2.C3155h
            if (r0 == 0) goto L13
            r0 = r8
            i2.h r0 = (i2.C3155h) r0
            int r1 = r0.f17052d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17052d = r1
            goto L18
        L13:
            i2.h r0 = new i2.h
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f17050b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17052d
            qw.a0 r3 = qw.a0.f30746a
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            i2.m r0 = r0.f17049a
            og.od.m10798c(r8)
            goto L55
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            og.od.m10798c(r8)
            i2.n r8 = r7.f17072w
            r0.f17049a = r7
            r0.f17052d = r4
            i2.p r8 = (i2.C3163p) r8
            h1.c r8 = r8.f17078a
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r4 = 0
            r6 = 14
            java.lang.Object r8 = h1.C2772c.m6774c(r8, r2, r4, r0, r6)
            if (r8 != r1) goto L50
            goto L51
        L50:
            r8 = r3
        L51:
            if (r8 != r1) goto L54
            return r1
        L54:
            r0 = r7
        L55:
            k2.a1 r8 = r0.f17068B
            r8.m8491g(r5)
            k2.a1 r8 = r0.f17075z
            r8.m8491g(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.C3160m.O0(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P0(ww.AbstractC8193c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof i2.C3156i
            if (r0 == 0) goto L13
            r0 = r7
            i2.i r0 = (i2.C3156i) r0
            int r1 = r0.f17056d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17056d = r1
            goto L18
        L13:
            i2.i r0 = new i2.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f17054b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17056d
            qw.a0 r3 = qw.a0.f30746a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            i2.m r0 = r0.f17053a
            og.od.m10798c(r7)
            goto L56
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            og.od.m10798c(r7)
            i2.n r7 = r6.f17072w
            r0.f17053a = r6
            r0.f17056d = r4
            i2.p r7 = (i2.C3163p) r7
            h1.c r7 = r7.f17078a
            java.lang.Float r2 = new java.lang.Float
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r4)
            r4 = 0
            r5 = 14
            java.lang.Object r7 = h1.C2772c.m6774c(r7, r2, r4, r0, r5)
            if (r7 != r1) goto L51
            goto L52
        L51:
            r7 = r3
        L52:
            if (r7 != r1) goto L55
            return r1
        L55:
            r0 = r6
        L56:
            int r7 = r0.R0()
            float r7 = (float) r7
            k2.a1 r1 = r0.f17068B
            r1.m8491g(r7)
            int r7 = r0.R0()
            float r7 = (float) r7
            k2.a1 r0 = r0.f17075z
            r0.m8491g(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.C3160m.P0(ww.c):java.lang.Object");
    }

    public final long Q0(long j6) {
        float fM8490f;
        float fR0;
        if (this.f17069s) {
            fM8490f = 0.0f;
        } else {
            a1 a1Var = this.f17068B;
            float fM2274e = C0847b.m2274e(j6) + a1Var.m8490f();
            if (fM2274e < DefinitionKt.NO_Float_VALUE) {
                fM2274e = 0.0f;
            }
            fM8490f = fM2274e - a1Var.m8490f();
            a1Var.m8491g(fM2274e);
            if (a1Var.m8490f() * 0.5f <= R0()) {
                fR0 = a1Var.m8490f() * 0.5f;
            } else {
                float fM11911b = w9.m11911b(Math.abs((a1Var.m8490f() * 0.5f) / R0()) - 1.0f, DefinitionKt.NO_Float_VALUE, 2.0f);
                fR0 = R0() + (R0() * (fM11911b - (((float) Math.pow(fM11911b, 2)) / 4)));
            }
            this.f17075z.m8491g(fR0);
        }
        return a2.m10524a(DefinitionKt.NO_Float_VALUE, fM8490f);
    }

    public final int R0() {
        return ((InterfaceC6747c) AbstractC7634f.m14548i(this, k1.f37836h)).e0(this.f17073x);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S0(float r7, ww.AbstractC8193c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof i2.C3159l
            if (r0 == 0) goto L13
            r0 = r8
            i2.l r0 = (i2.C3159l) r0
            int r1 = r0.f17067e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17067e = r1
            goto L18
        L13:
            i2.l r0 = new i2.l
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f17065c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17067e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            float r7 = r0.f17064b
            i2.m r0 = r0.f17063a
            og.od.m10798c(r8)
            goto L80
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            float r7 = r0.f17064b
            i2.m r0 = r0.f17063a
            og.od.m10798c(r8)
            goto L6c
        L3f:
            og.od.m10798c(r8)
            boolean r8 = r6.f17069s
            if (r8 == 0) goto L4c
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r5)
            return r7
        L4c:
            k2.a1 r8 = r6.f17068B
            float r8 = r8.m8490f()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r2
            int r2 = r6.R0()
            float r2 = (float) r2
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L72
            r0.f17063a = r6
            r0.f17064b = r7
            r0.f17067e = r4
            java.lang.Object r8 = r6.P0(r0)
            if (r8 != r1) goto L6b
            goto L7e
        L6b:
            r0 = r6
        L6c:
            ex.a r8 = r0.f17070t
            r8.invoke()
            goto L80
        L72:
            r0.f17063a = r6
            r0.f17064b = r7
            r0.f17067e = r3
            java.lang.Object r8 = r6.O0(r0)
            if (r8 != r1) goto L7f
        L7e:
            return r1
        L7f:
            r0 = r6
        L80:
            k2.a1 r8 = r0.f17068B
            float r8 = r8.m8490f()
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L8c
        L8a:
            r7 = r5
            goto L91
        L8c:
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 >= 0) goto L91
            goto L8a
        L91:
            k2.a1 r8 = r0.f17068B
            r8.m8491g(r5)
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.C3160m.S0(float, ww.c):java.lang.Object");
    }

    @Override // o3.InterfaceC5278a
    public final long d0(int i10, long j6, long j10) {
        if (((Boolean) ((C3163p) this.f17072w).f17078a.f15361d.getValue()).booleanValue() || !this.f17071v || i10 != 1) {
            return 0L;
        }
        long jQ0 = Q0(j10);
        c0.m13502y(z0(), null, null, new C3157j(this, null, 1), 3);
        return jQ0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o3.InterfaceC5278a
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo6163v(long r5, uw.InterfaceC7559c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof i2.C3158k
            if (r0 == 0) goto L13
            r0 = r7
            i2.k r0 = (i2.C3158k) r0
            int r1 = r0.f17062c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17062c = r1
            goto L1a
        L13:
            i2.k r0 = new i2.k
            ww.c r7 = (ww.AbstractC8193c) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.f17060a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17062c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            og.od.m10798c(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r7)
            float r5 = s4.C6761q.m12960c(r5)
            r0.f17062c = r3
            java.lang.Object r7 = r4.S0(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            r6 = 0
            long r5 = og.bf.m10557a(r6, r5)
            s4.q r7 = new s4.q
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.C3160m.mo6163v(long, uw.c):java.lang.Object");
    }
}
