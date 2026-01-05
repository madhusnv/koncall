package f3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f3.h */
/* loaded from: classes.dex */
public final class C2202h extends AbstractC2199e {

    /* renamed from: a */
    public final float f10130a;

    /* renamed from: b */
    public final float f10131b;

    /* renamed from: c */
    public final int f10132c;

    /* renamed from: d */
    public final int f10133d;

    public C2202h(float f6, float f10, int i10, int i11, int i12) {
        f10 = (i12 & 2) != 0 ? 4.0f : f10;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f10130a = f6;
        this.f10131b = f10;
        this.f10132c = i10;
        this.f10133d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2202h)) {
            return false;
        }
        C2202h c2202h = (C2202h) obj;
        return this.f10130a == c2202h.f10130a && this.f10131b == c2202h.f10131b && this.f10132c == c2202h.f10132c && this.f10133d == c2202h.f10133d;
    }

    public final int hashCode() {
        return AbstractC1452a.m4556c(this.f10133d, AbstractC1452a.m4556c(this.f10132c, AbstractC1452a.m4555b(this.f10131b, Float.hashCode(this.f10130a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f10130a);
        sb2.append(", miter=");
        sb2.append(this.f10131b);
        sb2.append(", cap=");
        String str = "Unknown";
        int i10 = this.f10132c;
        sb2.append((Object) (i10 == 0 ? "Butt" : i10 == 1 ? "Round" : i10 == 2 ? "Square" : "Unknown"));
        sb2.append(", join=");
        int i11 = this.f10133d;
        if (i11 == 0) {
            str = "Miter";
        } else if (i11 == 1) {
            str = "Round";
        } else if (i11 == 2) {
            str = "Bevel";
        }
        sb2.append((Object) str);
        sb2.append(", pathEffect=null)");
        return sb2.toString();
    }
}
