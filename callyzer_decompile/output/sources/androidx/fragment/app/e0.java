package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;
import p007h.AbstractC2757i;
import p007h.InterfaceC2750b;
import p008i.AbstractC3064a;
import p016r.InterfaceC6409a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 extends g0 {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC6409a f2498a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f2499b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC3064a f2500c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2750b f2501d;

    /* renamed from: e */
    public final /* synthetic */ j0 f2502e;

    public e0(j0 j0Var, InterfaceC6409a interfaceC6409a, AtomicReference atomicReference, AbstractC3064a abstractC3064a, InterfaceC2750b interfaceC2750b) {
        this.f2502e = j0Var;
        this.f2498a = interfaceC6409a;
        this.f2499b = atomicReference;
        this.f2500c = abstractC3064a;
        this.f2501d = interfaceC2750b;
    }

    @Override // androidx.fragment.app.g0
    /* renamed from: a */
    public final void mo1095a() {
        j0 j0Var = this.f2502e;
        this.f2499b.set(((AbstractC2757i) this.f2498a.apply(null)).m6751c(j0Var.generateActivityResultKey(), j0Var, this.f2500c, this.f2501d));
    }
}
