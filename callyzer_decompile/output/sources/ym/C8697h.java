package ym;

import i00.InterfaceC3099d;
import i00.InterfaceC3102g;
import i00.InterfaceC3106k;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.x0;
import pw.InterfaceC6043a;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ym.h */
/* loaded from: classes3.dex */
public final class C8697h implements InterfaceC3099d {

    /* renamed from: a */
    public final InterfaceC3099d f42067a;

    /* renamed from: b */
    public final InterfaceC3106k f42068b;

    /* renamed from: c */
    public final InterfaceC6043a f42069c;

    /* renamed from: d */
    public final InterfaceC6043a f42070d;

    public C8697h(InterfaceC3099d interfaceC3099d, InterfaceC3106k interfaceC3106k, InterfaceC6043a deviceDeleteManager, InterfaceC6043a leadSubscriptionExpireManager) {
        AbstractC4154l.m8923f(deviceDeleteManager, "deviceDeleteManager");
        AbstractC4154l.m8923f(leadSubscriptionExpireManager, "leadSubscriptionExpireManager");
        this.f42067a = interfaceC3099d;
        this.f42068b = interfaceC3106k;
        this.f42069c = deviceDeleteManager;
        this.f42070d = leadSubscriptionExpireManager;
    }

    @Override // i00.InterfaceC3099d
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C8697h m16706clone() {
        InterfaceC3099d interfaceC3099dM16706clone = this.f42067a.m16691clone();
        AbstractC4154l.m8922e(interfaceC3099dM16706clone, "clone(...)");
        return new C8697h(interfaceC3099dM16706clone, this.f42068b, this.f42069c, this.f42070d);
    }

    @Override // i00.InterfaceC3099d
    public final void cancel() {
        this.f42067a.cancel();
    }

    @Override // i00.InterfaceC3099d
    /* renamed from: h */
    public final boolean mo7441h() {
        return this.f42067a.mo7441h();
    }

    @Override // i00.InterfaceC3099d
    /* renamed from: j */
    public final void mo7442j(InterfaceC3102g interfaceC3102g) {
        this.f42067a.mo7442j(new C8849i(25, interfaceC3102g, this));
    }

    @Override // i00.InterfaceC3099d
    /* renamed from: u */
    public final x0 mo7443u() {
        x0 x0VarMo7443u = this.f42067a.mo7443u();
        AbstractC4154l.m8922e(x0VarMo7443u, "request(...)");
        return x0VarMo7443u;
    }
}
