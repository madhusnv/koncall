package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.s */
/* loaded from: classes.dex */
public final class C3565s extends c0 {

    /* renamed from: c */
    public final float f19095c;

    /* renamed from: d */
    public final float f19096d;

    /* renamed from: e */
    public final float f19097e;

    /* renamed from: f */
    public final boolean f19098f;

    /* renamed from: g */
    public final boolean f19099g;

    /* renamed from: h */
    public final float f19100h;

    /* renamed from: i */
    public final float f19101i;

    public C3565s(float f6, float f10, float f11, boolean z6, boolean z10, float f12, float f13) {
        super(3);
        this.f19095c = f6;
        this.f19096d = f10;
        this.f19097e = f11;
        this.f19098f = z6;
        this.f19099g = z10;
        this.f19100h = f12;
        this.f19101i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3565s)) {
            return false;
        }
        C3565s c3565s = (C3565s) obj;
        return Float.compare(this.f19095c, c3565s.f19095c) == 0 && Float.compare(this.f19096d, c3565s.f19096d) == 0 && Float.compare(this.f19097e, c3565s.f19097e) == 0 && this.f19098f == c3565s.f19098f && this.f19099g == c3565s.f19099g && Float.compare(this.f19100h, c3565s.f19100h) == 0 && Float.compare(this.f19101i, c3565s.f19101i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19101i) + AbstractC1452a.m4555b(this.f19100h, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4555b(this.f19097e, AbstractC1452a.m4555b(this.f19096d, Float.hashCode(this.f19095c) * 31, 31), 31), 31, this.f19098f), 31, this.f19099g), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f19095c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f19096d);
        sb2.append(", theta=");
        sb2.append(this.f19097e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f19098f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f19099g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f19100h);
        sb2.append(", arcStartDy=");
        return AbstractC1452a.m4562i(sb2, this.f19101i, ')');
    }
}
