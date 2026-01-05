package org.apache.http.client.entity;

import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* loaded from: classes6.dex */
public class DeflateInputStream extends InputStream {
    private final InputStream sourceStream;

    public static class DeflateStream extends InflaterInputStream {
        private boolean closed;

        public DeflateStream(InputStream inputStream, Inflater inflater) {
            super(inputStream, inflater);
            this.closed = false;
        }

        @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ((InflaterInputStream) this).inf.end();
            super.close();
        }
    }

    public DeflateInputStream(InputStream inputStream) throws IOException {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 2);
        int i = pushbackInputStream.read();
        int i2 = pushbackInputStream.read();
        if (i == -1 || i2 == -1) {
            throw new ZipException("Unexpected end of stream");
        }
        pushbackInputStream.unread(i2);
        pushbackInputStream.unread(i);
        int i3 = i & Constants.MAX_HOST_LENGTH;
        this.sourceStream = new DeflateStream(pushbackInputStream, new Inflater(((i3 & 15) == 8 && ((i3 >> 4) & 15) <= 7 && ((i3 << 8) | (i2 & Constants.MAX_HOST_LENGTH)) % 31 == 0) ? false : true));
    }

    @Override // java.io.InputStream
    public int available() {
        return this.sourceStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.sourceStream.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.sourceStream.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.sourceStream.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.sourceStream.read();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.sourceStream.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.sourceStream.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.sourceStream.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.sourceStream.read(bArr, i, i2);
    }
}
