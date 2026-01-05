package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class f5i extends qjh {

    /* renamed from: e */
    public static final C13342b f22769e = new C13342b(null);

    /* renamed from: d */
    public final String f22770d;

    /* renamed from: o.f5i$a */
    public static final class C13341a {

        /* renamed from: a */
        public String f22771a;

        /* renamed from: b */
        public String f22772b;

        /* renamed from: a */
        public final f5i m26187a() {
            return new f5i(this, null);
        }

        /* renamed from: b */
        public final C13341a m26188b() {
            return this;
        }

        /* renamed from: c */
        public final String m26189c() {
            return this.f22771a;
        }

        /* renamed from: d */
        public final String m26190d() {
            return this.f22772b;
        }

        /* renamed from: e */
        public final void m26191e(String str) {
            this.f22771a = str;
        }

        /* renamed from: f */
        public final void m26192f(String str) {
            this.f22772b = str;
        }
    }

    /* renamed from: o.f5i$b */
    public static final class C13342b {
        public C13342b() {
        }

        public /* synthetic */ C13342b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ f5i(C13341a c13341a, id5 id5Var) {
        this(c13341a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f5i.class != obj.getClass()) {
            return false;
        }
        f5i f5iVar = (f5i) obj;
        return sq8.m48644c(this.f22770d, f5iVar.f22770d) && sq8.m48644c(getMessage(), f5iVar.getMessage());
    }

    public int hashCode() {
        String str = this.f22770d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String message = getMessage();
        return iHashCode + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnsupportedDocumentException(");
        sb.append("code=" + this.f22770d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public f5i(C13341a c13341a) {
        super(c13341a.m26190d());
        this.f22770d = c13341a.m26189c();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
