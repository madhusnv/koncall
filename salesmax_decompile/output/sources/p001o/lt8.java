package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class lt8 extends awh {

    /* renamed from: d */
    public static final C15149b f34360d = new C15149b(null);

    /* renamed from: o.lt8$a */
    public static final class C15148a {

        /* renamed from: a */
        public String f34361a;

        /* renamed from: a */
        public final lt8 m37876a() {
            return new lt8(this, null);
        }

        /* renamed from: b */
        public final C15148a m37877b() {
            return this;
        }

        /* renamed from: c */
        public final String m37878c() {
            return this.f34361a;
        }

        /* renamed from: d */
        public final void m37879d(String str) {
            this.f34361a = str;
        }
    }

    /* renamed from: o.lt8$b */
    public static final class C15149b {
        public C15149b() {
        }

        public /* synthetic */ C15149b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ lt8(C15148a c15148a, id5 id5Var) {
        this(c15148a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && lt8.class == obj.getClass() && sq8.m48644c(getMessage(), ((lt8) obj).getMessage());
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
        sb.append("InvalidRequestException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public lt8(C15148a c15148a) {
        super(c15148a.m37878c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
