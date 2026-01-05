package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class uoe extends awh {

    /* renamed from: d */
    public static final C17419b f49281d = new C17419b(null);

    /* renamed from: o.uoe$a */
    public static final class C17418a {

        /* renamed from: a */
        public String f49282a;

        /* renamed from: a */
        public final uoe m51845a() {
            return new uoe(this, null);
        }

        /* renamed from: b */
        public final C17418a m51846b() {
            return this;
        }

        /* renamed from: c */
        public final String m51847c() {
            return this.f49282a;
        }

        /* renamed from: d */
        public final void m51848d(String str) {
            this.f49282a = str;
        }
    }

    /* renamed from: o.uoe$b */
    public static final class C17419b {
        public C17419b() {
        }

        public /* synthetic */ C17419b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ uoe(C17418a c17418a, id5 id5Var) {
        this(c17418a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && uoe.class == obj.getClass() && sq8.m48644c(getMessage(), ((uoe) obj).getMessage());
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
        sb.append("ResourceNotFoundException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public uoe(C17418a c17418a) {
        super(c17418a.m51847c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
