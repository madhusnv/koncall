package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class ef3 extends ng3 {

    /* renamed from: d */
    public static final C13176b f21535d = new C13176b(null);

    /* renamed from: o.ef3$a */
    public static final class C13175a {

        /* renamed from: a */
        public String f21536a;

        /* renamed from: a */
        public final ef3 m24911a() {
            return new ef3(this, null);
        }

        /* renamed from: b */
        public final C13175a m24912b() {
            return this;
        }

        /* renamed from: c */
        public final String m24913c() {
            return this.f21536a;
        }

        /* renamed from: d */
        public final void m24914d(String str) {
            this.f21536a = str;
        }
    }

    /* renamed from: o.ef3$b */
    public static final class C13176b {
        public C13176b() {
        }

        public /* synthetic */ C13176b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ef3(C13175a c13175a, id5 id5Var) {
        this(c13175a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ef3.class == obj.getClass() && sq8.m48644c(getMessage(), ((ef3) obj).getMessage());
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
        sb.append("CodeMismatchException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ef3(C13175a c13175a) {
        super(c13175a.m24913c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
