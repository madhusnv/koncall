package p001o;

/* loaded from: classes3.dex */
public final class swf {

    /* renamed from: c */
    public static final C16928b f46038c = new C16928b(null);

    /* renamed from: a */
    public final boolean f46039a;

    /* renamed from: b */
    public final boolean f46040b;

    /* renamed from: o.swf$a */
    public static final class C16927a {

        /* renamed from: a */
        public boolean f46041a;

        /* renamed from: b */
        public boolean f46042b;

        /* renamed from: a */
        public final swf m49022a() {
            return new swf(this, null);
        }

        /* renamed from: b */
        public final boolean m49023b() {
            return this.f46041a;
        }

        /* renamed from: c */
        public final boolean m49024c() {
            return this.f46042b;
        }

        /* renamed from: d */
        public final void m49025d(boolean z) {
            this.f46041a = z;
        }

        /* renamed from: e */
        public final void m49026e(boolean z) {
            this.f46042b = z;
        }
    }

    /* renamed from: o.swf$b */
    public static final class C16928b {
        public C16928b() {
        }

        public /* synthetic */ C16928b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final swf m49027a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C16927a c16927a = new C16927a();
            xk7Var.invoke(c16927a);
            return c16927a.m49022a();
        }
    }

    public /* synthetic */ swf(C16927a c16927a, id5 id5Var) {
        this(c16927a);
    }

    /* renamed from: a */
    public final boolean m49020a() {
        return this.f46039a;
    }

    /* renamed from: b */
    public final boolean m49021b() {
        return this.f46040b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || swf.class != obj.getClass()) {
            return false;
        }
        swf swfVar = (swf) obj;
        return this.f46039a == swfVar.f46039a && this.f46040b == swfVar.f46040b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f46039a) * 31) + Boolean.hashCode(this.f46040b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SmsMfaSettingsType(");
        sb.append("enabled=" + this.f46039a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("preferredMfa=");
        sb2.append(this.f46040b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public swf(C16927a c16927a) {
        this.f46039a = c16927a.m49023b();
        this.f46040b = c16927a.m49024c();
    }
}
