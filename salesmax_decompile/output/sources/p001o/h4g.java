package p001o;

/* loaded from: classes3.dex */
public final class h4g {

    /* renamed from: b */
    public static final C13850b f26200b = new C13850b(null);

    /* renamed from: a */
    public final String f26201a;

    /* renamed from: o.h4g$a */
    public static final class C13849a {

        /* renamed from: a */
        public String f26202a;

        /* renamed from: a */
        public final h4g m29812a() {
            return new h4g(this, null);
        }

        /* renamed from: b */
        public final String m29813b() {
            return this.f26202a;
        }

        /* renamed from: c */
        public final void m29814c(String str) {
            this.f26202a = str;
        }
    }

    /* renamed from: o.h4g$b */
    public static final class C13850b {
        public C13850b() {
        }

        public /* synthetic */ C13850b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ h4g(C13849a c13849a, id5 id5Var) {
        this(c13849a);
    }

    /* renamed from: a */
    public final String m29811a() {
        return this.f26201a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && h4g.class == obj.getClass() && sq8.m48644c(this.f26201a, ((h4g) obj).f26201a);
    }

    public int hashCode() {
        String str = this.f26201a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = "StartWebAuthnRegistrationRequest(accessToken=*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public h4g(C13849a c13849a) {
        this.f26201a = c13849a.m29813b();
    }
}
