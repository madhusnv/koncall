package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class dda extends ng3 {

    /* renamed from: d */
    public static final C12877b f19611d = new C12877b(null);

    /* renamed from: o.dda$a */
    public static final class C12876a {

        /* renamed from: a */
        public String f19612a;

        /* renamed from: a */
        public final dda m22817a() {
            return new dda(this, null);
        }

        /* renamed from: b */
        public final C12876a m22818b() {
            return this;
        }

        /* renamed from: c */
        public final String m22819c() {
            return this.f19612a;
        }

        /* renamed from: d */
        public final void m22820d(String str) {
            this.f19612a = str;
        }
    }

    /* renamed from: o.dda$b */
    public static final class C12877b {
        public C12877b() {
        }

        public /* synthetic */ C12877b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ dda(C12876a c12876a, id5 id5Var) {
        this(c12876a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && dda.class == obj.getClass() && sq8.m48644c(getMessage(), ((dda) obj).getMessage());
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
        sb.append("LimitExceededException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public dda(C12876a c12876a) {
        super(c12876a.m22819c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
