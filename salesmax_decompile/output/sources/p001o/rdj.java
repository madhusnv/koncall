package p001o;

/* loaded from: classes3.dex */
public final class rdj implements hu6 {

    /* renamed from: b */
    public static final C16593a f43424b = new C16593a(null);

    /* renamed from: c */
    public static final rdj f43425c = new rdj("member");

    /* renamed from: a */
    public final String f43426a;

    /* renamed from: o.rdj$a */
    public static final class C16593a {
        public C16593a() {
        }

        public /* synthetic */ C16593a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final rdj m46572a() {
            return rdj.f43425c;
        }
    }

    public rdj(String str) {
        sq8.m48649h(str, "element");
        this.f43426a = str;
    }

    /* renamed from: b */
    public final String m46571b() {
        return this.f43426a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rdj) && sq8.m48644c(this.f43426a, ((rdj) obj).f43426a);
    }

    public int hashCode() {
        return this.f43426a.hashCode();
    }

    public String toString() {
        return "XmlCollectionName(element=" + this.f43426a + ')';
    }
}
