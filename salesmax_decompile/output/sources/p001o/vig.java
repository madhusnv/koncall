package p001o;

/* loaded from: classes2.dex */
public final class vig {

    /* renamed from: c */
    public static final C17600b f50419c = new C17600b(null);

    /* renamed from: a */
    public final String f50420a;

    /* renamed from: b */
    public final String f50421b;

    /* renamed from: o.vig$a */
    public static final class C17599a {

        /* renamed from: a */
        public String f50422a;

        /* renamed from: b */
        public String f50423b;

        /* renamed from: a */
        public final vig m52864a() {
            return new vig(this, null);
        }

        /* renamed from: b */
        public final String m52865b() {
            return this.f50422a;
        }

        /* renamed from: c */
        public final String m52866c() {
            return this.f50423b;
        }

        /* renamed from: d */
        public final void m52867d(String str) {
            this.f50422a = str;
        }

        /* renamed from: e */
        public final void m52868e(String str) {
            this.f50423b = str;
        }
    }

    /* renamed from: o.vig$b */
    public static final class C17600b {
        public C17600b() {
        }

        public /* synthetic */ C17600b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final vig m52869a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C17599a c17599a = new C17599a();
            xk7Var.invoke(c17599a);
            return c17599a.m52864a();
        }
    }

    public /* synthetic */ vig(C17599a c17599a, id5 id5Var) {
        this(c17599a);
    }

    /* renamed from: a */
    public final String m52862a() {
        return this.f50420a;
    }

    /* renamed from: b */
    public final String m52863b() {
        return this.f50421b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vig.class != obj.getClass()) {
            return false;
        }
        vig vigVar = (vig) obj;
        return sq8.m48644c(this.f50420a, vigVar.f50420a) && sq8.m48644c(this.f50421b, vigVar.f50421b);
    }

    public int hashCode() {
        return (this.f50420a.hashCode() * 31) + this.f50421b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tag(");
        sb.append("key=" + this.f50420a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("value=");
        sb2.append(this.f50421b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public vig(C17599a c17599a) {
        String strM52865b = c17599a.m52865b();
        if (strM52865b == null) {
            throw new IllegalArgumentException("A non-null value must be provided for key".toString());
        }
        this.f50420a = strM52865b;
        String strM52866c = c17599a.m52866c();
        if (strM52866c == null) {
            throw new IllegalArgumentException("A non-null value must be provided for value".toString());
        }
        this.f50421b = strM52866c;
    }
}
