package p001o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes5.dex */
public final class yk6 extends InputStream {

    /* renamed from: c */
    public static final Queue f55632c = uqi.m51924e(0);

    /* renamed from: a */
    public InputStream f55633a;

    /* renamed from: b */
    public IOException f55634b;

    /* renamed from: c */
    public static yk6 m57915c(InputStream inputStream) {
        yk6 yk6Var;
        Queue queue = f55632c;
        synchronized (queue) {
            yk6Var = (yk6) queue.poll();
        }
        if (yk6Var == null) {
            yk6Var = new yk6();
        }
        yk6Var.m57917d(inputStream);
        return yk6Var;
    }

    /* renamed from: a */
    public IOException m57916a() {
        return this.f55634b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f55633a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f55633a.close();
    }

    /* renamed from: d */
    public void m57917d(InputStream inputStream) {
        this.f55633a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f55633a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f55633a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f55633a.read();
        } catch (IOException e) {
            this.f55634b = e;
            throw e;
        }
    }

    public void release() {
        this.f55634b = null;
        this.f55633a = null;
        Queue queue = f55632c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f55633a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.f55633a.skip(j);
        } catch (IOException e) {
            this.f55634b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f55633a.read(bArr);
        } catch (IOException e) {
            this.f55634b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f55633a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f55634b = e;
            throw e;
        }
    }
}
