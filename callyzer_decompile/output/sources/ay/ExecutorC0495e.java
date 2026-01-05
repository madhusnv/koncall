package ay;

import java.util.concurrent.Executor;
import tx.AbstractC7262v;
import tx.x0;
import uw.C7565i;
import uw.InterfaceC7564h;
import yx.AbstractC8808b;
import yx.AbstractC8825s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ay.e */
/* loaded from: classes3.dex */
public final class ExecutorC0495e extends x0 implements Executor {

    /* renamed from: c */
    public static final ExecutorC0495e f3538c = new ExecutorC0495e();

    /* renamed from: d */
    public static final AbstractC7262v f3539d;

    static {
        C0503m c0503m = C0503m.f3552c;
        int i10 = AbstractC8825s.f42520a;
        if (64 >= i10) {
            i10 = 64;
        }
        f3539d = c0503m.E0(AbstractC8808b.m16254n(i10, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // tx.AbstractC7262v
    public final void B0(InterfaceC7564h interfaceC7564h, Runnable runnable) {
        f3539d.B0(interfaceC7564h, runnable);
    }

    @Override // tx.AbstractC7262v
    public final void C0(InterfaceC7564h interfaceC7564h, Runnable runnable) {
        f3539d.C0(interfaceC7564h, runnable);
    }

    @Override // tx.AbstractC7262v
    public final AbstractC7262v E0(int i10) {
        return C0503m.f3552c.E0(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        B0(C7565i.f36440a, runnable);
    }

    @Override // tx.AbstractC7262v
    public final String toString() {
        return "Dispatchers.IO";
    }
}
