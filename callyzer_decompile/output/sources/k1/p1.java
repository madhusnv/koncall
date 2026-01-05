package k1;

import a2.C0036i;
import a3.C0045d;
import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.AbstractC0241a;
import c3.C0847b;
import com.skydoves.balloon.internals.DefinitionKt;
import cp.C1475f;
import d4.AbstractC1594v;
import d4.C1573a;
import d4.C1582j;
import d4.C1583k;
import d4.InterfaceC1596x;
import gs.C2715a;
import h1.C2790u;
import hp.C2995b;
import i1.AbstractC3131j;
import i1.C3128g;
import kotlin.jvm.internal.AbstractC4154l;
import lx.InterfaceC4574m;
import m1.InterfaceC4630l;
import n3.AbstractC4947a;
import n3.AbstractC4949c;
import n3.InterfaceC4950d;
import o3.C5281d;
import o3.C5284g;
import p3.C5812j;
import p3.C5819q;
import p3.EnumC5813k;
import rw.AbstractC6663m;
import s4.InterfaceC6747c;
import tx.InterfaceC7266z;
import u1.C7303e;
import uw.InterfaceC7559c;
import v3.AbstractC7634f;
import v3.InterfaceC7640l;
import vw.EnumC7794a;
import vx.C7806h;
import vx.C7812n;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p1 extends f0 implements InterfaceC4950d, v3.w1, InterfaceC7640l {

    /* renamed from: C */
    public C3128g f20203C;

    /* renamed from: D */
    public k0 f20204D;

    /* renamed from: E */
    public final C5281d f20205E;

    /* renamed from: F */
    public final e1 f20206F;

    /* renamed from: G */
    public final C3936k f20207G;

    /* renamed from: H */
    public final x1 f20208H;

    /* renamed from: I */
    public final k1 f20209I;

    /* renamed from: K */
    public final C3934i f20210K;

    /* renamed from: L */
    public C1475f f20211L;

    /* renamed from: M */
    public m1 f20212M;

    /* renamed from: N */
    public c0.d1 f20213N;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [k1.k0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, k1.p1, v3.n] */
    public p1(C3128g c3128g, InterfaceC3928c interfaceC3928c, k0 k0Var, x0 x0Var, q1 q1Var, InterfaceC4630l interfaceC4630l, boolean z6, boolean z10) {
        super(C3929d.f20050f, z6, interfaceC4630l, x0Var);
        this.f20203C = c3128g;
        this.f20204D = k0Var;
        C5281d c5281d = new C5281d();
        this.f20205E = c5281d;
        e1 e1Var = new e1();
        e1Var.f20073q = z6;
        L0(e1Var);
        this.f20206F = e1Var;
        C3936k c3936k = new C3936k(new C2790u(new C8989c(AbstractC0241a.f1939c)));
        this.f20207G = c3936k;
        C3128g c3128g2 = this.f20203C;
        ?? r12 = this.f20204D;
        x1 x1Var = new x1(q1Var, c3128g2, r12 == 0 ? c3936k : r12, x0Var, z10, c5281d, new C0036i(22, this));
        this.f20208H = x1Var;
        k1 k1Var = new k1(x1Var, z6);
        this.f20209I = k1Var;
        C3934i c3934i = new C3934i(x0Var, x1Var, z10, interfaceC3928c);
        L0(c3934i);
        this.f20210K = c3934i;
        L0(new C5284g(k1Var, c5281d));
        L0(new b3.e0(2, 4, null));
        C7303e c7303e = new C7303e();
        c7303e.f34833q = c3934i;
        L0(c7303e);
        C0045d c0045d = new C0045d(18, (Object) this);
        i1.g0 g0Var = new i1.g0();
        g0Var.f16873q = c0045d;
        L0(g0Var);
    }

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return false;
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
        if (this.f37683p) {
            InterfaceC6747c interfaceC6747c = AbstractC7634f.m14563x(this).f36825C;
            C3936k c3936k = this.f20207G;
            c3936k.getClass();
            c3936k.f20152a = new C2790u(new C8989c(interfaceC6747c));
        }
        c0.d1 d1Var = this.f20213N;
        if (d1Var != null) {
            d1Var.f5070e = AbstractC7634f.m14563x(this).f36825C;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v14, types: [ex.c, kotlin.jvm.internal.m] */
    @Override // k1.f0, v3.u1
    /* renamed from: S */
    public final void mo6316S(C5812j c5812j, EnumC5813k enumC5813k, long j6) {
        long j10;
        ?? r02 = c5812j.f28467a;
        int size = r02.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((Boolean) this.f20083t.invoke((C5819q) r02.get(i10))).booleanValue()) {
                super.mo6316S(c5812j, enumC5813k, j6);
                break;
            }
            i10++;
        }
        if (this.f20084v) {
            if (enumC5813k == EnumC5813k.Initial && c5812j.f28470d == 6) {
                if (this.f20213N == null) {
                    this.f20213N = new c0.d1(this.f20208H, new C8989c(26, ViewConfiguration.get(AbstractC7634f.m14565z(this).getContext())), new l1(2, this, p1.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 0), AbstractC7634f.m14563x(this).f36825C);
                }
                c0.d1 d1Var = this.f20213N;
                if (d1Var != null) {
                    InterfaceC7266z interfaceC7266zZ0 = z0();
                    if (((tx.s1) d1Var.f5072g) == null) {
                        d1Var.f5072g = tx.c0.m13502y(interfaceC7266zZ0, null, null, new C2715a(d1Var, (InterfaceC7559c) null, 17), 3);
                    }
                }
            }
            c0.d1 d1Var2 = this.f20213N;
            if (d1Var2 == null || enumC5813k != EnumC5813k.Main) {
                return;
            }
            int i11 = c5812j.f28470d;
            ?? r32 = c5812j.f28467a;
            if (i11 == 6) {
                int size2 = r32.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    if (((C5819q) r32.get(i12)).m11406b()) {
                        return;
                    }
                }
                C8989c c8989c = (C8989c) d1Var2.f5068c;
                InterfaceC6747c interfaceC6747c = (InterfaceC6747c) d1Var2.f5070e;
                ViewConfiguration viewConfiguration = (ViewConfiguration) c8989c.f43339b;
                int i13 = Build.VERSION.SDK_INT;
                float f6 = -(i13 > 26 ? m2.m8468b(viewConfiguration) : interfaceC6747c.mo8435T(64));
                float f10 = -(i13 > 26 ? m2.m8467a(viewConfiguration) : interfaceC6747c.mo8435T(64));
                C0847b c0847b = new C0847b(0L);
                int size3 = r32.size();
                int i14 = 0;
                while (true) {
                    j10 = c0847b.f5352a;
                    if (i14 >= size3) {
                        break;
                    }
                    c0847b = new C0847b(C0847b.m2276g(j10, ((C5819q) r32.get(i14)).f28485j));
                    i14++;
                }
                long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) * f10) << 32) | (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) * f6));
                x1 x1Var = (x1) d1Var2.f5067b;
                float fM8480f = x1Var.m8480f(x1Var.m8478d(jFloatToRawIntBits));
                if ((fM8480f > DefinitionKt.NO_Float_VALUE ? 1 : (fM8480f == DefinitionKt.NO_Float_VALUE ? 0 : -1)) == 0 ? false : (fM8480f > DefinitionKt.NO_Float_VALUE ? 1 : (fM8480f == DefinitionKt.NO_Float_VALUE ? 0 : -1)) > 0 ? x1Var.f20309a.mo7523d() : x1Var.f20309a.mo7522c() ? !(((C7806h) d1Var2.f5071f).mo14776i(new s0(jFloatToRawIntBits, ((C5819q) AbstractC6663m.m12742F(r32)).f28477b, false)) instanceof C7812n) : d1Var2.f5066a) {
                    int size4 = r32.size();
                    for (int i15 = 0; i15 < size4; i15++) {
                        ((C5819q) r32.get(i15)).m11405a();
                    }
                }
            }
        }
    }

    @Override // k1.f0
    public final Object S0(e0 e0Var, e0 e0Var2) {
        i1.y0 y0Var = i1.y0.UserInput;
        x1 x1Var = this.f20208H;
        Object objM8479e = x1Var.m8479e(y0Var, new C2995b(e0Var, x1Var, (InterfaceC7559c) null, 11), e0Var2);
        return objM8479e == EnumC7794a.COROUTINE_SUSPENDED ? objM8479e : qw.a0.f30746a;
    }

    @Override // k1.f0
    public final void U0(long j6) {
        tx.c0.m13502y(this.f20205E.m10430c(), null, null, new m1(this, j6, null, 0), 3);
    }

    @Override // k1.f0
    public final boolean V0() {
        x1 x1Var = this.f20208H;
        if (x1Var.f20309a.mo7520a()) {
            return true;
        }
        C3128g c3128g = x1Var.f20310b;
        if (c3128g == null) {
            return false;
        }
        i1.d0 d0Var = c3128g.f16865c;
        EdgeEffect edgeEffect = d0Var.f16822d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC3131j.m7513c(edgeEffect) : 0.0f) != DefinitionKt.NO_Float_VALUE) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = d0Var.f16823e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC3131j.m7513c(edgeEffect2) : 0.0f) != DefinitionKt.NO_Float_VALUE) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = d0Var.f16824f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC3131j.m7513c(edgeEffect3) : 0.0f) != DefinitionKt.NO_Float_VALUE) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = d0Var.f16825g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? AbstractC3131j.m7513c(edgeEffect4) : 0.0f) != DefinitionKt.NO_Float_VALUE;
        }
        return false;
    }

    public final void X0(C3128g c3128g, InterfaceC3928c interfaceC3928c, k0 k0Var, x0 x0Var, q1 q1Var, InterfaceC4630l interfaceC4630l, boolean z6, boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = false;
        if (this.f20084v != z6) {
            this.f20209I.f20155b = z6;
            this.f20206F.f20073q = z6;
            z11 = true;
        } else {
            z11 = false;
        }
        k0 k0Var2 = k0Var == null ? this.f20207G : k0Var;
        x1 x1Var = this.f20208H;
        if (!AbstractC4154l.m8918a(x1Var.f20309a, q1Var)) {
            x1Var.f20309a = q1Var;
            z13 = true;
        }
        x1Var.f20310b = c3128g;
        if (x1Var.f20312d != x0Var) {
            x1Var.f20312d = x0Var;
            z13 = true;
        }
        if (x1Var.f20313e != z10) {
            x1Var.f20313e = z10;
        } else {
            z12 = z13;
        }
        x1Var.f20311c = k0Var2;
        x1Var.f20314f = this.f20205E;
        C3934i c3934i = this.f20210K;
        c3934i.f20114q = x0Var;
        c3934i.f20116s = z10;
        c3934i.f20117t = interfaceC3928c;
        this.f20203C = c3128g;
        this.f20204D = k0Var;
        C3929d c3929d = C3929d.f20050f;
        x0 x0Var2 = x1Var.f20312d;
        x0 x0Var3 = x0.Vertical;
        if (x0Var2 != x0Var3) {
            x0Var3 = x0.Horizontal;
        }
        W0(c3929d, z6, interfaceC4630l, x0Var3, z12);
        if (z11) {
            this.f20211L = null;
            this.f20212M = null;
            AbstractC7634f.m14554o(this);
        }
    }

    @Override // v3.InterfaceC7641m
    /* renamed from: c */
    public final void mo153c() {
        mo6317x();
        if (this.f37683p) {
            InterfaceC6747c interfaceC6747c = AbstractC7634f.m14563x(this).f36825C;
            C3936k c3936k = this.f20207G;
            c3936k.getClass();
            c3936k.f20152a = new C2790u(new C8989c(interfaceC6747c));
        }
        c0.d1 d1Var = this.f20213N;
        if (d1Var != null) {
            d1Var.f5070e = AbstractC7634f.m14563x(this).f36825C;
        }
    }

    @Override // n3.InterfaceC4950d
    /* renamed from: f */
    public final boolean mo7491f(KeyEvent keyEvent) {
        return false;
    }

    @Override // n3.InterfaceC4950d
    /* renamed from: t */
    public final boolean mo7493t(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.f20084v) {
            return false;
        }
        if ((!AbstractC4947a.m9888a(AbstractC4949c.m9891c(keyEvent), AbstractC4947a.f24631m) && !AbstractC4947a.m9888a(og.k1.m10726a(keyEvent.getKeyCode()), AbstractC4947a.f24630l)) || AbstractC4949c.m9892d(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        x0 x0Var = this.f20208H.f20312d;
        x0 x0Var2 = x0.Vertical;
        C3934i c3934i = this.f20210K;
        if (x0Var == x0Var2) {
            int i10 = (int) (c3934i.f20122z & 4294967295L);
            float f6 = AbstractC4947a.m9888a(og.k1.m10726a(keyEvent.getKeyCode()), AbstractC4947a.f24630l) ? i10 : -i10;
            jFloatToRawIntBits = Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE);
            iFloatToRawIntBits = Float.floatToRawIntBits(f6);
        } else {
            int i11 = (int) (c3934i.f20122z >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(AbstractC4947a.m9888a(og.k1.m10726a(keyEvent.getKeyCode()), AbstractC4947a.f24630l) ? i11 : -i11);
            iFloatToRawIntBits = Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE);
        }
        tx.c0.m13502y(z0(), null, null, new m1(this, (jFloatToRawIntBits << 32) | (iFloatToRawIntBits & 4294967295L), null, 1), 3);
        return true;
    }

    @Override // v3.w1
    public final void t0(InterfaceC1596x interfaceC1596x) {
        if (this.f20084v && (this.f20211L == null || this.f20212M == null)) {
            this.f20211L = new C1475f(10, this);
            this.f20212M = new m1(this, null);
        }
        C1475f c1475f = this.f20211L;
        if (c1475f != null) {
            InterfaceC4574m[] interfaceC4574mArr = AbstractC1594v.f7944a;
            ((C1583k) interfaceC1596x).m5202q(C1582j.f7845d, new C1573a(null, c1475f));
        }
        m1 m1Var = this.f20212M;
        if (m1Var != null) {
            InterfaceC4574m[] interfaceC4574mArr2 = AbstractC1594v.f7944a;
            ((C1583k) interfaceC1596x).m5202q(C1582j.f7846e, m1Var);
        }
    }

    @Override // k1.f0
    public final void T0(long j6) {
    }
}
