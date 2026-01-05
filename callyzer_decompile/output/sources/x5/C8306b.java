package x5;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import og.od;
import tx.C7251k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x5.b */
/* loaded from: classes.dex */
public final class C8306b extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a */
    public final C7251k f39854a;

    public C8306b(C7251k c7251k) {
        super(false);
        this.f39854a = c7251k;
    }

    public final void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            this.f39854a.resumeWith(od.m10796a(th2));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f39854a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
