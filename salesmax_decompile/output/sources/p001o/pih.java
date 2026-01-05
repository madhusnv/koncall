package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class pih extends awh {

    /* renamed from: d */
    public static final C16125b f40159d = new C16125b(null);

    /* renamed from: o.pih$a */
    public static final class C16124a {

        /* renamed from: a */
        public String f40160a;

        /* renamed from: a */
        public final pih m43759a() {
            return new pih(this, null);
        }

        /* renamed from: b */
        public final C16124a m43760b() {
            return this;
        }

        /* renamed from: c */
        public final String m43761c() {
            return this.f40160a;
        }

        /* renamed from: d */
        public final void m43762d(String str) {
            this.f40160a = str;
        }
    }

    /* renamed from: o.pih$b */
    public static final class C16125b {
        public C16125b() {
        }

        public /* synthetic */ C16125b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ pih(C16124a c16124a, id5 id5Var) {
        this(c16124a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && pih.class == obj.getClass() && sq8.m48644c(getMessage(), ((pih) obj).getMessage());
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
        sb.append("TextSizeLimitExceededException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public pih(C16124a c16124a) {
        super(c16124a.m43761c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
