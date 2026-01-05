package p001o;

/* loaded from: classes2.dex */
public final class zwf {

    /* renamed from: a */
    public int f57830a;

    /* renamed from: b */
    public int[] f57831b = new int[16];

    /* renamed from: c */
    public int[] f57832c = new int[16];

    /* renamed from: d */
    public int[] f57833d;

    /* renamed from: e */
    public int f57834e;

    public zwf() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.f57833d = iArr;
    }

    /* renamed from: a */
    public final int m60053a(int i) {
        m60055c(this.f57830a + 1);
        int i2 = this.f57830a;
        this.f57830a = i2 + 1;
        int iM60054b = m60054b();
        this.f57831b[i2] = i;
        this.f57832c[i2] = iM60054b;
        this.f57833d[iM60054b] = i2;
        m60060h(i2);
        return iM60054b;
    }

    /* renamed from: b */
    public final int m60054b() {
        int length = this.f57833d.length;
        if (this.f57834e >= length) {
            int i = length * 2;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            fp0.m27263l(this.f57833d, iArr, 0, 0, 0, 14, null);
            this.f57833d = iArr;
        }
        int i4 = this.f57834e;
        this.f57834e = this.f57833d[i4];
        return i4;
    }

    /* renamed from: c */
    public final void m60055c(int i) {
        int[] iArr = this.f57831b;
        int length = iArr.length;
        if (i <= length) {
            return;
        }
        int i2 = length * 2;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        fp0.m27263l(iArr, iArr2, 0, 0, 0, 14, null);
        fp0.m27263l(this.f57832c, iArr3, 0, 0, 0, 14, null);
        this.f57831b = iArr2;
        this.f57832c = iArr3;
    }

    /* renamed from: d */
    public final void m60056d(int i) {
        this.f57833d[i] = this.f57834e;
        this.f57834e = i;
    }

    /* renamed from: e */
    public final int m60057e(int i) {
        return this.f57830a > 0 ? this.f57831b[0] : i;
    }

    /* renamed from: f */
    public final void m60058f(int i) {
        int i2 = this.f57833d[i];
        m60061i(i2, this.f57830a - 1);
        this.f57830a--;
        m60060h(i2);
        m60059g(i2);
        m60056d(i);
    }

    /* renamed from: g */
    public final void m60059g(int i) {
        int i2;
        int[] iArr = this.f57831b;
        int i3 = this.f57830a >> 1;
        while (i < i3) {
            int i4 = (i + 1) << 1;
            int i5 = i4 - 1;
            if (i4 >= this.f57830a || (i2 = iArr[i4]) >= iArr[i5]) {
                if (iArr[i5] >= iArr[i]) {
                    return;
                }
                m60061i(i5, i);
                i = i5;
            } else {
                if (i2 >= iArr[i]) {
                    return;
                }
                m60061i(i4, i);
                i = i4;
            }
        }
    }

    /* renamed from: h */
    public final void m60060h(int i) {
        int[] iArr = this.f57831b;
        int i2 = iArr[i];
        while (i > 0) {
            int i3 = ((i + 1) >> 1) - 1;
            if (iArr[i3] <= i2) {
                return;
            }
            m60061i(i3, i);
            i = i3;
        }
    }

    /* renamed from: i */
    public final void m60061i(int i, int i2) {
        int[] iArr = this.f57831b;
        int[] iArr2 = this.f57832c;
        int[] iArr3 = this.f57833d;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }
}
