package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class y4j extends ng3 {

    /* renamed from: d */
    public static final C18318b f54897d = new C18318b(null);

    /* renamed from: o.y4j$a */
    public static final class C18317a {

        /* renamed from: a */
        public String f54898a;

        /* renamed from: a */
        public final y4j m57211a() {
            return new y4j(this, null);
        }

        /* renamed from: b */
        public final C18317a m57212b() {
            return this;
        }

        /* renamed from: c */
        public final String m57213c() {
            return this.f54898a;
        }

        /* renamed from: d */
        public final void m57214d(String str) {
            this.f54898a = str;
        }
    }

    /* renamed from: o.y4j$b */
    public static final class C18318b {
        public C18318b() {
        }

        public /* synthetic */ C18318b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ y4j(C18317a c18317a, id5 id5Var) {
        this(c18317a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && y4j.class == obj.getClass() && sq8.m48644c(getMessage(), ((y4j) obj).getMessage());
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
        sb.append("WebAuthnNotEnabledException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public y4j(C18317a c18317a) {
        super(c18317a.m57213c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
