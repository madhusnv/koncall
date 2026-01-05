package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.y */
/* loaded from: classes.dex */
public final class C3571y extends c0 {

    /* renamed from: c */
    public final float f19117c;

    /* renamed from: d */
    public final float f19118d;

    /* renamed from: e */
    public final float f19119e;

    /* renamed from: f */
    public final float f19120f;

    public C3571y(float f6, float f10, float f11, float f12) {
        super(2);
        this.f19117c = f6;
        this.f19118d = f10;
        this.f19119e = f11;
        this.f19120f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3571y)) {
            return false;
        }
        C3571y c3571y = (C3571y) obj;
        return Float.compare(this.f19117c, c3571y.f19117c) == 0 && Float.compare(this.f19118d, c3571y.f19118d) == 0 && Float.compare(this.f19119e, c3571y.f19119e) == 0 && Float.compare(this.f19120f, c3571y.f19120f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19120f) + AbstractC1452a.m4555b(this.f19119e, AbstractC1452a.m4555b(this.f19118d, Float.hashCode(this.f19117c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f19117c);
        sb2.append(", dy1=");
        sb2.append(this.f19118d);
        sb2.append(", dx2=");
        sb2.append(this.f19119e);
        sb2.append(", dy2=");
        return AbstractC1452a.m4562i(sb2, this.f19120f, ')');
    }
}
