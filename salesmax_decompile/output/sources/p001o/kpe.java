package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class kpe extends xp3 {

    /* renamed from: d */
    public static final C14900b f32535d = new C14900b(null);

    /* renamed from: o.kpe$a */
    public static final class C14899a {

        /* renamed from: a */
        public String f32536a;

        /* renamed from: a */
        public final kpe m36041a() {
            return new kpe(this, null);
        }

        /* renamed from: b */
        public final C14899a m36042b() {
            return this;
        }

        /* renamed from: c */
        public final String m36043c() {
            return this.f32536a;
        }

        /* renamed from: d */
        public final void m36044d(String str) {
            this.f32536a = str;
        }
    }

    /* renamed from: o.kpe$b */
    public static final class C14900b {
        public C14900b() {
        }

        public /* synthetic */ C14900b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ kpe(C14899a c14899a, id5 id5Var) {
        this(c14899a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kpe.class == obj.getClass() && sq8.m48644c(getMessage(), ((kpe) obj).getMessage());
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
        sb.append("ResourceUnavailableException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public kpe(C14899a c14899a) {
        super(c14899a.m36043c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
