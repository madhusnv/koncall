package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class j2j {

    /* renamed from: h */
    public static final C14441b f29647h = new C14441b(null);

    /* renamed from: a */
    public final List f29648a;

    /* renamed from: b */
    public final on7 f29649b;

    /* renamed from: c */
    public final l2j f29650c;

    /* renamed from: d */
    public final tg9 f29651d;

    /* renamed from: e */
    public final String f29652e;

    /* renamed from: f */
    public final String f29653f;

    /* renamed from: g */
    public final List f29654g;

    /* renamed from: o.j2j$a */
    public static final class C14440a {

        /* renamed from: a */
        public List f29655a;

        /* renamed from: b */
        public on7 f29656b;

        /* renamed from: c */
        public l2j f29657c;

        /* renamed from: d */
        public tg9 f29658d;

        /* renamed from: e */
        public String f29659e;

        /* renamed from: f */
        public String f29660f;

        /* renamed from: g */
        public List f29661g;

        /* renamed from: a */
        public final j2j m33151a() {
            return new j2j(this, null);
        }

        /* renamed from: b */
        public final C14440a m33152b() {
            return this;
        }

        /* renamed from: c */
        public final List m33153c() {
            return this.f29655a;
        }

        /* renamed from: d */
        public final on7 m33154d() {
            return this.f29656b;
        }

        /* renamed from: e */
        public final l2j m33155e() {
            return this.f29657c;
        }

        /* renamed from: f */
        public final tg9 m33156f() {
            return this.f29658d;
        }

        /* renamed from: g */
        public final String m33157g() {
            return this.f29659e;
        }

        /* renamed from: h */
        public final String m33158h() {
            return this.f29660f;
        }

        /* renamed from: i */
        public final List m33159i() {
            return this.f29661g;
        }

        /* renamed from: j */
        public final void m33160j(List list) {
            this.f29655a = list;
        }

        /* renamed from: k */
        public final void m33161k(on7 on7Var) {
            this.f29656b = on7Var;
        }

        /* renamed from: l */
        public final void m33162l(l2j l2jVar) {
            this.f29657c = l2jVar;
        }

        /* renamed from: m */
        public final void m33163m(tg9 tg9Var) {
            this.f29658d = tg9Var;
        }

        /* renamed from: n */
        public final void m33164n(String str) {
            this.f29659e = str;
        }

        /* renamed from: o */
        public final void m33165o(String str) {
            this.f29660f = str;
        }

        /* renamed from: p */
        public final void m33166p(List list) {
            this.f29661g = list;
        }
    }

    /* renamed from: o.j2j$b */
    public static final class C14441b {
        public C14441b() {
        }

        public /* synthetic */ C14441b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ j2j(C14440a c14440a, id5 id5Var) {
        this(c14440a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j2j.class != obj.getClass()) {
            return false;
        }
        j2j j2jVar = (j2j) obj;
        return sq8.m48644c(this.f29648a, j2jVar.f29648a) && sq8.m48644c(this.f29649b, j2jVar.f29649b) && sq8.m48644c(this.f29650c, j2jVar.f29650c) && sq8.m48644c(this.f29651d, j2jVar.f29651d) && sq8.m48644c(this.f29652e, j2jVar.f29652e) && sq8.m48644c(this.f29653f, j2jVar.f29653f) && sq8.m48644c(this.f29654g, j2jVar.f29654g);
    }

    public int hashCode() {
        List list = this.f29648a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        on7 on7Var = this.f29649b;
        int iHashCode2 = (iHashCode + (on7Var != null ? on7Var.hashCode() : 0)) * 31;
        l2j l2jVar = this.f29650c;
        int iHashCode3 = (iHashCode2 + (l2jVar != null ? l2jVar.hashCode() : 0)) * 31;
        tg9 tg9Var = this.f29651d;
        int iHashCode4 = (iHashCode3 + (tg9Var != null ? tg9Var.hashCode() : 0)) * 31;
        String str = this.f29652e;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29653f;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list2 = this.f29654g;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Voice(");
        sb.append("additionalLanguageCodes=" + this.f29648a + ',');
        sb.append("gender=" + this.f29649b + ',');
        sb.append("id=" + this.f29650c + ',');
        sb.append("languageCode=" + this.f29651d + ',');
        sb.append("languageName=" + this.f29652e + ',');
        sb.append("name=" + this.f29653f + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("supportedEngines=");
        sb2.append(this.f29654g);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public j2j(C14440a c14440a) {
        this.f29648a = c14440a.m33153c();
        this.f29649b = c14440a.m33154d();
        this.f29650c = c14440a.m33155e();
        this.f29651d = c14440a.m33156f();
        this.f29652e = c14440a.m33157g();
        this.f29653f = c14440a.m33158h();
        this.f29654g = c14440a.m33159i();
    }
}
