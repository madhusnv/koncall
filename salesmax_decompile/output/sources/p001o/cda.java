package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class cda extends fg3 {

    /* renamed from: d */
    public static final C12646b f17946d = new C12646b(null);

    /* renamed from: o.cda$a */
    public static final class C12645a {

        /* renamed from: a */
        public String f17947a;

        /* renamed from: a */
        public final cda m20961a() {
            return new cda(this, null);
        }

        /* renamed from: b */
        public final C12645a m20962b() {
            return this;
        }

        /* renamed from: c */
        public final String m20963c() {
            return this.f17947a;
        }

        /* renamed from: d */
        public final void m20964d(String str) {
            this.f17947a = str;
        }
    }

    /* renamed from: o.cda$b */
    public static final class C12646b {
        public C12646b() {
        }

        public /* synthetic */ C12646b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ cda(C12645a c12645a, id5 id5Var) {
        this(c12645a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && cda.class == obj.getClass() && sq8.m48644c(getMessage(), ((cda) obj).getMessage());
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
        sb.append("LimitExceededException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public cda(C12645a c12645a) {
        super(c12645a.m20963c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
