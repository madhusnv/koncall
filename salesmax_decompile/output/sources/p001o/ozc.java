package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class ozc extends ng3 {

    /* renamed from: d */
    public static final C15919b f39104d = new C15919b(null);

    /* renamed from: o.ozc$a */
    public static final class C15918a {

        /* renamed from: a */
        public String f39105a;

        /* renamed from: a */
        public final ozc m42810a() {
            return new ozc(this, null);
        }

        /* renamed from: b */
        public final C15918a m42811b() {
            return this;
        }

        /* renamed from: c */
        public final String m42812c() {
            return this.f39105a;
        }

        /* renamed from: d */
        public final void m42813d(String str) {
            this.f39105a = str;
        }
    }

    /* renamed from: o.ozc$b */
    public static final class C15919b {
        public C15919b() {
        }

        public /* synthetic */ C15919b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ozc(C15918a c15918a, id5 id5Var) {
        this(c15918a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ozc.class == obj.getClass() && sq8.m48644c(getMessage(), ((ozc) obj).getMessage());
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
        sb.append("PasswordHistoryPolicyViolationException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ozc(C15918a c15918a) {
        super(c15918a.m42812c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
