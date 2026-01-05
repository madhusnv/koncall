package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.BlockCipher;

/* loaded from: classes3.dex */
public class X931RNG {
    private static final int BLOCK128_MAX_BITS_REQUEST = 262144;
    private static final long BLOCK128_RESEED_MAX = 8388608;
    private static final int BLOCK64_MAX_BITS_REQUEST = 4096;
    private static final long BLOCK64_RESEED_MAX = 32768;
    private final byte[] DT;

    /* renamed from: I */
    private final byte[] f27786I;

    /* renamed from: R */
    private final byte[] f27787R;

    /* renamed from: V */
    private byte[] f27788V;
    private final BlockCipher engine;
    private final EntropySource entropySource;
    private long reseedCounter = 1;

    public X931RNG(BlockCipher blockCipher, byte[] bArr, EntropySource entropySource) {
        this.engine = blockCipher;
        this.entropySource = entropySource;
        byte[] bArr2 = new byte[blockCipher.getBlockSize()];
        this.DT = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f27786I = new byte[blockCipher.getBlockSize()];
        this.f27787R = new byte[blockCipher.getBlockSize()];
    }

    private void increment(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b10 = (byte) (bArr[length] + 1);
            bArr[length] = b10;
            if (b10 != 0) {
                return;
            }
        }
    }

    private static boolean isTooLarge(byte[] bArr, int i10) {
        return bArr != null && bArr.length > i10;
    }

    private void process(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = (byte) (bArr2[i10] ^ bArr3[i10]);
        }
        this.engine.processBlock(bArr, 0, bArr, 0);
    }

    public int generate(byte[] bArr, boolean z6) {
        int length = this.f27787R.length;
        long j6 = this.reseedCounter;
        if (length == 8) {
            if (j6 > BLOCK64_RESEED_MAX) {
                return -1;
            }
            if (isTooLarge(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else {
            if (j6 > BLOCK128_RESEED_MAX) {
                return -1;
            }
            if (isTooLarge(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z6 || this.f27788V == null) {
            byte[] entropy = this.entropySource.getEntropy();
            this.f27788V = entropy;
            if (entropy.length != this.engine.getBlockSize()) {
                throw new IllegalStateException("Insufficient entropy returned");
            }
        }
        int length2 = bArr.length / this.f27787R.length;
        for (int i10 = 0; i10 < length2; i10++) {
            this.engine.processBlock(this.DT, 0, this.f27786I, 0);
            process(this.f27787R, this.f27786I, this.f27788V);
            process(this.f27788V, this.f27787R, this.f27786I);
            byte[] bArr2 = this.f27787R;
            System.arraycopy(bArr2, 0, bArr, bArr2.length * i10, bArr2.length);
            increment(this.DT);
        }
        int length3 = bArr.length - (this.f27787R.length * length2);
        if (length3 > 0) {
            this.engine.processBlock(this.DT, 0, this.f27786I, 0);
            process(this.f27787R, this.f27786I, this.f27788V);
            process(this.f27788V, this.f27787R, this.f27786I);
            byte[] bArr3 = this.f27787R;
            System.arraycopy(bArr3, 0, bArr, length2 * bArr3.length, length3);
            increment(this.DT);
        }
        this.reseedCounter++;
        return bArr.length * 8;
    }

    public EntropySource getEntropySource() {
        return this.entropySource;
    }

    public void reseed() {
        byte[] entropy = this.entropySource.getEntropy();
        this.f27788V = entropy;
        if (entropy.length != this.engine.getBlockSize()) {
            throw new IllegalStateException("Insufficient entropy returned");
        }
        this.reseedCounter = 1L;
    }
}
