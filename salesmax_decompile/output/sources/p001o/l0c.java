package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class l0c extends fg3 {

    /* renamed from: d */
    public static final C14949b f32914d = new C14949b(null);

    /* renamed from: o.l0c$a */
    public static final class C14948a {

        /* renamed from: a */
        public String f32915a;

        /* renamed from: a */
        public final l0c m36406a() {
            return new l0c(this, null);
        }

        /* renamed from: b */
        public final C14948a m36407b() {
            return this;
        }

        /* renamed from: c */
        public final String m36408c() {
            return this.f32915a;
        }

        /* renamed from: d */
        public final void m36409d(String str) {
            this.f32915a = str;
        }
    }

    /* renamed from: o.l0c$b */
    public static final class C14949b {
        public C14949b() {
        }

        public /* synthetic */ C14949b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ l0c(C14948a c14948a, id5 id5Var) {
        this(c14948a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && l0c.class == obj.getClass() && sq8.m48644c(getMessage(), ((l0c) obj).getMessage());
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
        sb.append("NotAuthorizedException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public l0c(C14948a c14948a) {
        super(c14948a.m36408c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
