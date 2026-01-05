package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import k1.r1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class FlingCancellationException extends CancellationException {
    public FlingCancellationException() {
        super("The fling animation was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(r1.f20217a);
        return this;
    }
}
