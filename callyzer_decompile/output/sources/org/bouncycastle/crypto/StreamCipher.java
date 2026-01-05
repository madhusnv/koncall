package org.bouncycastle.crypto;

/* loaded from: classes3.dex */
public interface StreamCipher {
    String getAlgorithmName();

    void init(boolean z6, CipherParameters cipherParameters);

    int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    void reset();

    byte returnByte(byte b10);
}
