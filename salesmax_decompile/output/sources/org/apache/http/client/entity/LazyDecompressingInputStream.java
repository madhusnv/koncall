package org.apache.http.client.entity;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
class LazyDecompressingInputStream extends InputStream {
    private final InputStreamFactory inputStreamFactory;
    private final InputStream wrappedStream;
    private InputStream wrapperStream;

    public LazyDecompressingInputStream(InputStream inputStream, InputStreamFactory inputStreamFactory) {
        this.wrappedStream = inputStream;
        this.inputStreamFactory = inputStreamFactory;
    }

    private void initWrapper() {
        if (this.wrapperStream == null) {
            this.wrapperStream = this.inputStreamFactory.create(this.wrappedStream);
        }
    }

    @Override // java.io.InputStream
    public int available() {
        initWrapper();
        return this.wrapperStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            InputStream inputStream = this.wrapperStream;
            if (inputStream != null) {
                inputStream.close();
            }
        } finally {
            this.wrappedStream.close();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        initWrapper();
        return this.wrapperStream.read();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        initWrapper();
        return this.wrapperStream.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        initWrapper();
        return this.wrapperStream.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        initWrapper();
        return this.wrapperStream.read(bArr, i, i2);
    }
}
