package p001o;

/* loaded from: classes2.dex */
public final class am5 implements zl5 {

    /* renamed from: a */
    public final float f14967a;

    /* renamed from: b */
    public final float f14968b;

    public am5(float f, float f2) {
        this.f14967a = f;
        this.f14968b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am5)) {
            return false;
        }
        am5 am5Var = (am5) obj;
        return Float.compare(this.f14967a, am5Var.f14967a) == 0 && Float.compare(this.f14968b, am5Var.f14968b) == 0;
    }

    @Override // p001o.zl5
    public float getDensity() {
        return this.f14967a;
    }

    public int hashCode() {
        return (Float.hashCode(this.f14967a) * 31) + Float.hashCode(this.f14968b);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f14967a + ", fontScale=" + this.f14968b + ')';
    }

    @Override // p001o.zl5
    /* renamed from: x */
    public float mo17436x() {
        return this.f14968b;
    }
}
