package nd;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7563g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nd.c */
/* loaded from: classes.dex */
public final class C5012c implements InterfaceC5014e, InterfaceC5016g, InterfaceC5018i, InterfaceC7563g {
    @Override // nd.InterfaceC5018i
    /* renamed from: a */
    public InterfaceC5016g mo9905a(String str) {
        return C5015f.f24766a;
    }

    @Override // nd.InterfaceC5014e
    /* renamed from: d */
    public void mo212d(Throwable ex2) {
        AbstractC4154l.m8923f(ex2, "ex");
    }

    @Override // nd.InterfaceC5014e
    /* renamed from: e */
    public void mo213e(Object value, String key) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
    }

    @Override // nd.InterfaceC5016g
    /* renamed from: f */
    public void mo329f(Throwable th2, InterfaceC2137a interfaceC2137a) {
        mo331h(EnumC5011b.Warning);
    }

    @Override // nd.InterfaceC5016g
    /* renamed from: g */
    public void mo330g(Throwable th2, InterfaceC2137a interfaceC2137a) {
        mo331h(EnumC5011b.Trace);
    }

    @Override // nd.InterfaceC5016g
    /* renamed from: h */
    public boolean mo331h(EnumC5011b level) {
        AbstractC4154l.m8923f(level, "level");
        return false;
    }

    @Override // nd.InterfaceC5016g
    /* renamed from: i */
    public void mo332i(Throwable th2, InterfaceC2137a interfaceC2137a) {
        mo331h(EnumC5011b.Debug);
    }

    @Override // nd.InterfaceC5016g
    /* renamed from: n */
    public InterfaceC5014e mo9134n(EnumC5011b level) {
        AbstractC4154l.m8923f(level, "level");
        return C5013d.f24765a;
    }

    @Override // nd.InterfaceC5014e
    /* renamed from: c */
    public void mo211c() {
    }

    @Override // nd.InterfaceC5014e
    /* renamed from: m */
    public void mo221m(InterfaceC2137a interfaceC2137a) {
    }
}
