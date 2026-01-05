package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class v5i extends pdd {

    /* renamed from: d */
    public static final C17513b f49907d = new C17513b(null);

    /* renamed from: o.v5i$a */
    public static final class C17512a {

        /* renamed from: a */
        public String f49908a;

        /* renamed from: a */
        public final v5i m52346a() {
            return new v5i(this, null);
        }

        /* renamed from: b */
        public final C17512a m52347b() {
            return this;
        }

        /* renamed from: c */
        public final String m52348c() {
            return this.f49908a;
        }

        /* renamed from: d */
        public final void m52349d(String str) {
            this.f49908a = str;
        }
    }

    /* renamed from: o.v5i$b */
    public static final class C17513b {
        public C17513b() {
        }

        public /* synthetic */ C17513b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ v5i(C17512a c17512a, id5 id5Var) {
        this(c17512a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && v5i.class == obj.getClass() && sq8.m48644c(getMessage(), ((v5i) obj).getMessage());
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
        sb.append("UnsupportedPlsAlphabetException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public v5i(C17512a c17512a) {
        super(c17512a.m52348c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
