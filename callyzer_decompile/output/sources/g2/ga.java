package g2;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ga extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ boolean f11654a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6747c f11655b;

    /* renamed from: c */
    public final /* synthetic */ ka f11656c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f11657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(boolean z6, InterfaceC6747c interfaceC6747c, ka kaVar, InterfaceC2139c interfaceC2139c) {
        super(0);
        this.f11654a = z6;
        this.f11655b = interfaceC6747c;
        this.f11656c = kaVar;
        this.f11657d = interfaceC2139c;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        return new ja(this.f11654a, this.f11655b, this.f11656c, this.f11657d);
    }
}
