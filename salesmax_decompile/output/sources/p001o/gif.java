package p001o;

/* loaded from: classes3.dex */
public final class gif {

    /* renamed from: e */
    public static final C13745b f25302e = new C13745b(null);

    /* renamed from: a */
    public final String f25303a;

    /* renamed from: b */
    public final t46 f25304b;

    /* renamed from: c */
    public final swf f25305c;

    /* renamed from: d */
    public final czf f25306d;

    /* renamed from: o.gif$a */
    public static final class C13744a {

        /* renamed from: a */
        public String f25307a;

        /* renamed from: b */
        public t46 f25308b;

        /* renamed from: c */
        public swf f25309c;

        /* renamed from: d */
        public czf f25310d;

        /* renamed from: a */
        public final gif m28820a() {
            return new gif(this, null);
        }

        /* renamed from: b */
        public final String m28821b() {
            return this.f25307a;
        }

        /* renamed from: c */
        public final t46 m28822c() {
            return this.f25308b;
        }

        /* renamed from: d */
        public final swf m28823d() {
            return this.f25309c;
        }

        /* renamed from: e */
        public final czf m28824e() {
            return this.f25310d;
        }

        /* renamed from: f */
        public final void m28825f(String str) {
            this.f25307a = str;
        }

        /* renamed from: g */
        public final void m28826g(t46 t46Var) {
            this.f25308b = t46Var;
        }

        /* renamed from: h */
        public final void m28827h(swf swfVar) {
            this.f25309c = swfVar;
        }

        /* renamed from: i */
        public final void m28828i(czf czfVar) {
            this.f25310d = czfVar;
        }
    }

    /* renamed from: o.gif$b */
    public static final class C13745b {
        public C13745b() {
        }

        public /* synthetic */ C13745b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ gif(C13744a c13744a, id5 id5Var) {
        this(c13744a);
    }

    /* renamed from: a */
    public final String m28816a() {
        return this.f25303a;
    }

    /* renamed from: b */
    public final t46 m28817b() {
        return this.f25304b;
    }

    /* renamed from: c */
    public final swf m28818c() {
        return this.f25305c;
    }

    /* renamed from: d */
    public final czf m28819d() {
        return this.f25306d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gif.class != obj.getClass()) {
            return false;
        }
        gif gifVar = (gif) obj;
        return sq8.m48644c(this.f25303a, gifVar.f25303a) && sq8.m48644c(this.f25304b, gifVar.f25304b) && sq8.m48644c(this.f25305c, gifVar.f25305c) && sq8.m48644c(this.f25306d, gifVar.f25306d);
    }

    public int hashCode() {
        String str = this.f25303a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        t46 t46Var = this.f25304b;
        int iHashCode2 = (iHashCode + (t46Var != null ? t46Var.hashCode() : 0)) * 31;
        swf swfVar = this.f25305c;
        int iHashCode3 = (iHashCode2 + (swfVar != null ? swfVar.hashCode() : 0)) * 31;
        czf czfVar = this.f25306d;
        return iHashCode3 + (czfVar != null ? czfVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SetUserMfaPreferenceRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("emailMfaSettings=" + this.f25304b + ',');
        sb.append("smsMfaSettings=" + this.f25305c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("softwareTokenMfaSettings=");
        sb2.append(this.f25306d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public gif(C13744a c13744a) {
        this.f25303a = c13744a.m28821b();
        this.f25304b = c13744a.m28822c();
        this.f25305c = c13744a.m28823d();
        this.f25306d = c13744a.m28824e();
    }
}
