package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class igf extends pdd {

    /* renamed from: d */
    public static final C14289b f28650d = new C14289b(null);

    /* renamed from: o.igf$a */
    public static final class C14288a {

        /* renamed from: a */
        public String f28651a;

        /* renamed from: a */
        public final igf m32114a() {
            return new igf(this, null);
        }

        /* renamed from: b */
        public final C14288a m32115b() {
            return this;
        }

        /* renamed from: c */
        public final String m32116c() {
            return this.f28651a;
        }

        /* renamed from: d */
        public final void m32117d(String str) {
            this.f28651a = str;
        }
    }

    /* renamed from: o.igf$b */
    public static final class C14289b {
        public C14289b() {
        }

        public /* synthetic */ C14289b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ igf(C14288a c14288a, id5 id5Var) {
        this(c14288a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && igf.class == obj.getClass() && sq8.m48644c(getMessage(), ((igf) obj).getMessage());
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
        sb.append("ServiceFailureException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public igf(C14288a c14288a) {
        super(c14288a.m32116c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Server);
    }
}
