package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class fih extends pdd {

    /* renamed from: d */
    public static final C13451b f23430d = new C13451b(null);

    /* renamed from: o.fih$a */
    public static final class C13450a {

        /* renamed from: a */
        public String f23431a;

        /* renamed from: a */
        public final fih m26799a() {
            return new fih(this, null);
        }

        /* renamed from: b */
        public final C13450a m26800b() {
            return this;
        }

        /* renamed from: c */
        public final String m26801c() {
            return this.f23431a;
        }

        /* renamed from: d */
        public final void m26802d(String str) {
            this.f23431a = str;
        }
    }

    /* renamed from: o.fih$b */
    public static final class C13451b {
        public C13451b() {
        }

        public /* synthetic */ C13451b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ fih(C13450a c13450a, id5 id5Var) {
        this(c13450a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && fih.class == obj.getClass() && sq8.m48644c(getMessage(), ((fih) obj).getMessage());
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
        sb.append("TextLengthExceededException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public fih(C13450a c13450a) {
        super(c13450a.m26801c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
