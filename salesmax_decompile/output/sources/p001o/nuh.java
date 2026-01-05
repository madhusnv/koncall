package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public final class nuh {

    /* renamed from: a */
    public final double f37335a;

    /* renamed from: b */
    public final double f37336b;

    /* renamed from: c */
    public final double f37337c;

    /* renamed from: d */
    public final double f37338d;

    /* renamed from: e */
    public final double f37339e;

    /* renamed from: f */
    public final double f37340f;

    /* renamed from: g */
    public final double f37341g;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if ((r2 == com.google.firebase.remoteconfig.FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nuh(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f37335a = d;
        this.f37336b = d2;
        this.f37337c = d3;
        this.f37338d = d4;
        this.f37339e = d5;
        this.f37340f = d6;
        this.f37341g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d5 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (!(d2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
            }
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d) {
            if (d4 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
            }
        }
        if (d2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d4 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
            }
        } else {
            if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            }
        }
        if (d4 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    /* renamed from: a */
    public final double m41167a() {
        return this.f37336b;
    }

    /* renamed from: b */
    public final double m41168b() {
        return this.f37337c;
    }

    /* renamed from: c */
    public final double m41169c() {
        return this.f37338d;
    }

    /* renamed from: d */
    public final double m41170d() {
        return this.f37339e;
    }

    /* renamed from: e */
    public final double m41171e() {
        return this.f37340f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuh)) {
            return false;
        }
        nuh nuhVar = (nuh) obj;
        return Double.compare(this.f37335a, nuhVar.f37335a) == 0 && Double.compare(this.f37336b, nuhVar.f37336b) == 0 && Double.compare(this.f37337c, nuhVar.f37337c) == 0 && Double.compare(this.f37338d, nuhVar.f37338d) == 0 && Double.compare(this.f37339e, nuhVar.f37339e) == 0 && Double.compare(this.f37340f, nuhVar.f37340f) == 0 && Double.compare(this.f37341g, nuhVar.f37341g) == 0;
    }

    /* renamed from: f */
    public final double m41172f() {
        return this.f37341g;
    }

    /* renamed from: g */
    public final double m41173g() {
        return this.f37335a;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f37335a) * 31) + Double.hashCode(this.f37336b)) * 31) + Double.hashCode(this.f37337c)) * 31) + Double.hashCode(this.f37338d)) * 31) + Double.hashCode(this.f37339e)) * 31) + Double.hashCode(this.f37340f)) * 31) + Double.hashCode(this.f37341g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f37335a + ", a=" + this.f37336b + ", b=" + this.f37337c + ", c=" + this.f37338d + ", d=" + this.f37339e + ", e=" + this.f37340f + ", f=" + this.f37341g + ')';
    }

    public /* synthetic */ nuh(double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, id5 id5Var) {
        this(d, d2, d3, d4, d5, (i & 32) != 0 ? 0.0d : d6, (i & 64) != 0 ? 0.0d : d7);
    }
}
