package b00;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.s */
/* loaded from: classes3.dex */
public abstract class AbstractC0534s implements i0 {

    /* renamed from: a */
    public final i0 f3665a;

    public AbstractC0534s(i0 delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f3665a = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f3665a.close();
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        return this.f3665a.mo1532f();
    }

    @Override // b00.i0
    public long g0(C0526k sink, long j6) {
        AbstractC4154l.m8923f(sink, "sink");
        return this.f3665a.g0(sink, j6);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f3665a + ')';
    }
}
