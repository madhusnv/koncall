package p001o;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class fwf {
    /* renamed from: A */
    public static final int m27608A(int[] iArr, int i) {
        int i2 = i * 5;
        if (i2 >= iArr.length) {
            return iArr.length;
        }
        return m27611D(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
    }

    /* renamed from: B */
    public static final boolean m27609B(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 201326592) != 0;
    }

    /* renamed from: C */
    public static final boolean m27610C(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 67108864) != 0;
    }

    /* renamed from: D */
    public static final int m27611D(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: E */
    public static final int m27612E(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* renamed from: F */
    public static final int m27613F(int[] iArr, int i) {
        return iArr[(i * 5) + 1];
    }

    /* renamed from: G */
    public static final int m27614G(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* renamed from: H */
    public static final boolean m27615H(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0;
    }

    /* renamed from: I */
    public static final boolean m27616I(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 134217728) != 0;
    }

    /* renamed from: J */
    public static final boolean m27617J(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 536870912) != 0;
    }

    /* renamed from: K */
    public static final void m27618K(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        int i5 = z ? 1073741824 : 0;
        int i6 = z2 ? 536870912 : 0;
        int i7 = z3 ? 268435456 : 0;
        int i8 = i * 5;
        iArr[i8 + 0] = i2;
        iArr[i8 + 1] = i5 | i6 | i7;
        iArr[i8 + 2] = i3;
        iArr[i8 + 3] = 0;
        iArr[i8 + 4] = i4;
    }

    /* renamed from: L */
    public static final boolean m27619L(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    /* renamed from: M */
    public static final int m27620M(int[] iArr, int i) {
        return iArr[i * 5];
    }

    /* renamed from: N */
    public static final int m27621N(ArrayList arrayList, int i, int i2) {
        int iM27626S = m27626S(arrayList, i, i2);
        return iM27626S >= 0 ? iM27626S : -(iM27626S + 1);
    }

    /* renamed from: O */
    public static final int m27622O(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    /* renamed from: P */
    public static final int m27623P(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* renamed from: Q */
    public static final int m27624Q(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + m27611D(iArr[i2 + 1] >> 30);
    }

    /* renamed from: R */
    public static final int m27625R(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    /* renamed from: S */
    public static final int m27626S(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iM48144a = ((sc0) arrayList.get(i4)).m48144a();
            if (iM48144a < 0) {
                iM48144a += i2;
            }
            int iM48651j = sq8.m48651j(iM48144a, i);
            if (iM48651j < 0) {
                i3 = i4 + 1;
            } else {
                if (iM48651j <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* renamed from: T */
    public static final int m27627T(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + m27611D(iArr[i2 + 1] >> 28);
    }

    /* renamed from: U */
    public static final void m27628U(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 67108864;
        } else {
            iArr[i2] = iArr[i2] & (-67108865);
        }
    }

    /* renamed from: V */
    public static final void m27629V(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = i2;
    }

    /* renamed from: W */
    public static final void m27630W(int[] iArr, int i, int i2) {
        go3.m29198R(i2 >= 0);
        iArr[(i * 5) + 3] = i2;
    }

    /* renamed from: X */
    public static final void m27631X(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 134217728;
        } else {
            iArr[i2] = iArr[i2] & (-134217729);
        }
    }

    /* renamed from: Y */
    public static final void m27632Y(int[] iArr, int i, int i2) {
        go3.m29198R(i2 >= 0 && i2 < 67108863);
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    /* renamed from: Z */
    public static final void m27633Z(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 2] = i2;
    }
}
