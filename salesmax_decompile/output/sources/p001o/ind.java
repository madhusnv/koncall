package p001o;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.C2181a;
import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.C2213j;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p001o.e9b;
import p001o.iz4;
import p001o.mz5;
import p001o.ra8;
import p001o.s0f;
import p001o.sga;
import p001o.x4b;
import p001o.xga;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class ind implements x4b, vq6, xga.InterfaceC18150b, xga.InterfaceC18154f, s0f.InterfaceC16711d {
    public static final Map C0 = m32465M();
    public static final C2181a D0 = new C2181a.b().a0("icy").o0("application/x-icy").m6748K();
    public boolean A0;
    public boolean B0;

    /* renamed from: H */
    public final dnd f28970H;

    /* renamed from: Y */
    public x4b.InterfaceC18049a f28975Y;

    /* renamed from: Z */
    public IcyHeaders f28976Z;

    /* renamed from: a */
    public final Uri f28977a;

    /* renamed from: b */
    public final dz4 f28978b;

    /* renamed from: c */
    public final nz5 f28979c;

    /* renamed from: d */
    public final sga f28980d;

    /* renamed from: e */
    public final e9b.C13130a f28981e;

    /* renamed from: f */
    public final mz5.C15451a f28982f;

    /* renamed from: g */
    public final InterfaceC14337c f28983g;

    /* renamed from: h */
    public final ob0 f28984h;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public C14340f n0;
    public zaf o0;
    public long p0;

    /* renamed from: q */
    public final String f28985q;
    public boolean q0;

    /* renamed from: s */
    public final long f28986s;
    public boolean s0;
    public boolean t0;
    public int u0;
    public boolean v0;
    public long w0;

    /* renamed from: x */
    public final long f28987x;
    public boolean y0;
    public int z0;

    /* renamed from: y */
    public final xga f28988y = new xga("ProgressiveMediaPeriod");

    /* renamed from: L */
    public final jq3 f28971L = new jq3();

    /* renamed from: M */
    public final Runnable f28972M = new Runnable() { // from class: o.end
        @Override // java.lang.Runnable
        public final void run() {
            this.f21962a.m32481V();
        }
    };

    /* renamed from: Q */
    public final Runnable f28973Q = new Runnable() { // from class: o.fnd
        @Override // java.lang.Runnable
        public final void run() {
            this.f23737a.m32466S();
        }
    };

    /* renamed from: X */
    public final Handler f28974X = sqi.m48747z();
    public C14339e[] i0 = new C14339e[0];
    public s0f[] h0 = new s0f[0];
    public long x0 = -9223372036854775807L;
    public int r0 = 1;

    /* renamed from: o.ind$a */
    public class C14335a extends rf7 {
        public C14335a(zaf zafVar) {
            super(zafVar);
        }

        @Override // p001o.rf7, p001o.zaf
        public long getDurationUs() {
            return ind.this.p0;
        }
    }

    /* renamed from: o.ind$b */
    public final class C14336b implements xga.InterfaceC18153e, ra8.InterfaceC16581a {

        /* renamed from: b */
        public final Uri f28991b;

        /* renamed from: c */
        public final o5g f28992c;

        /* renamed from: d */
        public final dnd f28993d;

        /* renamed from: e */
        public final vq6 f28994e;

        /* renamed from: f */
        public final jq3 f28995f;

        /* renamed from: h */
        public volatile boolean f28997h;

        /* renamed from: j */
        public long f28999j;

        /* renamed from: l */
        public uth f29001l;

        /* renamed from: m */
        public boolean f29002m;

        /* renamed from: g */
        public final ued f28996g = new ued();

        /* renamed from: i */
        public boolean f28998i = true;

        /* renamed from: a */
        public final long f28990a = tga.m49830a();

        /* renamed from: k */
        public iz4 f29000k = m32497h(0);

        public C14336b(Uri uri, dz4 dz4Var, dnd dndVar, vq6 vq6Var, jq3 jq3Var) {
            this.f28991b = uri;
            this.f28992c = new o5g(dz4Var);
            this.f28993d = dndVar;
            this.f28994e = vq6Var;
            this.f28995f = jq3Var;
        }

        @Override // p001o.ra8.InterfaceC16581a
        /* renamed from: a */
        public void mo32496a(zwc zwcVar) {
            long jMax = !this.f29002m ? this.f28999j : Math.max(ind.this.m32477O(true), this.f28999j);
            int iM60020a = zwcVar.m60020a();
            uth uthVar = (uth) op0.m42515e(this.f29001l);
            uthVar.m52027e(zwcVar, iM60020a);
            uthVar.mo7071a(jMax, 1, iM60020a, 0, null);
            this.f29002m = true;
        }

        @Override // p001o.xga.InterfaceC18153e
        /* renamed from: b */
        public void mo22073b() {
            this.f28997h = true;
        }

        /* renamed from: h */
        public final iz4 m32497h(long j) {
            return new iz4.C14403b().m32932i(this.f28991b).m32931h(j).m32929f(ind.this.f28985q).m32925b(6).m32928e(ind.C0).m32924a();
        }

        /* renamed from: i */
        public final void m32498i(long j, long j2) {
            this.f28996g.f48772a = j;
            this.f28999j = j2;
            this.f28998i = true;
            this.f29002m = false;
        }

        @Override // p001o.xga.InterfaceC18153e
        public void load() {
            int iMo23625b = 0;
            while (iMo23625b == 0 && !this.f28997h) {
                try {
                    long j = this.f28996g.f48772a;
                    iz4 iz4VarM32497h = m32497h(j);
                    this.f29000k = iz4VarM32497h;
                    long jMo23960e = this.f28992c.mo23960e(iz4VarM32497h);
                    if (this.f28997h) {
                        if (iMo23625b != 1 && this.f28993d.mo23627d() != -1) {
                            this.f28996g.f48772a = this.f28993d.mo23627d();
                        }
                        hz4.m31298a(this.f28992c);
                        return;
                    }
                    if (jMo23960e != -1) {
                        jMo23960e += j;
                        ind.this.a0();
                    }
                    long j2 = jMo23960e;
                    ind.this.f28976Z = IcyHeaders.m7542a(this.f28992c.mo23959b());
                    pu4 ra8Var = this.f28992c;
                    if (ind.this.f28976Z != null && ind.this.f28976Z.f8657f != -1) {
                        ra8Var = new ra8(this.f28992c, ind.this.f28976Z.f8657f, this);
                        uth uthVarM32478P = ind.this.m32478P();
                        this.f29001l = uthVarM32478P;
                        uthVarM32478P.mo7072b(ind.D0);
                    }
                    long jMo23627d = j;
                    this.f28993d.mo23628e(ra8Var, this.f28991b, this.f28992c.mo23959b(), j, j2, this.f28994e);
                    if (ind.this.f28976Z != null) {
                        this.f28993d.mo23626c();
                    }
                    if (this.f28998i) {
                        this.f28993d.mo23624a(jMo23627d, this.f28999j);
                        this.f28998i = false;
                    }
                    while (true) {
                        long j3 = jMo23627d;
                        while (iMo23625b == 0 && !this.f28997h) {
                            try {
                                this.f28995f.m34266a();
                                iMo23625b = this.f28993d.mo23625b(this.f28996g);
                                jMo23627d = this.f28993d.mo23627d();
                                if (jMo23627d > ind.this.f28986s + j3) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f28995f.m34268c();
                        ind.this.f28974X.post(ind.this.f28973Q);
                    }
                    if (iMo23625b == 1) {
                        iMo23625b = 0;
                    } else if (this.f28993d.mo23627d() != -1) {
                        this.f28996g.f48772a = this.f28993d.mo23627d();
                    }
                    hz4.m31298a(this.f28992c);
                } catch (Throwable th) {
                    if (iMo23625b != 1 && this.f28993d.mo23627d() != -1) {
                        this.f28996g.f48772a = this.f28993d.mo23627d();
                    }
                    hz4.m31298a(this.f28992c);
                    throw th;
                }
            }
        }
    }

    /* renamed from: o.ind$c */
    public interface InterfaceC14337c {
        /* renamed from: i */
        void mo32499i(long j, boolean z, boolean z2);
    }

    /* renamed from: o.ind$d */
    public final class C14338d implements t0f {

        /* renamed from: a */
        public final int f29004a;

        public C14338d(int i) {
            this.f29004a = i;
        }

        @Override // p001o.t0f
        /* renamed from: a */
        public void mo26371a() throws IOException {
            ind.this.m32485Z(this.f29004a);
        }

        @Override // p001o.t0f
        /* renamed from: f */
        public int mo26373f(if7 if7Var, a85 a85Var, int i) {
            return ind.this.f0(this.f29004a, if7Var, a85Var, i);
        }

        @Override // p001o.t0f
        public boolean isReady() {
            return ind.this.m32480R(this.f29004a);
        }

        @Override // p001o.t0f
        /* renamed from: p */
        public int mo26374p(long j) {
            return ind.this.j0(this.f29004a, j);
        }
    }

    /* renamed from: o.ind$e */
    public static final class C14339e {

        /* renamed from: a */
        public final int f29006a;

        /* renamed from: b */
        public final boolean f29007b;

        public C14339e(int i, boolean z) {
            this.f29006a = i;
            this.f29007b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C14339e.class != obj.getClass()) {
                return false;
            }
            C14339e c14339e = (C14339e) obj;
            return this.f29006a == c14339e.f29006a && this.f29007b == c14339e.f29007b;
        }

        public int hashCode() {
            return (this.f29006a * 31) + (this.f29007b ? 1 : 0);
        }
    }

    /* renamed from: o.ind$f */
    public static final class C14340f {

        /* renamed from: a */
        public final sth f29008a;

        /* renamed from: b */
        public final boolean[] f29009b;

        /* renamed from: c */
        public final boolean[] f29010c;

        /* renamed from: d */
        public final boolean[] f29011d;

        public C14340f(sth sthVar, boolean[] zArr) {
            this.f29008a = sthVar;
            this.f29009b = zArr;
            int i = sthVar.f45923a;
            this.f29010c = new boolean[i];
            this.f29011d = new boolean[i];
        }
    }

    public ind(Uri uri, dz4 dz4Var, dnd dndVar, nz5 nz5Var, mz5.C15451a c15451a, sga sgaVar, e9b.C13130a c13130a, InterfaceC14337c interfaceC14337c, ob0 ob0Var, String str, int i, long j) {
        this.f28977a = uri;
        this.f28978b = dz4Var;
        this.f28979c = nz5Var;
        this.f28982f = c15451a;
        this.f28980d = sgaVar;
        this.f28981e = c13130a;
        this.f28983g = interfaceC14337c;
        this.f28984h = ob0Var;
        this.f28985q = str;
        this.f28986s = i;
        this.f28970H = dndVar;
        this.f28987x = j;
    }

    /* renamed from: M */
    public static Map m32465M() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m32466S() {
        if (this.B0) {
            return;
        }
        ((x4b.InterfaceC18049a) op0.m42515e(this.f28975Y)).mo7010k(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m32467T() {
        this.v0 = true;
    }

    /* renamed from: K */
    public final void m32474K() {
        op0.m42517g(this.k0);
        op0.m42515e(this.n0);
        op0.m42515e(this.o0);
    }

    /* renamed from: L */
    public final boolean m32475L(C14336b c14336b, int i) {
        zaf zafVar;
        if (this.v0 || !((zafVar = this.o0) == null || zafVar.getDurationUs() == -9223372036854775807L)) {
            this.z0 = i;
            return true;
        }
        if (this.k0 && !l0()) {
            this.y0 = true;
            return false;
        }
        this.t0 = this.k0;
        this.w0 = 0L;
        this.z0 = 0;
        for (s0f s0fVar : this.h0) {
            s0fVar.m47417V();
        }
        c14336b.m32498i(0L, 0L);
        return true;
    }

    /* renamed from: N */
    public final int m32476N() {
        int iM47404H = 0;
        for (s0f s0fVar : this.h0) {
            iM47404H += s0fVar.m47404H();
        }
        return iM47404H;
    }

    /* renamed from: O */
    public final long m32477O(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.h0.length; i++) {
            if (z || ((C14340f) op0.m42515e(this.n0)).f29010c[i]) {
                jMax = Math.max(jMax, this.h0[i].m47397A());
            }
        }
        return jMax;
    }

    /* renamed from: P */
    public uth m32478P() {
        return e0(new C14339e(0, true));
    }

    /* renamed from: Q */
    public final boolean m32479Q() {
        return this.x0 != -9223372036854775807L;
    }

    /* renamed from: R */
    public boolean m32480R(int i) {
        return !l0() && this.h0[i].m47408L(this.A0);
    }

    /* renamed from: V */
    public final void m32481V() {
        if (this.B0 || this.k0 || !this.j0 || this.o0 == null) {
            return;
        }
        for (s0f s0fVar : this.h0) {
            if (s0fVar.m47403G() == null) {
                return;
            }
        }
        this.f28971L.m34268c();
        int length = this.h0.length;
        qth[] qthVarArr = new qth[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            C2181a c2181aM6748K = (C2181a) op0.m42515e(this.h0[i].m47403G());
            String str = c2181aM6748K.f7943n;
            boolean zM56185m = xeb.m56185m(str);
            boolean z = zM56185m || xeb.m56189q(str);
            zArr[i] = z;
            this.l0 = z | this.l0;
            this.m0 = this.f28987x != -9223372036854775807L && length == 1 && xeb.m56186n(str);
            IcyHeaders icyHeaders = this.f28976Z;
            if (icyHeaders != null) {
                if (zM56185m || this.i0[i].f29007b) {
                    Metadata metadata = c2181aM6748K.f7940k;
                    c2181aM6748K = c2181aM6748K.m6707a().h0(metadata == null ? new Metadata(icyHeaders) : metadata.m6693a(icyHeaders)).m6748K();
                }
                if (zM56185m && c2181aM6748K.f7936g == -1 && c2181aM6748K.f7937h == -1 && icyHeaders.f8652a != -1) {
                    c2181aM6748K = c2181aM6748K.m6707a().m6750M(icyHeaders.f8652a).m6748K();
                }
            }
            qthVarArr[i] = new qth(Integer.toString(i), c2181aM6748K.m6708b(this.f28979c.mo41293d(c2181aM6748K)));
        }
        this.n0 = new C14340f(new sth(qthVarArr), zArr);
        if (this.m0 && this.p0 == -9223372036854775807L) {
            this.p0 = this.f28987x;
            this.o0 = new C14335a(this.o0);
        }
        this.f28983g.mo32499i(this.p0, this.o0.mo25531h(), this.q0);
        this.k0 = true;
        ((x4b.InterfaceC18049a) op0.m42515e(this.f28975Y)).mo7240f(this);
    }

    /* renamed from: W */
    public final void m32482W(int i) {
        m32474K();
        C14340f c14340f = this.n0;
        boolean[] zArr = c14340f.f29011d;
        if (zArr[i]) {
            return;
        }
        C2181a c2181aM45839a = c14340f.f29008a.m48914b(i).m45839a(0);
        this.f28981e.m24552h(xeb.m56181i(c2181aM45839a.f7943n), c2181aM45839a, 0, null, this.w0);
        zArr[i] = true;
    }

    /* renamed from: X */
    public final void m32483X(int i) {
        m32474K();
        boolean[] zArr = this.n0.f29009b;
        if (this.y0 && zArr[i]) {
            if (this.h0[i].m47408L(false)) {
                return;
            }
            this.x0 = 0L;
            this.y0 = false;
            this.t0 = true;
            this.w0 = 0L;
            this.z0 = 0;
            for (s0f s0fVar : this.h0) {
                s0fVar.m47417V();
            }
            ((x4b.InterfaceC18049a) op0.m42515e(this.f28975Y)).mo7010k(this);
        }
    }

    /* renamed from: Y */
    public void m32484Y() throws IOException {
        this.f28988y.m56267k(this.f28980d.mo48310a(this.r0));
    }

    /* renamed from: Z */
    public void m32485Z(int i) throws IOException {
        this.h0[i].m47410O();
        m32484Y();
    }

    @Override // p001o.s0f.InterfaceC16711d
    /* renamed from: a */
    public void mo32486a(C2181a c2181a) {
        this.f28974X.post(this.f28972M);
    }

    public final void a0() {
        this.f28974X.post(new Runnable() { // from class: o.gnd
            @Override // java.lang.Runnable
            public final void run() {
                this.f25566a.m32467T();
            }
        });
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: b */
    public boolean mo7002b() {
        return this.f28988y.m56266j() && this.f28971L.m34269d();
    }

    @Override // p001o.xga.InterfaceC18150b
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void mo6964m(C14336b c14336b, long j, long j2, boolean z) {
        o5g o5gVar = c14336b.f28992c;
        tga tgaVar = new tga(c14336b.f28990a, c14336b.f29000k, o5gVar.m41628o(), o5gVar.m41629p(), j, j2, o5gVar.m41627n());
        this.f28980d.m48312c(c14336b.f28990a);
        this.f28981e.m24555q(tgaVar, 1, -1, null, 0, null, c14336b.f28999j, this.p0);
        if (z) {
            return;
        }
        for (s0f s0fVar : this.h0) {
            s0fVar.m47417V();
        }
        if (this.u0 > 0) {
            ((x4b.InterfaceC18049a) op0.m42515e(this.f28975Y)).mo7010k(this);
        }
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: c */
    public boolean mo7003c(C2213j c2213j) {
        if (this.A0 || this.f28988y.m56265i() || this.y0) {
            return false;
        }
        if (this.k0 && this.u0 == 0) {
            return false;
        }
        boolean zM34270e = this.f28971L.m34270e();
        if (this.f28988y.m56266j()) {
            return zM34270e;
        }
        k0();
        return true;
    }

    @Override // p001o.xga.InterfaceC18150b
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void mo6963k(C14336b c14336b, long j, long j2) {
        zaf zafVar;
        if (this.p0 == -9223372036854775807L && (zafVar = this.o0) != null) {
            boolean zMo25531h = zafVar.mo25531h();
            long jM32477O = m32477O(true);
            long j3 = jM32477O == Long.MIN_VALUE ? 0L : jM32477O + 10000;
            this.p0 = j3;
            this.f28983g.mo32499i(j3, zMo25531h, this.q0);
        }
        o5g o5gVar = c14336b.f28992c;
        tga tgaVar = new tga(c14336b.f28990a, c14336b.f29000k, o5gVar.m41628o(), o5gVar.m41629p(), j, j2, o5gVar.m41627n());
        this.f28980d.m48312c(c14336b.f28990a);
        this.f28981e.m24558t(tgaVar, 1, -1, null, 0, null, c14336b.f28999j, this.p0);
        this.A0 = true;
        ((x4b.InterfaceC18049a) op0.m42515e(this.f28975Y)).mo7010k(this);
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: d */
    public long mo7004d() {
        return mo7006g();
    }

    @Override // p001o.xga.InterfaceC18150b
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public xga.C18151c mo6965o(C14336b c14336b, long j, long j2, IOException iOException, int i) {
        boolean z;
        C14336b c14336b2;
        xga.C18151c c18151cM56262h;
        o5g o5gVar = c14336b.f28992c;
        tga tgaVar = new tga(c14336b.f28990a, c14336b.f29000k, o5gVar.m41628o(), o5gVar.m41629p(), j, j2, o5gVar.m41627n());
        long jMo48313d = this.f28980d.mo48313d(new sga.C16838c(tgaVar, new u2b(1, -1, null, 0, null, sqi.q1(c14336b.f28999j), sqi.q1(this.p0)), iOException, i));
        if (jMo48313d == -9223372036854775807L) {
            c18151cM56262h = xga.f53734g;
        } else {
            int iM32476N = m32476N();
            if (iM32476N > this.z0) {
                c14336b2 = c14336b;
                z = true;
            } else {
                z = false;
                c14336b2 = c14336b;
            }
            c18151cM56262h = m32475L(c14336b2, iM32476N) ? xga.m56262h(z, jMo48313d) : xga.f53733f;
        }
        boolean z2 = !c18151cM56262h.m56273c();
        this.f28981e.m24560v(tgaVar, 1, -1, null, 0, null, c14336b.f28999j, this.p0, iOException, z2);
        if (z2) {
            this.f28980d.m48312c(c14336b.f28990a);
        }
        return c18151cM56262h;
    }

    @Override // p001o.x4b
    /* renamed from: e */
    public long mo7005e(long j, abf abfVar) {
        m32474K();
        if (!this.o0.mo25531h()) {
            return 0L;
        }
        zaf.C18603a c18603aMo25530e = this.o0.mo25530e(j);
        return abfVar.m16823a(j, c18603aMo25530e.f56857a.f15877a, c18603aMo25530e.f56858b.f15877a);
    }

    public final uth e0(C14339e c14339e) {
        int length = this.h0.length;
        for (int i = 0; i < length; i++) {
            if (c14339e.equals(this.i0[i])) {
                return this.h0[i];
            }
        }
        if (this.j0) {
            ria.m46824h("ProgressiveMediaPeriod", "Extractor added new track (id=" + c14339e.f29006a + ") after finishing tracks.");
            return new nt5();
        }
        s0f s0fVarM47395k = s0f.m47395k(this.f28984h, this.f28979c, this.f28982f);
        s0fVarM47395k.d0(this);
        int i2 = length + 1;
        C14339e[] c14339eArr = (C14339e[]) Arrays.copyOf(this.i0, i2);
        c14339eArr[length] = c14339e;
        this.i0 = (C14339e[]) sqi.m48730i(c14339eArr);
        s0f[] s0fVarArr = (s0f[]) Arrays.copyOf(this.h0, i2);
        s0fVarArr[length] = s0fVarM47395k;
        this.h0 = (s0f[]) sqi.m48730i(s0fVarArr);
        return s0fVarM47395k;
    }

    @Override // p001o.vq6
    /* renamed from: f */
    public uth mo32487f(int i, int i2) {
        return e0(new C14339e(i, false));
    }

    public int f0(int i, if7 if7Var, a85 a85Var, int i2) {
        if (l0()) {
            return -3;
        }
        m32482W(i);
        int iM47414S = this.h0[i].m47414S(if7Var, a85Var, i2, this.A0);
        if (iM47414S == -3) {
            m32483X(i);
        }
        return iM47414S;
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: g */
    public long mo7006g() {
        long jM32477O;
        m32474K();
        if (this.A0 || this.u0 == 0) {
            return Long.MIN_VALUE;
        }
        if (m32479Q()) {
            return this.x0;
        }
        if (this.l0) {
            int length = this.h0.length;
            jM32477O = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C14340f c14340f = this.n0;
                if (c14340f.f29009b[i] && c14340f.f29010c[i] && !this.h0[i].m47407K()) {
                    jM32477O = Math.min(jM32477O, this.h0[i].m47397A());
                }
            }
        } else {
            jM32477O = Long.MAX_VALUE;
        }
        if (jM32477O == Long.MAX_VALUE) {
            jM32477O = m32477O(false);
        }
        return jM32477O == Long.MIN_VALUE ? this.w0 : jM32477O;
    }

    public void g0() {
        if (this.k0) {
            for (s0f s0fVar : this.h0) {
                s0fVar.m47413R();
            }
        }
        this.f28988y.m56269m(this);
        this.f28974X.removeCallbacksAndMessages(null);
        this.f28975Y = null;
        this.B0 = true;
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: h */
    public void mo7007h(long j) {
    }

    public final boolean h0(boolean[] zArr, long j) {
        int length = this.h0.length;
        for (int i = 0; i < length; i++) {
            s0f s0fVar = this.h0[i];
            if (!(this.m0 ? s0fVar.m47420Y(s0fVar.m47437y()) : s0fVar.m47421Z(j, false)) && (zArr[i] || !this.l0)) {
                return false;
            }
        }
        return true;
    }

    @Override // p001o.x4b
    /* renamed from: i */
    public long mo7008i(long j) {
        m32474K();
        boolean[] zArr = this.n0.f29009b;
        if (!this.o0.mo25531h()) {
            j = 0;
        }
        int i = 0;
        this.t0 = false;
        this.w0 = j;
        if (m32479Q()) {
            this.x0 = j;
            return j;
        }
        if (this.r0 != 7 && ((this.A0 || this.f28988y.m56266j()) && h0(zArr, j))) {
            return j;
        }
        this.y0 = false;
        this.x0 = j;
        this.A0 = false;
        if (this.f28988y.m56266j()) {
            s0f[] s0fVarArr = this.h0;
            int length = s0fVarArr.length;
            while (i < length) {
                s0fVarArr[i].m47430r();
                i++;
            }
            this.f28988y.m56263f();
        } else {
            this.f28988y.m56264g();
            s0f[] s0fVarArr2 = this.h0;
            int length2 = s0fVarArr2.length;
            while (i < length2) {
                s0fVarArr2[i].m47417V();
                i++;
            }
        }
        return j;
    }

    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final void m32468U(zaf zafVar) {
        this.o0 = this.f28976Z == null ? zafVar : new zaf.C18604b(-9223372036854775807L);
        this.p0 = zafVar.getDurationUs();
        boolean z = !this.v0 && zafVar.getDurationUs() == -9223372036854775807L;
        this.q0 = z;
        this.r0 = z ? 7 : 1;
        if (this.k0) {
            this.f28983g.mo32499i(this.p0, zafVar.mo25531h(), this.q0);
        } else {
            m32481V();
        }
    }

    @Override // p001o.x4b
    /* renamed from: j */
    public long mo7009j() {
        if (!this.t0) {
            return -9223372036854775807L;
        }
        if (!this.A0 && m32476N() <= this.z0) {
            return -9223372036854775807L;
        }
        this.t0 = false;
        return this.w0;
    }

    public int j0(int i, long j) {
        if (l0()) {
            return 0;
        }
        m32482W(i);
        s0f s0fVar = this.h0[i];
        int iM47402F = s0fVar.m47402F(j, this.A0);
        s0fVar.e0(iM47402F);
        if (iM47402F == 0) {
            m32483X(i);
        }
        return iM47402F;
    }

    public final void k0() {
        C14336b c14336b = new C14336b(this.f28977a, this.f28978b, this.f28970H, this, this.f28971L);
        if (this.k0) {
            op0.m42517g(m32479Q());
            long j = this.p0;
            if (j != -9223372036854775807L && this.x0 > j) {
                this.A0 = true;
                this.x0 = -9223372036854775807L;
                return;
            }
            c14336b.m32498i(((zaf) op0.m42515e(this.o0)).mo25530e(this.x0).f56857a.f15878b, this.x0);
            for (s0f s0fVar : this.h0) {
                s0fVar.b0(this.x0);
            }
            this.x0 = -9223372036854775807L;
        }
        this.z0 = m32476N();
        this.f28981e.m24564z(new tga(c14336b.f28990a, c14336b.f29000k, this.f28988y.m56270n(c14336b, this, this.f28980d.mo48310a(this.r0))), 1, -1, null, 0, null, c14336b.f28999j, this.p0);
    }

    @Override // p001o.xga.InterfaceC18154f
    /* renamed from: l */
    public void mo32488l() {
        for (s0f s0fVar : this.h0) {
            s0fVar.m47415T();
        }
        this.f28970H.release();
    }

    public final boolean l0() {
        return this.t0 || m32479Q();
    }

    @Override // p001o.x4b
    /* renamed from: n */
    public void mo7011n() throws IOException {
        m32484Y();
        if (this.A0 && !this.k0) {
            throw byc.m19921a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // p001o.vq6
    /* renamed from: p */
    public void mo32489p() {
        this.j0 = true;
        this.f28974X.post(this.f28972M);
    }

    @Override // p001o.x4b
    /* renamed from: q */
    public void mo7013q(x4b.InterfaceC18049a interfaceC18049a, long j) {
        this.f28975Y = interfaceC18049a;
        this.f28971L.m34270e();
        k0();
    }

    @Override // p001o.vq6
    /* renamed from: r */
    public void mo32490r(final zaf zafVar) {
        this.f28974X.post(new Runnable() { // from class: o.hnd
            @Override // java.lang.Runnable
            public final void run() {
                this.f27221a.m32468U(zafVar);
            }
        });
    }

    @Override // p001o.x4b
    /* renamed from: s */
    public sth mo7014s() {
        m32474K();
        return this.n0.f29008a;
    }

    @Override // p001o.x4b
    /* renamed from: t */
    public void mo7015t(long j, boolean z) {
        if (this.m0) {
            return;
        }
        m32474K();
        if (m32479Q()) {
            return;
        }
        boolean[] zArr = this.n0.f29010c;
        int length = this.h0.length;
        for (int i = 0; i < length; i++) {
            this.h0[i].m47429q(j, z, zArr[i]);
        }
    }

    @Override // p001o.x4b
    /* renamed from: u */
    public long mo7016u(ko6[] ko6VarArr, boolean[] zArr, t0f[] t0fVarArr, boolean[] zArr2, long j) {
        ko6 ko6Var;
        m32474K();
        C14340f c14340f = this.n0;
        sth sthVar = c14340f.f29008a;
        boolean[] zArr3 = c14340f.f29010c;
        int i = this.u0;
        int i2 = 0;
        for (int i3 = 0; i3 < ko6VarArr.length; i3++) {
            t0f t0fVar = t0fVarArr[i3];
            if (t0fVar != null && (ko6VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((C14338d) t0fVar).f29004a;
                op0.m42517g(zArr3[i4]);
                this.u0--;
                zArr3[i4] = false;
                t0fVarArr[i3] = null;
            }
        }
        boolean z = !this.s0 ? j == 0 || this.m0 : i != 0;
        for (int i5 = 0; i5 < ko6VarArr.length; i5++) {
            if (t0fVarArr[i5] == null && (ko6Var = ko6VarArr[i5]) != null) {
                op0.m42517g(ko6Var.length() == 1);
                op0.m42517g(ko6Var.mo22950f(0) == 0);
                int iM48916d = sthVar.m48916d(ko6Var.mo22953m());
                op0.m42517g(!zArr3[iM48916d]);
                this.u0++;
                zArr3[iM48916d] = true;
                t0fVarArr[i5] = new C14338d(iM48916d);
                zArr2[i5] = true;
                if (!z) {
                    s0f s0fVar = this.h0[iM48916d];
                    z = (s0fVar.m47400D() == 0 || s0fVar.m47421Z(j, true)) ? false : true;
                }
            }
        }
        if (this.u0 == 0) {
            this.y0 = false;
            this.t0 = false;
            if (this.f28988y.m56266j()) {
                s0f[] s0fVarArr = this.h0;
                int length = s0fVarArr.length;
                while (i2 < length) {
                    s0fVarArr[i2].m47430r();
                    i2++;
                }
                this.f28988y.m56263f();
            } else {
                this.A0 = false;
                s0f[] s0fVarArr2 = this.h0;
                int length2 = s0fVarArr2.length;
                while (i2 < length2) {
                    s0fVarArr2[i2].m47417V();
                    i2++;
                }
            }
        } else if (z) {
            j = mo7008i(j);
            while (i2 < t0fVarArr.length) {
                if (t0fVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.s0 = true;
        return j;
    }
}
