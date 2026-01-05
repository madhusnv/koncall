package p001o;

/* loaded from: classes3.dex */
public final class fr3 {

    /* renamed from: b */
    public static final C13535b f23962b = new C13535b(null);

    /* renamed from: a */
    public final boolean f23963a;

    /* renamed from: o.fr3$a */
    public static final class C13534a {

        /* renamed from: a */
        public boolean f23964a;

        /* renamed from: a */
        public final fr3 m27375a() {
            return new fr3(this, null);
        }

        /* renamed from: b */
        public final C13534a m27376b() {
            return this;
        }

        /* renamed from: c */
        public final boolean m27377c() {
            return this.f23964a;
        }

        /* renamed from: d */
        public final void m27378d(boolean z) {
            this.f23964a = z;
        }
    }

    /* renamed from: o.fr3$b */
    public static final class C13535b {
        public C13535b() {
        }

        public /* synthetic */ C13535b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ fr3(C13534a c13534a, id5 id5Var) {
        this(c13534a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && fr3.class == obj.getClass() && this.f23963a == ((fr3) obj).f23963a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f23963a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConfirmDeviceResponse(");
        sb.append("userConfirmationNecessary=" + this.f23963a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public fr3(C13534a c13534a) {
        this.f23963a = c13534a.m27377c();
    }
}
