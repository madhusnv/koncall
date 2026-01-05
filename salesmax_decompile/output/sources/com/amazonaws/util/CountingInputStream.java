package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.InputStream;

@Deprecated
/* loaded from: classes5.dex */
public class CountingInputStream extends SdkFilterInputStream {
    private long byteCount;

    public CountingInputStream(InputStream inputStream) {
        super(inputStream);
        this.byteCount = 0L;
    }

    public long getByteCount() {
        return this.byteCount;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i = super.read();
        this.byteCount += i >= 0 ? 1L : 0L;
        return i;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = super.read(bArr, i, i2);
        this.byteCount += i3 >= 0 ? i3 : 0L;
        return i3;
    }
}
