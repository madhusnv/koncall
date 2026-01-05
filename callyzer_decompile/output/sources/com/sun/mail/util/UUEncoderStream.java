package com.sun.mail.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class UUEncoderStream extends FilterOutputStream {
    private byte[] buffer;
    private int bufsize;
    private int mode;
    private String name;
    private boolean wrotePrefix;
    private boolean wroteSuffix;

    public UUEncoderStream(OutputStream outputStream) {
        this(outputStream, "encoder.buf", 420);
    }

    private void encode() throws IOException {
        byte b10;
        ((FilterOutputStream) this).out.write((this.bufsize & 63) + 32);
        int i10 = 0;
        while (true) {
            int i11 = this.bufsize;
            if (i10 >= i11) {
                ((FilterOutputStream) this).out.write(10);
                return;
            }
            byte[] bArr = this.buffer;
            int i12 = i10 + 1;
            byte b11 = bArr[i10];
            byte b12 = 1;
            if (i12 < i11) {
                int i13 = i10 + 2;
                byte b13 = bArr[i12];
                if (i13 < i11) {
                    i10 += 3;
                    b10 = bArr[i13];
                } else {
                    b10 = 1;
                    i10 = i13;
                }
                b12 = b13;
            } else {
                i10 = i12;
                b10 = 1;
            }
            ((FilterOutputStream) this).out.write(((b11 >>> 2) & 63) + 32);
            ((FilterOutputStream) this).out.write((((b11 << 4) & 48) | ((b12 >>> 4) & 15)) + 32);
            ((FilterOutputStream) this).out.write((((b12 << 2) & 60) | ((b10 >>> 6) & 3)) + 32);
            ((FilterOutputStream) this).out.write((b10 & 63) + 32);
        }
    }

    private void writePrefix() {
        if (this.wrotePrefix) {
            return;
        }
        PrintStream printStream = new PrintStream(((FilterOutputStream) this).out, false, "utf-8");
        printStream.format("begin %o %s%n", Integer.valueOf(this.mode), this.name);
        printStream.flush();
        this.wrotePrefix = true;
    }

    private void writeSuffix() {
        if (this.wroteSuffix) {
            return;
        }
        PrintStream printStream = new PrintStream(((FilterOutputStream) this).out, false, "us-ascii");
        printStream.println(" \nend");
        printStream.flush();
        this.wroteSuffix = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (this.bufsize > 0) {
            writePrefix();
            encode();
            this.bufsize = 0;
        }
        writeSuffix();
        ((FilterOutputStream) this).out.flush();
    }

    public void setNameMode(String str, int i10) {
        this.name = str;
        this.mode = i10;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            write(bArr[i10 + i12]);
        }
    }

    public UUEncoderStream(OutputStream outputStream, String str) {
        this(outputStream, str, 420);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public UUEncoderStream(OutputStream outputStream, String str, int i10) {
        super(outputStream);
        this.bufsize = 0;
        this.wrotePrefix = false;
        this.wroteSuffix = false;
        this.name = str;
        this.mode = i10;
        this.buffer = new byte[45];
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.buffer;
        int i11 = this.bufsize;
        int i12 = i11 + 1;
        this.bufsize = i12;
        bArr[i11] = (byte) i10;
        if (i12 == 45) {
            writePrefix();
            encode();
            this.bufsize = 0;
        }
    }
}
