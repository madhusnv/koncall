package com.sun.mail.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class BASE64EncoderStream extends FilterOutputStream {
    private static byte[] newline = {13, 10};
    private static final char[] pem_array = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private byte[] buffer;
    private int bufsize;
    private int bytesPerLine;
    private int count;
    private int lineLimit;
    private boolean noCRLF;
    private byte[] outbuf;

    public BASE64EncoderStream(OutputStream outputStream, int i10) {
        super(outputStream);
        this.bufsize = 0;
        this.count = 0;
        this.noCRLF = false;
        this.buffer = new byte[3];
        if (i10 == Integer.MAX_VALUE || i10 < 4) {
            this.noCRLF = true;
            i10 = 76;
        }
        int i11 = (i10 / 4) * 4;
        this.bytesPerLine = i11;
        this.lineLimit = (i11 / 4) * 3;
        if (this.noCRLF) {
            this.outbuf = new byte[i11];
            return;
        }
        byte[] bArr = new byte[i11 + 2];
        this.outbuf = bArr;
        bArr[i11] = 13;
        bArr[i11 + 1] = 10;
    }

    private void encode() throws IOException {
        int iEncodedSize = encodedSize(this.bufsize);
        ((FilterOutputStream) this).out.write(encode(this.buffer, 0, this.bufsize, this.outbuf), 0, iEncodedSize);
        int i10 = this.count + iEncodedSize;
        this.count = i10;
        if (i10 >= this.bytesPerLine) {
            if (!this.noCRLF) {
                ((FilterOutputStream) this).out.write(newline);
            }
            this.count = 0;
        }
    }

    private static int encodedSize(int i10) {
        return ((i10 + 2) / 3) * 4;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            flush();
            if (this.count > 0 && !this.noCRLF) {
                ((FilterOutputStream) this).out.write(newline);
                ((FilterOutputStream) this).out.flush();
            }
            ((FilterOutputStream) this).out.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        try {
            if (this.bufsize > 0) {
                encode();
                this.bufsize = 0;
            }
            ((FilterOutputStream) this).out.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        int i12 = i11 + i10;
        while (this.bufsize != 0 && i10 < i12) {
            try {
                write(bArr[i10]);
                i10++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i13 = ((this.bytesPerLine - this.count) / 4) * 3;
        int i14 = i10 + i13;
        if (i14 <= i12) {
            int iEncodedSize = encodedSize(i13);
            if (!this.noCRLF) {
                byte[] bArr2 = this.outbuf;
                int i15 = iEncodedSize + 1;
                bArr2[iEncodedSize] = 13;
                iEncodedSize += 2;
                bArr2[i15] = 10;
            }
            ((FilterOutputStream) this).out.write(encode(bArr, i10, i13, this.outbuf), 0, iEncodedSize);
            this.count = 0;
            i10 = i14;
        }
        while (true) {
            int i16 = this.lineLimit;
            if (i10 + i16 > i12) {
                break;
            }
            ((FilterOutputStream) this).out.write(encode(bArr, i10, i16, this.outbuf));
            i10 += this.lineLimit;
        }
        if (i10 + 3 <= i12) {
            int i17 = ((i12 - i10) / 3) * 3;
            int iEncodedSize2 = encodedSize(i17);
            ((FilterOutputStream) this).out.write(encode(bArr, i10, i17, this.outbuf), 0, iEncodedSize2);
            i10 += i17;
            this.count += iEncodedSize2;
        }
        while (i10 < i12) {
            write(bArr[i10]);
            i10++;
        }
    }

    public static byte[] encode(byte[] bArr) {
        return bArr.length == 0 ? bArr : encode(bArr, 0, bArr.length, null);
    }

    private static byte[] encode(byte[] bArr, int i10, int i11, byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[encodedSize(i11)];
        }
        int i12 = 0;
        while (i11 >= 3) {
            int i13 = i10 + 2;
            int i14 = ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8)) << 8;
            i10 += 3;
            int i15 = i14 | (bArr[i13] & 255);
            char[] cArr = pem_array;
            bArr2[i12 + 3] = (byte) cArr[i15 & 63];
            bArr2[i12 + 2] = (byte) cArr[(i15 >> 6) & 63];
            bArr2[i12 + 1] = (byte) cArr[(i15 >> 12) & 63];
            bArr2[i12] = (byte) cArr[(i15 >> 18) & 63];
            i11 -= 3;
            i12 += 4;
        }
        if (i11 == 1) {
            int i16 = (bArr[i10] & 255) << 4;
            bArr2[i12 + 3] = 61;
            bArr2[i12 + 2] = 61;
            char[] cArr2 = pem_array;
            bArr2[i12 + 1] = (byte) cArr2[i16 & 63];
            bArr2[i12] = (byte) cArr2[(i16 >> 6) & 63];
            return bArr2;
        }
        if (i11 == 2) {
            int i17 = ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8)) << 2;
            bArr2[i12 + 3] = 61;
            char[] cArr3 = pem_array;
            bArr2[i12 + 2] = (byte) cArr3[i17 & 63];
            bArr2[i12 + 1] = (byte) cArr3[(i17 >> 6) & 63];
            bArr2[i12] = (byte) cArr3[(i17 >> 12) & 63];
        }
        return bArr2;
    }

    public BASE64EncoderStream(OutputStream outputStream) {
        this(outputStream, 76);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int i10) {
        byte[] bArr = this.buffer;
        int i11 = this.bufsize;
        int i12 = i11 + 1;
        this.bufsize = i12;
        bArr[i11] = (byte) i10;
        if (i12 == 3) {
            encode();
            this.bufsize = 0;
        }
    }
}
