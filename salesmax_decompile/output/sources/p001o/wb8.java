package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class wb8 extends cag {

    /* renamed from: d */
    public static final C17812b f51728d = new C17812b(null);

    /* renamed from: o.wb8$a */
    public static final class C17811a {

        /* renamed from: a */
        public String f51729a;

        /* renamed from: a */
        public final wb8 m54167a() {
            return new wb8(this, null);
        }

        /* renamed from: b */
        public final C17811a m54168b() {
            return this;
        }

        /* renamed from: c */
        public final String m54169c() {
            return this.f51729a;
        }

        /* renamed from: d */
        public final void m54170d(String str) {
            this.f51729a = str;
        }
    }

    /* renamed from: o.wb8$b */
    public static final class C17812b {
        public C17812b() {
        }

        public /* synthetic */ C17812b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ wb8(C17811a c17811a, id5 id5Var) {
        this(c17811a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && wb8.class == obj.getClass() && sq8.m48644c(getMessage(), ((wb8) obj).getMessage());
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
        sb.append("IdpCommunicationErrorException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public wb8(C17811a c17811a) {
        super(c17811a.m54169c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
