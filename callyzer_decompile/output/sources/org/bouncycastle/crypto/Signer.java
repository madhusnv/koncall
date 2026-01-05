package org.bouncycastle.crypto;

/* loaded from: classes3.dex */
public interface Signer {
    byte[] generateSignature();

    void init(boolean z6, CipherParameters cipherParameters);

    void reset();

    void update(byte b10);

    void update(byte[] bArr, int i10, int i11);

    boolean verifySignature(byte[] bArr);
}
