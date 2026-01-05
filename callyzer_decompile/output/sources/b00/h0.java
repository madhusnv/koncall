package b00;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public interface h0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    void close();

    /* renamed from: f */
    k0 mo1538f();

    void flush();

    void h0(C0526k c0526k, long j6);
}
