package i1;

import androidx.compose.foundation.MutationInterruptedException;
import dy.AbstractC1856d;
import dy.C1855c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a */
    public final AtomicReference f16806a = new AtomicReference(null);

    /* renamed from: b */
    public final C1855c f16807b = AbstractC1856d.m5490a();

    /* renamed from: a */
    public static final void m7483a(b1 b1Var, z0 z0Var) {
        AtomicReference atomicReference = b1Var.f16806a;
        while (true) {
            z0 z0Var2 = (z0) atomicReference.get();
            if (z0Var2 != null && z0Var.f17018a.compareTo(z0Var2.f17018a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(z0Var2, z0Var)) {
                if (atomicReference.get() != z0Var2) {
                    break;
                }
            }
            if (z0Var2 != null) {
                z0Var2.f17019b.mo13510j(new MutationInterruptedException());
                return;
            }
            return;
        }
    }
}
