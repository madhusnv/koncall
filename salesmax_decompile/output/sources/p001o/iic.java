package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class iic extends cag {

    /* renamed from: d */
    public static final C14302b f28726d = new C14302b(null);

    /* renamed from: o.iic$a */
    public static final class C14301a {

        /* renamed from: a */
        public String f28727a;

        /* renamed from: a */
        public final iic m32175a() {
            return new iic(this, null);
        }

        /* renamed from: b */
        public final C14301a m32176b() {
            return this;
        }

        /* renamed from: c */
        public final String m32177c() {
            return this.f28727a;
        }

        /* renamed from: d */
        public final void m32178d(String str) {
            this.f28727a = str;
        }
    }

    /* renamed from: o.iic$b */
    public static final class C14302b {
        public C14302b() {
        }

        public /* synthetic */ C14302b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ iic(C14301a c14301a, id5 id5Var) {
        this(c14301a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && iic.class == obj.getClass() && sq8.m48644c(getMessage(), ((iic) obj).getMessage());
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
        sb.append("PackedPolicyTooLargeException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public iic(C14301a c14301a) {
        super(c14301a.m32177c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
