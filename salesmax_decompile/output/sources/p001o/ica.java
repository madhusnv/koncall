package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class ica extends pdd {

    /* renamed from: d */
    public static final C14251b f28451d = new C14251b(null);

    /* renamed from: o.ica$a */
    public static final class C14250a {

        /* renamed from: a */
        public String f28452a;

        /* renamed from: a */
        public final ica m31903a() {
            return new ica(this, null);
        }

        /* renamed from: b */
        public final C14250a m31904b() {
            return this;
        }

        /* renamed from: c */
        public final String m31905c() {
            return this.f28452a;
        }

        /* renamed from: d */
        public final void m31906d(String str) {
            this.f28452a = str;
        }
    }

    /* renamed from: o.ica$b */
    public static final class C14251b {
        public C14251b() {
        }

        public /* synthetic */ C14251b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ica(C14250a c14250a, id5 id5Var) {
        this(c14250a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ica.class == obj.getClass() && sq8.m48644c(getMessage(), ((ica) obj).getMessage());
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
        sb.append("LexiconSizeExceededException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ica(C14250a c14250a) {
        super(c14250a.m31905c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
