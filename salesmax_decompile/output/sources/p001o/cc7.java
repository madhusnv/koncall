package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class cc7 extends ng3 {

    /* renamed from: d */
    public static final C12632b f17826d = new C12632b(null);

    /* renamed from: o.cc7$a */
    public static final class C12631a {

        /* renamed from: a */
        public String f17827a;

        /* renamed from: a */
        public final cc7 m20838a() {
            return new cc7(this, null);
        }

        /* renamed from: b */
        public final C12631a m20839b() {
            return this;
        }

        /* renamed from: c */
        public final String m20840c() {
            return this.f17827a;
        }

        /* renamed from: d */
        public final void m20841d(String str) {
            this.f17827a = str;
        }
    }

    /* renamed from: o.cc7$b */
    public static final class C12632b {
        public C12632b() {
        }

        public /* synthetic */ C12632b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ cc7(C12631a c12631a, id5 id5Var) {
        this(c12631a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && cc7.class == obj.getClass() && sq8.m48644c(getMessage(), ((cc7) obj).getMessage());
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
        sb.append("ForbiddenException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public cc7(C12631a c12631a) {
        super(c12631a.m20840c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
