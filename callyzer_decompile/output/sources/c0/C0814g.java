package c0;

import android.graphics.Rect;
import android.util.Size;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.g */
/* loaded from: classes.dex */
public final class C0814g {

    /* renamed from: a */
    public final Size f5098a;

    /* renamed from: b */
    public final Rect f5099b;

    /* renamed from: c */
    public final i0.g0 f5100c;

    /* renamed from: d */
    public final int f5101d;

    /* renamed from: e */
    public final boolean f5102e;

    public C0814g(Size size, Rect rect, i0.g0 g0Var, int i10, boolean z6) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f5098a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f5099b = rect;
        this.f5100c = g0Var;
        this.f5101d = i10;
        this.f5102e = z6;
    }

    public final boolean equals(Object obj) {
        i0.g0 g0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0814g) {
            C0814g c0814g = (C0814g) obj;
            i0.g0 g0Var2 = c0814g.f5100c;
            if (this.f5098a.equals(c0814g.f5098a) && this.f5099b.equals(c0814g.f5099b) && ((g0Var = this.f5100c) != null ? g0Var.equals(g0Var2) : g0Var2 == null) && this.f5101d == c0814g.f5101d && this.f5102e == c0814g.f5102e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f5098a.hashCode() ^ 1000003) * 1000003) ^ this.f5099b.hashCode()) * 1000003;
        i0.g0 g0Var = this.f5100c;
        return ((((iHashCode ^ (g0Var == null ? 0 : g0Var.hashCode())) * 1000003) ^ this.f5101d) * 1000003) ^ (this.f5102e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraInputInfo{inputSize=");
        sb2.append(this.f5098a);
        sb2.append(", inputCropRect=");
        sb2.append(this.f5099b);
        sb2.append(", cameraInternal=");
        sb2.append(this.f5100c);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f5101d);
        sb2.append(", mirroring=");
        return AbstractC5601a.m11242m(sb2, this.f5102e, "}");
    }
}
