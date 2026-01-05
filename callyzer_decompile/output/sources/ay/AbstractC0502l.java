package ay;

import java.util.concurrent.TimeUnit;
import yx.AbstractC8808b;
import yx.AbstractC8825s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ay.l */
/* loaded from: classes3.dex */
public abstract class AbstractC0502l {

    /* renamed from: a */
    public static final String f3546a;

    /* renamed from: b */
    public static final long f3547b;

    /* renamed from: c */
    public static final int f3548c;

    /* renamed from: d */
    public static final int f3549d;

    /* renamed from: e */
    public static final long f3550e;

    /* renamed from: f */
    public static final C0498h f3551f;

    static {
        String property;
        int i10 = AbstractC8825s.f42520a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f3546a = property;
        f3547b = AbstractC8808b.m16253m(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i11 = AbstractC8825s.f42520a;
        if (i11 < 2) {
            i11 = 2;
        }
        f3548c = AbstractC8808b.m16254n(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f3549d = AbstractC8808b.m16254n(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f3550e = TimeUnit.SECONDS.toNanos(AbstractC8808b.m16253m(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f3551f = C0498h.f3541a;
    }
}
