package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class ys8 extends ng3 {

    /* renamed from: d */
    public static final C18481b f55897d = new C18481b(null);

    /* renamed from: o.ys8$a */
    public static final class C18480a {

        /* renamed from: a */
        public String f55898a;

        /* renamed from: a */
        public final ys8 m58182a() {
            return new ys8(this, null);
        }

        /* renamed from: b */
        public final C18480a m58183b() {
            return this;
        }

        /* renamed from: c */
        public final String m58184c() {
            return this.f55898a;
        }

        /* renamed from: d */
        public final void m58185d(String str) {
            this.f55898a = str;
        }
    }

    /* renamed from: o.ys8$b */
    public static final class C18481b {
        public C18481b() {
        }

        public /* synthetic */ C18481b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ys8(C18480a c18480a, id5 id5Var) {
        this(c18480a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ys8.class == obj.getClass() && sq8.m48644c(getMessage(), ((ys8) obj).getMessage());
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
        sb.append("InvalidPasswordException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ys8(C18480a c18480a) {
        super(c18480a.m58184c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
