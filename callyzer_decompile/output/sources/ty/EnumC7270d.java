package ty;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ty.d */
/* loaded from: classes3.dex */
public enum EnumC7270d {
    READ(1),
    WRITE(2),
    APPEND(4),
    CREAT(8),
    TRUNC(16),
    EXCL(32);

    private final int pflag;

    EnumC7270d(int i10) {
        this.pflag = i10;
    }

    public static int toMask(Set<EnumC7270d> set) {
        Iterator<EnumC7270d> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= it.next().pflag;
        }
        return i10;
    }
}
