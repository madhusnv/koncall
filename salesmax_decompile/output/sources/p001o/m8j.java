package p001o;

/* loaded from: classes2.dex */
public final class m8j {

    /* renamed from: a */
    public final float f34999a;

    /* renamed from: b */
    public final float f35000b;

    public m8j(float f, float f2) {
        this.f34999a = f;
        this.f35000b = f2;
    }

    /* renamed from: a */
    public final float m38577a() {
        return this.f34999a;
    }

    /* renamed from: b */
    public final float m38578b() {
        return this.f35000b;
    }

    /* renamed from: c */
    public final float[] m38579c() {
        float f = this.f34999a;
        float f2 = this.f35000b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8j)) {
            return false;
        }
        m8j m8jVar = (m8j) obj;
        return Float.compare(this.f34999a, m8jVar.f34999a) == 0 && Float.compare(this.f35000b, m8jVar.f35000b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f34999a) * 31) + Float.hashCode(this.f35000b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f34999a + ", y=" + this.f35000b + ')';
    }
}
