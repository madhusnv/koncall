package d3;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import c6.k1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d3.m */
/* loaded from: classes.dex */
public final class C1559m {

    /* renamed from: a */
    public final ColorFilter f7785a;

    /* renamed from: b */
    public final long f7786b;

    /* renamed from: c */
    public final int f7787c;

    public C1559m(int i10, long j6) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            k1.m2440e();
            porterDuffColorFilter = k1.m2436a(h0.m5149u(j6), AbstractC1548b.m5092d(i10));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(h0.m5149u(j6), AbstractC1548b.m5093e(i10));
        }
        this.f7785a = porterDuffColorFilter;
        this.f7786b = j6;
        this.f7787c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559m)) {
            return false;
        }
        C1559m c1559m = (C1559m) obj;
        return C1565s.m5187c(this.f7786b, c1559m.f7786b) && this.f7787c == c1559m.f7787c;
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Integer.hashCode(this.f7787c) + (Long.hashCode(this.f7786b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        i0.m0.m7391x(this.f7786b, ", blendMode=", sb2);
        int i10 = this.f7787c;
        sb2.append((Object) (i10 == 0 ? "Clear" : i10 == 1 ? "Src" : i10 == 2 ? "Dst" : i10 == 3 ? "SrcOver" : i10 == 4 ? "DstOver" : i10 == 5 ? "SrcIn" : i10 == 6 ? "DstIn" : i10 == 7 ? "SrcOut" : i10 == 8 ? "DstOut" : i10 == 9 ? "SrcAtop" : i10 == 10 ? "DstAtop" : i10 == 11 ? "Xor" : i10 == 12 ? "Plus" : i10 == 13 ? "Modulate" : i10 == 14 ? "Screen" : i10 == 15 ? "Overlay" : i10 == 16 ? "Darken" : i10 == 17 ? "Lighten" : i10 == 18 ? "ColorDodge" : i10 == 19 ? "ColorBurn" : i10 == 20 ? "HardLight" : i10 == 21 ? "Softlight" : i10 == 22 ? "Difference" : i10 == 23 ? "Exclusion" : i10 == 24 ? "Multiply" : i10 == 25 ? "Hue" : i10 == 26 ? "Saturation" : i10 == 27 ? "Color" : i10 == 28 ? "Luminosity" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }
}
