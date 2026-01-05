package w3;

import al.C0174b;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import c3.C0846a;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.AbstractC1550d;
import d3.C1564r;
import d3.InterfaceC1563q;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import g3.C2474b;
import of.C5359n;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p3.C5805c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j2 implements v3.o1 {

    /* renamed from: a */
    public final C7904v f37814a;

    /* renamed from: b */
    public InterfaceC2141e f37815b;

    /* renamed from: c */
    public InterfaceC2137a f37816c;

    /* renamed from: d */
    public boolean f37817d;

    /* renamed from: f */
    public boolean f37819f;

    /* renamed from: g */
    public boolean f37820g;

    /* renamed from: h */
    public C5359n f37821h;

    /* renamed from: m */
    public final m1 f37825m;

    /* renamed from: n */
    public int f37826n;

    /* renamed from: e */
    public final b2 f37818e = new b2();

    /* renamed from: j */
    public final C5805c f37822j = new C5805c(c0.f37754d);

    /* renamed from: k */
    public final C1564r f37823k = new C1564r();

    /* renamed from: l */
    public long f37824l = d3.p0.f7805b;

    public j2(C7904v c7904v, InterfaceC2141e interfaceC2141e, InterfaceC2137a interfaceC2137a) {
        this.f37814a = c7904v;
        this.f37815b = interfaceC2141e;
        this.f37816c = interfaceC2137a;
        m1 h2Var = Build.VERSION.SDK_INT >= 29 ? new h2() : new g2(c7904v);
        h2Var.mo14917A();
        h2Var.mo14947t(false);
        this.f37825m = h2Var;
    }

    @Override // v3.o1
    /* renamed from: a */
    public final void mo14645a(float[] fArr) {
        d3.b0.m5098e(fArr, this.f37822j.m11377c(this.f37825m));
    }

    @Override // v3.o1
    /* renamed from: b */
    public final boolean mo14646b(long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j6));
        m1 m1Var = this.f37825m;
        if (m1Var.mo14919C()) {
            return DefinitionKt.NO_Float_VALUE <= fIntBitsToFloat && fIntBitsToFloat < ((float) m1Var.mo14929b()) && DefinitionKt.NO_Float_VALUE <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) m1Var.getHeight());
        }
        if (m1Var.mo14923G()) {
            return this.f37818e.m14895c(j6);
        }
        return true;
    }

    @Override // v3.o1
    /* renamed from: c */
    public final void mo14647c(InterfaceC2141e interfaceC2141e, InterfaceC2137a interfaceC2137a) {
        C5805c c5805c = this.f37822j;
        c5805c.f28414a = false;
        c5805c.f28415b = false;
        c5805c.f28417d = true;
        c5805c.f28416c = true;
        d3.b0.m5097d((float[]) c5805c.f28420g);
        d3.b0.m5097d((float[]) c5805c.f28421h);
        m14968l(false);
        this.f37819f = false;
        this.f37820g = false;
        this.f37824l = d3.p0.f7805b;
        this.f37815b = interfaceC2141e;
        this.f37816c = interfaceC2137a;
    }

    @Override // v3.o1
    /* renamed from: d */
    public final void mo14648d(long j6) {
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        float fM5181b = d3.p0.m5181b(this.f37824l) * i10;
        m1 m1Var = this.f37825m;
        m1Var.mo14946s(fM5181b);
        m1Var.mo14949v(d3.p0.m5182c(this.f37824l) * i11);
        if (m1Var.mo14948u(m1Var.mo14945r(), m1Var.mo14920D(), m1Var.mo14945r() + i10, m1Var.mo14920D() + i11)) {
            m1Var.mo14953z(this.f37818e.m14894b());
            if (!this.f37817d && !this.f37819f) {
                this.f37814a.invalidate();
                m14968l(true);
            }
            this.f37822j.m11379e();
        }
    }

    @Override // v3.o1
    public final void destroy() {
        m1 m1Var = this.f37825m;
        if (m1Var.mo14935h()) {
            m1Var.mo14933f();
        }
        this.f37815b = null;
        this.f37816c = null;
        this.f37819f = true;
        m14968l(false);
        C7904v c7904v = this.f37814a;
        c7904v.f38009H = true;
        c7904v.m15024F(this);
    }

    @Override // v3.o1
    /* renamed from: e */
    public final void mo14649e(float[] fArr) {
        float[] fArrM11376b = this.f37822j.m11376b(this.f37825m);
        if (fArrM11376b != null) {
            d3.b0.m5098e(fArr, fArrM11376b);
        }
    }

    @Override // v3.o1
    /* renamed from: f */
    public final void mo14650f(C0846a c0846a, boolean z6) {
        m1 m1Var = this.f37825m;
        C5805c c5805c = this.f37822j;
        if (!z6) {
            float[] fArrM11377c = c5805c.m11377c(m1Var);
            if (c5805c.f28417d) {
                return;
            }
            d3.b0.m5096c(fArrM11377c, c0846a);
            return;
        }
        float[] fArrM11376b = c5805c.m11376b(m1Var);
        if (fArrM11376b != null) {
            if (c5805c.f28417d) {
                return;
            }
            d3.b0.m5096c(fArrM11376b, c0846a);
        } else {
            c0846a.f5348b = DefinitionKt.NO_Float_VALUE;
            c0846a.f5349c = DefinitionKt.NO_Float_VALUE;
            c0846a.f5350d = DefinitionKt.NO_Float_VALUE;
            c0846a.f5351e = DefinitionKt.NO_Float_VALUE;
        }
    }

    @Override // v3.o1
    /* renamed from: g */
    public final void mo14651g(long j6) {
        m1 m1Var = this.f37825m;
        int iMo14945r = m1Var.mo14945r();
        int iMo14920D = m1Var.mo14920D();
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        if (iMo14945r == i10 && iMo14920D == i11) {
            return;
        }
        if (iMo14945r != i10) {
            m1Var.mo14941n(i10 - iMo14945r);
        }
        if (iMo14920D != i11) {
            m1Var.mo14951x(i11 - iMo14920D);
        }
        int i12 = Build.VERSION.SDK_INT;
        C7904v c7904v = this.f37814a;
        if (i12 >= 26) {
            h3.m14957a(c7904v);
        } else {
            c7904v.invalidate();
        }
        this.f37822j.m11379e();
    }

    @Override // v3.o1
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo16698getUnderlyingMatrixsQKQjiQ() {
        return this.f37822j.m11377c(this.f37825m);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    @Override // v3.o1
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo14652h() {
        /*
            r5 = this;
            boolean r0 = r5.f37817d
            w3.m1 r1 = r5.f37825m
            if (r0 != 0) goto Le
            boolean r0 = r1.mo14935h()
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            boolean r0 = r1.mo14923G()
            if (r0 == 0) goto L20
            w3.b2 r0 = r5.f37818e
            boolean r2 = r0.f37740g
            if (r2 == 0) goto L20
            r0.m14897e()
            d3.g0 r0 = r0.f37738e
            goto L21
        L20:
            r0 = 0
        L21:
            ex.e r2 = r5.f37815b
            if (r2 == 0) goto L30
            h1.d1 r3 = new h1.d1
            r4 = 1
            r3.<init>(r2, r4)
            d3.r r2 = r5.f37823k
            r1.mo14918B(r2, r0, r3)
        L30:
            r0 = 0
            r5.m14968l(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.j2.mo14652h():void");
    }

    @Override // v3.o1
    /* renamed from: i */
    public final void mo14653i(d3.i0 i0Var) {
        InterfaceC2137a interfaceC2137a;
        int i10 = i0Var.f7756a | this.f37826n;
        int i11 = i10 & 4096;
        if (i11 != 0) {
            this.f37824l = i0Var.f7769p;
        }
        m1 m1Var = this.f37825m;
        boolean zMo14923G = m1Var.mo14923G();
        b2 b2Var = this.f37818e;
        boolean z6 = false;
        boolean z10 = zMo14923G && b2Var.f37740g;
        if ((i10 & 1) != 0) {
            m1Var.mo14937j(i0Var.f7757b);
        }
        if ((i10 & 2) != 0) {
            m1Var.mo14934g(i0Var.f7758c);
        }
        if ((i10 & 4) != 0) {
            m1Var.mo14936i(i0Var.f7759d);
        }
        if ((i10 & 8) != 0) {
            m1Var.mo14938k(i0Var.f7760e);
        }
        if ((i10 & 16) != 0) {
            m1Var.mo14932e(i0Var.f7761f);
        }
        if ((i10 & 32) != 0) {
            m1Var.mo14950w(i0Var.f7762g);
        }
        if ((i10 & 64) != 0) {
            m1Var.mo14921E(d3.h0.m5149u(i0Var.f7763h));
        }
        if ((i10 & 128) != 0) {
            m1Var.mo14925I(d3.h0.m5149u(i0Var.f7764j));
        }
        if ((i10 & 1024) != 0) {
            m1Var.mo14931d(i0Var.f7767m);
        }
        if ((i10 & 256) != 0) {
            m1Var.mo14940m(i0Var.f7765k);
        }
        if ((i10 & 512) != 0) {
            m1Var.mo14930c(i0Var.f7766l);
        }
        if ((i10 & NewHope.SENDB_BYTES) != 0) {
            m1Var.mo14939l(i0Var.f7768n);
        }
        if (i11 != 0) {
            m1Var.mo14946s(d3.p0.m5181b(this.f37824l) * m1Var.mo14929b());
            m1Var.mo14949v(d3.p0.m5182c(this.f37824l) * m1Var.getHeight());
        }
        boolean z11 = i0Var.f7771r;
        C0174b c0174b = d3.h0.f7748a;
        boolean z12 = z11 && i0Var.f7770q != c0174b;
        if ((i10 & 24576) != 0) {
            m1Var.mo14924H(z12);
            m1Var.mo14947t(i0Var.f7771r && i0Var.f7770q == c0174b);
        }
        if ((131072 & i10) != 0) {
            m1Var.mo14943p();
        }
        if ((32768 & i10) != 0) {
            m1Var.mo14952y(i0Var.f7772s);
        }
        boolean zM14896d = this.f37818e.m14896d(i0Var.f7776x, i0Var.f7759d, z12, i0Var.f7762g, i0Var.f7773t);
        if (b2Var.f37739f) {
            m1Var.mo14953z(b2Var.m14894b());
        }
        if (z12 && b2Var.f37740g) {
            z6 = true;
        }
        C7904v c7904v = this.f37814a;
        if (z10 != z6 || (z6 && zM14896d)) {
            if (!this.f37817d && !this.f37819f) {
                c7904v.invalidate();
                m14968l(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            h3.m14957a(c7904v);
        } else {
            c7904v.invalidate();
        }
        if (!this.f37820g && m1Var.mo14927K() > DefinitionKt.NO_Float_VALUE && (interfaceC2137a = this.f37816c) != null) {
            interfaceC2137a.invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f37822j.m11379e();
        }
        this.f37826n = i0Var.f7756a;
    }

    @Override // v3.o1
    public final void invalidate() {
        if (this.f37817d || this.f37819f) {
            return;
        }
        this.f37814a.invalidate();
        m14968l(true);
    }

    @Override // v3.o1
    /* renamed from: j */
    public final long mo14654j(boolean z6, long j6) {
        m1 m1Var = this.f37825m;
        C5805c c5805c = this.f37822j;
        if (z6) {
            float[] fArrM11376b = c5805c.m11376b(m1Var);
            if (fArrM11376b == null) {
                return 9187343241974906880L;
            }
            if (!c5805c.f28417d) {
                return d3.b0.m5095b(j6, fArrM11376b);
            }
        } else {
            float[] fArrM11377c = c5805c.m11377c(m1Var);
            if (!c5805c.f28417d) {
                return d3.b0.m5095b(j6, fArrM11377c);
            }
        }
        return j6;
    }

    @Override // v3.o1
    /* renamed from: k */
    public final void mo14655k(InterfaceC1563q interfaceC1563q, C2474b c2474b) {
        Canvas canvasM5119a = AbstractC1550d.m5119a(interfaceC1563q);
        boolean zIsHardwareAccelerated = canvasM5119a.isHardwareAccelerated();
        m1 m1Var = this.f37825m;
        if (zIsHardwareAccelerated) {
            mo14652h();
            boolean z6 = m1Var.mo14927K() > DefinitionKt.NO_Float_VALUE;
            this.f37820g = z6;
            if (z6) {
                interfaceC1563q.mo5118t();
            }
            m1Var.mo14944q(canvasM5119a);
            if (this.f37820g) {
                interfaceC1563q.mo5108j();
                return;
            }
            return;
        }
        float fMo14945r = m1Var.mo14945r();
        float fMo14920D = m1Var.mo14920D();
        float fMo14922F = m1Var.mo14922F();
        float fMo14942o = m1Var.mo14942o();
        if (m1Var.mo14928a() < 1.0f) {
            C5359n c5359nM5135g = this.f37821h;
            if (c5359nM5135g == null) {
                c5359nM5135g = d3.h0.m5135g();
                this.f37821h = c5359nM5135g;
            }
            c5359nM5135g.m10512s(m1Var.mo14928a());
            canvasM5119a.saveLayer(fMo14945r, fMo14920D, fMo14922F, fMo14942o, (Paint) c5359nM5135g.f26304b);
        } else {
            interfaceC1563q.mo5107i();
        }
        interfaceC1563q.mo5112n(fMo14945r, fMo14920D);
        interfaceC1563q.mo5109k(this.f37822j.m11377c(m1Var));
        if (m1Var.mo14923G() || m1Var.mo14919C()) {
            this.f37818e.m14893a(interfaceC1563q);
        }
        InterfaceC2141e interfaceC2141e = this.f37815b;
        if (interfaceC2141e != null) {
            interfaceC2141e.invoke(interfaceC1563q, null);
        }
        interfaceC1563q.mo5113o();
        m14968l(false);
    }

    /* renamed from: l */
    public final void m14968l(boolean z6) {
        if (z6 != this.f37817d) {
            this.f37817d = z6;
            this.f37814a.m15040w(this, z6);
        }
    }
}
