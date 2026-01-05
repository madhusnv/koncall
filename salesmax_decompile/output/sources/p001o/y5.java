package p001o;

import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public final class y5 extends CancellationException {

    /* renamed from: a */
    public final transient Object f54899a;

    public y5(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f54899a = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
