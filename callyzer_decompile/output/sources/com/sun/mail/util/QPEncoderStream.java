package com.sun.mail.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class QPEncoderStream extends FilterOutputStream {
    private static final char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private int bytesPerLine;
    private int count;
    private boolean gotCR;
    private boolean gotSpace;

    public QPEncoderStream(OutputStream outputStream, int i10) {
        super(outputStream);
        this.count = 0;
        this.gotSpace = false;
        this.gotCR = false;
        this.bytesPerLine = i10 - 1;
    }

    private void outputCRLF() throws IOException {
        ((FilterOutputStream) this).out.write(13);
        ((FilterOutputStream) this).out.write(10);
        this.count = 0;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (this.gotSpace) {
            output(32, true);
            this.gotSpace = false;
        }
        ((FilterOutputStream) this).out.flush();
    }

    public void output(int i10, boolean z6) throws IOException {
        if (!z6) {
            int i11 = this.count + 1;
            this.count = i11;
            if (i11 > this.bytesPerLine) {
                ((FilterOutputStream) this).out.write(61);
                ((FilterOutputStream) this).out.write(13);
                ((FilterOutputStream) this).out.write(10);
                this.count = 1;
            }
            ((FilterOutputStream) this).out.write(i10);
            return;
        }
        int i12 = this.count + 3;
        this.count = i12;
        if (i12 > this.bytesPerLine) {
            ((FilterOutputStream) this).out.write(61);
            ((FilterOutputStream) this).out.write(13);
            ((FilterOutputStream) this).out.write(10);
            this.count = 3;
        }
        ((FilterOutputStream) this).out.write(61);
        OutputStream outputStream = ((FilterOutputStream) this).out;
        char[] cArr = hex;
        outputStream.write(cArr[i10 >> 4]);
        ((FilterOutputStream) this).out.write(cArr[i10 & 15]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            write(bArr[i10 + i12]);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        int i11 = i10 & 255;
        if (this.gotSpace) {
            if (i11 != 13 && i11 != 10) {
                output(32, false);
            } else {
                output(32, true);
            }
            this.gotSpace = false;
        }
        if (i11 == 13) {
            this.gotCR = true;
            outputCRLF();
            return;
        }
        if (i11 == 10) {
            if (!this.gotCR) {
                outputCRLF();
            }
        } else if (i11 == 32) {
            this.gotSpace = true;
        } else if (i11 >= 32 && i11 < 127 && i11 != 61) {
            output(i11, false);
        } else {
            output(i11, true);
        }
        this.gotCR = false;
    }

    public QPEncoderStream(OutputStream outputStream) {
        this(outputStream, 76);
    }
}
