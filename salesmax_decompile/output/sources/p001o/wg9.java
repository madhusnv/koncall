package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class wg9 extends pdd {

    /* renamed from: d */
    public static final C17845b f51935d = new C17845b(null);

    /* renamed from: o.wg9$a */
    public static final class C17844a {

        /* renamed from: a */
        public String f51936a;

        /* renamed from: a */
        public final wg9 m54357a() {
            return new wg9(this, null);
        }

        /* renamed from: b */
        public final C17844a m54358b() {
            return this;
        }

        /* renamed from: c */
        public final String m54359c() {
            return this.f51936a;
        }

        /* renamed from: d */
        public final void m54360d(String str) {
            this.f51936a = str;
        }
    }

    /* renamed from: o.wg9$b */
    public static final class C17845b {
        public C17845b() {
        }

        public /* synthetic */ C17845b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ wg9(C17844a c17844a, id5 id5Var) {
        this(c17844a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && wg9.class == obj.getClass() && sq8.m48644c(getMessage(), ((wg9) obj).getMessage());
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
        sb.append("LanguageNotSupportedException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public wg9(C17844a c17844a) {
        super(c17844a.m54359c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
