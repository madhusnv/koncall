package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class fs8 extends pdd {

    /* renamed from: d */
    public static final C13543b f24027d = new C13543b(null);

    /* renamed from: o.fs8$a */
    public static final class C13542a {

        /* renamed from: a */
        public String f24028a;

        /* renamed from: a */
        public final fs8 m27424a() {
            return new fs8(this, null);
        }

        /* renamed from: b */
        public final C13542a m27425b() {
            return this;
        }

        /* renamed from: c */
        public final String m27426c() {
            return this.f24028a;
        }

        /* renamed from: d */
        public final void m27427d(String str) {
            this.f24028a = str;
        }
    }

    /* renamed from: o.fs8$b */
    public static final class C13543b {
        public C13543b() {
        }

        public /* synthetic */ C13543b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ fs8(C13542a c13542a, id5 id5Var) {
        this(c13542a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && fs8.class == obj.getClass() && sq8.m48644c(getMessage(), ((fs8) obj).getMessage());
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
        sb.append("InvalidNextTokenException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public fs8(C13542a c13542a) {
        super(c13542a.m27426c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
