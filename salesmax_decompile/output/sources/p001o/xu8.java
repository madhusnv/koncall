package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class xu8 extends pdd {

    /* renamed from: d */
    public static final C18247b f54298d = new C18247b(null);

    /* renamed from: o.xu8$a */
    public static final class C18246a {

        /* renamed from: a */
        public String f54299a;

        /* renamed from: a */
        public final xu8 m56836a() {
            return new xu8(this, null);
        }

        /* renamed from: b */
        public final C18246a m56837b() {
            return this;
        }

        /* renamed from: c */
        public final String m56838c() {
            return this.f54299a;
        }

        /* renamed from: d */
        public final void m56839d(String str) {
            this.f54299a = str;
        }
    }

    /* renamed from: o.xu8$b */
    public static final class C18247b {
        public C18247b() {
        }

        public /* synthetic */ C18247b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ xu8(C18246a c18246a, id5 id5Var) {
        this(c18246a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xu8.class == obj.getClass() && sq8.m48644c(getMessage(), ((xu8) obj).getMessage());
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
        sb.append("InvalidSsmlException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public xu8(C18246a c18246a) {
        super(c18246a.m56838c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
