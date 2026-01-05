package p001o;

/* loaded from: classes3.dex */
public interface y6f {
    boolean cancel(Throwable th);

    int getAvailableForRead();

    Throwable getClosedCause();

    boolean isClosedForRead();

    boolean isClosedForWrite();

    Object read(t6f t6fVar, long j, n64 n64Var);
}
