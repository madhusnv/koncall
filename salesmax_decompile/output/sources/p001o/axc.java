package p001o;

/* loaded from: classes2.dex */
public final class axc {

    /* renamed from: a */
    public byte[] f15339a;

    /* renamed from: b */
    public int f15340b;

    /* renamed from: c */
    public int f15341c;

    /* renamed from: d */
    public int f15342d;

    public axc(byte[] bArr, int i, int i2) {
        m17944i(bArr, i, i2);
    }

    /* renamed from: a */
    public final void m17936a() {
        int i;
        int i2 = this.f15341c;
        op0.m42517g(i2 >= 0 && (i2 < (i = this.f15340b) || (i2 == i && this.f15342d == 0)));
    }

    /* renamed from: b */
    public boolean m17937b(int i) {
        int i2 = this.f15341c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f15342d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f15340b) {
                break;
            }
            if (m17945j(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f15340b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m17938c() {
        int i = this.f15341c;
        int i2 = this.f15342d;
        int i3 = 0;
        while (this.f15341c < this.f15340b && !m17939d()) {
            i3++;
        }
        boolean z = this.f15341c == this.f15340b;
        this.f15341c = i;
        this.f15342d = i2;
        return !z && m17937b((i3 * 2) + 1);
    }

    /* renamed from: d */
    public boolean m17939d() {
        boolean z = (this.f15339a[this.f15341c] & (128 >> this.f15342d)) != 0;
        m17946k();
        return z;
    }

    /* renamed from: e */
    public int m17940e(int i) {
        int i2;
        this.f15342d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f15342d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f15342d = i4;
            byte[] bArr = this.f15339a;
            int i5 = this.f15341c;
            i3 |= (bArr[i5] & 255) << i4;
            if (!m17945j(i5 + 1)) {
                i = 1;
            }
            this.f15341c = i5 + i;
        }
        byte[] bArr2 = this.f15339a;
        int i6 = this.f15341c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f15342d = 0;
            this.f15341c = i6 + (m17945j(i6 + 1) ? 2 : 1);
        }
        m17936a();
        return i7;
    }

    /* renamed from: f */
    public final int m17941f() {
        int i = 0;
        while (!m17939d()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m17940e(i) : 0);
    }

    /* renamed from: g */
    public int m17942g() {
        int iM17941f = m17941f();
        return (iM17941f % 2 == 0 ? -1 : 1) * ((iM17941f + 1) / 2);
    }

    /* renamed from: h */
    public int m17943h() {
        return m17941f();
    }

    /* renamed from: i */
    public void m17944i(byte[] bArr, int i, int i2) {
        this.f15339a = bArr;
        this.f15341c = i;
        this.f15340b = i2;
        this.f15342d = 0;
        m17936a();
    }

    /* renamed from: j */
    public final boolean m17945j(int i) {
        if (2 <= i && i < this.f15340b) {
            byte[] bArr = this.f15339a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m17946k() {
        int i = this.f15342d + 1;
        this.f15342d = i;
        if (i == 8) {
            this.f15342d = 0;
            int i2 = this.f15341c;
            this.f15341c = i2 + (m17945j(i2 + 1) ? 2 : 1);
        }
        m17936a();
    }

    /* renamed from: l */
    public void m17947l(int i) {
        int i2 = this.f15341c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f15341c = i4;
        int i5 = this.f15342d + (i - (i3 * 8));
        this.f15342d = i5;
        if (i5 > 7) {
            this.f15341c = i4 + 1;
            this.f15342d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f15341c) {
                m17936a();
                return;
            } else if (m17945j(i2)) {
                this.f15341c++;
                i2 += 2;
            }
        }
    }
}
