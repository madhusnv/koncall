package p001o;

/* loaded from: classes5.dex */
public final class e51 extends l4d {

    /* renamed from: a */
    public final long f20968a;

    /* renamed from: b */
    public final qwh f20969b;

    /* renamed from: c */
    public final ak6 f20970c;

    public e51(long j, qwh qwhVar, ak6 ak6Var) {
        this.f20968a = j;
        if (qwhVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f20969b = qwhVar;
        if (ak6Var == null) {
            throw new NullPointerException("Null event");
        }
        this.f20970c = ak6Var;
    }

    @Override // p001o.l4d
    /* renamed from: b */
    public ak6 mo24313b() {
        return this.f20970c;
    }

    @Override // p001o.l4d
    /* renamed from: c */
    public long mo24314c() {
        return this.f20968a;
    }

    @Override // p001o.l4d
    /* renamed from: d */
    public qwh mo24315d() {
        return this.f20969b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l4d)) {
            return false;
        }
        l4d l4dVar = (l4d) obj;
        return this.f20968a == l4dVar.mo24314c() && this.f20969b.equals(l4dVar.mo24315d()) && this.f20970c.equals(l4dVar.mo24313b());
    }

    public int hashCode() {
        long j = this.f20968a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f20969b.hashCode()) * 1000003) ^ this.f20970c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f20968a + ", transportContext=" + this.f20969b + ", event=" + this.f20970c + "}";
    }
}
