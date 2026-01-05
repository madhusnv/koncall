package p001o;

/* loaded from: classes6.dex */
public final class do7 {

    /* renamed from: h */
    public static final do7 f20333h = new do7(4201, 4096, 1);

    /* renamed from: i */
    public static final do7 f20334i = new do7(1033, 1024, 1);

    /* renamed from: j */
    public static final do7 f20335j;

    /* renamed from: k */
    public static final do7 f20336k;

    /* renamed from: l */
    public static final do7 f20337l;

    /* renamed from: m */
    public static final do7 f20338m;

    /* renamed from: n */
    public static final do7 f20339n;

    /* renamed from: o */
    public static final do7 f20340o;

    /* renamed from: a */
    public final int[] f20341a;

    /* renamed from: b */
    public final int[] f20342b;

    /* renamed from: c */
    public final eo7 f20343c;

    /* renamed from: d */
    public final eo7 f20344d;

    /* renamed from: e */
    public final int f20345e;

    /* renamed from: f */
    public final int f20346f;

    /* renamed from: g */
    public final int f20347g;

    static {
        do7 do7Var = new do7(67, 64, 1);
        f20335j = do7Var;
        f20336k = new do7(19, 16, 1);
        f20337l = new do7(285, 256, 0);
        do7 do7Var2 = new do7(301, 256, 1);
        f20338m = do7Var2;
        f20339n = do7Var2;
        f20340o = do7Var;
    }

    public do7(int i, int i2, int i3) {
        this.f20346f = i;
        this.f20345e = i2;
        this.f20347g = i3;
        this.f20341a = new int[i2];
        this.f20342b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f20341a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f20342b[this.f20341a[i6]] = i6;
        }
        this.f20343c = new eo7(this, new int[]{0});
        this.f20344d = new eo7(this, new int[]{1});
    }

    /* renamed from: a */
    public static int m23641a(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: b */
    public eo7 m23642b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f20343c;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new eo7(this, iArr);
    }

    /* renamed from: c */
    public int m23643c(int i) {
        return this.f20341a[i];
    }

    /* renamed from: d */
    public int m23644d() {
        return this.f20347g;
    }

    /* renamed from: e */
    public eo7 m23645e() {
        return this.f20343c;
    }

    /* renamed from: f */
    public int m23646f(int i) {
        if (i != 0) {
            return this.f20341a[(this.f20345e - this.f20342b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: g */
    public int m23647g(int i) {
        if (i != 0) {
            return this.f20342b[i];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public int m23648h(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f20341a;
        int[] iArr2 = this.f20342b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f20345e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f20346f) + ',' + this.f20345e + ')';
    }
}
