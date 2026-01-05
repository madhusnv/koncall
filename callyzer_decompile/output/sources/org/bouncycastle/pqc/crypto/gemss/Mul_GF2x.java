package org.bouncycastle.pqc.crypto.gemss;

/* loaded from: classes3.dex */
abstract class Mul_GF2x {

    public static class Mul12 extends Mul_GF2x {
        private long[] Buffer = new long[12];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul384_no_simd_gf2x(pointer.array, pointer2.array, pointer2.f44682cp, pointer3.array, pointer3.f44682cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul384_no_simd_gf2x_xor(pointer.array, pointer2.array, pointer2.f44682cp, pointer3.array, pointer3.f44682cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i10) {
            Mul_GF2x.SQR128_NO_SIMD_GF2X(jArr, 8, jArr2, i10 + 4);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i10);
        }
    }

    public static class Mul13 extends Mul_GF2x {
        private long[] Buffer = new long[13];
        private long[] Buffer2 = new long[4];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul416_no_simd_gf2x(pointer.array, pointer2.array, pointer2.f44682cp, pointer3.array, pointer3.f44682cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul416_no_simd_gf2x_xor(pointer.array, pointer2.array, pointer2.f44682cp, pointer3.array, pointer3.f44682cp, this.Buffer, this.Buffer2);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i10) {
            jArr[12] = Mul_GF2x.SQR32_NO_SIMD_GF2X(jArr2[i10 + 6]);
            Mul_GF2x.SQR128_NO_SIMD_GF2X(jArr, 8, jArr2, i10 + 4);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i10);
        }
    }

    public static class Mul17 extends Mul_GF2x {
        private long[] AA = new long[5];
        private long[] BB = new long[5];
        private long[] Buffer1 = new long[17];
        private long[] Buffer2 = new long[4];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul544_no_simd_gf2x(pointer.array, pointer2.array, pointer2.f44682cp, pointer3.array, pointer3.f44682cp, this.AA, this.BB, this.Buffer1);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul544_no_simd_gf2x_xor(pointer.array, pointer2.array, pointer2.f44682cp, pointer3.array, pointer3.f44682cp, this.AA, this.BB, this.Buffer1, this.Buffer2);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i10) {
            jArr[16] = Mul_GF2x.SQR32_NO_SIMD_GF2X(jArr2[i10 + 8]);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 8, jArr2, i10 + 4);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i10);
        }
    }

    public static class Mul6 extends Mul_GF2x {
        private long[] Buffer = new long[6];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul192_no_simd_gf2x(pointer.array, 0, pointer2.array, pointer2.f44682cp, pointer3.array, pointer3.f44682cp);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul192_no_simd_gf2x_xor(pointer.array, pointer.f44682cp, pointer2.array, pointer2.f44682cp, pointer3.array, pointer3.f44682cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i10) {
            Mul_GF2x.SQR64_NO_SIMD_GF2X(jArr, 4, jArr2[i10 + 2]);
            Mul_GF2x.SQR128_NO_SIMD_GF2X(jArr, 0, jArr2, i10);
        }
    }

    public static class Mul9 extends Mul_GF2x {
        private long[] Buffer = new long[9];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul288_no_simd_gf2x(pointer.array, 0, pointer2.array, pointer2.f44682cp, pointer3.array, pointer3.f44682cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul288_no_simd_gf2x_xor(pointer.array, pointer.f44682cp, pointer2.array, pointer2.f44682cp, pointer3.array, pointer3.f44682cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i10) {
            jArr[8] = Mul_GF2x.SQR32_NO_SIMD_GF2X(jArr2[i10 + 4]);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i10);
        }
    }

    private static long MUL32_NO_SIMD_GF2X(long j6, long j10) {
        return ((j6 & (-((j10 >>> 31) & 1))) << 31) ^ ((((((((((((((((((((((((((((((((-(j10 & 1)) & j6) ^ (((-((j10 >>> 1) & 1)) & j6) << 1)) ^ (((-((j10 >>> 2) & 1)) & j6) << 2)) ^ (((-((j10 >>> 3) & 1)) & j6) << 3)) ^ (((-((j10 >>> 4) & 1)) & j6) << 4)) ^ (((-((j10 >>> 5) & 1)) & j6) << 5)) ^ (((-((j10 >>> 6) & 1)) & j6) << 6)) ^ (((-((j10 >>> 7) & 1)) & j6) << 7)) ^ (((-((j10 >>> 8) & 1)) & j6) << 8)) ^ (((-((j10 >>> 9) & 1)) & j6) << 9)) ^ (((-((j10 >>> 10) & 1)) & j6) << 10)) ^ (((-((j10 >>> 11) & 1)) & j6) << 11)) ^ (((-((j10 >>> 12) & 1)) & j6) << 12)) ^ (((-((j10 >>> 13) & 1)) & j6) << 13)) ^ (((-((j10 >>> 14) & 1)) & j6) << 14)) ^ (((-((j10 >>> 15) & 1)) & j6) << 15)) ^ (((-((j10 >>> 16) & 1)) & j6) << 16)) ^ (((-((j10 >>> 17) & 1)) & j6) << 17)) ^ (((-((j10 >>> 18) & 1)) & j6) << 18)) ^ (((-((j10 >>> 19) & 1)) & j6) << 19)) ^ (((-((j10 >>> 20) & 1)) & j6) << 20)) ^ (((-((j10 >>> 21) & 1)) & j6) << 21)) ^ (((-((j10 >>> 22) & 1)) & j6) << 22)) ^ (((-((j10 >>> 23) & 1)) & j6) << 23)) ^ (((-((j10 >>> 24) & 1)) & j6) << 24)) ^ (((-((j10 >>> 25) & 1)) & j6) << 25)) ^ (((-((j10 >>> 26) & 1)) & j6) << 26)) ^ (((-((j10 >>> 27) & 1)) & j6) << 27)) ^ (((-((j10 >>> 28) & 1)) & j6) << 28)) ^ (((-((j10 >>> 29) & 1)) & j6) << 29)) ^ (((-((j10 >>> 30) & 1)) & j6) << 30));
    }

    private static void MUL64_NO_SIMD_GF2X(long[] jArr, int i10, long j6, long j10) {
        long j11 = (-(j10 >>> 63)) & j6;
        long j12 = (-((j10 >>> 1) & 1)) & j6;
        long j13 = (((-(j10 & 1)) & j6) ^ (j11 << 63)) ^ (j12 << 1);
        long j14 = (j11 >>> 1) ^ (j12 >>> 63);
        long j15 = (-((j10 >>> 2) & 1)) & j6;
        long j16 = (-((j10 >>> 3) & 1)) & j6;
        long j17 = (-((j10 >>> 4) & 1)) & j6;
        long j18 = (-((j10 >>> 5) & 1)) & j6;
        long j19 = (((j13 ^ (j15 << 2)) ^ (j16 << 3)) ^ (j17 << 4)) ^ (j18 << 5);
        long j20 = (j18 >>> 59) ^ (((j14 ^ (j15 >>> 62)) ^ (j16 >>> 61)) ^ (j17 >>> 60));
        long j21 = (-((j10 >>> 6) & 1)) & j6;
        long j22 = j19 ^ (j21 << 6);
        long j23 = j20 ^ (j21 >>> 58);
        long j24 = (-((j10 >>> 7) & 1)) & j6;
        long j25 = j22 ^ (j24 << 7);
        long j26 = j23 ^ (j24 >>> 57);
        long j27 = (-((j10 >>> 8) & 1)) & j6;
        long j28 = j25 ^ (j27 << 8);
        long j29 = j26 ^ (j27 >>> 56);
        long j30 = (-((j10 >>> 9) & 1)) & j6;
        long j31 = j28 ^ (j30 << 9);
        long j32 = j29 ^ (j30 >>> 55);
        long j33 = (-((j10 >>> 10) & 1)) & j6;
        long j34 = j31 ^ (j33 << 10);
        long j35 = j32 ^ (j33 >>> 54);
        long j36 = (-((j10 >>> 11) & 1)) & j6;
        long j37 = j34 ^ (j36 << 11);
        long j38 = j35 ^ (j36 >>> 53);
        long j39 = (-((j10 >>> 12) & 1)) & j6;
        long j40 = j37 ^ (j39 << 12);
        long j41 = j38 ^ (j39 >>> 52);
        long j42 = (-((j10 >>> 13) & 1)) & j6;
        long j43 = j40 ^ (j42 << 13);
        long j44 = j41 ^ (j42 >>> 51);
        long j45 = (-((j10 >>> 14) & 1)) & j6;
        long j46 = j43 ^ (j45 << 14);
        long j47 = j44 ^ (j45 >>> 50);
        long j48 = (-((j10 >>> 15) & 1)) & j6;
        long j49 = j46 ^ (j48 << 15);
        long j50 = j47 ^ (j48 >>> 49);
        long j51 = (-((j10 >>> 16) & 1)) & j6;
        long j52 = j49 ^ (j51 << 16);
        long j53 = j50 ^ (j51 >>> 48);
        long j54 = (-((j10 >>> 17) & 1)) & j6;
        long j55 = j52 ^ (j54 << 17);
        long j56 = j53 ^ (j54 >>> 47);
        long j57 = (-((j10 >>> 18) & 1)) & j6;
        long j58 = j55 ^ (j57 << 18);
        long j59 = j56 ^ (j57 >>> 46);
        long j60 = (-((j10 >>> 19) & 1)) & j6;
        long j61 = j58 ^ (j60 << 19);
        long j62 = j59 ^ (j60 >>> 45);
        long j63 = (-((j10 >>> 20) & 1)) & j6;
        long j64 = j61 ^ (j63 << 20);
        long j65 = j62 ^ (j63 >>> 44);
        long j66 = (-((j10 >>> 21) & 1)) & j6;
        long j67 = j64 ^ (j66 << 21);
        long j68 = j65 ^ (j66 >>> 43);
        long j69 = (-((j10 >>> 22) & 1)) & j6;
        long j70 = j67 ^ (j69 << 22);
        long j71 = j68 ^ (j69 >>> 42);
        long j72 = (-((j10 >>> 23) & 1)) & j6;
        long j73 = j70 ^ (j72 << 23);
        long j74 = j71 ^ (j72 >>> 41);
        long j75 = (-((j10 >>> 24) & 1)) & j6;
        long j76 = j73 ^ (j75 << 24);
        long j77 = j74 ^ (j75 >>> 40);
        long j78 = (-((j10 >>> 25) & 1)) & j6;
        long j79 = j76 ^ (j78 << 25);
        long j80 = j77 ^ (j78 >>> 39);
        long j81 = (-((j10 >>> 26) & 1)) & j6;
        long j82 = j79 ^ (j81 << 26);
        long j83 = j80 ^ (j81 >>> 38);
        long j84 = (-((j10 >>> 27) & 1)) & j6;
        long j85 = j82 ^ (j84 << 27);
        long j86 = j83 ^ (j84 >>> 37);
        long j87 = (-((j10 >>> 28) & 1)) & j6;
        long j88 = j85 ^ (j87 << 28);
        long j89 = j86 ^ (j87 >>> 36);
        long j90 = (-((j10 >>> 29) & 1)) & j6;
        long j91 = j88 ^ (j90 << 29);
        long j92 = j89 ^ (j90 >>> 35);
        long j93 = (-((j10 >>> 30) & 1)) & j6;
        long j94 = j91 ^ (j93 << 30);
        long j95 = j92 ^ (j93 >>> 34);
        long j96 = (-((j10 >>> 31) & 1)) & j6;
        long j97 = j94 ^ (j96 << 31);
        long j98 = j95 ^ (j96 >>> 33);
        long j99 = (-((j10 >>> 32) & 1)) & j6;
        long j100 = j97 ^ (j99 << 32);
        long j101 = j98 ^ (j99 >>> 32);
        long j102 = (-((j10 >>> 33) & 1)) & j6;
        long j103 = j100 ^ (j102 << 33);
        long j104 = j101 ^ (j102 >>> 31);
        long j105 = (-((j10 >>> 34) & 1)) & j6;
        long j106 = j103 ^ (j105 << 34);
        long j107 = j104 ^ (j105 >>> 30);
        long j108 = (-((j10 >>> 35) & 1)) & j6;
        long j109 = j106 ^ (j108 << 35);
        long j110 = j107 ^ (j108 >>> 29);
        long j111 = (-((j10 >>> 36) & 1)) & j6;
        long j112 = j109 ^ (j111 << 36);
        long j113 = j110 ^ (j111 >>> 28);
        long j114 = (-((j10 >>> 37) & 1)) & j6;
        long j115 = j112 ^ (j114 << 37);
        long j116 = j113 ^ (j114 >>> 27);
        long j117 = (-((j10 >>> 38) & 1)) & j6;
        long j118 = j115 ^ (j117 << 38);
        long j119 = j116 ^ (j117 >>> 26);
        long j120 = (-((j10 >>> 39) & 1)) & j6;
        long j121 = j118 ^ (j120 << 39);
        long j122 = j119 ^ (j120 >>> 25);
        long j123 = (-((j10 >>> 40) & 1)) & j6;
        long j124 = j121 ^ (j123 << 40);
        long j125 = j122 ^ (j123 >>> 24);
        long j126 = (-((j10 >>> 41) & 1)) & j6;
        long j127 = j124 ^ (j126 << 41);
        long j128 = j125 ^ (j126 >>> 23);
        long j129 = (-((j10 >>> 42) & 1)) & j6;
        long j130 = j127 ^ (j129 << 42);
        long j131 = j128 ^ (j129 >>> 22);
        long j132 = (-((j10 >>> 43) & 1)) & j6;
        long j133 = j130 ^ (j132 << 43);
        long j134 = j131 ^ (j132 >>> 21);
        long j135 = (-((j10 >>> 44) & 1)) & j6;
        long j136 = j133 ^ (j135 << 44);
        long j137 = j134 ^ (j135 >>> 20);
        long j138 = (-((j10 >>> 45) & 1)) & j6;
        long j139 = j136 ^ (j138 << 45);
        long j140 = j137 ^ (j138 >>> 19);
        long j141 = (-((j10 >>> 46) & 1)) & j6;
        long j142 = j139 ^ (j141 << 46);
        long j143 = j140 ^ (j141 >>> 18);
        long j144 = (-((j10 >>> 47) & 1)) & j6;
        long j145 = j142 ^ (j144 << 47);
        long j146 = j143 ^ (j144 >>> 17);
        long j147 = (-((j10 >>> 48) & 1)) & j6;
        long j148 = j145 ^ (j147 << 48);
        long j149 = j146 ^ (j147 >>> 16);
        long j150 = (-((j10 >>> 49) & 1)) & j6;
        long j151 = j148 ^ (j150 << 49);
        long j152 = j149 ^ (j150 >>> 15);
        long j153 = (-((j10 >>> 50) & 1)) & j6;
        long j154 = j151 ^ (j153 << 50);
        long j155 = j152 ^ (j153 >>> 14);
        long j156 = (-((j10 >>> 51) & 1)) & j6;
        long j157 = j154 ^ (j156 << 51);
        long j158 = j155 ^ (j156 >>> 13);
        long j159 = (-((j10 >>> 52) & 1)) & j6;
        long j160 = j157 ^ (j159 << 52);
        long j161 = j158 ^ (j159 >>> 12);
        long j162 = (-((j10 >>> 53) & 1)) & j6;
        long j163 = j160 ^ (j162 << 53);
        long j164 = j161 ^ (j162 >>> 11);
        long j165 = (-((j10 >>> 54) & 1)) & j6;
        long j166 = j163 ^ (j165 << 54);
        long j167 = j164 ^ (j165 >>> 10);
        long j168 = (-((j10 >>> 55) & 1)) & j6;
        long j169 = j166 ^ (j168 << 55);
        long j170 = j167 ^ (j168 >>> 9);
        long j171 = (-((j10 >>> 56) & 1)) & j6;
        long j172 = j169 ^ (j171 << 56);
        long j173 = j170 ^ (j171 >>> 8);
        long j174 = (-((j10 >>> 57) & 1)) & j6;
        long j175 = j172 ^ (j174 << 57);
        long j176 = j173 ^ (j174 >>> 7);
        long j177 = (-((j10 >>> 58) & 1)) & j6;
        long j178 = j175 ^ (j177 << 58);
        long j179 = j176 ^ (j177 >>> 6);
        long j180 = (-((j10 >>> 59) & 1)) & j6;
        long j181 = j178 ^ (j180 << 59);
        long j182 = j179 ^ (j180 >>> 5);
        long j183 = (-((j10 >>> 60) & 1)) & j6;
        long j184 = j181 ^ (j183 << 60);
        long j185 = j182 ^ (j183 >>> 4);
        long j186 = (-((j10 >>> 61) & 1)) & j6;
        long j187 = j184 ^ (j186 << 61);
        long j188 = j185 ^ (j186 >>> 3);
        long j189 = (-((j10 >>> 62) & 1)) & j6;
        jArr[i10] = j187 ^ (j189 << 62);
        jArr[i10 + 1] = j188 ^ (j189 >>> 2);
    }

    private static void MUL64_NO_SIMD_GF2X_XOR(long[] jArr, int i10, long j6, long j10) {
        long j11 = (-(j10 >>> 63)) & j6;
        long j12 = (-((j10 >>> 1) & 1)) & j6;
        long j13 = (((-(j10 & 1)) & j6) ^ (j11 << 63)) ^ (j12 << 1);
        long j14 = (j11 >>> 1) ^ (j12 >>> 63);
        long j15 = (-((j10 >>> 2) & 1)) & j6;
        long j16 = (-((j10 >>> 3) & 1)) & j6;
        long j17 = (-((j10 >>> 4) & 1)) & j6;
        long j18 = (-((j10 >>> 5) & 1)) & j6;
        long j19 = (((j13 ^ (j15 << 2)) ^ (j16 << 3)) ^ (j17 << 4)) ^ (j18 << 5);
        long j20 = (j18 >>> 59) ^ (((j14 ^ (j15 >>> 62)) ^ (j16 >>> 61)) ^ (j17 >>> 60));
        long j21 = (-((j10 >>> 6) & 1)) & j6;
        long j22 = j19 ^ (j21 << 6);
        long j23 = j20 ^ (j21 >>> 58);
        long j24 = (-((j10 >>> 7) & 1)) & j6;
        long j25 = j22 ^ (j24 << 7);
        long j26 = j23 ^ (j24 >>> 57);
        long j27 = (-((j10 >>> 8) & 1)) & j6;
        long j28 = j25 ^ (j27 << 8);
        long j29 = j26 ^ (j27 >>> 56);
        long j30 = (-((j10 >>> 9) & 1)) & j6;
        long j31 = j28 ^ (j30 << 9);
        long j32 = j29 ^ (j30 >>> 55);
        long j33 = (-((j10 >>> 10) & 1)) & j6;
        long j34 = j31 ^ (j33 << 10);
        long j35 = j32 ^ (j33 >>> 54);
        long j36 = (-((j10 >>> 11) & 1)) & j6;
        long j37 = j34 ^ (j36 << 11);
        long j38 = j35 ^ (j36 >>> 53);
        long j39 = (-((j10 >>> 12) & 1)) & j6;
        long j40 = j37 ^ (j39 << 12);
        long j41 = j38 ^ (j39 >>> 52);
        long j42 = (-((j10 >>> 13) & 1)) & j6;
        long j43 = j40 ^ (j42 << 13);
        long j44 = j41 ^ (j42 >>> 51);
        long j45 = (-((j10 >>> 14) & 1)) & j6;
        long j46 = j43 ^ (j45 << 14);
        long j47 = j44 ^ (j45 >>> 50);
        long j48 = (-((j10 >>> 15) & 1)) & j6;
        long j49 = j46 ^ (j48 << 15);
        long j50 = j47 ^ (j48 >>> 49);
        long j51 = (-((j10 >>> 16) & 1)) & j6;
        long j52 = j49 ^ (j51 << 16);
        long j53 = j50 ^ (j51 >>> 48);
        long j54 = (-((j10 >>> 17) & 1)) & j6;
        long j55 = j52 ^ (j54 << 17);
        long j56 = j53 ^ (j54 >>> 47);
        long j57 = (-((j10 >>> 18) & 1)) & j6;
        long j58 = j55 ^ (j57 << 18);
        long j59 = j56 ^ (j57 >>> 46);
        long j60 = (-((j10 >>> 19) & 1)) & j6;
        long j61 = j58 ^ (j60 << 19);
        long j62 = j59 ^ (j60 >>> 45);
        long j63 = (-((j10 >>> 20) & 1)) & j6;
        long j64 = j61 ^ (j63 << 20);
        long j65 = j62 ^ (j63 >>> 44);
        long j66 = (-((j10 >>> 21) & 1)) & j6;
        long j67 = j64 ^ (j66 << 21);
        long j68 = j65 ^ (j66 >>> 43);
        long j69 = (-((j10 >>> 22) & 1)) & j6;
        long j70 = j67 ^ (j69 << 22);
        long j71 = j68 ^ (j69 >>> 42);
        long j72 = (-((j10 >>> 23) & 1)) & j6;
        long j73 = j70 ^ (j72 << 23);
        long j74 = j71 ^ (j72 >>> 41);
        long j75 = (-((j10 >>> 24) & 1)) & j6;
        long j76 = j73 ^ (j75 << 24);
        long j77 = j74 ^ (j75 >>> 40);
        long j78 = (-((j10 >>> 25) & 1)) & j6;
        long j79 = j76 ^ (j78 << 25);
        long j80 = j77 ^ (j78 >>> 39);
        long j81 = (-((j10 >>> 26) & 1)) & j6;
        long j82 = j79 ^ (j81 << 26);
        long j83 = j80 ^ (j81 >>> 38);
        long j84 = (-((j10 >>> 27) & 1)) & j6;
        long j85 = j82 ^ (j84 << 27);
        long j86 = j83 ^ (j84 >>> 37);
        long j87 = (-((j10 >>> 28) & 1)) & j6;
        long j88 = j85 ^ (j87 << 28);
        long j89 = j86 ^ (j87 >>> 36);
        long j90 = (-((j10 >>> 29) & 1)) & j6;
        long j91 = j88 ^ (j90 << 29);
        long j92 = j89 ^ (j90 >>> 35);
        long j93 = (-((j10 >>> 30) & 1)) & j6;
        long j94 = j91 ^ (j93 << 30);
        long j95 = j92 ^ (j93 >>> 34);
        long j96 = (-((j10 >>> 31) & 1)) & j6;
        long j97 = j94 ^ (j96 << 31);
        long j98 = j95 ^ (j96 >>> 33);
        long j99 = (-((j10 >>> 32) & 1)) & j6;
        long j100 = j97 ^ (j99 << 32);
        long j101 = j98 ^ (j99 >>> 32);
        long j102 = (-((j10 >>> 33) & 1)) & j6;
        long j103 = j100 ^ (j102 << 33);
        long j104 = j101 ^ (j102 >>> 31);
        long j105 = (-((j10 >>> 34) & 1)) & j6;
        long j106 = j103 ^ (j105 << 34);
        long j107 = j104 ^ (j105 >>> 30);
        long j108 = (-((j10 >>> 35) & 1)) & j6;
        long j109 = j106 ^ (j108 << 35);
        long j110 = j107 ^ (j108 >>> 29);
        long j111 = (-((j10 >>> 36) & 1)) & j6;
        long j112 = j109 ^ (j111 << 36);
        long j113 = j110 ^ (j111 >>> 28);
        long j114 = (-((j10 >>> 37) & 1)) & j6;
        long j115 = j112 ^ (j114 << 37);
        long j116 = j113 ^ (j114 >>> 27);
        long j117 = (-((j10 >>> 38) & 1)) & j6;
        long j118 = j115 ^ (j117 << 38);
        long j119 = j116 ^ (j117 >>> 26);
        long j120 = (-((j10 >>> 39) & 1)) & j6;
        long j121 = j118 ^ (j120 << 39);
        long j122 = j119 ^ (j120 >>> 25);
        long j123 = (-((j10 >>> 40) & 1)) & j6;
        long j124 = j121 ^ (j123 << 40);
        long j125 = j122 ^ (j123 >>> 24);
        long j126 = (-((j10 >>> 41) & 1)) & j6;
        long j127 = j124 ^ (j126 << 41);
        long j128 = j125 ^ (j126 >>> 23);
        long j129 = (-((j10 >>> 42) & 1)) & j6;
        long j130 = j127 ^ (j129 << 42);
        long j131 = j128 ^ (j129 >>> 22);
        long j132 = (-((j10 >>> 43) & 1)) & j6;
        long j133 = j130 ^ (j132 << 43);
        long j134 = j131 ^ (j132 >>> 21);
        long j135 = (-((j10 >>> 44) & 1)) & j6;
        long j136 = j133 ^ (j135 << 44);
        long j137 = j134 ^ (j135 >>> 20);
        long j138 = (-((j10 >>> 45) & 1)) & j6;
        long j139 = j136 ^ (j138 << 45);
        long j140 = j137 ^ (j138 >>> 19);
        long j141 = (-((j10 >>> 46) & 1)) & j6;
        long j142 = j139 ^ (j141 << 46);
        long j143 = j140 ^ (j141 >>> 18);
        long j144 = (-((j10 >>> 47) & 1)) & j6;
        long j145 = j142 ^ (j144 << 47);
        long j146 = j143 ^ (j144 >>> 17);
        long j147 = (-((j10 >>> 48) & 1)) & j6;
        long j148 = j145 ^ (j147 << 48);
        long j149 = j146 ^ (j147 >>> 16);
        long j150 = (-((j10 >>> 49) & 1)) & j6;
        long j151 = j148 ^ (j150 << 49);
        long j152 = j149 ^ (j150 >>> 15);
        long j153 = (-((j10 >>> 50) & 1)) & j6;
        long j154 = j151 ^ (j153 << 50);
        long j155 = j152 ^ (j153 >>> 14);
        long j156 = (-((j10 >>> 51) & 1)) & j6;
        long j157 = j154 ^ (j156 << 51);
        long j158 = j155 ^ (j156 >>> 13);
        long j159 = (-((j10 >>> 52) & 1)) & j6;
        long j160 = j157 ^ (j159 << 52);
        long j161 = j158 ^ (j159 >>> 12);
        long j162 = (-((j10 >>> 53) & 1)) & j6;
        long j163 = j160 ^ (j162 << 53);
        long j164 = j161 ^ (j162 >>> 11);
        long j165 = (-((j10 >>> 54) & 1)) & j6;
        long j166 = j163 ^ (j165 << 54);
        long j167 = j164 ^ (j165 >>> 10);
        long j168 = (-((j10 >>> 55) & 1)) & j6;
        long j169 = j166 ^ (j168 << 55);
        long j170 = j167 ^ (j168 >>> 9);
        long j171 = (-((j10 >>> 56) & 1)) & j6;
        long j172 = j169 ^ (j171 << 56);
        long j173 = j170 ^ (j171 >>> 8);
        long j174 = (-((j10 >>> 57) & 1)) & j6;
        long j175 = j172 ^ (j174 << 57);
        long j176 = j173 ^ (j174 >>> 7);
        long j177 = (-((j10 >>> 58) & 1)) & j6;
        long j178 = j175 ^ (j177 << 58);
        long j179 = j176 ^ (j177 >>> 6);
        long j180 = (-((j10 >>> 59) & 1)) & j6;
        long j181 = j178 ^ (j180 << 59);
        long j182 = j179 ^ (j180 >>> 5);
        long j183 = (-((j10 >>> 60) & 1)) & j6;
        long j184 = j181 ^ (j183 << 60);
        long j185 = j182 ^ (j183 >>> 4);
        long j186 = (-((j10 >>> 61) & 1)) & j6;
        long j187 = j184 ^ (j186 << 61);
        long j188 = j185 ^ (j186 >>> 3);
        long j189 = (-((j10 >>> 62) & 1)) & j6;
        jArr[i10] = (j187 ^ (j189 << 62)) ^ jArr[i10];
        int i11 = i10 + 1;
        jArr[i11] = (j188 ^ (j189 >>> 2)) ^ jArr[i11];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void SQR128_NO_SIMD_GF2X(long[] jArr, int i10, long[] jArr2, int i11) {
        SQR64_NO_SIMD_GF2X(jArr, i10 + 2, jArr2[i11 + 1]);
        SQR64_NO_SIMD_GF2X(jArr, i10, jArr2[i11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void SQR256_NO_SIMD_GF2X(long[] jArr, int i10, long[] jArr2, int i11) {
        SQR128_NO_SIMD_GF2X(jArr, i10 + 4, jArr2, i11 + 2);
        SQR128_NO_SIMD_GF2X(jArr, i10, jArr2, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long SQR32_NO_SIMD_GF2X(long j6) {
        long j10 = (j6 ^ (j6 << 16)) & 281470681808895L;
        long j11 = (j10 ^ (j10 << 8)) & 71777214294589695L;
        long j12 = (j11 ^ (j11 << 4)) & 1085102592571150095L;
        long j13 = (j12 ^ (j12 << 2)) & 3689348814741910323L;
        return (j13 ^ (j13 << 1)) & 6148914691236517205L;
    }

    private static long SQR64LOW_NO_SIMD_GF2X(long j6) {
        long j10 = ((j6 << 16) ^ (4294967295L & j6)) & 281470681808895L;
        long j11 = (j10 ^ (j10 << 8)) & 71777214294589695L;
        long j12 = (j11 ^ (j11 << 4)) & 1085102592571150095L;
        long j13 = (j12 ^ (j12 << 2)) & 3689348814741910323L;
        return (j13 ^ (j13 << 1)) & 6148914691236517205L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void SQR64_NO_SIMD_GF2X(long[] jArr, int i10, long j6) {
        jArr[i10 + 1] = SQR32_NO_SIMD_GF2X(j6 >>> 32);
        jArr[i10] = SQR64LOW_NO_SIMD_GF2X(j6);
    }

    private static void mul128_no_simd_gf2x(long[] jArr, int i10, long j6, long j10, long j11, long j12) {
        MUL64_NO_SIMD_GF2X(jArr, i10, j6, j11);
        int i11 = i10 + 2;
        MUL64_NO_SIMD_GF2X(jArr, i11, j10, j12);
        int i12 = i10 + 1;
        long j13 = jArr[i11] ^ jArr[i12];
        jArr[i11] = j13;
        jArr[i12] = j13 ^ jArr[i10];
        jArr[i11] = jArr[i11] ^ jArr[i10 + 3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i12, j6 ^ j10, j11 ^ j12);
    }

    private static void mul128_no_simd_gf2x_xor(long[] jArr, int i10, long j6, long j10, long j11, long j12, long[] jArr2) {
        MUL64_NO_SIMD_GF2X(jArr2, 0, j6, j11);
        MUL64_NO_SIMD_GF2X(jArr2, 2, j10, j12);
        jArr[i10] = jArr[i10] ^ jArr2[0];
        long j13 = jArr2[2] ^ jArr2[1];
        jArr2[2] = j13;
        int i11 = i10 + 1;
        jArr[i11] = (jArr2[0] ^ j13) ^ jArr[i11];
        int i12 = i10 + 2;
        jArr[i12] = jArr[i12] ^ (jArr2[2] ^ jArr2[3]);
        int i13 = i10 + 3;
        jArr[i13] = jArr[i13] ^ jArr2[3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i11, j6 ^ j10, j11 ^ j12);
    }

    public static void mul192_no_simd_gf2x(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12) {
        MUL64_NO_SIMD_GF2X(jArr, i10, jArr2[i11], jArr3[i12]);
        int i13 = i10 + 4;
        int i14 = i11 + 2;
        int i15 = i12 + 2;
        MUL64_NO_SIMD_GF2X(jArr, i13, jArr2[i14], jArr3[i15]);
        int i16 = i10 + 2;
        int i17 = i11 + 1;
        int i18 = i12 + 1;
        MUL64_NO_SIMD_GF2X(jArr, i16, jArr2[i17], jArr3[i18]);
        int i19 = i10 + 1;
        jArr[i19] = jArr[i19] ^ jArr[i16];
        int i20 = i10 + 3;
        long j6 = jArr[i20] ^ jArr[i13];
        jArr[i20] = j6;
        jArr[i13] = j6 ^ jArr[i10 + 5];
        jArr[i16] = (jArr[i20] ^ jArr[i19]) ^ jArr[i10];
        jArr[i20] = jArr[i19] ^ jArr[i13];
        jArr[i19] = jArr[i19] ^ jArr[i10];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i19, jArr2[i11] ^ jArr2[i17], jArr3[i12] ^ jArr3[i18]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i20, jArr2[i17] ^ jArr2[i14], jArr3[i18] ^ jArr3[i15]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i16, jArr2[i11] ^ jArr2[i14], jArr3[i12] ^ jArr3[i15]);
    }

    public static void mul192_no_simd_gf2x_xor(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4) {
        MUL64_NO_SIMD_GF2X(jArr4, 0, jArr2[i11], jArr3[i12]);
        int i13 = i11 + 2;
        int i14 = i12 + 2;
        MUL64_NO_SIMD_GF2X(jArr4, 4, jArr2[i13], jArr3[i14]);
        int i15 = i11 + 1;
        int i16 = i12 + 1;
        MUL64_NO_SIMD_GF2X(jArr4, 2, jArr2[i15], jArr3[i16]);
        jArr[i10] = jArr[i10] ^ jArr4[0];
        long j6 = jArr4[1] ^ jArr4[2];
        jArr4[1] = j6;
        long j10 = jArr4[3] ^ jArr4[4];
        jArr4[3] = j10;
        jArr4[4] = j10 ^ jArr4[5];
        long j11 = j6 ^ jArr4[0];
        jArr4[0] = j11;
        int i17 = i10 + 1;
        jArr[i17] = j11 ^ jArr[i17];
        int i18 = i10 + 2;
        jArr[i18] = (jArr4[0] ^ jArr4[3]) ^ jArr[i18];
        int i19 = i10 + 3;
        jArr[i19] = jArr[i19] ^ (jArr4[1] ^ jArr4[4]);
        int i20 = i10 + 4;
        jArr[i20] = jArr[i20] ^ jArr4[4];
        int i21 = i10 + 5;
        jArr[i21] = jArr[i21] ^ jArr4[5];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i17, jArr2[i11] ^ jArr2[i15], jArr3[i12] ^ jArr3[i16]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i19, jArr2[i15] ^ jArr2[i13], jArr3[i16] ^ jArr3[i14]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i18, jArr2[i11] ^ jArr2[i13], jArr3[i14] ^ jArr3[i12]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul288_no_simd_gf2x(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4) {
        int i13 = i11 + 1;
        int i14 = i12 + 1;
        mul128_no_simd_gf2x(jArr, i10, jArr2[i11], jArr2[i13], jArr3[i12], jArr3[i14]);
        int i15 = i10 + 4;
        int i16 = i11 + 2;
        int i17 = i12 + 2;
        MUL64_NO_SIMD_GF2X(jArr, i15, jArr2[i16], jArr3[i17]);
        int i18 = i10 + 7;
        int i19 = i11 + 3;
        int i20 = i12 + 3;
        MUL64_NO_SIMD_GF2X(jArr, i18, jArr2[i19], jArr3[i20]);
        long j6 = jArr[i18];
        int i21 = i10 + 5;
        jArr[i18] = j6 ^ jArr[i21];
        int i22 = i10 + 8;
        int i23 = i11 + 4;
        int i24 = i12 + 4;
        jArr[i22] = MUL32_NO_SIMD_GF2X(jArr2[i23], jArr3[i24]) ^ jArr[i22];
        jArr[i21] = jArr[i18] ^ jArr[i15];
        long j10 = jArr[i18] ^ jArr[i22];
        jArr[i18] = j10;
        int i25 = i10 + 6;
        jArr[i25] = j10 ^ jArr[i15];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i21, jArr2[i19] ^ jArr2[i16], jArr3[i17] ^ jArr3[i20]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i18, jArr2[i23] ^ jArr2[i19], jArr3[i20] ^ jArr3[i24]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i25, jArr2[i23] ^ jArr2[i16], jArr3[i17] ^ jArr3[i24]);
        int i26 = i10 + 2;
        jArr[i15] = jArr[i15] ^ jArr[i26];
        long j11 = jArr[i21];
        int i27 = i10 + 3;
        jArr[i21] = j11 ^ jArr[i27];
        long j12 = jArr2[i11] ^ jArr2[i16];
        long j13 = jArr2[i13] ^ jArr2[i19];
        long j14 = jArr3[i12] ^ jArr3[i17];
        long j15 = jArr3[i14] ^ jArr3[i20];
        MUL64_NO_SIMD_GF2X(jArr4, 0, j12, j14);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j13, j15);
        jArr4[2] = jArr4[2] ^ jArr4[1];
        jArr4[3] = MUL32_NO_SIMD_GF2X(jArr2[i23], jArr3[i24]) ^ jArr4[3];
        jArr[i26] = (jArr[i15] ^ jArr[i10]) ^ jArr4[0];
        jArr[i27] = ((jArr[i21] ^ jArr[i10 + 1]) ^ jArr4[2]) ^ jArr4[0];
        long j16 = jArr4[2] ^ jArr4[3];
        jArr4[2] = j16;
        jArr[i15] = ((jArr[i25] ^ j16) ^ jArr4[0]) ^ jArr[i15];
        jArr[i21] = jArr[i21] ^ (jArr[i18] ^ jArr4[2]);
        jArr[i25] = (jArr[i22] ^ jArr4[3]) ^ jArr[i25];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i27, j12 ^ j13, j14 ^ j15);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i21, j13 ^ jArr2[i23], j15 ^ jArr3[i24]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i15, j12 ^ jArr2[i23], j14 ^ jArr3[i24]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul288_no_simd_gf2x_xor(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4) {
        int i13 = i11 + 1;
        int i14 = i12 + 1;
        mul128_no_simd_gf2x(jArr4, 0, jArr2[i11], jArr2[i13], jArr3[i12], jArr3[i14]);
        int i15 = i11 + 2;
        int i16 = i12 + 2;
        MUL64_NO_SIMD_GF2X(jArr4, 4, jArr2[i15], jArr3[i16]);
        int i17 = i11 + 3;
        int i18 = i12 + 3;
        MUL64_NO_SIMD_GF2X(jArr4, 7, jArr2[i17], jArr3[i18]);
        jArr4[7] = jArr4[7] ^ jArr4[5];
        int i19 = i11 + 4;
        int i20 = i12 + 4;
        long jMUL32_NO_SIMD_GF2X = jArr4[8] ^ MUL32_NO_SIMD_GF2X(jArr2[i19], jArr3[i20]);
        jArr4[8] = jMUL32_NO_SIMD_GF2X;
        long j6 = jArr4[7];
        long j10 = jArr4[4];
        long j11 = j6 ^ j10;
        jArr4[5] = j11;
        long j12 = jMUL32_NO_SIMD_GF2X ^ j6;
        jArr4[7] = j12;
        jArr4[6] = j12 ^ j10;
        jArr4[4] = jArr4[2] ^ j10;
        jArr4[5] = j11 ^ jArr4[3];
        jArr[i10] = jArr[i10] ^ jArr4[0];
        int i21 = i10 + 1;
        jArr[i21] = jArr[i21] ^ jArr4[1];
        int i22 = i10 + 2;
        jArr[i22] = jArr[i22] ^ (jArr4[4] ^ jArr4[0]);
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 5, jArr2[i17] ^ jArr2[i15], jArr3[i16] ^ jArr3[i18]);
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 7, jArr2[i19] ^ jArr2[i17], jArr3[i18] ^ jArr3[i20]);
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 6, jArr2[i19] ^ jArr2[i15], jArr3[i16] ^ jArr3[i20]);
        int i23 = i10 + 3;
        jArr[i23] = jArr[i23] ^ (jArr4[5] ^ jArr4[1]);
        int i24 = i10 + 4;
        jArr[i24] = jArr[i24] ^ (jArr4[4] ^ jArr4[6]);
        int i25 = i10 + 5;
        jArr[i25] = jArr[i25] ^ (jArr4[5] ^ jArr4[7]);
        int i26 = i10 + 6;
        jArr[i26] = jArr[i26] ^ (jArr4[6] ^ jArr4[8]);
        int i27 = i10 + 7;
        jArr[i27] = jArr[i27] ^ jArr4[7];
        int i28 = i10 + 8;
        jArr[i28] = jArr[i28] ^ jArr4[8];
        long j13 = jArr2[i11] ^ jArr2[i15];
        long j14 = jArr2[i13] ^ jArr2[i17];
        long j15 = jArr3[i12] ^ jArr3[i16];
        long j16 = jArr3[i14] ^ jArr3[i18];
        MUL64_NO_SIMD_GF2X(jArr4, 0, j13, j15);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j14, j16);
        jArr4[2] = jArr4[2] ^ jArr4[1];
        jArr4[3] = MUL32_NO_SIMD_GF2X(jArr2[i19], jArr3[i20]) ^ jArr4[3];
        jArr[i22] = jArr[i22] ^ jArr4[0];
        jArr[i23] = jArr[i23] ^ (jArr4[2] ^ jArr4[0]);
        long j17 = jArr4[2] ^ jArr4[3];
        jArr4[2] = j17;
        jArr[i24] = (j17 ^ jArr4[0]) ^ jArr[i24];
        jArr[i25] = jArr[i25] ^ jArr4[2];
        jArr[i26] = jArr[i26] ^ jArr4[3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i23, j13 ^ j14, j15 ^ j16);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i25, j14 ^ jArr2[i19], j16 ^ jArr3[i20]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i24, jArr2[i19] ^ j13, jArr3[i20] ^ j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul384_no_simd_gf2x(long[] jArr, long[] jArr2, int i10, long[] jArr3, int i11, long[] jArr4) {
        mul192_no_simd_gf2x(jArr, 0, jArr2, i10, jArr3, i11);
        int i12 = i10 + 3;
        int i13 = i11 + 3;
        mul192_no_simd_gf2x(jArr, 6, jArr2, i12, jArr3, i13);
        long j6 = jArr2[i10] ^ jArr2[i12];
        long j10 = jArr2[i10 + 1] ^ jArr2[i10 + 4];
        long j11 = jArr2[i10 + 2] ^ jArr2[i10 + 5];
        long j12 = jArr3[i11] ^ jArr3[i13];
        long j13 = jArr3[i11 + 1] ^ jArr3[i11 + 4];
        long j14 = jArr3[i11 + 2] ^ jArr3[i11 + 5];
        jArr[6] = jArr[6] ^ jArr[3];
        jArr[7] = jArr[7] ^ jArr[4];
        jArr[8] = jArr[8] ^ jArr[5];
        MUL64_NO_SIMD_GF2X(jArr4, 0, j6, j12);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j11, j14);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j10, j13);
        long j15 = jArr[6];
        long j16 = j15 ^ jArr[0];
        long j17 = jArr4[0];
        jArr[3] = j16 ^ j17;
        long j18 = jArr4[1] ^ jArr4[2];
        jArr4[1] = j18;
        long j19 = j17 ^ j18;
        jArr4[0] = j19;
        long j20 = jArr4[3] ^ jArr4[4];
        jArr4[3] = j20;
        long j21 = j20 ^ jArr4[5];
        jArr4[4] = j21;
        long j22 = jArr[8];
        jArr[5] = ((j22 ^ jArr[2]) ^ j20) ^ j19;
        jArr[6] = j15 ^ ((jArr[9] ^ j18) ^ j21);
        long j23 = jArr[7];
        jArr[4] = (jArr[1] ^ j23) ^ j19;
        jArr[7] = j23 ^ (jArr4[4] ^ jArr[10]);
        jArr[8] = j22 ^ (jArr[11] ^ jArr4[5]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 4, j6 ^ j10, j12 ^ j13);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 6, j10 ^ j11, j13 ^ j14);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 5, j6 ^ j11, j12 ^ j14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul384_no_simd_gf2x_xor(long[] jArr, long[] jArr2, int i10, long[] jArr3, int i11, long[] jArr4) {
        mul192_no_simd_gf2x(jArr4, 0, jArr2, i10, jArr3, i11);
        int i12 = i10 + 3;
        int i13 = i11 + 3;
        mul192_no_simd_gf2x(jArr4, 6, jArr2, i12, jArr3, i13);
        long j6 = jArr2[i12] ^ jArr2[i10];
        long j10 = jArr2[i10 + 1] ^ jArr2[i10 + 4];
        long j11 = jArr2[i10 + 2] ^ jArr2[i10 + 5];
        long j12 = jArr3[i13] ^ jArr3[i11];
        long j13 = jArr3[i11 + 4] ^ jArr3[i11 + 1];
        long j14 = jArr3[i11 + 5] ^ jArr3[i11 + 2];
        long j15 = jArr4[6] ^ jArr4[3];
        jArr4[6] = j15;
        long j16 = jArr4[7] ^ jArr4[4];
        jArr4[7] = j16;
        long j17 = jArr4[8] ^ jArr4[5];
        jArr4[8] = j17;
        jArr[0] = jArr[0] ^ jArr4[0];
        jArr[1] = jArr[1] ^ jArr4[1];
        jArr[2] = jArr[2] ^ jArr4[2];
        jArr[3] = jArr[3] ^ (j15 ^ jArr4[0]);
        jArr[5] = jArr[5] ^ (j17 ^ jArr4[2]);
        long j18 = jArr[6];
        long j19 = jArr4[9];
        jArr[6] = j18 ^ (j15 ^ j19);
        jArr[4] = jArr[4] ^ (j16 ^ jArr4[1]);
        long j20 = jArr[7];
        long j21 = jArr4[10];
        jArr[7] = j20 ^ (j16 ^ j21);
        long j22 = jArr[8];
        long j23 = jArr4[11];
        jArr[8] = j22 ^ (j17 ^ j23);
        jArr[9] = jArr[9] ^ j19;
        jArr[10] = jArr[10] ^ j21;
        jArr[11] = jArr[11] ^ j23;
        MUL64_NO_SIMD_GF2X(jArr4, 0, j6, j12);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j11, j14);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j10, j13);
        long j24 = jArr[3];
        long j25 = jArr4[0];
        jArr[3] = j24 ^ j25;
        long j26 = jArr4[1] ^ jArr4[2];
        jArr4[1] = j26;
        long j27 = j25 ^ j26;
        jArr4[0] = j27;
        long j28 = jArr4[3] ^ jArr4[4];
        jArr4[3] = j28;
        long j29 = j28 ^ jArr4[5];
        jArr4[4] = j29;
        jArr[5] = jArr[5] ^ (j28 ^ j27);
        jArr[6] = (j26 ^ j29) ^ jArr[6];
        jArr[4] = jArr[4] ^ j27;
        jArr[7] = jArr[7] ^ jArr4[4];
        jArr[8] = jArr[8] ^ jArr4[5];
        MUL64_NO_SIMD_GF2X_XOR(jArr, 4, j6 ^ j10, j12 ^ j13);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 6, j10 ^ j11, j13 ^ j14);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 5, j6 ^ j11, j12 ^ j14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul416_no_simd_gf2x(long[] jArr, long[] jArr2, int i10, long[] jArr3, int i11, long[] jArr4) {
        mul192_no_simd_gf2x(jArr, 0, jArr2, i10, jArr3, i11);
        int i12 = i10 + 3;
        int i13 = i10 + 4;
        int i14 = i11 + 3;
        int i15 = i11 + 4;
        mul128_no_simd_gf2x(jArr, 6, jArr2[i12], jArr2[i13], jArr3[i14], jArr3[i15]);
        int i16 = i10 + 5;
        int i17 = i11 + 5;
        MUL64_NO_SIMD_GF2X(jArr, 10, jArr2[i16], jArr3[i17]);
        int i18 = i10 + 6;
        int i19 = i11 + 6;
        long jMUL32_NO_SIMD_GF2X = MUL32_NO_SIMD_GF2X(jArr2[i18], jArr3[i19]) ^ jArr[11];
        jArr[12] = jMUL32_NO_SIMD_GF2X;
        jArr[11] = jMUL32_NO_SIMD_GF2X ^ jArr[10];
        MUL64_NO_SIMD_GF2X_XOR(jArr, 11, jArr2[i18] ^ jArr2[i16], jArr3[i19] ^ jArr3[i17]);
        long j6 = jArr[8] ^ jArr[10];
        jArr[8] = j6;
        long j10 = jArr[11] ^ jArr[9];
        jArr[11] = j10;
        jArr[10] = jArr[12] ^ j6;
        jArr[8] = j6 ^ jArr[6];
        jArr[9] = jArr[7] ^ j10;
        mul128_no_simd_gf2x_xor(jArr, 8, jArr2[i16] ^ jArr2[i12], jArr2[i18] ^ jArr2[i13], jArr3[i17] ^ jArr3[i14], jArr3[i19] ^ jArr3[i15], jArr4);
        long j11 = jArr2[i12] ^ jArr2[i10];
        long j12 = jArr2[i10 + 1] ^ jArr2[i13];
        long j13 = jArr2[i10 + 2] ^ jArr2[i16];
        long j14 = jArr2[i18];
        long j15 = jArr3[i11] ^ jArr3[i14];
        long j16 = jArr3[i11 + 1] ^ jArr3[i15];
        long j17 = jArr3[i11 + 2] ^ jArr3[i17];
        long j18 = jArr3[i19];
        jArr[6] = jArr[6] ^ jArr[3];
        jArr[7] = jArr[7] ^ jArr[4];
        jArr[8] = jArr[8] ^ jArr[5];
        mul128_no_simd_gf2x(jArr4, 0, j11, j12, j15, j16);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j13, j17);
        long jMUL32_NO_SIMD_GF2X2 = MUL32_NO_SIMD_GF2X(j14, j18) ^ jArr4[5];
        jArr4[6] = jMUL32_NO_SIMD_GF2X2;
        jArr4[5] = jMUL32_NO_SIMD_GF2X2 ^ jArr4[4];
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 5, j13 ^ j14, j17 ^ j18);
        long j19 = jArr[6];
        long j20 = jArr[0] ^ j19;
        long j21 = jArr4[0];
        jArr[3] = j20 ^ j21;
        long j22 = jArr[7];
        long j23 = j22 ^ jArr[1];
        long j24 = jArr4[1];
        jArr[4] = j23 ^ j24;
        long j25 = jArr4[2] ^ jArr4[4];
        jArr4[2] = j25;
        long j26 = jArr4[3] ^ jArr4[5];
        jArr4[3] = j26;
        long j27 = jArr[8];
        jArr[5] = ((j27 ^ jArr[2]) ^ j25) ^ j21;
        long j28 = jArr[9];
        jArr[6] = j19 ^ ((j28 ^ j26) ^ j24);
        long j29 = jArr[10] ^ j25;
        long j30 = jArr4[6];
        jArr[7] = (j29 ^ j30) ^ j22;
        jArr[8] = j27 ^ (jArr[11] ^ j26);
        jArr[9] = j28 ^ (jArr[12] ^ j30);
        mul128_no_simd_gf2x_xor(jArr, 5, j11 ^ j13, j12 ^ j14, j15 ^ j17, j16 ^ j18, jArr4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul416_no_simd_gf2x_xor(long[] jArr, long[] jArr2, int i10, long[] jArr3, int i11, long[] jArr4, long[] jArr5) {
        mul192_no_simd_gf2x(jArr4, 0, jArr2, i10, jArr3, i11);
        int i12 = i10 + 3;
        int i13 = i10 + 4;
        int i14 = i11 + 3;
        int i15 = i11 + 4;
        mul128_no_simd_gf2x(jArr4, 6, jArr2[i12], jArr2[i13], jArr3[i14], jArr3[i15]);
        int i16 = i10 + 5;
        int i17 = i11 + 5;
        MUL64_NO_SIMD_GF2X(jArr4, 10, jArr2[i16], jArr3[i17]);
        int i18 = i10 + 6;
        int i19 = i11 + 6;
        long jMUL32_NO_SIMD_GF2X = MUL32_NO_SIMD_GF2X(jArr2[i18], jArr3[i19]) ^ jArr4[11];
        jArr4[12] = jMUL32_NO_SIMD_GF2X;
        jArr4[11] = jMUL32_NO_SIMD_GF2X ^ jArr4[10];
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 11, jArr2[i18] ^ jArr2[i16], jArr3[i19] ^ jArr3[i17]);
        long j6 = jArr4[8] ^ jArr4[10];
        jArr4[8] = j6;
        long j10 = jArr4[11] ^ jArr4[9];
        jArr4[11] = j10;
        jArr4[10] = jArr4[12] ^ j6;
        long j11 = jArr4[6];
        long j12 = j6 ^ j11;
        jArr4[8] = j12;
        long j13 = jArr4[7];
        jArr4[9] = j10 ^ j13;
        jArr4[6] = jArr4[3] ^ j11;
        jArr4[7] = jArr4[4] ^ j13;
        jArr4[8] = j12 ^ jArr4[5];
        mul128_no_simd_gf2x_xor(jArr4, 8, jArr2[i16] ^ jArr2[i12], jArr2[i18] ^ jArr2[i13], jArr3[i17] ^ jArr3[i14], jArr3[i19] ^ jArr3[i15], jArr5);
        jArr[0] = jArr[0] ^ jArr4[0];
        jArr[1] = jArr[1] ^ jArr4[1];
        jArr[2] = jArr[2] ^ jArr4[2];
        long j14 = jArr[3];
        long j15 = jArr4[6];
        jArr[3] = j14 ^ (jArr4[0] ^ j15);
        long j16 = jArr[4];
        long j17 = jArr4[7];
        jArr[4] = j16 ^ (jArr4[1] ^ j17);
        long j18 = jArr[5];
        long j19 = jArr4[8];
        jArr[5] = j18 ^ (jArr4[2] ^ j19);
        long j20 = jArr[6];
        long j21 = jArr4[9];
        jArr[6] = j20 ^ (j15 ^ j21);
        long j22 = jArr[7];
        long j23 = jArr4[10];
        jArr[7] = j22 ^ (j17 ^ j23);
        long j24 = jArr[8];
        long j25 = jArr4[11];
        jArr[8] = j24 ^ (j19 ^ j25);
        long j26 = jArr[9];
        long j27 = jArr4[12];
        jArr[9] = j26 ^ (j21 ^ j27);
        jArr[10] = jArr[10] ^ j23;
        jArr[11] = jArr[11] ^ j25;
        jArr[12] = jArr[12] ^ j27;
        long j28 = jArr2[i12] ^ jArr2[i10];
        long j29 = jArr2[i13] ^ jArr2[i10 + 1];
        long j30 = jArr2[i10 + 2] ^ jArr2[i16];
        long j31 = jArr2[i18];
        long j32 = jArr3[i11] ^ jArr3[i14];
        long j33 = jArr3[i11 + 1] ^ jArr3[i15];
        long j34 = jArr3[i11 + 2] ^ jArr3[i17];
        long j35 = jArr3[i19];
        mul128_no_simd_gf2x(jArr4, 0, j28, j29, j32, j33);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j30, j34);
        long jMUL32_NO_SIMD_GF2X2 = MUL32_NO_SIMD_GF2X(j31, j35) ^ jArr4[5];
        jArr4[6] = jMUL32_NO_SIMD_GF2X2;
        jArr4[5] = jMUL32_NO_SIMD_GF2X2 ^ jArr4[4];
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 5, j30 ^ j31, j34 ^ j35);
        long j36 = jArr[3];
        long j37 = jArr4[0];
        jArr[3] = j36 ^ j37;
        long j38 = jArr[4];
        long j39 = jArr4[1];
        jArr[4] = j38 ^ j39;
        long j40 = jArr4[2] ^ jArr4[4];
        jArr4[2] = j40;
        long j41 = jArr4[3] ^ jArr4[5];
        jArr4[3] = j41;
        jArr[5] = jArr[5] ^ (j37 ^ j40);
        jArr[6] = jArr[6] ^ (j41 ^ j39);
        long j42 = jArr[7];
        long j43 = jArr4[6];
        jArr[7] = (j40 ^ j43) ^ j42;
        jArr[8] = jArr[8] ^ j41;
        jArr[9] = jArr[9] ^ j43;
        mul128_no_simd_gf2x_xor(jArr, 5, j28 ^ j30, j29 ^ j31, j32 ^ j34, j33 ^ j35, jArr4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul544_no_simd_gf2x(long[] jArr, long[] jArr2, int i10, long[] jArr3, int i11, long[] jArr4, long[] jArr5, long[] jArr6) {
        int i12 = i10 + 1;
        int i13 = i11 + 1;
        mul128_no_simd_gf2x(jArr, 0, jArr2[i10], jArr2[i12], jArr3[i11], jArr3[i13]);
        int i14 = i10 + 2;
        int i15 = i10 + 3;
        int i16 = i11 + 2;
        int i17 = i11 + 3;
        mul128_no_simd_gf2x(jArr, 4, jArr2[i14], jArr2[i15], jArr3[i16], jArr3[i17]);
        long j6 = jArr[4] ^ jArr[2];
        jArr[4] = j6;
        long j10 = jArr[5] ^ jArr[3];
        jArr[5] = j10;
        jArr[2] = jArr[0] ^ j6;
        jArr[3] = jArr[1] ^ j10;
        jArr[4] = j6 ^ jArr[6];
        jArr[5] = j10 ^ jArr[7];
        mul128_no_simd_gf2x_xor(jArr, 2, jArr2[i14] ^ jArr2[i10], jArr2[i12] ^ jArr2[i15], jArr3[i11] ^ jArr3[i16], jArr3[i13] ^ jArr3[i17], jArr6);
        int i18 = i10 + 4;
        int i19 = i11 + 4;
        mul288_no_simd_gf2x(jArr, 8, jArr2, i18, jArr3, i19, jArr6);
        long j11 = jArr[8] ^ jArr[4];
        jArr[8] = j11;
        long j12 = jArr[9] ^ jArr[5];
        jArr[9] = j12;
        long j13 = jArr[10] ^ jArr[6];
        jArr[10] = j13;
        long j14 = jArr[11] ^ jArr[7];
        jArr[11] = j14;
        jArr[4] = j11 ^ jArr[0];
        jArr[5] = j12 ^ jArr[1];
        jArr[6] = j13 ^ jArr[2];
        jArr[7] = j14 ^ jArr[3];
        long j15 = jArr[12];
        jArr[8] = j11 ^ j15;
        jArr[9] = j12 ^ jArr[13];
        jArr[10] = j13 ^ jArr[14];
        jArr[11] = j14 ^ jArr[15];
        jArr[12] = j15 ^ jArr[16];
        jArr4[0] = jArr2[i10] ^ jArr2[i18];
        jArr4[1] = jArr2[i12] ^ jArr2[i10 + 5];
        jArr4[2] = jArr2[i14] ^ jArr2[i10 + 6];
        jArr4[3] = jArr2[i15] ^ jArr2[i10 + 7];
        jArr4[4] = jArr2[i10 + 8];
        jArr5[0] = jArr3[i11] ^ jArr3[i19];
        jArr5[1] = jArr3[i13] ^ jArr3[i11 + 5];
        jArr5[2] = jArr3[i16] ^ jArr3[i11 + 6];
        jArr5[3] = jArr3[i17] ^ jArr3[i11 + 7];
        jArr5[4] = jArr3[i11 + 8];
        mul288_no_simd_gf2x_xor(jArr, 4, jArr4, 0, jArr5, 0, jArr6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul544_no_simd_gf2x_xor(long[] jArr, long[] jArr2, int i10, long[] jArr3, int i11, long[] jArr4, long[] jArr5, long[] jArr6, long[] jArr7) {
        int i12 = i10 + 1;
        int i13 = i11 + 1;
        mul128_no_simd_gf2x(jArr6, 0, jArr2[i10], jArr2[i12], jArr3[i11], jArr3[i13]);
        int i14 = i10 + 2;
        int i15 = i10 + 3;
        int i16 = i11 + 2;
        int i17 = i11 + 3;
        mul128_no_simd_gf2x(jArr6, 4, jArr2[i14], jArr2[i15], jArr3[i16], jArr3[i17]);
        long j6 = jArr6[4] ^ jArr6[2];
        jArr6[4] = j6;
        long j10 = jArr6[5] ^ jArr6[3];
        jArr6[5] = j10;
        jArr6[2] = jArr6[0] ^ j6;
        jArr6[3] = jArr6[1] ^ j10;
        jArr6[4] = j6 ^ jArr6[6];
        jArr6[5] = j10 ^ jArr6[7];
        mul128_no_simd_gf2x_xor(jArr6, 2, jArr2[i14] ^ jArr2[i10], jArr2[i12] ^ jArr2[i15], jArr3[i11] ^ jArr3[i16], jArr3[i13] ^ jArr3[i17], jArr7);
        int i18 = i10 + 4;
        int i19 = i11 + 4;
        mul288_no_simd_gf2x(jArr6, 8, jArr2, i18, jArr3, i19, jArr7);
        long j11 = jArr6[8] ^ jArr6[4];
        jArr6[8] = j11;
        long j12 = jArr6[9] ^ jArr6[5];
        jArr6[9] = j12;
        long j13 = jArr6[10] ^ jArr6[6];
        jArr6[10] = j13;
        long j14 = jArr6[11] ^ jArr6[7];
        jArr6[11] = j14;
        jArr[0] = jArr[0] ^ jArr6[0];
        jArr[1] = jArr[1] ^ jArr6[1];
        jArr[2] = jArr[2] ^ jArr6[2];
        jArr[3] = jArr[3] ^ jArr6[3];
        jArr[4] = jArr[4] ^ (j11 ^ jArr6[0]);
        jArr[5] = jArr[5] ^ (j12 ^ jArr6[1]);
        jArr[6] = jArr[6] ^ (j13 ^ jArr6[2]);
        jArr[7] = jArr[7] ^ (j14 ^ jArr6[3]);
        long j15 = jArr[8];
        long j16 = jArr6[12];
        jArr[8] = j15 ^ (j11 ^ j16);
        long j17 = jArr[9];
        long j18 = jArr6[13];
        jArr[9] = j17 ^ (j12 ^ j18);
        long j19 = jArr[10];
        long j20 = jArr6[14];
        jArr[10] = j19 ^ (j13 ^ j20);
        long j21 = jArr[11];
        long j22 = jArr6[15];
        jArr[11] = j21 ^ (j14 ^ j22);
        long j23 = jArr[12];
        long j24 = jArr6[16];
        jArr[12] = j23 ^ (j16 ^ j24);
        jArr[13] = jArr[13] ^ j18;
        jArr[14] = jArr[14] ^ j20;
        jArr[15] = jArr[15] ^ j22;
        jArr[16] = jArr[16] ^ j24;
        jArr4[0] = jArr2[i10] ^ jArr2[i18];
        jArr4[1] = jArr2[i12] ^ jArr2[i10 + 5];
        jArr4[2] = jArr2[i14] ^ jArr2[i10 + 6];
        jArr4[3] = jArr2[i15] ^ jArr2[i10 + 7];
        jArr4[4] = jArr2[i10 + 8];
        jArr5[0] = jArr3[i11] ^ jArr3[i19];
        jArr5[1] = jArr3[i13] ^ jArr3[i11 + 5];
        jArr5[2] = jArr3[i16] ^ jArr3[i11 + 6];
        jArr5[3] = jArr3[i17] ^ jArr3[i11 + 7];
        jArr5[4] = jArr3[i11 + 8];
        mul288_no_simd_gf2x_xor(jArr, 4, jArr4, 0, jArr5, 0, jArr6);
    }

    public abstract void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3);

    public abstract void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3);

    public abstract void sqr_gf2x(long[] jArr, long[] jArr2, int i10);

    private static void mul128_no_simd_gf2x(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12) {
        MUL64_NO_SIMD_GF2X(jArr, i10, jArr2[i11], jArr3[i12]);
        int i13 = i10 + 2;
        int i14 = i11 + 1;
        int i15 = i12 + 1;
        MUL64_NO_SIMD_GF2X(jArr, i13, jArr2[i14], jArr3[i15]);
        long j6 = jArr[i13];
        int i16 = i10 + 1;
        long j10 = j6 ^ jArr[i16];
        jArr[i13] = j10;
        jArr[i16] = j10 ^ jArr[i10];
        jArr[i13] = jArr[i13] ^ jArr[i10 + 3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i16, jArr2[i11] ^ jArr2[i14], jArr3[i12] ^ jArr3[i15]);
    }
}
