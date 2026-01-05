package p001o;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class hlb extends CancellationException {
    public hlb() {
        super("The Modifier.Node was detached");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
