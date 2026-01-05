package androidx.media3.exoplayer;

import android.os.SystemClock;
import p001o.qga;
import p001o.s2b;
import p001o.sqi;
import p001o.tla;

/* renamed from: androidx.media3.exoplayer.d */
/* loaded from: classes2.dex */
public final class C2194d implements qga {

    /* renamed from: a */
    public final float f8157a;

    /* renamed from: b */
    public final float f8158b;

    /* renamed from: c */
    public final long f8159c;

    /* renamed from: d */
    public final float f8160d;

    /* renamed from: e */
    public final long f8161e;

    /* renamed from: f */
    public final long f8162f;

    /* renamed from: g */
    public final float f8163g;

    /* renamed from: h */
    public long f8164h;

    /* renamed from: i */
    public long f8165i;

    /* renamed from: j */
    public long f8166j;

    /* renamed from: k */
    public long f8167k;

    /* renamed from: l */
    public long f8168l;

    /* renamed from: m */
    public long f8169m;

    /* renamed from: n */
    public float f8170n;

    /* renamed from: o */
    public float f8171o;

    /* renamed from: p */
    public float f8172p;

    /* renamed from: q */
    public long f8173q;

    /* renamed from: r */
    public long f8174r;

    /* renamed from: s */
    public long f8175s;

    /* renamed from: androidx.media3.exoplayer.d$b */
    public static final class b {

        /* renamed from: a */
        public float f8176a = 0.97f;

        /* renamed from: b */
        public float f8177b = 1.03f;

        /* renamed from: c */
        public long f8178c = 1000;

        /* renamed from: d */
        public float f8179d = 1.0E-7f;

        /* renamed from: e */
        public long f8180e = sqi.O0(20);

        /* renamed from: f */
        public long f8181f = sqi.O0(500);

        /* renamed from: g */
        public float f8182g = 0.999f;

        /* renamed from: a */
        public C2194d m6906a() {
            return new C2194d(this.f8176a, this.f8177b, this.f8178c, this.f8179d, this.f8180e, this.f8181f, this.f8182g);
        }
    }

    /* renamed from: h */
    public static long m6897h(long j, long j2, float f) {
        return (long) ((j * f) + ((1.0f - f) * j2));
    }

    @Override // p001o.qga
    /* renamed from: a */
    public void mo6898a(s2b.C16722g c16722g) {
        this.f8164h = sqi.O0(c16722g.f44554a);
        this.f8167k = sqi.O0(c16722g.f44555b);
        this.f8168l = sqi.O0(c16722g.f44556c);
        float f = c16722g.f44557d;
        if (f == -3.4028235E38f) {
            f = this.f8157a;
        }
        this.f8171o = f;
        float f2 = c16722g.f44558e;
        if (f2 == -3.4028235E38f) {
            f2 = this.f8158b;
        }
        this.f8170n = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.f8164h = -9223372036854775807L;
        }
        m6904g();
    }

    @Override // p001o.qga
    /* renamed from: b */
    public float mo6899b(long j, long j2) {
        if (this.f8164h == -9223372036854775807L) {
            return 1.0f;
        }
        m6905i(j, j2);
        if (this.f8173q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f8173q < this.f8159c) {
            return this.f8172p;
        }
        this.f8173q = SystemClock.elapsedRealtime();
        m6903f(j);
        long j3 = j - this.f8169m;
        if (Math.abs(j3) < this.f8161e) {
            this.f8172p = 1.0f;
        } else {
            this.f8172p = sqi.m48735n((this.f8160d * j3) + 1.0f, this.f8171o, this.f8170n);
        }
        return this.f8172p;
    }

    @Override // p001o.qga
    /* renamed from: c */
    public long mo6900c() {
        return this.f8169m;
    }

    @Override // p001o.qga
    /* renamed from: d */
    public void mo6901d() {
        long j = this.f8169m;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f8162f;
        this.f8169m = j2;
        long j3 = this.f8168l;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f8169m = j3;
        }
        this.f8173q = -9223372036854775807L;
    }

    @Override // p001o.qga
    /* renamed from: e */
    public void mo6902e(long j) {
        this.f8165i = j;
        m6904g();
    }

    /* renamed from: f */
    public final void m6903f(long j) {
        long j2 = this.f8174r + (this.f8175s * 3);
        if (this.f8169m > j2) {
            float fO0 = sqi.O0(this.f8159c);
            this.f8169m = tla.m50161c(j2, this.f8166j, this.f8169m - (((long) ((this.f8172p - 1.0f) * fO0)) + ((long) ((this.f8170n - 1.0f) * fO0))));
            return;
        }
        long jM48737p = sqi.m48737p(j - ((long) (Math.max(0.0f, this.f8172p - 1.0f) / this.f8160d)), this.f8169m, j2);
        this.f8169m = jM48737p;
        long j3 = this.f8168l;
        if (j3 == -9223372036854775807L || jM48737p <= j3) {
            return;
        }
        this.f8169m = j3;
    }

    /* renamed from: g */
    public final void m6904g() {
        long j;
        long j2 = this.f8164h;
        if (j2 != -9223372036854775807L) {
            j = this.f8165i;
            if (j == -9223372036854775807L) {
                long j3 = this.f8167k;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.f8168l;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f8166j == j) {
            return;
        }
        this.f8166j = j;
        this.f8169m = j;
        this.f8174r = -9223372036854775807L;
        this.f8175s = -9223372036854775807L;
        this.f8173q = -9223372036854775807L;
    }

    /* renamed from: i */
    public final void m6905i(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f8174r;
        if (j4 == -9223372036854775807L) {
            this.f8174r = j3;
            this.f8175s = 0L;
        } else {
            long jMax = Math.max(j3, m6897h(j4, j3, this.f8163g));
            this.f8174r = jMax;
            this.f8175s = m6897h(this.f8175s, Math.abs(j3 - jMax), this.f8163g);
        }
    }

    public C2194d(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f8157a = f;
        this.f8158b = f2;
        this.f8159c = j;
        this.f8160d = f3;
        this.f8161e = j2;
        this.f8162f = j3;
        this.f8163g = f4;
        this.f8164h = -9223372036854775807L;
        this.f8165i = -9223372036854775807L;
        this.f8167k = -9223372036854775807L;
        this.f8168l = -9223372036854775807L;
        this.f8171o = f;
        this.f8170n = f2;
        this.f8172p = 1.0f;
        this.f8173q = -9223372036854775807L;
        this.f8166j = -9223372036854775807L;
        this.f8169m = -9223372036854775807L;
        this.f8174r = -9223372036854775807L;
        this.f8175s = -9223372036854775807L;
    }
}
