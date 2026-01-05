package org.bouncycastle.crypto.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.modes.AEADBlockCipher;

/* loaded from: classes3.dex */
public class CipherOutputStream extends FilterOutputStream {
    private AEADBlockCipher aeadBlockCipher;
    private byte[] buf;
    private BufferedBlockCipher bufferedBlockCipher;
    private final byte[] oneByte;
    private StreamCipher streamCipher;

    public CipherOutputStream(OutputStream outputStream, BufferedBlockCipher bufferedBlockCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.bufferedBlockCipher = bufferedBlockCipher;
    }

    private void ensureCapacity(int i10, boolean z6) {
        if (z6) {
            BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
            if (bufferedBlockCipher != null) {
                i10 = bufferedBlockCipher.getOutputSize(i10);
            } else {
                AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                if (aEADBlockCipher != null) {
                    i10 = aEADBlockCipher.getOutputSize(i10);
                }
            }
        } else {
            BufferedBlockCipher bufferedBlockCipher2 = this.bufferedBlockCipher;
            if (bufferedBlockCipher2 != null) {
                i10 = bufferedBlockCipher2.getUpdateOutputSize(i10);
            } else {
                AEADBlockCipher aEADBlockCipher2 = this.aeadBlockCipher;
                if (aEADBlockCipher2 != null) {
                    i10 = aEADBlockCipher2.getUpdateOutputSize(i10);
                }
            }
        }
        byte[] bArr = this.buf;
        if (bArr == null || bArr.length < i10) {
            this.buf = new byte[i10];
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:0|2|(4:34|3|(2:5|(1:7))(2:12|(2:14|(1:16))(2:17|(1:19)))|20)|32|24|(1:30)(1:31)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws java.io.IOException {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            r4.ensureCapacity(r1, r0)
            org.bouncycastle.crypto.BufferedBlockCipher r0 = r4.bufferedBlockCipher     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            if (r0 == 0) goto L1d
            byte[] r2 = r4.buf     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            int r0 = r0.doFinal(r2, r1)     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            if (r0 == 0) goto L38
            java.io.OutputStream r2 = r4.out     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            byte[] r3 = r4.buf     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            r2.write(r3, r1, r0)     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            goto L38
        L19:
            r0 = move-exception
            goto L3a
        L1b:
            r0 = move-exception
            goto L43
        L1d:
            org.bouncycastle.crypto.modes.AEADBlockCipher r0 = r4.aeadBlockCipher     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            if (r0 == 0) goto L31
            byte[] r2 = r4.buf     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            int r0 = r0.doFinal(r2, r1)     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            if (r0 == 0) goto L38
            java.io.OutputStream r2 = r4.out     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            byte[] r3 = r4.buf     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            r2.write(r3, r1, r0)     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            goto L38
        L31:
            org.bouncycastle.crypto.StreamCipher r0 = r4.streamCipher     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
            if (r0 == 0) goto L38
            r0.reset()     // Catch: java.lang.Exception -> L19 org.bouncycastle.crypto.InvalidCipherTextException -> L1b
        L38:
            r0 = 0
            goto L4b
        L3a:
            org.bouncycastle.crypto.io.CipherIOException r1 = new org.bouncycastle.crypto.io.CipherIOException
            java.lang.String r2 = "Error closing stream: "
            r1.<init>(r2, r0)
        L41:
            r0 = r1
            goto L4b
        L43:
            org.bouncycastle.crypto.io.InvalidCipherTextIOException r1 = new org.bouncycastle.crypto.io.InvalidCipherTextIOException
            java.lang.String r2 = "Error finalising cipher data"
            r1.<init>(r2, r0)
            goto L41
        L4b:
            r4.flush()     // Catch: java.io.IOException -> L54
            java.io.OutputStream r1 = r4.out     // Catch: java.io.IOException -> L54
            r1.close()     // Catch: java.io.IOException -> L54
            goto L58
        L54:
            r1 = move-exception
            if (r0 != 0) goto L58
            r0 = r1
        L58:
            if (r0 != 0) goto L5b
            return
        L5b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.io.CipherOutputStream.close():void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.oneByte;
        byte b10 = (byte) i10;
        bArr[0] = b10;
        StreamCipher streamCipher = this.streamCipher;
        if (streamCipher != null) {
            ((FilterOutputStream) this).out.write(streamCipher.returnByte(b10));
        } else {
            write(bArr, 0, 1);
        }
    }

    public CipherOutputStream(OutputStream outputStream, StreamCipher streamCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.streamCipher = streamCipher;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public CipherOutputStream(OutputStream outputStream, AEADBlockCipher aEADBlockCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.aeadBlockCipher = aEADBlockCipher;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        ensureCapacity(i11, false);
        BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
        if (bufferedBlockCipher != null) {
            int iProcessBytes = bufferedBlockCipher.processBytes(bArr, i10, i11, this.buf, 0);
            if (iProcessBytes != 0) {
                ((FilterOutputStream) this).out.write(this.buf, 0, iProcessBytes);
                return;
            }
            return;
        }
        AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
        if (aEADBlockCipher == null) {
            this.streamCipher.processBytes(bArr, i10, i11, this.buf, 0);
            ((FilterOutputStream) this).out.write(this.buf, 0, i11);
        } else {
            int iProcessBytes2 = aEADBlockCipher.processBytes(bArr, i10, i11, this.buf, 0);
            if (iProcessBytes2 != 0) {
                ((FilterOutputStream) this).out.write(this.buf, 0, iProcessBytes2);
            }
        }
    }
}
