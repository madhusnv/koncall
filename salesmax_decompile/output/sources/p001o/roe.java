package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class roe extends fg3 {

    /* renamed from: d */
    public static final C16643b f43902d = new C16643b(null);

    /* renamed from: o.roe$a */
    public static final class C16642a {

        /* renamed from: a */
        public String f43903a;

        /* renamed from: a */
        public final roe m47031a() {
            return new roe(this, null);
        }

        /* renamed from: b */
        public final C16642a m47032b() {
            return this;
        }

        /* renamed from: c */
        public final String m47033c() {
            return this.f43903a;
        }

        /* renamed from: d */
        public final void m47034d(String str) {
            this.f43903a = str;
        }
    }

    /* renamed from: o.roe$b */
    public static final class C16643b {
        public C16643b() {
        }

        public /* synthetic */ C16643b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ roe(C16642a c16642a, id5 id5Var) {
        this(c16642a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && roe.class == obj.getClass() && sq8.m48644c(getMessage(), ((roe) obj).getMessage());
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

    public roe(C16642a c16642a) {
        super(c16642a.m47033c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
