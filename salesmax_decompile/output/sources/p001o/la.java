package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class la extends ohe {

    /* renamed from: f */
    public static final C15046b f33519f = new C15046b(null);

    /* renamed from: d */
    public final String f33520d;

    /* renamed from: e */
    public final String f33521e;

    /* renamed from: o.la$a */
    public static final class C15045a {

        /* renamed from: a */
        public String f33522a;

        /* renamed from: b */
        public String f33523b;

        /* renamed from: c */
        public String f33524c;

        /* renamed from: a */
        public final la m36821a() {
            return new la(this, null);
        }

        /* renamed from: b */
        public final C15045a m36822b() {
            return this;
        }

        /* renamed from: c */
        public final String m36823c() {
            return this.f33522a;
        }

        /* renamed from: d */
        public final String m36824d() {
            return this.f33523b;
        }

        /* renamed from: e */
        public final String m36825e() {
            return this.f33524c;
        }

        /* renamed from: f */
        public final void m36826f(String str) {
            this.f33522a = str;
        }

        /* renamed from: g */
        public final void m36827g(String str) {
            this.f33523b = str;
        }

        /* renamed from: h */
        public final void m36828h(String str) {
            this.f33524c = str;
        }
    }

    /* renamed from: o.la$b */
    public static final class C15046b {
        public C15046b() {
        }

        public /* synthetic */ C15046b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ la(C15045a c15045a, id5 id5Var) {
        this(c15045a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || la.class != obj.getClass()) {
            return false;
        }
        la laVar = (la) obj;
        return sq8.m48644c(this.f33520d, laVar.f33520d) && sq8.m48644c(this.f33521e, laVar.f33521e) && sq8.m48644c(getMessage(), laVar.getMessage());
    }

    public int hashCode() {
        String str = this.f33520d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f33521e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String message = getMessage();
        return iHashCode2 + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccessDeniedException(");
        sb.append("code=" + this.f33520d + ',');
        sb.append("logref=" + this.f33521e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public la(C15045a c15045a) {
        super(c15045a.m36825e());
        this.f33520d = c15045a.m36823c();
        this.f33521e = c15045a.m36824d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
