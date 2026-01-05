package qw;

import ex.InterfaceC2137a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qw.o */
/* loaded from: classes3.dex */
public final class C6365o implements InterfaceC6357g, Serializable {

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f30759c = AtomicReferenceFieldUpdater.newUpdater(C6365o.class, Object.class, "b");

    /* renamed from: a */
    public volatile InterfaceC2137a f30760a;

    /* renamed from: b */
    public volatile Object f30761b;

    @Override // qw.InterfaceC6357g
    public final Object getValue() {
        Object obj = this.f30761b;
        C6374x c6374x = C6374x.f30774a;
        if (obj != c6374x) {
            return obj;
        }
        InterfaceC2137a interfaceC2137a = this.f30760a;
        if (interfaceC2137a != null) {
            Object objInvoke = interfaceC2137a.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30759c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c6374x, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c6374x) {
                }
            }
            this.f30760a = null;
            return objInvoke;
        }
        return this.f30761b;
    }

    @Override // qw.InterfaceC6357g
    public final boolean isInitialized() {
        return this.f30761b != C6374x.f30774a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
