package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class qrh extends fg3 {

    /* renamed from: d */
    public static final C16452b f42346d = new C16452b(null);

    /* renamed from: o.qrh$a */
    public static final class C16451a {

        /* renamed from: a */
        public String f42347a;

        /* renamed from: a */
        public final qrh m45817a() {
            return new qrh(this, null);
        }

        /* renamed from: b */
        public final C16451a m45818b() {
            return this;
        }

        /* renamed from: c */
        public final String m45819c() {
            return this.f42347a;
        }

        /* renamed from: d */
        public final void m45820d(String str) {
            this.f42347a = str;
        }
    }

    /* renamed from: o.qrh$b */
    public static final class C16452b {
        public C16452b() {
        }

        public /* synthetic */ C16452b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qrh(C16451a c16451a, id5 id5Var) {
        this(c16451a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && qrh.class == obj.getClass() && sq8.m48644c(getMessage(), ((qrh) obj).getMessage());
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            return message.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TooManyRequestsException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qrh(C16451a c16451a) {
        super(c16451a.m45819c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
