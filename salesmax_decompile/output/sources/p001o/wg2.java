package p001o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class wg2 {
    /* renamed from: a */
    public static /* synthetic */ boolean m54356a(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
