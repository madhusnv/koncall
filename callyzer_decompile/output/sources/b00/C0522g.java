package b00;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.g */
/* loaded from: classes3.dex */
public final class C0522g implements h0 {
    @Override // b00.h0
    /* renamed from: f */
    public final k0 mo1538f() {
        return k0.f3639d;
    }

    @Override // b00.h0
    public final void h0(C0526k source, long j6) throws EOFException {
        AbstractC4154l.m8923f(source, "source");
        source.skip(j6);
    }

    @Override // b00.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // b00.h0, java.io.Flushable
    public final void flush() {
    }
}
