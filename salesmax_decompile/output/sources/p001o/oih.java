package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class oih extends xp3 {

    /* renamed from: d */
    public static final C15820b f38424d = new C15820b(null);

    /* renamed from: o.oih$a */
    public static final class C15819a {

        /* renamed from: a */
        public String f38425a;

        /* renamed from: a */
        public final oih m42278a() {
            return new oih(this, null);
        }

        /* renamed from: b */
        public final C15819a m42279b() {
            return this;
        }

        /* renamed from: c */
        public final String m42280c() {
            return this.f38425a;
        }

        /* renamed from: d */
        public final void m42281d(String str) {
            this.f38425a = str;
        }
    }

    /* renamed from: o.oih$b */
    public static final class C15820b {
        public C15820b() {
        }

        public /* synthetic */ C15820b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ oih(C15819a c15819a, id5 id5Var) {
        this(c15819a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && oih.class == obj.getClass() && sq8.m48644c(getMessage(), ((oih) obj).getMessage());
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
        sb.append("TextSizeLimitExceededException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public oih(C15819a c15819a) {
        super(c15819a.m42280c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
