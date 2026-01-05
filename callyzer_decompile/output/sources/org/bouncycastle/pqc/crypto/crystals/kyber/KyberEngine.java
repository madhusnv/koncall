package org.bouncycastle.pqc.crypto.crystals.kyber;

import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class KyberEngine {
    private static final int KyberEta2 = 2;
    private static final int KyberIndCpaMsgBytes = 32;
    public static final int KyberN = 256;
    public static final int KyberPolyBytes = 384;
    public static final int KyberQ = 3329;
    public static final int KyberQinv = 62209;
    private static final int KyberSharedSecretBytes = 32;
    public static final int KyberSymBytes = 32;
    private final int CryptoBytes;
    private final int CryptoCipherTextBytes;
    private final int CryptoPublicKeyBytes;
    private final int CryptoSecretKeyBytes;
    private final int KyberCipherTextBytes;
    private final int KyberEta1;
    private final int KyberIndCpaBytes;
    private final int KyberIndCpaPublicKeyBytes;
    private final int KyberIndCpaSecretKeyBytes;
    private final int KyberK;
    private final int KyberPolyCompressedBytes;
    private final int KyberPolyVecBytes;
    private final int KyberPolyVecCompressedBytes;
    private final int KyberPublicKeyBytes;
    private final int KyberSecretKeyBytes;
    private KyberIndCpa indCpa;
    private SecureRandom random;
    private final int sessionKeyLength;
    private final Symmetric symmetric;

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KyberEngine(int r5, boolean r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.KyberK = r5
            r0 = 128(0x80, float:1.8E-43)
            r1 = 3
            r2 = 32
            r3 = 2
            if (r5 == r3) goto L38
            if (r5 == r1) goto L2d
            r0 = 4
            if (r5 != r0) goto L1f
            r4.KyberEta1 = r3
            r0 = 160(0xa0, float:2.24E-43)
            r4.KyberPolyCompressedBytes = r0
            int r0 = r5 * 352
            r4.KyberPolyVecCompressedBytes = r0
            r4.sessionKeyLength = r2
            goto L3b
        L1f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "K: "
            java.lang.String r1 = " is not supported for Crystals Kyber"
            java.lang.String r5 = org.bouncycastle.jcajce.provider.digest.AbstractC5601a.m11232c(r5, r0, r1)
            r6.<init>(r5)
            throw r6
        L2d:
            r4.KyberEta1 = r3
        L2f:
            r4.KyberPolyCompressedBytes = r0
            int r0 = r5 * 320
            r4.KyberPolyVecCompressedBytes = r0
            r4.sessionKeyLength = r2
            goto L3b
        L38:
            r4.KyberEta1 = r1
            goto L2f
        L3b:
            int r5 = r5 * 384
            r4.KyberPolyVecBytes = r5
            int r0 = r5 + 32
            r4.KyberIndCpaPublicKeyBytes = r0
            r4.KyberIndCpaSecretKeyBytes = r5
            int r1 = r4.KyberPolyVecCompressedBytes
            int r3 = r4.KyberPolyCompressedBytes
            int r1 = r1 + r3
            r4.KyberIndCpaBytes = r1
            r4.KyberPublicKeyBytes = r0
            int r5 = r5 + r0
            int r5 = r5 + 64
            r4.KyberSecretKeyBytes = r5
            r4.KyberCipherTextBytes = r1
            r4.CryptoBytes = r2
            r4.CryptoSecretKeyBytes = r5
            r4.CryptoPublicKeyBytes = r0
            r4.CryptoCipherTextBytes = r1
            if (r6 == 0) goto L67
            org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric$AesSymmetric r5 = new org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric$AesSymmetric
            r5.<init>()
        L64:
            r4.symmetric = r5
            goto L6d
        L67:
            org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric$ShakeSymmetric r5 = new org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric$ShakeSymmetric
            r5.<init>()
            goto L64
        L6d:
            org.bouncycastle.pqc.crypto.crystals.kyber.KyberIndCpa r5 = new org.bouncycastle.pqc.crypto.crystals.kyber.KyberIndCpa
            r5.<init>(r4)
            r4.indCpa = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine.<init>(int, boolean):void");
    }

    private void cmov(byte[] bArr, byte[] bArr2, int i10, boolean z6) {
        if (z6) {
            System.arraycopy(bArr2, 0, bArr, 0, i10);
        } else {
            System.arraycopy(bArr, 0, bArr, 0, i10);
        }
    }

    public static int getKyberEta2() {
        return 2;
    }

    public static int getKyberIndCpaMsgBytes() {
        return 32;
    }

    public byte[][] generateKemKeyPair() {
        byte[][] bArrGenerateKeyPair = this.indCpa.generateKeyPair();
        int i10 = this.KyberIndCpaSecretKeyBytes;
        byte[] bArr = new byte[i10];
        System.arraycopy(bArrGenerateKeyPair[1], 0, bArr, 0, i10);
        byte[] bArr2 = new byte[32];
        this.symmetric.hash_h(bArr2, bArrGenerateKeyPair[0], 0);
        byte[] bArr3 = new byte[32];
        this.random.nextBytes(bArr3);
        int i11 = this.KyberIndCpaPublicKeyBytes;
        byte[] bArr4 = new byte[i11];
        System.arraycopy(bArrGenerateKeyPair[0], 0, bArr4, 0, i11);
        int i12 = i11 - 32;
        return new byte[][]{Arrays.copyOfRange(bArr4, 0, i12), Arrays.copyOfRange(bArr4, i12, i11), bArr, bArr2, bArr3};
    }

    public int getCryptoBytes() {
        return this.CryptoBytes;
    }

    public int getCryptoCipherTextBytes() {
        return this.CryptoCipherTextBytes;
    }

    public int getCryptoPublicKeyBytes() {
        return this.CryptoPublicKeyBytes;
    }

    public int getCryptoSecretKeyBytes() {
        return this.CryptoSecretKeyBytes;
    }

    public int getKyberCipherTextBytes() {
        return this.KyberCipherTextBytes;
    }

    public int getKyberEta1() {
        return this.KyberEta1;
    }

    public int getKyberIndCpaBytes() {
        return this.KyberIndCpaBytes;
    }

    public int getKyberIndCpaPublicKeyBytes() {
        return this.KyberIndCpaPublicKeyBytes;
    }

    public int getKyberIndCpaSecretKeyBytes() {
        return this.KyberIndCpaSecretKeyBytes;
    }

    public int getKyberK() {
        return this.KyberK;
    }

    public int getKyberPolyCompressedBytes() {
        return this.KyberPolyCompressedBytes;
    }

    public int getKyberPolyVecBytes() {
        return this.KyberPolyVecBytes;
    }

    public int getKyberPolyVecCompressedBytes() {
        return this.KyberPolyVecCompressedBytes;
    }

    public int getKyberPublicKeyBytes() {
        return this.KyberPublicKeyBytes;
    }

    public int getKyberSecretKeyBytes() {
        return this.KyberSecretKeyBytes;
    }

    public void getRandomBytes(byte[] bArr) {
        this.random.nextBytes(bArr);
    }

    public Symmetric getSymmetric() {
        return this.symmetric;
    }

    public void init(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public byte[] kemDecrypt(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, this.KyberIndCpaSecretKeyBytes, bArr2.length);
        System.arraycopy(this.indCpa.decrypt(bArr, bArr2), 0, bArr3, 0, 32);
        System.arraycopy(bArr2, this.KyberSecretKeyBytes - 64, bArr3, 32, 32);
        this.symmetric.hash_g(bArr4, bArr3);
        boolean z6 = !Arrays.constantTimeAreEqual(bArr, this.indCpa.encrypt(Arrays.copyOfRange(bArr3, 0, 32), bArrCopyOfRange, Arrays.copyOfRange(bArr4, 32, 64)));
        this.symmetric.hash_h(bArr4, bArr, 32);
        int i10 = this.KyberSecretKeyBytes;
        cmov(bArr4, Arrays.copyOfRange(bArr2, i10 - 32, i10), 32, z6);
        return Arrays.copyOfRange(bArr4, 0, this.sessionKeyLength);
    }

    public byte[][] kemEncrypt(byte[] bArr) {
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[32];
        this.random.nextBytes(bArr4);
        System.arraycopy(bArr4, 0, bArr2, 0, 32);
        this.symmetric.hash_h(bArr2, bArr, 32);
        this.symmetric.hash_g(bArr3, bArr2);
        byte[] bArrEncrypt = this.indCpa.encrypt(Arrays.copyOfRange(bArr2, 0, 32), bArr, Arrays.copyOfRange(bArr3, 32, 64));
        int i10 = this.sessionKeyLength;
        byte[] bArr5 = new byte[i10];
        System.arraycopy(bArr3, 0, bArr5, 0, i10);
        return new byte[][]{bArr5, bArrEncrypt};
    }
}
