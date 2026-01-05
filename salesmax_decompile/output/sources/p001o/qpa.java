package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class qpa extends cag {

    /* renamed from: d */
    public static final C16442b f42273d = new C16442b(null);

    /* renamed from: o.qpa$a */
    public static final class C16441a {

        /* renamed from: a */
        public String f42274a;

        /* renamed from: a */
        public final qpa m45755a() {
            return new qpa(this, null);
        }

        /* renamed from: b */
        public final C16441a m45756b() {
            return this;
        }

        /* renamed from: c */
        public final String m45757c() {
            return this.f42274a;
        }

        /* renamed from: d */
        public final void m45758d(String str) {
            this.f42274a = str;
        }
    }

    /* renamed from: o.qpa$b */
    public static final class C16442b {
        public C16442b() {
        }

        public /* synthetic */ C16442b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qpa(C16441a c16441a, id5 id5Var) {
        this(c16441a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && qpa.class == obj.getClass() && sq8.m48644c(getMessage(), ((qpa) obj).getMessage());
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
        sb.append("MalformedPolicyDocumentException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qpa(C16441a c16441a) {
        super(c16441a.m45757c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
