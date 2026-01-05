package p001o;

/* loaded from: classes3.dex */
public final class y80 {

    /* renamed from: c */
    public static final C18351b f55042c = new C18351b(null);

    /* renamed from: a */
    public final Integer f55043a;

    /* renamed from: b */
    public final Integer f55044b;

    /* renamed from: o.y80$a */
    public static final class C18350a {

        /* renamed from: a */
        public Integer f55045a;

        /* renamed from: b */
        public Integer f55046b;

        /* renamed from: a */
        public final y80 m57353a() {
            return new y80(this, null);
        }

        /* renamed from: b */
        public final C18350a m57354b() {
            return this;
        }

        /* renamed from: c */
        public final Integer m57355c() {
            return this.f55045a;
        }

        /* renamed from: d */
        public final Integer m57356d() {
            return this.f55046b;
        }

        /* renamed from: e */
        public final void m57357e(Integer num) {
            this.f55045a = num;
        }

        /* renamed from: f */
        public final void m57358f(Integer num) {
            this.f55046b = num;
        }
    }

    /* renamed from: o.y80$b */
    public static final class C18351b {
        public C18351b() {
        }

        public /* synthetic */ C18351b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ y80(C18350a c18350a, id5 id5Var) {
        this(c18350a);
    }

    /* renamed from: a */
    public final Integer m57351a() {
        return this.f55043a;
    }

    /* renamed from: b */
    public final Integer m57352b() {
        return this.f55044b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y80.class != obj.getClass()) {
            return false;
        }
        y80 y80Var = (y80) obj;
        return sq8.m48644c(this.f55043a, y80Var.f55043a) && sq8.m48644c(this.f55044b, y80Var.f55044b);
    }

    public int hashCode() {
        Integer num = this.f55043a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.f55044b;
        return iIntValue + (num2 != null ? num2.intValue() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AgeRange(");
        sb.append("high=" + this.f55043a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("low=");
        sb2.append(this.f55044b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public y80(C18350a c18350a) {
        this.f55043a = c18350a.m57355c();
        this.f55044b = c18350a.m57356d();
    }
}
