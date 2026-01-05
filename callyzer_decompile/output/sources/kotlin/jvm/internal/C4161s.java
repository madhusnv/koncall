package kotlin.jvm.internal;

import lx.InterfaceC4563b;
import lx.InterfaceC4572k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kotlin.jvm.internal.s */
/* loaded from: classes3.dex */
public class C4161s extends AbstractC4163u implements InterfaceC4572k {
    public C4161s(Class cls, String str, String str2, int i10) {
        super(AbstractC4145c.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC4145c
    public final InterfaceC4563b computeReflected() {
        a0.f21154a.getClass();
        return this;
    }

    public Object get(Object obj) {
        getGetter();
        throw null;
    }

    @Override // lx.InterfaceC4572k
    public final void getGetter() {
        ((InterfaceC4572k) getReflected()).getGetter();
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
