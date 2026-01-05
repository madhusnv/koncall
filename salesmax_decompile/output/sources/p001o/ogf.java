package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class ogf extends awh {

    /* renamed from: d */
    public static final C15800b f38343d = new C15800b(null);

    /* renamed from: o.ogf$a */
    public static final class C15799a {

        /* renamed from: a */
        public String f38344a;

        /* renamed from: a */
        public final ogf m42227a() {
            return new ogf(this, null);
        }

        /* renamed from: b */
        public final C15799a m42228b() {
            return this;
        }

        /* renamed from: c */
        public final String m42229c() {
            return this.f38344a;
        }

        /* renamed from: d */
        public final void m42230d(String str) {
            this.f38344a = str;
        }
    }

    /* renamed from: o.ogf$b */
    public static final class C15800b {
        public C15800b() {
        }

        public /* synthetic */ C15800b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ogf(C15799a c15799a, id5 id5Var) {
        this(c15799a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ogf.class == obj.getClass() && sq8.m48644c(getMessage(), ((ogf) obj).getMessage());
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
        sb.append("ServiceUnavailableException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ogf(C15799a c15799a) {
        super(c15799a.m42229c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Server);
    }
}
