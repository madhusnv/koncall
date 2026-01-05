package z0;

import d7.EnumC1644p;
import d7.InterfaceC1648t;
import d7.InterfaceC1649u;
import d7.i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z0.d */
/* loaded from: classes.dex */
public final class C8838d implements InterfaceC1648t {

    /* renamed from: a */
    public final C8839e f42545a;

    /* renamed from: b */
    public final InterfaceC1649u f42546b;

    public C8838d(InterfaceC1649u interfaceC1649u, C8839e c8839e) {
        this.f42546b = interfaceC1649u;
        this.f42545a = c8839e;
    }

    @i0(EnumC1644p.ON_DESTROY)
    public void onDestroy(InterfaceC1649u interfaceC1649u) {
        this.f42545a.m16305k(interfaceC1649u);
    }

    @i0(EnumC1644p.ON_START)
    public void onStart(InterfaceC1649u interfaceC1649u) {
        this.f42545a.m16300f(interfaceC1649u);
    }

    @i0(EnumC1644p.ON_STOP)
    public void onStop(InterfaceC1649u interfaceC1649u) {
        this.f42545a.m16301g(interfaceC1649u);
    }
}
