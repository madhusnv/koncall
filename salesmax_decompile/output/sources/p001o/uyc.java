package p001o;

/* loaded from: classes6.dex */
public final class uyc {

    /* renamed from: a */
    public final float f49656a;

    /* renamed from: b */
    public final float f49657b;

    /* renamed from: c */
    public final float f49658c;

    /* renamed from: d */
    public final float f49659d;

    /* renamed from: e */
    public final int f49660e;

    /* renamed from: f */
    public final float f49661f;

    /* renamed from: g */
    public final float f49662g;

    /* renamed from: h */
    public final wkf f49663h;

    /* renamed from: i */
    public final int f49664i;

    public uyc(float f, float f2, float f3, float f4, int i, float f5, float f6, wkf wkfVar, int i2) {
        sq8.m48649h(wkfVar, "shape");
        this.f49656a = f;
        this.f49657b = f2;
        this.f49658c = f3;
        this.f49659d = f4;
        this.f49660e = i;
        this.f49661f = f5;
        this.f49662g = f6;
        this.f49663h = wkfVar;
        this.f49664i = i2;
    }

    /* renamed from: a */
    public final int m52159a() {
        return this.f49660e;
    }

    /* renamed from: b */
    public final float m52160b() {
        return this.f49661f;
    }

    /* renamed from: c */
    public final float m52161c() {
        return this.f49662g;
    }

    /* renamed from: d */
    public final wkf m52162d() {
        return this.f49663h;
    }

    /* renamed from: e */
    public final float m52163e() {
        return this.f49658c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyc)) {
            return false;
        }
        uyc uycVar = (uyc) obj;
        return Float.compare(this.f49656a, uycVar.f49656a) == 0 && Float.compare(this.f49657b, uycVar.f49657b) == 0 && Float.compare(this.f49658c, uycVar.f49658c) == 0 && Float.compare(this.f49659d, uycVar.f49659d) == 0 && this.f49660e == uycVar.f49660e && Float.compare(this.f49661f, uycVar.f49661f) == 0 && Float.compare(this.f49662g, uycVar.f49662g) == 0 && sq8.m48644c(this.f49663h, uycVar.f49663h) && this.f49664i == uycVar.f49664i;
    }

    /* renamed from: f */
    public final float m52164f() {
        return this.f49656a;
    }

    /* renamed from: g */
    public final float m52165g() {
        return this.f49657b;
    }

    public int hashCode() {
        return (((((((((((((((Float.hashCode(this.f49656a) * 31) + Float.hashCode(this.f49657b)) * 31) + Float.hashCode(this.f49658c)) * 31) + Float.hashCode(this.f49659d)) * 31) + Integer.hashCode(this.f49660e)) * 31) + Float.hashCode(this.f49661f)) * 31) + Float.hashCode(this.f49662g)) * 31) + this.f49663h.hashCode()) * 31) + Integer.hashCode(this.f49664i);
    }

    public String toString() {
        return "Particle(x=" + this.f49656a + ", y=" + this.f49657b + ", width=" + this.f49658c + ", height=" + this.f49659d + ", color=" + this.f49660e + ", rotation=" + this.f49661f + ", scaleX=" + this.f49662g + ", shape=" + this.f49663h + ", alpha=" + this.f49664i + ")";
    }
}
