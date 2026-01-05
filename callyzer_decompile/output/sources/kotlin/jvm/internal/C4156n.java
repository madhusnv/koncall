package kotlin.jvm.internal;

import lx.InterfaceC4563b;
import lx.InterfaceC4568g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kotlin.jvm.internal.n */
/* loaded from: classes3.dex */
public class C4156n extends AbstractC4157o implements InterfaceC4568g {
    public C4156n(Class cls, String str, String str2, int i10) {
        super(AbstractC4145c.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC4145c
    public final InterfaceC4563b computeReflected() {
        a0.f21154a.getClass();
        return this;
    }

    @Override // lx.InterfaceC4572k
    public Object get(Object obj) {
        getGetter();
        throw null;
    }

    @Override // lx.InterfaceC4572k
    public final void getGetter() {
        ((C4156n) ((InterfaceC4568g) getReflected())).getGetter();
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
