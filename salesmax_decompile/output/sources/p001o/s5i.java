package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class s5i extends ng3 {

    /* renamed from: d */
    public static final C16752b f44843d = new C16752b(null);

    /* renamed from: o.s5i$a */
    public static final class C16751a {

        /* renamed from: a */
        public String f44844a;

        /* renamed from: a */
        public final s5i m47884a() {
            return new s5i(this, null);
        }

        /* renamed from: b */
        public final C16751a m47885b() {
            return this;
        }

        /* renamed from: c */
        public final String m47886c() {
            return this.f44844a;
        }

        /* renamed from: d */
        public final void m47887d(String str) {
            this.f44844a = str;
        }
    }

    /* renamed from: o.s5i$b */
    public static final class C16752b {
        public C16752b() {
        }

        public /* synthetic */ C16752b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ s5i(C16751a c16751a, id5 id5Var) {
        this(c16751a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && s5i.class == obj.getClass() && sq8.m48644c(getMessage(), ((s5i) obj).getMessage());
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
        sb.append("UnsupportedOperationException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public s5i(C16751a c16751a) {
        super(c16751a.m47886c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
