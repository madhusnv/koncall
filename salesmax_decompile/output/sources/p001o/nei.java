package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class nei extends ng3 {

    /* renamed from: d */
    public static final C15560b f36757d = new C15560b(null);

    /* renamed from: o.nei$a */
    public static final class C15559a {

        /* renamed from: a */
        public String f36758a;

        /* renamed from: a */
        public final nei m40430a() {
            return new nei(this, null);
        }

        /* renamed from: b */
        public final C15559a m40431b() {
            return this;
        }

        /* renamed from: c */
        public final String m40432c() {
            return this.f36758a;
        }

        /* renamed from: d */
        public final void m40433d(String str) {
            this.f36758a = str;
        }
    }

    /* renamed from: o.nei$b */
    public static final class C15560b {
        public C15560b() {
        }

        public /* synthetic */ C15560b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ nei(C15559a c15559a, id5 id5Var) {
        this(c15559a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && nei.class == obj.getClass() && sq8.m48644c(getMessage(), ((nei) obj).getMessage());
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
        sb.append("UserLambdaValidationException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public nei(C15559a c15559a) {
        super(c15559a.m40432c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
