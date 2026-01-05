package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class SdkFilterInputStream extends FilterInputStream implements MetricAware {
    public SdkFilterInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public void abort() {
    }

    public final void abortIfNeeded() {
        if (Thread.interrupted()) {
            abort();
            throw new AbortedException();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        abortIfNeeded();
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterInputStream) this).in.close();
        abortIfNeeded();
    }

    @Override // com.amazonaws.internal.MetricAware
    @Deprecated
    public boolean isMetricActivated() {
        if (((FilterInputStream) this).in instanceof MetricAware) {
            return ((MetricAware) ((FilterInputStream) this).in).isMetricActivated();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        abortIfNeeded();
        ((FilterInputStream) this).in.mark(i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        abortIfNeeded();
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        abortIfNeeded();
        return ((FilterInputStream) this).in.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        abortIfNeeded();
        ((FilterInputStream) this).in.reset();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        abortIfNeeded();
        return ((FilterInputStream) this).in.skip(j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        abortIfNeeded();
        return ((FilterInputStream) this).in.read(bArr, i, i2);
    }
}
