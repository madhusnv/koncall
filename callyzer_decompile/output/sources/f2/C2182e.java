package f2;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f2.e */
/* loaded from: classes.dex */
public final class C2182e {

    /* renamed from: a */
    public final float f10081a;

    /* renamed from: b */
    public final float f10082b;

    /* renamed from: c */
    public final float f10083c;

    /* renamed from: d */
    public final float f10084d;

    public C2182e(float f6, float f10, float f11, float f12) {
        this.f10081a = f6;
        this.f10082b = f10;
        this.f10083c = f11;
        this.f10084d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2182e)) {
            return false;
        }
        C2182e c2182e = (C2182e) obj;
        return this.f10081a == c2182e.f10081a && this.f10082b == c2182e.f10082b && this.f10083c == c2182e.f10083c && this.f10084d == c2182e.f10084d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10084d) + AbstractC1452a.m4555b(this.f10083c, AbstractC1452a.m4555b(this.f10082b, Float.hashCode(this.f10081a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f10081a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f10082b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f10083c);
        sb2.append(", pressedAlpha=");
        return AbstractC1452a.m4562i(sb2, this.f10084d, ')');
    }
}
