package p001o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class mkh {

    /* renamed from: a */
    public final Object f35632a = new Object();

    /* renamed from: b */
    public final Map f35633b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ReferenceQueue f35634c = new ReferenceQueue();

    /* renamed from: o.mkh$a */
    public static final class C15353a {

        /* renamed from: a */
        public static final mkh f35635a = new mkh();
    }

    /* renamed from: a */
    public static mkh m39298a() {
        return C15353a.f35635a;
    }

    /* renamed from: b */
    public final void m39299b() {
        while (true) {
            SoftReference softReference = (SoftReference) this.f35634c.poll();
            if (softReference == null) {
                return;
            } else {
                this.f35633b.remove(softReference);
            }
        }
    }

    /* renamed from: c */
    public SoftReference m39300c(xl1 xl1Var) {
        SoftReference softReference = new SoftReference(xl1Var, this.f35634c);
        this.f35633b.put(softReference, Boolean.TRUE);
        m39299b();
        return softReference;
    }
}
