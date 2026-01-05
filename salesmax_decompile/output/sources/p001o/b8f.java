package p001o;

/* loaded from: classes3.dex */
public final class b8f {

    /* renamed from: a */
    public final jl6 f15679a;

    /* renamed from: b */
    public final q74 f15680b;

    /* renamed from: c */
    public final d28 f15681c;

    public b8f(jl6 jl6Var, q74 q74Var, d28 d28Var) {
        sq8.m48649h(jl6Var, "execContext");
        sq8.m48649h(q74Var, "callContext");
        sq8.m48649h(d28Var, "metrics");
        this.f15679a = jl6Var;
        this.f15680b = q74Var;
        this.f15681c = d28Var;
    }

    /* renamed from: a */
    public final q74 m18281a() {
        return this.f15680b;
    }

    /* renamed from: b */
    public final jl6 m18282b() {
        return this.f15679a;
    }

    /* renamed from: c */
    public final d28 m18283c() {
        return this.f15681c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8f)) {
            return false;
        }
        b8f b8fVar = (b8f) obj;
        return sq8.m48644c(this.f15679a, b8fVar.f15679a) && sq8.m48644c(this.f15680b, b8fVar.f15680b) && sq8.m48644c(this.f15681c, b8fVar.f15681c);
    }

    public int hashCode() {
        return (((this.f15679a.hashCode() * 31) + this.f15680b.hashCode()) * 31) + this.f15681c.hashCode();
    }

    public String toString() {
        return "SdkRequestTag(execContext=" + this.f15679a + ", callContext=" + this.f15680b + ", metrics=" + this.f15681c + ')';
    }
}
