package p001o;

import android.graphics.Bitmap;
import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.AbstractC2193c;
import androidx.media3.exoplayer.InterfaceC2221p;
import androidx.media3.exoplayer.image.ImageOutput;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import p001o.ad8;
import p001o.x8b;

/* loaded from: classes2.dex */
public class ce8 extends AbstractC2193c {

    /* renamed from: Y */
    public final ad8.InterfaceC12144a f17991Y;

    /* renamed from: Z */
    public final a85 f17992Z;
    public final ArrayDeque h0;
    public boolean i0;
    public boolean j0;
    public C12651a k0;
    public long l0;
    public long m0;
    public int n0;
    public int o0;
    public C2181a p0;
    public ad8 q0;
    public a85 r0;
    public ImageOutput s0;
    public Bitmap t0;
    public boolean u0;
    public C12652b v0;
    public C12652b w0;
    public int x0;

    /* renamed from: o.ce8$a */
    public static final class C12651a {

        /* renamed from: c */
        public static final C12651a f17993c = new C12651a(-9223372036854775807L, -9223372036854775807L);

        /* renamed from: a */
        public final long f17994a;

        /* renamed from: b */
        public final long f17995b;

        public C12651a(long j, long j2) {
            this.f17994a = j;
            this.f17995b = j2;
        }
    }

    /* renamed from: o.ce8$b */
    public static class C12652b {

        /* renamed from: a */
        public final int f17996a;

        /* renamed from: b */
        public final long f17997b;

        /* renamed from: c */
        public Bitmap f17998c;

        public C12652b(int i, long j) {
            this.f17996a = i;
            this.f17997b = j;
        }

        /* renamed from: a */
        public long m21059a() {
            return this.f17997b;
        }

        /* renamed from: b */
        public Bitmap m21060b() {
            return this.f17998c;
        }

        /* renamed from: c */
        public int m21061c() {
            return this.f17996a;
        }

        /* renamed from: d */
        public boolean m21062d() {
            return this.f17998c != null;
        }

        /* renamed from: e */
        public void m21063e(Bitmap bitmap) {
            this.f17998c = bitmap;
        }
    }

    public ce8(ad8.InterfaceC12144a interfaceC12144a, ImageOutput imageOutput) {
        super(4);
        this.f17991Y = interfaceC12144a;
        this.s0 = r0(imageOutput);
        this.f17992Z = a85.m16673y();
        this.k0 = C12651a.f17993c;
        this.h0 = new ArrayDeque();
        this.m0 = -9223372036854775807L;
        this.l0 = -9223372036854775807L;
        this.n0 = 0;
        this.o0 = 1;
    }

    public static ImageOutput r0(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.f8420a : imageOutput;
    }

    public final boolean A0() {
        boolean z = getState() == 2;
        int i = this.o0;
        if (i == 0) {
            return z;
        }
        if (i == 1) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    /* renamed from: Z */
    public void mo6887Z() {
        this.p0 = null;
        this.k0 = C12651a.f17993c;
        this.h0.clear();
        y0();
        this.s0.mo7266a();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2221p
    /* renamed from: a */
    public int mo7449a(C2181a c2181a) {
        return this.f17991Y.mo16898a(c2181a);
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void a0(boolean z, boolean z2) {
        this.o0 = z2 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: b */
    public boolean mo7429b() {
        return this.j0;
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void c0(long j, boolean z) {
        u0(1);
        this.j0 = false;
        this.i0 = false;
        this.t0 = null;
        this.v0 = null;
        this.w0 = null;
        this.u0 = false;
        this.r0 = null;
        ad8 ad8Var = this.q0;
        if (ad8Var != null) {
            ad8Var.flush();
        }
        this.h0.clear();
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void d0() {
        y0();
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void f0() {
        y0();
        u0(1);
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: g */
    public void mo7431g(long j, long j2) throws qm6 {
        if (this.j0) {
            return;
        }
        if (this.p0 == null) {
            if7 if7VarM6881T = m6881T();
            this.f17992Z.mo16674h();
            int iK0 = k0(if7VarM6881T, this.f17992Z, 2);
            if (iK0 != -5) {
                if (iK0 == -4) {
                    op0.m42517g(this.f17992Z.m50150n());
                    this.i0 = true;
                    this.j0 = true;
                    return;
                }
                return;
            }
            this.p0 = (C2181a) op0.m42519i(if7VarM6881T.f28594b);
            s0();
        }
        try {
            gth.m29480a("drainAndFeedDecoder");
            while (p0(j, j2)) {
            }
            while (q0(j)) {
            }
            gth.m29481b();
        } catch (bd8 e) {
            throw m6877P(e, null, 4003);
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o, androidx.media3.exoplayer.InterfaceC2221p
    public String getName() {
        return "ImageRenderer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r2 >= r5) goto L14;
     */
    @Override // androidx.media3.exoplayer.AbstractC2193c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i0(C2181a[] c2181aArr, long j, long j2, x8b.C18076b c18076b) {
        super.i0(c2181aArr, j, j2, c18076b);
        if (this.k0.f17995b != -9223372036854775807L) {
            if (this.h0.isEmpty()) {
                long j3 = this.m0;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.l0;
                    if (j4 != -9223372036854775807L) {
                    }
                }
            }
            this.h0.add(new C12651a(this.m0, j2));
            return;
        }
        this.k0 = new C12651a(-9223372036854775807L, j2);
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    public boolean isReady() {
        int i = this.o0;
        return i == 3 || (i == 0 && this.u0);
    }

    public final boolean n0(C2181a c2181a) {
        int iMo16898a = this.f17991Y.mo16898a(c2181a);
        return iMo16898a == InterfaceC2221p.m7447s(4) || iMo16898a == InterfaceC2221p.m7447s(3);
    }

    public final Bitmap o0(int i) {
        op0.m42519i(this.t0);
        int width = this.t0.getWidth() / ((C2181a) op0.m42519i(this.p0)).f7926I;
        int height = this.t0.getHeight() / ((C2181a) op0.m42519i(this.p0)).f7927J;
        int i2 = this.p0.f7926I;
        return Bitmap.createBitmap(this.t0, (i % i2) * width, (i / i2) * height, width, height);
    }

    public final boolean p0(long j, long j2) throws qm6 {
        if (this.t0 != null && this.v0 == null) {
            return false;
        }
        if (this.o0 == 0 && getState() != 2) {
            return false;
        }
        if (this.t0 == null) {
            op0.m42519i(this.q0);
            pd8 pd8VarMo16896a = this.q0.mo16896a();
            if (pd8VarMo16896a == null) {
                return false;
            }
            if (((pd8) op0.m42519i(pd8VarMo16896a)).m50150n()) {
                if (this.n0 == 3) {
                    y0();
                    op0.m42519i(this.p0);
                    s0();
                } else {
                    ((pd8) op0.m42519i(pd8VarMo16896a)).mo18274u();
                    if (this.h0.isEmpty()) {
                        this.j0 = true;
                    }
                }
                return false;
            }
            op0.m42520j(pd8VarMo16896a.f39899e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.t0 = pd8VarMo16896a.f39899e;
            ((pd8) op0.m42519i(pd8VarMo16896a)).mo18274u();
        }
        if (!this.u0 || this.t0 == null || this.v0 == null) {
            return false;
        }
        op0.m42519i(this.p0);
        C2181a c2181a = this.p0;
        int i = c2181a.f7926I;
        boolean z = ((i == 1 && c2181a.f7927J == 1) || i == -1 || c2181a.f7927J == -1) ? false : true;
        if (!this.v0.m21062d()) {
            C12652b c12652b = this.v0;
            c12652b.m21063e(z ? o0(c12652b.m21061c()) : (Bitmap) op0.m42519i(this.t0));
        }
        if (!x0(j, j2, (Bitmap) op0.m42519i(this.v0.m21060b()), this.v0.m21059a())) {
            return false;
        }
        w0(((C12652b) op0.m42519i(this.v0)).m21059a());
        this.o0 = 3;
        if (!z || ((C12652b) op0.m42519i(this.v0)).m21061c() == (((C2181a) op0.m42519i(this.p0)).f7927J * ((C2181a) op0.m42519i(this.p0)).f7926I) - 1) {
            this.t0 = null;
        }
        this.v0 = this.w0;
        this.w0 = null;
        return true;
    }

    public final boolean q0(long j) {
        if (this.u0 && this.v0 != null) {
            return false;
        }
        if7 if7VarM6881T = m6881T();
        ad8 ad8Var = this.q0;
        if (ad8Var == null || this.n0 == 3 || this.i0) {
            return false;
        }
        if (this.r0 == null) {
            a85 a85Var = (a85) ad8Var.mo18817e();
            this.r0 = a85Var;
            if (a85Var == null) {
                return false;
            }
        }
        if (this.n0 == 2) {
            op0.m42519i(this.r0);
            this.r0.m50154t(4);
            ((ad8) op0.m42519i(this.q0)).m16897f(this.r0);
            this.r0 = null;
            this.n0 = 3;
            return false;
        }
        int iK0 = k0(if7VarM6881T, this.r0, 0);
        if (iK0 == -5) {
            this.p0 = (C2181a) op0.m42519i(if7VarM6881T.f28594b);
            this.n0 = 2;
            return true;
        }
        if (iK0 != -4) {
            if (iK0 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.r0.m16677w();
        boolean z = ((ByteBuffer) op0.m42519i(this.r0.f14282d)).remaining() > 0 || ((a85) op0.m42519i(this.r0)).m50150n();
        if (z) {
            ((ad8) op0.m42519i(this.q0)).m16897f((a85) op0.m42519i(this.r0));
            this.x0 = 0;
        }
        v0(j, (a85) op0.m42519i(this.r0));
        if (((a85) op0.m42519i(this.r0)).m50150n()) {
            this.i0 = true;
            this.r0 = null;
            return false;
        }
        this.m0 = Math.max(this.m0, ((a85) op0.m42519i(this.r0)).f14284f);
        if (z) {
            this.r0 = null;
        } else {
            ((a85) op0.m42519i(this.r0)).mo16674h();
        }
        return !this.u0;
    }

    public final void s0() throws qm6 {
        if (!n0(this.p0)) {
            throw m6877P(new bd8("Provided decoder factory can't create decoder for format."), this.p0, 4005);
        }
        ad8 ad8Var = this.q0;
        if (ad8Var != null) {
            ad8Var.release();
        }
        this.q0 = this.f17991Y.mo16899b();
    }

    public final boolean t0(C12652b c12652b) {
        return ((C2181a) op0.m42519i(this.p0)).f7926I == -1 || this.p0.f7927J == -1 || c12652b.m21061c() == (((C2181a) op0.m42519i(this.p0)).f7927J * this.p0.f7926I) - 1;
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c, androidx.media3.exoplayer.C2217n.b
    /* renamed from: u */
    public void mo6894u(int i, Object obj) {
        if (i != 15) {
            super.mo6894u(i, obj);
        } else {
            z0(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    public final void u0(int i) {
        this.o0 = Math.min(this.o0, i);
    }

    public final void v0(long j, a85 a85Var) {
        boolean z = true;
        if (a85Var.m50150n()) {
            this.u0 = true;
            return;
        }
        C12652b c12652b = new C12652b(this.x0, a85Var.f14284f);
        this.w0 = c12652b;
        this.x0++;
        if (!this.u0) {
            long jM21059a = c12652b.m21059a();
            boolean z2 = jM21059a - 30000 <= j && j <= 30000 + jM21059a;
            C12652b c12652b2 = this.v0;
            boolean z3 = c12652b2 != null && c12652b2.m21059a() <= j && j < jM21059a;
            boolean zT0 = t0((C12652b) op0.m42519i(this.w0));
            if (!z2 && !z3 && !zT0) {
                z = false;
            }
            this.u0 = z;
            if (z3 && !z2) {
                return;
            }
        }
        this.v0 = this.w0;
        this.w0 = null;
    }

    public final void w0(long j) {
        this.l0 = j;
        while (!this.h0.isEmpty() && j >= ((C12651a) this.h0.peek()).f17994a) {
            this.k0 = (C12651a) this.h0.removeFirst();
        }
    }

    public boolean x0(long j, long j2, Bitmap bitmap, long j3) {
        long j4 = j3 - j;
        if (!A0() && j4 >= 30000) {
            return false;
        }
        this.s0.onImageAvailable(j3 - this.k0.f17995b, bitmap);
        return true;
    }

    public final void y0() {
        this.r0 = null;
        this.n0 = 0;
        this.m0 = -9223372036854775807L;
        ad8 ad8Var = this.q0;
        if (ad8Var != null) {
            ad8Var.release();
            this.q0 = null;
        }
    }

    public final void z0(ImageOutput imageOutput) {
        this.s0 = r0(imageOutput);
    }
}
