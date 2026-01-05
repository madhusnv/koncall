package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.l */
/* loaded from: classes.dex */
public final class C3558l extends c0 {

    /* renamed from: c */
    public final float f19074c;

    /* renamed from: d */
    public final float f19075d;

    /* renamed from: e */
    public final float f19076e;

    /* renamed from: f */
    public final float f19077f;

    /* renamed from: g */
    public final float f19078g;

    /* renamed from: h */
    public final float f19079h;

    public C3558l(float f6, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f19074c = f6;
        this.f19075d = f10;
        this.f19076e = f11;
        this.f19077f = f12;
        this.f19078g = f13;
        this.f19079h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3558l)) {
            return false;
        }
        C3558l c3558l = (C3558l) obj;
        return Float.compare(this.f19074c, c3558l.f19074c) == 0 && Float.compare(this.f19075d, c3558l.f19075d) == 0 && Float.compare(this.f19076e, c3558l.f19076e) == 0 && Float.compare(this.f19077f, c3558l.f19077f) == 0 && Float.compare(this.f19078g, c3558l.f19078g) == 0 && Float.compare(this.f19079h, c3558l.f19079h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19079h) + AbstractC1452a.m4555b(this.f19078g, AbstractC1452a.m4555b(this.f19077f, AbstractC1452a.m4555b(this.f19076e, AbstractC1452a.m4555b(this.f19075d, Float.hashCode(this.f19074c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f19074c);
        sb2.append(", y1=");
        sb2.append(this.f19075d);
        sb2.append(", x2=");
        sb2.append(this.f19076e);
        sb2.append(", y2=");
        sb2.append(this.f19077f);
        sb2.append(", x3=");
        sb2.append(this.f19078g);
        sb2.append(", y3=");
        return AbstractC1452a.m4562i(sb2, this.f19079h, ')');
    }
}
