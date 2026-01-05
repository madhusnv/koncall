package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class bu8 extends ohe {

    /* renamed from: f */
    public static final C12504b f16830f = new C12504b(null);

    /* renamed from: d */
    public final String f16831d;

    /* renamed from: e */
    public final String f16832e;

    /* renamed from: o.bu8$a */
    public static final class C12503a {

        /* renamed from: a */
        public String f16833a;

        /* renamed from: b */
        public String f16834b;

        /* renamed from: c */
        public String f16835c;

        /* renamed from: a */
        public final bu8 m19814a() {
            return new bu8(this, null);
        }

        /* renamed from: b */
        public final C12503a m19815b() {
            return this;
        }

        /* renamed from: c */
        public final String m19816c() {
            return this.f16833a;
        }

        /* renamed from: d */
        public final String m19817d() {
            return this.f16834b;
        }

        /* renamed from: e */
        public final String m19818e() {
            return this.f16835c;
        }

        /* renamed from: f */
        public final void m19819f(String str) {
            this.f16833a = str;
        }

        /* renamed from: g */
        public final void m19820g(String str) {
            this.f16834b = str;
        }

        /* renamed from: h */
        public final void m19821h(String str) {
            this.f16835c = str;
        }
    }

    /* renamed from: o.bu8$b */
    public static final class C12504b {
        public C12504b() {
        }

        public /* synthetic */ C12504b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ bu8(C12503a c12503a, id5 id5Var) {
        this(c12503a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bu8.class != obj.getClass()) {
            return false;
        }
        bu8 bu8Var = (bu8) obj;
        return sq8.m48644c(this.f16831d, bu8Var.f16831d) && sq8.m48644c(this.f16832e, bu8Var.f16832e) && sq8.m48644c(getMessage(), bu8Var.getMessage());
    }

    public int hashCode() {
        String str = this.f16831d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f16832e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String message = getMessage();
        return iHashCode2 + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidS3ObjectException(");
        sb.append("code=" + this.f16831d + ',');
        sb.append("logref=" + this.f16832e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public bu8(C12503a c12503a) {
        super(c12503a.m19818e());
        this.f16831d = c12503a.m19816c();
        this.f16832e = c12503a.m19817d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
