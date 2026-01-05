package p001o;

/* loaded from: classes2.dex */
public abstract class w79 {

    /* renamed from: o.w79$a */
    public static final class C17793a extends w79 {

        /* renamed from: a */
        public final String f51562a;

        /* renamed from: b */
        public final String f51563b;

        public C17793a(String str, String str2) {
            super(null);
            this.f51562a = str;
            this.f51563b = str2;
        }

        /* renamed from: a */
        public final String m54036a() {
            return this.f51562a;
        }

        /* renamed from: b */
        public final String m54037b() {
            return this.f51563b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17793a)) {
                return false;
            }
            C17793a c17793a = (C17793a) obj;
            return sq8.m48644c(this.f51562a, c17793a.f51562a) && sq8.m48644c(this.f51563b, c17793a.f51563b);
        }

        public int hashCode() {
            String str = this.f51562a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f51563b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Error(code=" + this.f51562a + ", message=" + this.f51563b + ')';
        }
    }

    /* renamed from: o.w79$b */
    public static final class C17794b extends w79 {

        /* renamed from: a */
        public final String f51564a;

        /* renamed from: b */
        public final String f51565b;

        /* renamed from: c */
        public final String f51566c;

        /* renamed from: d */
        public final gk8 f51567d;

        /* renamed from: e */
        public final String f51568e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17794b(String str, String str2, String str3, gk8 gk8Var, String str4) {
            super(null);
            sq8.m48649h(str, "accessKeyId");
            sq8.m48649h(str2, "secretAccessKey");
            sq8.m48649h(str3, "sessionToken");
            this.f51564a = str;
            this.f51565b = str2;
            this.f51566c = str3;
            this.f51567d = gk8Var;
            this.f51568e = str4;
        }

        /* renamed from: a */
        public final String m54038a() {
            return this.f51564a;
        }

        /* renamed from: b */
        public final String m54039b() {
            return this.f51568e;
        }

        /* renamed from: c */
        public final gk8 m54040c() {
            return this.f51567d;
        }

        /* renamed from: d */
        public final String m54041d() {
            return this.f51565b;
        }

        /* renamed from: e */
        public final String m54042e() {
            return this.f51566c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17794b)) {
                return false;
            }
            C17794b c17794b = (C17794b) obj;
            return sq8.m48644c(this.f51564a, c17794b.f51564a) && sq8.m48644c(this.f51565b, c17794b.f51565b) && sq8.m48644c(this.f51566c, c17794b.f51566c) && sq8.m48644c(this.f51567d, c17794b.f51567d) && sq8.m48644c(this.f51568e, c17794b.f51568e);
        }

        public int hashCode() {
            int iHashCode = ((((this.f51564a.hashCode() * 31) + this.f51565b.hashCode()) * 31) + this.f51566c.hashCode()) * 31;
            gk8 gk8Var = this.f51567d;
            int iHashCode2 = (iHashCode + (gk8Var == null ? 0 : gk8Var.hashCode())) * 31;
            String str = this.f51568e;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "SessionCredentials(accessKeyId=" + this.f51564a + ", secretAccessKey=" + this.f51565b + ", sessionToken=" + this.f51566c + ", expiration=" + this.f51567d + ", accountId=" + this.f51568e + ')';
        }
    }

    public w79() {
    }

    public /* synthetic */ w79(id5 id5Var) {
        this();
    }
}
