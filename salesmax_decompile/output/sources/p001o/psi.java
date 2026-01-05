package p001o;

/* loaded from: classes2.dex */
public final class psi extends pyh {

    /* renamed from: a */
    public final String f40511a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psi(String str) {
        super(null);
        sq8.m48649h(str, "verbatim");
        this.f40511a = str;
    }

    /* renamed from: a */
    public final String m44135a() {
        return this.f40511a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psi) && sq8.m48644c(this.f40511a, ((psi) obj).f40511a);
    }

    public int hashCode() {
        return this.f40511a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f40511a + ')';
    }
}
