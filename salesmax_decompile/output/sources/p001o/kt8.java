package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class kt8 extends xp3 {

    /* renamed from: f */
    public static final C14923b f32698f = new C14923b(null);

    /* renamed from: d */
    public final ft8 f32699d;

    /* renamed from: e */
    public final ut8 f32700e;

    /* renamed from: o.kt8$a */
    public static final class C14922a {

        /* renamed from: a */
        public ft8 f32701a;

        /* renamed from: b */
        public String f32702b;

        /* renamed from: c */
        public ut8 f32703c;

        /* renamed from: a */
        public final kt8 m36206a() {
            return new kt8(this, null);
        }

        /* renamed from: b */
        public final C14922a m36207b() {
            return this;
        }

        /* renamed from: c */
        public final ft8 m36208c() {
            return this.f32701a;
        }

        /* renamed from: d */
        public final String m36209d() {
            return this.f32702b;
        }

        /* renamed from: e */
        public final ut8 m36210e() {
            return this.f32703c;
        }

        /* renamed from: f */
        public final void m36211f(ft8 ft8Var) {
            this.f32701a = ft8Var;
        }

        /* renamed from: g */
        public final void m36212g(String str) {
            this.f32702b = str;
        }

        /* renamed from: h */
        public final void m36213h(ut8 ut8Var) {
            this.f32703c = ut8Var;
        }
    }

    /* renamed from: o.kt8$b */
    public static final class C14923b {
        public C14923b() {
        }

        public /* synthetic */ C14923b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ kt8(C14922a c14922a, id5 id5Var) {
        this(c14922a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kt8.class != obj.getClass()) {
            return false;
        }
        kt8 kt8Var = (kt8) obj;
        return sq8.m48644c(this.f32699d, kt8Var.f32699d) && sq8.m48644c(getMessage(), kt8Var.getMessage()) && sq8.m48644c(this.f32700e, kt8Var.f32700e);
    }

    public int hashCode() {
        ft8 ft8Var = this.f32699d;
        int iHashCode = (ft8Var != null ? ft8Var.hashCode() : 0) * 31;
        String message = getMessage();
        int iHashCode2 = (iHashCode + (message != null ? message.hashCode() : 0)) * 31;
        ut8 ut8Var = this.f32700e;
        return iHashCode2 + (ut8Var != null ? ut8Var.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidRequestException(");
        sb.append("detail=" + this.f32699d + ',');
        sb.append("message=" + getMessage() + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("reason=");
        sb2.append(this.f32700e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public kt8(C14922a c14922a) {
        super(c14922a.m36209d());
        this.f32699d = c14922a.m36208c();
        this.f32700e = c14922a.m36210e();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
