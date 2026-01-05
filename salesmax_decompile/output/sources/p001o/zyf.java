package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class zyf extends ng3 {

    /* renamed from: d */
    public static final C18732b f57920d = new C18732b(null);

    /* renamed from: o.zyf$a */
    public static final class C18731a {

        /* renamed from: a */
        public String f57921a;

        /* renamed from: a */
        public final zyf m60142a() {
            return new zyf(this, null);
        }

        /* renamed from: b */
        public final C18731a m60143b() {
            return this;
        }

        /* renamed from: c */
        public final String m60144c() {
            return this.f57921a;
        }

        /* renamed from: d */
        public final void m60145d(String str) {
            this.f57921a = str;
        }
    }

    /* renamed from: o.zyf$b */
    public static final class C18732b {
        public C18732b() {
        }

        public /* synthetic */ C18732b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ zyf(C18731a c18731a, id5 id5Var) {
        this(c18731a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zyf.class == obj.getClass() && sq8.m48644c(getMessage(), ((zyf) obj).getMessage());
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
        sb.append("SoftwareTokenMfaNotFoundException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public zyf(C18731a c18731a) {
        super(c18731a.m60144c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
