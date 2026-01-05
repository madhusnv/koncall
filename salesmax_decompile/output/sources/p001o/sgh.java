package p001o;

/* loaded from: classes3.dex */
public final class sgh {

    /* renamed from: g */
    public static final C16843b f45402g = new C16843b(null);

    /* renamed from: a */
    public final Float f45403a;

    /* renamed from: b */
    public final String f45404b;

    /* renamed from: c */
    public final ho7 f45405c;

    /* renamed from: d */
    public final Integer f45406d;

    /* renamed from: e */
    public final Integer f45407e;

    /* renamed from: f */
    public final ajh f45408f;

    /* renamed from: o.sgh$a */
    public static final class C16842a {

        /* renamed from: a */
        public Float f45409a;

        /* renamed from: b */
        public String f45410b;

        /* renamed from: c */
        public ho7 f45411c;

        /* renamed from: d */
        public Integer f45412d;

        /* renamed from: e */
        public Integer f45413e;

        /* renamed from: f */
        public ajh f45414f;

        /* renamed from: a */
        public final sgh m48333a() {
            return new sgh(this, null);
        }

        /* renamed from: b */
        public final C16842a m48334b() {
            return this;
        }

        /* renamed from: c */
        public final Float m48335c() {
            return this.f45409a;
        }

        /* renamed from: d */
        public final String m48336d() {
            return this.f45410b;
        }

        /* renamed from: e */
        public final ho7 m48337e() {
            return this.f45411c;
        }

        /* renamed from: f */
        public final Integer m48338f() {
            return this.f45412d;
        }

        /* renamed from: g */
        public final Integer m48339g() {
            return this.f45413e;
        }

        /* renamed from: h */
        public final ajh m48340h() {
            return this.f45414f;
        }

        /* renamed from: i */
        public final void m48341i(Float f) {
            this.f45409a = f;
        }

        /* renamed from: j */
        public final void m48342j(String str) {
            this.f45410b = str;
        }

        /* renamed from: k */
        public final void m48343k(ho7 ho7Var) {
            this.f45411c = ho7Var;
        }

        /* renamed from: l */
        public final void m48344l(Integer num) {
            this.f45412d = num;
        }

        /* renamed from: m */
        public final void m48345m(Integer num) {
            this.f45413e = num;
        }

        /* renamed from: n */
        public final void m48346n(ajh ajhVar) {
            this.f45414f = ajhVar;
        }
    }

    /* renamed from: o.sgh$b */
    public static final class C16843b {
        public C16843b() {
        }

        public /* synthetic */ C16843b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ sgh(C16842a c16842a, id5 id5Var) {
        this(c16842a);
    }

    /* renamed from: a */
    public final Float m48329a() {
        return this.f45403a;
    }

    /* renamed from: b */
    public final String m48330b() {
        return this.f45404b;
    }

    /* renamed from: c */
    public final ho7 m48331c() {
        return this.f45405c;
    }

    /* renamed from: d */
    public final ajh m48332d() {
        return this.f45408f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sgh.class != obj.getClass()) {
            return false;
        }
        sgh sghVar = (sgh) obj;
        Float f = this.f45403a;
        return (f != null ? f.equals(sghVar.f45403a) : sghVar.f45403a == null) && sq8.m48644c(this.f45404b, sghVar.f45404b) && sq8.m48644c(this.f45405c, sghVar.f45405c) && sq8.m48644c(this.f45406d, sghVar.f45406d) && sq8.m48644c(this.f45407e, sghVar.f45407e) && sq8.m48644c(this.f45408f, sghVar.f45408f);
    }

    public int hashCode() {
        Float f = this.f45403a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        String str = this.f45404b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        ho7 ho7Var = this.f45405c;
        int iHashCode3 = (iHashCode2 + (ho7Var != null ? ho7Var.hashCode() : 0)) * 31;
        Integer num = this.f45406d;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.f45407e;
        int iIntValue2 = (iIntValue + (num2 != null ? num2.intValue() : 0)) * 31;
        ajh ajhVar = this.f45408f;
        return iIntValue2 + (ajhVar != null ? ajhVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextDetection(");
        sb.append("confidence=" + this.f45403a + ',');
        sb.append("detectedText=" + this.f45404b + ',');
        sb.append("geometry=" + this.f45405c + ',');
        sb.append("id=" + this.f45406d + ',');
        sb.append("parentId=" + this.f45407e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("type=");
        sb2.append(this.f45408f);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public sgh(C16842a c16842a) {
        this.f45403a = c16842a.m48335c();
        this.f45404b = c16842a.m48336d();
        this.f45405c = c16842a.m48337e();
        this.f45406d = c16842a.m48338f();
        this.f45407e = c16842a.m48339g();
        this.f45408f = c16842a.m48340h();
    }
}
