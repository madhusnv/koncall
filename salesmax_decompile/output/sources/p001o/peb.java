package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class peb extends ng3 {

    /* renamed from: d */
    public static final C16092b f39961d = new C16092b(null);

    /* renamed from: o.peb$a */
    public static final class C16091a {

        /* renamed from: a */
        public String f39962a;

        /* renamed from: a */
        public final peb m43527a() {
            return new peb(this, null);
        }

        /* renamed from: b */
        public final C16091a m43528b() {
            return this;
        }

        /* renamed from: c */
        public final String m43529c() {
            return this.f39962a;
        }

        /* renamed from: d */
        public final void m43530d(String str) {
            this.f39962a = str;
        }
    }

    /* renamed from: o.peb$b */
    public static final class C16092b {
        public C16092b() {
        }

        public /* synthetic */ C16092b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ peb(C16091a c16091a, id5 id5Var) {
        this(c16091a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && peb.class == obj.getClass() && sq8.m48644c(getMessage(), ((peb) obj).getMessage());
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
        sb.append("MfaMethodNotFoundException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public peb(C16091a c16091a) {
        super(c16091a.m43529c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
