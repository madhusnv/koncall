package xc;

import b00.C0526k;
import b00.h0;
import b00.k0;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import wc.C7985s;
import wc.d0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xc.h */
/* loaded from: classes.dex */
public final class C8327h implements h0 {

    /* renamed from: a */
    public final d0 f39901a;

    public C8327h(d0 delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f39901a = delegate;
    }

    @Override // b00.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        this.f39901a.close();
    }

    @Override // b00.h0
    /* renamed from: f */
    public final k0 mo1538f() {
        return k0.f3639d;
    }

    @Override // b00.h0, java.io.Flushable
    public final void flush() {
        this.f39901a.flush();
    }

    @Override // b00.h0
    public final void h0(C0526k source, long j6) {
        AbstractC4154l.m8923f(source, "source");
        this.f39901a.m0(new C7985s(source), j6);
    }
}
