package p001o;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.InterfaceC2218o;
import androidx.media3.exoplayer.InterfaceC2221p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import p001o.jz0;
import p001o.kz0;
import p001o.m1b;

/* loaded from: classes2.dex */
public class n1b extends x1b implements l1b {
    public boolean A1;
    public C2181a B1;
    public C2181a C1;
    public long D1;
    public boolean E1;
    public boolean F1;
    public boolean G1;
    public int H1;
    public boolean I1;
    public long J1;
    public final Context v1;
    public final jz0.C14682a w1;
    public final kz0 x1;
    public int y1;
    public boolean z1;

    /* renamed from: o.n1b$b */
    public static final class C15469b {
        /* renamed from: a */
        public static void m39994a(kz0 kz0Var, Object obj) {
            kz0Var.mo35286i((AudioDeviceInfo) obj);
        }
    }

    /* renamed from: o.n1b$c */
    public final class C15470c implements kz0.InterfaceC14940d {
        public C15470c() {
        }

        @Override // p001o.kz0.InterfaceC14940d
        /* renamed from: a */
        public void mo36357a(kz0.C14937a c14937a) {
            n1b.this.w1.m34769p(c14937a);
        }

        @Override // p001o.kz0.InterfaceC14940d
        /* renamed from: b */
        public void mo36358b(kz0.C14937a c14937a) {
            n1b.this.w1.m34768o(c14937a);
        }

        @Override // p001o.kz0.InterfaceC14940d
        /* renamed from: c */
        public void mo36359c(long j) {
            n1b.this.w1.m34763H(j);
        }

        @Override // p001o.kz0.InterfaceC14940d
        /* renamed from: d */
        public void mo36360d(boolean z) {
            n1b.this.w1.m34764I(z);
        }

        @Override // p001o.kz0.InterfaceC14940d
        /* renamed from: e */
        public void mo36361e(Exception exc) {
            ria.m46820d("MediaCodecAudioRenderer", "Audio sink error", exc);
            n1b.this.w1.m34767n(exc);
        }

        @Override // p001o.kz0.InterfaceC14940d
        /* renamed from: f */
        public void mo36362f() {
            n1b.this.G1 = true;
        }

        @Override // p001o.kz0.InterfaceC14940d
        /* renamed from: g */
        public void mo36363g() {
            InterfaceC2218o.a aVarY0 = n1b.this.Y0();
            if (aVarY0 != null) {
                aVarY0.mo7253a();
            }
        }

        @Override // p001o.kz0.InterfaceC14940d
        /* renamed from: h */
        public void mo36364h(int i, long j, long j2) {
            n1b.this.w1.m34765J(i, j, j2);
        }

        @Override // p001o.kz0.InterfaceC14940d
        /* renamed from: i */
        public void mo36365i() {
            n1b.this.e0();
        }

        @Override // p001o.kz0.InterfaceC14940d
        /* renamed from: j */
        public void mo36366j() {
            n1b.this.j2();
        }

        @Override // p001o.kz0.InterfaceC14940d
        /* renamed from: k */
        public void mo36367k() {
            InterfaceC2218o.a aVarY0 = n1b.this.Y0();
            if (aVarY0 != null) {
                aVarY0.mo7254b();
            }
        }
    }

    public n1b(Context context, m1b.InterfaceC15199b interfaceC15199b, a2b a2bVar, boolean z, Handler handler, jz0 jz0Var, kz0 kz0Var) {
        super(1, interfaceC15199b, a2bVar, z, 44100.0f);
        this.v1 = context.getApplicationContext();
        this.x1 = kz0Var;
        this.H1 = -1000;
        this.w1 = new jz0.C14682a(handler, jz0Var);
        this.J1 = -9223372036854775807L;
        kz0Var.mo35292o(new C15470c());
    }

    public static boolean b2(String str) {
        if (sqi.f45790a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(sqi.f45792c)) {
            String str2 = sqi.f45791b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    public static boolean c2(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    public static boolean d2() {
        if (sqi.f45790a == 23) {
            String str = sqi.f45793d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static List h2(a2b a2bVar, C2181a c2181a, boolean z, kz0 kz0Var) {
        q1b q1bVarM33140x;
        return c2181a.f7943n == null ? nf8.m40499E() : (!kz0Var.mo35279a(c2181a) || (q1bVarM33140x = j2b.m33140x()) == null) ? j2b.m33138v(a2bVar, c2181a, z, false) : nf8.m40500F(q1bVarM33140x);
    }

    @Override // p001o.x1b
    public void D1() throws qm6 {
        try {
            this.x1.mo35296s();
            if (T0() != -9223372036854775807L) {
                this.J1 = T0();
            }
        } catch (kz0.C14942f e) {
            throw m6878Q(e, e.f32866c, e.f32865b, f1() ? 5003 : 5002);
        }
    }

    @Override // p001o.l1b
    /* renamed from: G */
    public long mo7099G() {
        if (getState() == 2) {
            l2();
        }
        return this.D1;
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c, androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: N */
    public l1b mo6876N() {
        return this;
    }

    @Override // p001o.x1b
    public float P0(float f, C2181a c2181a, C2181a[] c2181aArr) {
        int iMax = -1;
        for (C2181a c2181a2 : c2181aArr) {
            int i = c2181a2.f7920C;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // p001o.x1b
    public boolean Q1(C2181a c2181a) {
        if (m6880S().f36978a != 0) {
            int iE2 = e2(c2181a);
            if ((iE2 & 512) != 0) {
                if (m6880S().f36978a == 2 || (iE2 & 1024) != 0) {
                    return true;
                }
                if (c2181a.f7922E == 0 && c2181a.f7923F == 0) {
                    return true;
                }
            }
        }
        return this.x1.mo35279a(c2181a);
    }

    @Override // p001o.x1b
    public List R0(a2b a2bVar, C2181a c2181a, boolean z) {
        return j2b.m33139w(h2(a2bVar, c2181a, z, this.x1), c2181a);
    }

    @Override // p001o.x1b
    public int R1(a2b a2bVar, C2181a c2181a) {
        int i;
        boolean z;
        if (!xeb.m56185m(c2181a.f7943n)) {
            return InterfaceC2221p.m7447s(0);
        }
        int i2 = sqi.f45790a >= 21 ? 32 : 0;
        boolean z2 = true;
        boolean z3 = c2181a.f7928K != 0;
        boolean zS1 = x1b.S1(c2181a);
        if (!zS1 || (z3 && j2b.m33140x() == null)) {
            i = 0;
        } else {
            int iE2 = e2(c2181a);
            if (this.x1.mo35279a(c2181a)) {
                return InterfaceC2221p.m7444o(4, 8, i2, iE2);
            }
            i = iE2;
        }
        if ("audio/raw".equals(c2181a.f7943n) && !this.x1.mo35279a(c2181a)) {
            return InterfaceC2221p.m7447s(1);
        }
        if (!this.x1.mo35279a(sqi.h0(2, c2181a.f7919B, c2181a.f7920C))) {
            return InterfaceC2221p.m7447s(1);
        }
        List listH2 = h2(a2bVar, c2181a, false, this.x1);
        if (listH2.isEmpty()) {
            return InterfaceC2221p.m7447s(1);
        }
        if (!zS1) {
            return InterfaceC2221p.m7447s(2);
        }
        q1b q1bVar = (q1b) listH2.get(0);
        boolean zM44696m = q1bVar.m44696m(c2181a);
        if (zM44696m) {
            z = true;
            z2 = zM44696m;
        } else {
            for (int i3 = 1; i3 < listH2.size(); i3++) {
                q1b q1bVar2 = (q1b) listH2.get(i3);
                if (q1bVar2.m44696m(c2181a)) {
                    z = false;
                    q1bVar = q1bVar2;
                    break;
                }
            }
            z = true;
            z2 = zM44696m;
        }
        return InterfaceC2221p.m7438A(z2 ? 4 : 3, (z2 && q1bVar.m44699p(c2181a)) ? 16 : 8, i2, q1bVar.f41095h ? 64 : 0, z ? 128 : 0, i);
    }

    @Override // p001o.x1b
    public long S0(boolean z, long j, long j2) {
        if (this.J1 == -9223372036854775807L) {
            return super.S0(z, j, j2);
        }
        long jO0 = (long) (((r0 - j) / (mo7104e() != null ? mo7104e().f31768a : 1.0f)) / 2.0f);
        if (this.I1) {
            jO0 -= sqi.O0(m6879R().elapsedRealtime()) - j2;
        }
        return Math.max(10000L, jO0);
    }

    @Override // p001o.x1b
    public m1b.C15198a U0(q1b q1bVar, C2181a c2181a, MediaCrypto mediaCrypto, float f) {
        this.y1 = g2(q1bVar, c2181a, m6885X());
        this.z1 = b2(q1bVar.f41088a);
        this.A1 = c2(q1bVar.f41088a);
        MediaFormat mediaFormatI2 = i2(c2181a, q1bVar.f41090c, this.y1, f);
        this.C1 = "audio/raw".equals(q1bVar.f41089b) && !"audio/raw".equals(c2181a.f7943n) ? c2181a : null;
        return m1b.C15198a.m38179a(q1bVar, mediaFormatI2, c2181a, mediaCrypto);
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.AbstractC2193c
    /* renamed from: Z */
    public void mo6887Z() {
        this.F1 = true;
        this.B1 = null;
        try {
            this.x1.flush();
            try {
                super.mo6887Z();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo6887Z();
                throw th;
            } finally {
            }
        }
    }

    @Override // p001o.x1b
    public void Z0(a85 a85Var) {
        C2181a c2181a;
        if (sqi.f45790a < 29 || (c2181a = a85Var.f14280b) == null || !Objects.equals(c2181a.f7943n, "audio/opus") || !f1()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) op0.m42515e(a85Var.f14285g);
        int i = ((C2181a) op0.m42515e(a85Var.f14280b)).f7922E;
        if (byteBuffer.remaining() == 8) {
            this.x1.mo35297t(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.AbstractC2193c
    public void a0(boolean z, boolean z2) {
        super.a0(z, z2);
        this.w1.m34773t(this.q1);
        if (m6880S().f36979b) {
            this.x1.mo35302z();
        } else {
            this.x1.mo35291n();
        }
        this.x1.mo35283f(m6884W());
        this.x1.mo35301y(m6879R());
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: b */
    public boolean mo7429b() {
        return super.mo7429b() && this.x1.mo35280b();
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.AbstractC2193c
    public void c0(long j, boolean z) throws MediaCryptoException, qm6 {
        super.c0(j, z);
        this.x1.flush();
        this.D1 = j;
        this.G1 = false;
        this.E1 = true;
    }

    @Override // p001o.l1b
    /* renamed from: d */
    public void mo7103d(kad kadVar) {
        this.x1.mo35281d(kadVar);
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void d0() {
        this.x1.release();
    }

    @Override // p001o.l1b
    /* renamed from: e */
    public kad mo7104e() {
        return this.x1.mo35282e();
    }

    public final int e2(C2181a c2181a) {
        ty0 ty0VarMo35285h = this.x1.mo35285h(c2181a);
        if (!ty0VarMo35285h.f48025a) {
            return 0;
        }
        int i = ty0VarMo35285h.f48026b ? 1536 : 512;
        return ty0VarMo35285h.f48027c ? i | 2048 : i;
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.AbstractC2193c
    public void f0() {
        this.G1 = false;
        try {
            super.f0();
        } finally {
            if (this.F1) {
                this.F1 = false;
                this.x1.reset();
            }
        }
    }

    public final int f2(q1b q1bVar, C2181a c2181a) {
        int i;
        if (!"OMX.google.raw.decoder".equals(q1bVar.f41088a) || (i = sqi.f45790a) >= 24 || (i == 23 && sqi.J0(this.v1))) {
            return c2181a.f7944o;
        }
        return -1;
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.AbstractC2193c
    public void g0() {
        super.g0();
        this.x1.mo35284g();
        this.I1 = true;
    }

    public int g2(q1b q1bVar, C2181a c2181a, C2181a[] c2181aArr) {
        int iF2 = f2(q1bVar, c2181a);
        if (c2181aArr.length == 1) {
            return iF2;
        }
        for (C2181a c2181a2 : c2181aArr) {
            if (q1bVar.m44690e(c2181a, c2181a2).f17499d != 0) {
                iF2 = Math.max(iF2, f2(q1bVar, c2181a2));
            }
        }
        return iF2;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o, androidx.media3.exoplayer.InterfaceC2221p
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.AbstractC2193c
    public void h0() {
        l2();
        this.I1 = false;
        this.x1.pause();
        super.h0();
    }

    public MediaFormat i2(C2181a c2181a, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", c2181a.f7919B);
        mediaFormat.setInteger("sample-rate", c2181a.f7920C);
        p2b.m42882e(mediaFormat, c2181a.f7946q);
        p2b.m42881d(mediaFormat, "max-input-size", i);
        int i2 = sqi.f45790a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !d2()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && "audio/ac4".equals(c2181a.f7943n)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.x1.mo35266A(sqi.h0(4, c2181a.f7919B, c2181a.f7920C)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.H1));
        }
        return mediaFormat;
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.InterfaceC2218o
    public boolean isReady() {
        return this.x1.mo35287j() || super.isReady();
    }

    public void j2() {
        this.E1 = true;
    }

    public final void k2() {
        m1b m1bVarL0 = L0();
        if (m1bVarL0 != null && sqi.f45790a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.H1));
            m1bVarL0.mo23719b(bundle);
        }
    }

    public final void l2() {
        long jMo35298u = this.x1.mo35298u(mo7429b());
        if (jMo35298u != Long.MIN_VALUE) {
            if (!this.E1) {
                jMo35298u = Math.max(this.D1, jMo35298u);
            }
            this.D1 = jMo35298u;
            this.E1 = false;
        }
    }

    @Override // p001o.x1b
    public void n1(Exception exc) {
        ria.m46820d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.w1.m34766m(exc);
    }

    @Override // p001o.x1b
    public void o1(String str, m1b.C15198a c15198a, long j, long j2) {
        this.w1.m34770q(str, j, j2);
    }

    @Override // p001o.x1b
    public void p1(String str) {
        this.w1.m34771r(str);
    }

    @Override // p001o.x1b
    public c85 q0(q1b q1bVar, C2181a c2181a, C2181a c2181a2) {
        c85 c85VarM44690e = q1bVar.m44690e(c2181a, c2181a2);
        int i = c85VarM44690e.f17500e;
        if (g1(c2181a2)) {
            i |= 32768;
        }
        if (f2(q1bVar, c2181a2) > this.y1) {
            i |= 64;
        }
        int i2 = i;
        return new c85(q1bVar.f41088a, c2181a, c2181a2, i2 != 0 ? 0 : c85VarM44690e.f17499d, i2);
    }

    @Override // p001o.x1b
    public c85 q1(if7 if7Var) throws qm6 {
        C2181a c2181a = (C2181a) op0.m42515e(if7Var.f28594b);
        this.B1 = c2181a;
        c85 c85VarQ1 = super.q1(if7Var);
        this.w1.m34774u(c2181a, c85VarQ1);
        return c85VarQ1;
    }

    @Override // p001o.x1b
    public void r1(C2181a c2181a, MediaFormat mediaFormat) throws qm6 {
        int i;
        C2181a c2181a2 = this.C1;
        int[] iArrM42922a = null;
        if (c2181a2 != null) {
            c2181a = c2181a2;
        } else if (L0() != null) {
            op0.m42515e(mediaFormat);
            C2181a c2181aM6748K = new C2181a.b().o0("audio/raw").i0("audio/raw".equals(c2181a.f7943n) ? c2181a.f7921D : (sqi.f45790a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? sqi.g0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).m6759V(c2181a.f7922E).m6760W(c2181a.f7923F).h0(c2181a.f7940k).m6757T(c2181a.f7941l).a0(c2181a.f7930a).c0(c2181a.f7931b).d0(c2181a.f7932c).e0(c2181a.f7933d).q0(c2181a.f7934e).m0(c2181a.f7935f).m6751N(mediaFormat.getInteger("channel-count")).p0(mediaFormat.getInteger("sample-rate")).m6748K();
            if (this.z1 && c2181aM6748K.f7919B == 6 && (i = c2181a.f7919B) < 6) {
                iArrM42922a = new int[i];
                for (int i2 = 0; i2 < c2181a.f7919B; i2++) {
                    iArrM42922a[i2] = i2;
                }
            } else if (this.A1) {
                iArrM42922a = p2j.m42922a(c2181aM6748K.f7919B);
            }
            c2181a = c2181aM6748K;
        }
        try {
            if (sqi.f45790a >= 29) {
                if (!f1() || m6880S().f36978a == 0) {
                    this.x1.mo35290m(0);
                } else {
                    this.x1.mo35290m(m6880S().f36978a);
                }
            }
            this.x1.mo35295r(c2181a, 0, iArrM42922a);
        } catch (kz0.C14938b e) {
            throw m6877P(e, e.f32858a, 5001);
        }
    }

    @Override // p001o.x1b
    public void s1(long j) {
        this.x1.m36356v(j);
    }

    @Override // p001o.l1b
    /* renamed from: t */
    public boolean mo7110t() {
        boolean z = this.G1;
        this.G1 = false;
        return z;
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.AbstractC2193c, androidx.media3.exoplayer.C2217n.b
    /* renamed from: u */
    public void mo6894u(int i, Object obj) {
        if (i == 2) {
            this.x1.mo35300x(((Float) op0.m42515e(obj)).floatValue());
            return;
        }
        if (i == 3) {
            this.x1.mo35289l((wx0) op0.m42515e((wx0) obj));
            return;
        }
        if (i == 6) {
            this.x1.mo35294q((v61) op0.m42515e((v61) obj));
            return;
        }
        if (i == 12) {
            if (sqi.f45790a >= 23) {
                C15469b.m39994a(this.x1, obj);
            }
        } else if (i == 16) {
            this.H1 = ((Integer) op0.m42515e(obj)).intValue();
            k2();
        } else if (i == 9) {
            this.x1.mo35267B(((Boolean) op0.m42515e(obj)).booleanValue());
        } else if (i != 10) {
            super.mo6894u(i, obj);
        } else {
            this.x1.mo35288k(((Integer) op0.m42515e(obj)).intValue());
        }
    }

    @Override // p001o.x1b
    public void u1() {
        super.u1();
        this.x1.mo35299w();
    }

    @Override // p001o.x1b
    public boolean y1(long j, long j2, m1b m1bVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C2181a c2181a) throws qm6 {
        op0.m42515e(byteBuffer);
        this.J1 = -9223372036854775807L;
        if (this.C1 != null && (i2 & 2) != 0) {
            ((m1b) op0.m42515e(m1bVar)).mo23731n(i, false);
            return true;
        }
        if (z) {
            if (m1bVar != null) {
                m1bVar.mo23731n(i, false);
            }
            this.q1.f55018f += i3;
            this.x1.mo35299w();
            return true;
        }
        try {
            if (!this.x1.mo35293p(byteBuffer, j3, i3)) {
                this.J1 = j3;
                return false;
            }
            if (m1bVar != null) {
                m1bVar.mo23731n(i, false);
            }
            this.q1.f55017e += i3;
            return true;
        } catch (kz0.C14939c e) {
            throw m6878Q(e, this.B1, e.f32860b, (!f1() || m6880S().f36978a == 0) ? 5001 : 5004);
        } catch (kz0.C14942f e2) {
            throw m6878Q(e2, c2181a, e2.f32865b, (!f1() || m6880S().f36978a == 0) ? 5002 : 5003);
        }
    }
}
