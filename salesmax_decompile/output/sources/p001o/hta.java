package p001o;

/* loaded from: classes6.dex */
public final class hta {

    /* renamed from: a */
    public final String f27534a;

    /* renamed from: b */
    public final kl8 f27535b;

    public hta(String str, kl8 kl8Var) {
        sq8.m48649h(str, "value");
        sq8.m48649h(kl8Var, "range");
        this.f27534a = str;
        this.f27535b = kl8Var;
    }

    /* renamed from: a */
    public final String m31119a() {
        return this.f27534a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hta)) {
            return false;
        }
        hta htaVar = (hta) obj;
        return sq8.m48644c(this.f27534a, htaVar.f27534a) && sq8.m48644c(this.f27535b, htaVar.f27535b);
    }

    public int hashCode() {
        return (this.f27534a.hashCode() * 31) + this.f27535b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f27534a + ", range=" + this.f27535b + ')';
    }
}
