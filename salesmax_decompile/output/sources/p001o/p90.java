package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class p90 extends ng3 {

    /* renamed from: d */
    public static final C16031b f39637d = new C16031b(null);

    /* renamed from: o.p90$a */
    public static final class C16030a {

        /* renamed from: a */
        public String f39638a;

        /* renamed from: a */
        public final p90 m43200a() {
            return new p90(this, null);
        }

        /* renamed from: b */
        public final C16030a m43201b() {
            return this;
        }

        /* renamed from: c */
        public final String m43202c() {
            return this.f39638a;
        }

        /* renamed from: d */
        public final void m43203d(String str) {
            this.f39638a = str;
        }
    }

    /* renamed from: o.p90$b */
    public static final class C16031b {
        public C16031b() {
        }

        public /* synthetic */ C16031b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ p90(C16030a c16030a, id5 id5Var) {
        this(c16030a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p90.class == obj.getClass() && sq8.m48644c(getMessage(), ((p90) obj).getMessage());
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
        sb.append("AliasExistsException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public p90(C16030a c16030a) {
        super(c16030a.m43202c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
