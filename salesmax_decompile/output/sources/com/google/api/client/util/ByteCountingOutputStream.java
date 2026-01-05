package com.google.api.client.util;

import java.io.OutputStream;

/* loaded from: classes3.dex */
final class ByteCountingOutputStream extends OutputStream {
    long count;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.count += i2;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.count++;
    }
}
