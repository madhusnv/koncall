package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class m5i extends xp3 {

    /* renamed from: d */
    public static final C15230b f34845d = new C15230b(null);

    /* renamed from: o.m5i$a */
    public static final class C15229a {

        /* renamed from: a */
        public String f34846a;

        /* renamed from: a */
        public final m5i m38404a() {
            return new m5i(this, null);
        }

        /* renamed from: b */
        public final C15229a m38405b() {
            return this;
        }

        /* renamed from: c */
        public final String m38406c() {
            return this.f34846a;
        }

        /* renamed from: d */
        public final void m38407d(String str) {
            this.f34846a = str;
        }
    }

    /* renamed from: o.m5i$b */
    public static final class C15230b {
        public C15230b() {
        }

        public /* synthetic */ C15230b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ m5i(C15229a c15229a, id5 id5Var) {
        this(c15229a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m5i.class == obj.getClass() && sq8.m48644c(getMessage(), ((m5i) obj).getMessage());
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
        sb.append("UnsupportedLanguageException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public m5i(C15229a c15229a) {
        super(c15229a.m38406c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
