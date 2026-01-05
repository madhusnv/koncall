package ge;

import d7.AbstractC1646r;
import d7.EnumC1645q;
import d7.InterfaceC1633f;
import d7.InterfaceC1648t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ge.g */
/* loaded from: classes.dex */
public final class C2575g extends AbstractC1646r {

    /* renamed from: a */
    public static final C2575g f14000a = new C2575g();

    /* renamed from: b */
    public static final C2574f f14001b = new C2574f();

    @Override // d7.AbstractC1646r
    /* renamed from: a */
    public final void mo5343a(InterfaceC1648t interfaceC1648t) {
        if (!(interfaceC1648t instanceof InterfaceC1633f)) {
            throw new IllegalArgumentException((interfaceC1648t + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        InterfaceC1633f interfaceC1633f = (InterfaceC1633f) interfaceC1648t;
        C2574f c2574f = f14001b;
        interfaceC1633f.onCreate(c2574f);
        interfaceC1633f.onStart(c2574f);
        interfaceC1633f.onResume(c2574f);
    }

    @Override // d7.AbstractC1646r
    /* renamed from: b */
    public final EnumC1645q mo5344b() {
        return EnumC1645q.RESUMED;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // d7.AbstractC1646r
    /* renamed from: d */
    public final void mo5346d(InterfaceC1648t interfaceC1648t) {
    }
}
