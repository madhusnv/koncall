package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class fg6 extends pdd {

    /* renamed from: d */
    public static final C13423b f23272d = new C13423b(null);

    /* renamed from: o.fg6$a */
    public static final class C13422a {

        /* renamed from: a */
        public String f23273a;

        /* renamed from: a */
        public final fg6 m26638a() {
            return new fg6(this, null);
        }

        /* renamed from: b */
        public final C13422a m26639b() {
            return this;
        }

        /* renamed from: c */
        public final String m26640c() {
            return this.f23273a;
        }

        /* renamed from: d */
        public final void m26641d(String str) {
            this.f23273a = str;
        }
    }

    /* renamed from: o.fg6$b */
    public static final class C13423b {
        public C13423b() {
        }

        public /* synthetic */ C13423b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ fg6(C13422a c13422a, id5 id5Var) {
        this(c13422a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && fg6.class == obj.getClass() && sq8.m48644c(getMessage(), ((fg6) obj).getMessage());
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
        sb.append("EngineNotSupportedException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public fg6(C13422a c13422a) {
        super(c13422a.m26640c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
