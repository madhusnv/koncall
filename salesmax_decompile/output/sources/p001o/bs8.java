package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class bs8 extends pdd {

    /* renamed from: d */
    public static final C12487b f16766d = new C12487b(null);

    /* renamed from: o.bs8$a */
    public static final class C12486a {

        /* renamed from: a */
        public String f16767a;

        /* renamed from: a */
        public final bs8 m19694a() {
            return new bs8(this, null);
        }

        /* renamed from: b */
        public final C12486a m19695b() {
            return this;
        }

        /* renamed from: c */
        public final String m19696c() {
            return this.f16767a;
        }

        /* renamed from: d */
        public final void m19697d(String str) {
            this.f16767a = str;
        }
    }

    /* renamed from: o.bs8$b */
    public static final class C12487b {
        public C12487b() {
        }

        public /* synthetic */ C12487b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ bs8(C12486a c12486a, id5 id5Var) {
        this(c12486a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bs8.class == obj.getClass() && sq8.m48644c(getMessage(), ((bs8) obj).getMessage());
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
        sb.append("InvalidLexiconException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public bs8(C12486a c12486a) {
        super(c12486a.m19696c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
