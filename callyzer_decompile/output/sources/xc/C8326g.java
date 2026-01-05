package xc;

import b00.i0;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import wc.C7985s;
import wc.e0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xc.g */
/* loaded from: classes.dex */
public final class C8326g implements e0 {

    /* renamed from: a */
    public final i0 f39900a;

    public C8326g(i0 delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f39900a = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f39900a.close();
    }

    @Override // wc.e0
    public final long read(C7985s sink, long j6) {
        AbstractC4154l.m8923f(sink, "sink");
        return this.f39900a.g0(sink.f38413a, j6);
    }
}
