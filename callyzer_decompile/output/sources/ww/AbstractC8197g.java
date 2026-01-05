package ww;

import uw.C7565i;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ww.g */
/* loaded from: classes3.dex */
public abstract class AbstractC8197g extends AbstractC8191a {
    public AbstractC8197g(InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        if (interfaceC7559c != null && interfaceC7559c.getContext() != C7565i.f36440a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // uw.InterfaceC7559c
    public final InterfaceC7564h getContext() {
        return C7565i.f36440a;
    }
}
