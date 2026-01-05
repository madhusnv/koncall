package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class os8 extends ohe {

    /* renamed from: f */
    public static final C15884b f38818f = new C15884b(null);

    /* renamed from: d */
    public final String f38819d;

    /* renamed from: e */
    public final String f38820e;

    /* renamed from: o.os8$a */
    public static final class C15883a {

        /* renamed from: a */
        public String f38821a;

        /* renamed from: b */
        public String f38822b;

        /* renamed from: c */
        public String f38823c;

        /* renamed from: a */
        public final os8 m42621a() {
            return new os8(this, null);
        }

        /* renamed from: b */
        public final C15883a m42622b() {
            return this;
        }

        /* renamed from: c */
        public final String m42623c() {
            return this.f38821a;
        }

        /* renamed from: d */
        public final String m42624d() {
            return this.f38822b;
        }

        /* renamed from: e */
        public final String m42625e() {
            return this.f38823c;
        }

        /* renamed from: f */
        public final void m42626f(String str) {
            this.f38821a = str;
        }

        /* renamed from: g */
        public final void m42627g(String str) {
            this.f38822b = str;
        }

        /* renamed from: h */
        public final void m42628h(String str) {
            this.f38823c = str;
        }
    }

    /* renamed from: o.os8$b */
    public static final class C15884b {
        public C15884b() {
        }

        public /* synthetic */ C15884b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ os8(C15883a c15883a, id5 id5Var) {
        this(c15883a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || os8.class != obj.getClass()) {
            return false;
        }
        os8 os8Var = (os8) obj;
        return sq8.m48644c(this.f38819d, os8Var.f38819d) && sq8.m48644c(this.f38820e, os8Var.f38820e) && sq8.m48644c(getMessage(), os8Var.getMessage());
    }

    public int hashCode() {
        String str = this.f38819d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f38820e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String message = getMessage();
        return iHashCode2 + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidParameterException(");
        sb.append("code=" + this.f38819d + ',');
        sb.append("logref=" + this.f38820e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public os8(C15883a c15883a) {
        super(c15883a.m42625e());
        this.f38819d = c15883a.m42623c();
        this.f38820e = c15883a.m42624d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
