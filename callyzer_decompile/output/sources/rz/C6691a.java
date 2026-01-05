package rz;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rz.a */
/* loaded from: classes3.dex */
public final class C6691a {

    /* renamed from: a */
    public final int f31998a;

    /* renamed from: b */
    public long f31999b;

    /* renamed from: c */
    public long f32000c;

    public C6691a(int i10) {
        this.f31998a = i10;
    }

    /* renamed from: b */
    public static void m12828b(C6691a c6691a, long j6, long j10, int i10) {
        if ((i10 & 1) != 0) {
            j6 = 0;
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        synchronized (c6691a) {
            try {
                if (j6 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j10 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j11 = c6691a.f31999b + j6;
                c6691a.f31999b = j11;
                long j12 = c6691a.f32000c + j10;
                c6691a.f32000c = j12;
                if (j12 > j11) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public final synchronized long m12829a() {
        return this.f31999b - this.f32000c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.f31998a + ", total=" + this.f31999b + ", acknowledged=" + this.f32000c + ", unacknowledged=" + m12829a() + ')';
    }
}
