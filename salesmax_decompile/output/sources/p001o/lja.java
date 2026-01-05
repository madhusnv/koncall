package p001o;

import android.os.SystemClock;

/* loaded from: classes5.dex */
public abstract class lja {

    /* renamed from: a */
    public static final double f33922a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: a */
    public static double m37349a(long j) {
        return (m37350b() - j) * f33922a;
    }

    /* renamed from: b */
    public static long m37350b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
