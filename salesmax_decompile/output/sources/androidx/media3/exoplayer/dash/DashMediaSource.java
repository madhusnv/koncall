package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.C2205c;
import androidx.media3.exoplayer.dash.C2206d;
import androidx.media3.exoplayer.dash.InterfaceC2203a;
import com.google.android.gms.location.DeviceOrientationRequest;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001o.be1;
import p001o.byc;
import p001o.cd5;
import p001o.cyf;
import p001o.dr4;
import p001o.dz4;
import p001o.e9b;
import p001o.er4;
import p001o.f9b;
import p001o.fgf;
import p001o.fr4;
import p001o.g07;
import p001o.g3d;
import p001o.gf1;
import p001o.hqi;
import p001o.jr4;
import p001o.juh;
import p001o.kla;
import p001o.lmh;
import p001o.nz5;
import p001o.ob0;
import p001o.oe3;
import p001o.op0;
import p001o.pz5;
import p001o.qbg;
import p001o.qo3;
import p001o.qyc;
import p001o.ria;
import p001o.s2b;
import p001o.sga;
import p001o.sqi;
import p001o.t2b;
import p001o.tga;
import p001o.tle;
import p001o.tv;
import p001o.u2b;
import p001o.ud5;
import p001o.ue5;
import p001o.uh2;
import p001o.x4b;
import p001o.x8b;
import p001o.xga;
import p001o.zga;

/* loaded from: classes2.dex */
public final class DashMediaSource extends be1 {
    public int A0;
    public long B0;
    public int C0;
    public s2b D0;

    /* renamed from: H */
    public final sga f8183H;

    /* renamed from: L */
    public final gf1 f8184L;

    /* renamed from: M */
    public final long f8185M;

    /* renamed from: Q */
    public final long f8186Q;

    /* renamed from: X */
    public final e9b.C13130a f8187X;

    /* renamed from: Y */
    public final qyc.InterfaceC16488a f8188Y;

    /* renamed from: Z */
    public final C2199e f8189Z;

    /* renamed from: h */
    public final boolean f8190h;
    public final Object h0;
    public final SparseArray i0;
    public final Runnable j0;
    public final Runnable k0;
    public final C2206d.b l0;
    public final zga m0;
    public dz4 n0;
    public xga o0;
    public juh p0;

    /* renamed from: q */
    public final dz4.InterfaceC13064a f8191q;
    public IOException q0;
    public Handler r0;

    /* renamed from: s */
    public final InterfaceC2203a.a f8192s;
    public s2b.C16722g s0;
    public Uri t0;
    public Uri u0;
    public dr4 v0;
    public boolean w0;

    /* renamed from: x */
    public final qo3 f8193x;
    public long x0;

    /* renamed from: y */
    public final nz5 f8194y;
    public long y0;
    public long z0;

    public static final class Factory implements f9b {

        /* renamed from: k */
        public static final /* synthetic */ int f8195k = 0;

        /* renamed from: c */
        public final InterfaceC2203a.a f8196c;

        /* renamed from: d */
        public final dz4.InterfaceC13064a f8197d;

        /* renamed from: e */
        public pz5 f8198e;

        /* renamed from: f */
        public qo3 f8199f;

        /* renamed from: g */
        public sga f8200g;

        /* renamed from: h */
        public long f8201h;

        /* renamed from: i */
        public long f8202i;

        /* renamed from: j */
        public qyc.InterfaceC16488a f8203j;

        public Factory(dz4.InterfaceC13064a interfaceC13064a) {
            this(new C2205c.a(interfaceC13064a), interfaceC13064a);
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public DashMediaSource mo6940e(s2b s2bVar) {
            op0.m42515e(s2bVar.f44480b);
            qyc.InterfaceC16488a er4Var = this.f8203j;
            if (er4Var == null) {
                er4Var = new er4();
            }
            List list = s2bVar.f44480b.f44575d;
            return new DashMediaSource(s2bVar, null, this.f8197d, !list.isEmpty() ? new g07(er4Var, list) : er4Var, this.f8196c, this.f8199f, null, this.f8198e.mo44362a(s2bVar), this.f8200g, this.f8201h, this.f8202i, null);
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory mo6937b(boolean z) {
            this.f8196c.mo6975b(z);
            return this;
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory mo6939d(pz5 pz5Var) {
            this.f8198e = (pz5) op0.m42516f(pz5Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory mo6938c(sga sgaVar) {
            this.f8200g = (sga) op0.m42516f(sgaVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory mo6936a(qbg.InterfaceC16329a interfaceC16329a) {
            this.f8196c.mo6974a((qbg.InterfaceC16329a) op0.m42515e(interfaceC16329a));
            return this;
        }

        public Factory(InterfaceC2203a.a aVar, dz4.InterfaceC13064a interfaceC13064a) {
            this.f8196c = (InterfaceC2203a.a) op0.m42515e(aVar);
            this.f8197d = interfaceC13064a;
            this.f8198e = new ud5();
            this.f8200g = new ue5();
            this.f8201h = 30000L;
            this.f8202i = 5000000L;
            this.f8199f = new cd5();
            mo6937b(true);
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$a */
    public class C2195a implements cyf.InterfaceC12768b {
        public C2195a() {
        }

        @Override // p001o.cyf.InterfaceC12768b
        /* renamed from: a */
        public void mo6946a() {
            DashMediaSource.this.a0(cyf.m22065h());
        }

        @Override // p001o.cyf.InterfaceC12768b
        /* renamed from: b */
        public void mo6947b(IOException iOException) {
            DashMediaSource.this.m6930Z(iOException);
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$b */
    public static final class C2196b extends lmh {

        /* renamed from: e */
        public final long f8205e;

        /* renamed from: f */
        public final long f8206f;

        /* renamed from: g */
        public final long f8207g;

        /* renamed from: h */
        public final int f8208h;

        /* renamed from: i */
        public final long f8209i;

        /* renamed from: j */
        public final long f8210j;

        /* renamed from: k */
        public final long f8211k;

        /* renamed from: l */
        public final dr4 f8212l;

        /* renamed from: m */
        public final s2b f8213m;

        /* renamed from: n */
        public final s2b.C16722g f8214n;

        public C2196b(long j, long j2, long j3, int i, long j4, long j5, long j6, dr4 dr4Var, s2b s2bVar, s2b.C16722g c16722g) {
            op0.m42517g(dr4Var.f20433d == (c16722g != null));
            this.f8205e = j;
            this.f8206f = j2;
            this.f8207g = j3;
            this.f8208h = i;
            this.f8209i = j4;
            this.f8210j = j5;
            this.f8211k = j6;
            this.f8212l = dr4Var;
            this.f8213m = s2bVar;
            this.f8214n = c16722g;
        }

        /* renamed from: t */
        public static boolean m6948t(dr4 dr4Var) {
            return dr4Var.f20433d && dr4Var.f20434e != -9223372036854775807L && dr4Var.f20431b == -9223372036854775807L;
        }

        @Override // p001o.lmh
        /* renamed from: b */
        public int mo6949b(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f8208h) >= 0 && iIntValue < mo6951i()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // p001o.lmh
        /* renamed from: g */
        public lmh.C15105b mo6950g(int i, lmh.C15105b c15105b, boolean z) {
            op0.m42513c(i, 0, mo6951i());
            return c15105b.m37497s(z ? this.f8212l.m23691d(i).f24526a : null, z ? Integer.valueOf(this.f8208h + i) : null, 0, this.f8212l.m23694g(i), sqi.O0(this.f8212l.m23691d(i).f24527b - this.f8212l.m23691d(0).f24527b) - this.f8209i);
        }

        @Override // p001o.lmh
        /* renamed from: i */
        public int mo6951i() {
            return this.f8212l.m23692e();
        }

        @Override // p001o.lmh
        /* renamed from: m */
        public Object mo6952m(int i) {
            op0.m42513c(i, 0, mo6951i());
            return Integer.valueOf(this.f8208h + i);
        }

        @Override // p001o.lmh
        /* renamed from: o */
        public lmh.C15106c mo6953o(int i, lmh.C15106c c15106c, long j) {
            op0.m42513c(i, 0, 1);
            long jM6955s = m6955s(j);
            Object obj = lmh.C15106c.f34070q;
            s2b s2bVar = this.f8213m;
            dr4 dr4Var = this.f8212l;
            return c15106c.m37505g(obj, s2bVar, dr4Var, this.f8205e, this.f8206f, this.f8207g, true, m6948t(dr4Var), this.f8214n, jM6955s, this.f8210j, 0, mo6951i() - 1, this.f8209i);
        }

        @Override // p001o.lmh
        /* renamed from: p */
        public int mo6954p() {
            return 1;
        }

        /* renamed from: s */
        public final long m6955s(long j) {
            jr4 jr4VarMo50166l;
            long j2 = this.f8211k;
            if (!m6948t(this.f8212l)) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.f8210j) {
                    return -9223372036854775807L;
                }
            }
            long j3 = this.f8209i + j2;
            long jM23694g = this.f8212l.m23694g(0);
            int i = 0;
            while (i < this.f8212l.m23692e() - 1 && j3 >= jM23694g) {
                j3 -= jM23694g;
                i++;
                jM23694g = this.f8212l.m23694g(i);
            }
            g3d g3dVarM23691d = this.f8212l.m23691d(i);
            int iM28024a = g3dVarM23691d.m28024a(2);
            return (iM28024a == -1 || (jr4VarMo50166l = ((tle) ((tv) g3dVarM23691d.f24528c.get(iM28024a)).f47942c.get(0)).mo50166l()) == null || jr4VarMo50166l.mo34369h(jM23694g) == 0) ? j2 : (j2 + jr4VarMo50166l.mo34363b(jr4VarMo50166l.mo34368g(j3, jM23694g))) - j3;
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$c */
    public final class C2197c implements C2206d.b {
        public C2197c() {
        }

        @Override // androidx.media3.exoplayer.dash.C2206d.b
        /* renamed from: a */
        public void mo6956a(long j) {
            DashMediaSource.this.m6923S(j);
        }

        @Override // androidx.media3.exoplayer.dash.C2206d.b
        /* renamed from: b */
        public void mo6957b() {
            DashMediaSource.this.m6924T();
        }

        public /* synthetic */ C2197c(DashMediaSource dashMediaSource, C2195a c2195a) {
            this();
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$d */
    public static final class C2198d implements qyc.InterfaceC16488a {

        /* renamed from: a */
        public static final Pattern f8216a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // p001o.qyc.InterfaceC16488a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long mo6958a(Uri uri, InputStream inputStream) throws IOException, NumberFormatException {
            String line = new BufferedReader(new InputStreamReader(inputStream, uh2.f48931c)).readLine();
            try {
                Matcher matcher = f8216a.matcher(line);
                if (!matcher.matches()) {
                    throw byc.m19923c("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j2 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j * ((((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw byc.m19923c(null, e);
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$e */
    public final class C2199e implements xga.InterfaceC18150b {
        public C2199e() {
        }

        @Override // p001o.xga.InterfaceC18150b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6964m(qyc qycVar, long j, long j2, boolean z) {
            DashMediaSource.this.m6925U(qycVar, j, j2);
        }

        @Override // p001o.xga.InterfaceC18150b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6963k(qyc qycVar, long j, long j2) {
            DashMediaSource.this.m6926V(qycVar, j, j2);
        }

        @Override // p001o.xga.InterfaceC18150b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public xga.C18151c mo6965o(qyc qycVar, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.m6927W(qycVar, j, j2, iOException, i);
        }

        public /* synthetic */ C2199e(DashMediaSource dashMediaSource, C2195a c2195a) {
            this();
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$f */
    public final class C2200f implements zga {
        public C2200f() {
        }

        @Override // p001o.zga
        /* renamed from: a */
        public void mo6966a() throws IOException {
            DashMediaSource.this.o0.mo6966a();
            m6967b();
        }

        /* renamed from: b */
        public final void m6967b() throws IOException {
            if (DashMediaSource.this.q0 != null) {
                throw DashMediaSource.this.q0;
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$g */
    public final class C2201g implements xga.InterfaceC18150b {
        public C2201g() {
        }

        @Override // p001o.xga.InterfaceC18150b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6964m(qyc qycVar, long j, long j2, boolean z) {
            DashMediaSource.this.m6925U(qycVar, j, j2);
        }

        @Override // p001o.xga.InterfaceC18150b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6963k(qyc qycVar, long j, long j2) {
            DashMediaSource.this.m6928X(qycVar, j, j2);
        }

        @Override // p001o.xga.InterfaceC18150b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public xga.C18151c mo6965o(qyc qycVar, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.m6929Y(qycVar, j, j2, iOException);
        }

        public /* synthetic */ C2201g(DashMediaSource dashMediaSource, C2195a c2195a) {
            this();
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$h */
    public static final class C2202h implements qyc.InterfaceC16488a {
        public C2202h() {
        }

        public /* synthetic */ C2202h(C2195a c2195a) {
            this();
        }

        @Override // p001o.qyc.InterfaceC16488a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long mo6958a(Uri uri, InputStream inputStream) {
            return Long.valueOf(sqi.U0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        t2b.m49198a("media3.exoplayer.dash");
    }

    public /* synthetic */ DashMediaSource(s2b s2bVar, dr4 dr4Var, dz4.InterfaceC13064a interfaceC13064a, qyc.InterfaceC16488a interfaceC16488a, InterfaceC2203a.a aVar, qo3 qo3Var, oe3 oe3Var, nz5 nz5Var, sga sgaVar, long j, long j2, C2195a c2195a) {
        this(s2bVar, dr4Var, interfaceC13064a, interfaceC16488a, aVar, qo3Var, oe3Var, nz5Var, sgaVar, j, j2);
    }

    /* renamed from: K */
    public static long m6913K(g3d g3dVar, long j, long j2) {
        long jO0 = sqi.O0(g3dVar.f24527b);
        boolean zM6916O = m6916O(g3dVar);
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < g3dVar.f24528c.size(); i++) {
            tv tvVar = (tv) g3dVar.f24528c.get(i);
            List list = tvVar.f47942c;
            int i2 = tvVar.f47941b;
            boolean z = (i2 == 1 || i2 == 2) ? false : true;
            if ((!zM6916O || !z) && !list.isEmpty()) {
                jr4 jr4VarMo50166l = ((tle) list.get(0)).mo50166l();
                if (jr4VarMo50166l == null) {
                    return jO0 + j;
                }
                long jMo34372k = jr4VarMo50166l.mo34372k(j, j2);
                if (jMo34372k == 0) {
                    return jO0;
                }
                long jMo34365d = (jr4VarMo50166l.mo34365d(j, j2) + jMo34372k) - 1;
                jMin = Math.min(jMin, jr4VarMo50166l.mo34364c(jMo34365d, j) + jr4VarMo50166l.mo34363b(jMo34365d) + jO0);
            }
        }
        return jMin;
    }

    /* renamed from: L */
    public static long m6914L(g3d g3dVar, long j, long j2) {
        long jO0 = sqi.O0(g3dVar.f24527b);
        boolean zM6916O = m6916O(g3dVar);
        long jMax = jO0;
        for (int i = 0; i < g3dVar.f24528c.size(); i++) {
            tv tvVar = (tv) g3dVar.f24528c.get(i);
            List list = tvVar.f47942c;
            int i2 = tvVar.f47941b;
            boolean z = (i2 == 1 || i2 == 2) ? false : true;
            if ((!zM6916O || !z) && !list.isEmpty()) {
                jr4 jr4VarMo50166l = ((tle) list.get(0)).mo50166l();
                if (jr4VarMo50166l == null) {
                    return jO0;
                }
                if (jr4VarMo50166l.mo34372k(j, j2) == 0) {
                    return jO0;
                }
                jMax = Math.max(jMax, jr4VarMo50166l.mo34363b(jr4VarMo50166l.mo34365d(j, j2)) + jO0);
            }
        }
        return jMax;
    }

    /* renamed from: M */
    public static long m6915M(dr4 dr4Var, long j) {
        jr4 jr4VarMo50166l;
        int iM23692e = dr4Var.m23692e() - 1;
        g3d g3dVarM23691d = dr4Var.m23691d(iM23692e);
        long jO0 = sqi.O0(g3dVarM23691d.f24527b);
        long jM23694g = dr4Var.m23694g(iM23692e);
        long jO02 = sqi.O0(j);
        long jO03 = sqi.O0(dr4Var.f20430a);
        long jO04 = sqi.O0(DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
        for (int i = 0; i < g3dVarM23691d.f24528c.size(); i++) {
            List list = ((tv) g3dVarM23691d.f24528c.get(i)).f47942c;
            if (!list.isEmpty() && (jr4VarMo50166l = ((tle) list.get(0)).mo50166l()) != null) {
                long jMo34366e = ((jO03 + jO0) + jr4VarMo50166l.mo34366e(jM23694g, jO02)) - jO02;
                if (jMo34366e < jO04 - 100000 || (jMo34366e > jO04 && jMo34366e < jO04 + 100000)) {
                    jO04 = jMo34366e;
                }
            }
        }
        return kla.m35834b(jO04, 1000L, RoundingMode.CEILING);
    }

    /* renamed from: O */
    public static boolean m6916O(g3d g3dVar) {
        for (int i = 0; i < g3dVar.f24528c.size(); i++) {
            int i2 = ((tv) g3dVar.f24528c.get(i)).f47941b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public static boolean m6917P(g3d g3dVar) {
        for (int i = 0; i < g3dVar.f24528c.size(); i++) {
            jr4 jr4VarMo50166l = ((tle) ((tv) g3dVar.f24528c.get(i)).f47942c.get(0)).mo50166l();
            if (jr4VarMo50166l == null || jr4VarMo50166l.mo34370i()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m6918Q() {
        b0(false);
    }

    @Override // p001o.be1
    /* renamed from: B */
    public void mo6919B(juh juhVar) {
        this.p0 = juhVar;
        this.f8194y.mo41292c(Looper.myLooper(), m18744z());
        this.f8194y.mo41294f();
        if (this.f8190h) {
            b0(false);
            return;
        }
        this.n0 = this.f8191q.mo23962a();
        this.o0 = new xga("DashMediaSource");
        this.r0 = sqi.m48747z();
        h0();
    }

    @Override // p001o.be1
    /* renamed from: D */
    public void mo6920D() {
        this.w0 = false;
        this.n0 = null;
        xga xgaVar = this.o0;
        if (xgaVar != null) {
            xgaVar.m56268l();
            this.o0 = null;
        }
        this.x0 = 0L;
        this.y0 = 0L;
        this.t0 = this.u0;
        this.q0 = null;
        Handler handler = this.r0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.r0 = null;
        }
        this.z0 = -9223372036854775807L;
        this.A0 = 0;
        this.B0 = -9223372036854775807L;
        this.i0.clear();
        this.f8184L.m28546i();
        this.f8194y.release();
    }

    /* renamed from: N */
    public final long m6921N() {
        return Math.min((this.A0 - 1) * 1000, 5000);
    }

    /* renamed from: R */
    public final void m6922R() {
        cyf.m22067j(this.o0, new C2195a());
    }

    /* renamed from: S */
    public void m6923S(long j) {
        long j2 = this.B0;
        if (j2 == -9223372036854775807L || j2 < j) {
            this.B0 = j;
        }
    }

    /* renamed from: T */
    public void m6924T() {
        this.r0.removeCallbacks(this.k0);
        h0();
    }

    /* renamed from: U */
    public void m6925U(qyc qycVar, long j, long j2) {
        tga tgaVar = new tga(qycVar.f42621a, qycVar.f42622b, qycVar.m45982e(), qycVar.m45980c(), j, j2, qycVar.m45979a());
        this.f8183H.m48312c(qycVar.f42621a);
        this.f8187X.m24554p(tgaVar, qycVar.f42623c);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m6926V(qyc qycVar, long j, long j2) {
        boolean z;
        tga tgaVar = new tga(qycVar.f42621a, qycVar.f42622b, qycVar.m45982e(), qycVar.m45980c(), j, j2, qycVar.m45979a());
        this.f8183H.m48312c(qycVar.f42621a);
        this.f8187X.m24557s(tgaVar, qycVar.f42623c);
        dr4 dr4Var = (dr4) qycVar.m45981d();
        dr4 dr4Var2 = this.v0;
        int iM23692e = dr4Var2 == null ? 0 : dr4Var2.m23692e();
        long j3 = dr4Var.m23691d(0).f24527b;
        int i = 0;
        while (i < iM23692e && this.v0.m23691d(i).f24527b < j3) {
            i++;
        }
        if (dr4Var.f20433d) {
            if (iM23692e - i > dr4Var.m23692e()) {
                ria.m46824h("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j4 = this.B0;
                if (j4 == -9223372036854775807L || dr4Var.f20437h * 1000 > j4) {
                    z = false;
                    if (!z) {
                        int i2 = this.A0;
                        this.A0 = i2 + 1;
                        if (i2 < this.f8183H.mo48310a(qycVar.f42623c)) {
                            f0(m6921N());
                            return;
                        } else {
                            this.q0 = new fr4();
                            return;
                        }
                    }
                    this.A0 = 0;
                } else {
                    ria.m46824h("DashMediaSource", "Loaded stale dynamic manifest: " + dr4Var.f20437h + ", " + this.B0);
                }
            }
            z = true;
            if (!z) {
            }
        }
        this.v0 = dr4Var;
        this.w0 = dr4Var.f20433d & this.w0;
        this.x0 = j - j2;
        this.y0 = j;
        this.C0 += i;
        synchronized (this.h0) {
            if (qycVar.f42622b.f29380a == this.t0) {
                Uri uriM45982e = this.v0.f20440k;
                if (uriM45982e == null) {
                    uriM45982e = qycVar.m45982e();
                }
                this.t0 = uriM45982e;
            }
        }
        dr4 dr4Var3 = this.v0;
        if (!dr4Var3.f20433d || this.z0 != -9223372036854775807L) {
            b0(true);
            return;
        }
        hqi hqiVar = dr4Var3.f20438i;
        if (hqiVar != null) {
            c0(hqiVar);
        } else {
            m6922R();
        }
    }

    /* renamed from: W */
    public xga.C18151c m6927W(qyc qycVar, long j, long j2, IOException iOException, int i) {
        tga tgaVar = new tga(qycVar.f42621a, qycVar.f42622b, qycVar.m45982e(), qycVar.m45980c(), j, j2, qycVar.m45979a());
        long jMo48313d = this.f8183H.mo48313d(new sga.C16838c(tgaVar, new u2b(qycVar.f42623c), iOException, i));
        xga.C18151c c18151cM56262h = jMo48313d == -9223372036854775807L ? xga.f53734g : xga.m56262h(false, jMo48313d);
        boolean z = !c18151cM56262h.m56273c();
        this.f8187X.m24561w(tgaVar, qycVar.f42623c, iOException, z);
        if (z) {
            this.f8183H.m48312c(qycVar.f42621a);
        }
        return c18151cM56262h;
    }

    /* renamed from: X */
    public void m6928X(qyc qycVar, long j, long j2) {
        tga tgaVar = new tga(qycVar.f42621a, qycVar.f42622b, qycVar.m45982e(), qycVar.m45980c(), j, j2, qycVar.m45979a());
        this.f8183H.m48312c(qycVar.f42621a);
        this.f8187X.m24557s(tgaVar, qycVar.f42623c);
        a0(((Long) qycVar.m45981d()).longValue() - j);
    }

    /* renamed from: Y */
    public xga.C18151c m6929Y(qyc qycVar, long j, long j2, IOException iOException) {
        this.f8187X.m24561w(new tga(qycVar.f42621a, qycVar.f42622b, qycVar.m45982e(), qycVar.m45980c(), j, j2, qycVar.m45979a()), qycVar.f42623c, iOException, true);
        this.f8183H.m48312c(qycVar.f42621a);
        m6930Z(iOException);
        return xga.f53733f;
    }

    /* renamed from: Z */
    public final void m6930Z(IOException iOException) {
        ria.m46820d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.z0 = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        b0(true);
    }

    @Override // p001o.x8b
    /* renamed from: a */
    public x4b mo6931a(x8b.C18076b c18076b, ob0 ob0Var, long j) {
        int iIntValue = ((Integer) c18076b.f53356a).intValue() - this.C0;
        e9b.C13130a c13130aM18741w = m18741w(c18076b);
        C2204b c2204b = new C2204b(iIntValue + this.C0, this.v0, this.f8184L, iIntValue, this.f8192s, this.p0, null, this.f8194y, m18739u(c18076b), this.f8183H, c13130aM18741w, this.z0, this.m0, ob0Var, this.f8193x, this.l0, m18744z());
        this.i0.put(c2204b.f8227a, c2204b);
        return c2204b;
    }

    public final void a0(long j) {
        this.z0 = j;
        b0(true);
    }

    @Override // p001o.x8b
    /* renamed from: b */
    public synchronized s2b mo6932b() {
        return this.D0;
    }

    public final void b0(boolean z) {
        g3d g3dVar;
        long j;
        long j2;
        for (int i = 0; i < this.i0.size(); i++) {
            int iKeyAt = this.i0.keyAt(i);
            if (iKeyAt >= this.C0) {
                ((C2204b) this.i0.valueAt(i)).m7000N(this.v0, iKeyAt - this.C0);
            }
        }
        g3d g3dVarM23691d = this.v0.m23691d(0);
        int iM23692e = this.v0.m23692e() - 1;
        g3d g3dVarM23691d2 = this.v0.m23691d(iM23692e);
        long jM23694g = this.v0.m23694g(iM23692e);
        long jO0 = sqi.O0(sqi.f0(this.z0));
        long jM6914L = m6914L(g3dVarM23691d, this.v0.m23694g(0), jO0);
        long jM6913K = m6913K(g3dVarM23691d2, jM23694g, jO0);
        boolean z2 = this.v0.f20433d && !m6917P(g3dVarM23691d2);
        if (z2) {
            long j3 = this.v0.f20435f;
            if (j3 != -9223372036854775807L) {
                jM6914L = Math.max(jM6914L, jM6913K - sqi.O0(j3));
            }
        }
        long j4 = jM6913K - jM6914L;
        dr4 dr4Var = this.v0;
        if (dr4Var.f20433d) {
            op0.m42517g(dr4Var.f20430a != -9223372036854775807L);
            long jO02 = (jO0 - sqi.O0(this.v0.f20430a)) - jM6914L;
            i0(jO02, j4);
            long jQ1 = this.v0.f20430a + sqi.q1(jM6914L);
            long jO03 = jO02 - sqi.O0(this.s0.f44554a);
            long jMin = Math.min(this.f8186Q, j4 / 2);
            j = jQ1;
            j2 = jO03 < jMin ? jMin : jO03;
            g3dVar = g3dVarM23691d;
        } else {
            g3dVar = g3dVarM23691d;
            j = -9223372036854775807L;
            j2 = 0;
        }
        long jO04 = jM6914L - sqi.O0(g3dVar.f24527b);
        dr4 dr4Var2 = this.v0;
        m18729C(new C2196b(dr4Var2.f20430a, j, this.z0, this.C0, jO04, j4, j2, dr4Var2, mo6932b(), this.v0.f20433d ? this.s0 : null));
        if (this.f8190h) {
            return;
        }
        this.r0.removeCallbacks(this.k0);
        if (z2) {
            this.r0.postDelayed(this.k0, m6915M(this.v0, sqi.f0(this.z0)));
        }
        if (this.w0) {
            h0();
            return;
        }
        if (z) {
            dr4 dr4Var3 = this.v0;
            if (dr4Var3.f20433d) {
                long j5 = dr4Var3.f20434e;
                if (j5 != -9223372036854775807L) {
                    if (j5 == 0) {
                        j5 = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
                    }
                    f0(Math.max(0L, (this.x0 + j5) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void c0(hqi hqiVar) {
        String str = hqiVar.f27383a;
        if (sqi.m48724c(str, "urn:mpeg:dash:utc:direct:2014") || sqi.m48724c(str, "urn:mpeg:dash:utc:direct:2012")) {
            d0(hqiVar);
            return;
        }
        if (sqi.m48724c(str, "urn:mpeg:dash:utc:http-iso:2014") || sqi.m48724c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            e0(hqiVar, new C2198d());
            return;
        }
        if (sqi.m48724c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || sqi.m48724c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            e0(hqiVar, new C2202h(null));
        } else if (sqi.m48724c(str, "urn:mpeg:dash:utc:ntp:2014") || sqi.m48724c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            m6922R();
        } else {
            m6930Z(new IOException("Unsupported UTC timing scheme"));
        }
    }

    public final void d0(hqi hqiVar) {
        try {
            a0(sqi.U0(hqiVar.f27384b) - this.y0);
        } catch (byc e) {
            m6930Z(e);
        }
    }

    @Override // p001o.x8b
    /* renamed from: e */
    public void mo6933e(x4b x4bVar) {
        C2204b c2204b = (C2204b) x4bVar;
        c2204b.m6996J();
        this.i0.remove(c2204b.f8227a);
    }

    public final void e0(hqi hqiVar, qyc.InterfaceC16488a interfaceC16488a) {
        g0(new qyc(this.n0, Uri.parse(hqiVar.f27384b), 5, interfaceC16488a), new C2201g(this, null), 1);
    }

    public final void f0(long j) {
        this.r0.postDelayed(this.j0, j);
    }

    public final void g0(qyc qycVar, xga.InterfaceC18150b interfaceC18150b, int i) {
        this.f8187X.m24563y(new tga(qycVar.f42621a, qycVar.f42622b, this.o0.m56270n(qycVar, interfaceC18150b, i)), qycVar.f42623c);
    }

    public final void h0() {
        Uri uri;
        this.r0.removeCallbacks(this.j0);
        if (this.o0.m56265i()) {
            return;
        }
        if (this.o0.m56266j()) {
            this.w0 = true;
            return;
        }
        synchronized (this.h0) {
            uri = this.t0;
        }
        this.w0 = false;
        g0(new qyc(this.n0, uri, 4, this.f8188Y), this.f8189Z, this.f8183H.mo48310a(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(long j, long j2) {
        long j3;
        long jMin;
        long jQ1;
        long j4;
        long jM48737p;
        long j5;
        long jM48737p2;
        float f;
        float f2;
        fgf fgfVar;
        s2b.C16722g c16722g = mo6932b().f44482d;
        long jQ12 = sqi.q1(j);
        long j6 = c16722g.f44556c;
        if (j6 == -9223372036854775807L) {
            fgf fgfVar2 = this.v0.f20439j;
            if (fgfVar2 != null) {
                long j7 = fgfVar2.f23305c;
                if (j7 != -9223372036854775807L) {
                    jMin = Math.min(jQ12, j7);
                }
            }
            j3 = jQ12;
            jQ1 = sqi.q1(j - j2);
            if (jQ1 < 0 && j3 > 0) {
                jQ1 = 0;
            }
            j4 = this.v0.f20432c;
            if (j4 != -9223372036854775807L) {
                jQ1 = Math.min(jQ1 + j4, jQ12);
            }
            jM48737p = jQ1;
            j5 = c16722g.f44555b;
            if (j5 == -9223372036854775807L) {
                jM48737p = sqi.m48737p(j5, jM48737p, jQ12);
            } else {
                fgf fgfVar3 = this.v0.f20439j;
                if (fgfVar3 != null) {
                    long j8 = fgfVar3.f23304b;
                    if (j8 != -9223372036854775807L) {
                        jM48737p = sqi.m48737p(j8, jM48737p, jQ12);
                    }
                }
            }
            if (jM48737p > j3) {
                j3 = jM48737p;
            }
            jM48737p2 = this.s0.f44554a;
            if (jM48737p2 == -9223372036854775807L) {
                dr4 dr4Var = this.v0;
                fgf fgfVar4 = dr4Var.f20439j;
                if (fgfVar4 != null) {
                    long j9 = fgfVar4.f23303a;
                    if (j9 != -9223372036854775807L) {
                        jM48737p2 = j9;
                    } else {
                        jM48737p2 = dr4Var.f20436g;
                        if (jM48737p2 == -9223372036854775807L) {
                            jM48737p2 = this.f8185M;
                        }
                    }
                }
            }
            if (jM48737p2 < jM48737p) {
                jM48737p2 = jM48737p;
            }
            if (jM48737p2 > j3) {
                jM48737p2 = sqi.m48737p(sqi.q1(j - Math.min(this.f8186Q, j2 / 2)), jM48737p, j3);
            }
            f = c16722g.f44557d;
            if (f == -3.4028235E38f) {
                fgf fgfVar5 = this.v0.f20439j;
                f = fgfVar5 != null ? fgfVar5.f23306d : -3.4028235E38f;
            }
            f2 = c16722g.f44558e;
            if (f2 == -3.4028235E38f) {
                fgf fgfVar6 = this.v0.f20439j;
                f2 = fgfVar6 != null ? fgfVar6.f23307e : -3.4028235E38f;
            }
            if (f == -3.4028235E38f && f2 == -3.4028235E38f && ((fgfVar = this.v0.f20439j) == null || fgfVar.f23303a == -9223372036854775807L)) {
                f = 1.0f;
                f2 = 1.0f;
            }
            this.s0 = new s2b.C16722g.a().m47508k(jM48737p2).m47506i(jM48737p).m47504g(j3).m47507j(f).m47505h(f2).m47503f();
        }
        jMin = Math.min(jQ12, j6);
        j3 = jMin;
        jQ1 = sqi.q1(j - j2);
        if (jQ1 < 0) {
            jQ1 = 0;
        }
        j4 = this.v0.f20432c;
        if (j4 != -9223372036854775807L) {
        }
        jM48737p = jQ1;
        j5 = c16722g.f44555b;
        if (j5 == -9223372036854775807L) {
        }
        if (jM48737p > j3) {
        }
        jM48737p2 = this.s0.f44554a;
        if (jM48737p2 == -9223372036854775807L) {
        }
        if (jM48737p2 < jM48737p) {
        }
        if (jM48737p2 > j3) {
        }
        f = c16722g.f44557d;
        if (f == -3.4028235E38f) {
        }
        f2 = c16722g.f44558e;
        if (f2 == -3.4028235E38f) {
        }
        if (f == -3.4028235E38f) {
            f = 1.0f;
            f2 = 1.0f;
        }
        this.s0 = new s2b.C16722g.a().m47508k(jM48737p2).m47506i(jM48737p).m47504g(j3).m47507j(f).m47505h(f2).m47503f();
    }

    @Override // p001o.x8b
    /* renamed from: j */
    public void mo6934j() {
        this.m0.mo6966a();
    }

    @Override // p001o.x8b
    /* renamed from: n */
    public synchronized void mo6935n(s2b s2bVar) {
        this.D0 = s2bVar;
    }

    public DashMediaSource(s2b s2bVar, dr4 dr4Var, dz4.InterfaceC13064a interfaceC13064a, qyc.InterfaceC16488a interfaceC16488a, InterfaceC2203a.a aVar, qo3 qo3Var, oe3 oe3Var, nz5 nz5Var, sga sgaVar, long j, long j2) {
        this.D0 = s2bVar;
        this.s0 = s2bVar.f44482d;
        this.t0 = ((s2b.C16723h) op0.m42515e(s2bVar.f44480b)).f44572a;
        this.u0 = s2bVar.f44480b.f44572a;
        this.v0 = dr4Var;
        this.f8191q = interfaceC13064a;
        this.f8188Y = interfaceC16488a;
        this.f8192s = aVar;
        this.f8194y = nz5Var;
        this.f8183H = sgaVar;
        this.f8185M = j;
        this.f8186Q = j2;
        this.f8193x = qo3Var;
        this.f8184L = new gf1();
        boolean z = dr4Var != null;
        this.f8190h = z;
        C2195a c2195a = null;
        this.f8187X = m18741w(null);
        this.h0 = new Object();
        this.i0 = new SparseArray();
        this.l0 = new C2197c(this, c2195a);
        this.B0 = -9223372036854775807L;
        this.z0 = -9223372036854775807L;
        if (!z) {
            this.f8189Z = new C2199e(this, c2195a);
            this.m0 = new C2200f();
            this.j0 = new Runnable() { // from class: o.hr4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27387a.h0();
                }
            };
            this.k0 = new Runnable() { // from class: o.ir4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29106a.m6918Q();
                }
            };
            return;
        }
        op0.m42517g(true ^ dr4Var.f20433d);
        this.f8189Z = null;
        this.j0 = null;
        this.k0 = null;
        this.m0 = new zga.C18632a();
    }
}
