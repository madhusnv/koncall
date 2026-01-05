package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ec3 {
    /* renamed from: a */
    public static /* synthetic */ boolean m24748a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
