package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes3.dex */
class SIG_FORS {
    final byte[][] authPath;

    /* renamed from: sk, reason: collision with root package name */
    final byte[] f44735sk;

    public SIG_FORS(byte[] bArr, byte[][] bArr2) {
        this.authPath = bArr2;
        this.f44735sk = bArr;
    }

    public byte[][] getAuthPath() {
        return this.authPath;
    }

    public byte[] getSK() {
        return this.f44735sk;
    }
}
