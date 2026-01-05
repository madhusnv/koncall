package c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.j */
/* loaded from: classes.dex */
public final class C0817j {

    /* renamed from: a */
    public final Rect f5110a;

    /* renamed from: b */
    public final int f5111b;

    /* renamed from: c */
    public final int f5112c;

    /* renamed from: d */
    public final boolean f5113d;

    /* renamed from: e */
    public final Matrix f5114e;

    /* renamed from: f */
    public final boolean f5115f;

    public C0817j(Rect rect, int i10, int i11, boolean z6, Matrix matrix, boolean z10) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f5110a = rect;
        this.f5111b = i10;
        this.f5112c = i11;
        this.f5113d = z6;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f5114e = matrix;
        this.f5115f = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0817j) {
            C0817j c0817j = (C0817j) obj;
            if (this.f5110a.equals(c0817j.f5110a) && this.f5111b == c0817j.f5111b && this.f5112c == c0817j.f5112c && this.f5113d == c0817j.f5113d && this.f5114e.equals(c0817j.f5114e) && this.f5115f == c0817j.f5115f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f5110a.hashCode() ^ 1000003) * 1000003) ^ this.f5111b) * 1000003) ^ this.f5112c) * 1000003) ^ (this.f5113d ? 1231 : 1237)) * 1000003) ^ this.f5114e.hashCode()) * 1000003) ^ (this.f5115f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformationInfo{getCropRect=");
        sb2.append(this.f5110a);
        sb2.append(", getRotationDegrees=");
        sb2.append(this.f5111b);
        sb2.append(", getTargetRotation=");
        sb2.append(this.f5112c);
        sb2.append(", hasCameraTransform=");
        sb2.append(this.f5113d);
        sb2.append(", getSensorToBufferTransform=");
        sb2.append(this.f5114e);
        sb2.append(", isMirroring=");
        return AbstractC5601a.m11242m(sb2, this.f5115f, "}");
    }
}
