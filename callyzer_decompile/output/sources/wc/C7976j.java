package wc;

import b00.C0526k;
import b00.i0;
import b00.k0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import qw.C6366p;
import qz.C6391i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.j */
/* loaded from: classes.dex */
public final class C7976j implements i0 {

    /* renamed from: a */
    public final File f38368a;

    /* renamed from: b */
    public final long f38369b;

    /* renamed from: c */
    public final k0 f38370c = k0.f3639d;

    /* renamed from: d */
    public final C6366p f38371d;

    /* renamed from: e */
    public long f38372e;

    public C7976j(File file, long j6, long j10) {
        this.f38368a = file;
        this.f38369b = j10;
        this.f38371d = nd.m10782c(new C6391i(this, j6, 1));
        this.f38372e = j6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((RandomAccessFile) this.f38371d.getValue()).close();
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        return this.f38370c;
    }

    @Override // b00.i0
    public final long g0(C0526k sink, long j6) throws IOException {
        AbstractC4154l.m8923f(sink, "sink");
        FileChannel channel = ((RandomAccessFile) this.f38371d.getValue()).getChannel();
        if (!channel.isOpen()) {
            throw new IllegalStateException("channel is closed");
        }
        long j10 = this.f38372e;
        long j11 = this.f38369b;
        if (j10 > j11) {
            return -1L;
        }
        long jTransferTo = channel.transferTo(this.f38372e, Math.min(j6, (j11 - j10) + 1), sink);
        this.f38372e += jTransferTo;
        return jTransferTo;
    }

    public final String toString() {
        return "RandomAccessFileSource(" + this.f38368a + ')';
    }
}
