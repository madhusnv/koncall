package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class srh extends awh {

    /* renamed from: d */
    public static final C16906b f45848d = new C16906b(null);

    /* renamed from: o.srh$a */
    public static final class C16905a {

        /* renamed from: a */
        public String f45849a;

        /* renamed from: a */
        public final srh m48823a() {
            return new srh(this, null);
        }

        /* renamed from: b */
        public final C16905a m48824b() {
            return this;
        }

        /* renamed from: c */
        public final String m48825c() {
            return this.f45849a;
        }

        /* renamed from: d */
        public final void m48826d(String str) {
            this.f45849a = str;
        }
    }

    /* renamed from: o.srh$b */
    public static final class C16906b {
        public C16906b() {
        }

        public /* synthetic */ C16906b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ srh(C16905a c16905a, id5 id5Var) {
        this(c16905a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && srh.class == obj.getClass() && sq8.m48644c(getMessage(), ((srh) obj).getMessage());
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
        sb.append("TooManyRequestsException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public srh(C16905a c16905a) {
        super(c16905a.m48825c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
