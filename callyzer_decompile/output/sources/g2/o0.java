package g2;

import com.sun.mail.util.AbstractC1452a;
import s4.C6750f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a */
    public final float f12234a;

    /* renamed from: b */
    public final float f12235b;

    /* renamed from: c */
    public final float f12236c;

    /* renamed from: d */
    public final float f12237d;

    /* renamed from: e */
    public final float f12238e;

    public o0(float f6, float f10, float f11, float f12, float f13) {
        this.f12234a = f6;
        this.f12235b = f10;
        this.f12236c = f11;
        this.f12237d = f12;
        this.f12238e = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return C6750f.m12935a(this.f12234a, o0Var.f12234a) && C6750f.m12935a(this.f12235b, o0Var.f12235b) && C6750f.m12935a(this.f12236c, o0Var.f12236c) && C6750f.m12935a(this.f12237d, o0Var.f12237d) && C6750f.m12935a(this.f12238e, o0Var.f12238e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f12238e) + AbstractC1452a.m4555b(this.f12237d, AbstractC1452a.m4555b(this.f12236c, AbstractC1452a.m4555b(this.f12235b, Float.hashCode(this.f12234a) * 31, 31), 31), 31);
    }
}
