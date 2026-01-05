package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class krh extends ng3 {

    /* renamed from: d */
    public static final C14910b f32611d = new C14910b(null);

    /* renamed from: o.krh$a */
    public static final class C14909a {

        /* renamed from: a */
        public String f32612a;

        /* renamed from: a */
        public final krh m36131a() {
            return new krh(this, null);
        }

        /* renamed from: b */
        public final C14909a m36132b() {
            return this;
        }

        /* renamed from: c */
        public final String m36133c() {
            return this.f32612a;
        }

        /* renamed from: d */
        public final void m36134d(String str) {
            this.f32612a = str;
        }
    }

    /* renamed from: o.krh$b */
    public static final class C14910b {
        public C14910b() {
        }

        public /* synthetic */ C14910b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ krh(C14909a c14909a, id5 id5Var) {
        this(c14909a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && krh.class == obj.getClass() && sq8.m48644c(getMessage(), ((krh) obj).getMessage());
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
        sb.append("TooManyFailedAttemptsException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public krh(C14909a c14909a) {
        super(c14909a.m36133c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
