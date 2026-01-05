package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class tpi extends ng3 {

    /* renamed from: d */
    public static final C17184b f47595d = new C17184b(null);

    /* renamed from: o.tpi$a */
    public static final class C17183a {

        /* renamed from: a */
        public String f47596a;

        /* renamed from: a */
        public final tpi m50328a() {
            return new tpi(this, null);
        }

        /* renamed from: b */
        public final C17183a m50329b() {
            return this;
        }

        /* renamed from: c */
        public final String m50330c() {
            return this.f47596a;
        }

        /* renamed from: d */
        public final void m50331d(String str) {
            this.f47596a = str;
        }
    }

    /* renamed from: o.tpi$b */
    public static final class C17184b {
        public C17184b() {
        }

        public /* synthetic */ C17184b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ tpi(C17183a c17183a, id5 id5Var) {
        this(c17183a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && tpi.class == obj.getClass() && sq8.m48644c(getMessage(), ((tpi) obj).getMessage());
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
        sb.append("UsernameExistsException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public tpi(C17183a c17183a) {
        super(c17183a.m50330c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
