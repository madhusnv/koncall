package p001o;

/* loaded from: classes2.dex */
public final class mha {

    /* renamed from: b */
    public static final C15324a f35483b = new C15324a(null);

    /* renamed from: a */
    public final n9d f35484a;

    /* renamed from: o.mha$a */
    public static final class C15324a {
        public C15324a() {
        }

        public /* synthetic */ C15324a(id5 id5Var) {
            this();
        }
    }

    public mha(n9d n9dVar) {
        sq8.m48649h(n9dVar, "platformLocale");
        this.f35484a = n9dVar;
    }

    /* renamed from: a */
    public final n9d m39067a() {
        return this.f35484a;
    }

    /* renamed from: b */
    public final String m39068b() {
        return this.f35484a.mo40254a();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof mha)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return sq8.m48644c(m39068b(), ((mha) obj).m39068b());
    }

    public int hashCode() {
        return m39068b().hashCode();
    }

    public String toString() {
        return m39068b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mha(String str) {
        this(p9d.m43252a().mo41854a(str));
        sq8.m48649h(str, "languageTag");
    }
}
