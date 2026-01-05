package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class lr5 {

    /* renamed from: f */
    public static final C15140b f34288f = new C15140b(null);

    /* renamed from: a */
    public final List f34289a;

    /* renamed from: b */
    public final gk8 f34290b;

    /* renamed from: c */
    public final String f34291c;

    /* renamed from: d */
    public final gk8 f34292d;

    /* renamed from: e */
    public final gk8 f34293e;

    /* renamed from: o.lr5$a */
    public static final class C15139a {

        /* renamed from: a */
        public List f34294a;

        /* renamed from: b */
        public gk8 f34295b;

        /* renamed from: c */
        public String f34296c;

        /* renamed from: d */
        public gk8 f34297d;

        /* renamed from: e */
        public gk8 f34298e;

        /* renamed from: a */
        public final lr5 m37805a() {
            return new lr5(this, null);
        }

        /* renamed from: b */
        public final C15139a m37806b() {
            return this;
        }

        /* renamed from: c */
        public final List m37807c() {
            return this.f34294a;
        }

        /* renamed from: d */
        public final gk8 m37808d() {
            return this.f34295b;
        }

        /* renamed from: e */
        public final String m37809e() {
            return this.f34296c;
        }

        /* renamed from: f */
        public final gk8 m37810f() {
            return this.f34297d;
        }

        /* renamed from: g */
        public final gk8 m37811g() {
            return this.f34298e;
        }

        /* renamed from: h */
        public final void m37812h(List list) {
            this.f34294a = list;
        }

        /* renamed from: i */
        public final void m37813i(gk8 gk8Var) {
            this.f34295b = gk8Var;
        }

        /* renamed from: j */
        public final void m37814j(String str) {
            this.f34296c = str;
        }

        /* renamed from: k */
        public final void m37815k(gk8 gk8Var) {
            this.f34297d = gk8Var;
        }

        /* renamed from: l */
        public final void m37816l(gk8 gk8Var) {
            this.f34298e = gk8Var;
        }
    }

    /* renamed from: o.lr5$b */
    public static final class C15140b {
        public C15140b() {
        }

        public /* synthetic */ C15140b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ lr5(C15139a c15139a, id5 id5Var) {
        this(c15139a);
    }

    /* renamed from: a */
    public final List m37803a() {
        return this.f34289a;
    }

    /* renamed from: b */
    public final String m37804b() {
        return this.f34291c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lr5.class != obj.getClass()) {
            return false;
        }
        lr5 lr5Var = (lr5) obj;
        return sq8.m48644c(this.f34289a, lr5Var.f34289a) && sq8.m48644c(this.f34290b, lr5Var.f34290b) && sq8.m48644c(this.f34291c, lr5Var.f34291c) && sq8.m48644c(this.f34292d, lr5Var.f34292d) && sq8.m48644c(this.f34293e, lr5Var.f34293e);
    }

    public int hashCode() {
        List list = this.f34289a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        gk8 gk8Var = this.f34290b;
        int iHashCode2 = (iHashCode + (gk8Var != null ? gk8Var.hashCode() : 0)) * 31;
        String str = this.f34291c;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        gk8 gk8Var2 = this.f34292d;
        int iHashCode4 = (iHashCode3 + (gk8Var2 != null ? gk8Var2.hashCode() : 0)) * 31;
        gk8 gk8Var3 = this.f34293e;
        return iHashCode4 + (gk8Var3 != null ? gk8Var3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceType(");
        sb.append("deviceAttributes=" + this.f34289a + ',');
        sb.append("deviceCreateDate=" + this.f34290b + ',');
        sb.append("deviceKey=" + this.f34291c + ',');
        sb.append("deviceLastAuthenticatedDate=" + this.f34292d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deviceLastModifiedDate=");
        sb2.append(this.f34293e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public lr5(C15139a c15139a) {
        this.f34289a = c15139a.m37807c();
        this.f34290b = c15139a.m37808d();
        this.f34291c = c15139a.m37809e();
        this.f34292d = c15139a.m37810f();
        this.f34293e = c15139a.m37811g();
    }
}
