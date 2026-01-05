package tx;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tx.f */
/* loaded from: classes3.dex */
public final class C7246f extends AbstractC7241a {

    /* renamed from: d */
    public final Thread f34626d;

    /* renamed from: e */
    public final w0 f34627e;

    public C7246f(InterfaceC7564h interfaceC7564h, Thread thread, w0 w0Var) {
        super(interfaceC7564h, true);
        this.f34626d = thread;
        this.f34627e = w0Var;
    }

    @Override // tx.k1
    /* renamed from: k */
    public final void mo13511k(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f34626d;
        if (AbstractC4154l.m8918a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
