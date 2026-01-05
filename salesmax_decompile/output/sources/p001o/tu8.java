package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class tu8 extends pdd {

    /* renamed from: d */
    public static final C17235b f47894d = new C17235b(null);

    /* renamed from: o.tu8$a */
    public static final class C17234a {

        /* renamed from: a */
        public String f47895a;

        /* renamed from: a */
        public final tu8 m50680a() {
            return new tu8(this, null);
        }

        /* renamed from: b */
        public final C17234a m50681b() {
            return this;
        }

        /* renamed from: c */
        public final String m50682c() {
            return this.f47895a;
        }

        /* renamed from: d */
        public final void m50683d(String str) {
            this.f47895a = str;
        }
    }

    /* renamed from: o.tu8$b */
    public static final class C17235b {
        public C17235b() {
        }

        public /* synthetic */ C17235b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ tu8(C17234a c17234a, id5 id5Var) {
        this(c17234a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && tu8.class == obj.getClass() && sq8.m48644c(getMessage(), ((tu8) obj).getMessage());
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
        sb.append("InvalidSnsTopicArnException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public tu8(C17234a c17234a) {
        super(c17234a.m50682c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
