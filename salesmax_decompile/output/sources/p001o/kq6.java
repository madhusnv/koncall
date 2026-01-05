package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class kq6 extends fg3 {

    /* renamed from: d */
    public static final C14902b f32540d = new C14902b(null);

    /* renamed from: o.kq6$a */
    public static final class C14901a {

        /* renamed from: a */
        public String f32541a;

        /* renamed from: a */
        public final kq6 m36046a() {
            return new kq6(this, null);
        }

        /* renamed from: b */
        public final C14901a m36047b() {
            return this;
        }

        /* renamed from: c */
        public final String m36048c() {
            return this.f32541a;
        }

        /* renamed from: d */
        public final void m36049d(String str) {
            this.f32541a = str;
        }
    }

    /* renamed from: o.kq6$b */
    public static final class C14902b {
        public C14902b() {
        }

        public /* synthetic */ C14902b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ kq6(C14901a c14901a, id5 id5Var) {
        this(c14901a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kq6.class == obj.getClass() && sq8.m48644c(getMessage(), ((kq6) obj).getMessage());
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
        sb.append("ExternalServiceException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public kq6(C14901a c14901a) {
        super(c14901a.m36048c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
