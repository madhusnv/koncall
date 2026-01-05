package i00;

import java.util.concurrent.Executor;
import p020v.x0;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.l */
/* loaded from: classes3.dex */
public final class C3107l implements InterfaceC3099d {

    /* renamed from: a */
    public final Executor f16669a;

    /* renamed from: b */
    public final InterfaceC3099d f16670b;

    public C3107l(Executor executor, InterfaceC3099d interfaceC3099d) {
        this.f16669a = executor;
        this.f16670b = interfaceC3099d;
    }

    @Override // i00.InterfaceC3099d
    public final void cancel() {
        this.f16670b.cancel();
    }

    @Override // i00.InterfaceC3099d
    /* renamed from: h */
    public final boolean mo7441h() {
        return this.f16670b.mo7441h();
    }

    @Override // i00.InterfaceC3099d
    /* renamed from: j */
    public final void mo7442j(InterfaceC3102g interfaceC3102g) {
        this.f16670b.mo7442j(new C8849i(6, this, interfaceC3102g, false));
    }

    @Override // i00.InterfaceC3099d
    /* renamed from: u */
    public final x0 mo7443u() {
        return this.f16670b.mo7443u();
    }

    @Override // i00.InterfaceC3099d
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3099d m16691clone() {
        return new C3107l(this.f16669a, this.f16670b.m16691clone());
    }
}
