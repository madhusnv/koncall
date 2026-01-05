package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class tge extends cag {

    /* renamed from: d */
    public static final C17109b f47111d = new C17109b(null);

    /* renamed from: o.tge$a */
    public static final class C17108a {

        /* renamed from: a */
        public String f47112a;

        /* renamed from: a */
        public final tge m49843a() {
            return new tge(this, null);
        }

        /* renamed from: b */
        public final C17108a m49844b() {
            return this;
        }

        /* renamed from: c */
        public final String m49845c() {
            return this.f47112a;
        }

        /* renamed from: d */
        public final void m49846d(String str) {
            this.f47112a = str;
        }
    }

    /* renamed from: o.tge$b */
    public static final class C17109b {
        public C17109b() {
        }

        public /* synthetic */ C17109b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ tge(C17108a c17108a, id5 id5Var) {
        this(c17108a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && tge.class == obj.getClass() && sq8.m48644c(getMessage(), ((tge) obj).getMessage());
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
        sb.append("RegionDisabledException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public tge(C17108a c17108a) {
        super(c17108a.m49845c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
