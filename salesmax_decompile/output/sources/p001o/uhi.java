package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class uhi extends ng3 {

    /* renamed from: d */
    public static final C17381b f48948d = new C17381b(null);

    /* renamed from: o.uhi$a */
    public static final class C17380a {

        /* renamed from: a */
        public String f48949a;

        /* renamed from: a */
        public final uhi m51596a() {
            return new uhi(this, null);
        }

        /* renamed from: b */
        public final C17380a m51597b() {
            return this;
        }

        /* renamed from: c */
        public final String m51598c() {
            return this.f48949a;
        }

        /* renamed from: d */
        public final void m51599d(String str) {
            this.f48949a = str;
        }
    }

    /* renamed from: o.uhi$b */
    public static final class C17381b {
        public C17381b() {
        }

        public /* synthetic */ C17381b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ uhi(C17380a c17380a, id5 id5Var) {
        this(c17380a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && uhi.class == obj.getClass() && sq8.m48644c(getMessage(), ((uhi) obj).getMessage());
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
        sb.append("UserNotConfirmedException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public uhi(C17380a c17380a) {
        super(c17380a.m51598c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
