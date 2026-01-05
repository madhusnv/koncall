package d7;

import g8.C2545e;
import kotlin.jvm.internal.AbstractC4154l;
import p004e.C1870e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 implements InterfaceC1647s, AutoCloseable {

    /* renamed from: a */
    public final String f8121a;

    /* renamed from: b */
    public final n0 f8122b;

    /* renamed from: c */
    public boolean f8123c;

    public o0(String str, n0 n0Var) {
        this.f8121a = str;
        this.f8122b = n0Var;
    }

    /* renamed from: h */
    public final void m5332h(AbstractC1646r lifecycle, C2545e registry) {
        AbstractC4154l.m8923f(registry, "registry");
        AbstractC4154l.m8923f(lifecycle, "lifecycle");
        if (this.f8123c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f8123c = true;
        lifecycle.mo5343a(this);
        registry.m6565c(this.f8121a, (C1870e) this.f8122b.f8119b.f268e);
    }

    @Override // d7.InterfaceC1647s
    /* renamed from: u */
    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
        if (enumC1644p == EnumC1644p.ON_DESTROY) {
            this.f8123c = false;
            interfaceC1649u.getLifecycle().mo5346d(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
