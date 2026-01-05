package p001o;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public abstract class pgc {
    /* renamed from: a */
    public static void m43606a(Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}
