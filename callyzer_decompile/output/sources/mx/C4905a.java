package mx;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mx.a */
/* loaded from: classes3.dex */
public final class C4905a implements InterfaceC4911g {

    /* renamed from: a */
    public final AtomicReference f24440a;

    public C4905a(InterfaceC4911g interfaceC4911g) {
        this.f24440a = new AtomicReference(interfaceC4911g);
    }

    @Override // mx.InterfaceC4911g
    public final Iterator iterator() {
        InterfaceC4911g interfaceC4911g = (InterfaceC4911g) this.f24440a.getAndSet(null);
        if (interfaceC4911g != null) {
            return interfaceC4911g.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
