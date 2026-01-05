package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class e6c {

    /* renamed from: i */
    public static final C13118b f21047i = new C13118b(null);

    /* renamed from: a */
    public final List f21048a;

    /* renamed from: b */
    public final String f21049b;

    /* renamed from: c */
    public final String f21050c;

    /* renamed from: d */
    public final gk8 f21051d;

    /* renamed from: e */
    public final tgc f21052e;

    /* renamed from: f */
    public final lre f21053f;

    /* renamed from: g */
    public final Long f21054g;

    /* renamed from: h */
    public final p6c f21055h;

    /* renamed from: o.e6c$a */
    public static final class C13117a {

        /* renamed from: a */
        public List f21056a;

        /* renamed from: b */
        public String f21057b;

        /* renamed from: c */
        public String f21058c;

        /* renamed from: d */
        public gk8 f21059d;

        /* renamed from: e */
        public tgc f21060e;

        /* renamed from: f */
        public lre f21061f;

        /* renamed from: g */
        public Long f21062g;

        /* renamed from: h */
        public p6c f21063h;

        /* renamed from: a */
        public final e6c m24399a() {
            return new e6c(this, null);
        }

        /* renamed from: b */
        public final C13117a m24400b() {
            return this;
        }

        /* renamed from: c */
        public final List m24401c() {
            return this.f21056a;
        }

        /* renamed from: d */
        public final String m24402d() {
            return this.f21057b;
        }

        /* renamed from: e */
        public final String m24403e() {
            return this.f21058c;
        }

        /* renamed from: f */
        public final gk8 m24404f() {
            return this.f21059d;
        }

        /* renamed from: g */
        public final tgc m24405g() {
            return this.f21060e;
        }

        /* renamed from: h */
        public final lre m24406h() {
            return this.f21061f;
        }

        /* renamed from: i */
        public final Long m24407i() {
            return this.f21062g;
        }

        /* renamed from: j */
        public final p6c m24408j() {
            return this.f21063h;
        }

        /* renamed from: k */
        public final void m24409k(List list) {
            this.f21056a = list;
        }

        /* renamed from: l */
        public final void m24410l(String str) {
            this.f21057b = str;
        }

        /* renamed from: m */
        public final void m24411m(String str) {
            this.f21058c = str;
        }

        /* renamed from: n */
        public final void m24412n(gk8 gk8Var) {
            this.f21059d = gk8Var;
        }

        /* renamed from: o */
        public final void m24413o(tgc tgcVar) {
            this.f21060e = tgcVar;
        }

        /* renamed from: p */
        public final void m24414p(lre lreVar) {
            this.f21061f = lreVar;
        }

        /* renamed from: q */
        public final void m24415q(Long l) {
            this.f21062g = l;
        }

        /* renamed from: r */
        public final void m24416r(p6c p6cVar) {
            this.f21063h = p6cVar;
        }
    }

    /* renamed from: o.e6c$b */
    public static final class C13118b {
        public C13118b() {
        }

        public /* synthetic */ C13118b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ e6c(C13117a c13117a, id5 id5Var) {
        this(c13117a);
    }

    /* renamed from: a */
    public final String m24395a() {
        return this.f21049b;
    }

    /* renamed from: b */
    public final String m24396b() {
        return this.f21050c;
    }

    /* renamed from: c */
    public final gk8 m24397c() {
        return this.f21051d;
    }

    /* renamed from: d */
    public final Long m24398d() {
        return this.f21054g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e6c.class != obj.getClass()) {
            return false;
        }
        e6c e6cVar = (e6c) obj;
        return sq8.m48644c(this.f21048a, e6cVar.f21048a) && sq8.m48644c(this.f21049b, e6cVar.f21049b) && sq8.m48644c(this.f21050c, e6cVar.f21050c) && sq8.m48644c(this.f21051d, e6cVar.f21051d) && sq8.m48644c(this.f21052e, e6cVar.f21052e) && sq8.m48644c(this.f21053f, e6cVar.f21053f) && sq8.m48644c(this.f21054g, e6cVar.f21054g) && sq8.m48644c(this.f21055h, e6cVar.f21055h);
    }

    public int hashCode() {
        List list = this.f21048a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f21049b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21050c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        gk8 gk8Var = this.f21051d;
        int iHashCode4 = (iHashCode3 + (gk8Var != null ? gk8Var.hashCode() : 0)) * 31;
        tgc tgcVar = this.f21052e;
        int iHashCode5 = (iHashCode4 + (tgcVar != null ? tgcVar.hashCode() : 0)) * 31;
        lre lreVar = this.f21053f;
        int iHashCode6 = (iHashCode5 + (lreVar != null ? lreVar.hashCode() : 0)) * 31;
        Long l = this.f21054g;
        int iHashCode7 = (iHashCode6 + (l != null ? l.hashCode() : 0)) * 31;
        p6c p6cVar = this.f21055h;
        return iHashCode7 + (p6cVar != null ? p6cVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Object(");
        sb.append("checksumAlgorithm=" + this.f21048a + ',');
        sb.append("eTag=" + this.f21049b + ',');
        sb.append("key=" + this.f21050c + ',');
        sb.append("lastModified=" + this.f21051d + ',');
        sb.append("owner=" + this.f21052e + ',');
        sb.append("restoreStatus=" + this.f21053f + ',');
        sb.append("size=" + this.f21054g + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("storageClass=");
        sb2.append(this.f21055h);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public e6c(C13117a c13117a) {
        this.f21048a = c13117a.m24401c();
        this.f21049b = c13117a.m24402d();
        this.f21050c = c13117a.m24403e();
        this.f21051d = c13117a.m24404f();
        this.f21052e = c13117a.m24405g();
        this.f21053f = c13117a.m24406h();
        this.f21054g = c13117a.m24407i();
        this.f21055h = c13117a.m24408j();
    }
}
