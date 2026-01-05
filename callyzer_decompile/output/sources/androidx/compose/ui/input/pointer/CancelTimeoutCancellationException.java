package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;
import p3.AbstractC5818p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CancelTimeoutCancellationException extends CancellationException {

    /* renamed from: a */
    public static final CancelTimeoutCancellationException f2122a = new CancelTimeoutCancellationException();

    private CancelTimeoutCancellationException() {
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC5818p.f28475c);
        return this;
    }
}
