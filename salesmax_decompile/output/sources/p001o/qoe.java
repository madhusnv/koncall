package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class qoe extends x1g {

    /* renamed from: d */
    public static final C16437b f42251d = new C16437b(null);

    /* renamed from: o.qoe$a */
    public static final class C16436a {

        /* renamed from: a */
        public String f42252a;

        /* renamed from: a */
        public final qoe m45734a() {
            return new qoe(this, null);
        }

        /* renamed from: b */
        public final C16436a m45735b() {
            return this;
        }

        /* renamed from: c */
        public final String m45736c() {
            return this.f42252a;
        }

        /* renamed from: d */
        public final void m45737d(String str) {
            this.f42252a = str;
        }
    }

    /* renamed from: o.qoe$b */
    public static final class C16437b {
        public C16437b() {
        }

        public /* synthetic */ C16437b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qoe(C16436a c16436a, id5 id5Var) {
        this(c16436a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && qoe.class == obj.getClass() && sq8.m48644c(getMessage(), ((qoe) obj).getMessage());
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
        sb.append("ResourceNotFoundException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qoe(C16436a c16436a) {
        super(c16436a.m45736c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
