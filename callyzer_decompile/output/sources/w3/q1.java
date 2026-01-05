package w3;

import a1.C0005d;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import c3.C0846a;
import c3.C0847b;
import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.AbstractC1550d;
import d3.AbstractC1558l;
import d3.C1555i;
import d3.C1565s;
import d3.InterfaceC1563q;
import d3.InterfaceC1570x;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import f2.C2193p;
import f3.C2195a;
import f3.C2196b;
import g3.C2474b;
import g3.InterfaceC2476d;
import kotlin.jvm.internal.AbstractC4154l;
import of.C5359n;
import og.ue;
import og.ze;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import s1.C6725t;
import s3.AbstractC6744a;
import s4.C6754j;
import s4.C6756l;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q1 implements v3.o1 {

    /* renamed from: a */
    public C2474b f37922a;

    /* renamed from: b */
    public final InterfaceC1570x f37923b;

    /* renamed from: c */
    public final C7904v f37924c;

    /* renamed from: d */
    public InterfaceC2141e f37925d;

    /* renamed from: e */
    public InterfaceC2137a f37926e;

    /* renamed from: f */
    public long f37927f;

    /* renamed from: g */
    public boolean f37928g;

    /* renamed from: j */
    public float[] f37930j;

    /* renamed from: k */
    public boolean f37931k;

    /* renamed from: p */
    public int f37935p;

    /* renamed from: r */
    public d3.h0 f37937r;

    /* renamed from: s */
    public boolean f37938s;

    /* renamed from: t */
    public boolean f37939t;

    /* renamed from: w */
    public boolean f37941w;

    /* renamed from: h */
    public final float[] f37929h = d3.b0.m5094a();

    /* renamed from: l */
    public InterfaceC6747c f37932l = ue.m10985a();

    /* renamed from: m */
    public EnumC6757m f37933m = EnumC6757m.Ltr;

    /* renamed from: n */
    public final C2196b f37934n = new C2196b();

    /* renamed from: q */
    public long f37936q = d3.p0.f7805b;

    /* renamed from: v */
    public boolean f37940v = true;

    /* renamed from: x */
    public final C6725t f37942x = new C6725t(12, this);

    public q1(C2474b c2474b, InterfaceC1570x interfaceC1570x, C7904v c7904v, InterfaceC2141e interfaceC2141e, InterfaceC2137a interfaceC2137a) {
        this.f37922a = c2474b;
        this.f37923b = interfaceC1570x;
        this.f37924c = c7904v;
        this.f37925d = interfaceC2141e;
        this.f37926e = interfaceC2137a;
        long j6 = Integer.MAX_VALUE;
        this.f37927f = (j6 & 4294967295L) | (j6 << 32);
    }

    @Override // v3.o1
    /* renamed from: a */
    public final void mo14645a(float[] fArr) {
        d3.b0.m5098e(fArr, m15000m());
    }

    @Override // v3.o1
    /* renamed from: b */
    public final boolean mo14646b(long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        C2474b c2474b = this.f37922a;
        if (c2474b.f13436w) {
            return m0.m14990q(c2474b.m6365d(), fIntBitsToFloat, fIntBitsToFloat2);
        }
        return true;
    }

    @Override // v3.o1
    /* renamed from: c */
    public final void mo14647c(InterfaceC2141e interfaceC2141e, InterfaceC2137a interfaceC2137a) {
        InterfaceC1570x interfaceC1570x = this.f37923b;
        if (interfaceC1570x == null) {
            throw p020v.a1.m14342v("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f37922a.f13432s) {
            AbstractC6744a.m12906a("layer should have been released before reuse");
        }
        this.f37922a = interfaceC1570x.mo5121b();
        this.f37928g = false;
        this.f37925d = interfaceC2141e;
        this.f37926e = interfaceC2137a;
        this.f37938s = false;
        this.f37939t = false;
        this.f37940v = true;
        d3.b0.m5097d(this.f37929h);
        float[] fArr = this.f37930j;
        if (fArr != null) {
            d3.b0.m5097d(fArr);
        }
        this.f37936q = d3.p0.f7805b;
        this.f37941w = false;
        long j6 = Integer.MAX_VALUE;
        this.f37927f = (j6 & 4294967295L) | (j6 << 32);
        this.f37937r = null;
        this.f37935p = 0;
    }

    @Override // v3.o1
    /* renamed from: d */
    public final void mo14648d(long j6) {
        if (C6756l.m12948a(j6, this.f37927f)) {
            return;
        }
        this.f37927f = j6;
        if (this.f37931k || this.f37928g) {
            return;
        }
        C7904v c7904v = this.f37924c;
        c7904v.invalidate();
        if (true != this.f37931k) {
            this.f37931k = true;
            c7904v.m15040w(this, true);
        }
    }

    @Override // v3.o1
    public final void destroy() {
        this.f37925d = null;
        this.f37926e = null;
        this.f37928g = true;
        boolean z6 = this.f37931k;
        C7904v c7904v = this.f37924c;
        if (z6) {
            this.f37931k = false;
            c7904v.m15040w(this, false);
        }
        InterfaceC1570x interfaceC1570x = this.f37923b;
        if (interfaceC1570x != null) {
            interfaceC1570x.mo5120a(this.f37922a);
            c7904v.m15024F(this);
        }
    }

    @Override // v3.o1
    /* renamed from: e */
    public final void mo14649e(float[] fArr) {
        float[] fArrM14999l = m14999l();
        if (fArrM14999l != null) {
            d3.b0.m5098e(fArr, fArrM14999l);
        }
    }

    @Override // v3.o1
    /* renamed from: f */
    public final void mo14650f(C0846a c0846a, boolean z6) {
        float[] fArrM14999l = z6 ? m14999l() : m15000m();
        if (this.f37940v) {
            return;
        }
        if (fArrM14999l != null) {
            d3.b0.m5096c(fArrM14999l, c0846a);
            return;
        }
        c0846a.f5348b = DefinitionKt.NO_Float_VALUE;
        c0846a.f5349c = DefinitionKt.NO_Float_VALUE;
        c0846a.f5350d = DefinitionKt.NO_Float_VALUE;
        c0846a.f5351e = DefinitionKt.NO_Float_VALUE;
    }

    @Override // v3.o1
    /* renamed from: g */
    public final void mo14651g(long j6) {
        C2474b c2474b = this.f37922a;
        if (!C6754j.m12940a(c2474b.f13433t, j6)) {
            c2474b.f13433t = j6;
            c2474b.f13414a.mo6395r((int) (j6 >> 32), (int) (j6 & 4294967295L), c2474b.f13434u);
        }
        int i10 = Build.VERSION.SDK_INT;
        C7904v c7904v = this.f37924c;
        if (i10 >= 26) {
            h3.m14957a(c7904v);
        } else {
            c7904v.invalidate();
        }
    }

    @Override // v3.o1
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo16698getUnderlyingMatrixsQKQjiQ() {
        return m15000m();
    }

    @Override // v3.o1
    /* renamed from: h */
    public final void mo14652h() {
        if (this.f37931k) {
            if (!d3.p0.m5180a(this.f37936q, d3.p0.f7805b) && !C6756l.m12948a(this.f37922a.f13434u, this.f37927f)) {
                C2474b c2474b = this.f37922a;
                float fM5181b = d3.p0.m5181b(this.f37936q) * ((int) (this.f37927f >> 32));
                float fM5182c = d3.p0.m5182c(this.f37936q) * ((int) (this.f37927f & 4294967295L));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fM5182c) & 4294967295L) | (Float.floatToRawIntBits(fM5181b) << 32);
                if (!C0847b.m2271b(c2474b.f13435v, jFloatToRawIntBits)) {
                    c2474b.f13435v = jFloatToRawIntBits;
                    c2474b.f13414a.mo6398u(jFloatToRawIntBits);
                }
            }
            C2474b c2474b2 = this.f37922a;
            InterfaceC6747c interfaceC6747c = this.f37932l;
            EnumC6757m enumC6757m = this.f37933m;
            long j6 = this.f37927f;
            long j10 = c2474b2.f13434u;
            InterfaceC2476d interfaceC2476d = c2474b2.f13414a;
            if (!C6756l.m12948a(j10, j6)) {
                c2474b2.f13434u = j6;
                long j11 = c2474b2.f13433t;
                interfaceC2476d.mo6395r((int) (j11 >> 32), (int) (4294967295L & j11), j6);
                if (c2474b2.f13422i == 9205357640488583168L) {
                    c2474b2.f13420g = true;
                    c2474b2.m6362a();
                }
            }
            c2474b2.f13415b = interfaceC6747c;
            c2474b2.f13416c = enumC6757m;
            c2474b2.f13417d = this.f37942x;
            interfaceC2476d.mo6400w(interfaceC6747c, enumC6757m, c2474b2, c2474b2.f13418e);
            if (this.f37931k) {
                this.f37931k = false;
                this.f37924c.m15040w(this, false);
            }
        }
    }

    @Override // v3.o1
    /* renamed from: i */
    public final void mo14653i(d3.i0 i0Var) {
        InterfaceC2137a interfaceC2137a;
        int i10;
        InterfaceC2137a interfaceC2137a2;
        int i11 = i0Var.f7756a | this.f37935p;
        this.f37933m = i0Var.f7775w;
        this.f37932l = i0Var.f7774v;
        int i12 = i11 & 4096;
        if (i12 != 0) {
            this.f37936q = i0Var.f7769p;
        }
        if ((i11 & 1) != 0) {
            C2474b c2474b = this.f37922a;
            float f6 = i0Var.f7757b;
            InterfaceC2476d interfaceC2476d = c2474b.f13414a;
            if (interfaceC2476d.mo6391n() != f6) {
                interfaceC2476d.mo6387j(f6);
            }
        }
        if ((i11 & 2) != 0) {
            C2474b c2474b2 = this.f37922a;
            float f10 = i0Var.f7758c;
            InterfaceC2476d interfaceC2476d2 = c2474b2.f13414a;
            if (interfaceC2476d2.mo6377J() != f10) {
                interfaceC2476d2.mo6384g(f10);
            }
        }
        if ((i11 & 4) != 0) {
            C2474b c2474b3 = this.f37922a;
            float f11 = i0Var.f7759d;
            InterfaceC2476d interfaceC2476d3 = c2474b3.f13414a;
            if (interfaceC2476d3.mo6379a() != f11) {
                interfaceC2476d3.mo6386i(f11);
            }
        }
        if ((i11 & 8) != 0) {
            C2474b c2474b4 = this.f37922a;
            float f12 = i0Var.f7760e;
            InterfaceC2476d interfaceC2476d4 = c2474b4.f13414a;
            if (interfaceC2476d4.mo6370C() != f12) {
                interfaceC2476d4.mo6388k(f12);
            }
        }
        if ((i11 & 16) != 0) {
            C2474b c2474b5 = this.f37922a;
            float f13 = i0Var.f7761f;
            InterfaceC2476d interfaceC2476d5 = c2474b5.f13414a;
            if (interfaceC2476d5.mo6401x() != f13) {
                interfaceC2476d5.mo6382e(f13);
            }
        }
        boolean z6 = true;
        if ((i11 & 32) != 0) {
            C2474b c2474b6 = this.f37922a;
            float f14 = i0Var.f7762g;
            InterfaceC2476d interfaceC2476d6 = c2474b6.f13414a;
            if (interfaceC2476d6.mo6376I() != f14) {
                interfaceC2476d6.mo6392o(f14);
                c2474b6.f13420g = true;
                c2474b6.m6362a();
            }
            if (i0Var.f7762g > DefinitionKt.NO_Float_VALUE && !this.f37941w && (interfaceC2137a2 = this.f37926e) != null) {
                interfaceC2137a2.invoke();
            }
        }
        if ((i11 & 64) != 0) {
            C2474b c2474b7 = this.f37922a;
            long j6 = i0Var.f7763h;
            InterfaceC2476d interfaceC2476d7 = c2474b7.f13414a;
            if (!C1565s.m5187c(j6, interfaceC2476d7.mo6399v())) {
                interfaceC2476d7.mo6403z(j6);
            }
        }
        if ((i11 & 128) != 0) {
            C2474b c2474b8 = this.f37922a;
            long j10 = i0Var.f7764j;
            InterfaceC2476d interfaceC2476d8 = c2474b8.f13414a;
            if (!C1565s.m5187c(j10, interfaceC2476d8.mo6402y())) {
                interfaceC2476d8.mo6374G(j10);
            }
        }
        if ((i11 & 1024) != 0) {
            C2474b c2474b9 = this.f37922a;
            float f15 = i0Var.f7767m;
            InterfaceC2476d interfaceC2476d9 = c2474b9.f13414a;
            if (interfaceC2476d9.mo6397t() != f15) {
                interfaceC2476d9.mo6381d(f15);
            }
        }
        if ((i11 & 256) != 0) {
            C2474b c2474b10 = this.f37922a;
            float f16 = i0Var.f7765k;
            InterfaceC2476d interfaceC2476d10 = c2474b10.f13414a;
            if (interfaceC2476d10.mo6372E() != f16) {
                interfaceC2476d10.mo6390m(f16);
            }
        }
        if ((i11 & 512) != 0) {
            C2474b c2474b11 = this.f37922a;
            float f17 = i0Var.f7766l;
            InterfaceC2476d interfaceC2476d11 = c2474b11.f13414a;
            if (interfaceC2476d11.mo6396s() != f17) {
                interfaceC2476d11.mo6380c(f17);
            }
        }
        if ((i11 & NewHope.SENDB_BYTES) != 0) {
            C2474b c2474b12 = this.f37922a;
            float f18 = i0Var.f7768n;
            InterfaceC2476d interfaceC2476d12 = c2474b12.f13414a;
            if (interfaceC2476d12.mo6369B() != f18) {
                interfaceC2476d12.mo6389l(f18);
            }
        }
        if (i12 != 0) {
            if (d3.p0.m5180a(this.f37936q, d3.p0.f7805b)) {
                C2474b c2474b13 = this.f37922a;
                if (!C0847b.m2271b(c2474b13.f13435v, 9205357640488583168L)) {
                    c2474b13.f13435v = 9205357640488583168L;
                    c2474b13.f13414a.mo6398u(9205357640488583168L);
                }
            } else {
                C2474b c2474b14 = this.f37922a;
                float fM5181b = d3.p0.m5181b(this.f37936q) * ((int) (this.f37927f >> 32));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(d3.p0.m5182c(this.f37936q) * ((int) (this.f37927f & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fM5181b) << 32);
                if (!C0847b.m2271b(c2474b14.f13435v, jFloatToRawIntBits)) {
                    c2474b14.f13435v = jFloatToRawIntBits;
                    c2474b14.f13414a.mo6398u(jFloatToRawIntBits);
                }
            }
        }
        if ((i11 & 16384) != 0) {
            C2474b c2474b15 = this.f37922a;
            boolean z10 = i0Var.f7771r;
            if (c2474b15.f13436w != z10) {
                c2474b15.f13436w = z10;
                c2474b15.f13420g = true;
                c2474b15.m6362a();
            }
        }
        if ((131072 & i11) != 0) {
            InterfaceC2476d interfaceC2476d13 = this.f37922a.f13414a;
        }
        if ((32768 & i11) != 0) {
            C2474b c2474b16 = this.f37922a;
            int i13 = i0Var.f7772s;
            if (i13 == 0) {
                i10 = 0;
            } else if (i13 == 1) {
                i10 = 1;
            } else {
                i10 = 2;
                if (i13 != 2) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            InterfaceC2476d interfaceC2476d14 = c2474b16.f13414a;
            if (interfaceC2476d14.mo6394q() != i10) {
                interfaceC2476d14.mo6373F(i10);
            }
        }
        if ((i11 & 7963) != 0) {
            this.f37938s = true;
            this.f37939t = true;
        }
        if (AbstractC4154l.m8918a(this.f37937r, i0Var.f7776x)) {
            z6 = false;
        } else {
            d3.h0 h0Var = i0Var.f7776x;
            this.f37937r = h0Var;
            if (h0Var != null) {
                C2474b c2474b17 = this.f37922a;
                if (h0Var instanceof d3.d0) {
                    C0848c c0848c = ((d3.d0) h0Var).f7738e;
                    float f19 = c0848c.f5354a;
                    float f20 = c0848c.f5355b;
                    c2474b17.m6367f((Float.floatToRawIntBits(f19) << 32) | (Float.floatToRawIntBits(f20) & 4294967295L), (Float.floatToRawIntBits(c0848c.f5356c - f19) << 32) | (Float.floatToRawIntBits(c0848c.f5357d - f20) & 4294967295L), DefinitionKt.NO_Float_VALUE);
                } else if (h0Var instanceof d3.c0) {
                    d3.g0 g0Var = ((d3.c0) h0Var).f7736e;
                    c2474b17.f13424k = null;
                    c2474b17.f13422i = 9205357640488583168L;
                    c2474b17.f13421h = 0L;
                    c2474b17.f13423j = DefinitionKt.NO_Float_VALUE;
                    c2474b17.f13420g = true;
                    c2474b17.f13427n = false;
                    c2474b17.f13425l = g0Var;
                    c2474b17.m6362a();
                } else if (h0Var instanceof d3.e0) {
                    d3.e0 e0Var = (d3.e0) h0Var;
                    C1555i c1555i = e0Var.f7744f;
                    if (c1555i != null) {
                        c2474b17.f13424k = null;
                        c2474b17.f13422i = 9205357640488583168L;
                        c2474b17.f13421h = 0L;
                        c2474b17.f13423j = DefinitionKt.NO_Float_VALUE;
                        c2474b17.f13420g = true;
                        c2474b17.f13427n = false;
                        c2474b17.f13425l = c1555i;
                        c2474b17.m6362a();
                    } else {
                        c2474b17.m6367f((Float.floatToRawIntBits(r4.f5358a) << 32) | (Float.floatToRawIntBits(r4.f5359b) & 4294967295L), (Float.floatToRawIntBits(r4.m2289b()) << 32) | (Float.floatToRawIntBits(r4.m2288a()) & 4294967295L), Float.intBitsToFloat((int) (e0Var.f7743e.f5365h >> 32)));
                    }
                }
                if ((h0Var instanceof d3.c0) && Build.VERSION.SDK_INT < 33 && (interfaceC2137a = this.f37926e) != null) {
                    interfaceC2137a.invoke();
                }
            }
        }
        this.f37935p = i0Var.f7756a;
        if (i11 != 0 || z6) {
            int i14 = Build.VERSION.SDK_INT;
            C7904v c7904v = this.f37924c;
            if (i14 >= 26) {
                h3.m14957a(c7904v);
            } else {
                c7904v.invalidate();
            }
        }
    }

    @Override // v3.o1
    public final void invalidate() {
        if (this.f37931k || this.f37928g) {
            return;
        }
        C7904v c7904v = this.f37924c;
        c7904v.invalidate();
        if (true != this.f37931k) {
            this.f37931k = true;
            c7904v.m15040w(this, true);
        }
    }

    @Override // v3.o1
    /* renamed from: j */
    public final long mo14654j(boolean z6, long j6) {
        float[] fArrM15000m;
        if (z6) {
            fArrM15000m = m14999l();
            if (fArrM15000m == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrM15000m = m15000m();
        }
        return this.f37940v ? j6 : d3.b0.m5095b(j6, fArrM15000m);
    }

    @Override // v3.o1
    /* renamed from: k */
    public final void mo14655k(InterfaceC1563q interfaceC1563q, C2474b c2474b) {
        boolean z6;
        Canvas canvas;
        boolean z10;
        mo14652h();
        this.f37941w = this.f37922a.f13414a.mo6376I() > DefinitionKt.NO_Float_VALUE;
        C2196b c2196b = this.f37934n;
        C0005d c0005d = c2196b.f10124b;
        c0005d.b0(interfaceC1563q);
        c0005d.f25c = c2474b;
        C2474b c2474b2 = this.f37922a;
        InterfaceC1563q interfaceC1563qM75t = c2196b.mo5899X().m75t();
        C2474b c2474b3 = (C2474b) c2196b.mo5899X().f25c;
        InterfaceC2476d interfaceC2476d = c2474b2.f13414a;
        if (c2474b2.f13432s) {
            return;
        }
        c2474b2.m6362a();
        if (!interfaceC2476d.mo6385h()) {
            try {
                c2474b2.f13414a.mo6400w(c2474b2.f13415b, c2474b2.f13416c, c2474b2, c2474b2.f13418e);
            } catch (Throwable unused) {
            }
        }
        boolean z11 = interfaceC2476d.mo6376I() > DefinitionKt.NO_Float_VALUE;
        if (z11) {
            interfaceC1563qM75t.mo5118t();
        }
        Canvas canvasM5119a = AbstractC1550d.m5119a(interfaceC1563qM75t);
        boolean zIsHardwareAccelerated = canvasM5119a.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j6 = c2474b2.f13433t;
            float f6 = (int) (j6 >> 32);
            float f10 = (int) (j6 & 4294967295L);
            long j10 = c2474b2.f13434u;
            float f11 = ((int) (j10 >> 32)) + f6;
            float f12 = f10 + ((int) (j10 & 4294967295L));
            float fMo6379a = interfaceC2476d.mo6379a();
            int iMo6378K = interfaceC2476d.mo6378K();
            if (fMo6379a < 1.0f || iMo6378K != 3 || interfaceC2476d.mo6394q() == 1) {
                C5359n c5359nM5135g = c2474b2.f13429p;
                if (c5359nM5135g == null) {
                    c5359nM5135g = d3.h0.m5135g();
                    c2474b2.f13429p = c5359nM5135g;
                }
                c5359nM5135g.m10512s(fMo6379a);
                c5359nM5135g.m10513t(iMo6378K);
                c5359nM5135g.m10515v(null);
                canvasM5119a.saveLayer(f6, f10, f11, f12, (Paint) c5359nM5135g.f26304b);
            } else {
                canvasM5119a.save();
            }
            canvasM5119a.translate(f6, f10);
            canvasM5119a.concat(interfaceC2476d.mo6375H());
        }
        boolean z12 = !zIsHardwareAccelerated && c2474b2.f13436w;
        if (z12) {
            interfaceC1563qM75t.mo5107i();
            d3.h0 h0VarM6365d = c2474b2.m6365d();
            if (h0VarM6365d instanceof d3.d0) {
                InterfaceC1563q.m5184d(interfaceC1563qM75t, ((d3.d0) h0VarM6365d).f7738e);
            } else if (h0VarM6365d instanceof d3.e0) {
                C1555i c1555iM5178a = c2474b2.f13426m;
                if (c1555iM5178a != null) {
                    c1555iM5178a.f7752a.rewind();
                } else {
                    c1555iM5178a = AbstractC1558l.m5178a();
                    c2474b2.f13426m = c1555iM5178a;
                }
                d3.g0.m5128b(c1555iM5178a, ((d3.e0) h0VarM6365d).f7743e);
                interfaceC1563qM75t.mo5110l(c1555iM5178a);
            } else if (h0VarM6365d instanceof d3.c0) {
                interfaceC1563qM75t.mo5110l(((d3.c0) h0VarM6365d).f7736e);
            }
        }
        if (c2474b3 != null) {
            C2193p c2193p = c2474b3.f13431r;
            if (!c2193p.f10110a) {
                d3.a0.m5088a("Only add dependencies during a tracking");
            }
            e1.k0 k0Var = (e1.k0) c2193p.f10113d;
            if (k0Var != null) {
                k0Var.m5581a(c2474b2);
            } else if (((C2474b) c2193p.f10111b) != null) {
                int i10 = e1.t0.f9058a;
                e1.k0 k0Var2 = new e1.k0();
                C2474b c2474b4 = (C2474b) c2193p.f10111b;
                AbstractC4154l.m8920c(c2474b4);
                k0Var2.m5581a(c2474b4);
                k0Var2.m5581a(c2474b2);
                c2193p.f10113d = k0Var2;
                c2193p.f10111b = null;
            } else {
                c2193p.f10111b = c2474b2;
            }
            e1.k0 k0Var3 = (e1.k0) c2193p.f10114e;
            if (k0Var3 != null) {
                z10 = !k0Var3.m5592l(c2474b2);
            } else if (((C2474b) c2193p.f10112c) != c2474b2) {
                z10 = true;
            } else {
                c2193p.f10112c = null;
                z10 = false;
            }
            if (z10) {
                c2474b2.f13430q++;
            }
        }
        if (AbstractC1550d.m5119a(interfaceC1563qM75t).isHardwareAccelerated()) {
            z6 = z11;
            canvas = canvasM5119a;
            interfaceC2476d.mo6368A(interfaceC1563qM75t);
        } else {
            C2196b c2196b2 = c2474b2.f13428o;
            if (c2196b2 == null) {
                c2196b2 = new C2196b();
                c2474b2.f13428o = c2196b2;
            }
            C0005d c0005d2 = c2196b2.f10124b;
            InterfaceC6747c interfaceC6747c = c2474b2.f13415b;
            EnumC6757m enumC6757m = c2474b2.f13416c;
            long jM11098d = ze.m11098d(c2474b2.f13434u);
            C2195a c2195a = ((C2196b) c0005d2.f26d).f10123a;
            InterfaceC6747c interfaceC6747c2 = c2195a.f10119a;
            EnumC6757m enumC6757m2 = c2195a.f10120b;
            InterfaceC1563q interfaceC1563qM75t2 = c0005d2.m75t();
            z6 = z11;
            long jM81z = c0005d2.m81z();
            canvas = canvasM5119a;
            C2474b c2474b5 = (C2474b) c0005d2.f25c;
            c0005d2.c0(interfaceC6747c);
            c0005d2.d0(enumC6757m);
            c0005d2.b0(interfaceC1563qM75t);
            c0005d2.e0(jM11098d);
            c0005d2.f25c = c2474b2;
            interfaceC1563qM75t.mo5107i();
            try {
                c2474b2.m6364c(c2196b2);
            } finally {
                interfaceC1563qM75t.mo5113o();
                c0005d2.c0(interfaceC6747c2);
                c0005d2.d0(enumC6757m2);
                c0005d2.b0(interfaceC1563qM75t2);
                c0005d2.e0(jM81z);
                c0005d2.f25c = c2474b5;
            }
        }
        if (z12) {
            interfaceC1563qM75t.mo5113o();
        }
        if (z6) {
            interfaceC1563qM75t.mo5108j();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    /* renamed from: l */
    public final float[] m14999l() {
        float[] fArrM5094a = this.f37930j;
        if (fArrM5094a == null) {
            fArrM5094a = d3.b0.m5094a();
            this.f37930j = fArrM5094a;
        }
        if (this.f37939t) {
            this.f37939t = false;
            float[] fArrM15000m = m15000m();
            if (this.f37940v) {
                return fArrM15000m;
            }
            if (!m0.m14987n(fArrM15000m, fArrM5094a)) {
                fArrM5094a[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrM5094a[0])) {
            return null;
        }
        return fArrM5094a;
    }

    /* renamed from: m */
    public final float[] m15000m() {
        boolean z6 = this.f37938s;
        float[] fArr = this.f37929h;
        if (z6) {
            C2474b c2474b = this.f37922a;
            long jM10602e = c2474b.f13435v;
            InterfaceC2476d interfaceC2476d = c2474b.f13414a;
            if ((9223372034707292159L & jM10602e) == 9205357640488583168L) {
                jM10602e = og.d2.m10602e(ze.m11098d(this.f37927f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM10602e >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM10602e & 4294967295L));
            float fMo6370C = interfaceC2476d.mo6370C();
            float fMo6401x = interfaceC2476d.mo6401x();
            float fMo6372E = interfaceC2476d.mo6372E();
            float fMo6396s = interfaceC2476d.mo6396s();
            float fMo6397t = interfaceC2476d.mo6397t();
            float fMo6391n = interfaceC2476d.mo6391n();
            float fMo6377J = interfaceC2476d.mo6377J();
            double d2 = fMo6372E * 0.017453292519943295d;
            float fSin = (float) Math.sin(d2);
            float fCos = (float) Math.cos(d2);
            float f6 = -fSin;
            float f10 = (fMo6401x * fCos) - (1.0f * fSin);
            float f11 = (1.0f * fCos) + (fMo6401x * fSin);
            double d10 = fMo6396s * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d10);
            float fCos2 = (float) Math.cos(d10);
            float f12 = -fSin2;
            float f13 = fSin * fSin2;
            float f14 = fSin * fCos2;
            float f15 = fCos * fSin2;
            float f16 = fCos * fCos2;
            float f17 = (f11 * fSin2) + (fMo6370C * fCos2);
            float f18 = (f11 * fCos2) + ((-fMo6370C) * fSin2);
            double d11 = fMo6397t * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d11);
            float fCos3 = (float) Math.cos(d11);
            float f19 = -fSin3;
            float f20 = (fCos3 * f13) + (f19 * fCos2);
            float f21 = ((f13 * fSin3) + (fCos2 * fCos3)) * fMo6391n;
            float f22 = fSin3 * fCos * fMo6391n;
            float f23 = ((fSin3 * f14) + (fCos3 * f12)) * fMo6391n;
            float f24 = f20 * fMo6377J;
            float f25 = fCos * fCos3 * fMo6377J;
            float f26 = ((fCos3 * f14) + (f19 * f12)) * fMo6377J;
            float f27 = f15 * 1.0f;
            float f28 = f6 * 1.0f;
            float f29 = f16 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f21;
                fArr[1] = f22;
                fArr[2] = f23;
                fArr[3] = 0.0f;
                fArr[4] = f24;
                fArr[5] = f25;
                fArr[6] = f26;
                fArr[7] = 0.0f;
                fArr[8] = f27;
                fArr[9] = f28;
                fArr[10] = f29;
                fArr[11] = 0.0f;
                float f30 = -fIntBitsToFloat;
                fArr[12] = ((f21 * f30) - (fIntBitsToFloat2 * f24)) + f17 + fIntBitsToFloat;
                fArr[13] = ((f22 * f30) - (fIntBitsToFloat2 * f25)) + f10 + fIntBitsToFloat2;
                fArr[14] = ((f30 * f23) - (fIntBitsToFloat2 * f26)) + f18;
                fArr[15] = 1.0f;
            }
            this.f37938s = false;
            this.f37940v = d3.h0.m5141m(fArr);
        }
        return fArr;
    }
}
