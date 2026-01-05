package p001o;

/* loaded from: classes3.dex */
public final class phg {

    /* renamed from: f */
    public static final C16118b f40111f = new C16118b(null);

    /* renamed from: a */
    public final Integer f40112a;

    /* renamed from: b */
    public final Integer f40113b;

    /* renamed from: c */
    public final ryc f40114c;

    /* renamed from: d */
    public final String f40115d;

    /* renamed from: e */
    public final Integer f40116e;

    /* renamed from: o.phg$a */
    public static final class C16117a {

        /* renamed from: a */
        public Integer f40117a;

        /* renamed from: b */
        public Integer f40118b;

        /* renamed from: c */
        public ryc f40119c;

        /* renamed from: d */
        public String f40120d;

        /* renamed from: e */
        public Integer f40121e;

        /* renamed from: a */
        public final phg m43705a() {
            return new phg(this, null);
        }

        /* renamed from: b */
        public final C16117a m43706b() {
            return this;
        }

        /* renamed from: c */
        public final Integer m43707c() {
            return this.f40117a;
        }

        /* renamed from: d */
        public final Integer m43708d() {
            return this.f40118b;
        }

        /* renamed from: e */
        public final ryc m43709e() {
            return this.f40119c;
        }

        /* renamed from: f */
        public final String m43710f() {
            return this.f40120d;
        }

        /* renamed from: g */
        public final Integer m43711g() {
            return this.f40121e;
        }

        /* renamed from: h */
        public final void m43712h(Integer num) {
            this.f40117a = num;
        }

        /* renamed from: i */
        public final void m43713i(Integer num) {
            this.f40118b = num;
        }

        /* renamed from: j */
        public final void m43714j(ryc rycVar) {
            this.f40119c = rycVar;
        }

        /* renamed from: k */
        public final void m43715k(String str) {
            this.f40120d = str;
        }

        /* renamed from: l */
        public final void m43716l(Integer num) {
            this.f40121e = num;
        }
    }

    /* renamed from: o.phg$b */
    public static final class C16118b {
        public C16118b() {
        }

        public /* synthetic */ C16118b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ phg(C16117a c16117a, id5 id5Var) {
        this(c16117a);
    }

    /* renamed from: a */
    public final Integer m43701a() {
        return this.f40112a;
    }

    /* renamed from: b */
    public final ryc m43702b() {
        return this.f40114c;
    }

    /* renamed from: c */
    public final String m43703c() {
        return this.f40115d;
    }

    /* renamed from: d */
    public final Integer m43704d() {
        return this.f40116e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || phg.class != obj.getClass()) {
            return false;
        }
        phg phgVar = (phg) obj;
        return sq8.m48644c(this.f40112a, phgVar.f40112a) && sq8.m48644c(this.f40113b, phgVar.f40113b) && sq8.m48644c(this.f40114c, phgVar.f40114c) && sq8.m48644c(this.f40115d, phgVar.f40115d) && sq8.m48644c(this.f40116e, phgVar.f40116e);
    }

    public int hashCode() {
        Integer num = this.f40112a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.f40113b;
        int iIntValue2 = (iIntValue + (num2 != null ? num2.intValue() : 0)) * 31;
        ryc rycVar = this.f40114c;
        int iHashCode = (iIntValue2 + (rycVar != null ? rycVar.hashCode() : 0)) * 31;
        String str = this.f40115d;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num3 = this.f40116e;
        return iHashCode2 + (num3 != null ? num3.intValue() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SyntaxToken(");
        sb.append("beginOffset=" + this.f40112a + ',');
        sb.append("endOffset=" + this.f40113b + ',');
        sb.append("partOfSpeech=" + this.f40114c + ',');
        sb.append("text=" + this.f40115d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("tokenId=");
        sb2.append(this.f40116e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public phg(C16117a c16117a) {
        this.f40112a = c16117a.m43707c();
        this.f40113b = c16117a.m43708d();
        this.f40114c = c16117a.m43709e();
        this.f40115d = c16117a.m43710f();
        this.f40116e = c16117a.m43711g();
    }
}
