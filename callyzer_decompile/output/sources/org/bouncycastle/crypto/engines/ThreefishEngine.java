package org.bouncycastle.crypto.engines;

import mm.AbstractC4801l;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private static final long C_240 = 2004413935125273122L;
    private static final int MAX_ROUNDS = 80;
    private static int[] MOD17 = null;
    private static int[] MOD3 = null;
    private static int[] MOD5 = null;
    private static int[] MOD9 = null;
    private static final int ROUNDS_1024 = 80;
    private static final int ROUNDS_256 = 72;
    private static final int ROUNDS_512 = 72;
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = 2;
    private int blocksizeBytes;
    private int blocksizeWords;
    private ThreefishCipher cipher;
    private long[] currentBlock;
    private boolean forEncryption;

    /* renamed from: kw, reason: collision with root package name */
    private long[] f44574kw;

    /* renamed from: t */
    private long[] f27673t;

    public static final class Threefish1024Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 24;
        private static final int ROTATION_0_1 = 13;
        private static final int ROTATION_0_2 = 8;
        private static final int ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8;
        private static final int ROTATION_0_5 = 17;
        private static final int ROTATION_0_6 = 22;
        private static final int ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38;
        private static final int ROTATION_1_1 = 19;
        private static final int ROTATION_1_2 = 10;
        private static final int ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49;
        private static final int ROTATION_1_5 = 18;
        private static final int ROTATION_1_6 = 23;
        private static final int ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33;
        private static final int ROTATION_2_1 = 4;
        private static final int ROTATION_2_2 = 51;
        private static final int ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34;
        private static final int ROTATION_2_5 = 41;
        private static final int ROTATION_2_6 = 59;
        private static final int ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 20;
        private static final int ROTATION_3_2 = 48;
        private static final int ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47;
        private static final int ROTATION_3_5 = 28;
        private static final int ROTATION_3_6 = 16;
        private static final int ROTATION_3_7 = 25;
        private static final int ROTATION_4_0 = 41;
        private static final int ROTATION_4_1 = 9;
        private static final int ROTATION_4_2 = 37;
        private static final int ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12;
        private static final int ROTATION_4_5 = 47;
        private static final int ROTATION_4_6 = 44;
        private static final int ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16;
        private static final int ROTATION_5_1 = 34;
        private static final int ROTATION_5_2 = 56;
        private static final int ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4;
        private static final int ROTATION_5_5 = 53;
        private static final int ROTATION_5_6 = 42;
        private static final int ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31;
        private static final int ROTATION_6_1 = 44;
        private static final int ROTATION_6_2 = 47;
        private static final int ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19;
        private static final int ROTATION_6_5 = 42;
        private static final int ROTATION_6_6 = 44;
        private static final int ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9;
        private static final int ROTATION_7_1 = 48;
        private static final int ROTATION_7_2 = 35;
        private static final int ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23;
        private static final int ROTATION_7_5 = 31;
        private static final int ROTATION_7_6 = 37;
        private static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f44575kw;
            long[] jArr4 = this.f27674t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j6 = jArr[0];
            int i10 = 1;
            long j10 = jArr[1];
            long j11 = jArr[2];
            long j12 = jArr[3];
            long j13 = jArr[4];
            long j14 = jArr[5];
            long j15 = jArr[6];
            long j16 = jArr[7];
            long j17 = jArr[8];
            int i11 = 9;
            long j18 = jArr[9];
            long j19 = jArr[10];
            long j20 = jArr[11];
            long j21 = jArr[12];
            long j22 = jArr[13];
            long j23 = jArr[14];
            long jXorRotr = jArr[15];
            int i12 = 19;
            while (i12 >= i10) {
                int i13 = iArr[i12];
                int i14 = iArr2[i12];
                int i15 = i13 + 1;
                long j24 = j6 - jArr3[i15];
                int i16 = i13 + 2;
                long j25 = j10 - jArr3[i16];
                int i17 = i13 + 3;
                long j26 = j11 - jArr3[i17];
                int i18 = i13 + 4;
                long j27 = j12 - jArr3[i18];
                int i19 = i13 + 5;
                int i20 = i10;
                long j28 = j13 - jArr3[i19];
                int i21 = i13 + 6;
                long[] jArr5 = jArr3;
                long j29 = j14 - jArr3[i21];
                int i22 = i13 + 7;
                long[] jArr6 = jArr4;
                long j30 = j15 - jArr5[i22];
                int i23 = i13 + 8;
                int[] iArr3 = iArr2;
                long j31 = j16 - jArr5[i23];
                int i24 = i13 + 9;
                long j32 = j17 - jArr5[i24];
                int i25 = i13 + 10;
                long j33 = j18 - jArr5[i25];
                int i26 = i13 + 11;
                long j34 = j19 - jArr5[i26];
                int i27 = i13 + 12;
                long j35 = j20 - jArr5[i27];
                int i28 = i13 + 13;
                long j36 = j21 - jArr5[i28];
                int i29 = i13 + 14;
                int i30 = i14 + 1;
                long j37 = j22 - (jArr5[i29] + jArr6[i30]);
                int i31 = i13 + 15;
                long j38 = j23 - (jArr5[i31] + jArr6[i14 + 2]);
                long j39 = i12;
                long jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr - ((jArr5[i13 + 16] + j39) + 1), i11, j24);
                long j40 = j24 - jXorRotr2;
                long jXorRotr3 = ThreefishEngine.xorRotr(j35, 48, j26);
                long j41 = j26 - jXorRotr3;
                long jXorRotr4 = ThreefishEngine.xorRotr(j37, 35, j30);
                long j42 = j30 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j33, 52, j28);
                long j43 = j28 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j25, 23, j38);
                long j44 = j38 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j29, 31, j32);
                long j45 = j32 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(j27, 37, j34);
                long j46 = j34 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(j31, 20, j36);
                long j47 = j36 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr9, 31, j40);
                long j48 = j40 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr7, 44, j41);
                long j49 = j41 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 47, j43);
                long j50 = j43 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr6, ROTATION_6_3, j42);
                long j51 = j42 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr2, 19, j47);
                long j52 = j47 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr4, 42, j44);
                long j53 = j44 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr3, 44, j45);
                long j54 = j45 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr5, 25, j46);
                long j55 = j46 - jXorRotr17;
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr17, 16, j48);
                long j56 = j48 - jXorRotr18;
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr15, 34, j49);
                long j57 = j49 - jXorRotr19;
                long jXorRotr20 = ThreefishEngine.xorRotr(jXorRotr16, 56, j51);
                long j58 = j51 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(jXorRotr14, 51, j50);
                long j59 = j50 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(jXorRotr10, 4, j55);
                long j60 = j55 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(jXorRotr12, ROTATION_5_5, j52);
                long j61 = j52 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr11, 42, j53);
                long j62 = j53 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr13, 41, j54);
                long j63 = j54 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr25, 41, j56);
                long j64 = j56 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr23, 9, j57);
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 37, j59);
                long j65 = j59 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr22, 31, j58);
                long j66 = j58 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr18, 12, j63);
                long j67 = j63 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr20, 47, j60);
                long j68 = j60 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr19, 44, j61);
                long j69 = j61 - jXorRotr32;
                long jXorRotr33 = ThreefishEngine.xorRotr(jXorRotr21, 30, j62);
                long j70 = j62 - jXorRotr33;
                long j71 = j64 - jArr5[i13];
                long j72 = jXorRotr26 - jArr5[i15];
                long j73 = (j57 - jXorRotr27) - jArr5[i16];
                long j74 = jXorRotr27 - jArr5[i17];
                long j75 = j65 - jArr5[i18];
                long j76 = jXorRotr28 - jArr5[i19];
                long j77 = j66 - jArr5[i21];
                long j78 = jXorRotr29 - jArr5[i22];
                long j79 = j67 - jArr5[i23];
                long j80 = jXorRotr30 - jArr5[i24];
                long j81 = j68 - jArr5[i25];
                long j82 = jXorRotr31 - jArr5[i26];
                long j83 = j69 - jArr5[i27];
                long j84 = jXorRotr32 - (jArr5[i28] + jArr6[i14]);
                long j85 = j70 - (jArr5[i29] + jArr6[i30]);
                long jXorRotr34 = ThreefishEngine.xorRotr(jXorRotr33 - (jArr5[i31] + j39), 5, j71);
                long j86 = j71 - jXorRotr34;
                long jXorRotr35 = ThreefishEngine.xorRotr(j82, 20, j73);
                long j87 = j73 - jXorRotr35;
                long jXorRotr36 = ThreefishEngine.xorRotr(j84, 48, j77);
                long j88 = j77 - jXorRotr36;
                long jXorRotr37 = ThreefishEngine.xorRotr(j80, 41, j75);
                long j89 = j75 - jXorRotr37;
                long jXorRotr38 = ThreefishEngine.xorRotr(j72, 47, j85);
                long j90 = j85 - jXorRotr38;
                long jXorRotr39 = ThreefishEngine.xorRotr(j76, 28, j79);
                long j91 = j79 - jXorRotr39;
                long jXorRotr40 = ThreefishEngine.xorRotr(j74, 16, j81);
                long j92 = j81 - jXorRotr40;
                long jXorRotr41 = ThreefishEngine.xorRotr(j78, 25, j83);
                long j93 = j83 - jXorRotr41;
                long jXorRotr42 = ThreefishEngine.xorRotr(jXorRotr41, 33, j86);
                long j94 = j86 - jXorRotr42;
                long jXorRotr43 = ThreefishEngine.xorRotr(jXorRotr39, 4, j87);
                long j95 = j87 - jXorRotr43;
                long jXorRotr44 = ThreefishEngine.xorRotr(jXorRotr40, 51, j89);
                long j96 = j89 - jXorRotr44;
                long jXorRotr45 = ThreefishEngine.xorRotr(jXorRotr38, 13, j88);
                long j97 = j88 - jXorRotr45;
                long jXorRotr46 = ThreefishEngine.xorRotr(jXorRotr34, 34, j93);
                long j98 = j93 - jXorRotr46;
                long jXorRotr47 = ThreefishEngine.xorRotr(jXorRotr36, 41, j90);
                long j99 = j90 - jXorRotr47;
                long jXorRotr48 = ThreefishEngine.xorRotr(jXorRotr35, ROTATION_2_6, j91);
                long j100 = j91 - jXorRotr48;
                long jXorRotr49 = ThreefishEngine.xorRotr(jXorRotr37, 17, j92);
                long j101 = j92 - jXorRotr49;
                long jXorRotr50 = ThreefishEngine.xorRotr(jXorRotr49, ROTATION_1_0, j94);
                long j102 = j94 - jXorRotr50;
                long jXorRotr51 = ThreefishEngine.xorRotr(jXorRotr47, 19, j95);
                long j103 = j95 - jXorRotr51;
                long jXorRotr52 = ThreefishEngine.xorRotr(jXorRotr48, 10, j97);
                long j104 = j97 - jXorRotr52;
                long jXorRotr53 = ThreefishEngine.xorRotr(jXorRotr46, ROTATION_1_3, j96);
                long j105 = j96 - jXorRotr53;
                long jXorRotr54 = ThreefishEngine.xorRotr(jXorRotr42, ROTATION_1_4, j101);
                long j106 = j101 - jXorRotr54;
                long jXorRotr55 = ThreefishEngine.xorRotr(jXorRotr44, 18, j98);
                long j107 = j98 - jXorRotr55;
                long jXorRotr56 = ThreefishEngine.xorRotr(jXorRotr43, 23, j99);
                long j108 = j99 - jXorRotr56;
                long jXorRotr57 = ThreefishEngine.xorRotr(jXorRotr45, 52, j100);
                long j109 = j100 - jXorRotr57;
                long jXorRotr58 = ThreefishEngine.xorRotr(jXorRotr57, 24, j102);
                long j110 = j102 - jXorRotr58;
                long jXorRotr59 = ThreefishEngine.xorRotr(jXorRotr55, 13, j103);
                j11 = j103 - jXorRotr59;
                long jXorRotr60 = ThreefishEngine.xorRotr(jXorRotr56, 8, j105);
                long j111 = j105 - jXorRotr60;
                long jXorRotr61 = ThreefishEngine.xorRotr(jXorRotr54, 47, j104);
                long j112 = j104 - jXorRotr61;
                long jXorRotr62 = ThreefishEngine.xorRotr(jXorRotr50, 8, j109);
                long j113 = j109 - jXorRotr62;
                long jXorRotr63 = ThreefishEngine.xorRotr(jXorRotr52, 17, j106);
                long j114 = j106 - jXorRotr63;
                long jXorRotr64 = ThreefishEngine.xorRotr(jXorRotr51, 22, j107);
                j21 = j107 - jXorRotr64;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr53, 37, j108);
                j23 = j108 - jXorRotr;
                j20 = jXorRotr63;
                j19 = j114;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                j15 = j112;
                j14 = jXorRotr60;
                j6 = j110;
                i11 = 9;
                j12 = jXorRotr59;
                j22 = jXorRotr64;
                j16 = jXorRotr61;
                i12 -= 2;
                j18 = jXorRotr62;
                j13 = j111;
                j10 = jXorRotr58;
                i10 = i20;
                j17 = j113;
                iArr2 = iArr3;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i32 = i10;
            long j115 = j6 - jArr7[0];
            long j116 = j10 - jArr7[i32];
            long j117 = j11 - jArr7[2];
            long j118 = j12 - jArr7[3];
            long j119 = j13 - jArr7[4];
            long j120 = j14 - jArr7[5];
            long j121 = j15 - jArr7[6];
            long j122 = j16 - jArr7[7];
            long j123 = j17 - jArr7[8];
            long j124 = j18 - jArr7[9];
            long j125 = j19 - jArr7[10];
            long j126 = j20 - jArr7[11];
            long j127 = j21 - jArr7[12];
            long j128 = j22 - (jArr7[13] + jArr8[0]);
            long j129 = j23 - (jArr7[14] + jArr8[i32]);
            long j130 = jXorRotr - jArr7[15];
            jArr2[0] = j115;
            jArr2[i32] = j116;
            jArr2[2] = j117;
            jArr2[3] = j118;
            jArr2[4] = j119;
            jArr2[5] = j120;
            jArr2[6] = j121;
            jArr2[7] = j122;
            jArr2[8] = j123;
            jArr2[9] = j124;
            jArr2[10] = j125;
            jArr2[11] = j126;
            jArr2[12] = j127;
            jArr2[13] = j128;
            jArr2[14] = j129;
            jArr2[15] = j130;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f44575kw;
            long[] jArr4 = this.f27674t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j6 = jArr[0];
            long j10 = jArr[1];
            long j11 = jArr[2];
            long j12 = jArr[3];
            long j13 = jArr[4];
            long j14 = jArr[5];
            long j15 = jArr[6];
            long j16 = jArr[7];
            long j17 = jArr[8];
            long j18 = jArr[9];
            long j19 = jArr[10];
            long j20 = jArr[11];
            int i10 = 9;
            long j21 = jArr[12];
            int i11 = 12;
            int i12 = 13;
            long j22 = jArr[13];
            long j23 = jArr[14];
            long j24 = jArr[15];
            long j25 = j6 + jArr3[0];
            long j26 = j10 + jArr3[1];
            long j27 = j11 + jArr3[2];
            long j28 = j12 + jArr3[3];
            long j29 = j13 + jArr3[4];
            long j30 = j14 + jArr3[5];
            long j31 = j15 + jArr3[6];
            long j32 = j16 + jArr3[7];
            long j33 = j17 + jArr3[8];
            long j34 = j18 + jArr3[9];
            long j35 = j19 + jArr3[10];
            long j36 = j20 + jArr3[11];
            long j37 = j21 + jArr3[12];
            long j38 = jArr3[13] + jArr4[0] + j22;
            long j39 = jArr3[14] + jArr4[1] + j23;
            long j40 = j30;
            long j41 = j32;
            long j42 = j34;
            long j43 = j36;
            long j44 = j24 + jArr3[15];
            long j45 = j38;
            long j46 = j29;
            long j47 = j25;
            long j48 = j28;
            int i13 = 1;
            while (i13 < 20) {
                int i14 = iArr[i13];
                int i15 = iArr2[i13];
                long j49 = j48;
                long j50 = j47 + j26;
                long jRotlXor = ThreefishEngine.rotlXor(j26, 24, j50);
                long j51 = j27 + j49;
                long jRotlXor2 = ThreefishEngine.rotlXor(j49, i12, j51);
                int i16 = i13;
                long j52 = j40;
                long j53 = j46 + j52;
                long jRotlXor3 = ThreefishEngine.rotlXor(j52, 8, j53);
                long[] jArr5 = jArr3;
                long j54 = j41;
                long j55 = j31 + j54;
                long[] jArr6 = jArr4;
                long jRotlXor4 = ThreefishEngine.rotlXor(j54, 47, j55);
                long j56 = j42;
                long j57 = j33 + j56;
                int[] iArr3 = iArr2;
                long jRotlXor5 = ThreefishEngine.rotlXor(j56, 8, j57);
                long j58 = j43;
                long j59 = j35 + j58;
                long jRotlXor6 = ThreefishEngine.rotlXor(j58, 17, j59);
                long j60 = j45;
                long j61 = j37 + j60;
                long jRotlXor7 = ThreefishEngine.rotlXor(j60, 22, j61);
                long j62 = j44;
                long j63 = j39 + j62;
                long jRotlXor8 = ThreefishEngine.rotlXor(j62, 37, j63);
                long j64 = j50 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, ROTATION_1_0, j64);
                long j65 = j51 + jRotlXor7;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor7, 19, j65);
                long j66 = j55 + jRotlXor6;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor6, 10, j66);
                long j67 = j53 + jRotlXor8;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor8, ROTATION_1_3, j67);
                long j68 = j59 + jRotlXor4;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor4, ROTATION_1_4, j68);
                long j69 = j61 + jRotlXor2;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor2, 18, j69);
                long j70 = j63 + jRotlXor3;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor3, 23, j70);
                long j71 = j57 + jRotlXor;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor, 52, j71);
                long j72 = j64 + jRotlXor13;
                long jRotlXor17 = ThreefishEngine.rotlXor(jRotlXor13, 33, j72);
                long j73 = j65 + jRotlXor15;
                long jRotlXor18 = ThreefishEngine.rotlXor(jRotlXor15, 4, j73);
                long j74 = j67 + jRotlXor14;
                long jRotlXor19 = ThreefishEngine.rotlXor(jRotlXor14, 51, j74);
                long j75 = j66 + jRotlXor16;
                long jRotlXor20 = ThreefishEngine.rotlXor(jRotlXor16, 13, j75);
                long j76 = j69 + jRotlXor12;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor12, 34, j76);
                long j77 = j70 + jRotlXor10;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor10, 41, j77);
                long j78 = j71 + jRotlXor11;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor11, ROTATION_2_6, j78);
                long j79 = j68 + jRotlXor9;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor9, 17, j79);
                long j80 = j72 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 5, j80);
                long j81 = j73 + jRotlXor23;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor23, 20, j81);
                long j82 = j75 + jRotlXor22;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor22, 48, j82);
                long j83 = j74 + jRotlXor24;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor24, 41, j83);
                long j84 = j77 + jRotlXor20;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor20, 47, j84);
                long j85 = j78 + jRotlXor18;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor18, 28, j85);
                long j86 = j79 + jRotlXor19;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor19, 16, j86);
                long j87 = j76 + jRotlXor17;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor17, 25, j87);
                long j88 = j80 + jArr5[i14];
                int i17 = i14 + 1;
                long j89 = jRotlXor29 + jArr5[i17];
                int i18 = i14 + 2;
                long j90 = j81 + jArr5[i18];
                int i19 = i14 + 3;
                long j91 = jRotlXor31 + jArr5[i19];
                int i20 = i14 + 4;
                long j92 = j83 + jArr5[i20];
                int i21 = i14 + 5;
                long j93 = jRotlXor30 + jArr5[i21];
                int i22 = i14 + 6;
                long j94 = j82 + jArr5[i22];
                int i23 = i14 + 7;
                long j95 = jRotlXor32 + jArr5[i23];
                int i24 = i14 + 8;
                long j96 = j85 + jArr5[i24];
                int i25 = i14 + 9;
                long j97 = jRotlXor28 + jArr5[i25];
                int i26 = i14 + 10;
                long j98 = j86 + jArr5[i26];
                int i27 = i14 + 11;
                long j99 = jRotlXor26 + jArr5[i27];
                int i28 = i14 + 12;
                long j100 = j87 + jArr5[i28];
                int i29 = i14 + 13;
                long j101 = jArr5[i29] + jArr6[i15] + jRotlXor27;
                int i30 = i14 + 14;
                int i31 = i15 + 1;
                long j102 = jArr5[i30] + jArr6[i31] + j84;
                int i32 = i14 + 15;
                long j103 = i16;
                long j104 = jArr5[i32] + j103 + jRotlXor25;
                long j105 = j88 + j89;
                long jRotlXor33 = ThreefishEngine.rotlXor(j89, 41, j105);
                long j106 = j90 + j91;
                long jRotlXor34 = ThreefishEngine.rotlXor(j91, i10, j106);
                long j107 = j92 + j93;
                long jRotlXor35 = ThreefishEngine.rotlXor(j93, 37, j107);
                long j108 = j94 + j95;
                long jRotlXor36 = ThreefishEngine.rotlXor(j95, 31, j108);
                long j109 = j96 + j97;
                long jRotlXor37 = ThreefishEngine.rotlXor(j97, i11, j109);
                long j110 = j98 + j99;
                long jRotlXor38 = ThreefishEngine.rotlXor(j99, 47, j110);
                long j111 = j100 + j101;
                long jRotlXor39 = ThreefishEngine.rotlXor(j101, 44, j111);
                long j112 = j102 + j104;
                long jRotlXor40 = ThreefishEngine.rotlXor(j104, 30, j112);
                long j113 = j105 + jRotlXor37;
                long jRotlXor41 = ThreefishEngine.rotlXor(jRotlXor37, 16, j113);
                long j114 = j106 + jRotlXor39;
                long jRotlXor42 = ThreefishEngine.rotlXor(jRotlXor39, 34, j114);
                long j115 = j108 + jRotlXor38;
                long jRotlXor43 = ThreefishEngine.rotlXor(jRotlXor38, 56, j115);
                long j116 = j107 + jRotlXor40;
                long jRotlXor44 = ThreefishEngine.rotlXor(jRotlXor40, 51, j116);
                long j117 = j110 + jRotlXor36;
                long jRotlXor45 = ThreefishEngine.rotlXor(jRotlXor36, 4, j117);
                long j118 = j111 + jRotlXor34;
                long jRotlXor46 = ThreefishEngine.rotlXor(jRotlXor34, ROTATION_5_5, j118);
                long j119 = j112 + jRotlXor35;
                long jRotlXor47 = ThreefishEngine.rotlXor(jRotlXor35, 42, j119);
                long j120 = j109 + jRotlXor33;
                long jRotlXor48 = ThreefishEngine.rotlXor(jRotlXor33, 41, j120);
                long j121 = j113 + jRotlXor45;
                long jRotlXor49 = ThreefishEngine.rotlXor(jRotlXor45, 31, j121);
                long j122 = j114 + jRotlXor47;
                long jRotlXor50 = ThreefishEngine.rotlXor(jRotlXor47, 44, j122);
                long j123 = j116 + jRotlXor46;
                long jRotlXor51 = ThreefishEngine.rotlXor(jRotlXor46, 47, j123);
                long j124 = j115 + jRotlXor48;
                long jRotlXor52 = ThreefishEngine.rotlXor(jRotlXor48, ROTATION_6_3, j124);
                long j125 = j118 + jRotlXor44;
                long jRotlXor53 = ThreefishEngine.rotlXor(jRotlXor44, 19, j125);
                long j126 = j119 + jRotlXor42;
                long jRotlXor54 = ThreefishEngine.rotlXor(jRotlXor42, 42, j126);
                long j127 = j120 + jRotlXor43;
                long jRotlXor55 = ThreefishEngine.rotlXor(jRotlXor43, 44, j127);
                long j128 = j117 + jRotlXor41;
                long jRotlXor56 = ThreefishEngine.rotlXor(jRotlXor41, 25, j128);
                long j129 = j121 + jRotlXor53;
                long jRotlXor57 = ThreefishEngine.rotlXor(jRotlXor53, 9, j129);
                long j130 = j122 + jRotlXor55;
                long jRotlXor58 = ThreefishEngine.rotlXor(jRotlXor55, 48, j130);
                long j131 = j124 + jRotlXor54;
                long jRotlXor59 = ThreefishEngine.rotlXor(jRotlXor54, 35, j131);
                long j132 = j123 + jRotlXor56;
                long jRotlXor60 = ThreefishEngine.rotlXor(jRotlXor56, 52, j132);
                long j133 = j126 + jRotlXor52;
                long jRotlXor61 = ThreefishEngine.rotlXor(jRotlXor52, 23, j133);
                long j134 = j127 + jRotlXor50;
                long jRotlXor62 = ThreefishEngine.rotlXor(jRotlXor50, 31, j134);
                long j135 = j128 + jRotlXor51;
                long jRotlXor63 = ThreefishEngine.rotlXor(jRotlXor51, 37, j135);
                long j136 = j125 + jRotlXor49;
                long jRotlXor64 = ThreefishEngine.rotlXor(jRotlXor49, 20, j136);
                long j137 = jArr5[i17] + j129;
                long j138 = jRotlXor61 + jArr5[i18];
                long j139 = j130 + jArr5[i19];
                long j140 = jRotlXor63 + jArr5[i20];
                long j141 = j132 + jArr5[i21];
                long j142 = jRotlXor62 + jArr5[i22];
                long j143 = j131 + jArr5[i23];
                long j144 = jRotlXor64 + jArr5[i24];
                long j145 = j134 + jArr5[i25];
                j42 = jRotlXor60 + jArr5[i26];
                long j146 = j135 + jArr5[i27];
                long j147 = jRotlXor58 + jArr5[i28];
                j37 = j136 + jArr5[i29];
                j45 = jArr5[i30] + jArr6[i31] + jRotlXor59;
                long j148 = jArr5[i32] + jArr6[i15 + 2] + j133;
                j44 = jArr5[i14 + 16] + j103 + 1 + jRotlXor57;
                j31 = j143;
                j33 = j145;
                j46 = j141;
                j26 = j138;
                j27 = j139;
                i13 = i16 + 2;
                j48 = j140;
                j35 = j146;
                j43 = j147;
                j40 = j142;
                i12 = 13;
                i10 = 9;
                i11 = 12;
                j41 = j144;
                j47 = j137;
                j39 = j148;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                iArr2 = iArr3;
            }
            jArr2[0] = j47;
            jArr2[1] = j26;
            jArr2[2] = j27;
            jArr2[3] = j48;
            jArr2[4] = j46;
            jArr2[5] = j40;
            jArr2[6] = j31;
            jArr2[7] = j41;
            jArr2[8] = j33;
            jArr2[9] = j42;
            jArr2[10] = j35;
            jArr2[11] = j43;
            jArr2[12] = j37;
            jArr2[13] = j45;
            jArr2[14] = j39;
            jArr2[15] = j44;
        }
    }

    public static final class Threefish256Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 14;
        private static final int ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52;
        private static final int ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23;
        private static final int ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 37;
        private static final int ROTATION_4_0 = 25;
        private static final int ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46;
        private static final int ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58;
        private static final int ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32;
        private static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f44575kw;
            long[] jArr4 = this.f27674t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j6 = jArr[0];
            int i10 = 1;
            long j10 = jArr[1];
            char c2 = 2;
            long j11 = jArr[2];
            long jXorRotr = jArr[3];
            int i11 = 17;
            while (i11 >= i10) {
                int i12 = iArr[i11];
                int i13 = iArr2[i11];
                int i14 = i12 + 1;
                long j12 = j6 - jArr3[i14];
                int i15 = i12 + 2;
                int i16 = i13 + 1;
                long j13 = j10 - (jArr3[i15] + jArr4[i16]);
                int i17 = i12 + 3;
                long j14 = j11 - (jArr3[i17] + jArr4[i13 + 2]);
                int i18 = i10;
                long j15 = i11;
                char c10 = c2;
                long jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr - ((jArr3[i12 + 4] + j15) + 1), 32, j12);
                long j16 = j12 - jXorRotr2;
                long[] jArr5 = jArr3;
                long jXorRotr3 = ThreefishEngine.xorRotr(j13, 32, j14);
                long j17 = j14 - jXorRotr3;
                long[] jArr6 = jArr4;
                long jXorRotr4 = ThreefishEngine.xorRotr(jXorRotr3, ROTATION_6_0, j16);
                long j18 = j16 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(jXorRotr2, 22, j17);
                long j19 = j17 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(jXorRotr5, ROTATION_5_0, j18);
                long j20 = j18 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(jXorRotr4, 12, j19);
                long j21 = j19 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr7, 25, j20);
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr6, 33, j21);
                long j22 = (j20 - jXorRotr8) - jArr5[i12];
                long j23 = jXorRotr8 - (jArr5[i14] + jArr6[i13]);
                long j24 = (j21 - jXorRotr9) - (jArr5[i15] + jArr6[i16]);
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr9 - (jArr5[i17] + j15), 5, j22);
                long j25 = j22 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(j23, ROTATION_3_1, j24);
                long j26 = j24 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr11, 23, j25);
                long j27 = j25 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr10, 40, j26);
                long j28 = j26 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr13, ROTATION_1_0, j27);
                long j29 = j27 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr12, 57, j28);
                long j30 = j28 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr15, 14, j29);
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr14, 16, j30);
                j11 = j30 - jXorRotr;
                i11 -= 2;
                j10 = jXorRotr16;
                i10 = i18;
                jArr3 = jArr5;
                c2 = c10;
                j6 = j29 - jXorRotr16;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i19 = i10;
            char c11 = c2;
            long j31 = j6 - jArr7[0];
            long j32 = j10 - (jArr7[i19] + jArr8[0]);
            long j33 = j11 - (jArr7[c11] + jArr8[i19]);
            long j34 = jXorRotr - jArr7[3];
            jArr2[0] = j31;
            jArr2[i19] = j32;
            jArr2[c11] = j33;
            jArr2[3] = j34;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f44575kw;
            long[] jArr4 = this.f27674t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j6 = jArr[0];
            long j10 = jArr[1];
            char c2 = 2;
            long j11 = jArr[2];
            long j12 = jArr[3];
            long j13 = j6 + jArr3[0];
            long j14 = jArr3[1] + jArr4[0] + j10;
            long j15 = jArr3[2] + jArr4[1] + j11;
            long j16 = j12 + jArr3[3];
            long j17 = j15;
            long j18 = j14;
            int i10 = 1;
            while (i10 < 18) {
                int i11 = iArr[i10];
                int i12 = iArr2[i10];
                long j19 = j13 + j18;
                char c10 = c2;
                long jRotlXor = ThreefishEngine.rotlXor(j18, 14, j19);
                long j20 = j17 + j16;
                long jRotlXor2 = ThreefishEngine.rotlXor(j16, 16, j20);
                long[] jArr5 = jArr3;
                long j21 = j19 + jRotlXor2;
                long jRotlXor3 = ThreefishEngine.rotlXor(jRotlXor2, ROTATION_1_0, j21);
                long j22 = j20 + jRotlXor;
                long jRotlXor4 = ThreefishEngine.rotlXor(jRotlXor, 57, j22);
                long j23 = j21 + jRotlXor4;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor4, 23, j23);
                long j24 = j22 + jRotlXor3;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor3, 40, j24);
                long j25 = j23 + jRotlXor6;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor6, 5, j25);
                long j26 = j24 + jRotlXor5;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor5, ROTATION_3_1, j26);
                long j27 = j25 + jArr5[i11];
                int i13 = i11 + 1;
                long j28 = jArr5[i13] + jArr4[i12] + jRotlXor8;
                int i14 = i11 + 2;
                int i15 = i12 + 1;
                long j29 = jArr5[i14] + jArr4[i15] + j26;
                int i16 = i11 + 3;
                long j30 = i10;
                long j31 = jArr5[i16] + j30 + jRotlXor7;
                long[] jArr6 = jArr4;
                long j32 = j27 + j28;
                long jRotlXor9 = ThreefishEngine.rotlXor(j28, 25, j32);
                long j33 = j29 + j31;
                long jRotlXor10 = ThreefishEngine.rotlXor(j31, 33, j33);
                long j34 = j32 + jRotlXor10;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor10, ROTATION_5_0, j34);
                long j35 = j33 + jRotlXor9;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor9, 12, j35);
                long j36 = j34 + jRotlXor12;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor12, ROTATION_6_0, j36);
                long j37 = j35 + jRotlXor11;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor11, 22, j37);
                long j38 = j36 + jRotlXor14;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor14, 32, j38);
                long j39 = j37 + jRotlXor13;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor13, 32, j39);
                long j40 = j38 + jArr5[i13];
                j18 = jArr5[i14] + jArr6[i15] + jRotlXor16;
                j17 = jArr5[i16] + jArr6[i12 + 2] + j39;
                j16 = jArr5[i11 + 4] + j30 + 1 + jRotlXor15;
                i10 += 2;
                j13 = j40;
                c2 = c10;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
            }
            jArr2[0] = j13;
            jArr2[1] = j18;
            jArr2[c2] = j17;
            jArr2[3] = j16;
        }
    }

    public static final class Threefish512Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 46;
        private static final int ROTATION_0_1 = 36;
        private static final int ROTATION_0_2 = 19;
        private static final int ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33;
        private static final int ROTATION_1_1 = 27;
        private static final int ROTATION_1_2 = 14;
        private static final int ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17;
        private static final int ROTATION_2_1 = 49;
        private static final int ROTATION_2_2 = 36;
        private static final int ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44;
        private static final int ROTATION_3_1 = 9;
        private static final int ROTATION_3_2 = 54;
        private static final int ROTATION_3_3 = 56;
        private static final int ROTATION_4_0 = 39;
        private static final int ROTATION_4_1 = 30;
        private static final int ROTATION_4_2 = 34;
        private static final int ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13;
        private static final int ROTATION_5_1 = 50;
        private static final int ROTATION_5_2 = 10;
        private static final int ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25;
        private static final int ROTATION_6_1 = 29;
        private static final int ROTATION_6_2 = 39;
        private static final int ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8;
        private static final int ROTATION_7_1 = 35;
        private static final int ROTATION_7_2 = 56;
        private static final int ROTATION_7_3 = 22;

        public Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f44575kw;
            long[] jArr4 = this.f27674t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            char c2 = 5;
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j6 = jArr[0];
            int i10 = 1;
            long j10 = jArr[1];
            char c10 = 2;
            long j11 = jArr[2];
            long jXorRotr = jArr[3];
            long j12 = jArr[4];
            long jXorRotr2 = jArr[5];
            long j13 = jArr[6];
            long jXorRotr3 = jArr[7];
            int i11 = 17;
            while (i11 >= i10) {
                int i12 = iArr[i11];
                int i13 = iArr2[i11];
                int i14 = i12 + 1;
                long j14 = j6 - jArr3[i14];
                int i15 = i12 + 2;
                long j15 = j10 - jArr3[i15];
                int i16 = i12 + 3;
                long j16 = j11 - jArr3[i16];
                int i17 = i12 + 4;
                long j17 = jXorRotr - jArr3[i17];
                int i18 = i12 + 5;
                char c11 = c10;
                long j18 = j12 - jArr3[i18];
                int i19 = i12 + 6;
                int i20 = i13 + 1;
                int i21 = i10;
                long j19 = jXorRotr2 - (jArr3[i19] + jArr4[i20]);
                int i22 = i12 + 7;
                long[] jArr5 = jArr3;
                long j20 = j13 - (jArr3[i22] + jArr4[i13 + 2]);
                long[] jArr6 = jArr4;
                long j21 = i11;
                long j22 = jXorRotr3 - ((jArr5[i12 + 8] + j21) + 1);
                int[] iArr3 = iArr2;
                long jXorRotr4 = ThreefishEngine.xorRotr(j15, 8, j20);
                long j23 = j20 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j22, 35, j14);
                long j24 = j14 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j19, 56, j16);
                long j25 = j16 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j17, 22, j18);
                long j26 = j18 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr4, 25, j26);
                long j27 = j26 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr7, 29, j23);
                long j28 = j23 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr6, 39, j24);
                long j29 = j24 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr5, ROTATION_6_3, j25);
                long j30 = j25 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 13, j30);
                long j31 = j30 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr11, 50, j27);
                long j32 = j27 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr10, 10, j28);
                long j33 = j28 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr9, 17, j29);
                long j34 = j29 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr12, 39, j34);
                long j35 = j34 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr15, 30, j31);
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr14, 34, j32);
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr13, 24, j33);
                long j36 = j33 - jXorRotr19;
                long j37 = j35 - jArr5[i12];
                long j38 = jXorRotr16 - jArr5[i14];
                long j39 = (j31 - jXorRotr17) - jArr5[i15];
                long j40 = jXorRotr17 - jArr5[i16];
                long j41 = (j32 - jXorRotr18) - jArr5[i17];
                long j42 = jXorRotr18 - (jArr5[i18] + jArr6[i13]);
                long j43 = j36 - (jArr5[i19] + jArr6[i20]);
                long j44 = jXorRotr19 - (jArr5[i22] + j21);
                long jXorRotr20 = ThreefishEngine.xorRotr(j38, ROTATION_3_0, j43);
                long j45 = j43 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(j44, 9, j37);
                long j46 = j37 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(j42, ROTATION_3_2, j39);
                long j47 = j39 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(j40, 56, j41);
                long j48 = j41 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr20, 17, j48);
                long j49 = j48 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr23, ROTATION_2_1, j45);
                long j50 = j45 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr22, 36, j46);
                long j51 = j46 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr21, 39, j47);
                long j52 = j47 - jXorRotr27;
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 33, j52);
                long j53 = j52 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr27, 27, j49);
                long j54 = j49 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr26, 14, j50);
                long j55 = j50 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr25, ROTATION_1_3, j51);
                long j56 = j51 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr28, ROTATION_0_0, j56);
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr31, 36, j53);
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr30, 19, j54);
                long j57 = j54 - jXorRotr2;
                jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr29, ROTATION_0_3, j55);
                j13 = j55 - jXorRotr3;
                j11 = j53 - jXorRotr;
                j10 = jXorRotr32;
                i11 -= 2;
                j6 = j56 - jXorRotr32;
                i10 = i21;
                jArr3 = jArr5;
                c2 = c2;
                c10 = c11;
                iArr2 = iArr3;
                j12 = j57;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            char c12 = c2;
            int i23 = i10;
            char c13 = c10;
            long j58 = j6 - jArr7[0];
            long j59 = j10 - jArr7[i23];
            long j60 = j11 - jArr7[c13];
            long j61 = jXorRotr - jArr7[3];
            long j62 = j12 - jArr7[4];
            long j63 = jXorRotr2 - (jArr7[c12] + jArr8[0]);
            long j64 = j13 - (jArr7[6] + jArr8[i23]);
            long j65 = jXorRotr3 - jArr7[7];
            jArr2[0] = j58;
            jArr2[i23] = j59;
            jArr2[c13] = j60;
            jArr2[3] = j61;
            jArr2[4] = j62;
            jArr2[c12] = j63;
            jArr2[6] = j64;
            jArr2[7] = j65;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f44575kw;
            long[] jArr4 = this.f27674t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j6 = jArr[0];
            long j10 = jArr[1];
            long j11 = jArr[2];
            long j12 = jArr[3];
            long j13 = jArr[4];
            long j14 = jArr[5];
            long j15 = jArr[6];
            long j16 = jArr[7];
            long j17 = j6 + jArr3[0];
            long j18 = j10 + jArr3[1];
            long j19 = j11 + jArr3[2];
            long j20 = j12 + jArr3[3];
            long j21 = j13 + jArr3[4];
            long j22 = jArr3[5] + jArr4[0] + j14;
            long j23 = jArr3[6] + jArr4[1] + j15;
            long j24 = j16 + jArr3[7];
            long j25 = j23;
            long j26 = j21;
            long j27 = j17;
            int i10 = 1;
            long j28 = j20;
            long j29 = j22;
            long j30 = j19;
            long j31 = j24;
            while (i10 < 18) {
                int i11 = iArr[i10];
                int i12 = iArr2[i10];
                long j32 = j28;
                long j33 = j27 + j18;
                long jRotlXor = ThreefishEngine.rotlXor(j18, ROTATION_0_0, j33);
                long[] jArr5 = jArr3;
                long j34 = j30 + j32;
                long[] jArr6 = jArr4;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long jRotlXor2 = ThreefishEngine.rotlXor(j32, 36, j34);
                long j35 = j26 + j29;
                long jRotlXor3 = ThreefishEngine.rotlXor(j29, 19, j35);
                long j36 = j25 + j31;
                long jRotlXor4 = ThreefishEngine.rotlXor(j31, ROTATION_0_3, j36);
                long j37 = j34 + jRotlXor;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor, 33, j37);
                long j38 = j35 + jRotlXor4;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor4, 27, j38);
                long j39 = j36 + jRotlXor3;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor3, 14, j39);
                long j40 = j33 + jRotlXor2;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor2, ROTATION_1_3, j40);
                long j41 = j38 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 17, j41);
                long j42 = j39 + jRotlXor8;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor8, ROTATION_2_1, j42);
                long j43 = j40 + jRotlXor7;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor7, 36, j43);
                long j44 = j37 + jRotlXor6;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor6, 39, j44);
                int i13 = i10;
                long j45 = j42 + jRotlXor9;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor9, ROTATION_3_0, j45);
                long j46 = j43 + jRotlXor12;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor12, 9, j46);
                long j47 = j44 + jRotlXor11;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor11, ROTATION_3_2, j47);
                long j48 = j41 + jRotlXor10;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor10, 56, j48);
                long j49 = j46 + jArr5[i11];
                int i14 = i11 + 1;
                long j50 = jRotlXor13 + jArr5[i14];
                int i15 = i11 + 2;
                long j51 = j47 + jArr5[i15];
                int i16 = i11 + 3;
                long j52 = jRotlXor16 + jArr5[i16];
                int i17 = i11 + 4;
                long j53 = j48 + jArr5[i17];
                int i18 = i11 + 5;
                long j54 = jArr5[i18] + jArr6[i12] + jRotlXor15;
                int i19 = i11 + 6;
                int i20 = i12 + 1;
                long j55 = jArr5[i19] + jArr6[i20] + j45;
                int i21 = i11 + 7;
                long j56 = i13;
                long j57 = jArr5[i21] + j56 + jRotlXor14;
                long j58 = j49 + j50;
                long jRotlXor17 = ThreefishEngine.rotlXor(j50, 39, j58);
                long j59 = j51 + j52;
                long jRotlXor18 = ThreefishEngine.rotlXor(j52, 30, j59);
                long j60 = j53 + j54;
                long jRotlXor19 = ThreefishEngine.rotlXor(j54, 34, j60);
                long j61 = j55 + j57;
                long jRotlXor20 = ThreefishEngine.rotlXor(j57, 24, j61);
                long j62 = j59 + jRotlXor17;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor17, 13, j62);
                long j63 = j60 + jRotlXor20;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor20, 50, j63);
                long j64 = j61 + jRotlXor19;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor19, 10, j64);
                long j65 = j58 + jRotlXor18;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor18, 17, j65);
                long j66 = j63 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 25, j66);
                long j67 = j64 + jRotlXor24;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor24, 29, j67);
                long j68 = j65 + jRotlXor23;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor23, 39, j68);
                long j69 = j62 + jRotlXor22;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor22, ROTATION_6_3, j69);
                long j70 = j67 + jRotlXor25;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor25, 8, j70);
                long j71 = j68 + jRotlXor28;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor28, 35, j71);
                long j72 = j69 + jRotlXor27;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor27, 56, j72);
                long j73 = j66 + jRotlXor26;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor26, 22, j73);
                long j74 = j71 + jArr5[i14];
                long j75 = jRotlXor29 + jArr5[i15];
                long j76 = j72 + jArr5[i16];
                long j77 = jRotlXor32 + jArr5[i17];
                long j78 = j73 + jArr5[i18];
                long j79 = jArr5[i19] + jArr6[i20] + jRotlXor31;
                j25 = jArr5[i21] + jArr6[i12 + 2] + j70;
                j26 = j78;
                j27 = j74;
                j30 = j76;
                jArr4 = jArr6;
                iArr = iArr3;
                j18 = j75;
                j31 = jArr5[i11 + 8] + j56 + 1 + jRotlXor30;
                j28 = j77;
                jArr3 = jArr5;
                i10 = i13 + 2;
                j29 = j79;
                iArr2 = iArr4;
            }
            jArr2[0] = j27;
            jArr2[1] = j18;
            jArr2[2] = j30;
            jArr2[3] = j28;
            jArr2[4] = j26;
            jArr2[5] = j29;
            jArr2[6] = j25;
            jArr2[7] = j31;
        }
    }

    public static abstract class ThreefishCipher {

        /* renamed from: kw, reason: collision with root package name */
        protected final long[] f44575kw;

        /* renamed from: t */
        protected final long[] f27674t;

        public ThreefishCipher(long[] jArr, long[] jArr2) {
            this.f44575kw = jArr;
            this.f27674t = jArr2;
        }

        public abstract void decryptBlock(long[] jArr, long[] jArr2);

        public abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        MOD9 = iArr;
        MOD17 = new int[iArr.length];
        MOD5 = new int[iArr.length];
        MOD3 = new int[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = MOD9;
            if (i10 >= iArr2.length) {
                return;
            }
            MOD17[i10] = i10 % 17;
            iArr2[i10] = i10 % 9;
            MOD5[i10] = i10 % 5;
            MOD3[i10] = i10 % 3;
            i10++;
        }
    }

    public ThreefishEngine(int i10) {
        ThreefishCipher threefish256Cipher;
        long[] jArr = new long[5];
        this.f27673t = jArr;
        int i11 = i10 / 8;
        this.blocksizeBytes = i11;
        int i12 = i11 / 8;
        this.blocksizeWords = i12;
        this.currentBlock = new long[i12];
        long[] jArr2 = new long[(i12 * 2) + 1];
        this.f44574kw = jArr2;
        if (i10 == 256) {
            threefish256Cipher = new Threefish256Cipher(jArr2, jArr);
        } else if (i10 == 512) {
            threefish256Cipher = new Threefish512Cipher(jArr2, jArr);
        } else {
            if (i10 != 1024) {
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            threefish256Cipher = new Threefish1024Cipher(jArr2, jArr);
        }
        this.cipher = threefish256Cipher;
    }

    public static long bytesToWord(byte[] bArr, int i10) {
        return Pack.littleEndianToLong(bArr, i10);
    }

    public static long rotlXor(long j6, int i10, long j10) {
        return ((j6 >>> (-i10)) | (j6 << i10)) ^ j10;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            throw new IllegalArgumentException(AbstractC5601a.m11233d(this.blocksizeWords, " words)", new StringBuilder("Threefish key must be same size as block (")));
        }
        long j6 = C_240;
        int i10 = 0;
        while (true) {
            int i11 = this.blocksizeWords;
            if (i10 >= i11) {
                long[] jArr2 = this.f44574kw;
                jArr2[i11] = j6;
                System.arraycopy(jArr2, 0, jArr2, i11 + 1, i11);
                return;
            } else {
                long[] jArr3 = this.f44574kw;
                long j10 = jArr[i10];
                jArr3[i10] = j10;
                j6 ^= j10;
                i10++;
            }
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        long[] jArr2 = this.f27673t;
        long j6 = jArr[0];
        jArr2[0] = j6;
        long j10 = jArr[1];
        jArr2[1] = j10;
        jArr2[2] = j6 ^ j10;
        jArr2[3] = j6;
        jArr2[4] = j10;
    }

    public static void wordToBytes(long j6, byte[] bArr, int i10) {
        Pack.longToLittleEndian(j6, bArr, i10);
    }

    public static long xorRotr(long j6, int i10, long j10) {
        long j11 = j6 ^ j10;
        return (j11 << (-i10)) | (j11 >>> i10);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Threefish-" + (this.blocksizeBytes * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z6, CipherParameters cipherParameters) {
        byte[] key;
        byte[] tweak;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            tweak = tweakableBlockCipherParameters.getTweak();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(AbstractC4801l.m9736j("Invalid parameter passed to Threefish init - ", cipherParameters));
            }
            key = ((KeyParameter) cipherParameters).getKey();
            tweak = null;
        }
        if (key == null) {
            jArr = null;
        } else {
            if (key.length != this.blocksizeBytes) {
                throw new IllegalArgumentException(AbstractC5601a.m11233d(this.blocksizeBytes, " bytes)", new StringBuilder("Threefish key must be same size as block (")));
            }
            jArr = new long[this.blocksizeWords];
            Pack.littleEndianToLong(key, 0, jArr);
        }
        if (tweak != null) {
            if (tweak.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[2];
            Pack.littleEndianToLong(tweak, 0, jArr2);
        }
        init(z6, jArr, jArr2);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256, cipherParameters, Utils.getPurpose(z6)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = this.blocksizeBytes;
        if (i10 + i12 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        Pack.littleEndianToLong(bArr, i10, this.currentBlock);
        long[] jArr = this.currentBlock;
        processBlock(jArr, jArr);
        Pack.longToLittleEndian(this.currentBlock, bArr2, i11);
        return this.blocksizeBytes;
    }

    public int processBlock(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.f44574kw;
        int i10 = this.blocksizeWords;
        if (jArr3[i10] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != i10) {
            throw new DataLengthException("Input buffer too short");
        }
        if (jArr2.length != i10) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.forEncryption) {
            this.cipher.encryptBlock(jArr, jArr2);
        } else {
            this.cipher.decryptBlock(jArr, jArr2);
        }
        return this.blocksizeWords;
    }

    public void init(boolean z6, long[] jArr, long[] jArr2) {
        this.forEncryption = z6;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
