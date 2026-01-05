package b3;

import k2.w0;
import kotlin.jvm.internal.AbstractC4157o;
import lx.InterfaceC4563b;
import lx.InterfaceC4567f;
import lx.InterfaceC4570i;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b3.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C0582n extends AbstractC4157o implements InterfaceC4567f {

    /* renamed from: a */
    public final /* synthetic */ int f3930a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0582n(int i10, int i11, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i10);
        this.f3930a = i11;
    }

    @Override // kotlin.jvm.internal.AbstractC4145c
    public final InterfaceC4563b computeReflected() {
        kotlin.jvm.internal.a0.f21154a.getClass();
        return this;
    }

    @Override // lx.InterfaceC4571j
    public final Object get() {
        switch (this.f3930a) {
            case 0:
                return ((C0585q) this.receiver).f3947l;
            case 1:
                return ((w0) this.receiver).getValue();
            default:
                return ((C7904v) this.receiver).getLayoutDirection();
        }
    }

    @Override // lx.InterfaceC4571j
    public final Object getDelegate() {
        return ((C0582n) ((InterfaceC4567f) getReflected())).getDelegate();
    }

    @Override // lx.InterfaceC4571j
    /* renamed from: getGetter */
    public final InterfaceC4570i mo16696getGetter() {
        ((C0582n) ((InterfaceC4567f) getReflected())).mo16696getGetter();
        return null;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        return get();
    }
}
