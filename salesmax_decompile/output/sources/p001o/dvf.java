package p001o;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes6.dex */
public interface dvf extends Closeable, Flushable {
    void M0(rl1 rl1Var, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    nmh timeout();
}
