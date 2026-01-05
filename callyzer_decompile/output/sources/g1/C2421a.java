package g1;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.a */
/* loaded from: classes.dex */
public final class C2421a {

    /* renamed from: a */
    public final float f10915a;

    /* renamed from: b */
    public final float f10916b;

    public C2421a(float f6, float f10) {
        this.f10915a = f6;
        this.f10916b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2421a)) {
            return false;
        }
        C2421a c2421a = (C2421a) obj;
        return Float.compare(this.f10915a, c2421a.f10915a) == 0 && Float.compare(this.f10916b, c2421a.f10916b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10916b) + (Float.hashCode(this.f10915a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f10915a);
        sb2.append(", velocityCoefficient=");
        return AbstractC1452a.m4562i(sb2, this.f10916b, ')');
    }
}
