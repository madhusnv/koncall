package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class bf3 extends ng3 {

    /* renamed from: d */
    public static final C12371b f16082d = new C12371b(null);

    /* renamed from: o.bf3$a */
    public static final class C12370a {

        /* renamed from: a */
        public String f16083a;

        /* renamed from: a */
        public final bf3 m18830a() {
            return new bf3(this, null);
        }

        /* renamed from: b */
        public final C12370a m18831b() {
            return this;
        }

        /* renamed from: c */
        public final String m18832c() {
            return this.f16083a;
        }

        /* renamed from: d */
        public final void m18833d(String str) {
            this.f16083a = str;
        }
    }

    /* renamed from: o.bf3$b */
    public static final class C12371b {
        public C12371b() {
        }

        public /* synthetic */ C12371b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ bf3(C12370a c12370a, id5 id5Var) {
        this(c12370a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bf3.class == obj.getClass() && sq8.m48644c(getMessage(), ((bf3) obj).getMessage());
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
        sb.append("CodeDeliveryFailureException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public bf3(C12370a c12370a) {
        super(c12370a.m18832c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
