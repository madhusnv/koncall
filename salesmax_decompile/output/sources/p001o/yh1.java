package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class yh1 implements Cloneable {

    /* renamed from: a */
    public final int f55506a;

    /* renamed from: b */
    public final int f55507b;

    /* renamed from: c */
    public final int f55508c;

    /* renamed from: d */
    public final int[] f55509d;

    public yh1(int i) {
        this(i, i);
    }

    /* renamed from: a */
    public final String m57798a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f55507b * (this.f55506a + 1));
        for (int i = 0; i < this.f55507b; i++) {
            for (int i2 = 0; i2 < this.f55506a; i2++) {
                sb.append(m57800c(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public yh1 clone() {
        return new yh1(this.f55506a, this.f55507b, this.f55508c, (int[]) this.f55509d.clone());
    }

    /* renamed from: c */
    public boolean m57800c(int i, int i2) {
        return ((this.f55509d[(i2 * this.f55508c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public void clear() {
        int length = this.f55509d.length;
        for (int i = 0; i < length; i++) {
            this.f55509d[i] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof yh1)) {
            return false;
        }
        yh1 yh1Var = (yh1) obj;
        return this.f55506a == yh1Var.f55506a && this.f55507b == yh1Var.f55507b && this.f55508c == yh1Var.f55508c && Arrays.equals(this.f55509d, yh1Var.f55509d);
    }

    /* renamed from: f */
    public int m57801f() {
        return this.f55507b;
    }

    /* renamed from: g */
    public int m57802g() {
        return this.f55506a;
    }

    /* renamed from: h */
    public void m57803h(int i, int i2) {
        int i3 = (i2 * this.f55508c) + (i / 32);
        int[] iArr = this.f55509d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public int hashCode() {
        int i = this.f55506a;
        return (((((((i * 31) + i) * 31) + this.f55507b) * 31) + this.f55508c) * 31) + Arrays.hashCode(this.f55509d);
    }

    /* renamed from: i */
    public void m57804i(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f55507b || i5 > this.f55506a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.f55508c * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f55509d;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    /* renamed from: j */
    public String m57805j(String str, String str2) {
        return m57798a(str, str2, "\n");
    }

    public String toString() {
        return m57805j("X ", "  ");
    }

    public yh1(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f55506a = i;
        this.f55507b = i2;
        int i3 = (i + 31) / 32;
        this.f55508c = i3;
        this.f55509d = new int[i3 * i2];
    }

    public yh1(int i, int i2, int i3, int[] iArr) {
        this.f55506a = i;
        this.f55507b = i2;
        this.f55508c = i3;
        this.f55509d = iArr;
    }
}
