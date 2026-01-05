package p001o;

/* loaded from: classes3.dex */
public final class hne {

    /* renamed from: b */
    public static final C14014b f27223b = new C14014b(null);

    /* renamed from: a */
    public final ze3 f27224a;

    /* renamed from: o.hne$a */
    public static final class C14013a {

        /* renamed from: a */
        public ze3 f27225a;

        /* renamed from: a */
        public final hne m30854a() {
            return new hne(this, null);
        }

        /* renamed from: b */
        public final C14013a m30855b() {
            return this;
        }

        /* renamed from: c */
        public final ze3 m30856c() {
            return this.f27225a;
        }

        /* renamed from: d */
        public final void m30857d(ze3 ze3Var) {
            this.f27225a = ze3Var;
        }
    }

    /* renamed from: o.hne$b */
    public static final class C14014b {
        public C14014b() {
        }

        public /* synthetic */ C14014b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ hne(C14013a c14013a, id5 id5Var) {
        this(c14013a);
    }

    /* renamed from: a */
    public final ze3 m30853a() {
        return this.f27224a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && hne.class == obj.getClass() && sq8.m48644c(this.f27224a, ((hne) obj).f27224a);
    }

    public int hashCode() {
        ze3 ze3Var = this.f27224a;
        if (ze3Var != null) {
            return ze3Var.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResendConfirmationCodeResponse(");
        sb.append("codeDeliveryDetails=" + this.f27224a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public hne(C14013a c14013a) {
        this.f27224a = c14013a.m30856c();
    }
}
