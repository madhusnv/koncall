package p001o;

/* loaded from: classes3.dex */
public final class fl1 {

    /* renamed from: e */
    public static final C13478b f23573e = new C13478b(null);

    /* renamed from: a */
    public final Float f23574a;

    /* renamed from: b */
    public final Float f23575b;

    /* renamed from: c */
    public final Float f23576c;

    /* renamed from: d */
    public final Float f23577d;

    /* renamed from: o.fl1$a */
    public static final class C13477a {

        /* renamed from: a */
        public Float f23578a;

        /* renamed from: b */
        public Float f23579b;

        /* renamed from: c */
        public Float f23580c;

        /* renamed from: d */
        public Float f23581d;

        /* renamed from: a */
        public final fl1 m26982a() {
            return new fl1(this, null);
        }

        /* renamed from: b */
        public final C13477a m26983b() {
            return this;
        }

        /* renamed from: c */
        public final Float m26984c() {
            return this.f23578a;
        }

        /* renamed from: d */
        public final Float m26985d() {
            return this.f23579b;
        }

        /* renamed from: e */
        public final Float m26986e() {
            return this.f23580c;
        }

        /* renamed from: f */
        public final Float m26987f() {
            return this.f23581d;
        }

        /* renamed from: g */
        public final void m26988g(Float f) {
            this.f23578a = f;
        }

        /* renamed from: h */
        public final void m26989h(Float f) {
            this.f23579b = f;
        }

        /* renamed from: i */
        public final void m26990i(Float f) {
            this.f23580c = f;
        }

        /* renamed from: j */
        public final void m26991j(Float f) {
            this.f23581d = f;
        }
    }

    /* renamed from: o.fl1$b */
    public static final class C13478b {
        public C13478b() {
        }

        public /* synthetic */ C13478b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ fl1(C13477a c13477a, id5 id5Var) {
        this(c13477a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fl1.class != obj.getClass()) {
            return false;
        }
        fl1 fl1Var = (fl1) obj;
        Float f = this.f23574a;
        if (!(f != null ? f.equals(fl1Var.f23574a) : fl1Var.f23574a == null)) {
            return false;
        }
        Float f2 = this.f23575b;
        if (!(f2 != null ? f2.equals(fl1Var.f23575b) : fl1Var.f23575b == null)) {
            return false;
        }
        Float f3 = this.f23576c;
        if (!(f3 != null ? f3.equals(fl1Var.f23576c) : fl1Var.f23576c == null)) {
            return false;
        }
        Float f4 = this.f23577d;
        Float f5 = fl1Var.f23577d;
        return f4 != null ? f4.equals(f5) : f5 == null;
    }

    public int hashCode() {
        Float f = this.f23574a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f23575b;
        int iHashCode2 = (iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.f23576c;
        int iHashCode3 = (iHashCode2 + (f3 != null ? f3.hashCode() : 0)) * 31;
        Float f4 = this.f23577d;
        return iHashCode3 + (f4 != null ? f4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BoundingBox(");
        sb.append("height=" + this.f23574a + ',');
        sb.append("left=" + this.f23575b + ',');
        sb.append("top=" + this.f23576c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("width=");
        sb2.append(this.f23577d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public fl1(C13477a c13477a) {
        this.f23574a = c13477a.m26984c();
        this.f23575b = c13477a.m26985d();
        this.f23576c = c13477a.m26986e();
        this.f23577d = c13477a.m26987f();
    }
}
