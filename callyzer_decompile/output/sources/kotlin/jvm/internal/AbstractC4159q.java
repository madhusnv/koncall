package kotlin.jvm.internal;

import lx.InterfaceC4563b;
import lx.InterfaceC4569h;
import lx.InterfaceC4570i;
import lx.InterfaceC4571j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kotlin.jvm.internal.q */
/* loaded from: classes3.dex */
public abstract class AbstractC4159q extends AbstractC4163u implements InterfaceC4571j {
    @Override // kotlin.jvm.internal.AbstractC4145c
    public InterfaceC4563b computeReflected() {
        a0.f21154a.getClass();
        return this;
    }

    @Override // lx.InterfaceC4571j
    public Object getDelegate() {
        return ((InterfaceC4571j) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ InterfaceC4569h getGetter() {
        mo16696getGetter();
        return null;
    }

    @Override // ex.InterfaceC2137a
    public Object invoke() {
        return get();
    }

    @Override // lx.InterfaceC4571j
    /* renamed from: getGetter, reason: collision with other method in class */
    public InterfaceC4570i mo16696getGetter() {
        ((InterfaceC4571j) getReflected()).mo16696getGetter();
        return null;
    }
}
