package androidx.media3.exoplayer.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.smoothstreaming.C2225a;
import androidx.media3.exoplayer.smoothstreaming.InterfaceC2226b;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p001o.be1;
import p001o.cd5;
import p001o.d1g;
import p001o.dz4;
import p001o.e1g;
import p001o.e9b;
import p001o.f9b;
import p001o.g07;
import p001o.juh;
import p001o.nuf;
import p001o.nz5;
import p001o.ob0;
import p001o.oe3;
import p001o.op0;
import p001o.pz5;
import p001o.qbg;
import p001o.qo3;
import p001o.qyc;
import p001o.s2b;
import p001o.sga;
import p001o.sqi;
import p001o.t2b;
import p001o.tga;
import p001o.u2b;
import p001o.ud5;
import p001o.ue5;
import p001o.x4b;
import p001o.x8b;
import p001o.xga;
import p001o.zga;

/* loaded from: classes2.dex */
public final class SsMediaSource extends be1 implements xga.InterfaceC18150b {

    /* renamed from: H */
    public final nz5 f8521H;

    /* renamed from: L */
    public final sga f8522L;

    /* renamed from: M */
    public final long f8523M;

    /* renamed from: Q */
    public final e9b.C13130a f8524Q;

    /* renamed from: X */
    public final qyc.InterfaceC16488a f8525X;

    /* renamed from: Y */
    public final ArrayList f8526Y;

    /* renamed from: Z */
    public dz4 f8527Z;

    /* renamed from: h */
    public final boolean f8528h;
    public xga h0;
    public zga i0;
    public juh j0;
    public long k0;
    public d1g l0;
    public Handler m0;
    public s2b n0;

    /* renamed from: q */
    public final Uri f8529q;

    /* renamed from: s */
    public final dz4.InterfaceC13064a f8530s;

    /* renamed from: x */
    public final InterfaceC2226b.a f8531x;

    /* renamed from: y */
    public final qo3 f8532y;

    public static final class Factory implements f9b {

        /* renamed from: j */
        public static final /* synthetic */ int f8533j = 0;

        /* renamed from: c */
        public final InterfaceC2226b.a f8534c;

        /* renamed from: d */
        public final dz4.InterfaceC13064a f8535d;

        /* renamed from: e */
        public qo3 f8536e;

        /* renamed from: f */
        public pz5 f8537f;

        /* renamed from: g */
        public sga f8538g;

        /* renamed from: h */
        public long f8539h;

        /* renamed from: i */
        public qyc.InterfaceC16488a f8540i;

        public Factory(dz4.InterfaceC13064a interfaceC13064a) {
            this(new C2225a.a(interfaceC13064a), interfaceC13064a);
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public SsMediaSource mo6940e(s2b s2bVar) {
            op0.m42515e(s2bVar.f44480b);
            qyc.InterfaceC16488a e1gVar = this.f8540i;
            if (e1gVar == null) {
                e1gVar = new e1g();
            }
            List list = s2bVar.f44480b.f44575d;
            return new SsMediaSource(s2bVar, null, this.f8535d, !list.isEmpty() ? new g07(e1gVar, list) : e1gVar, this.f8534c, this.f8536e, null, this.f8537f.mo44362a(s2bVar), this.f8538g, this.f8539h);
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory mo6937b(boolean z) {
            this.f8534c.mo7492b(z);
            return this;
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory mo6939d(pz5 pz5Var) {
            this.f8537f = (pz5) op0.m42516f(pz5Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory mo6938c(sga sgaVar) {
            this.f8538g = (sga) op0.m42516f(sgaVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory mo6936a(qbg.InterfaceC16329a interfaceC16329a) {
            this.f8534c.mo7491a((qbg.InterfaceC16329a) op0.m42515e(interfaceC16329a));
            return this;
        }

        public Factory(InterfaceC2226b.a aVar, dz4.InterfaceC13064a interfaceC13064a) {
            this.f8534c = (InterfaceC2226b.a) op0.m42515e(aVar);
            this.f8535d = interfaceC13064a;
            this.f8537f = new ud5();
            this.f8538g = new ue5();
            this.f8539h = 30000L;
            this.f8536e = new cd5();
            mo6937b(true);
        }
    }

    static {
        t2b.m49198a("media3.exoplayer.smoothstreaming");
    }

    @Override // p001o.be1
    /* renamed from: B */
    public void mo6919B(juh juhVar) {
        this.j0 = juhVar;
        this.f8521H.mo41292c(Looper.myLooper(), m18744z());
        this.f8521H.mo41294f();
        if (this.f8528h) {
            this.i0 = new zga.C18632a();
            m7479I();
            return;
        }
        this.f8527Z = this.f8530s.mo23962a();
        xga xgaVar = new xga("SsMediaSource");
        this.h0 = xgaVar;
        this.i0 = xgaVar;
        this.m0 = sqi.m48747z();
        m7481K();
    }

    @Override // p001o.be1
    /* renamed from: D */
    public void mo6920D() {
        this.l0 = this.f8528h ? this.l0 : null;
        this.f8527Z = null;
        this.k0 = 0L;
        xga xgaVar = this.h0;
        if (xgaVar != null) {
            xgaVar.m56268l();
            this.h0 = null;
        }
        Handler handler = this.m0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.m0 = null;
        }
        this.f8521H.release();
    }

    @Override // p001o.xga.InterfaceC18150b
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo6964m(qyc qycVar, long j, long j2, boolean z) {
        tga tgaVar = new tga(qycVar.f42621a, qycVar.f42622b, qycVar.m45982e(), qycVar.m45980c(), j, j2, qycVar.m45979a());
        this.f8522L.m48312c(qycVar.f42621a);
        this.f8524Q.m24554p(tgaVar, qycVar.f42623c);
    }

    @Override // p001o.xga.InterfaceC18150b
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo6963k(qyc qycVar, long j, long j2) {
        tga tgaVar = new tga(qycVar.f42621a, qycVar.f42622b, qycVar.m45982e(), qycVar.m45980c(), j, j2, qycVar.m45979a());
        this.f8522L.m48312c(qycVar.f42621a);
        this.f8524Q.m24557s(tgaVar, qycVar.f42623c);
        this.l0 = (d1g) qycVar.m45981d();
        this.k0 = j - j2;
        m7479I();
        m7480J();
    }

    @Override // p001o.xga.InterfaceC18150b
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public xga.C18151c mo6965o(qyc qycVar, long j, long j2, IOException iOException, int i) {
        tga tgaVar = new tga(qycVar.f42621a, qycVar.f42622b, qycVar.m45982e(), qycVar.m45980c(), j, j2, qycVar.m45979a());
        long jMo48313d = this.f8522L.mo48313d(new sga.C16838c(tgaVar, new u2b(qycVar.f42623c), iOException, i));
        xga.C18151c c18151cM56262h = jMo48313d == -9223372036854775807L ? xga.f53734g : xga.m56262h(false, jMo48313d);
        boolean z = !c18151cM56262h.m56273c();
        this.f8524Q.m24561w(tgaVar, qycVar.f42623c, iOException, z);
        if (z) {
            this.f8522L.m48312c(qycVar.f42621a);
        }
        return c18151cM56262h;
    }

    /* renamed from: I */
    public final void m7479I() {
        nuf nufVar;
        for (int i = 0; i < this.f8526Y.size(); i++) {
            ((C2227c) this.f8526Y.get(i)).m7504w(this.l0);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (d1g.C12783b c12783b : this.l0.f18982f) {
            if (c12783b.f18998k > 0) {
                jMax2 = Math.min(jMax2, c12783b.m22244e(0));
                jMax = Math.max(jMax, c12783b.m22244e(c12783b.f18998k - 1) + c12783b.m22242c(c12783b.f18998k - 1));
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j = this.l0.f18980d ? -9223372036854775807L : 0L;
            d1g d1gVar = this.l0;
            boolean z = d1gVar.f18980d;
            nufVar = new nuf(j, 0L, 0L, 0L, true, z, z, d1gVar, mo6932b());
        } else {
            d1g d1gVar2 = this.l0;
            if (d1gVar2.f18980d) {
                long j2 = d1gVar2.f18984h;
                if (j2 != -9223372036854775807L && j2 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j2);
                }
                long j3 = jMax2;
                long j4 = jMax - j3;
                long jO0 = j4 - sqi.O0(this.f8523M);
                if (jO0 < 5000000) {
                    jO0 = Math.min(5000000L, j4 / 2);
                }
                nufVar = new nuf(-9223372036854775807L, j4, j3, jO0, true, true, true, this.l0, mo6932b());
            } else {
                long j5 = d1gVar2.f18983g;
                long j6 = j5 != -9223372036854775807L ? j5 : jMax - jMax2;
                nufVar = new nuf(jMax2 + j6, j6, jMax2, 0L, true, false, false, this.l0, mo6932b());
            }
        }
        m18729C(nufVar);
    }

    /* renamed from: J */
    public final void m7480J() {
        if (this.l0.f18980d) {
            this.m0.postDelayed(new Runnable() { // from class: o.g1g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24470a.m7481K();
                }
            }, Math.max(0L, (this.k0 + DeviceOrientationRequest.OUTPUT_PERIOD_FAST) - SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: K */
    public final void m7481K() {
        if (this.h0.m56265i()) {
            return;
        }
        qyc qycVar = new qyc(this.f8527Z, this.f8529q, 4, this.f8525X);
        this.f8524Q.m24563y(new tga(qycVar.f42621a, qycVar.f42622b, this.h0.m56270n(qycVar, this, this.f8522L.mo48310a(qycVar.f42623c))), qycVar.f42623c);
    }

    @Override // p001o.x8b
    /* renamed from: a */
    public x4b mo6931a(x8b.C18076b c18076b, ob0 ob0Var, long j) {
        e9b.C13130a c13130aM18741w = m18741w(c18076b);
        C2227c c2227c = new C2227c(this.l0, this.f8531x, this.j0, this.f8532y, null, this.f8521H, m18739u(c18076b), this.f8522L, c13130aM18741w, this.i0, ob0Var);
        this.f8526Y.add(c2227c);
        return c2227c;
    }

    @Override // p001o.x8b
    /* renamed from: b */
    public synchronized s2b mo6932b() {
        return this.n0;
    }

    @Override // p001o.x8b
    /* renamed from: e */
    public void mo6933e(x4b x4bVar) {
        ((C2227c) x4bVar).m7503v();
        this.f8526Y.remove(x4bVar);
    }

    @Override // p001o.x8b
    /* renamed from: j */
    public void mo6934j() {
        this.i0.mo6966a();
    }

    @Override // p001o.x8b
    /* renamed from: n */
    public synchronized void mo6935n(s2b s2bVar) {
        this.n0 = s2bVar;
    }

    public SsMediaSource(s2b s2bVar, d1g d1gVar, dz4.InterfaceC13064a interfaceC13064a, qyc.InterfaceC16488a interfaceC16488a, InterfaceC2226b.a aVar, qo3 qo3Var, oe3 oe3Var, nz5 nz5Var, sga sgaVar, long j) {
        op0.m42517g(d1gVar == null || !d1gVar.f18980d);
        this.n0 = s2bVar;
        s2b.C16723h c16723h = (s2b.C16723h) op0.m42515e(s2bVar.f44480b);
        this.l0 = d1gVar;
        this.f8529q = c16723h.f44572a.equals(Uri.EMPTY) ? null : sqi.m48701F(c16723h.f44572a);
        this.f8530s = interfaceC13064a;
        this.f8525X = interfaceC16488a;
        this.f8531x = aVar;
        this.f8532y = qo3Var;
        this.f8521H = nz5Var;
        this.f8522L = sgaVar;
        this.f8523M = j;
        this.f8524Q = m18741w(null);
        this.f8528h = d1gVar != null;
        this.f8526Y = new ArrayList();
    }
}
