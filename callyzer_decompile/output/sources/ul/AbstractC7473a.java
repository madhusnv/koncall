package ul;

import g4.C2492h;
import g4.n0;
import l4.C4381z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ul.a */
/* loaded from: classes.dex */
public abstract class AbstractC7473a {
    /* renamed from: a */
    public static final C2492h m14276a(C4381z c4381z) {
        C2492h c2492h = c4381z.f21945a;
        long j6 = c4381z.f21946b;
        c2492h.getClass();
        return c2492h.subSequence(n0.m6458e(j6), n0.m6457d(j6));
    }

    /* renamed from: b */
    public static final C2492h m14277b(C4381z c4381z, int i10) {
        C2492h c2492h = c4381z.f21945a;
        long j6 = c4381z.f21946b;
        return c2492h.subSequence(n0.m6457d(j6), Math.min(n0.m6457d(j6) + i10, c4381z.f21945a.f13620b.length()));
    }

    /* renamed from: c */
    public static final C2492h m14278c(C4381z c4381z, int i10) {
        C2492h c2492h = c4381z.f21945a;
        long j6 = c4381z.f21946b;
        return c2492h.subSequence(Math.max(0, n0.m6458e(j6) - i10), n0.m6458e(j6));
    }
}
