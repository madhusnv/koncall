package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class eq8 extends awh {

    /* renamed from: d */
    public static final C13247b f22042d = new C13247b(null);

    /* renamed from: o.eq8$a */
    public static final class C13246a {

        /* renamed from: a */
        public String f22043a;

        /* renamed from: a */
        public final eq8 m25434a() {
            return new eq8(this, null);
        }

        /* renamed from: b */
        public final C13246a m25435b() {
            return this;
        }

        /* renamed from: c */
        public final String m25436c() {
            return this.f22043a;
        }

        /* renamed from: d */
        public final void m25437d(String str) {
            this.f22043a = str;
        }
    }

    /* renamed from: o.eq8$b */
    public static final class C13247b {
        public C13247b() {
        }

        public /* synthetic */ C13247b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ eq8(C13246a c13246a, id5 id5Var) {
        this(c13246a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && eq8.class == obj.getClass() && sq8.m48644c(getMessage(), ((eq8) obj).getMessage());
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
        sb.append("InternalServerException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public eq8(C13246a c13246a) {
        super(c13246a.m25436c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Server);
    }
}
