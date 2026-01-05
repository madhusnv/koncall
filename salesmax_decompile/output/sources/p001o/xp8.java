package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class xp8 extends qjh {

    /* renamed from: e */
    public static final C18209b f54030e = new C18209b(null);

    /* renamed from: d */
    public final String f54031d;

    /* renamed from: o.xp8$a */
    public static final class C18208a {

        /* renamed from: a */
        public String f54032a;

        /* renamed from: b */
        public String f54033b;

        /* renamed from: a */
        public final xp8 m56562a() {
            return new xp8(this, null);
        }

        /* renamed from: b */
        public final C18208a m56563b() {
            return this;
        }

        /* renamed from: c */
        public final String m56564c() {
            return this.f54032a;
        }

        /* renamed from: d */
        public final String m56565d() {
            return this.f54033b;
        }

        /* renamed from: e */
        public final void m56566e(String str) {
            this.f54032a = str;
        }

        /* renamed from: f */
        public final void m56567f(String str) {
            this.f54033b = str;
        }
    }

    /* renamed from: o.xp8$b */
    public static final class C18209b {
        public C18209b() {
        }

        public /* synthetic */ C18209b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ xp8(C18208a c18208a, id5 id5Var) {
        this(c18208a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xp8.class != obj.getClass()) {
            return false;
        }
        xp8 xp8Var = (xp8) obj;
        return sq8.m48644c(this.f54031d, xp8Var.f54031d) && sq8.m48644c(getMessage(), xp8Var.getMessage());
    }

    public int hashCode() {
        String str = this.f54031d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String message = getMessage();
        return iHashCode + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InternalServerError(");
        sb.append("code=" + this.f54031d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public xp8(C18208a c18208a) {
        super(c18208a.m56565d());
        this.f54031d = c18208a.m56564c();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Server);
    }
}
