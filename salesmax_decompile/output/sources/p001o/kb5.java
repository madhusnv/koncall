package p001o;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.work.PeriodicWorkRequest;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p001o.hy0;
import p001o.kz0;
import p001o.nf8;
import p001o.nz0;
import p001o.sb5;
import p001o.vy0;

/* loaded from: classes2.dex */
public final class kb5 implements kz0 {
    public static boolean n0 = false;
    public static final Object o0 = new Object();
    public static ExecutorService p0;
    public static int q0;

    /* renamed from: A */
    public C14773k f31794A;

    /* renamed from: B */
    public wx0 f31795B;

    /* renamed from: C */
    public C14772j f31796C;

    /* renamed from: D */
    public C14772j f31797D;

    /* renamed from: E */
    public kad f31798E;

    /* renamed from: F */
    public boolean f31799F;

    /* renamed from: G */
    public ByteBuffer f31800G;

    /* renamed from: H */
    public int f31801H;

    /* renamed from: I */
    public long f31802I;

    /* renamed from: J */
    public long f31803J;

    /* renamed from: K */
    public long f31804K;

    /* renamed from: L */
    public long f31805L;

    /* renamed from: M */
    public int f31806M;

    /* renamed from: N */
    public boolean f31807N;

    /* renamed from: O */
    public boolean f31808O;

    /* renamed from: P */
    public long f31809P;

    /* renamed from: Q */
    public float f31810Q;

    /* renamed from: R */
    public ByteBuffer f31811R;

    /* renamed from: S */
    public int f31812S;

    /* renamed from: T */
    public ByteBuffer f31813T;

    /* renamed from: U */
    public byte[] f31814U;

    /* renamed from: V */
    public int f31815V;

    /* renamed from: W */
    public boolean f31816W;

    /* renamed from: X */
    public boolean f31817X;

    /* renamed from: Y */
    public boolean f31818Y;

    /* renamed from: Z */
    public boolean f31819Z;

    /* renamed from: a */
    public final Context f31820a;
    public boolean a0;

    /* renamed from: b */
    public final wy0 f31821b;
    public int b0;

    /* renamed from: c */
    public final boolean f31822c;
    public v61 c0;

    /* renamed from: d */
    public final ug2 f31823d;
    public iy0 d0;

    /* renamed from: e */
    public final uxh f31824e;
    public boolean e0;

    /* renamed from: f */
    public final nf8 f31825f;
    public long f0;

    /* renamed from: g */
    public final nf8 f31826g;
    public long g0;

    /* renamed from: h */
    public final jq3 f31827h;
    public boolean h0;

    /* renamed from: i */
    public final nz0 f31828i;
    public boolean i0;

    /* renamed from: j */
    public final ArrayDeque f31829j;
    public Looper j0;

    /* renamed from: k */
    public final boolean f31830k;
    public long k0;

    /* renamed from: l */
    public int f31831l;
    public long l0;

    /* renamed from: m */
    public C14776n f31832m;
    public Handler m0;

    /* renamed from: n */
    public final C14774l f31833n;

    /* renamed from: o */
    public final C14774l f31834o;

    /* renamed from: p */
    public final InterfaceC14767e f31835p;

    /* renamed from: q */
    public final InterfaceC14766d f31836q;

    /* renamed from: r */
    public final ExoPlayer.InterfaceC2188a f31837r;

    /* renamed from: s */
    public jbd f31838s;

    /* renamed from: t */
    public kz0.InterfaceC14940d f31839t;

    /* renamed from: u */
    public C14769g f31840u;

    /* renamed from: v */
    public C14769g f31841v;

    /* renamed from: w */
    public uy0 f31842w;

    /* renamed from: x */
    public AudioTrack f31843x;

    /* renamed from: y */
    public dy0 f31844y;

    /* renamed from: z */
    public hy0 f31845z;

    /* renamed from: o.kb5$b */
    public static final class C14764b {
        /* renamed from: a */
        public static void m35303a(AudioTrack audioTrack, iy0 iy0Var) {
            audioTrack.setPreferredDevice(iy0Var == null ? null : iy0Var.f29353a);
        }
    }

    /* renamed from: o.kb5$c */
    public static final class C14765c {
        /* renamed from: a */
        public static void m35304a(AudioTrack audioTrack, jbd jbdVar) {
            LogSessionId logSessionIdM33479a = jbdVar.m33479a();
            if (logSessionIdM33479a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdM33479a);
        }
    }

    /* renamed from: o.kb5$d */
    public interface InterfaceC14766d {
        /* renamed from: a */
        ty0 mo18544a(C2181a c2181a, wx0 wx0Var);
    }

    /* renamed from: o.kb5$e */
    public interface InterfaceC14767e {

        /* renamed from: a */
        public static final InterfaceC14767e f31846a = new sb5.C16793a().m48118h();

        /* renamed from: a */
        int mo35305a(int i, int i2, int i3, int i4, int i5, int i6, double d);
    }

    /* renamed from: o.kb5$f */
    public static final class C14768f {

        /* renamed from: a */
        public final Context f31847a;

        /* renamed from: c */
        public wy0 f31849c;

        /* renamed from: d */
        public boolean f31850d;

        /* renamed from: e */
        public boolean f31851e;

        /* renamed from: f */
        public boolean f31852f;

        /* renamed from: h */
        public InterfaceC14766d f31854h;

        /* renamed from: i */
        public ExoPlayer.InterfaceC2188a f31855i;

        /* renamed from: b */
        public dy0 f31848b = dy0.f20633c;

        /* renamed from: g */
        public InterfaceC14767e f31853g = InterfaceC14767e.f31846a;

        public C14768f(Context context) {
            this.f31847a = context;
        }

        /* renamed from: i */
        public kb5 m35314i() {
            op0.m42517g(!this.f31852f);
            this.f31852f = true;
            if (this.f31849c == null) {
                this.f31849c = new C14770h(new vy0[0]);
            }
            if (this.f31854h == null) {
                this.f31854h = new bb5(this.f31847a);
            }
            return new kb5(this);
        }

        /* renamed from: j */
        public C14768f m35315j(boolean z) {
            this.f31851e = z;
            return this;
        }

        /* renamed from: k */
        public C14768f m35316k(boolean z) {
            this.f31850d = z;
            return this;
        }
    }

    /* renamed from: o.kb5$g */
    public static final class C14769g {

        /* renamed from: a */
        public final C2181a f31856a;

        /* renamed from: b */
        public final int f31857b;

        /* renamed from: c */
        public final int f31858c;

        /* renamed from: d */
        public final int f31859d;

        /* renamed from: e */
        public final int f31860e;

        /* renamed from: f */
        public final int f31861f;

        /* renamed from: g */
        public final int f31862g;

        /* renamed from: h */
        public final int f31863h;

        /* renamed from: i */
        public final uy0 f31864i;

        /* renamed from: j */
        public final boolean f31865j;

        /* renamed from: k */
        public final boolean f31866k;

        /* renamed from: l */
        public final boolean f31867l;

        public C14769g(C2181a c2181a, int i, int i2, int i3, int i4, int i5, int i6, int i7, uy0 uy0Var, boolean z, boolean z2, boolean z3) {
            this.f31856a = c2181a;
            this.f31857b = i;
            this.f31858c = i2;
            this.f31859d = i3;
            this.f31860e = i4;
            this.f31861f = i5;
            this.f31862g = i6;
            this.f31863h = i7;
            this.f31864i = uy0Var;
            this.f31865j = z;
            this.f31866k = z2;
            this.f31867l = z3;
        }

        /* renamed from: j */
        public static AudioAttributes m35317j(wx0 wx0Var, boolean z) {
            return z ? m35318k() : wx0Var.m55314a().f52822a;
        }

        /* renamed from: k */
        public static AudioAttributes m35318k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        /* renamed from: a */
        public AudioTrack m35319a(wx0 wx0Var, int i) throws kz0.C14939c {
            try {
                AudioTrack audioTrackM35323e = m35323e(wx0Var, i);
                int state = audioTrackM35323e.getState();
                if (state == 1) {
                    return audioTrackM35323e;
                }
                try {
                    audioTrackM35323e.release();
                } catch (Exception unused) {
                }
                throw new kz0.C14939c(state, this.f31860e, this.f31861f, this.f31863h, this.f31856a, m35329m(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new kz0.C14939c(0, this.f31860e, this.f31861f, this.f31863h, this.f31856a, m35329m(), e);
            }
        }

        /* renamed from: b */
        public kz0.C14937a m35320b() {
            return new kz0.C14937a(this.f31862g, this.f31860e, this.f31861f, this.f31867l, this.f31858c == 1, this.f31863h);
        }

        /* renamed from: c */
        public boolean m35321c(C14769g c14769g) {
            return c14769g.f31858c == this.f31858c && c14769g.f31862g == this.f31862g && c14769g.f31860e == this.f31860e && c14769g.f31861f == this.f31861f && c14769g.f31859d == this.f31859d && c14769g.f31865j == this.f31865j && c14769g.f31866k == this.f31866k;
        }

        /* renamed from: d */
        public C14769g m35322d(int i) {
            return new C14769g(this.f31856a, this.f31857b, this.f31858c, this.f31859d, this.f31860e, this.f31861f, this.f31862g, i, this.f31864i, this.f31865j, this.f31866k, this.f31867l);
        }

        /* renamed from: e */
        public final AudioTrack m35323e(wx0 wx0Var, int i) {
            int i2 = sqi.f45790a;
            return i2 >= 29 ? m35325g(wx0Var, i) : i2 >= 21 ? m35324f(wx0Var, i) : m35326h(wx0Var, i);
        }

        /* renamed from: f */
        public final AudioTrack m35324f(wx0 wx0Var, int i) {
            return new AudioTrack(m35317j(wx0Var, this.f31867l), sqi.m48707L(this.f31860e, this.f31861f, this.f31862g), this.f31863h, 1, i);
        }

        /* renamed from: g */
        public final AudioTrack m35325g(wx0 wx0Var, int i) {
            return new AudioTrack.Builder().setAudioAttributes(m35317j(wx0Var, this.f31867l)).setAudioFormat(sqi.m48707L(this.f31860e, this.f31861f, this.f31862g)).setTransferMode(1).setBufferSizeInBytes(this.f31863h).setSessionId(i).setOffloadedPlayback(this.f31858c == 1).build();
        }

        /* renamed from: h */
        public final AudioTrack m35326h(wx0 wx0Var, int i) {
            int iM0 = sqi.m0(wx0Var.f52818c);
            return i == 0 ? new AudioTrack(iM0, this.f31860e, this.f31861f, this.f31862g, this.f31863h, 1) : new AudioTrack(iM0, this.f31860e, this.f31861f, this.f31862g, this.f31863h, 1, i);
        }

        /* renamed from: i */
        public long m35327i(long j) {
            return sqi.Z0(j, this.f31860e);
        }

        /* renamed from: l */
        public long m35328l(long j) {
            return sqi.Z0(j, this.f31856a.f7920C);
        }

        /* renamed from: m */
        public boolean m35329m() {
            return this.f31858c == 1;
        }
    }

    /* renamed from: o.kb5$h */
    public static class C14770h implements wy0 {

        /* renamed from: a */
        public final vy0[] f31868a;

        /* renamed from: b */
        public final csf f31869b;

        /* renamed from: c */
        public final izf f31870c;

        public C14770h(vy0... vy0VarArr) {
            this(vy0VarArr, new csf(), new izf());
        }

        @Override // p001o.wy0
        /* renamed from: a */
        public long mo35330a(long j) {
            return this.f31870c.mo21720a() ? this.f31870c.m32954g(j) : j;
        }

        @Override // p001o.wy0
        /* renamed from: b */
        public kad mo35331b(kad kadVar) {
            this.f31870c.m32956i(kadVar.f31768a);
            this.f31870c.m32955h(kadVar.f31769b);
            return kadVar;
        }

        @Override // p001o.wy0
        /* renamed from: c */
        public vy0[] mo35332c() {
            return this.f31868a;
        }

        @Override // p001o.wy0
        /* renamed from: d */
        public long mo35333d() {
            return this.f31869b.m21734u();
        }

        @Override // p001o.wy0
        /* renamed from: e */
        public boolean mo35334e(boolean z) {
            this.f31869b.m21718D(z);
            return z;
        }

        public C14770h(vy0[] vy0VarArr, csf csfVar, izf izfVar) {
            vy0[] vy0VarArr2 = new vy0[vy0VarArr.length + 2];
            this.f31868a = vy0VarArr2;
            System.arraycopy(vy0VarArr, 0, vy0VarArr2, 0, vy0VarArr.length);
            this.f31869b = csfVar;
            this.f31870c = izfVar;
            vy0VarArr2[vy0VarArr.length] = csfVar;
            vy0VarArr2[vy0VarArr.length + 1] = izfVar;
        }
    }

    /* renamed from: o.kb5$i */
    public static final class C14771i extends RuntimeException {
        public C14771i(String str) {
            super(str);
        }
    }

    /* renamed from: o.kb5$j */
    public static final class C14772j {

        /* renamed from: a */
        public final kad f31871a;

        /* renamed from: b */
        public final long f31872b;

        /* renamed from: c */
        public final long f31873c;

        public C14772j(kad kadVar, long j, long j2) {
            this.f31871a = kadVar;
            this.f31872b = j;
            this.f31873c = j2;
        }
    }

    /* renamed from: o.kb5$k */
    public static final class C14773k {

        /* renamed from: a */
        public final AudioTrack f31874a;

        /* renamed from: b */
        public final hy0 f31875b;

        /* renamed from: c */
        public AudioRouting.OnRoutingChangedListener f31876c = new AudioRouting.OnRoutingChangedListener() { // from class: o.ob5
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f38030a.m35336b(audioRouting);
            }
        };

        public C14773k(AudioTrack audioTrack, hy0 hy0Var) {
            this.f31874a = audioTrack;
            this.f31875b = hy0Var;
            audioTrack.addOnRoutingChangedListener(this.f31876c, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m35336b(AudioRouting audioRouting) {
            if (this.f31876c == null || audioRouting.getRoutedDevice() == null) {
                return;
            }
            this.f31875b.m31279i(audioRouting.getRoutedDevice());
        }

        /* renamed from: c */
        public void m35337c() {
            this.f31874a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) op0.m42515e(this.f31876c));
            this.f31876c = null;
        }
    }

    /* renamed from: o.kb5$l */
    public static final class C14774l {

        /* renamed from: a */
        public final long f31877a;

        /* renamed from: b */
        public Exception f31878b;

        /* renamed from: c */
        public long f31879c;

        public C14774l(long j) {
            this.f31877a = j;
        }

        /* renamed from: a */
        public void m35338a() {
            this.f31878b = null;
        }

        /* renamed from: b */
        public void m35339b(Exception exc) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f31878b == null) {
                this.f31878b = exc;
                this.f31879c = this.f31877a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f31879c) {
                Exception exc2 = this.f31878b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.f31878b;
                m35338a();
                throw exc3;
            }
        }
    }

    /* renamed from: o.kb5$m */
    public final class C14775m implements nz0.InterfaceC15680a {
        public C14775m() {
        }

        @Override // p001o.nz0.InterfaceC15680a
        /* renamed from: a */
        public void mo35340a(int i, long j) {
            if (kb5.this.f31839t != null) {
                kb5.this.f31839t.mo36364h(i, j, SystemClock.elapsedRealtime() - kb5.this.g0);
            }
        }

        @Override // p001o.nz0.InterfaceC15680a
        /* renamed from: b */
        public void mo35341b(long j) {
            ria.m46824h("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // p001o.nz0.InterfaceC15680a
        /* renamed from: c */
        public void mo35342c(long j) {
            if (kb5.this.f31839t != null) {
                kb5.this.f31839t.mo36359c(j);
            }
        }

        @Override // p001o.nz0.InterfaceC15680a
        /* renamed from: d */
        public void mo35343d(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + kb5.this.m35274T() + ", " + kb5.this.m35275U();
            if (kb5.n0) {
                throw new C14771i(str);
            }
            ria.m46824h("DefaultAudioSink", str);
        }

        @Override // p001o.nz0.InterfaceC15680a
        /* renamed from: e */
        public void mo35344e(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + kb5.this.m35274T() + ", " + kb5.this.m35275U();
            if (kb5.n0) {
                throw new C14771i(str);
            }
            ria.m46824h("DefaultAudioSink", str);
        }
    }

    /* renamed from: o.kb5$n */
    public final class C14776n {

        /* renamed from: a */
        public final Handler f31881a = new Handler(Looper.myLooper());

        /* renamed from: b */
        public final AudioTrack$StreamEventCallback f31882b;

        /* renamed from: o.kb5$n$a */
        public class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a */
            public final /* synthetic */ kb5 f31884a;

            public a(kb5 kb5Var) {
                this.f31884a = kb5Var;
            }

            public void onDataRequest(AudioTrack audioTrack, int i) {
                if (audioTrack.equals(kb5.this.f31843x) && kb5.this.f31839t != null && kb5.this.f31819Z) {
                    kb5.this.f31839t.mo36367k();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(kb5.this.f31843x)) {
                    kb5.this.f31818Y = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(kb5.this.f31843x) && kb5.this.f31839t != null && kb5.this.f31819Z) {
                    kb5.this.f31839t.mo36367k();
                }
            }
        }

        public C14776n() {
            this.f31882b = new a(kb5.this);
        }

        /* renamed from: a */
        public void m35345a(AudioTrack audioTrack) {
            Handler handler = this.f31881a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new rb5(handler), this.f31882b);
        }

        /* renamed from: b */
        public void m35346b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f31882b);
            this.f31881a.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: R */
    public static int m35261R(int i, int i2, int i3) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        op0.m42517g(minBufferSize != -2);
        return minBufferSize;
    }

    /* renamed from: S */
    public static int m35262S(int i, ByteBuffer byteBuffer) {
        if (i == 20) {
            return vec.m52671h(byteBuffer);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iM32453m = inb.m32453m(sqi.m48710O(byteBuffer, byteBuffer.position()));
                    if (iM32453m != -1) {
                        return iM32453m;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int iM26323b = fa.m26323b(byteBuffer);
                            if (iM26323b == -1) {
                                return 0;
                            }
                            return fa.m26330i(byteBuffer, iM26323b) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return ja.m33429c(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i);
                    }
            }
            return fa.m26326e(byteBuffer);
        }
        return q06.m44597f(byteBuffer);
    }

    /* renamed from: X */
    public static boolean m35263X(int i) {
        return (sqi.f45790a >= 24 && i == -6) || i == -32;
    }

    /* renamed from: Z */
    public static boolean m35264Z(AudioTrack audioTrack) {
        return sqi.f45790a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static /* synthetic */ void b0(AudioTrack audioTrack, final kz0.InterfaceC14940d interfaceC14940d, Handler handler, final kz0.C14937a c14937a, jq3 jq3Var) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (interfaceC14940d != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: o.jb5
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC14940d.mo36357a(c14937a);
                    }
                });
            }
            jq3Var.m34270e();
            synchronized (o0) {
                int i = q0 - 1;
                q0 = i;
                if (i == 0) {
                    p0.shutdown();
                    p0 = null;
                }
            }
        } catch (Throwable th) {
            if (interfaceC14940d != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: o.jb5
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC14940d.mo36357a(c14937a);
                    }
                });
            }
            jq3Var.m34270e();
            synchronized (o0) {
                int i2 = q0 - 1;
                q0 = i2;
                if (i2 == 0) {
                    p0.shutdown();
                    p0 = null;
                }
                throw th;
            }
        }
    }

    public static void j0(final AudioTrack audioTrack, final jq3 jq3Var, final kz0.InterfaceC14940d interfaceC14940d, final kz0.C14937a c14937a) {
        jq3Var.m34268c();
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (o0) {
            if (p0 == null) {
                p0 = sqi.P0("ExoPlayer:AudioTrackReleaseThread");
            }
            q0++;
            p0.execute(new Runnable() { // from class: o.hb5
                @Override // java.lang.Runnable
                public final void run() {
                    kb5.b0(audioTrack, interfaceC14940d, handler, c14937a, jq3Var);
                }
            });
        }
    }

    public static void o0(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    public static void p0(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    public static int v0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @Override // p001o.kz0
    /* renamed from: A */
    public int mo35266A(C2181a c2181a) {
        e0();
        if (!"audio/raw".equals(c2181a.f7943n)) {
            return this.f31844y.m23943k(c2181a, this.f31795B) ? 2 : 0;
        }
        if (sqi.F0(c2181a.f7921D)) {
            int i = c2181a.f7921D;
            return (i == 2 || (this.f31822c && i == 4)) ? 2 : 1;
        }
        ria.m46824h("DefaultAudioSink", "Invalid PCM encoding: " + c2181a.f7921D);
        return 0;
    }

    @Override // p001o.kz0
    /* renamed from: B */
    public void mo35267B(boolean z) {
        this.f31799F = z;
        l0(t0() ? kad.f31765d : this.f31798E);
    }

    /* renamed from: L */
    public final void m35268L(long j) {
        kad kadVarMo35331b;
        if (t0()) {
            kadVarMo35331b = kad.f31765d;
        } else {
            kadVarMo35331b = r0() ? this.f31821b.mo35331b(this.f31798E) : kad.f31765d;
            this.f31798E = kadVarMo35331b;
        }
        kad kadVar = kadVarMo35331b;
        this.f31799F = r0() ? this.f31821b.mo35334e(this.f31799F) : false;
        this.f31829j.add(new C14772j(kadVar, Math.max(0L, j), this.f31841v.m35327i(m35275U())));
        q0();
        kz0.InterfaceC14940d interfaceC14940d = this.f31839t;
        if (interfaceC14940d != null) {
            interfaceC14940d.mo36360d(this.f31799F);
        }
    }

    /* renamed from: M */
    public final long m35269M(long j) {
        while (!this.f31829j.isEmpty() && j >= ((C14772j) this.f31829j.getFirst()).f31873c) {
            this.f31797D = (C14772j) this.f31829j.remove();
        }
        long j2 = j - this.f31797D.f31873c;
        if (this.f31829j.isEmpty()) {
            return this.f31797D.f31872b + this.f31821b.mo35330a(j2);
        }
        C14772j c14772j = (C14772j) this.f31829j.getFirst();
        return c14772j.f31872b - sqi.e0(c14772j.f31873c - j, this.f31797D.f31871a.f31768a);
    }

    /* renamed from: N */
    public final long m35270N(long j) {
        long jMo35333d = this.f31821b.mo35333d();
        long jM35327i = j + this.f31841v.m35327i(jMo35333d);
        long j2 = this.k0;
        if (jMo35333d > j2) {
            long jM35327i2 = this.f31841v.m35327i(jMo35333d - j2);
            this.k0 = jMo35333d;
            m35276V(jM35327i2);
        }
        return jM35327i;
    }

    /* renamed from: O */
    public final AudioTrack m35271O(C14769g c14769g) throws kz0.C14939c {
        try {
            AudioTrack audioTrackM35319a = c14769g.m35319a(this.f31795B, this.b0);
            ExoPlayer.InterfaceC2188a interfaceC2188a = this.f31837r;
            if (interfaceC2188a != null) {
                interfaceC2188a.m6830C(m35264Z(audioTrackM35319a));
            }
            return audioTrackM35319a;
        } catch (kz0.C14939c e) {
            kz0.InterfaceC14940d interfaceC14940d = this.f31839t;
            if (interfaceC14940d != null) {
                interfaceC14940d.mo36361e(e);
            }
            throw e;
        }
    }

    /* renamed from: P */
    public final AudioTrack m35272P() throws kz0.C14939c {
        try {
            return m35271O((C14769g) op0.m42515e(this.f31841v));
        } catch (kz0.C14939c e) {
            C14769g c14769g = this.f31841v;
            if (c14769g.f31863h > 1000000) {
                C14769g c14769gM35322d = c14769g.m35322d(1000000);
                try {
                    AudioTrack audioTrackM35271O = m35271O(c14769gM35322d);
                    this.f31841v = c14769gM35322d;
                    return audioTrackM35271O;
                } catch (kz0.C14939c e2) {
                    e.addSuppressed(e2);
                    c0();
                    throw e;
                }
            }
            c0();
            throw e;
        }
    }

    /* renamed from: Q */
    public final boolean m35273Q() throws Exception {
        if (!this.f31842w.m52128f()) {
            ByteBuffer byteBuffer = this.f31813T;
            if (byteBuffer == null) {
                return true;
            }
            u0(byteBuffer, Long.MIN_VALUE);
            return this.f31813T == null;
        }
        this.f31842w.m52130h();
        h0(Long.MIN_VALUE);
        if (!this.f31842w.m52127e()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f31813T;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    /* renamed from: T */
    public final long m35274T() {
        return this.f31841v.f31858c == 0 ? this.f31802I / r0.f31857b : this.f31803J;
    }

    /* renamed from: U */
    public final long m35275U() {
        return this.f31841v.f31858c == 0 ? sqi.m48732k(this.f31804K, r0.f31859d) : this.f31805L;
    }

    /* renamed from: V */
    public final void m35276V(long j) {
        this.l0 += j;
        if (this.m0 == null) {
            this.m0 = new Handler(Looper.myLooper());
        }
        this.m0.removeCallbacksAndMessages(null);
        this.m0.postDelayed(new Runnable() { // from class: o.gb5
            @Override // java.lang.Runnable
            public final void run() {
                this.f24861a.d0();
            }
        }, 100L);
    }

    /* renamed from: W */
    public final boolean m35277W() throws kz0.C14939c {
        hy0 hy0Var;
        jbd jbdVar;
        if (!this.f31827h.m34269d()) {
            return false;
        }
        AudioTrack audioTrackM35272P = m35272P();
        this.f31843x = audioTrackM35272P;
        if (m35264Z(audioTrackM35272P)) {
            i0(this.f31843x);
            C14769g c14769g = this.f31841v;
            if (c14769g.f31866k) {
                AudioTrack audioTrack = this.f31843x;
                C2181a c2181a = c14769g.f31856a;
                audioTrack.setOffloadDelayPadding(c2181a.f7922E, c2181a.f7923F);
            }
        }
        int i = sqi.f45790a;
        if (i >= 31 && (jbdVar = this.f31838s) != null) {
            C14765c.m35304a(this.f31843x, jbdVar);
        }
        this.b0 = this.f31843x.getAudioSessionId();
        nz0 nz0Var = this.f31828i;
        AudioTrack audioTrack2 = this.f31843x;
        C14769g c14769g2 = this.f31841v;
        nz0Var.m41285s(audioTrack2, c14769g2.f31858c == 2, c14769g2.f31862g, c14769g2.f31859d, c14769g2.f31863h);
        n0();
        int i2 = this.c0.f49910a;
        if (i2 != 0) {
            this.f31843x.attachAuxEffect(i2);
            this.f31843x.setAuxEffectSendLevel(this.c0.f49911b);
        }
        iy0 iy0Var = this.d0;
        if (iy0Var != null && i >= 23) {
            C14764b.m35303a(this.f31843x, iy0Var);
            hy0 hy0Var2 = this.f31845z;
            if (hy0Var2 != null) {
                hy0Var2.m31279i(this.d0.f29353a);
            }
        }
        if (i >= 24 && (hy0Var = this.f31845z) != null) {
            this.f31794A = new C14773k(this.f31843x, hy0Var);
        }
        this.f31808O = true;
        kz0.InterfaceC14940d interfaceC14940d = this.f31839t;
        if (interfaceC14940d != null) {
            interfaceC14940d.mo36358b(this.f31841v.m35320b());
        }
        return true;
    }

    /* renamed from: Y */
    public final boolean m35278Y() {
        return this.f31843x != null;
    }

    @Override // p001o.kz0
    /* renamed from: a */
    public boolean mo35279a(C2181a c2181a) {
        return mo35266A(c2181a) != 0;
    }

    @Override // p001o.kz0
    /* renamed from: b */
    public boolean mo35280b() {
        return !m35278Y() || (this.f31816W && !mo35287j());
    }

    public final void c0() {
        if (this.f31841v.m35329m()) {
            this.h0 = true;
        }
    }

    @Override // p001o.kz0
    /* renamed from: d */
    public void mo35281d(kad kadVar) {
        this.f31798E = new kad(sqi.m48735n(kadVar.f31768a, 0.1f, 8.0f), sqi.m48735n(kadVar.f31769b, 0.1f, 8.0f));
        if (t0()) {
            m0();
        } else {
            l0(kadVar);
        }
    }

    public final void d0() {
        if (this.l0 >= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            this.f31839t.mo36362f();
            this.l0 = 0L;
        }
    }

    @Override // p001o.kz0
    /* renamed from: e */
    public kad mo35282e() {
        return this.f31798E;
    }

    public final void e0() {
        if (this.f31845z != null || this.f31820a == null) {
            return;
        }
        this.j0 = Looper.myLooper();
        hy0 hy0Var = new hy0(this.f31820a, new hy0.InterfaceC14125f() { // from class: o.ib5
            @Override // p001o.hy0.InterfaceC14125f
            /* renamed from: a */
            public final void mo31285a(dy0 dy0Var) {
                this.f28372a.f0(dy0Var);
            }
        }, this.f31795B, this.d0);
        this.f31845z = hy0Var;
        this.f31844y = hy0Var.m31277g();
    }

    @Override // p001o.kz0
    /* renamed from: f */
    public void mo35283f(jbd jbdVar) {
        this.f31838s = jbdVar;
    }

    public void f0(dy0 dy0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.j0;
        if (looper == looperMyLooper) {
            if (dy0Var.equals(this.f31844y)) {
                return;
            }
            this.f31844y = dy0Var;
            kz0.InterfaceC14940d interfaceC14940d = this.f31839t;
            if (interfaceC14940d != null) {
                interfaceC14940d.mo36365i();
                return;
            }
            return;
        }
        String name = looper == null ? "null" : looper.getThread().getName();
        throw new IllegalStateException("Current looper (" + (looperMyLooper != null ? looperMyLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
    }

    @Override // p001o.kz0
    public void flush() throws IllegalStateException {
        C14773k c14773k;
        if (m35278Y()) {
            k0();
            if (this.f31828i.m41276i()) {
                this.f31843x.pause();
            }
            if (m35264Z(this.f31843x)) {
                ((C14776n) op0.m42515e(this.f31832m)).m35346b(this.f31843x);
            }
            int i = sqi.f45790a;
            if (i < 21 && !this.a0) {
                this.b0 = 0;
            }
            kz0.C14937a c14937aM35320b = this.f31841v.m35320b();
            C14769g c14769g = this.f31840u;
            if (c14769g != null) {
                this.f31841v = c14769g;
                this.f31840u = null;
            }
            this.f31828i.m41283q();
            if (i >= 24 && (c14773k = this.f31794A) != null) {
                c14773k.m35337c();
                this.f31794A = null;
            }
            j0(this.f31843x, this.f31827h, this.f31839t, c14937aM35320b);
            this.f31843x = null;
        }
        this.f31834o.m35338a();
        this.f31833n.m35338a();
        this.k0 = 0L;
        this.l0 = 0L;
        Handler handler = this.m0;
        if (handler != null) {
            ((Handler) op0.m42515e(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // p001o.kz0
    /* renamed from: g */
    public void mo35284g() throws IllegalStateException {
        this.f31819Z = true;
        if (m35278Y()) {
            this.f31828i.m41288v();
            this.f31843x.play();
        }
    }

    public final void g0() throws IllegalStateException {
        if (this.f31817X) {
            return;
        }
        this.f31817X = true;
        this.f31828i.m41274g(m35275U());
        if (m35264Z(this.f31843x)) {
            this.f31818Y = false;
        }
        this.f31843x.stop();
        this.f31801H = 0;
    }

    @Override // p001o.kz0
    /* renamed from: h */
    public ty0 mo35285h(C2181a c2181a) {
        return this.h0 ? ty0.f48024d : this.f31836q.mo18544a(c2181a, this.f31795B);
    }

    public final void h0(long j) throws Exception {
        ByteBuffer byteBufferM52126d;
        if (!this.f31842w.m52128f()) {
            ByteBuffer byteBuffer = this.f31811R;
            if (byteBuffer == null) {
                byteBuffer = vy0.f51019a;
            }
            u0(byteBuffer, j);
            return;
        }
        while (!this.f31842w.m52127e()) {
            do {
                byteBufferM52126d = this.f31842w.m52126d();
                if (byteBufferM52126d.hasRemaining()) {
                    u0(byteBufferM52126d, j);
                } else {
                    ByteBuffer byteBuffer2 = this.f31811R;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f31842w.m52131i(this.f31811R);
                    }
                }
            } while (!byteBufferM52126d.hasRemaining());
            return;
        }
    }

    @Override // p001o.kz0
    /* renamed from: i */
    public void mo35286i(AudioDeviceInfo audioDeviceInfo) {
        this.d0 = audioDeviceInfo == null ? null : new iy0(audioDeviceInfo);
        hy0 hy0Var = this.f31845z;
        if (hy0Var != null) {
            hy0Var.m31279i(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f31843x;
        if (audioTrack != null) {
            C14764b.m35303a(audioTrack, this.d0);
        }
    }

    public final void i0(AudioTrack audioTrack) {
        if (this.f31832m == null) {
            this.f31832m = new C14776n();
        }
        this.f31832m.m35345a(audioTrack);
    }

    @Override // p001o.kz0
    /* renamed from: j */
    public boolean mo35287j() {
        return m35278Y() && !(sqi.f45790a >= 29 && this.f31843x.isOffloadedPlayback() && this.f31818Y) && this.f31828i.m41275h(m35275U());
    }

    @Override // p001o.kz0
    /* renamed from: k */
    public void mo35288k(int i) throws IllegalStateException {
        if (this.b0 != i) {
            this.b0 = i;
            this.a0 = i != 0;
            flush();
        }
    }

    public final void k0() {
        this.f31802I = 0L;
        this.f31803J = 0L;
        this.f31804K = 0L;
        this.f31805L = 0L;
        this.i0 = false;
        this.f31806M = 0;
        this.f31797D = new C14772j(this.f31798E, 0L, 0L);
        this.f31809P = 0L;
        this.f31796C = null;
        this.f31829j.clear();
        this.f31811R = null;
        this.f31812S = 0;
        this.f31813T = null;
        this.f31817X = false;
        this.f31816W = false;
        this.f31818Y = false;
        this.f31800G = null;
        this.f31801H = 0;
        this.f31824e.m52118n();
        q0();
    }

    @Override // p001o.kz0
    /* renamed from: l */
    public void mo35289l(wx0 wx0Var) throws IllegalStateException {
        if (this.f31795B.equals(wx0Var)) {
            return;
        }
        this.f31795B = wx0Var;
        if (this.e0) {
            return;
        }
        hy0 hy0Var = this.f31845z;
        if (hy0Var != null) {
            hy0Var.m31278h(wx0Var);
        }
        flush();
    }

    public final void l0(kad kadVar) {
        C14772j c14772j = new C14772j(kadVar, -9223372036854775807L, -9223372036854775807L);
        if (m35278Y()) {
            this.f31796C = c14772j;
        } else {
            this.f31797D = c14772j;
        }
    }

    @Override // p001o.kz0
    /* renamed from: m */
    public void mo35290m(int i) {
        op0.m42517g(sqi.f45790a >= 29);
        this.f31831l = i;
    }

    public final void m0() {
        if (m35278Y()) {
            try {
                this.f31843x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f31798E.f31768a).setPitch(this.f31798E.f31769b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                ria.m46825i("DefaultAudioSink", "Failed to set playback params", e);
            }
            kad kadVar = new kad(this.f31843x.getPlaybackParams().getSpeed(), this.f31843x.getPlaybackParams().getPitch());
            this.f31798E = kadVar;
            this.f31828i.m41286t(kadVar.f31768a);
        }
    }

    @Override // p001o.kz0
    /* renamed from: n */
    public void mo35291n() throws IllegalStateException {
        if (this.e0) {
            this.e0 = false;
            flush();
        }
    }

    public final void n0() {
        if (m35278Y()) {
            if (sqi.f45790a >= 21) {
                o0(this.f31843x, this.f31810Q);
            } else {
                p0(this.f31843x, this.f31810Q);
            }
        }
    }

    @Override // p001o.kz0
    /* renamed from: o */
    public void mo35292o(kz0.InterfaceC14940d interfaceC14940d) {
        this.f31839t = interfaceC14940d;
    }

    @Override // p001o.kz0
    /* renamed from: p */
    public boolean mo35293p(ByteBuffer byteBuffer, long j, int i) throws Exception {
        ByteBuffer byteBuffer2 = this.f31811R;
        op0.m42511a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f31840u != null) {
            if (!m35273Q()) {
                return false;
            }
            if (this.f31840u.m35321c(this.f31841v)) {
                this.f31841v = this.f31840u;
                this.f31840u = null;
                AudioTrack audioTrack = this.f31843x;
                if (audioTrack != null && m35264Z(audioTrack) && this.f31841v.f31866k) {
                    if (this.f31843x.getPlayState() == 3) {
                        this.f31843x.setOffloadEndOfStream();
                        this.f31828i.m41268a();
                    }
                    AudioTrack audioTrack2 = this.f31843x;
                    C2181a c2181a = this.f31841v.f31856a;
                    audioTrack2.setOffloadDelayPadding(c2181a.f7922E, c2181a.f7923F);
                    this.i0 = true;
                }
            } else {
                g0();
                if (mo35287j()) {
                    return false;
                }
                flush();
            }
            m35268L(j);
        }
        if (!m35278Y()) {
            try {
                if (!m35277W()) {
                    return false;
                }
            } catch (kz0.C14939c e) {
                if (e.f32860b) {
                    throw e;
                }
                this.f31833n.m35339b(e);
                return false;
            }
        }
        this.f31833n.m35338a();
        if (this.f31808O) {
            this.f31809P = Math.max(0L, j);
            this.f31807N = false;
            this.f31808O = false;
            if (t0()) {
                m0();
            }
            m35268L(j);
            if (this.f31819Z) {
                mo35284g();
            }
        }
        if (!this.f31828i.m41278k(m35275U())) {
            return false;
        }
        if (this.f31811R == null) {
            op0.m42511a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C14769g c14769g = this.f31841v;
            if (c14769g.f31858c != 0 && this.f31806M == 0) {
                int iM35262S = m35262S(c14769g.f31862g, byteBuffer);
                this.f31806M = iM35262S;
                if (iM35262S == 0) {
                    return true;
                }
            }
            if (this.f31796C != null) {
                if (!m35273Q()) {
                    return false;
                }
                m35268L(j);
                this.f31796C = null;
            }
            long jM35328l = this.f31809P + this.f31841v.m35328l(m35274T() - this.f31824e.m52117m());
            if (!this.f31807N && Math.abs(jM35328l - j) > 200000) {
                kz0.InterfaceC14940d interfaceC14940d = this.f31839t;
                if (interfaceC14940d != null) {
                    interfaceC14940d.mo36361e(new kz0.C14941e(j, jM35328l));
                }
                this.f31807N = true;
            }
            if (this.f31807N) {
                if (!m35273Q()) {
                    return false;
                }
                long j2 = j - jM35328l;
                this.f31809P += j2;
                this.f31807N = false;
                m35268L(j);
                kz0.InterfaceC14940d interfaceC14940d2 = this.f31839t;
                if (interfaceC14940d2 != null && j2 != 0) {
                    interfaceC14940d2.mo36366j();
                }
            }
            if (this.f31841v.f31858c == 0) {
                this.f31802I += byteBuffer.remaining();
            } else {
                this.f31803J += this.f31806M * i;
            }
            this.f31811R = byteBuffer;
            this.f31812S = i;
        }
        h0(j);
        if (!this.f31811R.hasRemaining()) {
            this.f31811R = null;
            this.f31812S = 0;
            return true;
        }
        if (!this.f31828i.m41277j(m35275U())) {
            return false;
        }
        ria.m46824h("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // p001o.kz0
    public void pause() throws IllegalStateException {
        this.f31819Z = false;
        if (m35278Y()) {
            if (this.f31828i.m41282p() || m35264Z(this.f31843x)) {
                this.f31843x.pause();
            }
        }
    }

    @Override // p001o.kz0
    /* renamed from: q */
    public void mo35294q(v61 v61Var) {
        if (this.c0.equals(v61Var)) {
            return;
        }
        int i = v61Var.f49910a;
        float f = v61Var.f49911b;
        AudioTrack audioTrack = this.f31843x;
        if (audioTrack != null) {
            if (this.c0.f49910a != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.f31843x.setAuxEffectSendLevel(f);
            }
        }
        this.c0 = v61Var;
    }

    public final void q0() {
        uy0 uy0Var = this.f31841v.f31864i;
        this.f31842w = uy0Var;
        uy0Var.m52124b();
    }

    @Override // p001o.kz0
    /* renamed from: r */
    public void mo35295r(C2181a c2181a, int i, int[] iArr) throws kz0.C14938b {
        uy0 uy0Var;
        int iI0;
        int iI02;
        boolean z;
        int i2;
        int iIntValue;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iMo35305a;
        int[] iArr2;
        e0();
        if ("audio/raw".equals(c2181a.f7943n)) {
            op0.m42511a(sqi.F0(c2181a.f7921D));
            iI0 = sqi.i0(c2181a.f7921D, c2181a.f7919B);
            nf8.C15566a c15566a = new nf8.C15566a();
            if (s0(c2181a.f7921D)) {
                c15566a.m40519j(this.f31826g);
            } else {
                c15566a.m40519j(this.f31825f);
                c15566a.m40518i(this.f31821b.mo35332c());
            }
            uy0 uy0Var2 = new uy0(c15566a.m40520k());
            if (uy0Var2.equals(this.f31842w)) {
                uy0Var2 = this.f31842w;
            }
            this.f31824e.m52119o(c2181a.f7922E, c2181a.f7923F);
            if (sqi.f45790a < 21 && c2181a.f7919B == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i9 = 0; i9 < 6; i9++) {
                    iArr2[i9] = i9;
                }
            } else {
                iArr2 = iArr;
            }
            this.f31823d.m51562m(iArr2);
            try {
                vy0.C17692a c17692aM52123a = uy0Var2.m52123a(new vy0.C17692a(c2181a));
                int i10 = c17692aM52123a.f51023c;
                int i11 = c17692aM52123a.f51021a;
                int iM48708M = sqi.m48708M(c17692aM52123a.f51022b);
                i4 = 0;
                z = false;
                iI02 = sqi.i0(i10, c17692aM52123a.f51022b);
                uy0Var = uy0Var2;
                i2 = i11;
                iIntValue = iM48708M;
                z2 = this.f31830k;
                i3 = i10;
            } catch (vy0.C17693b e) {
                throw new kz0.C14938b(e, c2181a);
            }
        } else {
            uy0 uy0Var3 = new uy0(nf8.m40499E());
            int i12 = c2181a.f7920C;
            ty0 ty0VarMo35285h = this.f31831l != 0 ? mo35285h(c2181a) : ty0.f48024d;
            if (this.f31831l == 0 || !ty0VarMo35285h.f48025a) {
                Pair pairM23942i = this.f31844y.m23942i(c2181a, this.f31795B);
                if (pairM23942i == null) {
                    throw new kz0.C14938b("Unable to configure passthrough for: " + c2181a, c2181a);
                }
                int iIntValue2 = ((Integer) pairM23942i.first).intValue();
                uy0Var = uy0Var3;
                iI0 = -1;
                iI02 = -1;
                z = false;
                i2 = i12;
                iIntValue = ((Integer) pairM23942i.second).intValue();
                i3 = iIntValue2;
                z2 = this.f31830k;
                i4 = 2;
            } else {
                int iM56176d = xeb.m56176d((String) op0.m42515e(c2181a.f7943n), c2181a.f7939j);
                int iM48708M2 = sqi.m48708M(c2181a.f7919B);
                uy0Var = uy0Var3;
                i4 = 1;
                z2 = true;
                iI0 = -1;
                iI02 = -1;
                i2 = i12;
                z = ty0VarMo35285h.f48026b;
                i3 = iM56176d;
                iIntValue = iM48708M2;
            }
        }
        if (i3 == 0) {
            throw new kz0.C14938b("Invalid output encoding (mode=" + i4 + ") for: " + c2181a, c2181a);
        }
        if (iIntValue == 0) {
            throw new kz0.C14938b("Invalid output channel config (mode=" + i4 + ") for: " + c2181a, c2181a);
        }
        int i13 = c2181a.f7938i;
        if ("audio/vnd.dts.hd;profile=lbr".equals(c2181a.f7943n) && i13 == -1) {
            i13 = 768000;
        }
        int i14 = i13;
        if (i != 0) {
            iMo35305a = i;
            i5 = i3;
            i6 = iIntValue;
            i7 = iI02;
            i8 = i2;
        } else {
            i5 = i3;
            i6 = iIntValue;
            i7 = iI02;
            i8 = i2;
            iMo35305a = this.f31835p.mo35305a(m35261R(i2, iIntValue, i3), i3, i4, iI02 != -1 ? iI02 : 1, i2, i14, z2 ? 8.0d : 1.0d);
        }
        this.h0 = false;
        C14769g c14769g = new C14769g(c2181a, iI0, i4, i7, i8, i6, i5, iMo35305a, uy0Var, z2, z, this.e0);
        if (m35278Y()) {
            this.f31840u = c14769g;
        } else {
            this.f31841v = c14769g;
        }
    }

    public final boolean r0() {
        if (!this.e0) {
            C14769g c14769g = this.f31841v;
            if (c14769g.f31858c == 0 && !s0(c14769g.f31856a.f7921D)) {
                return true;
            }
        }
        return false;
    }

    @Override // p001o.kz0
    public void release() {
        hy0 hy0Var = this.f31845z;
        if (hy0Var != null) {
            hy0Var.m31280j();
        }
    }

    @Override // p001o.kz0
    public void reset() throws IllegalStateException {
        flush();
        q4i it = this.f31825f.iterator();
        while (it.hasNext()) {
            ((vy0) it.next()).reset();
        }
        q4i it2 = this.f31826g.iterator();
        while (it2.hasNext()) {
            ((vy0) it2.next()).reset();
        }
        uy0 uy0Var = this.f31842w;
        if (uy0Var != null) {
            uy0Var.m52132j();
        }
        this.f31819Z = false;
        this.h0 = false;
    }

    @Override // p001o.kz0
    /* renamed from: s */
    public void mo35296s() throws IllegalStateException {
        if (!this.f31816W && m35278Y() && m35273Q()) {
            g0();
            this.f31816W = true;
        }
    }

    public final boolean s0(int i) {
        return this.f31822c && sqi.E0(i);
    }

    @Override // p001o.kz0
    /* renamed from: t */
    public void mo35297t(int i, int i2) {
        C14769g c14769g;
        AudioTrack audioTrack = this.f31843x;
        if (audioTrack == null || !m35264Z(audioTrack) || (c14769g = this.f31841v) == null || !c14769g.f31866k) {
            return;
        }
        this.f31843x.setOffloadDelayPadding(i, i2);
    }

    public final boolean t0() {
        C14769g c14769g = this.f31841v;
        return c14769g != null && c14769g.f31865j && sqi.f45790a >= 23;
    }

    @Override // p001o.kz0
    /* renamed from: u */
    public long mo35298u(boolean z) {
        if (!m35278Y() || this.f31808O) {
            return Long.MIN_VALUE;
        }
        return m35270N(m35269M(Math.min(this.f31828i.m41271d(z), this.f31841v.m35327i(m35275U()))));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0(ByteBuffer byteBuffer, long j) throws Exception {
        int iV0;
        kz0.InterfaceC14940d interfaceC14940d;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f31813T;
            if (byteBuffer2 != null) {
                op0.m42511a(byteBuffer2 == byteBuffer);
            } else {
                this.f31813T = byteBuffer;
                if (sqi.f45790a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f31814U;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f31814U = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f31814U, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f31815V = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (sqi.f45790a < 21) {
                int iM41270c = this.f31828i.m41270c(this.f31804K);
                if (iM41270c > 0) {
                    iV0 = this.f31843x.write(this.f31814U, this.f31815V, Math.min(iRemaining2, iM41270c));
                    if (iV0 > 0) {
                        this.f31815V += iV0;
                        byteBuffer.position(byteBuffer.position() + iV0);
                    }
                } else {
                    iV0 = 0;
                }
            } else if (this.e0) {
                op0.m42517g(j != -9223372036854775807L);
                if (j == Long.MIN_VALUE) {
                    j = this.f0;
                } else {
                    this.f0 = j;
                }
                iV0 = w0(this.f31843x, byteBuffer, iRemaining2, j);
            } else {
                iV0 = v0(this.f31843x, byteBuffer, iRemaining2);
            }
            this.g0 = SystemClock.elapsedRealtime();
            if (iV0 < 0) {
                if (!m35263X(iV0)) {
                    z = false;
                } else if (m35275U() <= 0) {
                    if (m35264Z(this.f31843x)) {
                        c0();
                    }
                }
                kz0.C14942f c14942f = new kz0.C14942f(iV0, this.f31841v.f31856a, z);
                kz0.InterfaceC14940d interfaceC14940d2 = this.f31839t;
                if (interfaceC14940d2 != null) {
                    interfaceC14940d2.mo36361e(c14942f);
                }
                if (c14942f.f32865b) {
                    this.f31844y = dy0.f20633c;
                    throw c14942f;
                }
                this.f31834o.m35339b(c14942f);
                return;
            }
            this.f31834o.m35338a();
            if (m35264Z(this.f31843x)) {
                if (this.f31805L > 0) {
                    this.i0 = false;
                }
                if (this.f31819Z && (interfaceC14940d = this.f31839t) != null && iV0 < iRemaining2 && !this.i0) {
                    interfaceC14940d.mo36363g();
                }
            }
            int i = this.f31841v.f31858c;
            if (i == 0) {
                this.f31804K += iV0;
            }
            if (iV0 == iRemaining2) {
                if (i != 0) {
                    op0.m42517g(byteBuffer == this.f31811R);
                    this.f31805L += this.f31806M * this.f31812S;
                }
                this.f31813T = null;
            }
        }
    }

    @Override // p001o.kz0
    /* renamed from: w */
    public void mo35299w() {
        this.f31807N = true;
    }

    public final int w0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (sqi.f45790a >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.f31800G == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f31800G = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f31800G.putInt(1431633921);
        }
        if (this.f31801H == 0) {
            this.f31800G.putInt(4, i);
            this.f31800G.putLong(8, j * 1000);
            this.f31800G.position(0);
            this.f31801H = i;
        }
        int iRemaining = this.f31800G.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f31800G, iRemaining, 1);
            if (iWrite < 0) {
                this.f31801H = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iV0 = v0(audioTrack, byteBuffer, i);
        if (iV0 < 0) {
            this.f31801H = 0;
            return iV0;
        }
        this.f31801H -= iV0;
        return iV0;
    }

    @Override // p001o.kz0
    /* renamed from: x */
    public void mo35300x(float f) {
        if (this.f31810Q != f) {
            this.f31810Q = f;
            n0();
        }
    }

    @Override // p001o.kz0
    /* renamed from: y */
    public void mo35301y(jb3 jb3Var) {
        this.f31828i.m41287u(jb3Var);
    }

    @Override // p001o.kz0
    /* renamed from: z */
    public void mo35302z() throws IllegalStateException {
        op0.m42517g(sqi.f45790a >= 21);
        op0.m42517g(this.a0);
        if (this.e0) {
            return;
        }
        this.e0 = true;
        flush();
    }

    public kb5(C14768f c14768f) {
        Context context = c14768f.f31847a;
        this.f31820a = context;
        wx0 wx0Var = wx0.f52810g;
        this.f31795B = wx0Var;
        this.f31844y = context != null ? dy0.m23937e(context, wx0Var, null) : c14768f.f31848b;
        this.f31821b = c14768f.f31849c;
        int i = sqi.f45790a;
        this.f31822c = i >= 21 && c14768f.f31850d;
        this.f31830k = i >= 23 && c14768f.f31851e;
        this.f31831l = 0;
        this.f31835p = c14768f.f31853g;
        this.f31836q = (InterfaceC14766d) op0.m42515e(c14768f.f31854h);
        jq3 jq3Var = new jq3(jb3.f30077a);
        this.f31827h = jq3Var;
        jq3Var.m34270e();
        this.f31828i = new nz0(new C14775m());
        ug2 ug2Var = new ug2();
        this.f31823d = ug2Var;
        uxh uxhVar = new uxh();
        this.f31824e = uxhVar;
        this.f31825f = nf8.m40502I(new gnh(), ug2Var, uxhVar);
        this.f31826g = nf8.m40500F(new fnh());
        this.f31810Q = 1.0f;
        this.b0 = 0;
        this.c0 = new v61(0, 0.0f);
        kad kadVar = kad.f31765d;
        this.f31797D = new C14772j(kadVar, 0L, 0L);
        this.f31798E = kadVar;
        this.f31799F = false;
        this.f31829j = new ArrayDeque();
        this.f31833n = new C14774l(100L);
        this.f31834o = new C14774l(100L);
        this.f31837r = c14768f.f31855i;
    }
}
