package og;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import t1.C6993r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class dg {
    /* renamed from: a */
    public static final int m10614a(C6993r c6993r) {
        return (int) (c6993r.f33855e == k1.x0.Vertical ? c6993r.m13256f() & 4294967295L : c6993r.m13256f() >> 32);
    }

    /* renamed from: b */
    public static final void m10615b(String key) {
        AbstractC4154l.m8923f(key, "key");
        throw new IllegalArgumentException(AbstractC5601a.m11238i("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }
}
