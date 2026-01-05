package org.bouncycastle.crypto;

/* loaded from: classes3.dex */
public interface Wrapper {
    String getAlgorithmName();

    void init(boolean z6, CipherParameters cipherParameters);

    byte[] unwrap(byte[] bArr, int i10, int i11);

    byte[] wrap(byte[] bArr, int i10, int i11);
}
