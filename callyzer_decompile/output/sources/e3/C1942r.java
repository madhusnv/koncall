package e3;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e3.r */
/* loaded from: classes.dex */
public final class C1942r {

    /* renamed from: a */
    public final double f9169a;

    /* renamed from: b */
    public final double f9170b;

    /* renamed from: c */
    public final double f9171c;

    /* renamed from: d */
    public final double f9172d;

    /* renamed from: e */
    public final double f9173e;

    /* renamed from: f */
    public final double f9174f;

    /* renamed from: g */
    public final double f9175g;

    public /* synthetic */ C1942r(double d2, double d10, double d11, double d12, double d13) {
        this(d2, d10, d11, d12, d13, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1942r)) {
            return false;
        }
        C1942r c1942r = (C1942r) obj;
        return Double.compare(this.f9169a, c1942r.f9169a) == 0 && Double.compare(this.f9170b, c1942r.f9170b) == 0 && Double.compare(this.f9171c, c1942r.f9171c) == 0 && Double.compare(this.f9172d, c1942r.f9172d) == 0 && Double.compare(this.f9173e, c1942r.f9173e) == 0 && Double.compare(this.f9174f, c1942r.f9174f) == 0 && Double.compare(this.f9175g, c1942r.f9175g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f9175g) + ((Double.hashCode(this.f9174f) + ((Double.hashCode(this.f9173e) + ((Double.hashCode(this.f9172d) + ((Double.hashCode(this.f9171c) + ((Double.hashCode(this.f9170b) + (Double.hashCode(this.f9169a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f9169a + ", a=" + this.f9170b + ", b=" + this.f9171c + ", c=" + this.f9172d + ", d=" + this.f9173e + ", e=" + this.f9174f + ", f=" + this.f9175g + ')';
    }

    public C1942r(double d2, double d10, double d11, double d12, double d13, double d14, double d15) {
        this.f9169a = d2;
        this.f9170b = d10;
        this.f9171c = d11;
        this.f9172d = d12;
        this.f9173e = d13;
        this.f9174f = d14;
        this.f9175g = d15;
        if (Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d2 == -2.0d || d2 == -3.0d) {
            return;
        }
        if (d13 < 0.0d || d13 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d13);
        }
        if (d13 == 0.0d && (d10 == 0.0d || d2 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d13 >= 1.0d && d12 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d10 == 0.0d || d2 == 0.0d) && d12 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d12 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d10 < 0.0d || d2 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
