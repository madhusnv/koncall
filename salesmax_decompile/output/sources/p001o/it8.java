package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class it8 extends x1g {

    /* renamed from: d */
    public static final C14368b f29216d = new C14368b(null);

    /* renamed from: o.it8$a */
    public static final class C14367a {

        /* renamed from: a */
        public String f29217a;

        /* renamed from: a */
        public final it8 m32722a() {
            return new it8(this, null);
        }

        /* renamed from: b */
        public final C14367a m32723b() {
            return this;
        }

        /* renamed from: c */
        public final String m32724c() {
            return this.f29217a;
        }

        /* renamed from: d */
        public final void m32725d(String str) {
            this.f29217a = str;
        }
    }

    /* renamed from: o.it8$b */
    public static final class C14368b {
        public C14368b() {
        }

        public /* synthetic */ C14368b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ it8(C14367a c14367a, id5 id5Var) {
        this(c14367a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && it8.class == obj.getClass() && sq8.m48644c(getMessage(), ((it8) obj).getMessage());
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
        sb.append("InvalidRequestException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public it8(C14367a c14367a) {
        super(c14367a.m32724c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
