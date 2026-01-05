package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class dq8 extends xp3 {

    /* renamed from: d */
    public static final C13017b f20408d = new C13017b(null);

    /* renamed from: o.dq8$a */
    public static final class C13016a {

        /* renamed from: a */
        public String f20409a;

        /* renamed from: a */
        public final dq8 m23679a() {
            return new dq8(this, null);
        }

        /* renamed from: b */
        public final C13016a m23680b() {
            return this;
        }

        /* renamed from: c */
        public final String m23681c() {
            return this.f20409a;
        }

        /* renamed from: d */
        public final void m23682d(String str) {
            this.f20409a = str;
        }
    }

    /* renamed from: o.dq8$b */
    public static final class C13017b {
        public C13017b() {
        }

        public /* synthetic */ C13017b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ dq8(C13016a c13016a, id5 id5Var) {
        this(c13016a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && dq8.class == obj.getClass() && sq8.m48644c(getMessage(), ((dq8) obj).getMessage());
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
        sb.append("InternalServerException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public dq8(C13016a c13016a) {
        super(c13016a.m23681c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Server);
    }
}
