package p001o;

/* loaded from: classes3.dex */
public final class y83 {

    /* renamed from: d */
    public static final C18353b f55047d = new C18353b(null);

    /* renamed from: a */
    public final Integer f55048a;

    /* renamed from: b */
    public final String f55049b;

    /* renamed from: c */
    public final Integer f55050c;

    /* renamed from: o.y83$a */
    public static final class C18352a {

        /* renamed from: a */
        public Integer f55051a;

        /* renamed from: b */
        public String f55052b;

        /* renamed from: c */
        public Integer f55053c;

        /* renamed from: a */
        public final y83 m57359a() {
            return new y83(this, null);
        }

        /* renamed from: b */
        public final C18352a m57360b() {
            return this;
        }

        /* renamed from: c */
        public final Integer m57361c() {
            return this.f55051a;
        }

        /* renamed from: d */
        public final String m57362d() {
            return this.f55052b;
        }

        /* renamed from: e */
        public final Integer m57363e() {
            return this.f55053c;
        }

        /* renamed from: f */
        public final void m57364f(Integer num) {
            this.f55051a = num;
        }

        /* renamed from: g */
        public final void m57365g(String str) {
            this.f55052b = str;
        }

        /* renamed from: h */
        public final void m57366h(Integer num) {
            this.f55053c = num;
        }
    }

    /* renamed from: o.y83$b */
    public static final class C18353b {
        public C18353b() {
        }

        public /* synthetic */ C18353b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ y83(C18352a c18352a, id5 id5Var) {
        this(c18352a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y83.class != obj.getClass()) {
            return false;
        }
        y83 y83Var = (y83) obj;
        return sq8.m48644c(this.f55048a, y83Var.f55048a) && sq8.m48644c(this.f55049b, y83Var.f55049b) && sq8.m48644c(this.f55050c, y83Var.f55050c);
    }

    public int hashCode() {
        Integer num = this.f55048a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        String str = this.f55049b;
        int iHashCode = (iIntValue + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.f55050c;
        return iHashCode + (num2 != null ? num2.intValue() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChildBlock(");
        sb.append("beginOffset=" + this.f55048a + ',');
        sb.append("childBlockId=" + this.f55049b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("endOffset=");
        sb2.append(this.f55050c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public y83(C18352a c18352a) {
        this.f55048a = c18352a.m57361c();
        this.f55049b = c18352a.m57362d();
        this.f55050c = c18352a.m57363e();
    }
}
