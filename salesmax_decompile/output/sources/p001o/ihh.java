package p001o;

/* loaded from: classes2.dex */
public final class ihh {

    /* renamed from: c */
    public static final C14298a f28690c = new C14298a(null);

    /* renamed from: d */
    public static final ihh f28691d = new ihh(1.0f, 0.0f);

    /* renamed from: a */
    public final float f28692a;

    /* renamed from: b */
    public final float f28693b;

    /* renamed from: o.ihh$a */
    public static final class C14298a {
        public C14298a() {
        }

        public /* synthetic */ C14298a(id5 id5Var) {
            this();
        }
    }

    public ihh(float f, float f2) {
        this.f28692a = f;
        this.f28693b = f2;
    }

    /* renamed from: a */
    public final float m32157a() {
        return this.f28692a;
    }

    /* renamed from: b */
    public final float m32158b() {
        return this.f28693b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihh)) {
            return false;
        }
        ihh ihhVar = (ihh) obj;
        if (this.f28692a == ihhVar.f28692a) {
            return (this.f28693b > ihhVar.f28693b ? 1 : (this.f28693b == ihhVar.f28693b ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f28692a) * 31) + Float.hashCode(this.f28693b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f28692a + ", skewX=" + this.f28693b + ')';
    }
}
