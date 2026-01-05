package ay;

import tx.AbstractC7262v;
import uw.InterfaceC7564h;
import yx.AbstractC8808b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ay.m */
/* loaded from: classes3.dex */
public final class C0503m extends AbstractC7262v {

    /* renamed from: c */
    public static final C0503m f3552c = new C0503m();

    @Override // tx.AbstractC7262v
    public final void B0(InterfaceC7564h interfaceC7564h, Runnable runnable) {
        C0496f.f3540d.f3542c.m1494j(runnable, true, false);
    }

    @Override // tx.AbstractC7262v
    public final void C0(InterfaceC7564h interfaceC7564h, Runnable runnable) {
        C0496f.f3540d.f3542c.m1494j(runnable, true, true);
    }

    @Override // tx.AbstractC7262v
    public final AbstractC7262v E0(int i10) {
        AbstractC8808b.m16243c(i10);
        return i10 >= AbstractC0502l.f3549d ? this : super.E0(i10);
    }

    @Override // tx.AbstractC7262v
    public final String toString() {
        return "Dispatchers.IO";
    }
}
