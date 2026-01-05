package p020v;

import android.util.Range;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.d */
/* loaded from: classes.dex */
public final class C7594d {

    /* renamed from: a */
    public final int f36520a;

    /* renamed from: b */
    public final boolean f36521b;

    /* renamed from: c */
    public final int f36522c;

    /* renamed from: d */
    public final boolean f36523d;

    /* renamed from: e */
    public final boolean f36524e;

    /* renamed from: f */
    public final boolean f36525f;

    /* renamed from: g */
    public final boolean f36526g;

    /* renamed from: h */
    public final boolean f36527h;

    /* renamed from: i */
    public final Range f36528i;

    /* renamed from: j */
    public final boolean f36529j;

    public C7594d(int i10, boolean z6, int i11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Range range, boolean z15) {
        this.f36520a = i10;
        this.f36521b = z6;
        this.f36522c = i11;
        this.f36523d = z10;
        this.f36524e = z11;
        this.f36525f = z12;
        this.f36526g = z13;
        this.f36527h = z14;
        if (range == null) {
            throw new NullPointerException("Null getTargetFpsRange");
        }
        this.f36528i = range;
        this.f36529j = z15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7594d)) {
            return false;
        }
        C7594d c7594d = (C7594d) obj;
        return this.f36520a == c7594d.f36520a && this.f36521b == c7594d.f36521b && this.f36522c == c7594d.f36522c && this.f36523d == c7594d.f36523d && this.f36524e == c7594d.f36524e && this.f36525f == c7594d.f36525f && this.f36526g == c7594d.f36526g && this.f36527h == c7594d.f36527h && this.f36528i.equals(c7594d.f36528i) && this.f36529j == c7594d.f36529j;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f36520a ^ 1000003) * 1000003) ^ (this.f36521b ? 1231 : 1237)) * 1000003) ^ this.f36522c) * 1000003) ^ (this.f36523d ? 1231 : 1237)) * 1000003) ^ (this.f36524e ? 1231 : 1237)) * 1000003) ^ (this.f36525f ? 1231 : 1237)) * 1000003) ^ (this.f36526g ? 1231 : 1237)) * 1000003) ^ (this.f36527h ? 1231 : 1237)) * 1000003) ^ this.f36528i.hashCode()) * 1000003) ^ (this.f36529j ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeatureSettings{getCameraMode=");
        sb2.append(this.f36520a);
        sb2.append(", hasVideoCapture=");
        sb2.append(this.f36521b);
        sb2.append(", getRequiredMaxBitDepth=");
        sb2.append(this.f36522c);
        sb2.append(", isPreviewStabilizationOn=");
        sb2.append(this.f36523d);
        sb2.append(", isUltraHdrOn=");
        sb2.append(this.f36524e);
        sb2.append(", isHighSpeedOn=");
        sb2.append(this.f36525f);
        sb2.append(", isFeatureComboInvocation=");
        sb2.append(this.f36526g);
        sb2.append(", requiresFeatureComboQuery=");
        sb2.append(this.f36527h);
        sb2.append(", getTargetFpsRange=");
        sb2.append(this.f36528i);
        sb2.append(", isStrictFpsRequired=");
        return AbstractC5601a.m11242m(sb2, this.f36529j, "}");
    }
}
