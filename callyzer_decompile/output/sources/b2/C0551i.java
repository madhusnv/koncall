package b2;

import a3.C0046e;
import d3.C1559m;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import hz.AbstractC3063b;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.i */
/* loaded from: classes.dex */
public final class C0551i extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ long f3760a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f3761b;

    /* renamed from: c */
    public final /* synthetic */ boolean f3762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0551i(long j6, InterfaceC2137a interfaceC2137a, boolean z6) {
        super(1);
        this.f3760a = j6;
        this.f3761b = interfaceC2137a;
        this.f3762c = z6;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        C0046e c0046e = (C0046e) obj;
        return c0046e.m156b(new C0550h(0, this.f3761b, AbstractC3063b.m7290f(c0046e, Float.intBitsToFloat((int) (c0046e.f201a.mo150e() >> 32)) / 2.0f), new C1559m(5, this.f3760a), this.f3762c));
    }
}
