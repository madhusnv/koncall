package p001o;

/* loaded from: classes2.dex */
public final class lnd {

    /* renamed from: a */
    public final C15111a f34119a;

    /* renamed from: b */
    public final C15111a f34120b;

    /* renamed from: c */
    public final int f34121c;

    /* renamed from: d */
    public final boolean f34122d;

    /* renamed from: o.lnd$a */
    public static final class C15111a {

        /* renamed from: a */
        public final C15112b[] f34123a;

        public C15111a(C15112b... c15112bArr) {
            this.f34123a = c15112bArr;
        }

        /* renamed from: a */
        public C15112b m37530a(int i) {
            return this.f34123a[i];
        }

        /* renamed from: b */
        public int m37531b() {
            return this.f34123a.length;
        }
    }

    /* renamed from: o.lnd$b */
    public static final class C15112b {

        /* renamed from: a */
        public final int f34124a;

        /* renamed from: b */
        public final int f34125b;

        /* renamed from: c */
        public final float[] f34126c;

        /* renamed from: d */
        public final float[] f34127d;

        public C15112b(int i, float[] fArr, float[] fArr2, int i2) {
            this.f34124a = i;
            op0.m42511a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f34126c = fArr;
            this.f34127d = fArr2;
            this.f34125b = i2;
        }

        /* renamed from: a */
        public int m37532a() {
            return this.f34126c.length / 3;
        }
    }

    public lnd(C15111a c15111a, int i) {
        this(c15111a, c15111a, i);
    }

    /* renamed from: a */
    public static lnd m37528a(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        float f4;
        int i5;
        int i6;
        int i7;
        float[] fArr;
        int i8;
        int i9 = i;
        int i10 = i2;
        op0.m42511a(f > 0.0f);
        op0.m42511a(i9 >= 1);
        op0.m42511a(i10 >= 1);
        op0.m42511a(f2 > 0.0f && f2 <= 180.0f);
        op0.m42511a(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f5 = radians / i9;
        float f6 = radians2 / i10;
        int i11 = i10 + 1;
        int i12 = ((i11 * 2) + 2) * i9;
        float[] fArr2 = new float[i12 * 3];
        float[] fArr3 = new float[i12 * 2];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i9) {
            float f7 = radians / 2.0f;
            float f8 = (i13 * f5) - f7;
            int i16 = i13 + 1;
            float f9 = (i16 * f5) - f7;
            int i17 = 0;
            while (i17 < i11) {
                float f10 = f8;
                int i18 = i16;
                int i19 = 0;
                int i20 = 2;
                while (i19 < i20) {
                    if (i19 == 0) {
                        f4 = f10;
                        i4 = i11;
                    } else {
                        i4 = i11;
                        f4 = f9;
                    }
                    float f11 = i17 * f6;
                    float f12 = f6;
                    int i21 = i14 + 1;
                    int i22 = i17;
                    double d = f;
                    float f13 = f5;
                    double d2 = (f11 + 3.1415927f) - (radians2 / 2.0f);
                    int i23 = i19;
                    double d3 = f4;
                    float[] fArr4 = fArr3;
                    float f14 = f9;
                    fArr2[i14] = -((float) (Math.sin(d2) * d * Math.cos(d3)));
                    int i24 = i21 + 1;
                    int i25 = i13;
                    fArr2[i21] = (float) (d * Math.sin(d3));
                    int i26 = i24 + 1;
                    fArr2[i24] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    int i27 = i15 + 1;
                    fArr4[i15] = f11 / radians2;
                    int i28 = i27 + 1;
                    fArr4[i27] = ((i25 + i23) * f13) / radians;
                    if (i22 == 0 && i23 == 0) {
                        i5 = i2;
                        i6 = i22;
                        i7 = i23;
                    } else {
                        i5 = i2;
                        i6 = i22;
                        i7 = i23;
                        if (i6 != i5 || i7 != 1) {
                            fArr = fArr4;
                            i8 = 2;
                        }
                        i15 = i28;
                        i14 = i26;
                        i19 = i7 + 1;
                        i10 = i5;
                        i17 = i6;
                        fArr3 = fArr;
                        i20 = i8;
                        i13 = i25;
                        i11 = i4;
                        f6 = f12;
                        f5 = f13;
                        f9 = f14;
                    }
                    System.arraycopy(fArr2, i26 - 3, fArr2, i26, 3);
                    i26 += 3;
                    fArr = fArr4;
                    i8 = 2;
                    System.arraycopy(fArr, i28 - 2, fArr, i28, 2);
                    i28 += 2;
                    i15 = i28;
                    i14 = i26;
                    i19 = i7 + 1;
                    i10 = i5;
                    i17 = i6;
                    fArr3 = fArr;
                    i20 = i8;
                    i13 = i25;
                    i11 = i4;
                    f6 = f12;
                    f5 = f13;
                    f9 = f14;
                }
                float f15 = f5;
                int i29 = i17;
                int i30 = i10;
                int i31 = i29 + 1;
                f8 = f10;
                i16 = i18;
                i11 = i11;
                f5 = f15;
                f9 = f9;
                i10 = i30;
                i17 = i31;
            }
            i9 = i;
            i13 = i16;
        }
        return new lnd(new C15111a(new C15112b(0, fArr2, fArr3, 1)), i3);
    }

    /* renamed from: b */
    public static lnd m37529b(int i) {
        return m37528a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public lnd(C15111a c15111a, C15111a c15111a2, int i) {
        this.f34119a = c15111a;
        this.f34120b = c15111a2;
        this.f34121c = i;
        this.f34122d = c15111a == c15111a2;
    }
}
