package m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m0.a */
/* loaded from: classes.dex */
public final class C4607a {

    /* renamed from: a */
    public final float f22814a;

    /* renamed from: b */
    public final float f22815b;

    /* renamed from: c */
    public final float f22816c;

    /* renamed from: d */
    public final float f22817d;

    public C4607a(float f6, float f10, float f11, float f12) {
        this.f22814a = f6;
        this.f22815b = f10;
        this.f22816c = f11;
        this.f22817d = f12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4607a) {
            C4607a c4607a = (C4607a) obj;
            if (Float.floatToIntBits(this.f22814a) == Float.floatToIntBits(c4607a.f22814a) && Float.floatToIntBits(this.f22815b) == Float.floatToIntBits(c4607a.f22815b) && Float.floatToIntBits(this.f22816c) == Float.floatToIntBits(c4607a.f22816c) && Float.floatToIntBits(this.f22817d) == Float.floatToIntBits(c4607a.f22817d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f22814a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f22815b)) * 1000003) ^ Float.floatToIntBits(this.f22816c)) * 1000003) ^ Float.floatToIntBits(this.f22817d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f22814a + ", maxZoomRatio=" + this.f22815b + ", minZoomRatio=" + this.f22816c + ", linearZoom=" + this.f22817d + "}";
    }
}
