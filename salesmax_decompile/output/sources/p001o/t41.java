package p001o;

/* loaded from: classes2.dex */
public final class t41 extends rf8 {

    /* renamed from: a */
    public final float f46337a;

    /* renamed from: b */
    public final float f46338b;

    /* renamed from: c */
    public final float f46339c;

    /* renamed from: d */
    public final float f46340d;

    public t41(float f, float f2, float f3, float f4) {
        this.f46337a = f;
        this.f46338b = f2;
        this.f46339c = f3;
        this.f46340d = f4;
    }

    @Override // p001o.rf8, p001o.ifj
    /* renamed from: a */
    public float mo32088a() {
        return this.f46338b;
    }

    @Override // p001o.rf8, p001o.ifj
    /* renamed from: b */
    public float mo32089b() {
        return this.f46340d;
    }

    @Override // p001o.rf8, p001o.ifj
    /* renamed from: c */
    public float mo32090c() {
        return this.f46339c;
    }

    @Override // p001o.rf8, p001o.ifj
    /* renamed from: d */
    public float mo32091d() {
        return this.f46337a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rf8)) {
            return false;
        }
        rf8 rf8Var = (rf8) obj;
        return Float.floatToIntBits(this.f46337a) == Float.floatToIntBits(rf8Var.mo32091d()) && Float.floatToIntBits(this.f46338b) == Float.floatToIntBits(rf8Var.mo32088a()) && Float.floatToIntBits(this.f46339c) == Float.floatToIntBits(rf8Var.mo32090c()) && Float.floatToIntBits(this.f46340d) == Float.floatToIntBits(rf8Var.mo32089b());
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f46337a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f46338b)) * 1000003) ^ Float.floatToIntBits(this.f46339c)) * 1000003) ^ Float.floatToIntBits(this.f46340d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f46337a + ", maxZoomRatio=" + this.f46338b + ", minZoomRatio=" + this.f46339c + ", linearZoom=" + this.f46340d + "}";
    }
}
