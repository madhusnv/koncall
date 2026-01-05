package com.sun.mail.iap;

import java.io.ByteArrayInputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ByteArray {
    private byte[] bytes;
    private int count;
    private int start;

    public ByteArray(byte[] bArr, int i10, int i11) {
        this.bytes = bArr;
        this.start = i10;
        this.count = i11;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public int getCount() {
        return this.count;
    }

    public byte[] getNewBytes() {
        int i10 = this.count;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.bytes, this.start, bArr, 0, i10);
        return bArr;
    }

    public int getStart() {
        return this.start;
    }

    public void grow(int i10) {
        byte[] bArr = this.bytes;
        byte[] bArr2 = new byte[bArr.length + i10];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.bytes = bArr2;
    }

    public void setCount(int i10) {
        this.count = i10;
    }

    public ByteArrayInputStream toByteArrayInputStream() {
        return new ByteArrayInputStream(this.bytes, this.start, this.count);
    }

    public ByteArray(int i10) {
        this(new byte[i10], 0, i10);
    }
}
