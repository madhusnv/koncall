package p001o;

/* loaded from: classes3.dex */
public final class ft8 {

    /* renamed from: b */
    public static final C13553b f24059b = new C13553b(null);

    /* renamed from: a */
    public final ht8 f24060a;

    /* renamed from: o.ft8$a */
    public static final class C13552a {

        /* renamed from: a */
        public ht8 f24061a;

        /* renamed from: a */
        public final ft8 m27466a() {
            return new ft8(this, null);
        }

        /* renamed from: b */
        public final C13552a m27467b() {
            return this;
        }

        /* renamed from: c */
        public final ht8 m27468c() {
            return this.f24061a;
        }

        /* renamed from: d */
        public final void m27469d(ht8 ht8Var) {
            this.f24061a = ht8Var;
        }
    }

    /* renamed from: o.ft8$b */
    public static final class C13553b {
        public C13553b() {
        }

        public /* synthetic */ C13553b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ft8(C13552a c13552a, id5 id5Var) {
        this(c13552a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ft8.class == obj.getClass() && sq8.m48644c(this.f24060a, ((ft8) obj).f24060a);
    }

    public int hashCode() {
        ht8 ht8Var = this.f24060a;
        if (ht8Var != null) {
            return ht8Var.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidRequestDetail(");
        sb.append("reason=" + this.f24060a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ft8(C13552a c13552a) {
        this.f24060a = c13552a.m27468c();
    }
}
