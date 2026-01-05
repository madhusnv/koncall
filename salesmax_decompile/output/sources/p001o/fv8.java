package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class fv8 extends ng3 {

    /* renamed from: d */
    public static final C13580b f24158d = new C13580b(null);

    /* renamed from: o.fv8$a */
    public static final class C13579a {

        /* renamed from: a */
        public String f24159a;

        /* renamed from: a */
        public final fv8 m27563a() {
            return new fv8(this, null);
        }

        /* renamed from: b */
        public final C13579a m27564b() {
            return this;
        }

        /* renamed from: c */
        public final String m27565c() {
            return this.f24159a;
        }

        /* renamed from: d */
        public final void m27566d(String str) {
            this.f24159a = str;
        }
    }

    /* renamed from: o.fv8$b */
    public static final class C13580b {
        public C13580b() {
        }

        public /* synthetic */ C13580b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ fv8(C13579a c13579a, id5 id5Var) {
        this(c13579a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && fv8.class == obj.getClass() && sq8.m48644c(getMessage(), ((fv8) obj).getMessage());
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
        sb.append("InvalidUserPoolConfigurationException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public fv8(C13579a c13579a) {
        super(c13579a.m27565c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
