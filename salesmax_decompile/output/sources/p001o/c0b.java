package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class c0b extends pdd {

    /* renamed from: d */
    public static final C12523b f17061d = new C12523b(null);

    /* renamed from: o.c0b$a */
    public static final class C12522a {

        /* renamed from: a */
        public String f17062a;

        /* renamed from: a */
        public final c0b m20003a() {
            return new c0b(this, null);
        }

        /* renamed from: b */
        public final C12522a m20004b() {
            return this;
        }

        /* renamed from: c */
        public final String m20005c() {
            return this.f17062a;
        }

        /* renamed from: d */
        public final void m20006d(String str) {
            this.f17062a = str;
        }
    }

    /* renamed from: o.c0b$b */
    public static final class C12523b {
        public C12523b() {
        }

        public /* synthetic */ C12523b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ c0b(C12522a c12522a, id5 id5Var) {
        this(c12522a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c0b.class == obj.getClass() && sq8.m48644c(getMessage(), ((c0b) obj).getMessage());
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
        sb.append("MaxLexiconsNumberExceededException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public c0b(C12522a c12522a) {
        super(c12522a.m20005c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
