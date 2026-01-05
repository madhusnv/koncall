package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class k1g extends pdd {

    /* renamed from: d */
    public static final C14704b f31377d = new C14704b(null);

    /* renamed from: o.k1g$a */
    public static final class C14703a {

        /* renamed from: a */
        public String f31378a;

        /* renamed from: a */
        public final k1g m34916a() {
            return new k1g(this, null);
        }

        /* renamed from: b */
        public final C14703a m34917b() {
            return this;
        }

        /* renamed from: c */
        public final String m34918c() {
            return this.f31378a;
        }

        /* renamed from: d */
        public final void m34919d(String str) {
            this.f31378a = str;
        }
    }

    /* renamed from: o.k1g$b */
    public static final class C14704b {
        public C14704b() {
        }

        public /* synthetic */ C14704b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ k1g(C14703a c14703a, id5 id5Var) {
        this(c14703a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && k1g.class == obj.getClass() && sq8.m48644c(getMessage(), ((k1g) obj).getMessage());
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
        sb.append("SsmlMarksNotSupportedForTextTypeException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public k1g(C14703a c14703a) {
        super(c14703a.m34918c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
