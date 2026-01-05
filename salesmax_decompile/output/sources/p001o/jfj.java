package p001o;

/* loaded from: classes2.dex */
public class jfj implements ifj {

    /* renamed from: a */
    public float f30369a;

    /* renamed from: b */
    public final float f30370b;

    /* renamed from: c */
    public final float f30371c;

    /* renamed from: d */
    public float f30372d;

    public jfj(float f, float f2) {
        this.f30370b = f;
        this.f30371c = f2;
    }

    @Override // p001o.ifj
    /* renamed from: a */
    public float mo32088a() {
        return this.f30370b;
    }

    @Override // p001o.ifj
    /* renamed from: b */
    public float mo32089b() {
        return this.f30372d;
    }

    @Override // p001o.ifj
    /* renamed from: c */
    public float mo32090c() {
        return this.f30371c;
    }

    @Override // p001o.ifj
    /* renamed from: d */
    public float mo32091d() {
        return this.f30369a;
    }

    /* renamed from: e */
    public final float m33771e(float f) {
        float f2 = this.f30370b;
        float f3 = this.f30371c;
        if (f2 == f3) {
            return 0.0f;
        }
        if (f == f2) {
            return 1.0f;
        }
        if (f == f3) {
            return 0.0f;
        }
        float f4 = 1.0f / f3;
        return ((1.0f / f) - f4) / ((1.0f / f2) - f4);
    }

    /* renamed from: f */
    public void m33772f(float f) {
        if (f <= this.f30370b && f >= this.f30371c) {
            this.f30369a = f;
            this.f30372d = m33771e(f);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.f30371c + " , " + this.f30370b + "]");
    }
}
