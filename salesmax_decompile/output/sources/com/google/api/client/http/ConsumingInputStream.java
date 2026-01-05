package com.google.api.client.http;

import java.io.FilterInputStream;
import java.io.InputStream;
import p001o.vq1;

/* loaded from: classes3.dex */
final class ConsumingInputStream extends FilterInputStream {
    private boolean closed;

    public ConsumingInputStream(InputStream inputStream) {
        super(inputStream);
        this.closed = false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed || ((FilterInputStream) this).in == null) {
            return;
        }
        try {
            vq1.m53200c(this);
            ((FilterInputStream) this).in.close();
        } finally {
            this.closed = true;
        }
    }
}
