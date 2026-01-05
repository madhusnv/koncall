package wc;

import b00.C0526k;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC4154l;
import pg.r7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.s */
/* loaded from: classes.dex */
public final class C7985s implements InterfaceC7987u, InterfaceC7986t {

    /* renamed from: a */
    public final C0526k f38413a;

    public C7985s() {
        this(new C0526k());
    }

    @Override // wc.InterfaceC7986t
    /* renamed from: c */
    public final void mo15144c() {
        this.f38413a.getClass();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        this.f38413a.getClass();
    }

    @Override // wc.InterfaceC7987u
    /* renamed from: e */
    public final boolean mo15147e() {
        return this.f38413a.mo1545e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7985s)) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f38413a, ((C7985s) obj).f38413a);
    }

    @Override // wc.d0
    public final void flush() {
        this.f38413a.getClass();
    }

    public final int hashCode() {
        return this.f38413a.hashCode();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        this.f38413a.getClass();
        return true;
    }

    @Override // wc.InterfaceC7986t
    /* renamed from: m */
    public final void mo15145m(int i10, String string) {
        AbstractC4154l.m8923f(string, "string");
        this.f38413a.G0(0, i10, string);
    }

    @Override // wc.d0
    public final void m0(C7985s source, long j6) {
        AbstractC4154l.m8923f(source, "source");
        this.f38413a.h0(source.f38413a, j6);
    }

    @Override // wc.InterfaceC7987u
    public final int n0(int i10, byte[] bArr) {
        return this.f38413a.read(bArr, 0, i10);
    }

    @Override // wc.e0
    public final long read(C7985s sink, long j6) {
        AbstractC4154l.m8923f(sink, "sink");
        return this.f38413a.g0(sink.f38413a, j6);
    }

    public final String toString() {
        return this.f38413a.toString();
    }

    @Override // wc.InterfaceC7987u
    /* renamed from: v */
    public final byte[] mo15148v() {
        C0526k c0526k = this.f38413a;
        return c0526k.m1591S(c0526k.f3638b);
    }

    public final void write(byte[] source, int i10, int i11) {
        AbstractC4154l.m8923f(source, "source");
        this.f38413a.write(source, i10, i11);
    }

    @Override // wc.InterfaceC7986t
    /* renamed from: y */
    public final long mo15146y(e0 source) {
        AbstractC4154l.m8923f(source, "source");
        return this.f38413a.j0(r7.m11851b(source));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer dst) {
        AbstractC4154l.m8923f(dst, "dst");
        return this.f38413a.read(dst);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer src) {
        AbstractC4154l.m8923f(src, "src");
        return this.f38413a.write(src);
    }

    public C7985s(C0526k buffer) {
        AbstractC4154l.m8923f(buffer, "buffer");
        this.f38413a = buffer;
    }

    @Override // wc.InterfaceC7986t
    /* renamed from: a */
    public final C7985s mo15143a() {
        return this;
    }
}
