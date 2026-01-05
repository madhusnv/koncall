package p001o;

import android.media.AudioTrack;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class nz0 {

    /* renamed from: A */
    public long f37430A;

    /* renamed from: B */
    public long f37431B;

    /* renamed from: C */
    public long f37432C;

    /* renamed from: D */
    public long f37433D;

    /* renamed from: E */
    public boolean f37434E;

    /* renamed from: F */
    public long f37435F;

    /* renamed from: G */
    public long f37436G;

    /* renamed from: H */
    public boolean f37437H;

    /* renamed from: I */
    public long f37438I;

    /* renamed from: J */
    public jb3 f37439J;

    /* renamed from: a */
    public final InterfaceC15680a f37440a;

    /* renamed from: b */
    public final long[] f37441b;

    /* renamed from: c */
    public AudioTrack f37442c;

    /* renamed from: d */
    public int f37443d;

    /* renamed from: e */
    public int f37444e;

    /* renamed from: f */
    public mz0 f37445f;

    /* renamed from: g */
    public int f37446g;

    /* renamed from: h */
    public boolean f37447h;

    /* renamed from: i */
    public long f37448i;

    /* renamed from: j */
    public float f37449j;

    /* renamed from: k */
    public boolean f37450k;

    /* renamed from: l */
    public long f37451l;

    /* renamed from: m */
    public long f37452m;

    /* renamed from: n */
    public Method f37453n;

    /* renamed from: o */
    public long f37454o;

    /* renamed from: p */
    public boolean f37455p;

    /* renamed from: q */
    public boolean f37456q;

    /* renamed from: r */
    public long f37457r;

    /* renamed from: s */
    public long f37458s;

    /* renamed from: t */
    public long f37459t;

    /* renamed from: u */
    public long f37460u;

    /* renamed from: v */
    public long f37461v;

    /* renamed from: w */
    public int f37462w;

    /* renamed from: x */
    public int f37463x;

    /* renamed from: y */
    public long f37464y;

    /* renamed from: z */
    public long f37465z;

    /* renamed from: o.nz0$a */
    public interface InterfaceC15680a {
        /* renamed from: a */
        void mo35340a(int i, long j);

        /* renamed from: b */
        void mo35341b(long j);

        /* renamed from: c */
        void mo35342c(long j);

        /* renamed from: d */
        void mo35343d(long j, long j2, long j3, long j4);

        /* renamed from: e */
        void mo35344e(long j, long j2, long j3, long j4);
    }

    public nz0(InterfaceC15680a interfaceC15680a) {
        this.f37440a = (InterfaceC15680a) op0.m42515e(interfaceC15680a);
        try {
            this.f37453n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f37441b = new long[10];
        this.f37439J = jb3.f30077a;
    }

    /* renamed from: o */
    public static boolean m41267o(int i) {
        return sqi.f45790a < 23 && (i == 5 || i == 6);
    }

    /* renamed from: a */
    public void m41268a() {
        this.f37437H = true;
        mz0 mz0Var = this.f37445f;
        if (mz0Var != null) {
            mz0Var.m39877b();
        }
    }

    /* renamed from: b */
    public final boolean m41269b() {
        return this.f37447h && ((AudioTrack) op0.m42515e(this.f37442c)).getPlayState() == 2 && m41272e() == 0;
    }

    /* renamed from: c */
    public int m41270c(long j) {
        return this.f37444e - ((int) (j - (m41272e() * this.f37443d)));
    }

    /* renamed from: d */
    public long m41271d(boolean z) {
        long jM41273f;
        if (((AudioTrack) op0.m42515e(this.f37442c)).getPlayState() == 3) {
            m41280m();
        }
        long jNanoTime = this.f37439J.nanoTime() / 1000;
        mz0 mz0Var = (mz0) op0.m42515e(this.f37445f);
        boolean zM39880e = mz0Var.m39880e();
        if (zM39880e) {
            jM41273f = sqi.Z0(mz0Var.m39878c(), this.f37446g) + sqi.e0(jNanoTime - mz0Var.m39879d(), this.f37449j);
        } else {
            jM41273f = this.f37463x == 0 ? m41273f() : sqi.e0(this.f37451l + jNanoTime, this.f37449j);
            if (!z) {
                jM41273f = Math.max(0L, jM41273f - this.f37454o);
            }
        }
        if (this.f37434E != zM39880e) {
            this.f37436G = this.f37433D;
            this.f37435F = this.f37432C;
        }
        long j = jNanoTime - this.f37436G;
        if (j < 1000000) {
            long jE0 = this.f37435F + sqi.e0(j, this.f37449j);
            long j2 = (j * 1000) / 1000000;
            jM41273f = ((jM41273f * j2) + ((1000 - j2) * jE0)) / 1000;
        }
        if (!this.f37450k) {
            long j3 = this.f37432C;
            if (jM41273f > j3) {
                this.f37450k = true;
                this.f37440a.mo35342c(this.f37439J.currentTimeMillis() - sqi.q1(sqi.j0(sqi.q1(jM41273f - j3), this.f37449j)));
            }
        }
        this.f37433D = jNanoTime;
        this.f37432C = jM41273f;
        this.f37434E = zM39880e;
        return jM41273f;
    }

    /* renamed from: e */
    public final long m41272e() {
        long jElapsedRealtime = this.f37439J.elapsedRealtime();
        if (this.f37464y != -9223372036854775807L) {
            if (((AudioTrack) op0.m42515e(this.f37442c)).getPlayState() == 2) {
                return this.f37430A;
            }
            return Math.min(this.f37431B, this.f37430A + sqi.m48700E(sqi.e0(sqi.O0(jElapsedRealtime) - this.f37464y, this.f37449j), this.f37446g));
        }
        if (jElapsedRealtime - this.f37458s >= 5) {
            m41289w(jElapsedRealtime);
            this.f37458s = jElapsedRealtime;
        }
        return this.f37459t + this.f37438I + (this.f37460u << 32);
    }

    /* renamed from: f */
    public final long m41273f() {
        return sqi.Z0(m41272e(), this.f37446g);
    }

    /* renamed from: g */
    public void m41274g(long j) {
        this.f37430A = m41272e();
        this.f37464y = sqi.O0(this.f37439J.elapsedRealtime());
        this.f37431B = j;
    }

    /* renamed from: h */
    public boolean m41275h(long j) {
        return j > sqi.m48700E(m41271d(false), this.f37446g) || m41269b();
    }

    /* renamed from: i */
    public boolean m41276i() {
        return ((AudioTrack) op0.m42515e(this.f37442c)).getPlayState() == 3;
    }

    /* renamed from: j */
    public boolean m41277j(long j) {
        return this.f37465z != -9223372036854775807L && j > 0 && this.f37439J.elapsedRealtime() - this.f37465z >= 200;
    }

    /* renamed from: k */
    public boolean m41278k(long j) {
        int playState = ((AudioTrack) op0.m42515e(this.f37442c)).getPlayState();
        if (this.f37447h) {
            if (playState == 2) {
                this.f37455p = false;
                return false;
            }
            if (playState == 1 && m41272e() == 0) {
                return false;
            }
        }
        boolean z = this.f37455p;
        boolean zM41275h = m41275h(j);
        this.f37455p = zM41275h;
        if (z && !zM41275h && playState != 1) {
            this.f37440a.mo35340a(this.f37444e, sqi.q1(this.f37448i));
        }
        return true;
    }

    /* renamed from: l */
    public final void m41279l(long j) {
        mz0 mz0Var = (mz0) op0.m42515e(this.f37445f);
        if (mz0Var.m39881f(j)) {
            long jM39879d = mz0Var.m39879d();
            long jM39878c = mz0Var.m39878c();
            long jM41273f = m41273f();
            if (Math.abs(jM39879d - j) > 5000000) {
                this.f37440a.mo35344e(jM39878c, jM39879d, j, jM41273f);
                mz0Var.m39882g();
            } else if (Math.abs(sqi.Z0(jM39878c, this.f37446g) - jM41273f) <= 5000000) {
                mz0Var.m39876a();
            } else {
                this.f37440a.mo35343d(jM39878c, jM39879d, j, jM41273f);
                mz0Var.m39882g();
            }
        }
    }

    /* renamed from: m */
    public final void m41280m() {
        long jNanoTime = this.f37439J.nanoTime() / 1000;
        if (jNanoTime - this.f37452m >= 30000) {
            long jM41273f = m41273f();
            if (jM41273f != 0) {
                this.f37441b[this.f37462w] = sqi.j0(jM41273f, this.f37449j) - jNanoTime;
                this.f37462w = (this.f37462w + 1) % 10;
                int i = this.f37463x;
                if (i < 10) {
                    this.f37463x = i + 1;
                }
                this.f37452m = jNanoTime;
                this.f37451l = 0L;
                int i2 = 0;
                while (true) {
                    int i3 = this.f37463x;
                    if (i2 >= i3) {
                        break;
                    }
                    this.f37451l += this.f37441b[i2] / i3;
                    i2++;
                }
            } else {
                return;
            }
        }
        if (this.f37447h) {
            return;
        }
        m41279l(jNanoTime);
        m41281n(jNanoTime);
    }

    /* renamed from: n */
    public final void m41281n(long j) {
        Method method;
        if (!this.f37456q || (method = this.f37453n) == null || j - this.f37457r < 500000) {
            return;
        }
        try {
            long jIntValue = (((Integer) sqi.m48729h((Integer) method.invoke(op0.m42515e(this.f37442c), new Object[0]))).intValue() * 1000) - this.f37448i;
            this.f37454o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f37454o = jMax;
            if (jMax > 5000000) {
                this.f37440a.mo35341b(jMax);
                this.f37454o = 0L;
            }
        } catch (Exception unused) {
            this.f37453n = null;
        }
        this.f37457r = j;
    }

    /* renamed from: p */
    public boolean m41282p() {
        m41284r();
        if (this.f37464y == -9223372036854775807L) {
            ((mz0) op0.m42515e(this.f37445f)).m39883h();
            return true;
        }
        this.f37430A = m41272e();
        return false;
    }

    /* renamed from: q */
    public void m41283q() {
        m41284r();
        this.f37442c = null;
        this.f37445f = null;
    }

    /* renamed from: r */
    public final void m41284r() {
        this.f37451l = 0L;
        this.f37463x = 0;
        this.f37462w = 0;
        this.f37452m = 0L;
        this.f37433D = 0L;
        this.f37436G = 0L;
        this.f37450k = false;
    }

    /* renamed from: s */
    public void m41285s(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f37442c = audioTrack;
        this.f37443d = i2;
        this.f37444e = i3;
        this.f37445f = new mz0(audioTrack);
        this.f37446g = audioTrack.getSampleRate();
        this.f37447h = z && m41267o(i);
        boolean zF0 = sqi.F0(i);
        this.f37456q = zF0;
        this.f37448i = zF0 ? sqi.Z0(i3 / i2, this.f37446g) : -9223372036854775807L;
        this.f37459t = 0L;
        this.f37460u = 0L;
        this.f37437H = false;
        this.f37438I = 0L;
        this.f37461v = 0L;
        this.f37455p = false;
        this.f37464y = -9223372036854775807L;
        this.f37465z = -9223372036854775807L;
        this.f37457r = 0L;
        this.f37454o = 0L;
        this.f37449j = 1.0f;
    }

    /* renamed from: t */
    public void m41286t(float f) {
        this.f37449j = f;
        mz0 mz0Var = this.f37445f;
        if (mz0Var != null) {
            mz0Var.m39883h();
        }
        m41284r();
    }

    /* renamed from: u */
    public void m41287u(jb3 jb3Var) {
        this.f37439J = jb3Var;
    }

    /* renamed from: v */
    public void m41288v() {
        if (this.f37464y != -9223372036854775807L) {
            this.f37464y = sqi.O0(this.f37439J.elapsedRealtime());
        }
        ((mz0) op0.m42515e(this.f37445f)).m39883h();
    }

    /* renamed from: w */
    public final void m41289w(long j) {
        int playState = ((AudioTrack) op0.m42515e(this.f37442c)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = r0.getPlaybackHeadPosition() & 4294967295L;
        if (this.f37447h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f37461v = this.f37459t;
            }
            playbackHeadPosition += this.f37461v;
        }
        if (sqi.f45790a <= 29) {
            if (playbackHeadPosition == 0 && this.f37459t > 0 && playState == 3) {
                if (this.f37465z == -9223372036854775807L) {
                    this.f37465z = j;
                    return;
                }
                return;
            }
            this.f37465z = -9223372036854775807L;
        }
        long j2 = this.f37459t;
        if (j2 > playbackHeadPosition) {
            if (this.f37437H) {
                this.f37438I += j2;
                this.f37437H = false;
            } else {
                this.f37460u++;
            }
        }
        this.f37459t = playbackHeadPosition;
    }
}
