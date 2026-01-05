package p001o;

import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public abstract class d2h {

    /* renamed from: a */
    public static final String f19046a = pig.m43755e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b */
    public static final long f19047b = rig.m46849f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: c */
    public static final int f19048c = rig.m46848e("kotlinx.coroutines.scheduler.core.pool.size", bce.m18601d(pig.m43751a(), 2), 1, 0, 8, null);

    /* renamed from: d */
    public static final int f19049d = rig.m46848e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* renamed from: e */
    public static final long f19050e = TimeUnit.SECONDS.toNanos(rig.m46849f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* renamed from: f */
    public static h5f f19051f = orb.f38794a;

    /* renamed from: b */
    public static final xjg m22291b(Runnable runnable, long j, boolean z) {
        return new qog(runnable, j, z);
    }

    /* renamed from: c */
    public static final String m22292c(boolean z) {
        return z ? "Blocking" : "Non-blocking";
    }
}
