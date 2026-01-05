package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class yt8 extends pdd {

    /* renamed from: d */
    public static final C18487b f55915d = new C18487b(null);

    /* renamed from: o.yt8$a */
    public static final class C18486a {

        /* renamed from: a */
        public String f55916a;

        /* renamed from: a */
        public final yt8 m58200a() {
            return new yt8(this, null);
        }

        /* renamed from: b */
        public final C18486a m58201b() {
            return this;
        }

        /* renamed from: c */
        public final String m58202c() {
            return this.f55916a;
        }

        /* renamed from: d */
        public final void m58203d(String str) {
            this.f55916a = str;
        }
    }

    /* renamed from: o.yt8$b */
    public static final class C18487b {
        public C18487b() {
        }

        public /* synthetic */ C18487b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ yt8(C18486a c18486a, id5 id5Var) {
        this(c18486a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && yt8.class == obj.getClass() && sq8.m48644c(getMessage(), ((yt8) obj).getMessage());
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
        sb.append("InvalidS3KeyException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public yt8(C18486a c18486a) {
        super(c18486a.m58202c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
