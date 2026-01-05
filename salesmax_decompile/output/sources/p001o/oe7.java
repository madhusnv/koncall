package p001o;

/* loaded from: classes3.dex */
public final class oe7 implements hu6 {

    /* renamed from: b */
    public static final C15770a f38213b = new C15770a(null);

    /* renamed from: c */
    public static final oe7 f38214c = new oe7("member");

    /* renamed from: a */
    public final String f38215a;

    /* renamed from: o.oe7$a */
    public static final class C15770a {
        public C15770a() {
        }

        public /* synthetic */ C15770a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final oe7 m42118a() {
            return oe7.f38214c;
        }
    }

    public oe7(String str) {
        sq8.m48649h(str, "member");
        this.f38215a = str;
    }

    /* renamed from: b */
    public final String m42117b() {
        return this.f38215a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oe7) && sq8.m48644c(this.f38215a, ((oe7) obj).f38215a);
    }

    public int hashCode() {
        return this.f38215a.hashCode();
    }

    public String toString() {
        return "FormUrlCollectionName(member=" + this.f38215a + ')';
    }
}
