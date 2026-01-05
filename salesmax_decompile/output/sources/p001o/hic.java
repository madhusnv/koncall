package p001o;

/* loaded from: classes6.dex */
public final class hic implements da3 {

    /* renamed from: a */
    public final Class f27025a;

    /* renamed from: b */
    public final String f27026b;

    public hic(Class cls, String str) {
        sq8.m48649h(cls, "jClass");
        sq8.m48649h(str, "moduleName");
        this.f27025a = cls;
        this.f27026b = str;
    }

    @Override // p001o.da3
    /* renamed from: b */
    public Class mo22647b() {
        return this.f27025a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof hic) && sq8.m48644c(mo22647b(), ((hic) obj).mo22647b());
    }

    public int hashCode() {
        return mo22647b().hashCode();
    }

    public String toString() {
        return mo22647b().toString() + " (Kotlin reflection is not available)";
    }
}
