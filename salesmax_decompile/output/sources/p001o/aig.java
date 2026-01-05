package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class aig {

    /* renamed from: j */
    public static final C12196b f14815j = new C12196b(null);

    /* renamed from: a */
    public final xf6 f14816a;

    /* renamed from: b */
    public final tg9 f14817b;

    /* renamed from: c */
    public final List f14818c;

    /* renamed from: d */
    public final jgc f14819d;

    /* renamed from: e */
    public final String f14820e;

    /* renamed from: f */
    public final List f14821f;

    /* renamed from: g */
    public final String f14822g;

    /* renamed from: h */
    public final yih f14823h;

    /* renamed from: i */
    public final l2j f14824i;

    /* renamed from: o.aig$a */
    public static final class C12195a {

        /* renamed from: a */
        public xf6 f14825a;

        /* renamed from: b */
        public tg9 f14826b;

        /* renamed from: c */
        public List f14827c;

        /* renamed from: d */
        public jgc f14828d;

        /* renamed from: e */
        public String f14829e;

        /* renamed from: f */
        public List f14830f;

        /* renamed from: g */
        public String f14831g;

        /* renamed from: h */
        public yih f14832h;

        /* renamed from: i */
        public l2j f14833i;

        /* renamed from: a */
        public final aig m17174a() {
            return new aig(this, null);
        }

        /* renamed from: b */
        public final xf6 m17175b() {
            return this.f14825a;
        }

        /* renamed from: c */
        public final tg9 m17176c() {
            return this.f14826b;
        }

        /* renamed from: d */
        public final List m17177d() {
            return this.f14827c;
        }

        /* renamed from: e */
        public final jgc m17178e() {
            return this.f14828d;
        }

        /* renamed from: f */
        public final String m17179f() {
            return this.f14829e;
        }

        /* renamed from: g */
        public final List m17180g() {
            return this.f14830f;
        }

        /* renamed from: h */
        public final String m17181h() {
            return this.f14831g;
        }

        /* renamed from: i */
        public final yih m17182i() {
            return this.f14832h;
        }

        /* renamed from: j */
        public final l2j m17183j() {
            return this.f14833i;
        }

        /* renamed from: k */
        public final void m17184k(tg9 tg9Var) {
            this.f14826b = tg9Var;
        }

        /* renamed from: l */
        public final void m17185l(jgc jgcVar) {
            this.f14828d = jgcVar;
        }

        /* renamed from: m */
        public final void m17186m(String str) {
            this.f14829e = str;
        }

        /* renamed from: n */
        public final void m17187n(String str) {
            this.f14831g = str;
        }

        /* renamed from: o */
        public final void m17188o(yih yihVar) {
            this.f14832h = yihVar;
        }

        /* renamed from: p */
        public final void m17189p(l2j l2jVar) {
            this.f14833i = l2jVar;
        }
    }

    /* renamed from: o.aig$b */
    public static final class C12196b {
        public C12196b() {
        }

        public /* synthetic */ C12196b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final aig m17190a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C12195a c12195a = new C12195a();
            xk7Var.invoke(c12195a);
            return c12195a.m17174a();
        }
    }

    public /* synthetic */ aig(C12195a c12195a, id5 id5Var) {
        this(c12195a);
    }

    /* renamed from: a */
    public final xf6 m17165a() {
        return this.f14816a;
    }

    /* renamed from: b */
    public final tg9 m17166b() {
        return this.f14817b;
    }

    /* renamed from: c */
    public final List m17167c() {
        return this.f14818c;
    }

    /* renamed from: d */
    public final jgc m17168d() {
        return this.f14819d;
    }

    /* renamed from: e */
    public final String m17169e() {
        return this.f14820e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aig.class != obj.getClass()) {
            return false;
        }
        aig aigVar = (aig) obj;
        return sq8.m48644c(this.f14816a, aigVar.f14816a) && sq8.m48644c(this.f14817b, aigVar.f14817b) && sq8.m48644c(this.f14818c, aigVar.f14818c) && sq8.m48644c(this.f14819d, aigVar.f14819d) && sq8.m48644c(this.f14820e, aigVar.f14820e) && sq8.m48644c(this.f14821f, aigVar.f14821f) && sq8.m48644c(this.f14822g, aigVar.f14822g) && sq8.m48644c(this.f14823h, aigVar.f14823h) && sq8.m48644c(this.f14824i, aigVar.f14824i);
    }

    /* renamed from: f */
    public final List m17170f() {
        return this.f14821f;
    }

    /* renamed from: g */
    public final String m17171g() {
        return this.f14822g;
    }

    /* renamed from: h */
    public final yih m17172h() {
        return this.f14823h;
    }

    public int hashCode() {
        xf6 xf6Var = this.f14816a;
        int iHashCode = (xf6Var != null ? xf6Var.hashCode() : 0) * 31;
        tg9 tg9Var = this.f14817b;
        int iHashCode2 = (iHashCode + (tg9Var != null ? tg9Var.hashCode() : 0)) * 31;
        List list = this.f14818c;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        jgc jgcVar = this.f14819d;
        int iHashCode4 = (iHashCode3 + (jgcVar != null ? jgcVar.hashCode() : 0)) * 31;
        String str = this.f14820e;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        List list2 = this.f14821f;
        int iHashCode6 = (iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.f14822g;
        int iHashCode7 = (iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        yih yihVar = this.f14823h;
        int iHashCode8 = (iHashCode7 + (yihVar != null ? yihVar.hashCode() : 0)) * 31;
        l2j l2jVar = this.f14824i;
        return iHashCode8 + (l2jVar != null ? l2jVar.hashCode() : 0);
    }

    /* renamed from: i */
    public final l2j m17173i() {
        return this.f14824i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SynthesizeSpeechRequest(");
        sb.append("engine=" + this.f14816a + ',');
        sb.append("languageCode=" + this.f14817b + ',');
        sb.append("lexiconNames=" + this.f14818c + ',');
        sb.append("outputFormat=" + this.f14819d + ',');
        sb.append("sampleRate=" + this.f14820e + ',');
        sb.append("speechMarkTypes=" + this.f14821f + ',');
        sb.append("text=" + this.f14822g + ',');
        sb.append("textType=" + this.f14823h + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voiceId=");
        sb2.append(this.f14824i);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public aig(C12195a c12195a) {
        this.f14816a = c12195a.m17175b();
        this.f14817b = c12195a.m17176c();
        this.f14818c = c12195a.m17177d();
        this.f14819d = c12195a.m17178e();
        this.f14820e = c12195a.m17179f();
        this.f14821f = c12195a.m17180g();
        this.f14822g = c12195a.m17181h();
        this.f14823h = c12195a.m17182i();
        this.f14824i = c12195a.m17183j();
    }
}
