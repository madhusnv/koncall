package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class y5i extends pdd {

    /* renamed from: d */
    public static final C18339b f54957d = new C18339b(null);

    /* renamed from: o.y5i$a */
    public static final class C18338a {

        /* renamed from: a */
        public String f54958a;

        /* renamed from: a */
        public final y5i m57294a() {
            return new y5i(this, null);
        }

        /* renamed from: b */
        public final C18338a m57295b() {
            return this;
        }

        /* renamed from: c */
        public final String m57296c() {
            return this.f54958a;
        }

        /* renamed from: d */
        public final void m57297d(String str) {
            this.f54958a = str;
        }
    }

    /* renamed from: o.y5i$b */
    public static final class C18339b {
        public C18339b() {
        }

        public /* synthetic */ C18339b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ y5i(C18338a c18338a, id5 id5Var) {
        this(c18338a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && y5i.class == obj.getClass() && sq8.m48644c(getMessage(), ((y5i) obj).getMessage());
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
        sb.append("UnsupportedPlsLanguageException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public y5i(C18338a c18338a) {
        super(c18338a.m57296c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
