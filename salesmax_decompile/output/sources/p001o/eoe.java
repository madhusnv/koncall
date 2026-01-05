package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class eoe extends fg3 {

    /* renamed from: d */
    public static final C13242b f21999d = new C13242b(null);

    /* renamed from: o.eoe$a */
    public static final class C13241a {

        /* renamed from: a */
        public String f22000a;

        /* renamed from: a */
        public final eoe m25390a() {
            return new eoe(this, null);
        }

        /* renamed from: b */
        public final C13241a m25391b() {
            return this;
        }

        /* renamed from: c */
        public final String m25392c() {
            return this.f22000a;
        }

        /* renamed from: d */
        public final void m25393d(String str) {
            this.f22000a = str;
        }
    }

    /* renamed from: o.eoe$b */
    public static final class C13242b {
        public C13242b() {
        }

        public /* synthetic */ C13242b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ eoe(C13241a c13241a, id5 id5Var) {
        this(c13241a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && eoe.class == obj.getClass() && sq8.m48644c(getMessage(), ((eoe) obj).getMessage());
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
        sb.append("ResourceConflictException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public eoe(C13241a c13241a) {
        super(c13241a.m25392c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
