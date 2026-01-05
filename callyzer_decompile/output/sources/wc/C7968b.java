package wc;

import b00.AbstractC0517b;
import b00.C0526k;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.b */
/* loaded from: classes.dex */
public final class C7968b implements InterfaceC7987u {

    /* renamed from: a */
    public final b00.d0 f38337a;

    public C7968b(b00.d0 d0Var) {
        this.f38337a = d0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        this.f38337a.close();
    }

    @Override // wc.InterfaceC7987u
    /* renamed from: e */
    public final boolean mo15147e() {
        return this.f38337a.mo1545e();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f38337a.isOpen();
    }

    @Override // wc.InterfaceC7987u
    public final int n0(int i10, byte[] bArr) {
        long j6 = i10;
        AbstractC0517b.m1526e(bArr.length, 0, j6);
        b00.d0 d0Var = this.f38337a;
        C0526k c0526k = d0Var.f3602b;
        if (c0526k.f3638b == 0) {
            if (i10 == 0) {
                return 0;
            }
            if (d0Var.f3601a.g0(c0526k, 8192L) == -1) {
                return -1;
            }
        }
        return c0526k.read(bArr, 0, (int) Math.min(j6, c0526k.f3638b));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer dst) {
        AbstractC4154l.m8923f(dst, "dst");
        return this.f38337a.read(dst);
    }

    @Override // wc.InterfaceC7987u
    /* renamed from: v */
    public final byte[] mo15148v() {
        b00.d0 d0Var = this.f38337a;
        C0526k c0526k = d0Var.f3602b;
        c0526k.j0(d0Var.f3601a);
        return c0526k.m1591S(c0526k.f3638b);
    }

    @Override // wc.e0
    public final long read(C7985s sink, long j6) {
        AbstractC4154l.m8923f(sink, "sink");
        return this.f38337a.g0(sink.f38413a, j6);
    }
}
