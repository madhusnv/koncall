package pg;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.t */
/* loaded from: classes.dex */
public abstract class AbstractC5939t {

    /* renamed from: a */
    public static final /* synthetic */ int f29062a = 0;

    /* renamed from: a */
    public static int m11866a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* renamed from: b */
    public static Comparable m11867b(Comparable a10, Comparable b10) {
        AbstractC4154l.m8923f(a10, "a");
        AbstractC4154l.m8923f(b10, "b");
        return a10.compareTo(b10) >= 0 ? a10 : b10;
    }
}
