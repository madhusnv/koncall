package p001o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class kr3 {

    /* renamed from: i */
    public static final C14906b f32579i = new C14906b(null);

    /* renamed from: a */
    public final hc0 f32580a;

    /* renamed from: b */
    public final String f32581b;

    /* renamed from: c */
    public final Map f32582c;

    /* renamed from: d */
    public final String f32583d;

    /* renamed from: e */
    public final String f32584e;

    /* renamed from: f */
    public final String f32585f;

    /* renamed from: g */
    public final yci f32586g;

    /* renamed from: h */
    public final String f32587h;

    /* renamed from: o.kr3$a */
    public static final class C14905a {

        /* renamed from: a */
        public hc0 f32588a;

        /* renamed from: b */
        public String f32589b;

        /* renamed from: c */
        public Map f32590c;

        /* renamed from: d */
        public String f32591d;

        /* renamed from: e */
        public String f32592e;

        /* renamed from: f */
        public String f32593f;

        /* renamed from: g */
        public yci f32594g;

        /* renamed from: h */
        public String f32595h;

        /* renamed from: a */
        public final kr3 m36100a() {
            return new kr3(this, null);
        }

        /* renamed from: b */
        public final hc0 m36101b() {
            return this.f32588a;
        }

        /* renamed from: c */
        public final String m36102c() {
            return this.f32589b;
        }

        /* renamed from: d */
        public final Map m36103d() {
            return this.f32590c;
        }

        /* renamed from: e */
        public final String m36104e() {
            return this.f32591d;
        }

        /* renamed from: f */
        public final String m36105f() {
            return this.f32592e;
        }

        /* renamed from: g */
        public final String m36106g() {
            return this.f32593f;
        }

        /* renamed from: h */
        public final yci m36107h() {
            return this.f32594g;
        }

        /* renamed from: i */
        public final String m36108i() {
            return this.f32595h;
        }

        /* renamed from: j */
        public final void m36109j(hc0 hc0Var) {
            this.f32588a = hc0Var;
        }

        /* renamed from: k */
        public final void m36110k(String str) {
            this.f32589b = str;
        }

        /* renamed from: l */
        public final void m36111l(Map map) {
            this.f32590c = map;
        }

        /* renamed from: m */
        public final void m36112m(String str) {
            this.f32591d = str;
        }

        /* renamed from: n */
        public final void m36113n(String str) {
            this.f32592e = str;
        }

        /* renamed from: o */
        public final void m36114o(String str) {
            this.f32593f = str;
        }

        /* renamed from: p */
        public final void m36115p(String str) {
            this.f32595h = str;
        }

        /* renamed from: q */
        public final void m36116q(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            this.f32594g = yci.f55272c.m57613a(xk7Var);
        }
    }

    /* renamed from: o.kr3$b */
    public static final class C14906b {
        public C14906b() {
        }

        public /* synthetic */ C14906b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ kr3(C14905a c14905a, id5 id5Var) {
        this(c14905a);
    }

    /* renamed from: a */
    public final hc0 m36092a() {
        return this.f32580a;
    }

    /* renamed from: b */
    public final String m36093b() {
        return this.f32581b;
    }

    /* renamed from: c */
    public final Map m36094c() {
        return this.f32582c;
    }

    /* renamed from: d */
    public final String m36095d() {
        return this.f32583d;
    }

    /* renamed from: e */
    public final String m36096e() {
        return this.f32584e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kr3.class != obj.getClass()) {
            return false;
        }
        kr3 kr3Var = (kr3) obj;
        return sq8.m48644c(this.f32580a, kr3Var.f32580a) && sq8.m48644c(this.f32581b, kr3Var.f32581b) && sq8.m48644c(this.f32582c, kr3Var.f32582c) && sq8.m48644c(this.f32583d, kr3Var.f32583d) && sq8.m48644c(this.f32584e, kr3Var.f32584e) && sq8.m48644c(this.f32585f, kr3Var.f32585f) && sq8.m48644c(this.f32586g, kr3Var.f32586g) && sq8.m48644c(this.f32587h, kr3Var.f32587h);
    }

    /* renamed from: f */
    public final String m36097f() {
        return this.f32585f;
    }

    /* renamed from: g */
    public final yci m36098g() {
        return this.f32586g;
    }

    /* renamed from: h */
    public final String m36099h() {
        return this.f32587h;
    }

    public int hashCode() {
        hc0 hc0Var = this.f32580a;
        int iHashCode = (hc0Var != null ? hc0Var.hashCode() : 0) * 31;
        String str = this.f32581b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Map map = this.f32582c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str2 = this.f32583d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f32584e;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f32585f;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        yci yciVar = this.f32586g;
        int iHashCode7 = (iHashCode6 + (yciVar != null ? yciVar.hashCode() : 0)) * 31;
        String str5 = this.f32587h;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConfirmForgotPasswordRequest(");
        sb.append("analyticsMetadata=" + this.f32580a + ',');
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("clientMetadata=" + this.f32582c + ',');
        sb.append("confirmationCode=" + this.f32583d + ',');
        sb.append("password=*** Sensitive Data Redacted ***,");
        sb.append("secretHash=*** Sensitive Data Redacted ***,");
        sb.append("userContextData=*** Sensitive Data Redacted ***,");
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public kr3(C14905a c14905a) {
        this.f32580a = c14905a.m36101b();
        this.f32581b = c14905a.m36102c();
        this.f32582c = c14905a.m36103d();
        this.f32583d = c14905a.m36104e();
        this.f32584e = c14905a.m36105f();
        this.f32585f = c14905a.m36106g();
        this.f32586g = c14905a.m36107h();
        this.f32587h = c14905a.m36108i();
    }
}
