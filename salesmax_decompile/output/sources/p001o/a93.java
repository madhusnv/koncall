package p001o;

import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public final class a93 extends CancellationException {
    public a93() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
