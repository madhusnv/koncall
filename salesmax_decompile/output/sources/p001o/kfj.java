package p001o;

import android.widget.ImageView;

/* loaded from: classes6.dex */
public final class kfj {

    /* renamed from: a */
    public float f32157a;

    /* renamed from: b */
    public float f32158b;

    /* renamed from: c */
    public float f32159c;

    /* renamed from: d */
    public ImageView.ScaleType f32160d;

    public kfj(float f, float f2, float f3, ImageView.ScaleType scaleType) {
        this.f32157a = f;
        this.f32158b = f2;
        this.f32159c = f3;
        this.f32160d = scaleType;
    }

    /* renamed from: a */
    public final float m35637a() {
        return this.f32158b;
    }

    /* renamed from: b */
    public final float m35638b() {
        return this.f32159c;
    }

    /* renamed from: c */
    public final float m35639c() {
        return this.f32157a;
    }

    /* renamed from: d */
    public final ImageView.ScaleType m35640d() {
        return this.f32160d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfj)) {
            return false;
        }
        kfj kfjVar = (kfj) obj;
        return sq8.m48644c(Float.valueOf(this.f32157a), Float.valueOf(kfjVar.f32157a)) && sq8.m48644c(Float.valueOf(this.f32158b), Float.valueOf(kfjVar.f32158b)) && sq8.m48644c(Float.valueOf(this.f32159c), Float.valueOf(kfjVar.f32159c)) && this.f32160d == kfjVar.f32160d;
    }

    public int hashCode() {
        int iHashCode = ((((Float.hashCode(this.f32157a) * 31) + Float.hashCode(this.f32158b)) * 31) + Float.hashCode(this.f32159c)) * 31;
        ImageView.ScaleType scaleType = this.f32160d;
        return iHashCode + (scaleType == null ? 0 : scaleType.hashCode());
    }

    public String toString() {
        return "ZoomVariables(scale=" + this.f32157a + ", focusX=" + this.f32158b + ", focusY=" + this.f32159c + ", scaleType=" + this.f32160d + ')';
    }
}
