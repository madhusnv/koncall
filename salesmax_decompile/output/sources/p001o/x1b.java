package p001o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.AbstractC2193c;
import androidx.media3.exoplayer.InterfaceC2218o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.a85;
import p001o.fz5;
import p001o.j2b;
import p001o.m1b;
import p001o.x8b;

/* loaded from: classes2.dex */
public abstract class x1b extends AbstractC2193c {
    public static final byte[] u1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public C2181a A0;
    public MediaFormat B0;
    public boolean C0;
    public float D0;
    public ArrayDeque E0;
    public C18034d F0;
    public q1b G0;
    public int H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public long T0;
    public int U0;
    public int V0;
    public ByteBuffer W0;
    public boolean X0;

    /* renamed from: Y */
    public final m1b.InterfaceC15199b f53063Y;
    public boolean Y0;

    /* renamed from: Z */
    public final a2b f53064Z;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public boolean c1;
    public int d1;
    public int e1;
    public int f1;
    public boolean g1;
    public final boolean h0;
    public boolean h1;
    public final float i0;
    public boolean i1;
    public final a85 j0;
    public long j1;
    public final a85 k0;
    public long k1;
    public final a85 l0;
    public boolean l1;
    public final vf1 m0;
    public boolean m1;
    public final MediaCodec.BufferInfo n0;
    public boolean n1;
    public final ArrayDeque o0;
    public boolean o1;
    public final y9c p0;
    public qm6 p1;
    public C2181a q0;
    public y75 q1;
    public C2181a r0;
    public C18036f r1;
    public fz5 s0;
    public long s1;
    public fz5 t0;
    public boolean t1;
    public InterfaceC2218o.a u0;
    public MediaCrypto v0;
    public long w0;
    public float x0;
    public float y0;
    public m1b z0;

    /* renamed from: o.x1b$b */
    public static final class C18032b {
        /* renamed from: a */
        public static boolean m55569a(m1b m1bVar, C18035e c18035e) {
            return m1bVar.mo23727j(c18035e);
        }
    }

    /* renamed from: o.x1b$c */
    public static final class C18033c {
        /* renamed from: a */
        public static void m55570a(m1b.C15198a c15198a, jbd jbdVar) {
            LogSessionId logSessionIdM33479a = jbdVar.m33479a();
            if (logSessionIdM33479a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            c15198a.f34637b.setString("log-session-id", logSessionIdM33479a.getStringId());
        }
    }

    /* renamed from: o.x1b$e */
    public final class C18035e implements m1b.InterfaceC15200c {
        public C18035e() {
        }

        @Override // p001o.m1b.InterfaceC15200c
        /* renamed from: a */
        public void mo38181a() {
            if (x1b.this.u0 != null) {
                x1b.this.u0.mo7254b();
            }
        }

        @Override // p001o.m1b.InterfaceC15200c
        /* renamed from: b */
        public void mo38182b() {
            if (x1b.this.u0 != null) {
                x1b.this.u0.mo7254b();
            }
        }
    }

    /* renamed from: o.x1b$f */
    public static final class C18036f {

        /* renamed from: e */
        public static final C18036f f53071e = new C18036f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a */
        public final long f53072a;

        /* renamed from: b */
        public final long f53073b;

        /* renamed from: c */
        public final long f53074c;

        /* renamed from: d */
        public final kmh f53075d = new kmh();

        public C18036f(long j, long j2, long j3) {
            this.f53072a = j;
            this.f53073b = j2;
            this.f53074c = j3;
        }
    }

    public x1b(int i, m1b.InterfaceC15199b interfaceC15199b, a2b a2bVar, boolean z, float f) {
        super(i);
        this.f53063Y = interfaceC15199b;
        this.f53064Z = (a2b) op0.m42515e(a2bVar);
        this.h0 = z;
        this.i0 = f;
        this.j0 = a85.m16673y();
        this.k0 = new a85(0);
        this.l0 = new a85(2);
        vf1 vf1Var = new vf1();
        this.m0 = vf1Var;
        this.n0 = new MediaCodec.BufferInfo();
        this.x0 = 1.0f;
        this.y0 = 1.0f;
        this.w0 = -9223372036854775807L;
        this.o0 = new ArrayDeque();
        this.r1 = C18036f.f53071e;
        vf1Var.m16676v(0);
        vf1Var.f14282d.order(ByteOrder.nativeOrder());
        this.p0 = new y9c();
        this.D0 = -1.0f;
        this.H0 = 0;
        this.d1 = 0;
        this.U0 = -1;
        this.V0 = -1;
        this.T0 = -9223372036854775807L;
        this.j1 = -9223372036854775807L;
        this.k1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
        this.e1 = 0;
        this.f1 = 0;
        this.q1 = new y75();
    }

    public static boolean S1(C2181a c2181a) {
        int i = c2181a.f7928K;
        return i == 0 || i == 2;
    }

    public static boolean i1(IllegalStateException illegalStateException) {
        if (sqi.f45790a >= 21 && j1(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    public static boolean j1(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    public static boolean k1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    public static boolean s0(String str, C2181a c2181a) {
        return sqi.f45790a < 21 && c2181a.f7946q.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean t0(String str) {
        if (sqi.f45790a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(sqi.f45792c)) {
            String str2 = sqi.f45791b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    public static boolean u0(String str) {
        int i = sqi.f45790a;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i == 19) {
                String str2 = sqi.f45791b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean v0(String str) {
        return sqi.f45790a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean w0(q1b q1bVar) {
        String str = q1bVar.f41088a;
        int i = sqi.f45790a;
        return (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(sqi.f45792c) && "AFTS".equals(sqi.f45793d) && q1bVar.f41094g);
    }

    public static boolean x0(String str) {
        return sqi.f45790a == 19 && sqi.f45793d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str));
    }

    public static boolean y0(String str) {
        return sqi.f45790a == 29 && "c2.android.aac.decoder".equals(str);
    }

    public final void A0() {
        this.b1 = false;
        this.m0.mo16674h();
        this.l0.mo16674h();
        this.a1 = false;
        this.Z0 = false;
        this.p0.m57408d();
    }

    public final boolean A1(int i) throws MediaCryptoException, qm6 {
        if7 if7VarM6881T = m6881T();
        this.j0.mo16674h();
        int iK0 = k0(if7VarM6881T, this.j0, i | 4);
        if (iK0 == -5) {
            q1(if7VarM6881T);
            return true;
        }
        if (iK0 != -4 || !this.j0.m50150n()) {
            return false;
        }
        this.l1 = true;
        x1();
        return false;
    }

    public final boolean B0() {
        if (this.g1) {
            this.e1 = 1;
            if (this.J0 || this.L0) {
                this.f1 = 3;
                return false;
            }
            this.f1 = 1;
        }
        return true;
    }

    public final void B1() throws qm6 {
        C1();
        l1();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: C */
    public final long mo7427C(long j, long j2) {
        return S0(this.S0, j, j2);
    }

    public final void C0() throws qm6 {
        if (!this.g1) {
            B1();
        } else {
            this.e1 = 1;
            this.f1 = 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void C1() {
        try {
            m1b m1bVar = this.z0;
            if (m1bVar != null) {
                m1bVar.release();
                this.q1.f55014b++;
                p1(((q1b) op0.m42515e(this.G0)).f41088a);
            }
            this.z0 = null;
            try {
                MediaCrypto mediaCrypto = this.v0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.z0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.v0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public final boolean D0() throws MediaCryptoException, qm6 {
        if (this.g1) {
            this.e1 = 1;
            if (this.J0 || this.L0) {
                this.f1 = 3;
                return false;
            }
            this.f1 = 2;
        } else {
            U1();
        }
        return true;
    }

    public void D1() {
    }

    public final boolean E0(long j, long j2) throws MediaCryptoException, qm6 {
        boolean z;
        boolean zY1;
        ByteBuffer byteBuffer;
        int i;
        MediaCodec.BufferInfo bufferInfo;
        int iMo23730m;
        m1b m1bVar = (m1b) op0.m42515e(this.z0);
        if (!a1()) {
            if (this.M0 && this.h1) {
                try {
                    iMo23730m = m1bVar.mo23730m(this.n0);
                } catch (IllegalStateException unused) {
                    x1();
                    if (this.m1) {
                        C1();
                    }
                    return false;
                }
            } else {
                iMo23730m = m1bVar.mo23730m(this.n0);
            }
            if (iMo23730m < 0) {
                if (iMo23730m == -2) {
                    z1();
                    return true;
                }
                if (this.R0 && (this.l1 || this.e1 == 2)) {
                    x1();
                }
                return false;
            }
            if (this.Q0) {
                this.Q0 = false;
                m1bVar.mo23731n(iMo23730m, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.n0;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                x1();
                return false;
            }
            this.V0 = iMo23730m;
            ByteBuffer byteBufferMo23732o = m1bVar.mo23732o(iMo23730m);
            this.W0 = byteBufferMo23732o;
            if (byteBufferMo23732o != null) {
                byteBufferMo23732o.position(this.n0.offset);
                ByteBuffer byteBuffer2 = this.W0;
                MediaCodec.BufferInfo bufferInfo3 = this.n0;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.N0) {
                MediaCodec.BufferInfo bufferInfo4 = this.n0;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0 && this.j1 != -9223372036854775807L) {
                    bufferInfo4.presentationTimeUs = this.k1;
                }
            }
            this.X0 = this.n0.presentationTimeUs < m6883V();
            long j3 = this.k1;
            this.Y0 = j3 != -9223372036854775807L && j3 <= this.n0.presentationTimeUs;
            V1(this.n0.presentationTimeUs);
        }
        if (this.M0 && this.h1) {
            try {
                byteBuffer = this.W0;
                i = this.V0;
                bufferInfo = this.n0;
                z = false;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                zY1 = y1(j, j2, m1bVar, byteBuffer, i, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.X0, this.Y0, (C2181a) op0.m42515e(this.r0));
            } catch (IllegalStateException unused3) {
                x1();
                if (this.m1) {
                    C1();
                }
                return z;
            }
        } else {
            z = false;
            ByteBuffer byteBuffer3 = this.W0;
            int i2 = this.V0;
            MediaCodec.BufferInfo bufferInfo5 = this.n0;
            zY1 = y1(j, j2, m1bVar, byteBuffer3, i2, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.X0, this.Y0, (C2181a) op0.m42515e(this.r0));
        }
        if (zY1) {
            t1(this.n0.presentationTimeUs);
            boolean z2 = (this.n0.flags & 4) != 0 ? true : z;
            H1();
            if (!z2) {
                return true;
            }
            x1();
        }
        return z;
    }

    public void E1() {
        G1();
        H1();
        this.T0 = -9223372036854775807L;
        this.h1 = false;
        this.g1 = false;
        this.P0 = false;
        this.Q0 = false;
        this.X0 = false;
        this.Y0 = false;
        this.j1 = -9223372036854775807L;
        this.k1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
        this.e1 = 0;
        this.f1 = 0;
        this.d1 = this.c1 ? 1 : 0;
    }

    public final boolean F0(q1b q1bVar, C2181a c2181a, fz5 fz5Var, fz5 fz5Var2) {
        vc4 vc4VarMo27778d;
        vc4 vc4VarMo27778d2;
        if (fz5Var == fz5Var2) {
            return false;
        }
        if (fz5Var2 != null && fz5Var != null && (vc4VarMo27778d = fz5Var2.mo27778d()) != null && (vc4VarMo27778d2 = fz5Var.mo27778d()) != null && vc4VarMo27778d.getClass().equals(vc4VarMo27778d2.getClass())) {
            if (!(vc4VarMo27778d instanceof zj7)) {
                return false;
            }
            if (!fz5Var2.mo27775a().equals(fz5Var.mo27775a()) || sqi.f45790a < 23) {
                return true;
            }
            UUID uuid = dr1.f20427e;
            if (!uuid.equals(fz5Var.mo27775a()) && !uuid.equals(fz5Var2.mo27775a())) {
                return !q1bVar.f41094g && fz5Var2.mo27782i((String) op0.m42515e(c2181a.f7943n));
            }
        }
        return true;
    }

    public void F1() {
        E1();
        this.p1 = null;
        this.E0 = null;
        this.G0 = null;
        this.A0 = null;
        this.B0 = null;
        this.C0 = false;
        this.i1 = false;
        this.D0 = -1.0f;
        this.H0 = 0;
        this.I0 = false;
        this.J0 = false;
        this.K0 = false;
        this.L0 = false;
        this.M0 = false;
        this.N0 = false;
        this.O0 = false;
        this.R0 = false;
        this.S0 = false;
        this.c1 = false;
        this.d1 = 0;
    }

    public final boolean G0() throws MediaCryptoException, qm6 {
        int i;
        if (this.z0 == null || (i = this.e1) == 2 || this.l1) {
            return false;
        }
        if (i == 0 && P1()) {
            C0();
        }
        m1b m1bVar = (m1b) op0.m42515e(this.z0);
        if (this.U0 < 0) {
            int iMo23729l = m1bVar.mo23729l();
            this.U0 = iMo23729l;
            if (iMo23729l < 0) {
                return false;
            }
            this.k0.f14282d = m1bVar.mo23724g(iMo23729l);
            this.k0.mo16674h();
        }
        if (this.e1 == 1) {
            if (!this.R0) {
                this.h1 = true;
                m1bVar.mo23718a(this.U0, 0, 0, 0L, 4);
                G1();
            }
            this.e1 = 2;
            return false;
        }
        if (this.P0) {
            this.P0 = false;
            ByteBuffer byteBuffer = (ByteBuffer) op0.m42515e(this.k0.f14282d);
            byte[] bArr = u1;
            byteBuffer.put(bArr);
            m1bVar.mo23718a(this.U0, 0, bArr.length, 0L, 0);
            G1();
            this.g1 = true;
            return true;
        }
        if (this.d1 == 1) {
            for (int i2 = 0; i2 < ((C2181a) op0.m42515e(this.A0)).f7946q.size(); i2++) {
                ((ByteBuffer) op0.m42515e(this.k0.f14282d)).put((byte[]) this.A0.f7946q.get(i2));
            }
            this.d1 = 2;
        }
        int iPosition = ((ByteBuffer) op0.m42515e(this.k0.f14282d)).position();
        if7 if7VarM6881T = m6881T();
        try {
            int iK0 = k0(if7VarM6881T, this.k0, 0);
            if (iK0 == -3) {
                if (mo6890i()) {
                    this.k1 = this.j1;
                }
                return false;
            }
            if (iK0 == -5) {
                if (this.d1 == 2) {
                    this.k0.mo16674h();
                    this.d1 = 1;
                }
                q1(if7VarM6881T);
                return true;
            }
            if (this.k0.m50150n()) {
                this.k1 = this.j1;
                if (this.d1 == 2) {
                    this.k0.mo16674h();
                    this.d1 = 1;
                }
                this.l1 = true;
                if (!this.g1) {
                    x1();
                    return false;
                }
                try {
                    if (!this.R0) {
                        this.h1 = true;
                        m1bVar.mo23718a(this.U0, 0, 0, 0L, 4);
                        G1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw m6877P(e, this.q0, sqi.m48720Y(e.getErrorCode()));
                }
            }
            if (!this.g1 && !this.k0.m50152r()) {
                this.k0.mo16674h();
                if (this.d1 == 2) {
                    this.d1 = 1;
                }
                return true;
            }
            boolean zM16678x = this.k0.m16678x();
            if (zM16678x) {
                this.k0.f14281c.m55967b(iPosition);
            }
            if (this.I0 && !zM16678x) {
                irb.m32613b((ByteBuffer) op0.m42515e(this.k0.f14282d));
                if (((ByteBuffer) op0.m42515e(this.k0.f14282d)).position() == 0) {
                    return true;
                }
                this.I0 = false;
            }
            long j = this.k0.f14284f;
            if (this.n1) {
                if (this.o0.isEmpty()) {
                    this.r1.f53075d.m35933a(j, (C2181a) op0.m42515e(this.q0));
                } else {
                    ((C18036f) this.o0.peekLast()).f53075d.m35933a(j, (C2181a) op0.m42515e(this.q0));
                }
                this.n1 = false;
            }
            this.j1 = Math.max(this.j1, j);
            if (mo6890i() || this.k0.m50153s()) {
                this.k1 = this.j1;
            }
            this.k0.m16677w();
            if (this.k0.m50149m()) {
                Z0(this.k0);
            }
            v1(this.k0);
            int iM0 = M0(this.k0);
            try {
                if (zM16678x) {
                    ((m1b) op0.m42515e(m1bVar)).mo23720c(this.U0, 0, this.k0.f14281c, j, iM0);
                } else {
                    ((m1b) op0.m42515e(m1bVar)).mo23718a(this.U0, 0, ((ByteBuffer) op0.m42515e(this.k0.f14282d)).limit(), j, iM0);
                }
                G1();
                this.g1 = true;
                this.d1 = 0;
                this.q1.f55015c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw m6877P(e2, this.q0, sqi.m48720Y(e2.getErrorCode()));
            }
        } catch (a85.C12112a e3) {
            n1(e3);
            A1(0);
            H0();
            return true;
        }
    }

    public final void G1() {
        this.U0 = -1;
        this.k0.f14282d = null;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: H */
    public void mo7428H(float f, float f2) throws qm6 {
        this.x0 = f;
        this.y0 = f2;
        T1(this.A0);
    }

    public final void H0() {
        try {
            ((m1b) op0.m42519i(this.z0)).flush();
        } finally {
            E1();
        }
    }

    public final void H1() {
        this.V0 = -1;
        this.W0 = null;
    }

    public final boolean I0() throws MediaCryptoException, qm6 {
        boolean zJ0 = J0();
        if (zJ0) {
            l1();
        }
        return zJ0;
    }

    public final void I1(fz5 fz5Var) {
        fz5.m27774e(this.s0, fz5Var);
        this.s0 = fz5Var;
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c, androidx.media3.exoplayer.InterfaceC2221p
    /* renamed from: J */
    public final int mo6872J() {
        return 8;
    }

    public boolean J0() throws MediaCryptoException {
        if (this.z0 == null) {
            return false;
        }
        int i = this.f1;
        if (i == 3 || this.J0 || ((this.K0 && !this.i1) || (this.L0 && this.h1))) {
            C1();
            return true;
        }
        if (i == 2) {
            int i2 = sqi.f45790a;
            op0.m42517g(i2 >= 23);
            if (i2 >= 23) {
                try {
                    U1();
                } catch (qm6 e) {
                    ria.m46825i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    C1();
                    return true;
                }
            }
        }
        H0();
        return false;
    }

    public final void J1(C18036f c18036f) {
        this.r1 = c18036f;
        long j = c18036f.f53074c;
        if (j != -9223372036854775807L) {
            this.t1 = true;
            s1(j);
        }
    }

    public final List K0(boolean z) {
        C2181a c2181a = (C2181a) op0.m42515e(this.q0);
        List listR0 = R0(this.f53064Z, c2181a, z);
        if (listR0.isEmpty() && z) {
            listR0 = R0(this.f53064Z, c2181a, false);
            if (!listR0.isEmpty()) {
                ria.m46824h("MediaCodecRenderer", "Drm session requires secure decoder for " + c2181a.f7943n + ", but no secure decoder available. Trying to proceed with " + listR0 + ".");
            }
        }
        return listR0;
    }

    public final void K1() {
        this.o1 = true;
    }

    public final m1b L0() {
        return this.z0;
    }

    public final void L1(qm6 qm6Var) {
        this.p1 = qm6Var;
    }

    public int M0(a85 a85Var) {
        return 0;
    }

    public final void M1(fz5 fz5Var) {
        fz5.m27774e(this.t0, fz5Var);
        this.t0 = fz5Var;
    }

    public final q1b N0() {
        return this.G0;
    }

    public final boolean N1(long j) {
        return this.w0 == -9223372036854775807L || m6879R().elapsedRealtime() - j < this.w0;
    }

    public boolean O0() {
        return false;
    }

    public boolean O1(q1b q1bVar) {
        return true;
    }

    public abstract float P0(float f, C2181a c2181a, C2181a[] c2181aArr);

    public boolean P1() {
        return false;
    }

    public final MediaFormat Q0() {
        return this.B0;
    }

    public boolean Q1(C2181a c2181a) {
        return false;
    }

    public abstract List R0(a2b a2bVar, C2181a c2181a, boolean z);

    public abstract int R1(a2b a2bVar, C2181a c2181a);

    public long S0(boolean z, long j, long j2) {
        return super.mo7427C(j, j2);
    }

    public long T0() {
        return this.k1;
    }

    public final boolean T1(C2181a c2181a) throws qm6 {
        if (sqi.f45790a >= 23 && this.z0 != null && this.f1 != 3 && getState() != 0) {
            float fP0 = P0(this.y0, (C2181a) op0.m42515e(c2181a), m6885X());
            float f = this.D0;
            if (f == fP0) {
                return true;
            }
            if (fP0 == -1.0f) {
                C0();
                return false;
            }
            if (f == -1.0f && fP0 <= this.i0) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fP0);
            ((m1b) op0.m42515e(this.z0)).mo23719b(bundle);
            this.D0 = fP0;
        }
        return true;
    }

    public abstract m1b.C15198a U0(q1b q1bVar, C2181a c2181a, MediaCrypto mediaCrypto, float f);

    public final void U1() throws MediaCryptoException, qm6 {
        vc4 vc4VarMo27778d = ((fz5) op0.m42515e(this.t0)).mo27778d();
        if (vc4VarMo27778d instanceof zj7) {
            try {
                ((MediaCrypto) op0.m42515e(this.v0)).setMediaDrmSession(((zj7) vc4VarMo27778d).f57284b);
            } catch (MediaCryptoException e) {
                throw m6877P(e, this.q0, 6006);
            }
        }
        I1(this.t0);
        this.e1 = 0;
        this.f1 = 0;
    }

    public final long V0() {
        return this.r1.f53074c;
    }

    public final void V1(long j) {
        boolean z;
        C2181a c2181a = (C2181a) this.r1.f53075d.m35941j(j);
        if (c2181a == null && this.t1 && this.B0 != null) {
            c2181a = (C2181a) this.r1.f53075d.m35940i();
        }
        if (c2181a != null) {
            this.r0 = c2181a;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.C0 && this.r0 != null)) {
            r1((C2181a) op0.m42515e(this.r0), this.B0);
            this.C0 = false;
            this.t1 = false;
        }
    }

    public final long W0() {
        return this.r1.f53073b;
    }

    public float X0() {
        return this.x0;
    }

    public final InterfaceC2218o.a Y0() {
        return this.u0;
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    /* renamed from: Z */
    public void mo6887Z() throws MediaCryptoException {
        this.q0 = null;
        J1(C18036f.f53071e);
        this.o0.clear();
        J0();
    }

    public abstract void Z0(a85 a85Var);

    @Override // androidx.media3.exoplayer.InterfaceC2221p
    /* renamed from: a */
    public final int mo7449a(C2181a c2181a) throws qm6 {
        try {
            return R1(this.f53064Z, c2181a);
        } catch (j2b.C14435c e) {
            throw m6877P(e, c2181a, 4002);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void a0(boolean z, boolean z2) {
        this.q1 = new y75();
    }

    public final boolean a1() {
        return this.V0 >= 0;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: b */
    public boolean mo7429b() {
        return this.m1;
    }

    public final boolean b1() {
        if (!this.m0.m52692F()) {
            return true;
        }
        long jM6883V = m6883V();
        return h1(jM6883V, this.m0.m52690D()) == h1(jM6883V, this.l0.f14284f);
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void c0(long j, boolean z) throws MediaCryptoException, qm6 {
        this.l1 = false;
        this.m1 = false;
        this.o1 = false;
        if (this.Z0) {
            this.m0.mo16674h();
            this.l0.mo16674h();
            this.a1 = false;
            this.p0.m57408d();
        } else {
            I0();
        }
        if (this.r1.f53075d.m35943l() > 0) {
            this.n1 = true;
        }
        this.r1.f53075d.m35935c();
        this.o0.clear();
    }

    public final void c1(C2181a c2181a) {
        A0();
        String str = c2181a.f7943n;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.m0.m52693G(32);
        } else {
            this.m0.m52693G(1);
        }
        this.Z0 = true;
    }

    public final void d1(q1b q1bVar, MediaCrypto mediaCrypto) {
        C2181a c2181a = (C2181a) op0.m42515e(this.q0);
        String str = q1bVar.f41088a;
        int i = sqi.f45790a;
        float fP0 = i < 23 ? -1.0f : P0(this.y0, c2181a, m6885X());
        float f = fP0 > this.i0 ? fP0 : -1.0f;
        w1(c2181a);
        long jElapsedRealtime = m6879R().elapsedRealtime();
        m1b.C15198a c15198aU0 = U0(q1bVar, c2181a, mediaCrypto, f);
        if (i >= 31) {
            C18033c.m55570a(c15198aU0, m6884W());
        }
        try {
            gth.m29480a("createCodec:" + str);
            m1b m1bVarMo16985a = this.f53063Y.mo16985a(c15198aU0);
            this.z0 = m1bVarMo16985a;
            this.S0 = i >= 21 && C18032b.m55569a(m1bVarMo16985a, new C18035e());
            gth.m29481b();
            long jElapsedRealtime2 = m6879R().elapsedRealtime();
            if (!q1bVar.m44696m(c2181a)) {
                ria.m46824h("MediaCodecRenderer", sqi.m48702G("Format exceeds selected codec's capabilities [%s, %s]", C2181a.m6706g(c2181a), str));
            }
            this.G0 = q1bVar;
            this.D0 = f;
            this.A0 = c2181a;
            this.H0 = r0(str);
            this.I0 = s0(str, (C2181a) op0.m42515e(this.A0));
            this.J0 = x0(str);
            this.K0 = y0(str);
            this.L0 = u0(str);
            this.M0 = v0(str);
            this.N0 = t0(str);
            this.O0 = false;
            this.R0 = w0(q1bVar) || O0();
            if (((m1b) op0.m42515e(this.z0)).mo23726i()) {
                this.c1 = true;
                this.d1 = 1;
                this.P0 = this.H0 != 0;
            }
            if (getState() == 2) {
                this.T0 = m6879R().elapsedRealtime() + 1000;
            }
            this.q1.f55013a++;
            o1(str, c15198aU0, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            gth.m29481b();
            throw th;
        }
    }

    public final boolean e1() throws qm6 {
        op0.m42517g(this.v0 == null);
        fz5 fz5Var = this.s0;
        vc4 vc4VarMo27778d = fz5Var.mo27778d();
        if (zj7.f57282d && (vc4VarMo27778d instanceof zj7)) {
            int state = fz5Var.getState();
            if (state == 1) {
                fz5.C13592a c13592a = (fz5.C13592a) op0.m42515e(fz5Var.mo27777c());
                throw m6877P(c13592a, this.q0, c13592a.f24271a);
            }
            if (state != 4) {
                return false;
            }
        }
        if (vc4VarMo27778d == null) {
            return fz5Var.mo27777c() != null;
        }
        if (vc4VarMo27778d instanceof zj7) {
            zj7 zj7Var = (zj7) vc4VarMo27778d;
            try {
                this.v0 = new MediaCrypto(zj7Var.f57283a, zj7Var.f57284b);
            } catch (MediaCryptoException e) {
                throw m6877P(e, this.q0, 6006);
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void f0() {
        try {
            A0();
            C1();
        } finally {
            M1(null);
        }
    }

    public final boolean f1() {
        return this.Z0;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: g */
    public void mo7431g(long j, long j2) throws MediaCryptoException, qm6 {
        boolean z = false;
        if (this.o1) {
            this.o1 = false;
            x1();
        }
        qm6 qm6Var = this.p1;
        if (qm6Var != null) {
            this.p1 = null;
            throw qm6Var;
        }
        try {
            if (this.m1) {
                D1();
                return;
            }
            if (this.q0 != null || A1(2)) {
                l1();
                if (this.Z0) {
                    gth.m29480a("bypassRender");
                    while (p0(j, j2)) {
                    }
                    gth.m29481b();
                } else if (this.z0 != null) {
                    long jElapsedRealtime = m6879R().elapsedRealtime();
                    gth.m29480a("drainAndFeed");
                    while (E0(j, j2) && N1(jElapsedRealtime)) {
                    }
                    while (G0() && N1(jElapsedRealtime)) {
                    }
                    gth.m29481b();
                } else {
                    this.q1.f55016d += m0(j);
                    A1(1);
                }
                this.q1.m57335c();
            }
        } catch (IllegalStateException e) {
            if (!i1(e)) {
                throw e;
            }
            n1(e);
            if (sqi.f45790a >= 21 && k1(e)) {
                z = true;
            }
            if (z) {
                C1();
            }
            p1b p1bVarZ0 = z0(e, N0());
            throw m6878Q(p1bVarZ0, this.q0, z, p1bVarZ0.f39178c == 1101 ? 4006 : 4003);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void g0() {
    }

    public final boolean g1(C2181a c2181a) {
        return this.t0 == null && Q1(c2181a);
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void h0() {
    }

    public final boolean h1(long j, long j2) {
        C2181a c2181a;
        return j2 < j && !((c2181a = this.r0) != null && Objects.equals(c2181a.f7943n, "audio/opus") && vec.m52670g(j, j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r5 >= r1) goto L13;
     */
    @Override // androidx.media3.exoplayer.AbstractC2193c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i0(C2181a[] c2181aArr, long j, long j2, x8b.C18076b c18076b) {
        if (this.r1.f53074c == -9223372036854775807L) {
            J1(new C18036f(-9223372036854775807L, j, j2));
            return;
        }
        if (this.o0.isEmpty()) {
            long j3 = this.j1;
            if (j3 != -9223372036854775807L) {
                long j4 = this.s1;
                if (j4 != -9223372036854775807L) {
                }
            }
            J1(new C18036f(-9223372036854775807L, j, j2));
            if (this.r1.f53074c != -9223372036854775807L) {
                u1();
                return;
            }
            return;
        }
        this.o0.add(new C18036f(this.j1, j, j2));
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    public boolean isReady() {
        return this.q0 != null && (m6886Y() || a1() || (this.T0 != -9223372036854775807L && m6879R().elapsedRealtime() < this.T0));
    }

    public final void l1() throws qm6 {
        C2181a c2181a;
        if (this.z0 != null || this.Z0 || (c2181a = this.q0) == null) {
            return;
        }
        if (g1(c2181a)) {
            c1(c2181a);
            return;
        }
        I1(this.t0);
        if (this.s0 == null || e1()) {
            try {
                fz5 fz5Var = this.s0;
                m1(this.v0, fz5Var != null && fz5Var.mo27782i((String) op0.m42519i(c2181a.f7943n)));
            } catch (C18034d e) {
                throw m6877P(e, c2181a, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.v0;
        if (mediaCrypto == null || this.z0 != null) {
            return;
        }
        mediaCrypto.release();
        this.v0 = null;
    }

    public final void m1(MediaCrypto mediaCrypto, boolean z) throws C18034d {
        C2181a c2181a = (C2181a) op0.m42515e(this.q0);
        if (this.E0 == null) {
            try {
                List listK0 = K0(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.E0 = arrayDeque;
                if (this.h0) {
                    arrayDeque.addAll(listK0);
                } else if (!listK0.isEmpty()) {
                    this.E0.add((q1b) listK0.get(0));
                }
                this.F0 = null;
            } catch (j2b.C14435c e) {
                throw new C18034d(c2181a, e, z, -49998);
            }
        }
        if (this.E0.isEmpty()) {
            throw new C18034d(c2181a, (Throwable) null, z, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) op0.m42515e(this.E0);
        while (this.z0 == null) {
            q1b q1bVar = (q1b) op0.m42515e((q1b) arrayDeque2.peekFirst());
            if (!O1(q1bVar)) {
                return;
            }
            try {
                d1(q1bVar, mediaCrypto);
            } catch (Exception e2) {
                ria.m46825i("MediaCodecRenderer", "Failed to initialize decoder: " + q1bVar, e2);
                arrayDeque2.removeFirst();
                C18034d c18034d = new C18034d(c2181a, e2, z, q1bVar);
                n1(c18034d);
                if (this.F0 == null) {
                    this.F0 = c18034d;
                } else {
                    this.F0 = this.F0.m55574c(c18034d);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.F0;
                }
            }
        }
        this.E0 = null;
    }

    public abstract void n1(Exception exc);

    public final void o0() throws qm6 {
        op0.m42517g(!this.l1);
        if7 if7VarM6881T = m6881T();
        this.l0.mo16674h();
        do {
            this.l0.mo16674h();
            int iK0 = k0(if7VarM6881T, this.l0, 0);
            if (iK0 == -5) {
                q1(if7VarM6881T);
                return;
            }
            if (iK0 == -4) {
                if (!this.l0.m50150n()) {
                    this.j1 = Math.max(this.j1, this.l0.f14284f);
                    if (mo6890i() || this.k0.m50153s()) {
                        this.k1 = this.j1;
                    }
                    if (this.n1) {
                        C2181a c2181a = (C2181a) op0.m42515e(this.q0);
                        this.r0 = c2181a;
                        if (Objects.equals(c2181a.f7943n, "audio/opus") && !this.r0.f7946q.isEmpty()) {
                            this.r0 = ((C2181a) op0.m42515e(this.r0)).m6707a().m6759V(vec.m52669f((byte[]) this.r0.f7946q.get(0))).m6748K();
                        }
                        r1(this.r0, null);
                        this.n1 = false;
                    }
                    this.l0.m16677w();
                    C2181a c2181a2 = this.r0;
                    if (c2181a2 != null && Objects.equals(c2181a2.f7943n, "audio/opus")) {
                        if (this.l0.m50149m()) {
                            a85 a85Var = this.l0;
                            a85Var.f14280b = this.r0;
                            Z0(a85Var);
                        }
                        if (vec.m52670g(m6883V(), this.l0.f14284f)) {
                            this.p0.m57405a(this.l0, ((C2181a) op0.m42515e(this.r0)).f7946q);
                        }
                    }
                    if (!b1()) {
                        break;
                    }
                } else {
                    this.l1 = true;
                    this.k1 = this.j1;
                    return;
                }
            } else {
                if (iK0 != -3) {
                    throw new IllegalStateException();
                }
                if (mo6890i()) {
                    this.k1 = this.j1;
                    return;
                }
                return;
            }
        } while (this.m0.m52687A(this.l0));
        this.a1 = true;
    }

    public abstract void o1(String str, m1b.C15198a c15198a, long j, long j2);

    public final boolean p0(long j, long j2) throws qm6 {
        boolean z;
        op0.m42517g(!this.m1);
        if (this.m0.m52692F()) {
            vf1 vf1Var = this.m0;
            if (!y1(j, j2, null, vf1Var.f14282d, this.V0, 0, vf1Var.m52691E(), this.m0.m52689C(), h1(m6883V(), this.m0.m52690D()), this.m0.m50150n(), (C2181a) op0.m42515e(this.r0))) {
                return false;
            }
            t1(this.m0.m52690D());
            this.m0.mo16674h();
            z = false;
        } else {
            z = false;
        }
        if (this.l1) {
            this.m1 = true;
            return z;
        }
        if (this.a1) {
            op0.m42517g(this.m0.m52687A(this.l0));
            this.a1 = z;
        }
        if (this.b1) {
            if (this.m0.m52692F()) {
                return true;
            }
            A0();
            this.b1 = z;
            l1();
            if (!this.Z0) {
                return z;
            }
        }
        o0();
        if (this.m0.m52692F()) {
            this.m0.m16677w();
        }
        if (this.m0.m52692F() || this.l1 || this.b1) {
            return true;
        }
        return z;
    }

    public abstract void p1(String str);

    public abstract c85 q0(q1b q1bVar, C2181a c2181a, C2181a c2181a2);

    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c85 q1(if7 if7Var) throws qm6 {
        int i;
        boolean z = true;
        this.n1 = true;
        C2181a c2181aM6748K = (C2181a) op0.m42515e(if7Var.f28594b);
        String str = c2181aM6748K.f7943n;
        if (str == null) {
            throw m6877P(new IllegalArgumentException("Sample MIME type is null."), c2181aM6748K, 4005);
        }
        if (Objects.equals(str, "video/av01") && !c2181aM6748K.f7946q.isEmpty()) {
            c2181aM6748K = c2181aM6748K.m6707a().b0(null).m6748K();
        }
        C2181a c2181a = c2181aM6748K;
        M1(if7Var.f28593a);
        this.q0 = c2181a;
        if (this.Z0) {
            this.b1 = true;
            return null;
        }
        m1b m1bVar = this.z0;
        if (m1bVar == null) {
            this.E0 = null;
            l1();
            return null;
        }
        q1b q1bVar = (q1b) op0.m42515e(this.G0);
        C2181a c2181a2 = (C2181a) op0.m42515e(this.A0);
        if (F0(q1bVar, c2181a, this.s0, this.t0)) {
            C0();
            return new c85(q1bVar.f41088a, c2181a2, c2181a, 0, 128);
        }
        boolean z2 = this.t0 != this.s0;
        op0.m42517g(!z2 || sqi.f45790a >= 23);
        c85 c85VarQ0 = q0(q1bVar, c2181a2, c2181a);
        int i2 = c85VarQ0.f17499d;
        if (i2 != 0) {
            i = 16;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (T1(c2181a)) {
                        this.A0 = c2181a;
                        if (z2 && !D0()) {
                            i = 2;
                        }
                    }
                } else if (T1(c2181a)) {
                    this.c1 = true;
                    this.d1 = 1;
                    int i3 = this.H0;
                    if (i3 != 2 && (i3 != 1 || c2181a.f7949t != c2181a2.f7949t || c2181a.f7950u != c2181a2.f7950u)) {
                        z = false;
                    }
                    this.P0 = z;
                    this.A0 = c2181a;
                    if (!z2 || D0()) {
                    }
                }
            } else if (T1(c2181a)) {
                this.A0 = c2181a;
                if (!z2 ? B0() : D0()) {
                }
            }
            return (c85VarQ0.f17499d != 0 || (this.z0 == m1bVar && this.f1 != 3)) ? c85VarQ0 : new c85(q1bVar.f41088a, c2181a2, c2181a, 0, i);
        }
        C0();
        i = 0;
        if (c85VarQ0.f17499d != 0) {
        }
    }

    public final int r0(String str) {
        int i = sqi.f45790a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = sqi.f45793d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = sqi.f45791b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public abstract void r1(C2181a c2181a, MediaFormat mediaFormat);

    public void s1(long j) {
    }

    public void t1(long j) {
        this.s1 = j;
        while (!this.o0.isEmpty() && j >= ((C18036f) this.o0.peek()).f53072a) {
            J1((C18036f) op0.m42515e((C18036f) this.o0.poll()));
            u1();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c, androidx.media3.exoplayer.C2217n.b
    /* renamed from: u */
    public void mo6894u(int i, Object obj) {
        if (i == 11) {
            this.u0 = (InterfaceC2218o.a) obj;
        } else {
            super.mo6894u(i, obj);
        }
    }

    public void u1() {
    }

    public void v1(a85 a85Var) {
    }

    public void w1(C2181a c2181a) {
    }

    public final void x1() throws MediaCryptoException, qm6 {
        int i = this.f1;
        if (i == 1) {
            H0();
            return;
        }
        if (i == 2) {
            H0();
            U1();
        } else if (i == 3) {
            B1();
        } else {
            this.m1 = true;
            D1();
        }
    }

    public abstract boolean y1(long j, long j2, m1b m1bVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C2181a c2181a);

    public p1b z0(Throwable th, q1b q1bVar) {
        return new p1b(th, q1bVar);
    }

    public final void z1() {
        this.i1 = true;
        MediaFormat mediaFormatMo23722e = ((m1b) op0.m42515e(this.z0)).mo23722e();
        if (this.H0 != 0 && mediaFormatMo23722e.getInteger("width") == 32 && mediaFormatMo23722e.getInteger("height") == 32) {
            this.Q0 = true;
            return;
        }
        if (this.O0) {
            mediaFormatMo23722e.setInteger("channel-count", 1);
        }
        this.B0 = mediaFormatMo23722e;
        this.C0 = true;
    }

    /* renamed from: o.x1b$d */
    public static class C18034d extends Exception {

        /* renamed from: a */
        public final String f53065a;

        /* renamed from: b */
        public final boolean f53066b;

        /* renamed from: c */
        public final q1b f53067c;

        /* renamed from: d */
        public final String f53068d;

        /* renamed from: e */
        public final C18034d f53069e;

        public C18034d(C2181a c2181a, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + c2181a, th, c2181a.f7943n, z, null, m55572b(i), null);
        }

        /* renamed from: b */
        public static String m55572b(int i) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        /* renamed from: d */
        public static String m55573d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* renamed from: c */
        public final C18034d m55574c(C18034d c18034d) {
            return new C18034d(getMessage(), getCause(), this.f53065a, this.f53066b, this.f53067c, this.f53068d, c18034d);
        }

        public C18034d(C2181a c2181a, Throwable th, boolean z, q1b q1bVar) {
            this("Decoder init failed: " + q1bVar.f41088a + ", " + c2181a, th, c2181a.f7943n, z, q1bVar, sqi.f45790a >= 21 ? m55573d(th) : null, null);
        }

        public C18034d(String str, Throwable th, String str2, boolean z, q1b q1bVar, String str3, C18034d c18034d) {
            super(str, th);
            this.f53065a = str2;
            this.f53066b = z;
            this.f53067c = q1bVar;
            this.f53068d = str3;
            this.f53069e = c18034d;
        }
    }
}
