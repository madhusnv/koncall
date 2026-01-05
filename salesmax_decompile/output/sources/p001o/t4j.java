package p001o;

import java.util.List;
import p001o.gk8;

/* loaded from: classes3.dex */
public final class t4j {

    /* renamed from: g */
    public static final C16991b f46373g = new C16991b(null);

    /* renamed from: a */
    public final String f46374a;

    /* renamed from: b */
    public final List f46375b;

    /* renamed from: c */
    public final gk8 f46376c;

    /* renamed from: d */
    public final String f46377d;

    /* renamed from: e */
    public final String f46378e;

    /* renamed from: f */
    public final String f46379f;

    /* renamed from: o.t4j$a */
    public static final class C16990a {

        /* renamed from: a */
        public String f46380a;

        /* renamed from: b */
        public List f46381b;

        /* renamed from: c */
        public gk8 f46382c;

        /* renamed from: d */
        public String f46383d;

        /* renamed from: e */
        public String f46384e;

        /* renamed from: f */
        public String f46385f;

        /* renamed from: a */
        public final t4j m49311a() {
            return new t4j(this, null);
        }

        /* renamed from: b */
        public final C16990a m49312b() {
            if (this.f46381b == null) {
                this.f46381b = ch3.m21246k();
            }
            if (this.f46382c == null) {
                this.f46382c = gk8.C13769a.m28957c(gk8.f25374b, 0L, 0, 2, null);
            }
            if (this.f46383d == null) {
                this.f46383d = "";
            }
            if (this.f46384e == null) {
                this.f46384e = "";
            }
            if (this.f46385f == null) {
                this.f46385f = "";
            }
            return this;
        }

        /* renamed from: c */
        public final String m49313c() {
            return this.f46380a;
        }

        /* renamed from: d */
        public final List m49314d() {
            return this.f46381b;
        }

        /* renamed from: e */
        public final gk8 m49315e() {
            return this.f46382c;
        }

        /* renamed from: f */
        public final String m49316f() {
            return this.f46383d;
        }

        /* renamed from: g */
        public final String m49317g() {
            return this.f46384e;
        }

        /* renamed from: h */
        public final String m49318h() {
            return this.f46385f;
        }

        /* renamed from: i */
        public final void m49319i(String str) {
            this.f46380a = str;
        }

        /* renamed from: j */
        public final void m49320j(List list) {
            this.f46381b = list;
        }

        /* renamed from: k */
        public final void m49321k(gk8 gk8Var) {
            this.f46382c = gk8Var;
        }

        /* renamed from: l */
        public final void m49322l(String str) {
            this.f46383d = str;
        }

        /* renamed from: m */
        public final void m49323m(String str) {
            this.f46384e = str;
        }

        /* renamed from: n */
        public final void m49324n(String str) {
            this.f46385f = str;
        }
    }

    /* renamed from: o.t4j$b */
    public static final class C16991b {
        public C16991b() {
        }

        public /* synthetic */ C16991b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ t4j(C16990a c16990a, id5 id5Var) {
        this(c16990a);
    }

    /* renamed from: a */
    public final gk8 m49307a() {
        return this.f46376c;
    }

    /* renamed from: b */
    public final String m49308b() {
        return this.f46377d;
    }

    /* renamed from: c */
    public final String m49309c() {
        return this.f46378e;
    }

    /* renamed from: d */
    public final String m49310d() {
        return this.f46379f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t4j.class != obj.getClass()) {
            return false;
        }
        t4j t4jVar = (t4j) obj;
        return sq8.m48644c(this.f46374a, t4jVar.f46374a) && sq8.m48644c(this.f46375b, t4jVar.f46375b) && sq8.m48644c(this.f46376c, t4jVar.f46376c) && sq8.m48644c(this.f46377d, t4jVar.f46377d) && sq8.m48644c(this.f46378e, t4jVar.f46378e) && sq8.m48644c(this.f46379f, t4jVar.f46379f);
    }

    public int hashCode() {
        String str = this.f46374a;
        return ((((((((((str != null ? str.hashCode() : 0) * 31) + this.f46375b.hashCode()) * 31) + this.f46376c.hashCode()) * 31) + this.f46377d.hashCode()) * 31) + this.f46378e.hashCode()) * 31) + this.f46379f.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WebAuthnCredentialDescription(");
        sb.append("authenticatorAttachment=" + this.f46374a + ',');
        sb.append("authenticatorTransports=" + this.f46375b + ',');
        sb.append("createdAt=" + this.f46376c + ',');
        sb.append("credentialId=" + this.f46377d + ',');
        sb.append("friendlyCredentialName=" + this.f46378e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("relyingPartyId=");
        sb2.append(this.f46379f);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public t4j(C16990a c16990a) {
        this.f46374a = c16990a.m49313c();
        List listM49314d = c16990a.m49314d();
        if (listM49314d == null) {
            throw new IllegalArgumentException("A non-null value must be provided for authenticatorTransports".toString());
        }
        this.f46375b = listM49314d;
        gk8 gk8VarM49315e = c16990a.m49315e();
        if (gk8VarM49315e == null) {
            throw new IllegalArgumentException("A non-null value must be provided for createdAt".toString());
        }
        this.f46376c = gk8VarM49315e;
        String strM49316f = c16990a.m49316f();
        if (strM49316f == null) {
            throw new IllegalArgumentException("A non-null value must be provided for credentialId".toString());
        }
        this.f46377d = strM49316f;
        String strM49317g = c16990a.m49317g();
        if (strM49317g == null) {
            throw new IllegalArgumentException("A non-null value must be provided for friendlyCredentialName".toString());
        }
        this.f46378e = strM49317g;
        String strM49318h = c16990a.m49318h();
        if (strM49318h == null) {
            throw new IllegalArgumentException("A non-null value must be provided for relyingPartyId".toString());
        }
        this.f46379f = strM49318h;
    }
}
