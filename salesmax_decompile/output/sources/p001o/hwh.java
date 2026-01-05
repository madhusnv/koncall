package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class hwh {

    /* renamed from: f */
    public static final C14112b f27710f = new C14112b(null);

    /* renamed from: a */
    public final jwh f27711a;

    /* renamed from: b */
    public final List f27712b;

    /* renamed from: c */
    public final String f27713c;

    /* renamed from: d */
    public final String f27714d;

    /* renamed from: e */
    public final String f27715e;

    /* renamed from: o.hwh$a */
    public static final class C14111a {

        /* renamed from: a */
        public jwh f27716a;

        /* renamed from: b */
        public List f27717b;

        /* renamed from: c */
        public String f27718c;

        /* renamed from: d */
        public String f27719d;

        /* renamed from: e */
        public String f27720e;

        /* renamed from: a */
        public final hwh m31239a() {
            return new hwh(this, null);
        }

        /* renamed from: b */
        public final C14111a m31240b() {
            if (this.f27718c == null) {
                this.f27718c = "";
            }
            if (this.f27719d == null) {
                this.f27719d = "";
            }
            if (this.f27720e == null) {
                this.f27720e = "";
            }
            return this;
        }

        /* renamed from: c */
        public final jwh m31241c() {
            return this.f27716a;
        }

        /* renamed from: d */
        public final List m31242d() {
            return this.f27717b;
        }

        /* renamed from: e */
        public final String m31243e() {
            return this.f27718c;
        }

        /* renamed from: f */
        public final String m31244f() {
            return this.f27719d;
        }

        /* renamed from: g */
        public final String m31245g() {
            return this.f27720e;
        }

        /* renamed from: h */
        public final void m31246h(jwh jwhVar) {
            this.f27716a = jwhVar;
        }

        /* renamed from: i */
        public final void m31247i(List list) {
            this.f27717b = list;
        }

        /* renamed from: j */
        public final void m31248j(String str) {
            this.f27718c = str;
        }

        /* renamed from: k */
        public final void m31249k(String str) {
            this.f27719d = str;
        }

        /* renamed from: l */
        public final void m31250l(String str) {
            this.f27720e = str;
        }
    }

    /* renamed from: o.hwh$b */
    public static final class C14112b {
        public C14112b() {
        }

        public /* synthetic */ C14112b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ hwh(C14111a c14111a, id5 id5Var) {
        this(c14111a);
    }

    /* renamed from: a */
    public final String m31237a() {
        return this.f27714d;
    }

    /* renamed from: b */
    public final String m31238b() {
        return this.f27715e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hwh.class != obj.getClass()) {
            return false;
        }
        hwh hwhVar = (hwh) obj;
        return sq8.m48644c(this.f27711a, hwhVar.f27711a) && sq8.m48644c(this.f27712b, hwhVar.f27712b) && sq8.m48644c(this.f27713c, hwhVar.f27713c) && sq8.m48644c(this.f27714d, hwhVar.f27714d) && sq8.m48644c(this.f27715e, hwhVar.f27715e);
    }

    public int hashCode() {
        jwh jwhVar = this.f27711a;
        int iHashCode = (jwhVar != null ? jwhVar.hashCode() : 0) * 31;
        List list = this.f27712b;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f27713c.hashCode()) * 31) + this.f27714d.hashCode()) * 31) + this.f27715e.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TranslateTextResponse(");
        sb.append("appliedSettings=" + this.f27711a + ',');
        sb.append("appliedTerminologies=" + this.f27712b + ',');
        sb.append("sourceLanguageCode=" + this.f27713c + ',');
        sb.append("targetLanguageCode=" + this.f27714d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("translatedText=");
        sb2.append(this.f27715e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public hwh(C14111a c14111a) {
        this.f27711a = c14111a.m31241c();
        this.f27712b = c14111a.m31242d();
        String strM31243e = c14111a.m31243e();
        if (strM31243e == null) {
            throw new IllegalArgumentException("A non-null value must be provided for sourceLanguageCode".toString());
        }
        this.f27713c = strM31243e;
        String strM31244f = c14111a.m31244f();
        if (strM31244f == null) {
            throw new IllegalArgumentException("A non-null value must be provided for targetLanguageCode".toString());
        }
        this.f27714d = strM31244f;
        String strM31245g = c14111a.m31245g();
        if (strM31245g == null) {
            throw new IllegalArgumentException("A non-null value must be provided for translatedText".toString());
        }
        this.f27715e = strM31245g;
    }
}
