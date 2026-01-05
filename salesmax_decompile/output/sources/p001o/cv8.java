package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class cv8 extends pdd {

    /* renamed from: d */
    public static final C12756b f18713d = new C12756b(null);

    /* renamed from: o.cv8$a */
    public static final class C12755a {

        /* renamed from: a */
        public String f18714a;

        /* renamed from: a */
        public final cv8 m21872a() {
            return new cv8(this, null);
        }

        /* renamed from: b */
        public final C12755a m21873b() {
            return this;
        }

        /* renamed from: c */
        public final String m21874c() {
            return this.f18714a;
        }

        /* renamed from: d */
        public final void m21875d(String str) {
            this.f18714a = str;
        }
    }

    /* renamed from: o.cv8$b */
    public static final class C12756b {
        public C12756b() {
        }

        public /* synthetic */ C12756b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ cv8(C12755a c12755a, id5 id5Var) {
        this(c12755a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && cv8.class == obj.getClass() && sq8.m48644c(getMessage(), ((cv8) obj).getMessage());
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
        sb.append("InvalidTaskIdException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public cv8(C12755a c12755a) {
        super(c12755a.m21874c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
