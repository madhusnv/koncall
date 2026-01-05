package p001o;

/* loaded from: classes2.dex */
public final class bvi {

    /* renamed from: e */
    public static final bvi f16878e = new bvi(0, 0);

    /* renamed from: f */
    public static final String f16879f = sqi.B0(0);

    /* renamed from: g */
    public static final String f16880g = sqi.B0(1);

    /* renamed from: h */
    public static final String f16881h = sqi.B0(2);

    /* renamed from: i */
    public static final String f16882i = sqi.B0(3);

    /* renamed from: a */
    public final int f16883a;

    /* renamed from: b */
    public final int f16884b;

    /* renamed from: c */
    public final int f16885c;

    /* renamed from: d */
    public final float f16886d;

    public bvi(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvi)) {
            return false;
        }
        bvi bviVar = (bvi) obj;
        return this.f16883a == bviVar.f16883a && this.f16884b == bviVar.f16884b && this.f16885c == bviVar.f16885c && this.f16886d == bviVar.f16886d;
    }

    public int hashCode() {
        return ((((((217 + this.f16883a) * 31) + this.f16884b) * 31) + this.f16885c) * 31) + Float.floatToRawIntBits(this.f16886d);
    }

    public bvi(int i, int i2, int i3, float f) {
        this.f16883a = i;
        this.f16884b = i2;
        this.f16885c = i3;
        this.f16886d = f;
    }
}
