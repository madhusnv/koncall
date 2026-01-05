package p001o;

import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public abstract class al6 {
    /* renamed from: a */
    public static final CancellationException m17345a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
