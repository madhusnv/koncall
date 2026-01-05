package p001o;

/* loaded from: classes3.dex */
public final class rr3 {

    /* renamed from: b */
    public static final C16652b f43980b = new C16652b(null);

    /* renamed from: a */
    public final String f43981a;

    /* renamed from: o.rr3$a */
    public static final class C16651a {

        /* renamed from: a */
        public String f43982a;

        /* renamed from: a */
        public final rr3 m47084a() {
            return new rr3(this, null);
        }

        /* renamed from: b */
        public final C16651a m47085b() {
            return this;
        }

        /* renamed from: c */
        public final String m47086c() {
            return this.f43982a;
        }

        /* renamed from: d */
        public final void m47087d(String str) {
            this.f43982a = str;
        }
    }

    /* renamed from: o.rr3$b */
    public static final class C16652b {
        public C16652b() {
        }

        public /* synthetic */ C16652b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ rr3(C16651a c16651a, id5 id5Var) {
        this(c16651a);
    }

    /* renamed from: a */
    public final String m47083a() {
        return this.f43981a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rr3.class == obj.getClass() && sq8.m48644c(this.f43981a, ((rr3) obj).f43981a);
    }

    public int hashCode() {
        String str = this.f43981a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = "ConfirmSignUpResponse(session=*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public rr3(C16651a c16651a) {
        this.f43981a = c16651a.m47086c();
    }
}
