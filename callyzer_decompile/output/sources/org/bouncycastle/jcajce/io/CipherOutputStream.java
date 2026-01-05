package org.bouncycastle.jcajce.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Cipher;

/* loaded from: classes3.dex */
public class CipherOutputStream extends FilterOutputStream {
    private final Cipher cipher;
    private final byte[] oneByte;

    public CipherOutputStream(OutputStream outputStream, Cipher cipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.cipher = cipher;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:0|(4:24|2|(1:4)|10)|22|14|(1:20)(1:21)) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, java.io.IOException {
        /*
            r3 = this;
            javax.crypto.Cipher r0 = r3.cipher     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            byte[] r0 = r0.doFinal()     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            if (r0 == 0) goto L12
            java.io.OutputStream r1 = r3.out     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            r1.write(r0)     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            goto L12
        Le:
            r0 = move-exception
            goto L14
        L10:
            r0 = move-exception
            goto L21
        L12:
            r0 = 0
            goto L29
        L14:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Error closing stream: "
            java.lang.String r0 = a2.AbstractC0030c.m120k(r2, r0)
            r1.<init>(r0)
        L1f:
            r0 = r1
            goto L29
        L21:
            org.bouncycastle.crypto.io.InvalidCipherTextIOException r1 = new org.bouncycastle.crypto.io.InvalidCipherTextIOException
            java.lang.String r2 = "Error during cipher finalisation"
            r1.<init>(r2, r0)
            goto L1f
        L29:
            r3.flush()     // Catch: java.io.IOException -> L32
            java.io.OutputStream r1 = r3.out     // Catch: java.io.IOException -> L32
            r1.close()     // Catch: java.io.IOException -> L32
            goto L36
        L32:
            r1 = move-exception
            if (r0 != 0) goto L36
            r0 = r1
        L36:
            if (r0 != 0) goto L39
            return
        L39:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.io.CipherOutputStream.close():void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.oneByte;
        bArr[0] = (byte) i10;
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        byte[] bArrUpdate = this.cipher.update(bArr, i10, i11);
        if (bArrUpdate != null) {
            ((FilterOutputStream) this).out.write(bArrUpdate);
        }
    }
}
