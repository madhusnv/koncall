package androidx.fragment.app;

import p007h.AbstractC2757i;
import p007h.InterfaceC2758j;
import p016r.InterfaceC6409a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 implements InterfaceC6409a {

    /* renamed from: a */
    public final /* synthetic */ int f2488a;

    /* renamed from: b */
    public final /* synthetic */ Object f2489b;

    public /* synthetic */ d0(int i10, Object obj) {
        this.f2488a = i10;
        this.f2489b = obj;
    }

    @Override // p016r.InterfaceC6409a
    public final Object apply(Object obj) {
        switch (this.f2488a) {
            case 0:
                j0 j0Var = (j0) this.f2489b;
                Object obj2 = j0Var.mHost;
                return obj2 instanceof InterfaceC2758j ? ((InterfaceC2758j) obj2).getActivityResultRegistry() : j0Var.requireActivity().getActivityResultRegistry();
            default:
                return (AbstractC2757i) this.f2489b;
        }
    }
}
