package i1;

import a2.C0036i;
import android.view.KeyEvent;
import d4.AbstractC1592t;
import d4.AbstractC1594v;
import d4.C1573a;
import d4.C1580h;
import d4.C1582j;
import d4.C1583k;
import d4.C1595w;
import d4.InterfaceC1596x;
import e1.AbstractC1913o;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import lx.InterfaceC4574m;
import m1.C4626h;
import m1.C4627i;
import m1.C4631m;
import m1.C4633o;
import m1.InterfaceC4630l;
import n3.InterfaceC4950d;
import og.ze;
import p3.C5812j;
import p3.EnumC5813k;
import p3.InterfaceC5822t;
import uw.InterfaceC7559c;
import v3.AbstractC7642n;
import v3.InterfaceC7641m;
import v3.a2;
import v3.u1;
import v3.w1;
import zt.C9069h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.e */
/* loaded from: classes.dex */
public abstract class AbstractC3126e extends AbstractC7642n implements u1, InterfaceC4950d, w1, a2 {

    /* renamed from: L */
    public static final j0 f16831L = new j0(3);

    /* renamed from: B */
    public p3.h0 f16832B;

    /* renamed from: C */
    public InterfaceC7641m f16833C;

    /* renamed from: D */
    public C4633o f16834D;

    /* renamed from: E */
    public C4626h f16835E;

    /* renamed from: F */
    public final e1.a0 f16836F;

    /* renamed from: G */
    public long f16837G;

    /* renamed from: H */
    public InterfaceC4630l f16838H;

    /* renamed from: I */
    public boolean f16839I;

    /* renamed from: K */
    public final j0 f16840K;

    /* renamed from: s */
    public InterfaceC4630l f16841s;

    /* renamed from: t */
    public u0 f16842t;

    /* renamed from: v */
    public String f16843v;

    /* renamed from: w */
    public C1580h f16844w;

    /* renamed from: x */
    public boolean f16845x;

    /* renamed from: y */
    public InterfaceC2137a f16846y;

    /* renamed from: z */
    public final f0 f16847z;

    public AbstractC3126e(InterfaceC4630l interfaceC4630l, u0 u0Var, boolean z6, String str, C1580h c1580h, InterfaceC2137a interfaceC2137a) {
        this.f16841s = interfaceC4630l;
        this.f16842t = u0Var;
        this.f16843v = str;
        this.f16844w = c1580h;
        this.f16845x = z6;
        this.f16846y = interfaceC2137a;
        boolean z10 = false;
        this.f16847z = new f0(interfaceC4630l, 0, new C9069h(1, this, AbstractC3126e.class, "onFocusChange", "onFocusChange(Z)V", 0, 1));
        int i10 = AbstractC1913o.f9032a;
        this.f16836F = new e1.a0(6);
        this.f16837G = 0L;
        InterfaceC4630l interfaceC4630l2 = this.f16841s;
        this.f16838H = interfaceC4630l2;
        if (interfaceC4630l2 == null && this.f16842t != null) {
            z10 = true;
        }
        this.f16839I = z10;
        this.f16840K = f16831L;
    }

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return false;
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
        if (!this.f16839I) {
            R0();
        }
        if (this.f16845x) {
            L0(this.f16847z);
        }
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
        Q0();
        if (this.f16838H == null) {
            this.f16841s = null;
        }
        InterfaceC7641m interfaceC7641m = this.f16833C;
        if (interfaceC7641m != null) {
            M0(interfaceC7641m);
        }
        this.f16833C = null;
    }

    public abstract Object P0(InterfaceC5822t interfaceC5822t, InterfaceC7559c interfaceC7559c);

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0() {
        /*
            r17 = this;
            r0 = r17
            m1.l r1 = r0.f16841s
            e1.a0 r2 = r0.f16836F
            if (r1 == 0) goto L6a
            m1.o r3 = r0.f16834D
            if (r3 == 0) goto L14
            m1.n r4 = new m1.n
            r4.<init>(r3)
            r1.mo9502b(r4)
        L14:
            m1.h r3 = r0.f16835E
            if (r3 == 0) goto L20
            m1.i r4 = new m1.i
            r4.<init>(r3)
            r1.mo9502b(r4)
        L20:
            java.lang.Object[] r3 = r2.f8926c
            long[] r4 = r2.f8924a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6a
            r6 = 0
            r7 = r6
        L2b:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L65
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L45:
            if (r12 >= r10) goto L63
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5f
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            m1.o r13 = (m1.C4633o) r13
            m1.n r14 = new m1.n
            r14.<init>(r13)
            r1.mo9502b(r14)
        L5f:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L45
        L63:
            if (r10 != r11) goto L6a
        L65:
            if (r7 == r5) goto L6a
            int r7 = r7 + 1
            goto L2b
        L6a:
            r1 = 0
            r0.f16834D = r1
            r0.f16835E = r1
            r2.m5517a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.AbstractC3126e.Q0():void");
    }

    public final void R0() {
        u0 u0Var;
        if (this.f16833C == null && (u0Var = this.f16842t) != null) {
            if (this.f16841s == null) {
                this.f16841s = new C4631m();
            }
            this.f16847z.Q0(this.f16841s);
            InterfaceC4630l interfaceC4630l = this.f16841s;
            AbstractC4154l.m8920c(interfaceC4630l);
            InterfaceC7641m interfaceC7641mMo6293b = u0Var.mo6293b(interfaceC4630l);
            L0(interfaceC7641mMo6293b);
            this.f16833C = interfaceC7641mMo6293b;
        }
    }

    @Override // v3.u1
    /* renamed from: S */
    public final void mo6316S(C5812j c5812j, EnumC5813k enumC5813k, long j6) {
        long jM11096b = ze.m11096b(j6);
        this.f16837G = (Float.floatToRawIntBits((int) (jM11096b & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (jM11096b >> 32)) << 32);
        R0();
        int i10 = 1;
        InterfaceC7559c interfaceC7559c = null;
        if (this.f16845x && enumC5813k == EnumC5813k.Main) {
            int i11 = c5812j.f28470d;
            if (i11 == 4) {
                tx.c0.m13502y(z0(), null, null, new C3125d(this, interfaceC7559c, 0), 3);
            } else if (i11 == 5) {
                tx.c0.m13502y(z0(), null, null, new C3125d(this, interfaceC7559c, i10), 3);
            }
        }
        if (this.f16832B == null) {
            b2.a1 a1Var = new b2.a1(i10, this);
            C5812j c5812j2 = p3.b0.f28413a;
            p3.h0 h0Var = new p3.h0(null, null, a1Var);
            L0(h0Var);
            this.f16832B = h0Var;
        }
        p3.h0 h0Var2 = this.f16832B;
        if (h0Var2 != null) {
            h0Var2.mo6316S(c5812j, enumC5813k, j6);
        }
    }

    public abstract boolean T0(KeyEvent keyEvent);

    public abstract void U0(KeyEvent keyEvent);

    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V0(m1.InterfaceC4630l r4, i1.u0 r5, boolean r6, java.lang.String r7, d4.C1580h r8, ex.InterfaceC2137a r9) {
        /*
            r3 = this;
            m1.l r0 = r3.f16838H
            boolean r0 = kotlin.jvm.internal.AbstractC4154l.m8918a(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.Q0()
            r3.f16838H = r4
            r3.f16841s = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            i1.u0 r0 = r3.f16842t
            boolean r0 = kotlin.jvm.internal.AbstractC4154l.m8918a(r0, r5)
            if (r0 != 0) goto L1f
            r3.f16842t = r5
            r4 = r1
        L1f:
            boolean r5 = r3.f16845x
            i1.f0 r0 = r3.f16847z
            if (r5 == r6) goto L36
            if (r6 == 0) goto L2b
            r3.L0(r0)
            goto L31
        L2b:
            r3.M0(r0)
            r3.Q0()
        L31:
            v3.AbstractC7634f.m14554o(r3)
            r3.f16845x = r6
        L36:
            java.lang.String r5 = r3.f16843v
            boolean r5 = kotlin.jvm.internal.AbstractC4154l.m8918a(r5, r7)
            if (r5 != 0) goto L43
            r3.f16843v = r7
            v3.AbstractC7634f.m14554o(r3)
        L43:
            d4.h r5 = r3.f16844w
            boolean r5 = kotlin.jvm.internal.AbstractC4154l.m8918a(r5, r8)
            if (r5 != 0) goto L50
            r3.f16844w = r8
            v3.AbstractC7634f.m14554o(r3)
        L50:
            r3.f16846y = r9
            boolean r5 = r3.f16839I
            m1.l r6 = r3.f16838H
            if (r6 != 0) goto L5e
            i1.u0 r7 = r3.f16842t
            if (r7 == 0) goto L5e
            r7 = r1
            goto L5f
        L5e:
            r7 = r2
        L5f:
            if (r5 == r7) goto L71
            if (r6 != 0) goto L68
            i1.u0 r5 = r3.f16842t
            if (r5 == 0) goto L68
            r2 = r1
        L68:
            r3.f16839I = r2
            if (r2 != 0) goto L71
            v3.m r5 = r3.f16833C
            if (r5 != 0) goto L71
            goto L72
        L71:
            r1 = r4
        L72:
            if (r1 == 0) goto L87
            v3.m r4 = r3.f16833C
            if (r4 != 0) goto L7c
            boolean r5 = r3.f16839I
            if (r5 != 0) goto L87
        L7c:
            if (r4 == 0) goto L81
            r3.M0(r4)
        L81:
            r4 = 0
            r3.f16833C = r4
            r3.R0()
        L87:
            m1.l r4 = r3.f16841s
            r0.Q0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.AbstractC3126e.V0(m1.l, i1.u0, boolean, java.lang.String, d4.h, ex.a):void");
    }

    @Override // n3.InterfaceC4950d
    /* renamed from: f */
    public final boolean mo7491f(KeyEvent keyEvent) {
        return false;
    }

    @Override // v3.a2
    /* renamed from: h */
    public final Object mo7492h() {
        return this.f16840K;
    }

    @Override // v3.w1
    public final boolean q0() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[RETURN] */
    @Override // n3.InterfaceC4950d
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo7493t(android.view.KeyEvent r11) {
        /*
            r10 = this;
            r10.R0()
            long r0 = n3.AbstractC4949c.m9891c(r11)
            boolean r2 = r10.f16845x
            r3 = 3
            r4 = 0
            e1.a0 r5 = r10.f16836F
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4b
            int r2 = n3.AbstractC4949c.m9892d(r11)
            r8 = 2
            if (r2 != r8) goto L4b
            boolean r2 = androidx.compose.foundation.AbstractC0237a.m642j(r11)
            if (r2 == 0) goto L4b
            boolean r2 = r5.m5518b(r0)
            if (r2 != 0) goto L41
            m1.o r2 = new m1.o
            long r8 = r10.f16837G
            r2.<init>(r8)
            r5.m5523g(r0, r2)
            m1.l r0 = r10.f16841s
            if (r0 == 0) goto L3f
            tx.z r0 = r10.z0()
            i1.c r1 = new i1.c
            r5 = 1
            r1.<init>(r10, r2, r4, r5)
            tx.c0.m13502y(r0, r4, r4, r1, r3)
        L3f:
            r0 = r6
            goto L42
        L41:
            r0 = r7
        L42:
            boolean r11 = r10.T0(r11)
            if (r11 != 0) goto L79
            if (r0 == 0) goto L7a
            goto L79
        L4b:
            boolean r2 = r10.f16845x
            if (r2 == 0) goto L7a
            int r2 = n3.AbstractC4949c.m9892d(r11)
            if (r2 != r6) goto L7a
            boolean r2 = androidx.compose.foundation.AbstractC0237a.m642j(r11)
            if (r2 == 0) goto L7a
            java.lang.Object r0 = r5.m5522f(r0)
            m1.o r0 = (m1.C4633o) r0
            if (r0 == 0) goto L77
            m1.l r1 = r10.f16841s
            if (r1 == 0) goto L74
            tx.z r1 = r10.z0()
            i1.c r2 = new i1.c
            r5 = 2
            r2.<init>(r10, r0, r4, r5)
            tx.c0.m13502y(r1, r4, r4, r2, r3)
        L74:
            r10.U0(r11)
        L77:
            if (r0 == 0) goto L7a
        L79:
            return r6
        L7a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.AbstractC3126e.mo7493t(android.view.KeyEvent):boolean");
    }

    @Override // v3.w1
    public final void t0(InterfaceC1596x interfaceC1596x) {
        C1580h c1580h = this.f16844w;
        if (c1580h != null) {
            AbstractC1594v.m5230h(interfaceC1596x, c1580h.f7837a);
        }
        String str = this.f16843v;
        C0036i c0036i = new C0036i(15, this);
        InterfaceC4574m[] interfaceC4574mArr = AbstractC1594v.f7944a;
        C1595w c1595w = C1582j.f7843b;
        C1573a c1573a = new C1573a(str, c0036i);
        C1583k c1583k = (C1583k) interfaceC1596x;
        c1583k.m5202q(c1595w, c1573a);
        if (this.f16845x) {
            this.f16847z.t0(interfaceC1596x);
        } else {
            c1583k.m5202q(AbstractC1592t.f7925i, qw.a0.f30746a);
        }
        O0(interfaceC1596x);
    }

    @Override // v3.u1
    /* renamed from: x */
    public final void mo6317x() {
        C4626h c4626h;
        InterfaceC4630l interfaceC4630l = this.f16841s;
        if (interfaceC4630l != null && (c4626h = this.f16835E) != null) {
            interfaceC4630l.mo9502b(new C4627i(c4626h));
        }
        this.f16835E = null;
        p3.h0 h0Var = this.f16832B;
        if (h0Var != null) {
            h0Var.mo6317x();
        }
    }

    public void S0() {
    }

    public void O0(InterfaceC1596x interfaceC1596x) {
    }
}
