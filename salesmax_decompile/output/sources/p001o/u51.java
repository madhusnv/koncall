package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import p001o.bgg;

/* loaded from: classes2.dex */
public final class u51 extends bgg.AbstractC12390h {

    /* renamed from: a */
    public final Rect f48346a;

    /* renamed from: b */
    public final int f48347b;

    /* renamed from: c */
    public final int f48348c;

    /* renamed from: d */
    public final boolean f48349d;

    /* renamed from: e */
    public final Matrix f48350e;

    /* renamed from: f */
    public final boolean f48351f;

    public u51(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f48346a = rect;
        this.f48347b = i;
        this.f48348c = i2;
        this.f48349d = z;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f48350e = matrix;
        this.f48351f = z2;
    }

    @Override // p001o.bgg.AbstractC12390h
    /* renamed from: a */
    public Rect mo18943a() {
        return this.f48346a;
    }

    @Override // p001o.bgg.AbstractC12390h
    /* renamed from: b */
    public int mo18944b() {
        return this.f48347b;
    }

    @Override // p001o.bgg.AbstractC12390h
    /* renamed from: c */
    public Matrix mo18945c() {
        return this.f48350e;
    }

    @Override // p001o.bgg.AbstractC12390h
    /* renamed from: d */
    public int mo18946d() {
        return this.f48348c;
    }

    @Override // p001o.bgg.AbstractC12390h
    /* renamed from: e */
    public boolean mo18947e() {
        return this.f48349d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bgg.AbstractC12390h)) {
            return false;
        }
        bgg.AbstractC12390h abstractC12390h = (bgg.AbstractC12390h) obj;
        return this.f48346a.equals(abstractC12390h.mo18943a()) && this.f48347b == abstractC12390h.mo18944b() && this.f48348c == abstractC12390h.mo18946d() && this.f48349d == abstractC12390h.mo18947e() && this.f48350e.equals(abstractC12390h.mo18945c()) && this.f48351f == abstractC12390h.mo18948f();
    }

    @Override // p001o.bgg.AbstractC12390h
    /* renamed from: f */
    public boolean mo18948f() {
        return this.f48351f;
    }

    public int hashCode() {
        return ((((((((((this.f48346a.hashCode() ^ 1000003) * 1000003) ^ this.f48347b) * 1000003) ^ this.f48348c) * 1000003) ^ (this.f48349d ? 1231 : 1237)) * 1000003) ^ this.f48350e.hashCode()) * 1000003) ^ (this.f48351f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f48346a + ", getRotationDegrees=" + this.f48347b + ", getTargetRotation=" + this.f48348c + ", hasCameraTransform=" + this.f48349d + ", getSensorToBufferTransform=" + this.f48350e + ", isMirroring=" + this.f48351f + "}";
    }
}
