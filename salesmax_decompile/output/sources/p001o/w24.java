package p001o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class w24 extends FilterInputStream {

    /* renamed from: a */
    public final long f51307a;

    /* renamed from: b */
    public int f51308b;

    public w24(InputStream inputStream, long j) {
        super(inputStream);
        this.f51307a = j;
    }

    /* renamed from: c */
    public static InputStream m53806c(InputStream inputStream, long j) {
        return new w24(inputStream, j);
    }

    /* renamed from: a */
    public final int m53807a(int i) throws IOException {
        if (i >= 0) {
            this.f51308b += i;
        } else if (this.f51307a - this.f51308b > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f51307a + ", but read: " + this.f51308b);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f51307a - this.f51308b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i;
        i = super.read();
        m53807a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        return m53807a(super.read(bArr, i, i2));
    }
}
