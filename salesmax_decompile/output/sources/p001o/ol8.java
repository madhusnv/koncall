package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ol8 {

    /* renamed from: a */
    public int[] f38538a;

    /* renamed from: b */
    public int f38539b;

    public ol8(int i) {
        this.f38538a = new int[i];
    }

    /* renamed from: a */
    public final boolean m42378a(int i, int i2) {
        int[] iArr = this.f38538a;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        if (i3 >= i4) {
            return i3 == i4 && iArr[i + 1] <= iArr[i2 + 1];
        }
        return true;
    }

    /* renamed from: b */
    public final int m42379b(int i) {
        return this.f38538a[i];
    }

    /* renamed from: c */
    public final int m42380c() {
        return this.f38539b;
    }

    /* renamed from: d */
    public final boolean m42381d() {
        return this.f38539b != 0;
    }

    /* renamed from: e */
    public final int m42382e(int i, int i2, int i3) {
        int i4 = i - i3;
        while (i < i2) {
            if (m42378a(i, i2)) {
                i4 += i3;
                m42388k(i4, i);
            }
            i += i3;
        }
        int i5 = i4 + i3;
        m42388k(i5, i2);
        return i5;
    }

    /* renamed from: f */
    public final int m42383f() {
        int[] iArr = this.f38538a;
        int i = this.f38539b - 1;
        this.f38539b = i;
        return iArr[i];
    }

    /* renamed from: g */
    public final void m42384g(int i, int i2, int i3) {
        int i4 = this.f38539b;
        int i5 = i4 + 3;
        int[] iArr = this.f38538a;
        if (i5 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            sq8.m48648g(iArrCopyOf, "copyOf(this, newSize)");
            this.f38538a = iArrCopyOf;
        }
        int[] iArr2 = this.f38538a;
        iArr2[i4 + 0] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.f38539b = i5;
    }

    /* renamed from: h */
    public final void m42385h(int i, int i2, int i3, int i4) {
        int i5 = this.f38539b;
        int i6 = i5 + 4;
        int[] iArr = this.f38538a;
        if (i6 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            sq8.m48648g(iArrCopyOf, "copyOf(this, newSize)");
            this.f38538a = iArrCopyOf;
        }
        int[] iArr2 = this.f38538a;
        iArr2[i5 + 0] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.f38539b = i6;
    }

    /* renamed from: i */
    public final void m42386i(int i, int i2, int i3) {
        if (i < i2) {
            int iM42382e = m42382e(i, i2, i3);
            m42386i(i, iM42382e - i3, i3);
            m42386i(iM42382e + i3, i2, i3);
        }
    }

    /* renamed from: j */
    public final void m42387j() {
        int i = this.f38539b;
        if (!(i % 3 == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i > 3) {
            m42386i(0, i - 3, 3);
        }
    }

    /* renamed from: k */
    public final void m42388k(int i, int i2) {
        int[] iArr = this.f38538a;
        brb.m19660i(iArr, i, i2);
        brb.m19660i(iArr, i + 1, i2 + 1);
        brb.m19660i(iArr, i + 2, i2 + 2);
    }
}
