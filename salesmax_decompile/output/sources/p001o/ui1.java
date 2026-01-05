package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class ui1 {

    /* renamed from: g */
    public static final C17383b f48953g = new C17383b(null);

    /* renamed from: a */
    public final cj1 f48954a;

    /* renamed from: b */
    public final go7 f48955b;

    /* renamed from: c */
    public final String f48956c;

    /* renamed from: d */
    public final Integer f48957d;

    /* renamed from: e */
    public final List f48958e;

    /* renamed from: f */
    public final String f48959f;

    /* renamed from: o.ui1$a */
    public static final class C17382a {

        /* renamed from: a */
        public cj1 f48960a;

        /* renamed from: b */
        public go7 f48961b;

        /* renamed from: c */
        public String f48962c;

        /* renamed from: d */
        public Integer f48963d;

        /* renamed from: e */
        public List f48964e;

        /* renamed from: f */
        public String f48965f;

        /* renamed from: a */
        public final ui1 m51602a() {
            return new ui1(this, null);
        }

        /* renamed from: b */
        public final C17382a m51603b() {
            return this;
        }

        /* renamed from: c */
        public final cj1 m51604c() {
            return this.f48960a;
        }

        /* renamed from: d */
        public final go7 m51605d() {
            return this.f48961b;
        }

        /* renamed from: e */
        public final String m51606e() {
            return this.f48962c;
        }

        /* renamed from: f */
        public final Integer m51607f() {
            return this.f48963d;
        }

        /* renamed from: g */
        public final List m51608g() {
            return this.f48964e;
        }

        /* renamed from: h */
        public final String m51609h() {
            return this.f48965f;
        }

        /* renamed from: i */
        public final void m51610i(cj1 cj1Var) {
            this.f48960a = cj1Var;
        }

        /* renamed from: j */
        public final void m51611j(go7 go7Var) {
            this.f48961b = go7Var;
        }

        /* renamed from: k */
        public final void m51612k(String str) {
            this.f48962c = str;
        }

        /* renamed from: l */
        public final void m51613l(Integer num) {
            this.f48963d = num;
        }

        /* renamed from: m */
        public final void m51614m(List list) {
            this.f48964e = list;
        }

        /* renamed from: n */
        public final void m51615n(String str) {
            this.f48965f = str;
        }
    }

    /* renamed from: o.ui1$b */
    public static final class C17383b {
        public C17383b() {
        }

        public /* synthetic */ C17383b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ui1(C17382a c17382a, id5 id5Var) {
        this(c17382a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ui1.class != obj.getClass()) {
            return false;
        }
        ui1 ui1Var = (ui1) obj;
        return sq8.m48644c(this.f48954a, ui1Var.f48954a) && sq8.m48644c(this.f48955b, ui1Var.f48955b) && sq8.m48644c(this.f48956c, ui1Var.f48956c) && sq8.m48644c(this.f48957d, ui1Var.f48957d) && sq8.m48644c(this.f48958e, ui1Var.f48958e) && sq8.m48644c(this.f48959f, ui1Var.f48959f);
    }

    public int hashCode() {
        cj1 cj1Var = this.f48954a;
        int iHashCode = (cj1Var != null ? cj1Var.hashCode() : 0) * 31;
        go7 go7Var = this.f48955b;
        int iHashCode2 = (iHashCode + (go7Var != null ? go7Var.hashCode() : 0)) * 31;
        String str = this.f48956c;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f48957d;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 31;
        List list = this.f48958e;
        int iHashCode4 = (iIntValue + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f48959f;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Block(");
        sb.append("blockType=" + this.f48954a + ',');
        sb.append("geometry=" + this.f48955b + ',');
        sb.append("id=" + this.f48956c + ',');
        sb.append("page=" + this.f48957d + ',');
        sb.append("relationships=" + this.f48958e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("text=");
        sb2.append(this.f48959f);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ui1(C17382a c17382a) {
        this.f48954a = c17382a.m51604c();
        this.f48955b = c17382a.m51605d();
        this.f48956c = c17382a.m51606e();
        this.f48957d = c17382a.m51607f();
        this.f48958e = c17382a.m51608g();
        this.f48959f = c17382a.m51609h();
    }
}
