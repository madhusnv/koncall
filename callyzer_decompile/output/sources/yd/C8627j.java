package yd;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yd.j */
/* loaded from: classes.dex */
public final class C8627j extends InputStream {

    /* renamed from: a */
    public final InputStream f41901a;

    /* renamed from: b */
    public int f41902b = 1073741824;

    public C8627j(InputStream inputStream) {
        this.f41901a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f41902b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f41901a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i10 = this.f41901a.read();
        if (i10 == -1) {
            this.f41902b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final long skip(long j6) {
        return this.f41901a.skip(j6);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i10 = this.f41901a.read(bArr);
        if (i10 == -1) {
            this.f41902b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f41901a.read(bArr, i10, i11);
        if (i12 == -1) {
            this.f41902b = 0;
        }
        return i12;
    }
}
