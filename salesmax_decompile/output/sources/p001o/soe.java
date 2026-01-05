package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class soe extends ng3 {

    /* renamed from: d */
    public static final C16883b f45713d = new C16883b(null);

    /* renamed from: o.soe$a */
    public static final class C16882a {

        /* renamed from: a */
        public String f45714a;

        /* renamed from: a */
        public final soe m48587a() {
            return new soe(this, null);
        }

        /* renamed from: b */
        public final C16882a m48588b() {
            return this;
        }

        /* renamed from: c */
        public final String m48589c() {
            return this.f45714a;
        }

        /* renamed from: d */
        public final void m48590d(String str) {
            this.f45714a = str;
        }
    }

    /* renamed from: o.soe$b */
    public static final class C16883b {
        public C16883b() {
        }

        public /* synthetic */ C16883b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ soe(C16882a c16882a, id5 id5Var) {
        this(c16882a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && soe.class == obj.getClass() && sq8.m48644c(getMessage(), ((soe) obj).getMessage());
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
        sb.append("ResourceNotFoundException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public soe(C16882a c16882a) {
        super(c16882a.m48589c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
