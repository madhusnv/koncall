package p001o;

/* loaded from: classes2.dex */
public abstract class iba {

    /* renamed from: o.iba$a */
    public static final class C14232a extends iba {

        /* renamed from: a */
        public final ic4 f28380a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14232a(ic4 ic4Var) {
            super(null);
            sq8.m48649h(ic4Var, "credentials");
            this.f28380a = ic4Var;
        }

        /* renamed from: a */
        public final ic4 m31820a() {
            return this.f28380a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14232a) && sq8.m48644c(this.f28380a, ((C14232a) obj).f28380a);
        }

        public int hashCode() {
            return this.f28380a.hashCode();
        }

        public String toString() {
            return "AccessKey(credentials=" + this.f28380a + ')';
        }
    }

    /* renamed from: o.iba$b */
    public static final class C14233b extends iba {

        /* renamed from: a */
        public final String f28381a;

        /* renamed from: b */
        public final String f28382b;

        /* renamed from: c */
        public final String f28383c;

        /* renamed from: d */
        public final String f28384d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14233b(String str, String str2, String str3, String str4) {
            super(null);
            sq8.m48649h(str, "ssoStartUrl");
            sq8.m48649h(str2, "ssoRegion");
            sq8.m48649h(str3, "ssoAccountId");
            sq8.m48649h(str4, "ssoRoleName");
            this.f28381a = str;
            this.f28382b = str2;
            this.f28383c = str3;
            this.f28384d = str4;
        }

        /* renamed from: a */
        public final String m31821a() {
            return this.f28383c;
        }

        /* renamed from: b */
        public final String m31822b() {
            return this.f28382b;
        }

        /* renamed from: c */
        public final String m31823c() {
            return this.f28384d;
        }

        /* renamed from: d */
        public final String m31824d() {
            return this.f28381a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14233b)) {
                return false;
            }
            C14233b c14233b = (C14233b) obj;
            return sq8.m48644c(this.f28381a, c14233b.f28381a) && sq8.m48644c(this.f28382b, c14233b.f28382b) && sq8.m48644c(this.f28383c, c14233b.f28383c) && sq8.m48644c(this.f28384d, c14233b.f28384d);
        }

        public int hashCode() {
            return (((((this.f28381a.hashCode() * 31) + this.f28382b.hashCode()) * 31) + this.f28383c.hashCode()) * 31) + this.f28384d.hashCode();
        }

        public String toString() {
            return "LegacySso(ssoStartUrl=" + this.f28381a + ", ssoRegion=" + this.f28382b + ", ssoAccountId=" + this.f28383c + ", ssoRoleName=" + this.f28384d + ')';
        }
    }

    /* renamed from: o.iba$c */
    public static final class C14234c extends iba {

        /* renamed from: a */
        public final String f28385a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14234c(String str) {
            super(null);
            sq8.m48649h(str, "name");
            this.f28385a = str;
        }

        /* renamed from: a */
        public final String m31825a() {
            return this.f28385a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14234c) && sq8.m48644c(this.f28385a, ((C14234c) obj).f28385a);
        }

        public int hashCode() {
            return this.f28385a.hashCode();
        }

        public String toString() {
            return "NamedSource(name=" + this.f28385a + ')';
        }
    }

    /* renamed from: o.iba$d */
    public static final class C14235d extends iba {

        /* renamed from: a */
        public final String f28386a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14235d(String str) {
            super(null);
            sq8.m48649h(str, "command");
            this.f28386a = str;
        }

        /* renamed from: a */
        public final String m31826a() {
            return this.f28386a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14235d) && sq8.m48644c(this.f28386a, ((C14235d) obj).f28386a);
        }

        public int hashCode() {
            return this.f28386a.hashCode();
        }

        public String toString() {
            return "Process(command=" + this.f28386a + ')';
        }
    }

    /* renamed from: o.iba$e */
    public static final class C14236e extends iba {

        /* renamed from: a */
        public final String f28387a;

        /* renamed from: b */
        public final String f28388b;

        /* renamed from: c */
        public final String f28389c;

        /* renamed from: d */
        public final String f28390d;

        /* renamed from: e */
        public final String f28391e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14236e(String str, String str2, String str3, String str4, String str5) {
            super(null);
            sq8.m48649h(str, "ssoSessionName");
            sq8.m48649h(str2, "ssoStartUrl");
            sq8.m48649h(str3, "ssoRegion");
            sq8.m48649h(str4, "ssoAccountId");
            sq8.m48649h(str5, "ssoRoleName");
            this.f28387a = str;
            this.f28388b = str2;
            this.f28389c = str3;
            this.f28390d = str4;
            this.f28391e = str5;
        }

        /* renamed from: a */
        public final String m31827a() {
            return this.f28390d;
        }

        /* renamed from: b */
        public final String m31828b() {
            return this.f28389c;
        }

        /* renamed from: c */
        public final String m31829c() {
            return this.f28391e;
        }

        /* renamed from: d */
        public final String m31830d() {
            return this.f28387a;
        }

        /* renamed from: e */
        public final String m31831e() {
            return this.f28388b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14236e)) {
                return false;
            }
            C14236e c14236e = (C14236e) obj;
            return sq8.m48644c(this.f28387a, c14236e.f28387a) && sq8.m48644c(this.f28388b, c14236e.f28388b) && sq8.m48644c(this.f28389c, c14236e.f28389c) && sq8.m48644c(this.f28390d, c14236e.f28390d) && sq8.m48644c(this.f28391e, c14236e.f28391e);
        }

        public int hashCode() {
            return (((((((this.f28387a.hashCode() * 31) + this.f28388b.hashCode()) * 31) + this.f28389c.hashCode()) * 31) + this.f28390d.hashCode()) * 31) + this.f28391e.hashCode();
        }

        public String toString() {
            return "SsoSession(ssoSessionName=" + this.f28387a + ", ssoStartUrl=" + this.f28388b + ", ssoRegion=" + this.f28389c + ", ssoAccountId=" + this.f28390d + ", ssoRoleName=" + this.f28391e + ')';
        }
    }

    /* renamed from: o.iba$f */
    public static final class C14237f extends iba {

        /* renamed from: a */
        public final String f28392a;

        /* renamed from: b */
        public final String f28393b;

        /* renamed from: c */
        public final String f28394c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14237f(String str, String str2, String str3) {
            super(null);
            sq8.m48649h(str, "roleArn");
            sq8.m48649h(str2, "webIdentityTokenFile");
            this.f28392a = str;
            this.f28393b = str2;
            this.f28394c = str3;
        }

        /* renamed from: a */
        public final String m31832a() {
            return this.f28392a;
        }

        /* renamed from: b */
        public final String m31833b() {
            return this.f28394c;
        }

        /* renamed from: c */
        public final String m31834c() {
            return this.f28393b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14237f)) {
                return false;
            }
            C14237f c14237f = (C14237f) obj;
            return sq8.m48644c(this.f28392a, c14237f.f28392a) && sq8.m48644c(this.f28393b, c14237f.f28393b) && sq8.m48644c(this.f28394c, c14237f.f28394c);
        }

        public int hashCode() {
            int iHashCode = ((this.f28392a.hashCode() * 31) + this.f28393b.hashCode()) * 31;
            String str = this.f28394c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "WebIdentityTokenRole(roleArn=" + this.f28392a + ", webIdentityTokenFile=" + this.f28393b + ", sessionName=" + this.f28394c + ')';
        }
    }

    public iba() {
    }

    public /* synthetic */ iba(id5 id5Var) {
        this();
    }
}
