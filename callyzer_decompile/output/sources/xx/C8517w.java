package xx;

import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import ww.InterfaceC8194d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.w */
/* loaded from: classes3.dex */
public final class C8517w implements InterfaceC7559c, InterfaceC8194d {

    /* renamed from: a */
    public final InterfaceC7559c f41442a;

    /* renamed from: b */
    public final InterfaceC7564h f41443b;

    public C8517w(InterfaceC7559c interfaceC7559c, InterfaceC7564h interfaceC7564h) {
        this.f41442a = interfaceC7559c;
        this.f41443b = interfaceC7564h;
    }

    @Override // ww.InterfaceC8194d
    public final InterfaceC8194d getCallerFrame() {
        InterfaceC7559c interfaceC7559c = this.f41442a;
        if (interfaceC7559c instanceof InterfaceC8194d) {
            return (InterfaceC8194d) interfaceC7559c;
        }
        return null;
    }

    @Override // uw.InterfaceC7559c
    public final InterfaceC7564h getContext() {
        return this.f41443b;
    }

    @Override // uw.InterfaceC7559c
    public final void resumeWith(Object obj) {
        this.f41442a.resumeWith(obj);
    }
}
