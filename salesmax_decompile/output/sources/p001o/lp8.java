package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class lp8 extends fg3 {

    /* renamed from: d */
    public static final C15123b f34183d = new C15123b(null);

    /* renamed from: o.lp8$a */
    public static final class C15122a {

        /* renamed from: a */
        public String f34184a;

        /* renamed from: a */
        public final lp8 m37581a() {
            return new lp8(this, null);
        }

        /* renamed from: b */
        public final C15122a m37582b() {
            return this;
        }

        /* renamed from: c */
        public final String m37583c() {
            return this.f34184a;
        }

        /* renamed from: d */
        public final void m37584d(String str) {
            this.f34184a = str;
        }
    }

    /* renamed from: o.lp8$b */
    public static final class C15123b {
        public C15123b() {
        }

        public /* synthetic */ C15123b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ lp8(C15122a c15122a, id5 id5Var) {
        this(c15122a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && lp8.class == obj.getClass() && sq8.m48644c(getMessage(), ((lp8) obj).getMessage());
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
        sb.append("InternalErrorException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public lp8(C15122a c15122a) {
        super(c15122a.m37583c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Server);
    }
}
