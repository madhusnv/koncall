package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.j */
/* loaded from: classes.dex */
public final class C3556j extends c0 {

    /* renamed from: c */
    public final float f19045c;

    /* renamed from: d */
    public final float f19046d;

    /* renamed from: e */
    public final float f19047e;

    /* renamed from: f */
    public final boolean f19048f;

    /* renamed from: g */
    public final boolean f19049g;

    /* renamed from: h */
    public final float f19050h;

    /* renamed from: i */
    public final float f19051i;

    public C3556j(float f6, float f10, float f11, boolean z6, boolean z10, float f12, float f13) {
        super(3);
        this.f19045c = f6;
        this.f19046d = f10;
        this.f19047e = f11;
        this.f19048f = z6;
        this.f19049g = z10;
        this.f19050h = f12;
        this.f19051i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3556j)) {
            return false;
        }
        C3556j c3556j = (C3556j) obj;
        return Float.compare(this.f19045c, c3556j.f19045c) == 0 && Float.compare(this.f19046d, c3556j.f19046d) == 0 && Float.compare(this.f19047e, c3556j.f19047e) == 0 && this.f19048f == c3556j.f19048f && this.f19049g == c3556j.f19049g && Float.compare(this.f19050h, c3556j.f19050h) == 0 && Float.compare(this.f19051i, c3556j.f19051i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19051i) + AbstractC1452a.m4555b(this.f19050h, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4555b(this.f19047e, AbstractC1452a.m4555b(this.f19046d, Float.hashCode(this.f19045c) * 31, 31), 31), 31, this.f19048f), 31, this.f19049g), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f19045c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f19046d);
        sb2.append(", theta=");
        sb2.append(this.f19047e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f19048f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f19049g);
        sb2.append(", arcStartX=");
        sb2.append(this.f19050h);
        sb2.append(", arcStartY=");
        return AbstractC1452a.m4562i(sb2, this.f19051i, ')');
    }
}
