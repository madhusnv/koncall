package o1;

import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.j */
/* loaded from: classes.dex */
public abstract class AbstractC5251j {

    /* renamed from: a */
    public static final C5243b f25757a = new C5243b(3);

    /* renamed from: b */
    public static final C5243b f25758b = new C5243b(2);

    /* renamed from: c */
    public static final C5245d f25759c = new C5245d(1);

    /* renamed from: d */
    public static final C5245d f25760d = new C5245d(0);

    /* renamed from: e */
    public static final C5246e f25761e = new C5246e(0);

    /* renamed from: f */
    public static final C5246e f25762f = new C5246e(3);

    /* renamed from: g */
    public static final C5246e f25763g = new C5246e(2);

    /* renamed from: h */
    public static final C5246e f25764h = new C5246e(1);

    /* renamed from: a */
    public static void m10345a(int i10, int[] iArr, int[] iArr2, boolean z6) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f6 = (i10 - i12) / 2;
        if (!z6) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f6);
                f6 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = iArr[length2];
            iArr2[length2] = Math.round(f6);
            f6 += i16;
        }
    }

    /* renamed from: b */
    public static void m10346b(int[] iArr, int[] iArr2, boolean z6) {
        int i10 = 0;
        if (!z6) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = iArr[length2];
            iArr2[length2] = i10;
            i10 += i14;
        }
    }

    /* renamed from: c */
    public static void m10347c(int i10, int[] iArr, int[] iArr2, boolean z6) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z6) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = i14;
            i14 += i17;
        }
    }

    /* renamed from: d */
    public static void m10348d(int i10, int[] iArr, int[] iArr2, boolean z6) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = iArr.length == 0 ? DefinitionKt.NO_Float_VALUE : (i10 - i12) / iArr.length;
        float f6 = length / 2;
        if (!z6) {
            int length2 = iArr.length;
            int i14 = 0;
            while (i11 < length2) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f6);
                f6 += i15 + length;
                i11++;
                i14++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i16 = iArr[length3];
            iArr2[length3] = Math.round(f6);
            f6 += i16 + length;
        }
    }

    /* renamed from: e */
    public static void m10349e(int i10, int[] iArr, int[] iArr2, boolean z6) {
        if (iArr.length == 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float fMax = (i10 - i12) / Math.max(iArr.length - 1, 1);
        float f6 = (z6 && iArr.length == 1) ? fMax : DefinitionKt.NO_Float_VALUE;
        if (z6) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i14 = iArr[length];
                iArr2[length] = Math.round(f6);
                f6 += i14 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i15 = 0;
        while (i11 < length2) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f6);
            f6 += i16 + fMax;
            i11++;
            i15++;
        }
    }

    /* renamed from: f */
    public static void m10350f(int i10, int[] iArr, int[] iArr2, boolean z6) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (z6) {
            float f6 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f6);
                f6 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f10 = length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f10);
            f10 += i16 + length;
            i11++;
            i15++;
        }
    }

    /* renamed from: g */
    public static C5248g m10351g(float f6) {
        return new C5248g(f6, true, C5250i.f25745b);
    }
}
