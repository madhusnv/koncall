package p001o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class nsa extends FilterInputStream {

    /* renamed from: a */
    public int f37239a;

    public nsa(InputStream inputStream) {
        super(inputStream);
        this.f37239a = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final long m41031a(long j) {
        int i = this.f37239a;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i = this.f37239a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    /* renamed from: c */
    public final void m41032c(long j) {
        int i = this.f37239a;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f37239a = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        super.mark(i);
        this.f37239a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m41031a(1L) == -1) {
            return -1;
        }
        int i = super.read();
        m41032c(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f37239a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jM41031a = m41031a(j);
        if (jM41031a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM41031a);
        m41032c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int iM41031a = (int) m41031a(i2);
        if (iM41031a == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iM41031a);
        m41032c(i3);
        return i3;
    }
}
