package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.t */
/* loaded from: classes.dex */
public final class C3566t extends c0 {

    /* renamed from: c */
    public final float f19102c;

    /* renamed from: d */
    public final float f19103d;

    /* renamed from: e */
    public final float f19104e;

    /* renamed from: f */
    public final float f19105f;

    /* renamed from: g */
    public final float f19106g;

    /* renamed from: h */
    public final float f19107h;

    public C3566t(float f6, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f19102c = f6;
        this.f19103d = f10;
        this.f19104e = f11;
        this.f19105f = f12;
        this.f19106g = f13;
        this.f19107h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3566t)) {
            return false;
        }
        C3566t c3566t = (C3566t) obj;
        return Float.compare(this.f19102c, c3566t.f19102c) == 0 && Float.compare(this.f19103d, c3566t.f19103d) == 0 && Float.compare(this.f19104e, c3566t.f19104e) == 0 && Float.compare(this.f19105f, c3566t.f19105f) == 0 && Float.compare(this.f19106g, c3566t.f19106g) == 0 && Float.compare(this.f19107h, c3566t.f19107h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19107h) + AbstractC1452a.m4555b(this.f19106g, AbstractC1452a.m4555b(this.f19105f, AbstractC1452a.m4555b(this.f19104e, AbstractC1452a.m4555b(this.f19103d, Float.hashCode(this.f19102c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f19102c);
        sb2.append(", dy1=");
        sb2.append(this.f19103d);
        sb2.append(", dx2=");
        sb2.append(this.f19104e);
        sb2.append(", dy2=");
        sb2.append(this.f19105f);
        sb2.append(", dx3=");
        sb2.append(this.f19106g);
        sb2.append(", dy3=");
        return AbstractC1452a.m4562i(sb2, this.f19107h, ')');
    }
}
