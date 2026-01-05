package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public interface AEADCipher {
    int doFinal(byte[] bArr, int i10);

    String getAlgorithmName();

    byte[] getMac();

    int getOutputSize(int i10);

    int getUpdateOutputSize(int i10);

    void init(boolean z6, CipherParameters cipherParameters);

    void processAADByte(byte b10);

    void processAADBytes(byte[] bArr, int i10, int i11);

    int processByte(byte b10, byte[] bArr, int i10);

    int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    void reset();
}
