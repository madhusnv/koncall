package p001o;

import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class zg2 {
    /* renamed from: a */
    public static final void m59386a(eee eeeVar, Throwable th) {
        if (th != null) {
            cancellationExceptionM17345a = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionM17345a == null) {
                cancellationExceptionM17345a = al6.m17345a("Channel was consumed, consumer had failed", th);
            }
        }
        eeeVar.mo23471f(cancellationExceptionM17345a);
    }
}
