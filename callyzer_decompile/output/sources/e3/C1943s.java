package e3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e3.s */
/* loaded from: classes.dex */
public final class C1943s {

    /* renamed from: a */
    public final float f9176a;

    /* renamed from: b */
    public final float f9177b;

    public C1943s(float f6, float f10) {
        this.f9176a = f6;
        this.f9177b = f10;
    }

    /* renamed from: a */
    public final float[] m5692a() {
        float f6 = this.f9176a;
        float f10 = this.f9177b;
        return new float[]{f6 / f10, 1.0f, ((1.0f - f6) - f10) / f10};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1943s)) {
            return false;
        }
        C1943s c1943s = (C1943s) obj;
        return Float.compare(this.f9176a, c1943s.f9176a) == 0 && Float.compare(this.f9177b, c1943s.f9177b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9177b) + (Float.hashCode(this.f9176a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f9176a);
        sb2.append(", y=");
        return AbstractC1452a.m4562i(sb2, this.f9177b, ')');
    }
}
