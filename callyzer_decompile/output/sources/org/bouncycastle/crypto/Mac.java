package org.bouncycastle.crypto;

/* loaded from: classes3.dex */
public interface Mac {
    int doFinal(byte[] bArr, int i10);

    String getAlgorithmName();

    int getMacSize();

    void init(CipherParameters cipherParameters);

    void reset();

    void update(byte b10);

    void update(byte[] bArr, int i10, int i11);
}
