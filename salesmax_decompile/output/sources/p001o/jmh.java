package p001o;

/* loaded from: classes6.dex */
public final class jmh {

    /* renamed from: a */
    public final Object f30752a;

    /* renamed from: b */
    public final long f30753b;

    public /* synthetic */ jmh(Object obj, long j, id5 id5Var) {
        this(obj, j);
    }

    /* renamed from: a */
    public final long m34107a() {
        return this.f30753b;
    }

    /* renamed from: b */
    public final Object m34108b() {
        return this.f30752a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmh)) {
            return false;
        }
        jmh jmhVar = (jmh) obj;
        return sq8.m48644c(this.f30752a, jmhVar.f30752a) && k16.m34889t(this.f30753b, jmhVar.f30753b);
    }

    public int hashCode() {
        Object obj = this.f30752a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + k16.m34862H(this.f30753b);
    }

    public String toString() {
        return "TimedValue(value=" + this.f30752a + ", duration=" + ((Object) k16.m34876V(this.f30753b)) + ')';
    }

    public jmh(Object obj, long j) {
        this.f30752a = obj;
        this.f30753b = j;
    }
}
