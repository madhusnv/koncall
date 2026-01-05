package org.bouncycastle.crypto.prng;

/* loaded from: classes3.dex */
public interface RandomGenerator {
    void addSeedMaterial(long j6);

    void addSeedMaterial(byte[] bArr);

    void nextBytes(byte[] bArr);

    void nextBytes(byte[] bArr, int i10, int i11);
}
