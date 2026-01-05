package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public class ParametersWithIV implements CipherParameters {

    /* renamed from: iv, reason: collision with root package name */
    private byte[] f44623iv;
    private CipherParameters parameters;

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr) {
        this(cipherParameters, bArr, 0, bArr.length);
    }

    public byte[] getIV() {
        return this.f44623iv;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f44623iv = bArr2;
        this.parameters = cipherParameters;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }
}
