package p001o;

import java.util.List;

/* loaded from: classes2.dex */
public final class ho0 {

    /* renamed from: f */
    public static final C14016b f27228f = new C14016b(null);

    /* renamed from: a */
    public final String f27229a;

    /* renamed from: b */
    public final String f27230b;

    /* renamed from: c */
    public final String f27231c;

    /* renamed from: d */
    public final String f27232d;

    /* renamed from: e */
    public final String f27233e;

    /* renamed from: o.ho0$a */
    public static final class C14015a {

        /* renamed from: a */
        public String f27234a;

        /* renamed from: b */
        public String f27235b;

        /* renamed from: c */
        public String f27236c;

        /* renamed from: d */
        public String f27237d;

        /* renamed from: e */
        public String f27238e;

        /* renamed from: a */
        public final ho0 m30859a() {
            String str = this.f27234a;
            if (!(!(str == null || f9g.d0(str)))) {
                throw new IllegalArgumentException("ARN partition must not be null or blank".toString());
            }
            String str2 = this.f27235b;
            if (!(!(str2 == null || f9g.d0(str2)))) {
                throw new IllegalArgumentException("ARN service must not be null or blank".toString());
            }
            if (this.f27238e != null) {
                return new ho0(this);
            }
            throw new IllegalArgumentException("ARN resource must not be null".toString());
        }

        /* renamed from: b */
        public final String m30860b() {
            return this.f27237d;
        }

        /* renamed from: c */
        public final String m30861c() {
            return this.f27234a;
        }

        /* renamed from: d */
        public final String m30862d() {
            return this.f27236c;
        }

        /* renamed from: e */
        public final String m30863e() {
            return this.f27238e;
        }

        /* renamed from: f */
        public final String m30864f() {
            return this.f27235b;
        }

        /* renamed from: g */
        public final void m30865g(String str) {
            this.f27237d = str;
        }

        /* renamed from: h */
        public final void m30866h(String str) {
            this.f27234a = str;
        }

        /* renamed from: i */
        public final void m30867i(String str) {
            this.f27236c = str;
        }

        /* renamed from: j */
        public final void m30868j(String str) {
            this.f27238e = str;
        }

        /* renamed from: k */
        public final void m30869k(String str) {
            this.f27235b = str;
        }
    }

    /* renamed from: o.ho0$b */
    public static final class C14016b {
        public C14016b() {
        }

        public /* synthetic */ C14016b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ho0 m30870a(String str) {
            sq8.m48649h(str, "arn");
            List listC0 = f9g.C0(str, new char[]{':'}, false, 6, 2, null);
            if (!(listC0.size() == 6)) {
                throw new IllegalArgumentException(("Malformed ARN (" + str + ") does not have the expected number of components").toString());
            }
            if (!sq8.m48644c(listC0.get(0), "arn")) {
                throw new IllegalArgumentException("Malformed ARN - does not start with `arn:`".toString());
            }
            if (!(!f9g.d0((CharSequence) listC0.get(1)))) {
                throw new IllegalArgumentException("Malformed ARN - no AWS partition specified".toString());
            }
            if (!(!f9g.d0((CharSequence) listC0.get(2)))) {
                throw new IllegalArgumentException("Malformed ARN - no AWS service specified".toString());
            }
            C14016b c14016b = ho0.f27228f;
            C14015a c14015a = new C14015a();
            c14015a.m30866h((String) listC0.get(1));
            c14015a.m30869k((String) listC0.get(2));
            Object obj = listC0.get(3);
            if (!Boolean.valueOf(!f9g.d0((String) obj)).booleanValue()) {
                obj = null;
            }
            c14015a.m30867i((String) obj);
            Object obj2 = listC0.get(4);
            c14015a.m30865g((String) (Boolean.valueOf(true ^ f9g.d0((String) obj2)).booleanValue() ? obj2 : null));
            c14015a.m30868j((String) listC0.get(5));
            return c14015a.m30859a();
        }
    }

    public ho0(String str, String str2, String str3, String str4, String str5) {
        sq8.m48649h(str, "partition");
        sq8.m48649h(str2, "service");
        sq8.m48649h(str5, "resource");
        this.f27229a = str;
        this.f27230b = str2;
        this.f27231c = str3;
        this.f27232d = str4;
        this.f27233e = str5;
        if (!(str3 == null || (f9g.d0(str3) ^ true))) {
            throw new IllegalArgumentException("ARN region must not be blank".toString());
        }
        if (!(str4 == null || (f9g.d0(str4) ^ true))) {
            throw new IllegalArgumentException("ARN accountId must not be blank".toString());
        }
    }

    /* renamed from: a */
    public final String m30858a() {
        return this.f27232d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho0)) {
            return false;
        }
        ho0 ho0Var = (ho0) obj;
        if (sq8.m48644c(this.f27229a, ho0Var.f27229a) && sq8.m48644c(this.f27230b, ho0Var.f27230b) && sq8.m48644c(this.f27231c, ho0Var.f27231c) && sq8.m48644c(this.f27232d, ho0Var.f27232d)) {
            return sq8.m48644c(this.f27233e, ho0Var.f27233e);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((this.f27229a.hashCode() * 31) + this.f27230b.hashCode()) * 31;
        String str = this.f27231c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27232d;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f27233e.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("arn:" + this.f27229a + ':' + this.f27230b + ':');
        String str = this.f27231c;
        if (str != null) {
            sb.append(str);
        }
        sb.append(":");
        String str2 = this.f27232d;
        if (str2 != null) {
            sb.append(str2);
        }
        sb.append(':' + this.f27233e);
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ho0(C14015a c14015a) {
        sq8.m48649h(c14015a, "builder");
        String strM30861c = c14015a.m30861c();
        sq8.m48646e(strM30861c);
        String strM30864f = c14015a.m30864f();
        sq8.m48646e(strM30864f);
        String strM30862d = c14015a.m30862d();
        String strM30860b = c14015a.m30860b();
        String strM30863e = c14015a.m30863e();
        sq8.m48646e(strM30863e);
        this(strM30861c, strM30864f, strM30862d, strM30860b, strM30863e);
    }
}
