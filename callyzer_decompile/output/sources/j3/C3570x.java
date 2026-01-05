package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.x */
/* loaded from: classes.dex */
public final class C3570x extends c0 {

    /* renamed from: c */
    public final float f19113c;

    /* renamed from: d */
    public final float f19114d;

    /* renamed from: e */
    public final float f19115e;

    /* renamed from: f */
    public final float f19116f;

    public C3570x(float f6, float f10, float f11, float f12) {
        super(1);
        this.f19113c = f6;
        this.f19114d = f10;
        this.f19115e = f11;
        this.f19116f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3570x)) {
            return false;
        }
        C3570x c3570x = (C3570x) obj;
        return Float.compare(this.f19113c, c3570x.f19113c) == 0 && Float.compare(this.f19114d, c3570x.f19114d) == 0 && Float.compare(this.f19115e, c3570x.f19115e) == 0 && Float.compare(this.f19116f, c3570x.f19116f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19116f) + AbstractC1452a.m4555b(this.f19115e, AbstractC1452a.m4555b(this.f19114d, Float.hashCode(this.f19113c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f19113c);
        sb2.append(", dy1=");
        sb2.append(this.f19114d);
        sb2.append(", dx2=");
        sb2.append(this.f19115e);
        sb2.append(", dy2=");
        return AbstractC1452a.m4562i(sb2, this.f19116f, ')');
    }
}
