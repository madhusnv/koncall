package kotlinx.coroutines;

import tx.AbstractC7262v;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class DispatchException extends Exception {

    /* renamed from: a */
    public final Throwable f21165a;

    public DispatchException(Throwable th2, AbstractC7262v abstractC7262v, InterfaceC7564h interfaceC7564h) {
        super("Coroutine dispatcher " + abstractC7262v + " threw an exception, context = " + interfaceC7564h, th2);
        this.f21165a = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f21165a;
    }
}
