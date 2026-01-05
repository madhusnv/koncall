package k2;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a */
    public int[] f20419a;

    /* renamed from: b */
    public int f20420b;

    public l0() {
        this.f20419a = new int[10];
    }

    /* renamed from: a */
    public int m8547a(int i10) {
        int i11 = this.f20420b - 1;
        return i11 >= 0 ? this.f20419a[i11] : i10;
    }

    /* renamed from: b */
    public int m8548b() {
        int[] iArr = this.f20419a;
        int i10 = this.f20420b - 1;
        this.f20420b = i10;
        return iArr[i10];
    }

    /* renamed from: c */
    public void m8549c(int i10) {
        int[] iArrCopyOf = this.f20419a;
        if (this.f20420b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
            this.f20419a = iArrCopyOf;
        }
        int i11 = this.f20420b;
        this.f20420b = i11 + 1;
        iArrCopyOf[i11] = i10;
    }

    /* renamed from: d */
    public void m8550d(int i10, int i11, int i12) {
        int i13 = this.f20420b;
        int[] iArrCopyOf = this.f20419a;
        int i14 = i13 + 3;
        if (i14 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
            this.f20419a = iArrCopyOf;
        }
        iArrCopyOf[i13] = i10 + i12;
        iArrCopyOf[i13 + 1] = i11 + i12;
        iArrCopyOf[i13 + 2] = i12;
        this.f20420b = i14;
    }

    /* renamed from: e */
    public void m8551e(int i10, int i11, int i12, int i13) {
        int i14 = this.f20420b;
        int[] iArrCopyOf = this.f20419a;
        int i15 = i14 + 4;
        if (i15 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
            this.f20419a = iArrCopyOf;
        }
        iArrCopyOf[i14] = i10;
        iArrCopyOf[i14 + 1] = i11;
        iArrCopyOf[i14 + 2] = i12;
        iArrCopyOf[i14 + 3] = i13;
        this.f20420b = i15;
    }

    /* renamed from: f */
    public void m8552f(int i10, int i11) {
        if (i10 < i11) {
            int i12 = i10 - 3;
            for (int i13 = i10; i13 < i11; i13 += 3) {
                int[] iArr = this.f20419a;
                int i14 = iArr[i13];
                int i15 = iArr[i11];
                if (i14 < i15 || (i14 == i15 && iArr[i13 + 1] <= iArr[i11 + 1])) {
                    i12 += 3;
                    m8553g(i12, i13);
                }
            }
            m8553g(i12 + 3, i11);
            m8552f(i10, i12);
            m8552f(i12 + 6, i11);
        }
    }

    /* renamed from: g */
    public void m8553g(int i10, int i11) {
        int[] iArr = this.f20419a;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i10 + 1;
        int i14 = i11 + 1;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = i10 + 2;
        int i17 = i11 + 2;
        int i18 = iArr[i16];
        iArr[i16] = iArr[i17];
        iArr[i17] = i18;
    }

    public l0(int i10) {
        this.f20419a = new int[i10];
    }
}
