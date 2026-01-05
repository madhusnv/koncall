package iz;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.h */
/* loaded from: classes3.dex */
public final class C3375h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a10 = (String) obj;
        String b10 = (String) obj2;
        AbstractC4154l.m8923f(a10, "a");
        AbstractC4154l.m8923f(b10, "b");
        int iMin = Math.min(a10.length(), b10.length());
        for (int i10 = 4; i10 < iMin; i10++) {
            char cCharAt = a10.charAt(i10);
            char cCharAt2 = b10.charAt(i10);
            if (cCharAt != cCharAt2) {
                return AbstractC4154l.m8924g(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = a10.length();
        int length2 = b10.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
