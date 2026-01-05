package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class fca extends pdd {

    /* renamed from: d */
    public static final C13402b f23134d = new C13402b(null);

    /* renamed from: o.fca$a */
    public static final class C13401a {

        /* renamed from: a */
        public String f23135a;

        /* renamed from: a */
        public final fca m26451a() {
            return new fca(this, null);
        }

        /* renamed from: b */
        public final C13401a m26452b() {
            return this;
        }

        /* renamed from: c */
        public final String m26453c() {
            return this.f23135a;
        }

        /* renamed from: d */
        public final void m26454d(String str) {
            this.f23135a = str;
        }
    }

    /* renamed from: o.fca$b */
    public static final class C13402b {
        public C13402b() {
        }

        public /* synthetic */ C13402b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ fca(C13401a c13401a, id5 id5Var) {
        this(c13401a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && fca.class == obj.getClass() && sq8.m48644c(getMessage(), ((fca) obj).getMessage());
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
        sb.append("LexiconNotFoundException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public fca(C13401a c13401a) {
        super(c13401a.m26453c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
