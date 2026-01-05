package p001o;

/* loaded from: classes3.dex */
public final class rq6 {

    /* renamed from: c */
    public static final C16649b f43949c = new C16649b(null);

    /* renamed from: a */
    public final Integer f43950a;

    /* renamed from: b */
    public final Integer f43951b;

    /* renamed from: o.rq6$a */
    public static final class C16648a {

        /* renamed from: a */
        public Integer f43952a;

        /* renamed from: b */
        public Integer f43953b;

        /* renamed from: a */
        public final rq6 m47067a() {
            return new rq6(this, null);
        }

        /* renamed from: b */
        public final C16648a m47068b() {
            return this;
        }

        /* renamed from: c */
        public final Integer m47069c() {
            return this.f43952a;
        }

        /* renamed from: d */
        public final Integer m47070d() {
            return this.f43953b;
        }

        /* renamed from: e */
        public final void m47071e(Integer num) {
            this.f43952a = num;
        }

        /* renamed from: f */
        public final void m47072f(Integer num) {
            this.f43953b = num;
        }
    }

    /* renamed from: o.rq6$b */
    public static final class C16649b {
        public C16649b() {
        }

        public /* synthetic */ C16649b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ rq6(C16648a c16648a, id5 id5Var) {
        this(c16648a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rq6.class != obj.getClass()) {
            return false;
        }
        rq6 rq6Var = (rq6) obj;
        return sq8.m48644c(this.f43950a, rq6Var.f43950a) && sq8.m48644c(this.f43951b, rq6Var.f43951b);
    }

    public int hashCode() {
        Integer num = this.f43950a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.f43951b;
        return iIntValue + (num2 != null ? num2.intValue() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtractedCharactersListItem(");
        sb.append("count=" + this.f43950a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("page=");
        sb2.append(this.f43951b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public rq6(C16648a c16648a) {
        this.f43950a = c16648a.m47069c();
        this.f43951b = c16648a.m47070d();
    }
}
