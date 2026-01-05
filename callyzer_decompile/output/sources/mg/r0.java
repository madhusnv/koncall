package mg;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a */
    public static final Comparator f23690a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(r0.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = q0.INSTANCE;
        }
        f23690a = comparator;
    }
}
