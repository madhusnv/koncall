package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class fq3 extends ng3 {

    /* renamed from: d */
    public static final C13530b f23931d = new C13530b(null);

    /* renamed from: o.fq3$a */
    public static final class C13529a {

        /* renamed from: a */
        public String f23932a;

        /* renamed from: a */
        public final fq3 m27334a() {
            return new fq3(this, null);
        }

        /* renamed from: b */
        public final C13529a m27335b() {
            return this;
        }

        /* renamed from: c */
        public final String m27336c() {
            return this.f23932a;
        }

        /* renamed from: d */
        public final void m27337d(String str) {
            this.f23932a = str;
        }
    }

    /* renamed from: o.fq3$b */
    public static final class C13530b {
        public C13530b() {
        }

        public /* synthetic */ C13530b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ fq3(C13529a c13529a, id5 id5Var) {
        this(c13529a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && fq3.class == obj.getClass() && sq8.m48644c(getMessage(), ((fq3) obj).getMessage());
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
        sb.append("ConcurrentModificationException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public fq3(C13529a c13529a) {
        super(c13529a.m27336c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
