package p001o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class bp7 {

    /* renamed from: d */
    public static final C12470b f16661d = new C12470b(null);

    /* renamed from: a */
    public final String f16662a;

    /* renamed from: b */
    public final String f16663b;

    /* renamed from: c */
    public final Map f16664c;

    /* renamed from: o.bp7$a */
    public static final class C12469a {

        /* renamed from: a */
        public String f16665a;

        /* renamed from: b */
        public String f16666b;

        /* renamed from: c */
        public Map f16667c;

        /* renamed from: a */
        public final bp7 m19540a() {
            return new bp7(this, null);
        }

        /* renamed from: b */
        public final String m19541b() {
            return this.f16665a;
        }

        /* renamed from: c */
        public final String m19542c() {
            return this.f16666b;
        }

        /* renamed from: d */
        public final Map m19543d() {
            return this.f16667c;
        }

        /* renamed from: e */
        public final void m19544e(String str) {
            this.f16666b = str;
        }

        /* renamed from: f */
        public final void m19545f(Map map) {
            this.f16667c = map;
        }
    }

    /* renamed from: o.bp7$b */
    public static final class C12470b {
        public C12470b() {
        }

        public /* synthetic */ C12470b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final bp7 m19546a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C12469a c12469a = new C12469a();
            xk7Var.invoke(c12469a);
            return c12469a.m19540a();
        }
    }

    public /* synthetic */ bp7(C12469a c12469a, id5 id5Var) {
        this(c12469a);
    }

    /* renamed from: a */
    public final String m19537a() {
        return this.f16662a;
    }

    /* renamed from: b */
    public final String m19538b() {
        return this.f16663b;
    }

    /* renamed from: c */
    public final Map m19539c() {
        return this.f16664c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bp7.class != obj.getClass()) {
            return false;
        }
        bp7 bp7Var = (bp7) obj;
        return sq8.m48644c(this.f16662a, bp7Var.f16662a) && sq8.m48644c(this.f16663b, bp7Var.f16663b) && sq8.m48644c(this.f16664c, bp7Var.f16664c);
    }

    public int hashCode() {
        String str = this.f16662a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f16663b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map map = this.f16664c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetCredentialsForIdentityRequest(");
        sb.append("customRoleArn=" + this.f16662a + ',');
        sb.append("identityId=" + this.f16663b + ',');
        sb.append("logins=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public bp7(C12469a c12469a) {
        this.f16662a = c12469a.m19541b();
        this.f16663b = c12469a.m19542c();
        this.f16664c = c12469a.m19543d();
    }
}
