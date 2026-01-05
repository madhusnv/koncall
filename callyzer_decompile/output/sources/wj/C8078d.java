package wj;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.d */
/* loaded from: classes.dex */
public final class C8078d extends FilterInputStream {

    /* renamed from: a */
    public long f38693a;

    /* renamed from: b */
    public long f38694b;

    public C8078d(InputStream inputStream) {
        super(inputStream);
        this.f38694b = -1L;
        this.f38693a = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f38693a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f38694b = this.f38693a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f38693a == 0) {
            return -1;
        }
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f38693a--;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f38694b == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f38693a = this.f38694b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j6, this.f38693a));
        this.f38693a -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j6 = this.f38693a;
        if (j6 == 0) {
            return -1;
        }
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j6));
        if (i12 != -1) {
            this.f38693a -= i12;
        }
        return i12;
    }
}
