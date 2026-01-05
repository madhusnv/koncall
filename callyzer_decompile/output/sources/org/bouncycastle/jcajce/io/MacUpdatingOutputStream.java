package org.bouncycastle.jcajce.io;

import java.io.OutputStream;
import javax.crypto.Mac;

/* loaded from: classes3.dex */
class MacUpdatingOutputStream extends OutputStream {
    private Mac mac;

    public MacUpdatingOutputStream(Mac mac) {
        this.mac = mac;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IllegalStateException {
        this.mac.update((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IllegalStateException {
        this.mac.update(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IllegalStateException {
        this.mac.update(bArr, i10, i11);
    }
}
