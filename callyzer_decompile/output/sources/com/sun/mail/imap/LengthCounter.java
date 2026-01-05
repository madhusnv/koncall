package com.sun.mail.imap;

import java.io.OutputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class LengthCounter extends OutputStream {
    private int maxsize;
    private int size = 0;
    private byte[] buf = new byte[8192];

    public LengthCounter(int i10) {
        this.maxsize = i10;
    }

    public byte[] getBytes() {
        return this.buf;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        int i11 = this.size;
        int i12 = i11 + 1;
        byte[] bArr = this.buf;
        if (bArr != null) {
            int i13 = this.maxsize;
            if (i12 > i13 && i13 >= 0) {
                this.buf = null;
            } else if (i12 > bArr.length) {
                byte[] bArr2 = new byte[Math.max(bArr.length << 1, i12)];
                System.arraycopy(this.buf, 0, bArr2, 0, this.size);
                this.buf = bArr2;
                bArr2[this.size] = (byte) i10;
            } else {
                bArr[i11] = (byte) i10;
            }
        }
        this.size = i12;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return;
        }
        int i13 = this.size;
        int i14 = i13 + i11;
        byte[] bArr2 = this.buf;
        if (bArr2 != null) {
            int i15 = this.maxsize;
            if (i14 > i15 && i15 >= 0) {
                this.buf = null;
            } else if (i14 > bArr2.length) {
                byte[] bArr3 = new byte[Math.max(bArr2.length << 1, i14)];
                System.arraycopy(this.buf, 0, bArr3, 0, this.size);
                this.buf = bArr3;
                System.arraycopy(bArr, i10, bArr3, this.size, i11);
            } else {
                System.arraycopy(bArr, i10, bArr2, i13, i11);
            }
        }
        this.size = i14;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
