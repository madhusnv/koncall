package p001o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class iq7 {

    /* renamed from: d */
    public static final C14347b f29082d = new C14347b(null);

    /* renamed from: a */
    public final String f29083a;

    /* renamed from: b */
    public final String f29084b;

    /* renamed from: c */
    public final Map f29085c;

    /* renamed from: o.iq7$a */
    public static final class C14346a {

        /* renamed from: a */
        public String f29086a;

        /* renamed from: b */
        public String f29087b;

        /* renamed from: c */
        public Map f29088c;

        /* renamed from: a */
        public final iq7 m32549a() {
            return new iq7(this, null);
        }

        /* renamed from: b */
        public final String m32550b() {
            return this.f29086a;
        }

        /* renamed from: c */
        public final String m32551c() {
            return this.f29087b;
        }

        /* renamed from: d */
        public final Map m32552d() {
            return this.f29088c;
        }

        /* renamed from: e */
        public final void m32553e(String str) {
            this.f29087b = str;
        }

        /* renamed from: f */
        public final void m32554f(Map map) {
            this.f29088c = map;
        }
    }

    /* renamed from: o.iq7$b */
    public static final class C14347b {
        public C14347b() {
        }

        public /* synthetic */ C14347b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final iq7 m32555a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C14346a c14346a = new C14346a();
            xk7Var.invoke(c14346a);
            return c14346a.m32549a();
        }
    }

    public /* synthetic */ iq7(C14346a c14346a, id5 id5Var) {
        this(c14346a);
    }

    /* renamed from: a */
    public final String m32546a() {
        return this.f29083a;
    }

    /* renamed from: b */
    public final String m32547b() {
        return this.f29084b;
    }

    /* renamed from: c */
    public final Map m32548c() {
        return this.f29085c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iq7.class != obj.getClass()) {
            return false;
        }
        iq7 iq7Var = (iq7) obj;
        return sq8.m48644c(this.f29083a, iq7Var.f29083a) && sq8.m48644c(this.f29084b, iq7Var.f29084b) && sq8.m48644c(this.f29085c, iq7Var.f29085c);
    }

    public int hashCode() {
        String str = this.f29083a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f29084b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map map = this.f29085c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetIdRequest(");
        sb.append("accountId=" + this.f29083a + ',');
        sb.append("identityPoolId=" + this.f29084b + ',');
        sb.append("logins=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public iq7(C14346a c14346a) {
        this.f29083a = c14346a.m32550b();
        this.f29084b = c14346a.m32551c();
        this.f29085c = c14346a.m32552d();
    }
}
