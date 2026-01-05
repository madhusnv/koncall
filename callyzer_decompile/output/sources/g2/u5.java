package g2;

import com.sun.mail.util.AbstractC1452a;
import s4.C6750f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u5 {

    /* renamed from: a */
    public final float f12868a;

    /* renamed from: b */
    public final float f12869b;

    /* renamed from: c */
    public final float f12870c;

    /* renamed from: d */
    public final float f12871d;

    public u5(float f6, float f10, float f11, float f12) {
        this.f12868a = f6;
        this.f12869b = f10;
        this.f12870c = f11;
        this.f12871d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        if (C6750f.m12935a(this.f12868a, u5Var.f12868a) && C6750f.m12935a(this.f12869b, u5Var.f12869b) && C6750f.m12935a(this.f12870c, u5Var.f12870c)) {
            return C6750f.m12935a(this.f12871d, u5Var.f12871d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12871d) + AbstractC1452a.m4555b(this.f12870c, AbstractC1452a.m4555b(this.f12869b, Float.hashCode(this.f12868a) * 31, 31), 31);
    }
}
