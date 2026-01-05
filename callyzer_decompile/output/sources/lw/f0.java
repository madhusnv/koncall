package lw;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a */
    public final float f22579a;

    /* renamed from: b */
    public final float f22580b;

    /* renamed from: c */
    public final a0 f22581c;

    public f0(float f6, float f10, a0 a0Var) {
        this.f22579a = f6;
        this.f22580b = f10;
        this.f22581c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Float.compare(this.f22579a, f0Var.f22579a) == 0 && Float.compare(this.f22580b, f0Var.f22580b) == 0 && AbstractC4154l.m8918a(this.f22581c, f0Var.f22581c);
    }

    public final int hashCode() {
        int iM4555b = AbstractC1452a.m4555b(this.f22580b, Float.hashCode(this.f22579a) * 31, 31);
        this.f22581c.getClass();
        return iM4555b - 128922673;
    }

    public final String toString() {
        return "PieParameters(pieDiameter=" + this.f22579a + ", holeSize=" + this.f22580b + ", labelPlacement=" + this.f22581c + ")";
    }
}
