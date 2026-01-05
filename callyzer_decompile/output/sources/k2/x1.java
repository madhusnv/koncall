package k2;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class x1 {
    /* renamed from: a */
    public static final int m8705a(int i10, int[] iArr) {
        return iArr[(i10 * 5) + 3];
    }

    /* renamed from: b */
    public static final int m8706b(ArrayList arrayList, int i10, int i11) {
        int iM8709e = m8709e(arrayList, i10, i11);
        return iM8709e >= 0 ? iM8709e : -(iM8709e + 1);
    }

    /* renamed from: c */
    public static final int m8707c(int i10, int[] iArr) {
        int i11 = i10 * 5;
        return Integer.bitCount(iArr[i11 + 1] >> 28) + iArr[i11 + 4];
    }

    /* renamed from: d */
    public static final void m8708d(int i10, int i11, int[] iArr) {
        if (i11 >= 0) {
        }
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    /* renamed from: e */
    public static final int m8709e(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int i14 = ((C3952a) arrayList.get(i13)).f20343a;
            if (i14 < 0) {
                i14 += i11;
            }
            int iM8924g = AbstractC4154l.m8924g(i14, i10);
            if (iM8924g < 0) {
                i12 = i13 + 1;
            } else {
                if (iM8924g <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* renamed from: f */
    public static final void m8710f() {
        throw new ConcurrentModificationException();
    }
}
