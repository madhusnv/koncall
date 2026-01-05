package p001o;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.C2181a;
import androidx.media3.common.DrmInitData;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import p001o.euh;
import p001o.fz5;
import p001o.gc0;
import p001o.kz0;
import p001o.lad;
import p001o.lmh;
import p001o.mad;
import p001o.qd5;
import p001o.ru6;
import p001o.s2b;
import p001o.v1i;
import p001o.x1b;
import p001o.x8b;

/* loaded from: classes2.dex */
public final class w4b implements gc0, lad.InterfaceC15048a {

    /* renamed from: A */
    public boolean f51434A;

    /* renamed from: a */
    public final Context f51435a;

    /* renamed from: b */
    public final lad f51436b;

    /* renamed from: c */
    public final PlaybackSession f51437c;

    /* renamed from: i */
    public String f51443i;

    /* renamed from: j */
    public PlaybackMetrics.Builder f51444j;

    /* renamed from: k */
    public int f51445k;

    /* renamed from: n */
    public iad f51448n;

    /* renamed from: o */
    public C17777b f51449o;

    /* renamed from: p */
    public C17777b f51450p;

    /* renamed from: q */
    public C17777b f51451q;

    /* renamed from: r */
    public C2181a f51452r;

    /* renamed from: s */
    public C2181a f51453s;

    /* renamed from: t */
    public C2181a f51454t;

    /* renamed from: u */
    public boolean f51455u;

    /* renamed from: v */
    public int f51456v;

    /* renamed from: w */
    public boolean f51457w;

    /* renamed from: x */
    public int f51458x;

    /* renamed from: y */
    public int f51459y;

    /* renamed from: z */
    public int f51460z;

    /* renamed from: e */
    public final lmh.C15106c f51439e = new lmh.C15106c();

    /* renamed from: f */
    public final lmh.C15105b f51440f = new lmh.C15105b();

    /* renamed from: h */
    public final HashMap f51442h = new HashMap();

    /* renamed from: g */
    public final HashMap f51441g = new HashMap();

    /* renamed from: d */
    public final long f51438d = SystemClock.elapsedRealtime();

    /* renamed from: l */
    public int f51446l = 0;

    /* renamed from: m */
    public int f51447m = 0;

    /* renamed from: o.w4b$a */
    public static final class C17776a {

        /* renamed from: a */
        public final int f51461a;

        /* renamed from: b */
        public final int f51462b;

        public C17776a(int i, int i2) {
            this.f51461a = i;
            this.f51462b = i2;
        }
    }

    /* renamed from: o.w4b$b */
    public static final class C17777b {

        /* renamed from: a */
        public final C2181a f51463a;

        /* renamed from: b */
        public final int f51464b;

        /* renamed from: c */
        public final String f51465c;

        public C17777b(C2181a c2181a, int i, String str) {
            this.f51463a = c2181a;
            this.f51464b = i;
            this.f51465c = str;
        }
    }

    public w4b(Context context, PlaybackSession playbackSession) {
        this.f51435a = context.getApplicationContext();
        this.f51437c = playbackSession;
        yf5 yf5Var = new yf5();
        this.f51436b = yf5Var;
        yf5Var.mo36839c(this);
    }

    public static int A0(DrmInitData drmInitData) {
        for (int i = 0; i < drmInitData.f7890d; i++) {
            UUID uuid = drmInitData.m6684e(i).f7892b;
            if (uuid.equals(dr1.f20426d)) {
                return 3;
            }
            if (uuid.equals(dr1.f20427e)) {
                return 2;
            }
            if (uuid.equals(dr1.f20425c)) {
                return 6;
            }
        }
        return 1;
    }

    public static C17776a B0(iad iadVar, Context context, boolean z) throws NumberFormatException {
        int i;
        boolean z2;
        if (iadVar.f28346a == 1001) {
            return new C17776a(20, 0);
        }
        if (iadVar instanceof qm6) {
            qm6 qm6Var = (qm6) iadVar;
            z2 = qm6Var.f42146s == 1;
            i = qm6Var.f42143L;
        } else {
            i = 0;
            z2 = false;
        }
        Throwable th = (Throwable) op0.m42515e(iadVar.getCause());
        if (!(th instanceof IOException)) {
            if (z2 && (i == 0 || i == 1)) {
                return new C17776a(35, 0);
            }
            if (z2 && i == 3) {
                return new C17776a(15, 0);
            }
            if (z2 && i == 2) {
                return new C17776a(23, 0);
            }
            if (th instanceof x1b.C18034d) {
                return new C17776a(13, sqi.m48721Z(((x1b.C18034d) th).f53068d));
            }
            if (th instanceof p1b) {
                return new C17776a(14, ((p1b) th).f39178c);
            }
            if (th instanceof OutOfMemoryError) {
                return new C17776a(14, 0);
            }
            if (th instanceof kz0.C14939c) {
                return new C17776a(17, ((kz0.C14939c) th).f32859a);
            }
            if (th instanceof kz0.C14942f) {
                return new C17776a(18, ((kz0.C14942f) th).f32864a);
            }
            if (!(th instanceof MediaCodec.CryptoException)) {
                return new C17776a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new C17776a(y0(errorCode), errorCode);
        }
        if (th instanceof j28) {
            return new C17776a(5, ((j28) th).f29628d);
        }
        if ((th instanceof i28) || (th instanceof byc)) {
            return new C17776a(z ? 10 : 11, 0);
        }
        if ((th instanceof h28) || (th instanceof v1i.C17500a)) {
            if (dub.m23838d(context).m23842f() == 1) {
                return new C17776a(3, 0);
            }
            Throwable cause = th.getCause();
            return cause instanceof UnknownHostException ? new C17776a(6, 0) : cause instanceof SocketTimeoutException ? new C17776a(7, 0) : ((th instanceof h28) && ((h28) th).f26125c == 1) ? new C17776a(4, 0) : new C17776a(8, 0);
        }
        if (iadVar.f28346a == 1002) {
            return new C17776a(21, 0);
        }
        if (!(th instanceof fz5.C13592a)) {
            if (!(th instanceof ru6.C16671b) || !(th.getCause() instanceof FileNotFoundException)) {
                return new C17776a(9, 0);
            }
            Throwable cause2 = ((Throwable) op0.m42515e(th.getCause())).getCause();
            return (sqi.f45790a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new C17776a(32, 0) : new C17776a(31, 0);
        }
        Throwable th2 = (Throwable) op0.m42515e(th.getCause());
        int i2 = sqi.f45790a;
        if (i2 < 21 || !(th2 instanceof MediaDrm.MediaDrmStateException)) {
            return (i2 < 23 || !(th2 instanceof MediaDrmResetException)) ? th2 instanceof NotProvisionedException ? new C17776a(24, 0) : th2 instanceof DeniedByServerException ? new C17776a(29, 0) : th2 instanceof i5i ? new C17776a(23, 0) : th2 instanceof qd5.C16343e ? new C17776a(28, 0) : new C17776a(30, 0) : new C17776a(27, 0);
        }
        int iM48721Z = sqi.m48721Z(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
        return new C17776a(y0(iM48721Z), iM48721Z);
    }

    public static Pair C0(String str) {
        String[] strArrI1 = sqi.i1(str, "-");
        return Pair.create(strArrI1[0], strArrI1.length >= 2 ? strArrI1[1] : null);
    }

    public static int E0(Context context) {
        switch (dub.m23838d(context).m23842f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    public static int F0(s2b s2bVar) {
        s2b.C16723h c16723h = s2bVar.f44480b;
        if (c16723h == null) {
            return 0;
        }
        int iZ0 = sqi.z0(c16723h.f44572a, c16723h.f44573b);
        if (iZ0 == 0) {
            return 3;
        }
        if (iZ0 != 1) {
            return iZ0 != 2 ? 1 : 4;
        }
        return 5;
    }

    public static int G0(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    public static w4b w0(Context context) {
        MediaMetricsManager mediaMetricsManagerM46206a = r4b.m46206a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerM46206a == null) {
            return null;
        }
        return new w4b(context, mediaMetricsManagerM46206a.createPlaybackSession());
    }

    public static int y0(int i) {
        switch (sqi.m48720Y(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public static DrmInitData z0(nf8 nf8Var) {
        DrmInitData drmInitData;
        q4i it = nf8Var.iterator();
        while (it.hasNext()) {
            euh.C13263a c13263a = (euh.C13263a) it.next();
            for (int i = 0; i < c13263a.f22208a; i++) {
                if (c13263a.m25638g(i) && (drmInitData = c13263a.m25633b(i).f7947r) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    public LogSessionId D0() {
        return this.f51437c.getSessionId();
    }

    public final void H0(gc0.C13668b c13668b) {
        for (int i = 0; i < c13668b.m28367d(); i++) {
            int iM28365b = c13668b.m28365b(i);
            gc0.C13667a c13667aM28366c = c13668b.m28366c(iM28365b);
            if (iM28365b == 0) {
                this.f51436b.mo36842f(c13667aM28366c);
            } else if (iM28365b == 11) {
                this.f51436b.mo36840d(c13667aM28366c, this.f51445k);
            } else {
                this.f51436b.mo36843g(c13667aM28366c);
            }
        }
    }

    public final void I0(long j) {
        int iE0 = E0(this.f51435a);
        if (iE0 != this.f51447m) {
            this.f51447m = iE0;
            this.f51437c.reportNetworkEvent(n4b.m40058a().setNetworkType(iE0).setTimeSinceCreatedMillis(j - this.f51438d).build());
        }
    }

    @Override // p001o.gc0
    /* renamed from: J */
    public void mo28324J(gc0.C13667a c13667a, mad.C15267e c15267e, mad.C15267e c15267e2, int i) {
        if (i == 1) {
            this.f51455u = true;
        }
        this.f51445k = i;
    }

    public final void J0(long j) throws NumberFormatException {
        iad iadVar = this.f51448n;
        if (iadVar == null) {
            return;
        }
        C17776a c17776aB0 = B0(iadVar, this.f51435a, this.f51456v == 4);
        this.f51437c.reportPlaybackErrorEvent(v2b.m52302a().setTimeSinceCreatedMillis(j - this.f51438d).setErrorCode(c17776aB0.f51461a).setSubErrorCode(c17776aB0.f51462b).setException(iadVar).build());
        this.f51434A = true;
        this.f51448n = null;
    }

    public final void K0(mad madVar, gc0.C13668b c13668b, long j) {
        if (madVar.mo7134c() != 2) {
            this.f51455u = false;
        }
        if (madVar.mo7143r() == null) {
            this.f51457w = false;
        } else if (c13668b.m28364a(10)) {
            this.f51457w = true;
        }
        int iS0 = S0(madVar);
        if (this.f51446l != iS0) {
            this.f51446l = iS0;
            this.f51434A = true;
            this.f51437c.reportPlaybackStateEvent(c4b.m20196a().setState(this.f51446l).setTimeSinceCreatedMillis(j - this.f51438d).build());
        }
    }

    public final void L0(mad madVar, gc0.C13668b c13668b, long j) {
        if (c13668b.m28364a(2)) {
            euh euhVarMo7145t = madVar.mo7145t();
            boolean zM25629c = euhVarMo7145t.m25629c(2);
            boolean zM25629c2 = euhVarMo7145t.m25629c(1);
            boolean zM25629c3 = euhVarMo7145t.m25629c(3);
            if (zM25629c || zM25629c2 || zM25629c3) {
                if (!zM25629c) {
                    Q0(j, null, 0);
                }
                if (!zM25629c2) {
                    M0(j, null, 0);
                }
                if (!zM25629c3) {
                    O0(j, null, 0);
                }
            }
        }
        if (v0(this.f51449o)) {
            C17777b c17777b = this.f51449o;
            C2181a c2181a = c17777b.f51463a;
            if (c2181a.f7950u != -1) {
                Q0(j, c2181a, c17777b.f51464b);
                this.f51449o = null;
            }
        }
        if (v0(this.f51450p)) {
            C17777b c17777b2 = this.f51450p;
            M0(j, c17777b2.f51463a, c17777b2.f51464b);
            this.f51450p = null;
        }
        if (v0(this.f51451q)) {
            C17777b c17777b3 = this.f51451q;
            O0(j, c17777b3.f51463a, c17777b3.f51464b);
            this.f51451q = null;
        }
    }

    public final void M0(long j, C2181a c2181a, int i) {
        if (sqi.m48724c(this.f51453s, c2181a)) {
            return;
        }
        if (this.f51453s == null && i == 0) {
            i = 1;
        }
        this.f51453s = c2181a;
        R0(0, j, c2181a, i);
    }

    public final void N0(mad madVar, gc0.C13668b c13668b) {
        DrmInitData drmInitDataZ0;
        if (c13668b.m28364a(0)) {
            gc0.C13667a c13667aM28366c = c13668b.m28366c(0);
            if (this.f51444j != null) {
                P0(c13667aM28366c.f24881b, c13667aM28366c.f24883d);
            }
        }
        if (c13668b.m28364a(2) && this.f51444j != null && (drmInitDataZ0 = z0(madVar.mo7145t().m25627a())) != null) {
            q3b.m44766a(sqi.m48729h(this.f51444j)).setDrmType(A0(drmInitDataZ0));
        }
        if (c13668b.m28364a(1011)) {
            this.f51460z++;
        }
    }

    public final void O0(long j, C2181a c2181a, int i) {
        if (sqi.m48724c(this.f51454t, c2181a)) {
            return;
        }
        if (this.f51454t == null && i == 0) {
            i = 1;
        }
        this.f51454t = c2181a;
        R0(2, j, c2181a, i);
    }

    public final void P0(lmh lmhVar, x8b.C18076b c18076b) {
        int iMo6949b;
        PlaybackMetrics.Builder builder = this.f51444j;
        if (c18076b == null || (iMo6949b = lmhVar.mo6949b(c18076b.f53356a)) == -1) {
            return;
        }
        lmhVar.m37473f(iMo6949b, this.f51440f);
        lmhVar.m37476n(this.f51440f.f34059c, this.f51439e);
        builder.setStreamType(F0(this.f51439e.f34082c));
        lmh.C15106c c15106c = this.f51439e;
        if (c15106c.f34092m != -9223372036854775807L && !c15106c.f34090k && !c15106c.f34088i && !c15106c.m37504f()) {
            builder.setMediaDurationMillis(this.f51439e.m37502d());
        }
        builder.setPlaybackType(this.f51439e.m37504f() ? 2 : 1);
        this.f51434A = true;
    }

    public final void Q0(long j, C2181a c2181a, int i) {
        if (sqi.m48724c(this.f51452r, c2181a)) {
            return;
        }
        if (this.f51452r == null && i == 0) {
            i = 1;
        }
        this.f51452r = c2181a;
        R0(1, j, c2181a, i);
    }

    @Override // p001o.lad.InterfaceC15048a
    /* renamed from: R */
    public void mo36844R(gc0.C13667a c13667a, String str, boolean z) {
        x8b.C18076b c18076b = c13667a.f24883d;
        if ((c18076b == null || !c18076b.m55842b()) && str.equals(this.f51443i)) {
            x0();
        }
        this.f51441g.remove(str);
        this.f51442h.remove(str);
    }

    public final void R0(int i, long j, C2181a c2181a, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = g3b.m28023a(i).setTimeSinceCreatedMillis(j - this.f51438d);
        if (c2181a != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(G0(i2));
            String str = c2181a.f7942m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c2181a.f7943n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c2181a.f7939j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = c2181a.f7938i;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = c2181a.f7949t;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = c2181a.f7950u;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = c2181a.f7919B;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = c2181a.f7920C;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = c2181a.f7933d;
            if (str4 != null) {
                Pair pairC0 = C0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairC0.first);
                Object obj = pairC0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c2181a.f7951v;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f51434A = true;
        this.f51437c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    public final int S0(mad madVar) {
        int iMo7134c = madVar.mo7134c();
        if (this.f51455u) {
            return 5;
        }
        if (this.f51457w) {
            return 13;
        }
        if (iMo7134c == 4) {
            return 11;
        }
        if (iMo7134c == 2) {
            int i = this.f51446l;
            if (i == 0 || i == 2 || i == 12) {
                return 2;
            }
            if (madVar.mo7119J()) {
                return madVar.mo7148z() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (iMo7134c == 3) {
            if (madVar.mo7119J()) {
                return madVar.mo7148z() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (iMo7134c != 1 || this.f51446l == 0) {
            return this.f51446l;
        }
        return 12;
    }

    @Override // p001o.gc0
    public void c0(mad madVar, gc0.C13668b c13668b) throws NumberFormatException {
        if (c13668b.m28367d() == 0) {
            return;
        }
        H0(c13668b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        N0(madVar, c13668b);
        J0(jElapsedRealtime);
        L0(madVar, c13668b, jElapsedRealtime);
        I0(jElapsedRealtime);
        K0(madVar, c13668b, jElapsedRealtime);
        if (c13668b.m28364a(1028)) {
            this.f51436b.mo36841e(c13668b.m28366c(1028));
        }
    }

    @Override // p001o.lad.InterfaceC15048a
    public void e0(gc0.C13667a c13667a, String str) {
        x8b.C18076b c18076b = c13667a.f24883d;
        if (c18076b == null || !c18076b.m55842b()) {
            x0();
            this.f51443i = str;
            this.f51444j = r3b.m46193a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.4.1");
            P0(c13667a.f24881b, c13667a.f24883d);
        }
    }

    @Override // p001o.gc0
    /* renamed from: f */
    public void mo28345f(gc0.C13667a c13667a, iad iadVar) {
        this.f51448n = iadVar;
    }

    @Override // p001o.gc0
    public void l0(gc0.C13667a c13667a, tga tgaVar, u2b u2bVar, IOException iOException, boolean z) {
        this.f51456v = u2bVar.f48209a;
    }

    @Override // p001o.lad.InterfaceC15048a
    /* renamed from: m */
    public void mo36845m(gc0.C13667a c13667a, String str) {
    }

    @Override // p001o.lad.InterfaceC15048a
    /* renamed from: p */
    public void mo36846p(gc0.C13667a c13667a, String str, String str2) {
    }

    @Override // p001o.gc0
    public void r0(gc0.C13667a c13667a, bvi bviVar) {
        C17777b c17777b = this.f51449o;
        if (c17777b != null) {
            C2181a c2181a = c17777b.f51463a;
            if (c2181a.f7950u == -1) {
                this.f51449o = new C17777b(c2181a.m6707a().v0(bviVar.f16883a).m6762Y(bviVar.f16884b).m6748K(), c17777b.f51464b, c17777b.f51465c);
            }
        }
    }

    @Override // p001o.gc0
    public void u0(gc0.C13667a c13667a, int i, long j, long j2) {
        x8b.C18076b c18076b = c13667a.f24883d;
        if (c18076b != null) {
            String strMo36838b = this.f51436b.mo36838b(c13667a.f24881b, (x8b.C18076b) op0.m42515e(c18076b));
            Long l = (Long) this.f51442h.get(strMo36838b);
            Long l2 = (Long) this.f51441g.get(strMo36838b);
            this.f51442h.put(strMo36838b, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.f51441g.put(strMo36838b, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    public final boolean v0(C17777b c17777b) {
        return c17777b != null && c17777b.f51465c.equals(this.f51436b.mo36837a());
    }

    @Override // p001o.gc0
    /* renamed from: w */
    public void mo28360w(gc0.C13667a c13667a, u2b u2bVar) {
        if (c13667a.f24883d == null) {
            return;
        }
        C17777b c17777b = new C17777b((C2181a) op0.m42515e(u2bVar.f48211c), u2bVar.f48212d, this.f51436b.mo36838b(c13667a.f24881b, (x8b.C18076b) op0.m42515e(c13667a.f24883d)));
        int i = u2bVar.f48210b;
        if (i != 0) {
            if (i == 1) {
                this.f51450p = c17777b;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f51451q = c17777b;
                return;
            }
        }
        this.f51449o = c17777b;
    }

    public final void x0() {
        PlaybackMetrics.Builder builder = this.f51444j;
        if (builder != null && this.f51434A) {
            builder.setAudioUnderrunCount(this.f51460z);
            this.f51444j.setVideoFramesDropped(this.f51458x);
            this.f51444j.setVideoFramesPlayed(this.f51459y);
            Long l = (Long) this.f51441g.get(this.f51443i);
            this.f51444j.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.f51442h.get(this.f51443i);
            this.f51444j.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.f51444j.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f51437c.reportPlaybackMetrics(this.f51444j.build());
        }
        this.f51444j = null;
        this.f51443i = null;
        this.f51460z = 0;
        this.f51458x = 0;
        this.f51459y = 0;
        this.f51452r = null;
        this.f51453s = null;
        this.f51454t = null;
        this.f51434A = false;
    }

    @Override // p001o.gc0
    /* renamed from: z */
    public void mo28363z(gc0.C13667a c13667a, y75 y75Var) {
        this.f51458x += y75Var.f55019g;
        this.f51459y += y75Var.f55017e;
    }
}
