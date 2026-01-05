package p001o;

/* loaded from: classes6.dex */
public final class fsi {

    /* renamed from: a */
    public float f24042a;

    /* renamed from: b */
    public float f24043b;

    public fsi(float f, float f2) {
        this.f24042a = f;
        this.f24043b = f2;
    }

    /* renamed from: a */
    public final void m27454a(fsi fsiVar) {
        sq8.m48649h(fsiVar, "v");
        this.f24042a += fsiVar.f24042a;
        this.f24043b += fsiVar.f24043b;
    }

    /* renamed from: b */
    public final void m27455b(fsi fsiVar, float f) {
        sq8.m48649h(fsiVar, "v");
        this.f24042a += fsiVar.f24042a * f;
        this.f24043b += fsiVar.f24043b * f;
    }

    /* renamed from: c */
    public final float m27456c() {
        return this.f24042a;
    }

    /* renamed from: d */
    public final float m27457d() {
        return this.f24043b;
    }

    /* renamed from: e */
    public final void m27458e(float f) {
        this.f24042a *= f;
        this.f24043b *= f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsi)) {
            return false;
        }
        fsi fsiVar = (fsi) obj;
        return Float.compare(this.f24042a, fsiVar.f24042a) == 0 && Float.compare(this.f24043b, fsiVar.f24043b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f24042a) * 31) + Float.hashCode(this.f24043b);
    }

    public String toString() {
        return "Vector(x=" + this.f24042a + ", y=" + this.f24043b + ")";
    }

    public /* synthetic */ fsi(float f, float f2, int i, id5 id5Var) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
