package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class cu8 extends qjh {

    /* renamed from: e */
    public static final C12749b f18643e = new C12749b(null);

    /* renamed from: d */
    public final String f18644d;

    /* renamed from: o.cu8$a */
    public static final class C12748a {

        /* renamed from: a */
        public String f18645a;

        /* renamed from: b */
        public String f18646b;

        /* renamed from: a */
        public final cu8 m21813a() {
            return new cu8(this, null);
        }

        /* renamed from: b */
        public final C12748a m21814b() {
            return this;
        }

        /* renamed from: c */
        public final String m21815c() {
            return this.f18645a;
        }

        /* renamed from: d */
        public final String m21816d() {
            return this.f18646b;
        }

        /* renamed from: e */
        public final void m21817e(String str) {
            this.f18645a = str;
        }

        /* renamed from: f */
        public final void m21818f(String str) {
            this.f18646b = str;
        }
    }

    /* renamed from: o.cu8$b */
    public static final class C12749b {
        public C12749b() {
        }

        public /* synthetic */ C12749b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ cu8(C12748a c12748a, id5 id5Var) {
        this(c12748a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cu8.class != obj.getClass()) {
            return false;
        }
        cu8 cu8Var = (cu8) obj;
        return sq8.m48644c(this.f18644d, cu8Var.f18644d) && sq8.m48644c(getMessage(), cu8Var.getMessage());
    }

    public int hashCode() {
        String str = this.f18644d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String message = getMessage();
        return iHashCode + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidS3ObjectException(");
        sb.append("code=" + this.f18644d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public cu8(C12748a c12748a) {
        super(c12748a.m21816d());
        this.f18644d = c12748a.m21815c();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
