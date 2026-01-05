package org.bouncycastle.crypto;

/* loaded from: classes3.dex */
public interface AsymmetricBlockCipher {
    int getInputBlockSize();

    int getOutputBlockSize();

    void init(boolean z6, CipherParameters cipherParameters);

    byte[] processBlock(byte[] bArr, int i10, int i11);
}
