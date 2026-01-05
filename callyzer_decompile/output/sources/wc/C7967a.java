package wc;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC4154l;
import pg.r7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.a */
/* loaded from: classes.dex */
public final class C7967a implements InterfaceC7986t {

    /* renamed from: a */
    public final b00.c0 f38334a;

    public C7967a(b00.c0 c0Var) {
        this.f38334a = c0Var;
    }

    @Override // wc.InterfaceC7986t
    /* renamed from: a */
    public final C7985s mo15143a() {
        return new C7985s(this.f38334a.f3596b);
    }

    @Override // wc.InterfaceC7986t
    /* renamed from: c */
    public final void mo15144c() {
        this.f38334a.mo1537c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        this.f38334a.close();
    }

    @Override // wc.d0
    public final void flush() {
        this.f38334a.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f38334a.isOpen();
    }

    @Override // wc.InterfaceC7986t
    /* renamed from: m */
    public final void mo15145m(int i10, String string) {
        AbstractC4154l.m8923f(string, "string");
        b00.c0 c0Var = this.f38334a;
        if (c0Var.f3597c) {
            throw new IllegalStateException("closed");
        }
        c0Var.f3596b.G0(0, i10, string);
        c0Var.m1539h();
    }

    @Override // wc.d0
    public final void m0(C7985s c7985s, long j6) {
        this.f38334a.h0(c7985s.f38413a, j6);
    }

    public final String toString() {
        return this.f38334a.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer src) {
        AbstractC4154l.m8923f(src, "src");
        return this.f38334a.write(src);
    }

    @Override // wc.InterfaceC7986t
    /* renamed from: y */
    public final long mo15146y(e0 source) {
        AbstractC4154l.m8923f(source, "source");
        return this.f38334a.j0(r7.m11851b(source));
    }
}
