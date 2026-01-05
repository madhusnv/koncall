package p001o;

/* loaded from: classes3.dex */
public final class fxc {

    /* renamed from: a */
    public final int f24241a;

    /* renamed from: b */
    public final int f24242b;

    /* renamed from: c */
    public final int f24243c;

    /* renamed from: d */
    public final int f24244d;

    /* renamed from: e */
    public final int f24245e;

    /* renamed from: f */
    public final int f24246f;

    /* renamed from: g */
    public final int f24247g;

    /* renamed from: h */
    public final int f24248h;

    public fxc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f24241a = i;
        this.f24242b = i2;
        this.f24243c = i3;
        this.f24244d = i4;
        this.f24245e = i5;
        this.f24246f = i6;
        this.f24247g = i7;
        this.f24248h = i8;
    }

    /* renamed from: a */
    public final int m27712a() {
        return this.f24243c;
    }

    /* renamed from: b */
    public final int m27713b() {
        return this.f24244d;
    }

    /* renamed from: c */
    public final int m27714c() {
        return this.f24245e;
    }

    /* renamed from: d */
    public final int m27715d() {
        return this.f24242b;
    }

    /* renamed from: e */
    public final int m27716e() {
        return this.f24247g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxc)) {
            return false;
        }
        fxc fxcVar = (fxc) obj;
        return this.f24241a == fxcVar.f24241a && this.f24242b == fxcVar.f24242b && this.f24243c == fxcVar.f24243c && this.f24244d == fxcVar.f24244d && this.f24245e == fxcVar.f24245e && this.f24246f == fxcVar.f24246f && this.f24247g == fxcVar.f24247g && this.f24248h == fxcVar.f24248h;
    }

    /* renamed from: f */
    public final int m27717f() {
        return this.f24248h;
    }

    /* renamed from: g */
    public final int m27718g() {
        return this.f24246f;
    }

    /* renamed from: h */
    public final int m27719h() {
        return this.f24241a;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f24241a) * 31) + Integer.hashCode(this.f24242b)) * 31) + Integer.hashCode(this.f24243c)) * 31) + Integer.hashCode(this.f24244d)) * 31) + Integer.hashCode(this.f24245e)) * 31) + Integer.hashCode(this.f24246f)) * 31) + Integer.hashCode(this.f24247g)) * 31) + Integer.hashCode(this.f24248h);
    }

    public String toString() {
        return "ParsedDatetime(year=" + this.f24241a + ", month=" + this.f24242b + ", day=" + this.f24243c + ", hour=" + this.f24244d + ", min=" + this.f24245e + ", sec=" + this.f24246f + ", ns=" + this.f24247g + ", offsetSec=" + this.f24248h + ')';
    }
}
