package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class sp5 extends awh {

    /* renamed from: e */
    public static final C16888b f45730e = new C16888b(null);

    /* renamed from: d */
    public final String f45731d;

    /* renamed from: o.sp5$a */
    public static final class C16887a {

        /* renamed from: a */
        public String f45732a;

        /* renamed from: b */
        public String f45733b;

        /* renamed from: a */
        public final sp5 m48597a() {
            return new sp5(this, null);
        }

        /* renamed from: b */
        public final C16887a m48598b() {
            return this;
        }

        /* renamed from: c */
        public final String m48599c() {
            return this.f45732a;
        }

        /* renamed from: d */
        public final String m48600d() {
            return this.f45733b;
        }

        /* renamed from: e */
        public final void m48601e(String str) {
            this.f45732a = str;
        }

        /* renamed from: f */
        public final void m48602f(String str) {
            this.f45733b = str;
        }
    }

    /* renamed from: o.sp5$b */
    public static final class C16888b {
        public C16888b() {
        }

        public /* synthetic */ C16888b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ sp5(C16887a c16887a, id5 id5Var) {
        this(c16887a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sp5.class != obj.getClass()) {
            return false;
        }
        sp5 sp5Var = (sp5) obj;
        return sq8.m48644c(this.f45731d, sp5Var.f45731d) && sq8.m48644c(getMessage(), sp5Var.getMessage());
    }

    public int hashCode() {
        String str = this.f45731d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String message = getMessage();
        return iHashCode + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectedLanguageLowConfidenceException(");
        sb.append("detectedLanguageCode=" + this.f45731d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public sp5(C16887a c16887a) {
        super(c16887a.m48600d());
        this.f45731d = c16887a.m48599c();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
