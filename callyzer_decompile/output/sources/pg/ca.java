package pg;

import r1.C6434s;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ca {
    /* renamed from: a */
    public static void m11577a(InterfaceFutureC8957d interfaceFutureC8957d) {
        if (!interfaceFutureC8957d.isDone()) {
            throw new IllegalStateException(t7.m11871c("Future was expected to be done: %s", interfaceFutureC8957d));
        }
        boolean z6 = false;
        while (true) {
            try {
                interfaceFutureC8957d.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th2) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: b */
    public static final int m11578b(C6434s c6434s, k1.x0 x0Var) {
        return (int) (x0Var == k1.x0.Vertical ? c6434s.f31051o & 4294967295L : c6434s.f31051o >> 32);
    }
}
