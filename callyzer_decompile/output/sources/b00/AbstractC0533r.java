package b00;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.r */
/* loaded from: classes3.dex */
public abstract class AbstractC0533r implements h0 {

    /* renamed from: a */
    public final h0 f3664a;

    public AbstractC0533r(h0 delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f3664a = delegate;
    }

    @Override // b00.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.f3664a.close();
    }

    @Override // b00.h0
    /* renamed from: f */
    public final k0 mo1538f() {
        return this.f3664a.mo1538f();
    }

    @Override // b00.h0, java.io.Flushable
    public void flush() {
        this.f3664a.flush();
    }

    @Override // b00.h0
    public void h0(C0526k source, long j6) {
        AbstractC4154l.m8923f(source, "source");
        this.f3664a.h0(source, j6);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f3664a + ')';
    }
}
