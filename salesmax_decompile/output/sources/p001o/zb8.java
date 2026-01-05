package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class zb8 extends cag {

    /* renamed from: d */
    public static final C18607b f56898d = new C18607b(null);

    /* renamed from: o.zb8$a */
    public static final class C18606a {

        /* renamed from: a */
        public String f56899a;

        /* renamed from: a */
        public final zb8 m59144a() {
            return new zb8(this, null);
        }

        /* renamed from: b */
        public final C18606a m59145b() {
            return this;
        }

        /* renamed from: c */
        public final String m59146c() {
            return this.f56899a;
        }

        /* renamed from: d */
        public final void m59147d(String str) {
            this.f56899a = str;
        }
    }

    /* renamed from: o.zb8$b */
    public static final class C18607b {
        public C18607b() {
        }

        public /* synthetic */ C18607b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ zb8(C18606a c18606a, id5 id5Var) {
        this(c18606a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zb8.class == obj.getClass() && sq8.m48644c(getMessage(), ((zb8) obj).getMessage());
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
        sb.append("IdpRejectedClaimException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public zb8(C18606a c18606a) {
        super(c18606a.m59146c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
