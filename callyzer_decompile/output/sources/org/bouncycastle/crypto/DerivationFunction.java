package org.bouncycastle.crypto;

/* loaded from: classes3.dex */
public interface DerivationFunction {
    int generateBytes(byte[] bArr, int i10, int i11);

    void init(DerivationParameters derivationParameters);
}
