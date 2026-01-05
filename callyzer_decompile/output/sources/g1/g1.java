package g1;

import ex.InterfaceC2139c;
import h1.InterfaceC2794y;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a */
    public final AbstractC4155m f10995a;

    /* renamed from: b */
    public final InterfaceC2794y f10996b;

    /* JADX WARN: Multi-variable type inference failed */
    public g1(InterfaceC2139c interfaceC2139c, InterfaceC2794y interfaceC2794y) {
        this.f10995a = (AbstractC4155m) interfaceC2139c;
        this.f10996b = interfaceC2794y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f10995a.equals(g1Var.f10995a) && this.f10996b.equals(g1Var.f10996b);
    }

    public final int hashCode() {
        return this.f10996b.hashCode() + (this.f10995a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f10995a + ", animationSpec=" + this.f10996b + ')';
    }
}
