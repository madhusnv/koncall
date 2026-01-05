package al;

import java.util.ArrayDeque;
import java.util.Deque;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: al.n */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0186n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f562a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f563b;

    public /* synthetic */ RunnableC0186n(Runnable runnable, int i10) {
        this.f562a = i10;
        this.f563b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f562a) {
            case 0:
                Deque deque = (Deque) C0179g.f546b.get();
                AbstractC6840z.m13036g(deque);
                Runnable runnable = this.f563b;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                C0179g.f546b.set(new ArrayDeque());
                this.f563b.run();
                break;
        }
    }
}
