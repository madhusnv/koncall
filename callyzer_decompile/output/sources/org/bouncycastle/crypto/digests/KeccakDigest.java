package org.bouncycastle.crypto.digests;

import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class KeccakDigest implements ExtendedDigest {
    private static long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    protected int bitsInQueue;
    protected byte[] dataQueue;
    protected int fixedOutputLength;
    protected final CryptoServicePurpose purpose;
    protected int rate;
    protected boolean squeezing;
    protected long[] state;

    public KeccakDigest() {
        this(288, CryptoServicePurpose.ANY);
    }

    private void KeccakAbsorb(byte[] bArr, int i10) {
        int i11 = this.rate >>> 6;
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.state;
            jArr[i12] = jArr[i12] ^ Pack.littleEndianToLong(bArr, i10);
            i10 += 8;
        }
        KeccakPermutation();
    }

    private void KeccakExtract() {
        KeccakPermutation();
        Pack.longToLittleEndian(this.state, 0, this.rate >>> 6, this.dataQueue, 0);
        this.bitsInQueue = this.rate;
    }

    private void KeccakPermutation() {
        long[] jArr = this.state;
        long j6 = jArr[0];
        long j10 = jArr[1];
        char c2 = 2;
        long j11 = jArr[2];
        char c10 = 3;
        long j12 = jArr[3];
        char c11 = 4;
        long j13 = jArr[4];
        long j14 = jArr[5];
        long j15 = jArr[6];
        long j16 = jArr[7];
        long j17 = jArr[8];
        long j18 = jArr[9];
        long j19 = jArr[10];
        long j20 = jArr[11];
        long j21 = jArr[12];
        long j22 = jArr[13];
        long j23 = jArr[14];
        long j24 = jArr[15];
        long j25 = jArr[16];
        long j26 = jArr[17];
        long j27 = jArr[18];
        long j28 = jArr[19];
        long j29 = jArr[20];
        long j30 = jArr[21];
        long j31 = jArr[22];
        long j32 = jArr[23];
        int i10 = 24;
        long j33 = jArr[24];
        int i11 = 0;
        while (i11 < i10) {
            long j34 = (((j6 ^ j14) ^ j19) ^ j24) ^ j29;
            long j35 = (((j10 ^ j15) ^ j20) ^ j25) ^ j30;
            long j36 = (((j11 ^ j16) ^ j21) ^ j26) ^ j31;
            long j37 = (((j12 ^ j17) ^ j22) ^ j27) ^ j32;
            long j38 = (((j13 ^ j18) ^ j23) ^ j28) ^ j33;
            long j39 = ((j35 << 1) | (j35 >>> (-1))) ^ j38;
            long j40 = ((j36 << 1) | (j36 >>> (-1))) ^ j34;
            long j41 = ((j37 << 1) | (j37 >>> (-1))) ^ j35;
            long j42 = ((j38 << 1) | (j38 >>> (-1))) ^ j36;
            long j43 = ((j34 << 1) | (j34 >>> (-1))) ^ j37;
            long j44 = j6 ^ j39;
            long j45 = j14 ^ j39;
            long j46 = j19 ^ j39;
            long j47 = j24 ^ j39;
            long j48 = j29 ^ j39;
            long j49 = j10 ^ j40;
            long j50 = j15 ^ j40;
            long j51 = j20 ^ j40;
            long j52 = j25 ^ j40;
            long j53 = j30 ^ j40;
            long j54 = j11 ^ j41;
            long j55 = j16 ^ j41;
            long j56 = j21 ^ j41;
            long j57 = j26 ^ j41;
            long j58 = j31 ^ j41;
            long j59 = j12 ^ j42;
            long j60 = j17 ^ j42;
            long j61 = j22 ^ j42;
            long j62 = j27 ^ j42;
            long j63 = j32 ^ j42;
            long j64 = j13 ^ j43;
            long j65 = j18 ^ j43;
            long j66 = j23 ^ j43;
            long j67 = j28 ^ j43;
            long j68 = j33 ^ j43;
            long j69 = (j49 << 1) | (j49 >>> 63);
            char c12 = c2;
            long j70 = (j50 << 44) | (j50 >>> 20);
            char c13 = c10;
            long j71 = (j65 << 20) | (j65 >>> 44);
            char c14 = c11;
            long j72 = (j58 << 61) | (j58 >>> c13);
            int i12 = i10;
            long j73 = (j66 << 39) | (j66 >>> 25);
            long j74 = (j48 << 18) | (j48 >>> 46);
            int i13 = i11;
            long j75 = (j54 << 62) | (j54 >>> c12);
            long j76 = (j56 << 43) | (j56 >>> 21);
            long j77 = (j61 << 25) | (j61 >>> 39);
            long j78 = (j67 << 8) | (j67 >>> 56);
            long j79 = (j63 << 56) | (j63 >>> 8);
            long j80 = (j47 << 41) | (j47 >>> 23);
            long j81 = (j64 << 27) | (j64 >>> 37);
            long j82 = (j68 << 14) | (j68 >>> 50);
            long j83 = (j53 << c12) | (j53 >>> 62);
            long j84 = (j60 << 55) | (j60 >>> 9);
            long j85 = (j52 << 45) | (j52 >>> 19);
            long j86 = (j45 << 36) | (j45 >>> 28);
            long j87 = (j59 << 28) | (j59 >>> 36);
            long j88 = (j62 << 21) | (j62 >>> 43);
            long j89 = (j57 << 15) | (j57 >>> 49);
            long j90 = (j51 << 10) | (j51 >>> 54);
            long j91 = (j55 << 6) | (j55 >>> 58);
            long j92 = (j46 << c13) | (j46 >>> 61);
            long j93 = j44 ^ ((~j70) & j76);
            j10 = ((~j76) & j88) ^ j70;
            long j94 = j76 ^ ((~j88) & j82);
            long j95 = j88 ^ ((~j82) & j44);
            long j96 = j82 ^ ((~j44) & j70);
            long j97 = j87 ^ ((~j71) & j92);
            long j98 = ((~j92) & j85) ^ j71;
            long j99 = ((~j85) & j72) ^ j92;
            long j100 = j85 ^ ((~j72) & j87);
            long j101 = ((~j87) & j71) ^ j72;
            j19 = j69 ^ ((~j91) & j77);
            long j102 = ((~j77) & j78) ^ j91;
            long j103 = ((~j78) & j74) ^ j77;
            long j104 = j78 ^ ((~j74) & j69);
            j23 = j74 ^ ((~j69) & j91);
            long j105 = j81 ^ ((~j86) & j90);
            long j106 = j86 ^ ((~j90) & j89);
            long j107 = ((~j89) & j79) ^ j90;
            long j108 = j89 ^ ((~j79) & j81);
            long j109 = ((~j81) & j86) ^ j79;
            long j110 = j75 ^ ((~j84) & j73);
            long j111 = ((~j73) & j80) ^ j84;
            long j112 = j73 ^ ((~j80) & j83);
            j32 = j80 ^ ((~j83) & j75);
            j25 = j106;
            j16 = j99;
            j30 = j111;
            j29 = j110;
            j31 = j112;
            j18 = j101;
            j17 = j100;
            j26 = j107;
            j22 = j104;
            j28 = j109;
            j14 = j97;
            j21 = j103;
            j15 = j98;
            c11 = c14;
            c2 = c12;
            j33 = j83 ^ ((~j75) & j84);
            jArr = jArr;
            i11 = i13 + 1;
            j6 = j93 ^ KeccakRoundConstants[i13];
            j12 = j95;
            j13 = j96;
            j20 = j102;
            i10 = i12;
            j27 = j108;
            j24 = j105;
            c10 = c13;
            j11 = j94;
        }
        long[] jArr2 = jArr;
        jArr2[0] = j6;
        jArr2[1] = j10;
        jArr2[c2] = j11;
        jArr2[c10] = j12;
        jArr2[c11] = j13;
        jArr2[5] = j14;
        jArr2[6] = j15;
        jArr2[7] = j16;
        jArr2[8] = j17;
        jArr2[9] = j18;
        jArr2[10] = j19;
        jArr2[11] = j20;
        jArr2[12] = j21;
        jArr2[13] = j22;
        jArr2[14] = j23;
        jArr2[15] = j24;
        jArr2[16] = j25;
        jArr2[17] = j26;
        jArr2[18] = j27;
        jArr2[19] = j28;
        jArr2[20] = j29;
        jArr2[21] = j30;
        jArr2[22] = j31;
        jArr2[23] = j32;
        jArr2[i10] = j33;
    }

    private void init(int i10) {
        if (i10 != 128 && i10 != 224 && i10 != 256 && i10 != 288 && i10 != 384 && i10 != 512) {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        initSponge(1600 - (i10 << 1));
    }

    private void initSponge(int i10) {
        if (i10 <= 0 || i10 >= 1600 || i10 % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.rate = i10;
        int i11 = 0;
        while (true) {
            long[] jArr = this.state;
            if (i11 >= jArr.length) {
                Arrays.fill(this.dataQueue, (byte) 0);
                this.bitsInQueue = 0;
                this.squeezing = false;
                this.fixedOutputLength = (1600 - i10) / 2;
                return;
            }
            jArr[i11] = 0;
            i11++;
        }
    }

    private void padAndSwitchToSqueezingPhase() {
        byte[] bArr = this.dataQueue;
        int i10 = this.bitsInQueue;
        int i11 = i10 >>> 3;
        bArr[i11] = (byte) (bArr[i11] | ((byte) (1 << (i10 & 7))));
        int i12 = i10 + 1;
        this.bitsInQueue = i12;
        if (i12 == this.rate) {
            KeccakAbsorb(bArr, 0);
        } else {
            int i13 = i12 >>> 6;
            int i14 = i12 & 63;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                long[] jArr = this.state;
                jArr[i16] = jArr[i16] ^ Pack.littleEndianToLong(this.dataQueue, i15);
                i15 += 8;
            }
            if (i14 > 0) {
                long[] jArr2 = this.state;
                jArr2[i13] = (((1 << i14) - 1) & Pack.littleEndianToLong(this.dataQueue, i15)) ^ jArr2[i13];
            }
        }
        long[] jArr3 = this.state;
        int i17 = (this.rate - 1) >>> 6;
        jArr3[i17] = jArr3[i17] ^ Long.MIN_VALUE;
        this.bitsInQueue = 0;
        this.squeezing = true;
    }

    public void absorb(byte b10) {
        int i10 = this.bitsInQueue;
        if (i10 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        byte[] bArr = this.dataQueue;
        bArr[i10 >>> 3] = b10;
        int i11 = i10 + 8;
        this.bitsInQueue = i11;
        if (i11 == this.rate) {
            KeccakAbsorb(bArr, 0);
            this.bitsInQueue = 0;
        }
    }

    public void absorbBits(int i10, int i11) {
        if (i11 < 1 || i11 > 7) {
            throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
        }
        int i12 = this.bitsInQueue;
        if (i12 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        this.dataQueue[i12 >>> 3] = (byte) (i10 & ((1 << i11) - 1));
        this.bitsInQueue = i12 + i11;
    }

    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, getDigestSize() * 8, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        squeeze(bArr, i10, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Keccak-" + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.rate / 8;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 8;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        init(this.fixedOutputLength);
    }

    public void squeeze(byte[] bArr, int i10, long j6) {
        if (!this.squeezing) {
            padAndSwitchToSqueezingPhase();
        }
        long j10 = 0;
        if (j6 % 8 != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        while (j10 < j6) {
            if (this.bitsInQueue == 0) {
                KeccakExtract();
            }
            int iMin = (int) Math.min(this.bitsInQueue, j6 - j10);
            System.arraycopy(this.dataQueue, (this.rate - this.bitsInQueue) / 8, bArr, ((int) (j10 / 8)) + i10, iMin / 8);
            this.bitsInQueue -= iMin;
            j10 += iMin;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        absorb(b10);
    }

    public KeccakDigest(int i10) {
        this(i10, CryptoServicePurpose.ANY);
    }

    public void absorb(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14 = this.bitsInQueue;
        if (i14 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int i15 = i14 >>> 3;
        int i16 = this.rate >>> 3;
        int i17 = i16 - i15;
        if (i11 < i17) {
            System.arraycopy(bArr, i10, this.dataQueue, i15, i11);
            i13 = this.bitsInQueue + (i11 << 3);
        } else {
            if (i15 > 0) {
                System.arraycopy(bArr, i10, this.dataQueue, i15, i17);
                KeccakAbsorb(this.dataQueue, 0);
            } else {
                i17 = 0;
            }
            while (true) {
                i12 = i11 - i17;
                if (i12 < i16) {
                    break;
                }
                KeccakAbsorb(bArr, i10 + i17);
                i17 += i16;
            }
            System.arraycopy(bArr, i10 + i17, this.dataQueue, 0, i12);
            i13 = i12 << 3;
        }
        this.bitsInQueue = i13;
    }

    public int doFinal(byte[] bArr, int i10, byte b10, int i11) {
        if (i11 > 0) {
            absorbBits(b10, i11);
        }
        squeeze(bArr, i10, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        absorb(bArr, i10, i11);
    }

    public KeccakDigest(int i10, CryptoServicePurpose cryptoServicePurpose) {
        this.state = new long[25];
        this.dataQueue = new byte[BERTags.PRIVATE];
        this.purpose = cryptoServicePurpose;
        init(i10);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    public KeccakDigest(CryptoServicePurpose cryptoServicePurpose) {
        this(288, cryptoServicePurpose);
    }

    public KeccakDigest(KeccakDigest keccakDigest) {
        long[] jArr = new long[25];
        this.state = jArr;
        this.dataQueue = new byte[BERTags.PRIVATE];
        this.purpose = keccakDigest.purpose;
        long[] jArr2 = keccakDigest.state;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        byte[] bArr = keccakDigest.dataQueue;
        System.arraycopy(bArr, 0, this.dataQueue, 0, bArr.length);
        this.rate = keccakDigest.rate;
        this.bitsInQueue = keccakDigest.bitsInQueue;
        this.fixedOutputLength = keccakDigest.fixedOutputLength;
        this.squeezing = keccakDigest.squeezing;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }
}
