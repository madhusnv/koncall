package p001o;

import java.io.Closeable;

/* loaded from: classes3.dex */
public interface h8f extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(t6f t6fVar, long j);
}
