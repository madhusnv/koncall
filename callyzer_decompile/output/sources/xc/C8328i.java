package xc;

import b00.C0526k;
import b00.i0;
import b00.k0;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import wc.C7985s;
import wc.e0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xc.i */
/* loaded from: classes.dex */
public final class C8328i implements i0 {

    /* renamed from: a */
    public final e0 f39902a;

    public C8328i(e0 delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f39902a = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f39902a.close();
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        return k0.f3639d;
    }

    @Override // b00.i0
    public final long g0(C0526k sink, long j6) {
        AbstractC4154l.m8923f(sink, "sink");
        return this.f39902a.read(new C7985s(sink), j6);
    }
}
