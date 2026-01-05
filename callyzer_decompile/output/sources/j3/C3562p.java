package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.p */
/* loaded from: classes.dex */
public final class C3562p extends c0 {

    /* renamed from: c */
    public final float f19085c;

    /* renamed from: d */
    public final float f19086d;

    /* renamed from: e */
    public final float f19087e;

    /* renamed from: f */
    public final float f19088f;

    public C3562p(float f6, float f10, float f11, float f12) {
        super(1);
        this.f19085c = f6;
        this.f19086d = f10;
        this.f19087e = f11;
        this.f19088f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3562p)) {
            return false;
        }
        C3562p c3562p = (C3562p) obj;
        return Float.compare(this.f19085c, c3562p.f19085c) == 0 && Float.compare(this.f19086d, c3562p.f19086d) == 0 && Float.compare(this.f19087e, c3562p.f19087e) == 0 && Float.compare(this.f19088f, c3562p.f19088f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19088f) + AbstractC1452a.m4555b(this.f19087e, AbstractC1452a.m4555b(this.f19086d, Float.hashCode(this.f19085c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f19085c);
        sb2.append(", y1=");
        sb2.append(this.f19086d);
        sb2.append(", x2=");
        sb2.append(this.f19087e);
        sb2.append(", y2=");
        return AbstractC1452a.m4562i(sb2, this.f19088f, ')');
    }
}
