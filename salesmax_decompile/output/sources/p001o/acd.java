package p001o;

/* loaded from: classes3.dex */
public final class acd {

    /* renamed from: c */
    public static final C12142b f14506c = new C12142b(null);

    /* renamed from: a */
    public final float f14507a;

    /* renamed from: b */
    public final float f14508b;

    /* renamed from: o.acd$a */
    public static final class C12141a {

        /* renamed from: a */
        public float f14509a;

        /* renamed from: b */
        public float f14510b;

        /* renamed from: a */
        public final acd m16878a() {
            return new acd(this, null);
        }

        /* renamed from: b */
        public final C12141a m16879b() {
            return this;
        }

        /* renamed from: c */
        public final float m16880c() {
            return this.f14509a;
        }

        /* renamed from: d */
        public final float m16881d() {
            return this.f14510b;
        }

        /* renamed from: e */
        public final void m16882e(float f) {
            this.f14509a = f;
        }

        /* renamed from: f */
        public final void m16883f(float f) {
            this.f14510b = f;
        }
    }

    /* renamed from: o.acd$b */
    public static final class C12142b {
        public C12142b() {
        }

        public /* synthetic */ C12142b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ acd(C12141a c12141a, id5 id5Var) {
        this(c12141a);
    }

    /* renamed from: a */
    public final float m16876a() {
        return this.f14507a;
    }

    /* renamed from: b */
    public final float m16877b() {
        return this.f14508b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || acd.class != obj.getClass()) {
            return false;
        }
        acd acdVar = (acd) obj;
        return Float.valueOf(this.f14507a).equals(Float.valueOf(acdVar.f14507a)) && Float.valueOf(this.f14508b).equals(Float.valueOf(acdVar.f14508b));
    }

    public int hashCode() {
        return (Float.hashCode(this.f14507a) * 31) + Float.hashCode(this.f14508b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Point(");
        sb.append("x=" + this.f14507a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("y=");
        sb2.append(this.f14508b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public acd(C12141a c12141a) {
        this.f14507a = c12141a.m16880c();
        this.f14508b = c12141a.m16881d();
    }
}
