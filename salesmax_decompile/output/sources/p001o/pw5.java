package p001o;

/* loaded from: classes3.dex */
public final class pw5 {

    /* renamed from: c */
    public static final C16204b f40670c = new C16204b(null);

    /* renamed from: a */
    public final Integer f40671a;

    /* renamed from: b */
    public final ow5 f40672b;

    /* renamed from: o.pw5$a */
    public static final class C16203a {

        /* renamed from: a */
        public Integer f40673a;

        /* renamed from: b */
        public ow5 f40674b;

        /* renamed from: a */
        public final pw5 m44249a() {
            return new pw5(this, null);
        }

        /* renamed from: b */
        public final C16203a m44250b() {
            return this;
        }

        /* renamed from: c */
        public final Integer m44251c() {
            return this.f40673a;
        }

        /* renamed from: d */
        public final ow5 m44252d() {
            return this.f40674b;
        }

        /* renamed from: e */
        public final void m44253e(Integer num) {
            this.f40673a = num;
        }

        /* renamed from: f */
        public final void m44254f(ow5 ow5Var) {
            this.f40674b = ow5Var;
        }
    }

    /* renamed from: o.pw5$b */
    public static final class C16204b {
        public C16204b() {
        }

        public /* synthetic */ C16204b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ pw5(C16203a c16203a, id5 id5Var) {
        this(c16203a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pw5.class != obj.getClass()) {
            return false;
        }
        pw5 pw5Var = (pw5) obj;
        return sq8.m48644c(this.f40671a, pw5Var.f40671a) && sq8.m48644c(this.f40672b, pw5Var.f40672b);
    }

    public int hashCode() {
        Integer num = this.f40671a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        ow5 ow5Var = this.f40672b;
        return iIntValue + (ow5Var != null ? ow5Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DocumentTypeListItem(");
        sb.append("page=" + this.f40671a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("type=");
        sb2.append(this.f40672b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public pw5(C16203a c16203a) {
        this.f40671a = c16203a.m44251c();
        this.f40672b = c16203a.m44252d();
    }
}
