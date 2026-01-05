package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class vt8 extends pdd {

    /* renamed from: d */
    public static final C17673b f50866d = new C17673b(null);

    /* renamed from: o.vt8$a */
    public static final class C17672a {

        /* renamed from: a */
        public String f50867a;

        /* renamed from: a */
        public final vt8 m53403a() {
            return new vt8(this, null);
        }

        /* renamed from: b */
        public final C17672a m53404b() {
            return this;
        }

        /* renamed from: c */
        public final String m53405c() {
            return this.f50867a;
        }

        /* renamed from: d */
        public final void m53406d(String str) {
            this.f50867a = str;
        }
    }

    /* renamed from: o.vt8$b */
    public static final class C17673b {
        public C17673b() {
        }

        public /* synthetic */ C17673b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ vt8(C17672a c17672a, id5 id5Var) {
        this(c17672a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && vt8.class == obj.getClass() && sq8.m48644c(getMessage(), ((vt8) obj).getMessage());
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
        sb.append("InvalidS3BucketException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public vt8(C17672a c17672a) {
        super(c17672a.m53405c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
