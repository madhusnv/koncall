package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class thg extends pdd {

    /* renamed from: d */
    public static final C17125b f47155d = new C17125b(null);

    /* renamed from: o.thg$a */
    public static final class C17124a {

        /* renamed from: a */
        public String f47156a;

        /* renamed from: a */
        public final thg m49897a() {
            return new thg(this, null);
        }

        /* renamed from: b */
        public final C17124a m49898b() {
            return this;
        }

        /* renamed from: c */
        public final String m49899c() {
            return this.f47156a;
        }

        /* renamed from: d */
        public final void m49900d(String str) {
            this.f47156a = str;
        }
    }

    /* renamed from: o.thg$b */
    public static final class C17125b {
        public C17125b() {
        }

        public /* synthetic */ C17125b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ thg(C17124a c17124a, id5 id5Var) {
        this(c17124a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && thg.class == obj.getClass() && sq8.m48644c(getMessage(), ((thg) obj).getMessage());
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
        sb.append("SynthesisTaskNotFoundException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public thg(C17124a c17124a) {
        super(c17124a.m49899c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
