package p001o;

import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public abstract class brb {
    /* renamed from: b */
    public static final void m19653b(ol8 ol8Var, at5 at5Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < ol8Var.m42380c()) {
            int i4 = i + 2;
            int iM42379b = ol8Var.m42379b(i) - ol8Var.m42379b(i4);
            int iM42379b2 = ol8Var.m42379b(i + 1) - ol8Var.m42379b(i4);
            int iM42379b3 = ol8Var.m42379b(i4);
            i += 3;
            while (i2 < iM42379b) {
                at5Var.mo5003a(i3, i2);
                i2++;
            }
            while (i3 < iM42379b2) {
                at5Var.mo5005c(i3);
                i3++;
            }
            while (true) {
                int i5 = iM42379b3 - 1;
                if (iM42379b3 > 0) {
                    at5Var.mo5006d(i2, i3);
                    i2++;
                    i3++;
                    iM42379b3 = i5;
                }
            }
        }
    }

    /* renamed from: c */
    public static final boolean m19654c(int i, int i2, int i3, int i4, at5 at5Var, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int iM40435b;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        boolean z = i8 % 2 == 0;
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 == i9 || (i10 != i5 && nf2.m40435b(iArr2, i10 + 1) < nf2.m40435b(iArr2, i10 - 1))) {
                iM40435b = nf2.m40435b(iArr2, i10 + 1);
                i6 = iM40435b;
            } else {
                iM40435b = nf2.m40435b(iArr2, i10 - 1);
                i6 = iM40435b - 1;
            }
            int i11 = i4 - ((i2 - i6) - i10);
            int i12 = (i5 == 0 || i6 != iM40435b) ? i11 : i11 + 1;
            while (i6 > i && i11 > i3) {
                if (!at5Var.mo5004b(i6 - 1, i11 - 1)) {
                    break;
                }
                i6--;
                i11--;
            }
            nf2.m40437d(iArr2, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 && i7 <= i5) {
                if (nf2.m40435b(iArr, i7) >= i6) {
                    m19657f(i6, i11, iM40435b, i12, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final ol8 m19655d(int i, int i2, at5 at5Var) {
        int i3 = ((i + i2) + 1) / 2;
        ol8 ol8Var = new ol8(i3 * 3);
        ol8 ol8Var2 = new ol8(i3 * 4);
        ol8Var2.m42385h(0, i, 0, i2);
        int i4 = (i3 * 2) + 1;
        int[] iArrM40434a = nf2.m40434a(new int[i4]);
        int[] iArrM40434a2 = nf2.m40434a(new int[i4]);
        int[] iArrM55304b = wwf.m55304b(new int[5]);
        while (ol8Var2.m42381d()) {
            int iM42383f = ol8Var2.m42383f();
            int iM42383f2 = ol8Var2.m42383f();
            int iM42383f3 = ol8Var2.m42383f();
            int iM42383f4 = ol8Var2.m42383f();
            int[] iArr = iArrM40434a;
            int[] iArr2 = iArrM40434a2;
            if (m19659h(iM42383f4, iM42383f3, iM42383f2, iM42383f, at5Var, iArrM40434a, iArrM40434a2, iArrM55304b)) {
                if (wwf.m55305c(iArrM55304b) > 0) {
                    wwf.m55303a(iArrM55304b, ol8Var);
                }
                ol8Var2.m42385h(iM42383f4, wwf.m55310h(iArrM55304b), iM42383f2, wwf.m55311i(iArrM55304b));
                ol8Var2.m42385h(wwf.m55306d(iArrM55304b), iM42383f3, wwf.m55307e(iArrM55304b), iM42383f);
            }
            iArrM40434a = iArr;
            iArrM40434a2 = iArr2;
        }
        ol8Var.m42387j();
        ol8Var.m42384g(i, i2, 0);
        return ol8Var;
    }

    /* renamed from: e */
    public static final void m19656e(int i, int i2, at5 at5Var) {
        sq8.m48649h(at5Var, "callback");
        m19653b(m19655d(i, i2, at5Var), at5Var);
    }

    /* renamed from: f */
    public static final void m19657f(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        sq8.m48649h(iArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    /* renamed from: g */
    public static final boolean m19658g(int i, int i2, int i3, int i4, at5 at5Var, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int iM40435b;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        boolean z = Math.abs(i8) % 2 == 1;
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 == i9 || (i10 != i5 && nf2.m40435b(iArr, i10 + 1) > nf2.m40435b(iArr, i10 - 1))) {
                iM40435b = nf2.m40435b(iArr, i10 + 1);
                i6 = iM40435b;
            } else {
                iM40435b = nf2.m40435b(iArr, i10 - 1);
                i6 = iM40435b + 1;
            }
            int i11 = (i3 + (i6 - i)) - i10;
            int i12 = (i5 == 0 || i6 != iM40435b) ? i11 : i11 - 1;
            while (i6 < i2 && i11 < i4) {
                if (!at5Var.mo5004b(i6, i11)) {
                    break;
                }
                i6++;
                i11++;
            }
            nf2.m40437d(iArr, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 + 1 && i7 <= i5 - 1) {
                if (nf2.m40435b(iArr2, i7) <= i6) {
                    m19657f(iM40435b, i12, i6, i11, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m19659h(int i, int i2, int i3, int i4, at5 at5Var, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 >= 1 && i6 >= 1) {
            int i7 = ((i5 + i6) + 1) / 2;
            nf2.m40437d(iArr, 1, i);
            nf2.m40437d(iArr2, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8;
                if (m19658g(i, i2, i3, i4, at5Var, iArr, iArr2, i8, iArr3) || m19654c(i, i2, i3, i4, at5Var, iArr, iArr2, i9, iArr3)) {
                    return true;
                }
                i8 = i9 + 1;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static final void m19660i(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
