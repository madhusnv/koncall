package org.bouncycastle.jcajce.io;

import java.io.OutputStream;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
class DigestUpdatingOutputStream extends OutputStream {
    private MessageDigest digest;

    public DigestUpdatingOutputStream(MessageDigest messageDigest) {
        this.digest = messageDigest;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.digest.update((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.digest.update(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.digest.update(bArr, i10, i11);
    }
}
