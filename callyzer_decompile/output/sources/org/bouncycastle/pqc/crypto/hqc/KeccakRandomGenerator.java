package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class KeccakRandomGenerator {
    private static long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    protected int bitsInQueue;
    protected byte[] dataQueue;
    protected int fixedOutputLength;
    protected int rate;
    protected long[] state;

    public KeccakRandomGenerator() {
        this(288);
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
        Arrays.fill(this.state, 0L);
        Arrays.fill(this.dataQueue, (byte) 0);
        this.bitsInQueue = 0;
        this.fixedOutputLength = (1600 - i10) / 2;
    }

    private void keccakIncAbsorb(byte[] bArr, int i10) {
        long j6;
        long[] jArr;
        long j10;
        int i11 = this.rate >> 3;
        int i12 = i10;
        int i13 = 0;
        while (true) {
            j6 = i12;
            long j11 = i11;
            if (this.state[25] + j6 < j11) {
                break;
            }
            int i14 = 0;
            while (true) {
                long j12 = i14;
                jArr = this.state;
                j10 = jArr[25];
                if (j12 < j11 - j10) {
                    int i15 = i14;
                    int i16 = ((int) (j10 + j12)) >> 3;
                    jArr[i16] = jArr[i16] ^ (toUnsignedLong(bArr[i15 + i13] & 255) << ((int) (((this.state[25] + j12) & 7) * 8)));
                    i14 = i15 + 1;
                }
            }
            i12 = (int) (j6 - (j11 - j10));
            i13 = (int) ((j11 - j10) + i13);
            jArr[25] = 0;
            keccakPermutation(jArr);
        }
        int i17 = 0;
        while (true) {
            long[] jArr2 = this.state;
            if (i17 >= i12) {
                jArr2[25] = jArr2[25] + j6;
                return;
            }
            long j13 = i17;
            int i18 = ((int) (jArr2[25] + j13)) >> 3;
            jArr2[i18] = (toUnsignedLong(bArr[i17 + i13] & 255) << ((int) (((this.state[25] + j13) & 7) * 8))) ^ jArr2[i18];
            i17++;
        }
    }

    private void keccakIncFinalize(int i10) {
        int i11 = this.rate >> 3;
        long[] jArr = this.state;
        int i12 = ((int) jArr[25]) >> 3;
        long j6 = jArr[i12];
        long unsignedLong = toUnsignedLong(i10);
        long[] jArr2 = this.state;
        jArr[i12] = j6 ^ (unsignedLong << ((int) ((jArr2[25] & 7) * 8)));
        int i13 = i11 - 1;
        int i14 = i13 >> 3;
        jArr2[i14] = jArr2[i14] ^ (toUnsignedLong(128) << ((i13 & 7) * 8));
        this.state[25] = 0;
    }

    private void keccakIncSqueeze(byte[] bArr, int i10) {
        int i11 = this.rate >> 3;
        int i12 = 0;
        while (i12 < i10) {
            if (i12 >= this.state[25]) {
                break;
            }
            long j6 = i11;
            bArr[i12] = (byte) (r9[(int) (((j6 - r10) + r7) >> 3)] >> ((int) ((7 & ((j6 - r10) + r7)) * 8)));
            i12++;
        }
        int i13 = i10 - i12;
        long[] jArr = this.state;
        jArr[25] = jArr[25] - i12;
        while (i13 > 0) {
            keccakPermutation(this.state);
            int i14 = 0;
            while (i14 < i13 && i14 < i11) {
                bArr[i12 + i14] = (byte) (this.state[i14 >> 3] >> ((i14 & 7) * 8));
                i14++;
            }
            i12 += i14;
            i13 -= i14;
            this.state[25] = i11 - i14;
        }
    }

    private static void keccakPermutation(long[] jArr) {
        long j6 = jArr[0];
        long j10 = jArr[1];
        char c2 = 2;
        long j11 = jArr[2];
        char c10 = 3;
        long j12 = jArr[3];
        char c11 = 4;
        long j13 = jArr[4];
        char c12 = 5;
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
            char c13 = c2;
            long j70 = (j50 << 44) | (j50 >>> 20);
            char c14 = c10;
            long j71 = (j65 << 20) | (j65 >>> 44);
            char c15 = c11;
            long j72 = (j58 << 61) | (j58 >>> c14);
            int i12 = i10;
            long j73 = (j66 << 39) | (j66 >>> 25);
            int i13 = i11;
            long j74 = (j48 << 18) | (j48 >>> 46);
            long j75 = (j54 << 62) | (j54 >>> c13);
            long j76 = (j56 << 43) | (j56 >>> 21);
            long j77 = (j61 << 25) | (j61 >>> 39);
            long j78 = (j67 << 8) | (j67 >>> 56);
            long j79 = (j63 << 56) | (j63 >>> 8);
            long j80 = (j47 << 41) | (j47 >>> 23);
            long j81 = (j64 << 27) | (j64 >>> 37);
            long j82 = (j68 << 14) | (j68 >>> 50);
            long j83 = (j53 << c13) | (j53 >>> 62);
            long j84 = (j60 << 55) | (j60 >>> 9);
            long j85 = (j52 << 45) | (j52 >>> 19);
            long j86 = (j45 << 36) | (j45 >>> 28);
            long j87 = (j59 << 28) | (j59 >>> 36);
            long j88 = (j62 << 21) | (j62 >>> 43);
            long j89 = (j57 << 15) | (j57 >>> 49);
            long j90 = (j51 << 10) | (j51 >>> 54);
            long j91 = (j55 << 6) | (j55 >>> 58);
            long j92 = (j46 << c14) | (j46 >>> 61);
            long j93 = j44 ^ ((~j70) & j76);
            long j94 = ((~j76) & j88) ^ j70;
            long j95 = ((~j88) & j82) ^ j76;
            long j96 = j88 ^ ((~j82) & j44);
            j13 = j82 ^ (j70 & (~j44));
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
            long j113 = j83 ^ ((~j75) & j84);
            long j114 = j93 ^ KeccakRoundConstants[i13];
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
            j15 = j98;
            j14 = j97;
            j21 = j103;
            j20 = j102;
            c11 = c15;
            c2 = c13;
            c12 = c12;
            j27 = j108;
            j24 = j105;
            c10 = c14;
            j11 = j95;
            j10 = j94;
            j33 = j113;
            j6 = j114;
            i11 = i13 + 1;
            j12 = j96;
            i10 = i12;
        }
        jArr[0] = j6;
        jArr[1] = j10;
        jArr[c2] = j11;
        jArr[c10] = j12;
        jArr[c11] = j13;
        jArr[c12] = j14;
        jArr[6] = j15;
        jArr[7] = j16;
        jArr[8] = j17;
        jArr[9] = j18;
        jArr[10] = j19;
        jArr[11] = j20;
        jArr[12] = j21;
        jArr[13] = j22;
        jArr[14] = j23;
        jArr[15] = j24;
        jArr[16] = j25;
        jArr[17] = j26;
        jArr[18] = j27;
        jArr[19] = j28;
        jArr[20] = j29;
        jArr[21] = j30;
        jArr[22] = j31;
        jArr[23] = j32;
        jArr[i10] = j33;
    }

    private static long toUnsignedLong(int i10) {
        return i10 & 4294967295L;
    }

    public void SHAKE256_512_ds(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        Arrays.fill(this.state, 0L);
        keccakIncAbsorb(bArr2, i10);
        keccakIncAbsorb(bArr3, bArr3.length);
        keccakIncFinalize(31);
        keccakIncSqueeze(bArr, 64);
    }

    public void expandSeed(byte[] bArr, int i10) {
        int i11 = i10 & 7;
        int i12 = i10 - i11;
        keccakIncSqueeze(bArr, i12);
        if (i11 != 0) {
            byte[] bArr2 = new byte[8];
            keccakIncSqueeze(bArr2, 8);
            System.arraycopy(bArr2, 0, bArr, i12, i11);
        }
    }

    public void randomGeneratorInit(byte[] bArr, byte[] bArr2, int i10, int i11) {
        keccakIncAbsorb(bArr, i10);
        keccakIncAbsorb(bArr2, i11);
        keccakIncAbsorb(new byte[]{1}, 1);
        keccakIncFinalize(31);
    }

    public void seedExpanderInit(byte[] bArr, int i10) {
        keccakIncAbsorb(bArr, i10);
        keccakIncAbsorb(new byte[]{2}, 1);
        keccakIncFinalize(31);
    }

    public void squeeze(byte[] bArr, int i10) {
        keccakIncSqueeze(bArr, i10);
    }

    public KeccakRandomGenerator(int i10) {
        this.state = new long[26];
        this.dataQueue = new byte[BERTags.PRIVATE];
        init(i10);
    }
}
