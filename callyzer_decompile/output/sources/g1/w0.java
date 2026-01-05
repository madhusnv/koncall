package g1;

import h1.InterfaceC2794y;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a */
    public final float f11112a;

    /* renamed from: b */
    public final InterfaceC2794y f11113b;

    public w0(float f6, InterfaceC2794y interfaceC2794y) {
        this.f11112a = f6;
        this.f11113b = interfaceC2794y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Float.compare(this.f11112a, w0Var.f11112a) == 0 && AbstractC4154l.m8918a(this.f11113b, w0Var.f11113b);
    }

    public final int hashCode() {
        return this.f11113b.hashCode() + (Float.hashCode(this.f11112a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f11112a + ", animationSpec=" + this.f11113b + ')';
    }
}
