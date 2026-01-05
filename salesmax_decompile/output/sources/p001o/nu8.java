package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class nu8 extends ng3 {

    /* renamed from: d */
    public static final C15673b f37315d = new C15673b(null);

    /* renamed from: o.nu8$a */
    public static final class C15672a {

        /* renamed from: a */
        public String f37316a;

        /* renamed from: a */
        public final nu8 m41163a() {
            return new nu8(this, null);
        }

        /* renamed from: b */
        public final C15672a m41164b() {
            return this;
        }

        /* renamed from: c */
        public final String m41165c() {
            return this.f37316a;
        }

        /* renamed from: d */
        public final void m41166d(String str) {
            this.f37316a = str;
        }
    }

    /* renamed from: o.nu8$b */
    public static final class C15673b {
        public C15673b() {
        }

        public /* synthetic */ C15673b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ nu8(C15672a c15672a, id5 id5Var) {
        this(c15672a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && nu8.class == obj.getClass() && sq8.m48644c(getMessage(), ((nu8) obj).getMessage());
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
        sb.append("InvalidSmsRoleAccessPolicyException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public nu8(C15672a c15672a) {
        super(c15672a.m41165c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
