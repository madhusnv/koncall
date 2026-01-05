package p001o;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class kba extends CancellationException {
    public kba() {
        super("The coroutine scope left the composition");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
