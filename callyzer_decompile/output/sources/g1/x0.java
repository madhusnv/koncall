package g1;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a */
    public final float f11114a;

    /* renamed from: b */
    public final float f11115b;

    /* renamed from: c */
    public final long f11116c;

    public x0(float f6, float f10, long j6) {
        this.f11114a = f6;
        this.f11115b = f10;
        this.f11116c = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Float.compare(this.f11114a, x0Var.f11114a) == 0 && Float.compare(this.f11115b, x0Var.f11115b) == 0 && this.f11116c == x0Var.f11116c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11116c) + AbstractC1452a.m4555b(this.f11115b, Float.hashCode(this.f11114a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f11114a + ", distance=" + this.f11115b + ", duration=" + this.f11116c + ')';
    }
}
