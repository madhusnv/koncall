package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class mp8 extends ng3 {

    /* renamed from: d */
    public static final C15401b f35844d = new C15401b(null);

    /* renamed from: o.mp8$a */
    public static final class C15400a {

        /* renamed from: a */
        public String f35845a;

        /* renamed from: a */
        public final mp8 m39493a() {
            return new mp8(this, null);
        }

        /* renamed from: b */
        public final C15400a m39494b() {
            return this;
        }

        /* renamed from: c */
        public final String m39495c() {
            return this.f35845a;
        }

        /* renamed from: d */
        public final void m39496d(String str) {
            this.f35845a = str;
        }
    }

    /* renamed from: o.mp8$b */
    public static final class C15401b {
        public C15401b() {
        }

        public /* synthetic */ C15401b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ mp8(C15400a c15400a, id5 id5Var) {
        this(c15400a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mp8.class == obj.getClass() && sq8.m48644c(getMessage(), ((mp8) obj).getMessage());
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
        sb.append("InternalErrorException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public mp8(C15400a c15400a) {
        super(c15400a.m39495c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Server);
    }
}
