package p001o;

/* loaded from: classes3.dex */
public final class jo0 {

    /* renamed from: a */
    public final int f30838a;

    /* renamed from: b */
    public float f30839b;

    /* renamed from: c */
    public int f30840c;

    /* renamed from: d */
    public int f30841d;

    /* renamed from: e */
    public float f30842e;

    /* renamed from: f */
    public float f30843f;

    /* renamed from: g */
    public final int f30844g;

    /* renamed from: h */
    public final float f30845h;

    public jo0(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
        this.f30838a = i;
        this.f30839b = pza.m44555a(f, f2, f3);
        this.f30840c = i2;
        this.f30842e = f4;
        this.f30841d = i3;
        this.f30843f = f5;
        this.f30844g = i4;
        m34142d(f6, f2, f3, f5);
        this.f30845h = m34141b(f5);
    }

    /* renamed from: c */
    public static jo0 m34139c(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        jo0 jo0Var = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = i5;
                    int i7 = length2;
                    int i8 = i3;
                    int i9 = length;
                    jo0 jo0Var2 = new jo0(i, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    if (jo0Var == null || jo0Var2.f30845h < jo0Var.f30845h) {
                        if (jo0Var2.f30845h == 0.0f) {
                            return jo0Var2;
                        }
                        jo0Var = jo0Var2;
                    }
                    i++;
                    i5 = i6 + 1;
                    length2 = i7;
                    i3 = i8;
                    length = i9;
                }
                i3++;
            }
        }
        return jo0Var;
    }

    /* renamed from: a */
    public final float m34140a(float f, int i, float f2, int i2, int i3) {
        if (i <= 0) {
            f2 = 0.0f;
        }
        float f3 = i2 / 2.0f;
        return (f - ((i + f3) * f2)) / (i3 + f3);
    }

    /* renamed from: b */
    public final float m34141b(float f) {
        if (m34145g()) {
            return Math.abs(f - this.f30843f) * this.f30838a;
        }
        return Float.MAX_VALUE;
    }

    /* renamed from: d */
    public final void m34142d(float f, float f2, float f3, float f4) {
        float fM34144f = f - m34144f();
        int i = this.f30840c;
        if (i > 0 && fM34144f > 0.0f) {
            float f5 = this.f30839b;
            this.f30839b = f5 + Math.min(fM34144f / i, f3 - f5);
        } else if (i > 0 && fM34144f < 0.0f) {
            float f6 = this.f30839b;
            this.f30839b = f6 + Math.max(fM34144f / i, f2 - f6);
        }
        int i2 = this.f30840c;
        float f7 = i2 > 0 ? this.f30839b : 0.0f;
        this.f30839b = f7;
        float fM34140a = m34140a(f, i2, f7, this.f30841d, this.f30844g);
        this.f30843f = fM34140a;
        float f8 = (this.f30839b + fM34140a) / 2.0f;
        this.f30842e = f8;
        int i3 = this.f30841d;
        if (i3 <= 0 || fM34140a == f4) {
            return;
        }
        float f9 = (f4 - fM34140a) * this.f30844g;
        float fMin = Math.min(Math.abs(f9), f8 * 0.1f * i3);
        if (f9 > 0.0f) {
            this.f30842e -= fMin / this.f30841d;
            this.f30843f += fMin / this.f30844g;
        } else {
            this.f30842e += fMin / this.f30841d;
            this.f30843f -= fMin / this.f30844g;
        }
    }

    /* renamed from: e */
    public int m34143e() {
        return this.f30840c + this.f30841d + this.f30844g;
    }

    /* renamed from: f */
    public final float m34144f() {
        return (this.f30843f * this.f30844g) + (this.f30842e * this.f30841d) + (this.f30839b * this.f30840c);
    }

    /* renamed from: g */
    public final boolean m34145g() {
        int i = this.f30844g;
        if (i <= 0 || this.f30840c <= 0 || this.f30841d <= 0) {
            return i <= 0 || this.f30840c <= 0 || this.f30843f > this.f30839b;
        }
        float f = this.f30843f;
        float f2 = this.f30842e;
        return f > f2 && f2 > this.f30839b;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f30838a + ", smallCount=" + this.f30840c + ", smallSize=" + this.f30839b + ", mediumCount=" + this.f30841d + ", mediumSize=" + this.f30842e + ", largeCount=" + this.f30844g + ", largeSize=" + this.f30843f + ", cost=" + this.f30845h + "]";
    }
}
