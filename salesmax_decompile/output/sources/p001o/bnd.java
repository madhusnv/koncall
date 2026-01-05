package p001o;

/* loaded from: classes2.dex */
public final class bnd {

    /* renamed from: a */
    public final float f16579a;

    /* renamed from: b */
    public final ht6 f16580b;

    public bnd(float f, ht6 ht6Var) {
        sq8.m48649h(ht6Var, "feature");
        this.f16579a = f;
        this.f16580b = ht6Var;
    }

    /* renamed from: a */
    public final ht6 m19450a() {
        return this.f16580b;
    }

    /* renamed from: b */
    public final float m19451b() {
        return this.f16579a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnd)) {
            return false;
        }
        bnd bndVar = (bnd) obj;
        return Float.compare(this.f16579a, bndVar.f16579a) == 0 && sq8.m48644c(this.f16580b, bndVar.f16580b);
    }

    public int hashCode() {
        return (Float.hashCode(this.f16579a) * 31) + this.f16580b.hashCode();
    }

    public String toString() {
        return "ProgressableFeature(progress=" + this.f16579a + ", feature=" + this.f16580b + ')';
    }
}
