package p001o;

/* loaded from: classes3.dex */
public final class vr7 {

    /* renamed from: b */
    public static final C17664b f50788b = new C17664b(null);

    /* renamed from: a */
    public final ze3 f50789a;

    /* renamed from: o.vr7$a */
    public static final class C17663a {

        /* renamed from: a */
        public ze3 f50790a;

        /* renamed from: a */
        public final vr7 m53336a() {
            return new vr7(this, null);
        }

        /* renamed from: b */
        public final C17663a m53337b() {
            return this;
        }

        /* renamed from: c */
        public final ze3 m53338c() {
            return this.f50790a;
        }

        /* renamed from: d */
        public final void m53339d(ze3 ze3Var) {
            this.f50790a = ze3Var;
        }
    }

    /* renamed from: o.vr7$b */
    public static final class C17664b {
        public C17664b() {
        }

        public /* synthetic */ C17664b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ vr7(C17663a c17663a, id5 id5Var) {
        this(c17663a);
    }

    /* renamed from: a */
    public final ze3 m53335a() {
        return this.f50789a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && vr7.class == obj.getClass() && sq8.m48644c(this.f50789a, ((vr7) obj).f50789a);
    }

    public int hashCode() {
        ze3 ze3Var = this.f50789a;
        if (ze3Var != null) {
            return ze3Var.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetUserAttributeVerificationCodeResponse(");
        sb.append("codeDeliveryDetails=" + this.f50789a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public vr7(C17663a c17663a) {
        this.f50789a = c17663a.m53338c();
    }
}
