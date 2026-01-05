package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class hu8 extends pdd {

    /* renamed from: d */
    public static final C14079b f27554d = new C14079b(null);

    /* renamed from: o.hu8$a */
    public static final class C14078a {

        /* renamed from: a */
        public String f27555a;

        /* renamed from: a */
        public final hu8 m31132a() {
            return new hu8(this, null);
        }

        /* renamed from: b */
        public final C14078a m31133b() {
            return this;
        }

        /* renamed from: c */
        public final String m31134c() {
            return this.f27555a;
        }

        /* renamed from: d */
        public final void m31135d(String str) {
            this.f27555a = str;
        }
    }

    /* renamed from: o.hu8$b */
    public static final class C14079b {
        public C14079b() {
        }

        public /* synthetic */ C14079b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ hu8(C14078a c14078a, id5 id5Var) {
        this(c14078a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && hu8.class == obj.getClass() && sq8.m48644c(getMessage(), ((hu8) obj).getMessage());
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
        sb.append("InvalidSampleRateException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public hu8(C14078a c14078a) {
        super(c14078a.m31134c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
