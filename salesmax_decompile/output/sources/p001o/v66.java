package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class v66 extends ng3 {

    /* renamed from: d */
    public static final C17515b f49919d = new C17515b(null);

    /* renamed from: o.v66$a */
    public static final class C17514a {

        /* renamed from: a */
        public String f49920a;

        /* renamed from: a */
        public final v66 m52352a() {
            return new v66(this, null);
        }

        /* renamed from: b */
        public final C17514a m52353b() {
            return this;
        }

        /* renamed from: c */
        public final String m52354c() {
            return this.f49920a;
        }

        /* renamed from: d */
        public final void m52355d(String str) {
            this.f49920a = str;
        }
    }

    /* renamed from: o.v66$b */
    public static final class C17515b {
        public C17515b() {
        }

        public /* synthetic */ C17515b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ v66(C17514a c17514a, id5 id5Var) {
        this(c17514a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && v66.class == obj.getClass() && sq8.m48644c(getMessage(), ((v66) obj).getMessage());
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
        sb.append("EnableSoftwareTokenMfaException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public v66(C17514a c17514a) {
        super(c17514a.m52354c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
