package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class CMCEEngine {
    private int COND_BYTES;
    private int GFBITS;
    private int GFMASK;
    private int IRR_BYTES;
    private int PK_NCOLS;
    private int PK_NROWS;
    private int PK_ROW_BYTES;
    private int SYND_BYTES;
    private int SYS_N;
    private int SYS_T;
    private BENES benes;
    private boolean countErrorIndices;
    private final int defaultKeySize;

    /* renamed from: gf, reason: collision with root package name */
    private GF f44665gf;
    private int[] poly;
    private boolean usePadding;
    private boolean usePivots;

    public CMCEEngine(int i10, int i11, int i12, int[] iArr, boolean z6, int i13) {
        BENES benes13;
        this.usePivots = z6;
        this.SYS_N = i11;
        this.SYS_T = i12;
        this.GFBITS = i10;
        this.poly = iArr;
        this.defaultKeySize = i13;
        this.IRR_BYTES = i12 * 2;
        this.COND_BYTES = ((i10 * 2) - 1) * (1 << (i10 - 4));
        int i14 = i12 * i10;
        this.PK_NROWS = i14;
        int i15 = i11 - i14;
        this.PK_NCOLS = i15;
        this.PK_ROW_BYTES = (i15 + 7) / 8;
        this.SYND_BYTES = (i14 + 7) / 8;
        this.GFMASK = (1 << i10) - 1;
        if (i10 == 12) {
            this.f44665gf = new GF12();
            benes13 = new BENES12(this.SYS_N, this.SYS_T, this.GFBITS);
        } else {
            this.f44665gf = new GF13();
            benes13 = new BENES13(this.SYS_N, this.SYS_T, this.GFBITS);
        }
        this.benes = benes13;
        this.usePadding = this.SYS_T % 8 != 0;
        this.countErrorIndices = (1 << this.GFBITS) > this.SYS_N;
    }

    private void bm(short[] sArr, short[] sArr2) {
        int i10;
        int i11 = this.SYS_T;
        short[] sArr3 = new short[i11 + 1];
        short[] sArr4 = new short[i11 + 1];
        short s5 = 1;
        short[] sArr5 = new short[i11 + 1];
        int i12 = 0;
        for (int i13 = 0; i13 < this.SYS_T + 1; i13++) {
            sArr5[i13] = 0;
            sArr4[i13] = 0;
        }
        sArr4[0] = 1;
        sArr5[1] = 1;
        short s10 = 1;
        short s11 = 0;
        short s12 = 0;
        while (s11 < this.SYS_T * 2) {
            int iGf_mul_ext = 0;
            for (int i14 = 0; i14 <= min(s11, this.SYS_T); i14++) {
                iGf_mul_ext ^= this.f44665gf.gf_mul_ext(sArr4[i14], sArr2[s11 - i14]);
            }
            short sGf_reduce = this.f44665gf.gf_reduce(iGf_mul_ext);
            short s13 = (short) (((short) (((short) (((short) (sGf_reduce - 1)) >> 15)) & s5)) - s5);
            short s14 = (short) (((short) (((short) (((short) (((short) (s11 - (s12 * 2))) >> 15)) & s5)) - s5)) & s13);
            for (int i15 = 0; i15 <= this.SYS_T; i15++) {
                sArr3[i15] = sArr4[i15];
            }
            short sGf_frac = this.f44665gf.gf_frac(s10, sGf_reduce);
            int i16 = 0;
            while (true) {
                i10 = this.SYS_T;
                if (i16 > i10) {
                    break;
                }
                sArr4[i16] = (short) ((this.f44665gf.gf_mul(sGf_frac, sArr5[i16]) & s13) ^ sArr4[i16]);
                i16++;
            }
            int i17 = ~s14;
            int i18 = s11 + 1;
            s12 = (short) (((i18 - s12) & s14) | (s12 & i17));
            for (int i19 = i10 - 1; i19 >= 0; i19--) {
                sArr5[i19 + 1] = (short) ((sArr5[i19] & i17) | (sArr3[i19] & s14));
            }
            sArr5[0] = 0;
            s10 = (short) ((i17 & s10) | (sGf_reduce & s14));
            s11 = (short) i18;
            s5 = 1;
        }
        while (true) {
            int i20 = this.SYS_T;
            if (i12 > i20) {
                return;
            }
            sArr[i12] = sArr4[i20 - i12];
            i12++;
        }
    }

    public static void cbrecursion(byte[] bArr, long j6, long j10, short[] sArr, int i10, long j11, long j12, int[] iArr) {
        long j13;
        int i11;
        int i12;
        int i13;
        char c2;
        long j14;
        long j15;
        long j16;
        long j17 = j12;
        long j18 = 1;
        long j19 = 7;
        char c10 = 3;
        if (j11 == 1) {
            int i14 = (int) (j6 >> 3);
            bArr[i14] = (byte) ((get_q_short(iArr, i10) << ((int) (j6 & 7))) ^ bArr[i14]);
            return;
        }
        if (sArr != null) {
            long j20 = 0;
            while (j20 < j17) {
                int i15 = (int) j20;
                long j21 = j18;
                iArr[i15] = sArr[(int) (j20 ^ j21)] | ((sArr[i15] ^ 1) << 16);
                j20 += j21;
                j18 = j21;
            }
            j13 = j18;
        } else {
            j13 = 1;
            long j22 = 0;
            while (j22 < j17) {
                long j23 = i10;
                iArr[(int) j22] = ((get_q_short(iArr, (int) (j23 + j22)) ^ 1) << 16) | get_q_short(iArr, (int) (j23 + (j22 ^ 1)));
                j22++;
                j19 = j19;
            }
        }
        long j24 = j19;
        int i16 = (int) j17;
        sort32(iArr, 0, i16);
        long j25 = 0;
        while (true) {
            i11 = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            if (j25 >= j17) {
                break;
            }
            int i17 = (int) j25;
            int i18 = 65535 & iArr[i17];
            if (j25 >= i18) {
                i17 = i18;
            }
            iArr[(int) (j17 + j25)] = i17 | (i18 << 16);
            j25 += j13;
        }
        for (long j26 = 0; j26 < j17; j26 += j13) {
            iArr[(int) j26] = (int) ((iArr[r7] << 16) | j26);
        }
        sort32(iArr, 0, i16);
        long j27 = 0;
        while (j27 < j17) {
            int i19 = (int) j27;
            iArr[i19] = (iArr[i19] << 16) + (iArr[(int) (j17 + j27)] >> 16);
            j27 += j13;
            c10 = c10;
        }
        char c11 = c10;
        sort32(iArr, 0, i16);
        if (j11 <= 10) {
            for (long j28 = 0; j28 < j17; j28 += j13) {
                int i20 = (int) (j17 + j28);
                iArr[i20] = ((iArr[(int) j28] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) << 10) | (iArr[i20] & 1023);
            }
            long j29 = j13;
            while (j29 < j11 - j13) {
                long j30 = 0;
                while (j30 < j17) {
                    iArr[(int) j30] = (int) (((iArr[(int) (j17 + j30)] & (-1024)) << 6) | j30);
                    j30 += j13;
                    j29 = j29;
                }
                long j31 = j29;
                sort32(iArr, 0, i16);
                for (long j32 = 0; j32 < j17; j32 += j13) {
                    int i21 = (int) j32;
                    iArr[i21] = (iArr[i21] << 20) | iArr[(int) (j17 + j32)];
                }
                sort32(iArr, 0, i16);
                for (long j33 = 0; j33 < j17; j33 += j13) {
                    int i22 = iArr[(int) j33];
                    int i23 = 1048575 & i22;
                    int i24 = (int) (j17 + j33);
                    int i25 = (i22 & 1047552) | (iArr[i24] & 1023);
                    if (i23 >= i25) {
                        i23 = i25;
                    }
                    iArr[i24] = i23;
                }
                j29 = j31 + j13;
            }
            for (long j34 = 0; j34 < j17; j34 += j13) {
                int i26 = (int) (j17 + j34);
                iArr[i26] = iArr[i26] & 1023;
            }
            i12 = 65535;
            i13 = -65536;
            c2 = c11;
            j14 = j13;
        } else {
            int i27 = -65536;
            for (long j35 = 0; j35 < j17; j35 += j13) {
                int i28 = (int) (j17 + j35);
                iArr[i28] = (iArr[(int) j35] << 16) | (iArr[i28] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            }
            long j36 = j13;
            while (j36 < j11 - j13) {
                long j37 = 0;
                while (j37 < j17) {
                    iArr[(int) j37] = (int) ((iArr[(int) (j17 + j37)] & r23) | j37);
                    j37 += j13;
                    i11 = i11;
                    i27 = i27;
                }
                int i29 = i11;
                int i30 = i27;
                sort32(iArr, 0, i16);
                long j38 = 0;
                while (j38 < j17) {
                    int i31 = (int) j38;
                    long j39 = j13;
                    iArr[i31] = (iArr[i31] << 16) | (iArr[(int) (j17 + j38)] & i29);
                    j38 += j39;
                    c11 = c11;
                    j13 = j39;
                }
                char c12 = c11;
                long j40 = j13;
                if (j36 < j11 - 2) {
                    for (long j41 = 0; j41 < j17; j41 += j40) {
                        int i32 = (int) (j17 + j41);
                        iArr[i32] = (iArr[(int) j41] & i30) | (iArr[i32] >> 16);
                    }
                    sort32(iArr, i16, (int) (j17 * 2));
                    for (long j42 = 0; j42 < j17; j42 += j40) {
                        int i33 = (int) (j17 + j42);
                        iArr[i33] = (iArr[i33] << 16) | (iArr[(int) j42] & i29);
                    }
                }
                sort32(iArr, 0, i16);
                for (long j43 = 0; j43 < j17; j43 += j40) {
                    int i34 = (int) (j17 + j43);
                    int i35 = iArr[i34];
                    int i36 = (i35 & i30) | (iArr[(int) j43] & i29);
                    if (i36 < i35) {
                        iArr[i34] = i36;
                    }
                }
                j36 += j40;
                i11 = i29;
                c11 = c12;
                i27 = i30;
                j13 = j40;
            }
            i12 = i11;
            i13 = i27;
            c2 = c11;
            j14 = j13;
            for (long j44 = 0; j44 < j17; j44 += j14) {
                int i37 = (int) (j17 + j44);
                iArr[i37] = iArr[i37] & i12;
            }
        }
        long j45 = 0;
        if (sArr != null) {
            while (j45 < j17) {
                iArr[(int) j45] = (int) ((sArr[r0] << 16) + j45);
                j45 += j14;
            }
        } else {
            while (j45 < j17) {
                iArr[(int) j45] = (int) ((get_q_short(iArr, (int) (i10 + j45)) << 16) + j45);
                j45 += j14;
            }
        }
        sort32(iArr, 0, i16);
        long j46 = j6;
        int i38 = i12;
        long j47 = 0;
        while (true) {
            j15 = j17 / 2;
            if (j47 >= j15) {
                break;
            }
            long j48 = j47 * 2;
            long j49 = j17 + j48;
            int i39 = (int) j49;
            int i40 = i38;
            int i41 = iArr[i39] & 1;
            char c13 = c2;
            int i42 = (int) (i41 + j48);
            long j50 = j46;
            int i43 = (int) (j50 >> c13);
            bArr[i43] = (byte) ((i41 << ((int) (j50 & j24))) ^ bArr[i43]);
            j46 = j50 + j10;
            iArr[i39] = (iArr[(int) j48] << 16) | i42;
            iArr[(int) (j49 + j14)] = (iArr[(int) (j48 + j14)] << 16) | (i42 ^ 1);
            j47 += j14;
            i38 = i40;
            j17 = j12;
            c2 = c13;
        }
        int i44 = i38;
        char c14 = c2;
        long j51 = j12 * 2;
        sort32(iArr, i16, (int) j51);
        long j52 = j11 * 2;
        long j53 = ((j52 - 3) * j10 * j15) + j46;
        long j54 = 0;
        while (true) {
            j16 = j51;
            if (j54 >= j15) {
                break;
            }
            long j55 = j54 * 2;
            long j56 = j52;
            long j57 = j12 + j55;
            int i45 = iArr[(int) j57];
            int i46 = i45 & 1;
            int i47 = (int) (i46 + j55);
            int i48 = i47 ^ 1;
            int i49 = (int) (j53 >> c14);
            bArr[i49] = (byte) (bArr[i49] ^ (i46 << ((int) (j53 & j24))));
            j53 += j10;
            iArr[(int) j55] = (i45 & i44) | (i47 << 16);
            iArr[(int) (j55 + j14)] = (i48 << 16) | (iArr[(int) (j57 + j14)] & i44);
            j54 += j14;
            j51 = j16;
            j52 = j56;
        }
        sort32(iArr, 0, i16);
        long j58 = j53 - (((j52 - 2) * j10) * j15);
        short[] sArr2 = new short[i16 * 4];
        for (long j59 = 0; j59 < j16; j59 += j14) {
            long j60 = j59 * 2;
            int i50 = iArr[(int) j59];
            sArr2[(int) j60] = (short) i50;
            sArr2[(int) (j60 + j14)] = (short) ((i50 & i13) >> 16);
        }
        for (long j61 = 0; j61 < j15; j61 += j14) {
            long j62 = j61 * 2;
            sArr2[(int) j61] = (short) ((iArr[(int) j62] & i44) >>> 1);
            sArr2[(int) (j61 + j15)] = (short) ((iArr[(int) (j62 + j14)] & i44) >>> 1);
        }
        for (long j63 = 0; j63 < j15; j63 += j14) {
            long j64 = j63 * 2;
            iArr[(int) ((j12 / 4) + j12 + j63)] = sArr2[(int) j64] | (sArr2[(int) (j64 + j14)] << 16);
        }
        long j65 = j10 * 2;
        long j66 = (j12 / 4) + j12;
        long j67 = j11 - j14;
        cbrecursion(bArr, j58, j65, null, ((int) j66) * 2, j67, j15, iArr);
        cbrecursion(bArr, j58 + j10, j65, null, (int) ((j66 * 2) + j15), j67, j15, iArr);
    }

    private static void controlbitsfrompermutation(byte[] bArr, short[] sArr, long j6, long j10) {
        long j11 = j10;
        int[] iArr = new int[(int) (j11 * 2)];
        int i10 = (int) j11;
        short[] sArr2 = new short[i10];
        while (true) {
            short s5 = 0;
            for (int i11 = 0; i11 < (((((j6 * 2) - 1) * j11) / 2) + 7) / 8; i11++) {
                bArr[i11] = 0;
            }
            cbrecursion(bArr, 0L, 1L, sArr, 0, j6, j11, iArr);
            for (int i12 = 0; i12 < j10; i12++) {
                sArr2[i12] = (short) i12;
            }
            int i13 = 0;
            for (int i14 = 0; i14 < j6; i14++) {
                layer(sArr2, bArr, i13, i14, i10);
                i13 = (int) (i13 + (j10 >> 4));
            }
            for (int i15 = (int) (j6 - 2); i15 >= 0; i15--) {
                layer(sArr2, bArr, i13, i15, i10);
                i13 = (int) (i13 + (j10 >> 4));
            }
            int i16 = 0;
            while (i16 < j10) {
                short s10 = (short) (s5 | (sArr[i16] ^ sArr2[i16]));
                i16++;
                s5 = s10;
            }
            if (s5 == 0) {
                return;
            } else {
                j11 = j10;
            }
        }
    }

    private static int ctz(long j6) {
        long j10 = ~j6;
        long j11 = 72340172838076673L;
        long j12 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j11 &= j10 >>> i10;
            j12 += j11;
        }
        long j13 = 578721382704613384L & j12;
        long j14 = j13 | (j13 >>> 1);
        long j15 = j14 | (j14 >>> 2);
        long j16 = j12 >>> 8;
        long j17 = j12 + (j16 & j15);
        for (int i11 = 2; i11 < 8; i11++) {
            j15 &= j15 >>> 8;
            j16 >>>= 8;
            j17 += j16 & j15;
        }
        return ((int) j17) & 255;
    }

    private int decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i10;
        int i11;
        int i12 = this.SYS_T;
        short[] sArr = new short[i12 + 1];
        int i13 = this.SYS_N;
        short[] sArr2 = new short[i13];
        short[] sArr3 = new short[i12 * 2];
        short[] sArr4 = new short[i12 * 2];
        short[] sArr5 = new short[i12 + 1];
        short[] sArr6 = new short[i13];
        byte[] bArr4 = new byte[i13 / 8];
        int i14 = 0;
        while (true) {
            i10 = this.SYND_BYTES;
            if (i14 >= i10) {
                break;
            }
            bArr4[i14] = bArr3[i14];
            i14++;
        }
        while (i10 < this.SYS_N / 8) {
            bArr4[i10] = 0;
            i10++;
        }
        int i15 = 0;
        while (true) {
            i11 = this.SYS_T;
            if (i15 >= i11) {
                break;
            }
            sArr[i15] = Utils.load_gf(bArr2, (i15 * 2) + 40, this.GFMASK);
            i15++;
        }
        sArr[i11] = 1;
        this.benes.support_gen(sArr2, bArr2);
        synd(sArr3, sArr, sArr2, bArr4);
        bm(sArr5, sArr3);
        root(sArr6, sArr5, sArr2);
        for (int i16 = 0; i16 < this.SYS_N / 8; i16++) {
            bArr[i16] = 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.SYS_N; i18++) {
            short sGf_iszero = (short) (this.f44665gf.gf_iszero(sArr6[i18]) & 1);
            int i19 = i18 / 8;
            bArr[i19] = (byte) (bArr[i19] | (sGf_iszero << (i18 % 8)));
            i17 += sGf_iszero;
        }
        synd(sArr4, sArr, sArr2, bArr);
        int i20 = this.SYS_T ^ i17;
        for (int i21 = 0; i21 < this.SYS_T * 2; i21++) {
            i20 |= sArr3[i21] ^ sArr4[i21];
        }
        return (((i20 - 1) >> 15) & 1) ^ 1;
    }

    private void encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        generate_error_vector(bArr3, secureRandom);
        syndrome(bArr, bArr2, bArr3);
    }

    private short eval(short[] sArr, short s5) {
        int i10 = this.SYS_T;
        short sGf_mul = sArr[i10];
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            sGf_mul = (short) (this.f44665gf.gf_mul(sGf_mul, s5) ^ sArr[i11]);
        }
        return sGf_mul;
    }

    private void generate_error_vector(byte[] bArr, SecureRandom secureRandom) {
        int i10;
        int i11 = this.SYS_T;
        short[] sArr = new short[i11 * 2];
        short[] sArr2 = new short[i11];
        byte[] bArr2 = new byte[i11];
        while (true) {
            if (this.countErrorIndices) {
                byte[] bArr3 = new byte[this.SYS_T * 4];
                secureRandom.nextBytes(bArr3);
                for (int i12 = 0; i12 < this.SYS_T * 2; i12++) {
                    sArr[i12] = Utils.load_gf(bArr3, i12 * 2, this.GFMASK);
                }
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    i10 = this.SYS_T;
                    if (i13 >= i10 * 2 || i14 >= i10) {
                        break;
                    }
                    short s5 = sArr[i13];
                    if (s5 < this.SYS_N) {
                        sArr2[i14] = s5;
                        i14++;
                    }
                    i13++;
                }
                if (i14 < i10) {
                    continue;
                }
            } else {
                byte[] bArr4 = new byte[this.SYS_T * 2];
                secureRandom.nextBytes(bArr4);
                for (int i15 = 0; i15 < this.SYS_T; i15++) {
                    sArr2[i15] = Utils.load_gf(bArr4, i15 * 2, this.GFMASK);
                }
            }
            boolean z6 = false;
            for (int i16 = 1; i16 < this.SYS_T && !z6; i16++) {
                int i17 = 0;
                while (true) {
                    if (i17 >= i16) {
                        break;
                    }
                    if (sArr2[i16] == sArr2[i17]) {
                        z6 = true;
                        break;
                    }
                    i17++;
                }
            }
            if (!z6) {
                break;
            }
        }
        for (int i18 = 0; i18 < this.SYS_T; i18++) {
            bArr2[i18] = (byte) (1 << (sArr2[i18] & 7));
        }
        for (short s10 = 0; s10 < this.SYS_N / 8; s10 = (short) (s10 + 1)) {
            bArr[s10] = 0;
            for (int i19 = 0; i19 < this.SYS_T; i19++) {
                bArr[s10] = (byte) ((((short) (same_mask32(s10, (short) (sArr2[i19] >> 3)) & 255)) & bArr2[i19]) | bArr[s10]);
            }
        }
    }

    private int generate_irr_poly(short[] sArr) {
        int i10;
        int i11 = this.SYS_T;
        int i12 = 2;
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i11 + 1, i11);
        sArr2[0][0] = 1;
        System.arraycopy(sArr, 0, sArr2[1], 0, this.SYS_T);
        int[] iArr = new int[(this.SYS_T * 2) - 1];
        while (true) {
            i10 = this.SYS_T;
            if (i12 >= i10) {
                break;
            }
            this.f44665gf.gf_sqr_poly(i10, this.poly, sArr2[i12], sArr2[i12 >>> 1], iArr);
            int[] iArr2 = iArr;
            this.f44665gf.gf_mul_poly(this.SYS_T, this.poly, sArr2[i12 + 1], sArr2[i12], sArr, iArr2);
            iArr = iArr2;
            i12 += 2;
        }
        if (i12 == i10) {
            this.f44665gf.gf_sqr_poly(i10, this.poly, sArr2[i12], sArr2[i12 >>> 1], iArr);
        }
        int i13 = 0;
        while (true) {
            int i14 = this.SYS_T;
            if (i13 >= i14) {
                System.arraycopy(sArr2[i14], 0, sArr, 0, i14);
                return 0;
            }
            int i15 = i13 + 1;
            for (int i16 = i15; i16 < this.SYS_T; i16++) {
                short sGf_iszero = this.f44665gf.gf_iszero(sArr2[i13][i13]);
                for (int i17 = i13; i17 < this.SYS_T + 1; i17++) {
                    short[] sArr3 = sArr2[i17];
                    sArr3[i13] = (short) (sArr3[i13] ^ ((short) (sArr3[i16] & sGf_iszero)));
                }
            }
            short s5 = sArr2[i13][i13];
            if (s5 == 0) {
                return -1;
            }
            short sGf_inv = this.f44665gf.gf_inv(s5);
            for (int i18 = i13; i18 < this.SYS_T + 1; i18++) {
                short[] sArr4 = sArr2[i18];
                sArr4[i13] = this.f44665gf.gf_mul(sArr4[i13], sGf_inv);
            }
            for (int i19 = 0; i19 < this.SYS_T; i19++) {
                if (i19 != i13) {
                    short s10 = sArr2[i13][i19];
                    for (int i20 = i13; i20 <= this.SYS_T; i20++) {
                        short[] sArr5 = sArr2[i20];
                        sArr5[i19] = (short) (sArr5[i19] ^ this.f44665gf.gf_mul(sArr5[i13], s10));
                    }
                }
            }
            i13 = i15;
        }
    }

    public static short get_q_short(int[] iArr, int i10) {
        int i11 = i10 / 2;
        return (short) (i10 % 2 == 0 ? iArr[i11] : (iArr[i11] & (-65536)) >> 16);
    }

    private static void layer(short[] sArr, byte[] bArr, int i10, int i11, int i12) {
        int i13 = 1 << i11;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15 += i13 * 2) {
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = i15 + i16;
                short s5 = sArr[i17];
                int i18 = i17 + i13;
                int i19 = (sArr[i18] ^ s5) & (-((bArr[(i14 >> 3) + i10] >> (i14 & 7)) & 1));
                sArr[i17] = (short) (s5 ^ i19);
                sArr[i18] = (short) (sArr[i18] ^ i19);
                i14++;
            }
        }
    }

    private static int min(short s5, int i10) {
        return s5 < i10 ? s5 : i10;
    }

    private int mov_columns(byte[][] bArr, short[] sArr, long[] jArr) {
        long jLoad8;
        int i10 = 64;
        long[] jArr2 = new long[64];
        int i11 = 32;
        long[] jArr3 = new long[32];
        byte[] bArr2 = new byte[9];
        int i12 = this.PK_NROWS - 32;
        int i13 = i12 / 8;
        int i14 = i12 % 8;
        boolean z6 = false;
        if (this.usePadding) {
            for (int i15 = 0; i15 < 32; i15++) {
                for (int i16 = 0; i16 < 9; i16++) {
                    bArr2[i16] = bArr[i12 + i15][i13 + i16];
                }
                int i17 = 0;
                while (i17 < 8) {
                    int i18 = i17 + 1;
                    bArr2[i17] = (byte) (((bArr2[i17] & 255) >> i14) | (bArr2[i18] << (8 - i14)));
                    i17 = i18;
                }
                jArr2[i15] = Utils.load8(bArr2, 0);
            }
        } else {
            for (int i19 = 0; i19 < 32; i19++) {
                jArr2[i19] = Utils.load8(bArr[i12 + i19], i13);
            }
        }
        long j6 = 0;
        jArr[0] = 0;
        int i20 = 0;
        while (true) {
            long j10 = 1;
            if (i20 >= 32) {
                int i21 = 0;
                while (i21 < i11) {
                    int i22 = i21 + 1;
                    int i23 = i22;
                    while (i23 < i10) {
                        long jSame_mask64 = (sArr[r11] ^ sArr[r15]) & same_mask64((short) i23, (short) r19[i21]);
                        sArr[i12 + i21] = (short) (sArr[r11] ^ jSame_mask64);
                        sArr[i12 + i23] = (short) (jSame_mask64 ^ sArr[r15]);
                        i23++;
                        i22 = i22;
                        jArr3 = jArr3;
                        i10 = 64;
                        i11 = 32;
                    }
                    i21 = i22;
                }
                long[] jArr4 = jArr3;
                for (int i24 = 0; i24 < this.PK_NROWS; i24++) {
                    if (this.usePadding) {
                        for (int i25 = 0; i25 < 9; i25++) {
                            bArr2[i25] = bArr[i24][i13 + i25];
                        }
                        int i26 = 0;
                        while (i26 < 8) {
                            int i27 = i26 + 1;
                            bArr2[i26] = (byte) (((bArr2[i26] & 255) >> i14) | (bArr2[i27] << (8 - i14)));
                            i26 = i27;
                        }
                        jLoad8 = Utils.load8(bArr2, 0);
                    } else {
                        jLoad8 = Utils.load8(bArr[i24], i13);
                    }
                    for (int i28 = 0; i28 < 32; i28++) {
                        long j11 = jArr4[i28];
                        long j12 = ((jLoad8 >> i28) ^ (jLoad8 >> ((int) j11))) & 1;
                        jLoad8 = (jLoad8 ^ (j12 << ((int) j11))) ^ (j12 << i28);
                    }
                    if (this.usePadding) {
                        Utils.store8(bArr2, 0, jLoad8);
                        byte[] bArr3 = bArr[i24];
                        int i29 = i13 + 8;
                        int i30 = 8 - i14;
                        bArr3[i29] = (byte) ((((bArr3[i29] & 255) >>> i14) << i14) | ((bArr2[7] & 255) >>> i30));
                        bArr3[i13] = (byte) (((bArr2[0] & 255) << i14) | (((bArr3[i13] & 255) << i30) >>> i30));
                        for (int i31 = 7; i31 >= 1; i31--) {
                            bArr[i24][i13 + i31] = (byte) (((bArr2[i31] & 255) << i14) | ((bArr2[i31 - 1] & 255) >>> i30));
                        }
                    } else {
                        Utils.store8(bArr[i24], i13, jLoad8);
                    }
                }
                return 0;
            }
            long j13 = jArr2[i20];
            int i32 = i20 + 1;
            long j14 = j6;
            for (int i33 = i32; i33 < 32; i33++) {
                j13 |= jArr2[i33];
            }
            if (j13 == j14) {
                return -1;
            }
            int iCtz = ctz(j13);
            boolean z10 = z6;
            long j15 = iCtz;
            jArr3[i20] = j15;
            jArr[z10 ? 1 : 0] = jArr[z10 ? 1 : 0] | (1 << ((int) j15));
            for (int i34 = i32; i34 < 32; i34++) {
                long j16 = jArr2[i20];
                jArr2[i20] = j16 ^ (jArr2[i34] & (((j16 >> iCtz) & 1) - 1));
            }
            int i35 = i32;
            while (i35 < 32) {
                long j17 = jArr2[i35];
                long j18 = j10;
                jArr2[i35] = j17 ^ (jArr2[i20] & (-((j17 >> iCtz) & j18)));
                i35++;
                j10 = j18;
                z10 = false;
            }
            z6 = z10;
            i20 = i32;
            j6 = j14;
        }
    }

    private int pk_gen(byte[] bArr, byte[] bArr2, int[] iArr, short[] sArr, long[] jArr) {
        int i10;
        int i11;
        int i12 = this.SYS_T;
        short[] sArr2 = new short[i12 + 1];
        byte b10 = 1;
        sArr2[i12] = 1;
        for (int i13 = 0; i13 < this.SYS_T; i13++) {
            sArr2[i13] = Utils.load_gf(bArr2, (i13 * 2) + 40, this.GFMASK);
        }
        int i14 = 1 << this.GFBITS;
        long[] jArr2 = new long[i14];
        for (int i15 = 0; i15 < (1 << this.GFBITS); i15++) {
            long j6 = iArr[i15];
            jArr2[i15] = j6;
            long j10 = j6 << 31;
            jArr2[i15] = j10;
            long j11 = j10 | i15;
            jArr2[i15] = j11;
            jArr2[i15] = j11 & Long.MAX_VALUE;
        }
        sort64(jArr2, 0, i14);
        for (int i16 = 1; i16 < (1 << this.GFBITS); i16++) {
            if ((jArr2[i16 - 1] >> 31) == (jArr2[i16] >> 31)) {
                return -1;
            }
        }
        short[] sArr3 = new short[this.SYS_N];
        for (int i17 = 0; i17 < (1 << this.GFBITS); i17++) {
            sArr[i17] = (short) (jArr2[i17] & this.GFMASK);
        }
        int i18 = 0;
        while (true) {
            i10 = this.SYS_N;
            if (i18 >= i10) {
                break;
            }
            sArr3[i18] = Utils.bitrev(sArr[i18], this.GFBITS);
            i18++;
        }
        short[] sArr4 = new short[i10];
        root(sArr4, sArr2, sArr3);
        int i19 = 0;
        while (true) {
            i11 = this.SYS_N;
            if (i19 >= i11) {
                break;
            }
            sArr4[i19] = this.f44665gf.gf_inv(sArr4[i19]);
            i19++;
        }
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.PK_NROWS, i11 / 8);
        for (int i20 = 0; i20 < this.PK_NROWS; i20++) {
            for (int i21 = 0; i21 < this.SYS_N / 8; i21++) {
                bArr3[i20][i21] = 0;
            }
        }
        int i22 = 0;
        while (i22 < this.SYS_T) {
            for (int i23 = 0; i23 < this.SYS_N; i23 += 8) {
                int i24 = 0;
                while (true) {
                    int i25 = this.GFBITS;
                    if (i24 < i25) {
                        bArr3[(i25 * i22) + i24][i23 / 8] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) ((sArr4[i23 + 7] >>> i24) & 1)) << 1)) | ((sArr4[i23 + 6] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 5] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 4] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 3] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 2] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 1] >>> i24) & 1))) << 1)) | ((sArr4[i23] >>> i24) & 1));
                        i24++;
                    }
                }
            }
            for (int i26 = 0; i26 < this.SYS_N; i26++) {
                sArr4[i26] = this.f44665gf.gf_mul(sArr4[i26], sArr3[i26]);
            }
            i22++;
        }
        int i27 = 0;
        while (true) {
            int i28 = this.PK_NROWS;
            if (i27 >= i28) {
                if (bArr != null) {
                    if (!this.usePadding) {
                        int i29 = ((this.SYS_N - i28) + 7) / 8;
                        int i30 = 0;
                        while (true) {
                            int i31 = this.PK_NROWS;
                            if (i30 >= i31) {
                                break;
                            }
                            System.arraycopy(bArr3[i30], i31 / 8, bArr, i29 * i30, i29);
                            i30++;
                        }
                    } else {
                        int i32 = i28 % 8;
                        if (i32 != 0) {
                            int i33 = 0;
                            int i34 = 0;
                            while (true) {
                                int i35 = this.PK_NROWS;
                                if (i33 >= i35) {
                                    break;
                                }
                                int i36 = (i35 - 1) / 8;
                                while (i36 < (this.SYS_N / 8) - 1) {
                                    byte[] bArr4 = bArr3[i33];
                                    int i37 = (bArr4[i36] & 255) >>> i32;
                                    i36++;
                                    bArr[i34] = (byte) ((bArr4[i36] << (8 - i32)) | i37);
                                    i34++;
                                }
                                bArr[i34] = (byte) ((bArr3[i33][i36] & 255) >>> i32);
                                i33++;
                                i34++;
                            }
                        } else {
                            System.arraycopy(bArr3[i22], (i28 - 1) / 8, bArr, 0, this.SYS_N / 8);
                        }
                    }
                }
                return 0;
            }
            i22 = i27 >>> 3;
            int i38 = i27 & 7;
            if (this.usePivots && i27 == i28 - 32) {
                if (mov_columns(bArr3, sArr, jArr) != 0) {
                    return -1;
                }
            }
            int i39 = i27 + 1;
            for (int i40 = i39; i40 < this.PK_NROWS; i40++) {
                byte b11 = (byte) (-((byte) (((byte) (((byte) (bArr3[i27][i22] ^ bArr3[i40][i22])) >> i38)) & b10)));
                int i41 = 0;
                while (i41 < this.SYS_N / 8) {
                    byte[] bArr5 = bArr3[i27];
                    bArr5[i41] = (byte) (bArr5[i41] ^ (bArr3[i40][i41] & b11));
                    i41++;
                    b10 = b10;
                }
            }
            byte b12 = b10;
            if (((bArr3[i27][i22] >> i38) & 1) == 0) {
                return -1;
            }
            for (int i42 = 0; i42 < this.PK_NROWS; i42++) {
                if (i42 != i27) {
                    byte b13 = (byte) (-((byte) (((byte) (bArr3[i42][i22] >> i38)) & 1)));
                    for (int i43 = 0; i43 < this.SYS_N / 8; i43++) {
                        byte[] bArr6 = bArr3[i42];
                        bArr6[i43] = (byte) (bArr6[i43] ^ (bArr3[i27][i43] & b13));
                    }
                }
            }
            i27 = i39;
            b10 = b12;
        }
    }

    private void root(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i10 = 0; i10 < this.SYS_N; i10++) {
            sArr[i10] = eval(sArr2, sArr3[i10]);
        }
    }

    private static byte same_mask32(short s5, short s10) {
        return (byte) ((-(((s5 ^ s10) - 1) >>> 31)) & 255);
    }

    private static long same_mask64(short s5, short s10) {
        return -(((s5 ^ s10) - 1) >>> 63);
    }

    private static void sort32(int[] iArr, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 < 2) {
            return;
        }
        int i13 = 1;
        while (i13 < i12 - i13) {
            i13 += i13;
        }
        for (int i14 = i13; i14 > 0; i14 >>>= 1) {
            int i15 = 0;
            for (int i16 = 0; i16 < i12 - i14; i16++) {
                if ((i16 & i14) == 0) {
                    int i17 = i10 + i16;
                    int i18 = i17 + i14;
                    int i19 = iArr[i18];
                    int i20 = iArr[i17];
                    int i21 = i19 ^ i20;
                    int i22 = i19 - i20;
                    int i23 = ((((i19 ^ i22) & i21) ^ i22) >> 31) & i21;
                    iArr[i17] = i20 ^ i23;
                    iArr[i18] = iArr[i18] ^ i23;
                }
            }
            for (int i24 = i13; i24 > i14; i24 >>>= 1) {
                while (i15 < i12 - i24) {
                    if ((i15 & i14) == 0) {
                        int i25 = i10 + i15;
                        int i26 = i25 + i14;
                        int i27 = iArr[i26];
                        for (int i28 = i24; i28 > i14; i28 >>>= 1) {
                            int i29 = i25 + i28;
                            int i30 = iArr[i29];
                            int i31 = i30 ^ i27;
                            int i32 = i30 - i27;
                            int i33 = i31 & ((i32 ^ ((i32 ^ i30) & i31)) >> 31);
                            i27 ^= i33;
                            iArr[i29] = i30 ^ i33;
                        }
                        iArr[i26] = i27;
                    }
                    i15++;
                }
            }
        }
    }

    private static void sort64(long[] jArr, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 < 2) {
            return;
        }
        int i13 = 1;
        while (i13 < i12 - i13) {
            i13 += i13;
        }
        for (int i14 = i13; i14 > 0; i14 >>>= 1) {
            int i15 = 0;
            for (int i16 = 0; i16 < i12 - i14; i16++) {
                if ((i16 & i14) == 0) {
                    int i17 = i10 + i16;
                    int i18 = i17 + i14;
                    long j6 = jArr[i18];
                    long j10 = jArr[i17];
                    long j11 = (j6 ^ j10) & (-((j6 - j10) >>> 63));
                    jArr[i17] = j10 ^ j11;
                    jArr[i18] = jArr[i18] ^ j11;
                }
            }
            for (int i19 = i13; i19 > i14; i19 >>>= 1) {
                while (i15 < i12 - i19) {
                    if ((i15 & i14) == 0) {
                        int i20 = i10 + i15;
                        int i21 = i20 + i14;
                        long j12 = jArr[i21];
                        for (int i22 = i19; i22 > i14; i22 >>>= 1) {
                            int i23 = i20 + i22;
                            long j13 = jArr[i23];
                            long j14 = (-((j13 - j12) >>> 63)) & (j12 ^ j13);
                            j12 ^= j14;
                            jArr[i23] = j13 ^ j14;
                        }
                        jArr[i21] = j12;
                    }
                    i15++;
                }
            }
        }
    }

    private void synd(short[] sArr, short[] sArr2, short[] sArr3, byte[] bArr) {
        short s5 = (short) (bArr[0] & 1);
        short s10 = sArr3[0];
        short sEval = eval(sArr2, s10);
        GF gf2 = this.f44665gf;
        short sGf_inv = (short) ((-s5) & gf2.gf_inv(gf2.gf_sq(sEval)));
        sArr[0] = sGf_inv;
        for (int i10 = 1; i10 < this.SYS_T * 2; i10++) {
            sGf_inv = this.f44665gf.gf_mul(sGf_inv, s10);
            sArr[i10] = sGf_inv;
        }
        for (int i11 = 1; i11 < this.SYS_N; i11++) {
            short s11 = (short) ((bArr[i11 / 8] >> (i11 % 8)) & 1);
            short s12 = sArr3[i11];
            short sEval2 = eval(sArr2, s12);
            GF gf3 = this.f44665gf;
            short sGf_mul = this.f44665gf.gf_mul(gf3.gf_inv(gf3.gf_sq(sEval2)), s11);
            sArr[0] = (short) (sArr[0] ^ sGf_mul);
            for (int i12 = 1; i12 < this.SYS_T * 2; i12++) {
                sGf_mul = this.f44665gf.gf_mul(sGf_mul, s12);
                sArr[i12] = (short) (sArr[i12] ^ sGf_mul);
            }
        }
    }

    private void syndrome(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        short[] sArr = new short[this.SYS_N / 8];
        int i10 = this.PK_NROWS % 8;
        for (int i11 = 0; i11 < this.SYND_BYTES; i11++) {
            bArr[i11] = 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.PK_NROWS; i13++) {
            for (int i14 = 0; i14 < this.SYS_N / 8; i14++) {
                sArr[i14] = 0;
            }
            int i15 = 0;
            while (true) {
                int i16 = this.PK_ROW_BYTES;
                if (i15 >= i16) {
                    break;
                }
                sArr[((this.SYS_N / 8) - i16) + i15] = bArr2[i12 + i15];
                i15++;
            }
            if (this.usePadding) {
                for (int i17 = (this.SYS_N / 8) - 1; i17 >= (this.SYS_N / 8) - this.PK_ROW_BYTES; i17--) {
                    sArr[i17] = (short) ((((sArr[i17] & 255) << i10) | ((sArr[i17 - 1] & 255) >>> (8 - i10))) & 255);
                }
            }
            int i18 = i13 / 8;
            int i19 = i13 % 8;
            sArr[i18] = (short) (sArr[i18] | (1 << i19));
            byte b10 = 0;
            for (int i20 = 0; i20 < this.SYS_N / 8; i20++) {
                b10 = (byte) (b10 ^ (sArr[i20] & bArr3[i20]));
            }
            byte b11 = (byte) ((b10 >>> 4) ^ b10);
            byte b12 = (byte) (b11 ^ (b11 >>> 2));
            bArr[i18] = (byte) ((((byte) (1 & ((byte) (b12 ^ (b12 >>> 1))))) << i19) | bArr[i18]);
            i12 += this.PK_ROW_BYTES;
        }
    }

    public int check_c_padding(byte[] bArr) {
        return ((byte) ((((byte) (((byte) ((bArr[this.SYND_BYTES - 1] & 255) >>> (this.PK_NROWS % 8))) - 1)) & 255) >>> 7)) - 1;
    }

    public int check_pk_padding(byte[] bArr) {
        byte b10 = 0;
        for (int i10 = 0; i10 < this.PK_NROWS; i10++) {
            int i11 = this.PK_ROW_BYTES;
            b10 = (byte) (b10 | bArr[((i10 * i11) + i11) - 1]);
        }
        return ((byte) ((((byte) (((byte) ((b10 & 255) >>> (this.PK_NCOLS % 8))) - 1)) & 255) >>> 7)) - 1;
    }

    public byte[] decompress_private_key(byte[] bArr) {
        int i10;
        short[] sArr;
        byte[] bArr2 = new byte[getPrivateKeySize()];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i11 = ((1 << this.GFBITS) * 4) + (this.SYS_N / 8) + this.IRR_BYTES;
        int i12 = i11 + 32;
        byte[] bArr3 = new byte[i12];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i12);
        if (bArr.length <= 40) {
            short[] sArr2 = new short[this.SYS_T];
            int i13 = this.IRR_BYTES;
            byte[] bArr4 = new byte[i13];
            int i14 = i11 - i13;
            for (int i15 = 0; i15 < this.SYS_T; i15++) {
                sArr2[i15] = Utils.load_gf(bArr3, (i15 * 2) + i14, this.GFMASK);
            }
            generate_irr_poly(sArr2);
            for (int i16 = 0; i16 < this.SYS_T; i16++) {
                Utils.store_gf(bArr4, i16 * 2, sArr2[i16]);
            }
            System.arraycopy(bArr4, 0, bArr2, 40, this.IRR_BYTES);
        }
        int length = bArr.length;
        int i17 = this.IRR_BYTES;
        if (length <= i17 + 40) {
            int i18 = this.GFBITS;
            int[] iArr = new int[1 << i18];
            short[] sArr3 = new short[1 << i18];
            int i19 = (i11 - i17) - ((1 << i18) * 4);
            int i20 = 0;
            while (true) {
                i10 = this.GFBITS;
                if (i20 >= (1 << i10)) {
                    break;
                }
                iArr[i20] = Utils.load4(bArr3, (i20 * 4) + i19);
                i20++;
            }
            if (this.usePivots) {
                sArr = sArr3;
                pk_gen(null, bArr2, iArr, sArr, new long[]{0});
            } else {
                sArr = sArr3;
                int i21 = 1 << i10;
                long[] jArr = new long[i21];
                for (int i22 = 0; i22 < (1 << this.GFBITS); i22++) {
                    long j6 = iArr[i22];
                    jArr[i22] = j6;
                    long j10 = j6 << 31;
                    jArr[i22] = j10;
                    long j11 = j10 | i22;
                    jArr[i22] = j11;
                    jArr[i22] = j11 & Long.MAX_VALUE;
                }
                sort64(jArr, 0, i21);
                for (int i23 = 0; i23 < (1 << this.GFBITS); i23++) {
                    sArr[i23] = (short) (jArr[i23] & this.GFMASK);
                }
            }
            int i24 = this.COND_BYTES;
            byte[] bArr5 = new byte[i24];
            controlbitsfrompermutation(bArr5, sArr, this.GFBITS, 1 << r3);
            System.arraycopy(bArr5, 0, bArr2, this.IRR_BYTES + 40, i24);
        }
        int privateKeySize = getPrivateKeySize();
        int i25 = this.SYS_N;
        System.arraycopy(bArr3, 0, bArr2, privateKeySize - (i25 / 8), i25 / 8);
        return bArr2;
    }

    public byte[] generate_public_key_from_private_key(byte[] bArr) {
        byte[] bArr2 = new byte[getPublicKeySize()];
        int i10 = this.GFBITS;
        short[] sArr = new short[1 << i10];
        long[] jArr = {0};
        int[] iArr = new int[1 << i10];
        int i11 = ((1 << i10) * 4) + (this.SYS_N / 8);
        byte[] bArr3 = new byte[i11];
        int i12 = ((i11 - 32) - this.IRR_BYTES) - ((1 << i10) * 4);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i11);
        for (int i13 = 0; i13 < (1 << this.GFBITS); i13++) {
            iArr[i13] = Utils.load4(bArr3, (i13 * 4) + i12);
        }
        pk_gen(bArr2, bArr, iArr, sArr, jArr);
        return bArr2;
    }

    public int getCipherTextSize() {
        return this.SYND_BYTES;
    }

    public int getCondBytes() {
        return this.COND_BYTES;
    }

    public int getDefaultSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getIrrBytes() {
        return this.IRR_BYTES;
    }

    public int getPrivateKeySize() {
        return (this.SYS_N / 8) + this.COND_BYTES + this.IRR_BYTES + 40;
    }

    public int getPublicKeySize() {
        if (!this.usePadding) {
            return (this.PK_NROWS * this.PK_NCOLS) / 8;
        }
        int i10 = this.PK_NROWS;
        return ((this.SYS_N / 8) - ((i10 - 1) / 8)) * i10;
    }

    public int kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i10 = this.SYS_N;
        byte[] bArr4 = new byte[i10 / 8];
        int i11 = (i10 / 8) + 1 + this.SYND_BYTES;
        byte[] bArr5 = new byte[i11];
        int iCheck_c_padding = this.usePadding ? check_c_padding(bArr2) : 0;
        short sDecrypt = (short) (((short) (((short) (((byte) decrypt(bArr4, bArr3, bArr2)) - 1)) >> 8)) & 255);
        bArr5[0] = (byte) (sDecrypt & 1);
        int i12 = 0;
        while (i12 < this.SYS_N / 8) {
            int i13 = i12 + 1;
            bArr5[i13] = (byte) ((bArr4[i12] & sDecrypt) | ((~sDecrypt) & bArr3[i12 + 40 + this.IRR_BYTES + this.COND_BYTES]));
            i12 = i13;
        }
        for (int i14 = 0; i14 < this.SYND_BYTES; i14++) {
            bArr5[(this.SYS_N / 8) + 1 + i14] = bArr2[i14];
        }
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, i11);
        sHAKEDigest.doFinal(bArr, 0, bArr.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b10 = (byte) iCheck_c_padding;
        for (int i15 = 0; i15 < bArr.length; i15++) {
            bArr[i15] = (byte) (bArr[i15] | b10);
        }
        return iCheck_c_padding;
    }

    public int kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        int i10 = this.SYS_N / 8;
        byte[] bArr4 = new byte[i10];
        int iCheck_pk_padding = this.usePadding ? check_pk_padding(bArr3) : 0;
        encrypt(bArr, bArr3, bArr4, secureRandom);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 1);
        sHAKEDigest.update(bArr4, 0, i10);
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.doFinal(bArr2, 0, bArr2.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b10 = (byte) (((byte) iCheck_pk_padding) ^ 255);
        for (int i11 = 0; i11 < this.SYND_BYTES; i11++) {
            bArr[i11] = (byte) (bArr[i11] & b10);
        }
        for (int i12 = 0; i12 < 32; i12++) {
            bArr2[i12] = (byte) (bArr2[i12] & b10);
        }
        return iCheck_pk_padding;
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i10;
        int i11;
        int i12;
        short[] sArr;
        int i13;
        long j6;
        int i14 = 32;
        byte[] bArr3 = new byte[32];
        int i15 = 1;
        int i16 = 0;
        byte[] bArr4 = {64};
        secureRandom.nextBytes(bArr3);
        int i17 = (this.SYS_T * 2) + ((1 << this.GFBITS) * 4) + (this.SYS_N / 8);
        int i18 = i17 + 32;
        byte[] bArr5 = new byte[i18];
        long[] jArr = {0};
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        byte[] bArr6 = bArr3;
        while (true) {
            sHAKEDigest.update(bArr4, i16, i15);
            sHAKEDigest.update(bArr3, i16, bArr3.length);
            sHAKEDigest.doFinal(bArr5, i16, i18);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr5, i17, i17 + 32);
            System.arraycopy(bArr6, i16, bArr2, i16, i14);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, i16, i14);
            int i19 = this.SYS_T;
            short[] sArr2 = new short[i19];
            int i20 = i17 - (i19 * 2);
            i10 = i15;
            for (int i21 = i16; i21 < this.SYS_T; i21++) {
                sArr2[i21] = Utils.load_gf(bArr5, (i21 * 2) + i20, this.GFMASK);
            }
            if (generate_irr_poly(sArr2) != -1) {
                for (int i22 = i16; i22 < this.SYS_T; i22++) {
                    Utils.store_gf(bArr2, (i22 * 2) + 40, sArr2[i22]);
                }
                int i23 = this.GFBITS;
                int[] iArr = new int[i10 << i23];
                i11 = i20 - ((i10 << i23) * 4);
                int i24 = 0;
                while (true) {
                    i12 = this.GFBITS;
                    if (i24 >= (i10 << i12)) {
                        break;
                    }
                    iArr[i24] = Utils.load4(bArr5, (i24 * 4) + i11);
                    i24++;
                }
                sArr = new short[i10 << i12];
                if (pk_gen(bArr, bArr2, iArr, sArr, jArr) != -1) {
                    break;
                }
            }
            bArr3 = bArrCopyOfRange;
            bArr6 = bArrCopyOfRange2;
            i15 = i10;
            i14 = 32;
            i16 = 0;
        }
        int i25 = this.COND_BYTES;
        byte[] bArr7 = new byte[i25];
        controlbitsfrompermutation(bArr7, sArr, this.GFBITS, i10 << r6);
        System.arraycopy(bArr7, 0, bArr2, this.IRR_BYTES + 40, i25);
        int i26 = this.SYS_N;
        System.arraycopy(bArr5, i11 - (i26 / 8), bArr2, bArr2.length - (i26 / 8), i26 / 8);
        if (this.usePivots) {
            i13 = 32;
            j6 = jArr[0];
        } else {
            j6 = 4294967295L;
            i13 = 32;
        }
        Utils.store8(bArr2, i13, j6);
    }
}
