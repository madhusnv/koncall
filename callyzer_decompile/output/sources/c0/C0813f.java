package c0;

import android.graphics.Matrix;
import i0.r2;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.f */
/* loaded from: classes.dex */
public final class C0813f implements w0 {

    /* renamed from: a */
    public final r2 f5080a;

    /* renamed from: b */
    public final long f5081b;

    /* renamed from: c */
    public final int f5082c;

    /* renamed from: d */
    public final Matrix f5083d;

    /* renamed from: e */
    public final int f5084e;

    public C0813f(r2 r2Var, long j6, int i10, Matrix matrix, int i11) {
        if (r2Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f5080a = r2Var;
        this.f5081b = j6;
        this.f5082c = i10;
        this.f5083d = matrix;
        this.f5084e = i11;
    }

    @Override // c0.w0
    /* renamed from: a */
    public final r2 mo2193a() {
        return this.f5080a;
    }

    @Override // c0.w0
    /* renamed from: b */
    public final int mo2194b() {
        return this.f5084e;
    }

    @Override // c0.w0
    /* renamed from: c */
    public final long mo2195c() {
        return this.f5081b;
    }

    @Override // c0.w0
    /* renamed from: d */
    public final int mo2196d() {
        return this.f5082c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0813f) {
            C0813f c0813f = (C0813f) obj;
            if (this.f5080a.equals(c0813f.f5080a) && this.f5081b == c0813f.f5081b && this.f5082c == c0813f.f5082c && this.f5083d.equals(c0813f.f5083d) && this.f5084e == c0813f.f5084e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f5080a.hashCode() ^ 1000003) * 1000003;
        long j6 = this.f5081b;
        return ((((((iHashCode ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f5082c) * 1000003) ^ this.f5083d.hashCode()) * 1000003) ^ this.f5084e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb2.append(this.f5080a);
        sb2.append(", timestamp=");
        sb2.append(this.f5081b);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f5082c);
        sb2.append(", sensorToBufferTransformMatrix=");
        sb2.append(this.f5083d);
        sb2.append(", flashState=");
        return AbstractC5601a.m11233d(this.f5084e, "}", sb2);
    }
}
