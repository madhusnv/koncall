package r4;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.i */
/* loaded from: classes.dex */
public final class C6454i {

    /* renamed from: c */
    public static final C6454i f31112c = new C6454i(C6451f.f31108c, 17);

    /* renamed from: a */
    public final float f31113a;

    /* renamed from: b */
    public final int f31114b;

    public C6454i(float f6, int i10) {
        this.f31113a = f6;
        this.f31114b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6454i)) {
            return false;
        }
        C6454i c6454i = (C6454i) obj;
        float f6 = c6454i.f31113a;
        float f10 = C6451f.f31107b;
        return Float.compare(this.f31113a, f6) == 0 && this.f31114b == c6454i.f31114b;
    }

    public final int hashCode() {
        float f6 = C6451f.f31107b;
        return Integer.hashCode(0) + AbstractC1452a.m4556c(this.f31114b, Float.hashCode(this.f31113a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        sb2.append((Object) C6451f.m12443b(this.f31113a));
        sb2.append(", trim=");
        int i10 = this.f31114b;
        sb2.append((Object) (i10 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i10 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i10 == 17 ? "LineHeightStyle.Trim.Both" : i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb2.append(",mode=Mode(value=0))");
        return sb2.toString();
    }
}
