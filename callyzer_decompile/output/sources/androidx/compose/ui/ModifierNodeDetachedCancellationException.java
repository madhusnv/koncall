package androidx.compose.ui;

import java.util.concurrent.CancellationException;
import w2.AbstractC7862a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ModifierNodeDetachedCancellationException extends CancellationException {
    public ModifierNodeDetachedCancellationException() {
        super("The Modifier.Node was detached");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC7862a.f37640e);
        return this;
    }
}
