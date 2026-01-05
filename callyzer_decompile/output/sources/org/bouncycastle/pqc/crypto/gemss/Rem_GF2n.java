package org.bouncycastle.pqc.crypto.gemss;

/* loaded from: classes3.dex */
abstract class Rem_GF2n {

    /* renamed from: ki, reason: collision with root package name */
    protected int f44683ki;
    protected int ki64;
    protected long mask;

    public static class REM192_SPECIALIZED_TRINOMIAL_GF2X extends Rem_GF2n {

        /* renamed from: k3, reason: collision with root package name */
        private final int f44684k3;
        private final int k364;
        private final int ki_k3;

        public REM192_SPECIALIZED_TRINOMIAL_GF2X(int i10, int i11, int i12, int i13, long j6) {
            this.f44684k3 = i10;
            this.f44683ki = i11;
            this.ki64 = i12;
            this.k364 = i13;
            this.mask = j6;
            this.ki_k3 = i11 - i10;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[2];
            int i11 = this.f44683ki;
            long j10 = jArr2[3];
            int i12 = this.ki64;
            long j11 = (j6 >>> i11) ^ (j10 << i12);
            long j12 = jArr2[4];
            long j13 = (j10 >>> i11) ^ (j12 << i12);
            long j14 = (j12 >>> i11) ^ (jArr2[5] << i12);
            long j15 = jArr2[1] ^ j13;
            int i13 = this.k364;
            int i14 = this.f44684k3;
            jArr[i10 + 1] = (j15 ^ (j11 >>> i13)) ^ (j13 << i14);
            jArr[i10 + 2] = (((j13 >>> i13) ^ (jArr2[2] ^ j14)) ^ (j14 << i14)) & this.mask;
            long j16 = j11 ^ (j14 >>> this.ki_k3);
            jArr[i10] = (j16 << i14) ^ (jArr2[0] ^ j16);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[2];
            int i11 = this.f44683ki;
            long j10 = jArr2[3];
            int i12 = this.ki64;
            long j11 = (j6 >>> i11) ^ (j10 << i12);
            long j12 = jArr2[4];
            long j13 = (j10 >>> i11) ^ (j12 << i12);
            long j14 = (j12 >>> i11) ^ (jArr2[5] << i12);
            int i13 = i10 + 1;
            long j15 = jArr[i13];
            long j16 = jArr2[1] ^ j13;
            int i14 = this.k364;
            int i15 = this.f44684k3;
            jArr[i13] = j15 ^ ((j16 ^ (j11 >>> i14)) ^ (j13 << i15));
            int i16 = i10 + 2;
            jArr[i16] = ((((j13 >>> i14) ^ (jArr2[2] ^ j14)) ^ (j14 << i15)) & this.mask) ^ jArr[i16];
            long j17 = j11 ^ (j14 >>> this.ki_k3);
            jArr[i10] = ((j17 << i15) ^ (jArr2[0] ^ j17)) ^ jArr[i10];
        }
    }

    public static class REM288_SPECIALIZED_TRINOMIAL_GF2X extends Rem_GF2n {

        /* renamed from: k3, reason: collision with root package name */
        private final int f44685k3;
        private final int k364;
        private final int k364ki;
        private final int k3_ki;

        public REM288_SPECIALIZED_TRINOMIAL_GF2X(int i10, int i11, int i12, int i13, long j6) {
            this.f44685k3 = i10;
            this.f44683ki = i11;
            this.ki64 = i12;
            this.k364 = i13;
            this.mask = j6;
            this.k364ki = i13 + i11;
            this.k3_ki = i10 - i11;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[5];
            int i11 = this.f44683ki;
            long j10 = jArr2[6];
            int i12 = this.ki64;
            long j11 = (j6 >>> i11) ^ (j10 << i12);
            long j12 = (j10 >>> i11) ^ (jArr2[7] << i12);
            long j13 = jArr2[2] ^ j12;
            int i13 = this.k364;
            int i14 = this.f44685k3;
            jArr[i10 + 2] = (j13 ^ (j11 >>> i13)) ^ (j12 << i14);
            long j14 = (jArr2[7] >>> i11) ^ (jArr2[8] << i12);
            jArr[i10 + 3] = ((j12 >>> i13) ^ (jArr2[3] ^ j14)) ^ (j14 << i14);
            long j15 = jArr2[8] >>> i11;
            long j16 = jArr2[4];
            long j17 = (((j16 >>> i11) ^ (jArr2[5] << i12)) ^ (j14 >>> this.k364ki)) ^ (j15 << this.k3_ki);
            long j18 = j15 << i14;
            jArr[i10 + 4] = (j18 ^ ((j14 >>> i13) ^ (j16 ^ j15))) & this.mask;
            jArr[i10] = (jArr2[0] ^ j17) ^ (j17 << i14);
            jArr[i10 + 1] = ((j11 << i14) ^ (jArr2[1] ^ j11)) ^ (j17 >>> i13);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[5];
            int i11 = this.f44683ki;
            long j10 = jArr2[6];
            int i12 = this.ki64;
            long j11 = (j6 >>> i11) ^ (j10 << i12);
            long j12 = (j10 >>> i11) ^ (jArr2[7] << i12);
            int i13 = i10 + 2;
            long j13 = jArr[i13];
            long j14 = jArr2[2] ^ j12;
            int i14 = this.k364;
            int i15 = this.f44685k3;
            jArr[i13] = j13 ^ ((j14 ^ (j11 >>> i14)) ^ (j12 << i15));
            long j15 = (jArr2[7] >>> i11) ^ (jArr2[8] << i12);
            int i16 = i10 + 3;
            jArr[i16] = (((jArr2[3] ^ j15) ^ (j12 >>> i14)) ^ (j15 << i15)) ^ jArr[i16];
            long j16 = jArr2[8] >>> i11;
            int i17 = i10 + 4;
            jArr[i17] = ((((jArr2[4] ^ j16) ^ (j15 >>> i14)) ^ (j16 << i15)) & this.mask) ^ jArr[i17];
            long j17 = (((jArr2[4] >>> i11) ^ (jArr2[5] << i12)) ^ (j15 >>> this.k364ki)) ^ (j16 << this.k3_ki);
            jArr[i10] = jArr[i10] ^ ((jArr2[0] ^ j17) ^ (j17 << i15));
            int i18 = i10 + 1;
            jArr[i18] = ((j17 >>> i14) ^ ((jArr2[1] ^ j11) ^ (j11 << i15))) ^ jArr[i18];
        }
    }

    public static class REM384_SPECIALIZED358_TRINOMIAL_GF2X extends Rem_GF2n {

        /* renamed from: k3, reason: collision with root package name */
        private final int f44686k3;
        private final int k364;
        private final int k364ki;
        private final int k3_ki;

        public REM384_SPECIALIZED358_TRINOMIAL_GF2X(int i10, int i11, int i12, int i13, long j6) {
            this.f44686k3 = i10;
            this.f44683ki = i11;
            this.ki64 = i12;
            this.k364 = i13;
            this.mask = j6;
            this.k364ki = i13 + i11;
            this.k3_ki = i10 - i11;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[6];
            int i11 = this.f44683ki;
            long j10 = jArr2[7];
            int i12 = this.ki64;
            long j11 = (j6 >>> i11) ^ (j10 << i12);
            long j12 = (j10 >>> i11) ^ (jArr2[8] << i12);
            long j13 = jArr2[2] ^ j12;
            int i13 = this.k364;
            int i14 = this.f44686k3;
            jArr[i10 + 2] = (j13 ^ (j11 >>> i13)) ^ (j12 << i14);
            long j14 = (jArr2[8] >>> i11) ^ (jArr2[9] << i12);
            jArr[i10 + 3] = ((j12 >>> i13) ^ (jArr2[3] ^ j14)) ^ (j14 << i14);
            long j15 = (jArr2[9] >>> i11) ^ (jArr2[10] << i12);
            jArr[i10 + 4] = ((j14 >>> i13) ^ (jArr2[4] ^ j15)) ^ (j15 << i14);
            long j16 = (jArr2[10] >>> i11) ^ (jArr2[11] << i12);
            long j17 = jArr2[5];
            long j18 = (((j17 >>> i11) ^ (jArr2[6] << i12)) ^ (j15 >>> this.k364ki)) ^ (j16 << this.k3_ki);
            jArr[i10 + 5] = ((j15 >>> i13) ^ (j17 ^ j16)) & this.mask;
            jArr[i10] = (jArr2[0] ^ j18) ^ (j18 << i14);
            jArr[i10 + 1] = (j11 << i14) ^ ((jArr2[1] ^ j11) ^ (j18 >>> i13));
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[6];
            int i11 = this.f44683ki;
            long j10 = jArr2[7];
            int i12 = this.ki64;
            long j11 = (j6 >>> i11) ^ (j10 << i12);
            long j12 = (j10 >>> i11) ^ (jArr2[8] << i12);
            int i13 = i10 + 2;
            long j13 = jArr[i13];
            long j14 = jArr2[2] ^ j12;
            int i14 = this.k364;
            int i15 = this.f44686k3;
            jArr[i13] = j13 ^ ((j14 ^ (j11 >>> i14)) ^ (j12 << i15));
            long j15 = (jArr2[8] >>> i11) ^ (jArr2[9] << i12);
            int i16 = i10 + 3;
            jArr[i16] = (((jArr2[3] ^ j15) ^ (j12 >>> i14)) ^ (j15 << i15)) ^ jArr[i16];
            long j16 = (jArr2[9] >>> i11) ^ (jArr2[10] << i12);
            int i17 = i10 + 4;
            jArr[i17] = (((jArr2[4] ^ j16) ^ (j15 >>> i14)) ^ (j16 << i15)) ^ jArr[i17];
            long j17 = (jArr2[10] >>> i11) ^ (jArr2[11] << i12);
            int i18 = i10 + 5;
            jArr[i18] = (((jArr2[5] ^ j17) ^ (j16 >>> i14)) & this.mask) ^ jArr[i18];
            long j18 = (((jArr2[5] >>> i11) ^ (jArr2[6] << i12)) ^ (j16 >>> this.k364ki)) ^ (j17 << this.k3_ki);
            jArr[i10] = jArr[i10] ^ ((jArr2[0] ^ j18) ^ (j18 << i15));
            int i19 = i10 + 1;
            jArr[i19] = (((j18 >>> i14) ^ (jArr2[1] ^ j11)) ^ (j11 << i15)) ^ jArr[i19];
        }
    }

    public static class REM384_SPECIALIZED_TRINOMIAL_GF2X extends Rem_GF2n {

        /* renamed from: k3, reason: collision with root package name */
        private final int f44687k3;
        private final int k364;
        private final int k364ki;
        private final int k3_ki;

        public REM384_SPECIALIZED_TRINOMIAL_GF2X(int i10, int i11, int i12, int i13, long j6) {
            this.f44687k3 = i10;
            this.f44683ki = i11;
            this.ki64 = i12;
            this.k364 = i13;
            this.mask = j6;
            this.k364ki = i13 + i11;
            this.k3_ki = i10 - i11;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[7];
            int i11 = this.f44683ki;
            long j10 = jArr2[8];
            int i12 = this.ki64;
            long j11 = (j6 >>> i11) ^ (j10 << i12);
            long j12 = jArr2[9];
            long j13 = (j10 >>> i11) ^ (j12 << i12);
            long j14 = jArr2[10];
            long j15 = (j12 >>> i11) ^ (j14 << i12);
            long j16 = (j14 >>> i11) ^ (jArr2[11] << i12);
            long j17 = jArr2[5] >>> i11;
            long j18 = jArr2[6];
            int i13 = this.k364ki;
            int i14 = this.k3_ki;
            long j19 = ((j17 ^ (j18 << i12)) ^ (j13 >>> i13)) ^ (j15 << i14);
            long j20 = (((j18 >>> i11) ^ (j6 << i12)) ^ (j15 >>> i13)) ^ (j16 << i14);
            jArr[i10] = jArr2[0] ^ j19;
            long j21 = jArr2[1] ^ j20;
            int i15 = this.f44687k3;
            jArr[i10 + 1] = j21 ^ (j19 << i15);
            long j22 = jArr2[2] ^ j11;
            int i16 = this.k364;
            jArr[i10 + 2] = (j22 ^ (j19 >>> i16)) ^ (j20 << i15);
            jArr[i10 + 3] = ((j20 >>> i16) ^ (jArr2[3] ^ j13)) ^ (j11 << i15);
            jArr[i10 + 4] = ((jArr2[4] ^ j15) ^ (j11 >>> i16)) ^ (j13 << i15);
            jArr[i10 + 5] = ((jArr2[5] ^ j16) ^ (j13 >>> i16)) & this.mask;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[7];
            int i11 = this.f44683ki;
            long j10 = jArr2[8];
            int i12 = this.ki64;
            long j11 = (j6 >>> i11) ^ (j10 << i12);
            long j12 = jArr2[9];
            long j13 = (j10 >>> i11) ^ (j12 << i12);
            long j14 = jArr2[10];
            long j15 = (j12 >>> i11) ^ (j14 << i12);
            long j16 = (j14 >>> i11) ^ (jArr2[11] << i12);
            long j17 = jArr2[5] >>> i11;
            long j18 = jArr2[6];
            int i13 = this.k364ki;
            int i14 = this.k3_ki;
            long j19 = ((j17 ^ (j18 << i12)) ^ (j13 >>> i13)) ^ (j15 << i14);
            long j20 = (((j18 >>> i11) ^ (j6 << i12)) ^ (j15 >>> i13)) ^ (j16 << i14);
            jArr[i10] = jArr[i10] ^ (jArr2[0] ^ j19);
            int i15 = i10 + 1;
            long j21 = jArr[i15];
            long j22 = jArr2[1] ^ j20;
            int i16 = this.f44687k3;
            jArr[i15] = j21 ^ (j22 ^ (j19 << i16));
            int i17 = i10 + 2;
            long j23 = jArr[i17];
            long j24 = jArr2[2] ^ j11;
            int i18 = this.k364;
            jArr[i17] = j23 ^ ((j24 ^ (j19 >>> i18)) ^ (j20 << i16));
            int i19 = i10 + 3;
            jArr[i19] = (((jArr2[3] ^ j13) ^ (j20 >>> i18)) ^ (j11 << i16)) ^ jArr[i19];
            int i20 = i10 + 4;
            jArr[i20] = jArr[i20] ^ (((j11 >>> i18) ^ (j15 ^ jArr2[4])) ^ (j13 << i16));
            int i21 = i10 + 5;
            jArr[i21] = jArr[i21] ^ (((jArr2[5] ^ j16) ^ (j13 >>> i18)) & this.mask);
        }
    }

    public static class REM384_TRINOMIAL_GF2X extends Rem_GF2n {

        /* renamed from: k3, reason: collision with root package name */
        private final int f44688k3;
        private final int k364;
        private final int ki_k3;

        public REM384_TRINOMIAL_GF2X(int i10, int i11, int i12, int i13, long j6) {
            this.f44688k3 = i10;
            this.f44683ki = i11;
            this.ki64 = i12;
            this.k364 = i13;
            this.mask = j6;
            this.ki_k3 = i11 - i10;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[5];
            int i11 = this.f44683ki;
            long j10 = jArr2[6];
            int i12 = this.ki64;
            long j11 = (j6 >>> i11) ^ (j10 << i12);
            long j12 = jArr2[7];
            long j13 = (j10 >>> i11) ^ (j12 << i12);
            long j14 = jArr2[8];
            long j15 = (j12 >>> i11) ^ (j14 << i12);
            long j16 = jArr2[9];
            long j17 = (j14 >>> i11) ^ (j16 << i12);
            long j18 = jArr2[10];
            long j19 = (j16 >>> i11) ^ (j18 << i12);
            long j20 = (j18 >>> i11) ^ (jArr2[11] << i12);
            long j21 = j11 ^ (j20 >>> this.ki_k3);
            long j22 = jArr2[0] ^ j21;
            int i13 = this.f44688k3;
            jArr[i10] = j22 ^ (j21 << i13);
            long j23 = jArr2[1] ^ j13;
            int i14 = this.k364;
            jArr[i10 + 1] = (j23 ^ (j11 >>> i14)) ^ (j13 << i13);
            jArr[i10 + 2] = ((jArr2[2] ^ j15) ^ (j13 >>> i14)) ^ (j15 << i13);
            jArr[i10 + 3] = ((jArr2[3] ^ j17) ^ (j15 >>> i14)) ^ (j17 << i13);
            jArr[i10 + 4] = ((jArr2[4] ^ j19) ^ (j17 >>> i14)) ^ (j19 << i13);
            jArr[i10 + 5] = ((j20 << i13) ^ ((jArr2[5] ^ j20) ^ (j19 >>> i14))) & this.mask;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[5];
            int i11 = this.f44683ki;
            long j10 = jArr2[6];
            int i12 = this.ki64;
            long j11 = (j6 >>> i11) ^ (j10 << i12);
            long j12 = jArr2[7];
            long j13 = (j10 >>> i11) ^ (j12 << i12);
            long j14 = jArr2[8];
            long j15 = (j12 >>> i11) ^ (j14 << i12);
            long j16 = jArr2[9];
            long j17 = (j14 >>> i11) ^ (j16 << i12);
            long j18 = jArr2[10];
            long j19 = (j16 >>> i11) ^ (j18 << i12);
            long j20 = (j18 >>> i11) ^ (jArr2[11] << i12);
            long j21 = j11 ^ (j20 >>> this.ki_k3);
            long j22 = jArr[i10];
            long j23 = jArr2[0] ^ j21;
            int i13 = this.f44688k3;
            jArr[i10] = j22 ^ (j23 ^ (j21 << i13));
            int i14 = i10 + 1;
            long j24 = jArr[i14];
            long j25 = jArr2[1] ^ j13;
            int i15 = this.k364;
            jArr[i14] = j24 ^ ((j25 ^ (j11 >>> i15)) ^ (j13 << i13));
            int i16 = i10 + 2;
            jArr[i16] = jArr[i16] ^ (((jArr2[2] ^ j15) ^ (j13 >>> i15)) ^ (j15 << i13));
            int i17 = i10 + 3;
            jArr[i17] = jArr[i17] ^ (((jArr2[3] ^ j17) ^ (j15 >>> i15)) ^ (j17 << i13));
            int i18 = i10 + 4;
            jArr[i18] = jArr[i18] ^ (((jArr2[4] ^ j19) ^ (j17 >>> i15)) ^ (j19 << i13));
            int i19 = i10 + 5;
            jArr[i19] = (((j20 << i13) ^ ((jArr2[5] ^ j20) ^ (j19 >>> i15))) & this.mask) ^ jArr[i19];
        }
    }

    public static class REM402_SPECIALIZED_TRINOMIAL_GF2X extends Rem_GF2n {

        /* renamed from: k3, reason: collision with root package name */
        private final int f44689k3;
        private final int k364;

        public REM402_SPECIALIZED_TRINOMIAL_GF2X(int i10, int i11, int i12, int i13, long j6) {
            this.f44689k3 = i10;
            this.f44683ki = i11;
            this.ki64 = i12;
            this.k364 = i13;
            this.mask = j6;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[9];
            int i11 = this.f44683ki;
            long j10 = jArr2[10];
            int i12 = this.ki64;
            long j11 = (j6 >>> i11) ^ (j10 << i12);
            long j12 = jArr2[11];
            long j13 = (j10 >>> i11) ^ (j12 << i12);
            long j14 = jArr2[12];
            long j15 = (j12 >>> i11) ^ (j14 << i12);
            long j16 = j14 >>> i11;
            long j17 = ((j11 >>> 39) ^ (j13 << 25)) ^ (jArr2[6] >>> i11);
            long j18 = jArr2[7];
            long j19 = j17 ^ (j18 << i12);
            long j20 = jArr2[8];
            long j21 = (((j13 >>> 39) ^ (j15 << 25)) ^ (j18 >>> i11)) ^ (j20 << i12);
            long j22 = (((j15 >>> 39) ^ (j16 << 25)) ^ (j20 >>> i11)) ^ (j6 << i12);
            jArr[i10] = jArr2[0] ^ j19;
            jArr[i10 + 1] = jArr2[1] ^ j21;
            long j23 = jArr2[2] ^ j22;
            int i13 = this.f44689k3;
            jArr[i10 + 2] = j23 ^ (j19 << i13);
            long j24 = jArr2[3] ^ j11;
            int i14 = this.k364;
            jArr[i10 + 3] = (j24 ^ (j19 >>> i14)) ^ (j21 << i13);
            jArr[i10 + 4] = ((j13 ^ jArr2[4]) ^ (j21 >>> i14)) ^ (j22 << i13);
            jArr[i10 + 5] = ((j22 >>> i14) ^ (jArr2[5] ^ j15)) ^ (j11 << i13);
            jArr[i10 + 6] = ((jArr2[6] ^ j16) ^ (j11 >>> i14)) & this.mask;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[9];
            int i11 = this.f44683ki;
            long j10 = jArr2[10];
            int i12 = this.ki64;
            long j11 = (j6 >>> i11) ^ (j10 << i12);
            long j12 = jArr2[11];
            long j13 = (j10 >>> i11) ^ (j12 << i12);
            long j14 = jArr2[12];
            long j15 = (j12 >>> i11) ^ (j14 << i12);
            long j16 = j14 >>> i11;
            long j17 = ((j11 >>> 39) ^ (j13 << 25)) ^ (jArr2[6] >>> i11);
            long j18 = jArr2[7];
            long j19 = j17 ^ (j18 << i12);
            long j20 = jArr2[8];
            long j21 = (((j13 >>> 39) ^ (j15 << 25)) ^ (j18 >>> i11)) ^ (j20 << i12);
            long j22 = (((j15 >>> 39) ^ (j16 << 25)) ^ (j20 >>> i11)) ^ (j6 << i12);
            jArr[i10] = jArr[i10] ^ (jArr2[0] ^ j19);
            int i13 = i10 + 1;
            jArr[i13] = jArr[i13] ^ (jArr2[1] ^ j21);
            int i14 = i10 + 2;
            long j23 = jArr[i14];
            long j24 = jArr2[2] ^ j22;
            int i15 = this.f44689k3;
            jArr[i14] = j23 ^ (j24 ^ (j19 << i15));
            int i16 = i10 + 3;
            long j25 = jArr[i16];
            long j26 = jArr2[3] ^ j11;
            int i17 = this.k364;
            jArr[i16] = j25 ^ ((j26 ^ (j19 >>> i17)) ^ (j21 << i15));
            int i18 = i10 + 4;
            jArr[i18] = (((jArr2[4] ^ j13) ^ (j21 >>> i17)) ^ (j22 << i15)) ^ jArr[i18];
            int i19 = i10 + 5;
            jArr[i19] = (((j22 >>> i17) ^ (j15 ^ jArr2[5])) ^ (j11 << i15)) ^ jArr[i19];
            int i20 = i10 + 6;
            jArr[i20] = jArr[i20] ^ (((j11 >>> i17) ^ (jArr2[6] ^ j16)) & this.mask);
        }
    }

    public static class REM544_PENTANOMIAL_GF2X extends Rem_GF2n {

        /* renamed from: k1, reason: collision with root package name */
        private final int f44690k1;
        private final int k164;

        /* renamed from: k2, reason: collision with root package name */
        private final int f44691k2;
        private final int k264;

        /* renamed from: k3, reason: collision with root package name */
        private final int f44692k3;
        private final int k364;
        private final int ki_k1;
        private final int ki_k2;
        private final int ki_k3;

        public REM544_PENTANOMIAL_GF2X(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j6) {
            this.f44690k1 = i10;
            this.f44691k2 = i11;
            this.f44692k3 = i12;
            this.f44683ki = i13;
            this.ki64 = i14;
            this.k164 = i15;
            this.k264 = i16;
            this.k364 = i17;
            this.mask = j6;
            this.ki_k3 = i13 - i12;
            this.ki_k2 = i13 - i11;
            this.ki_k1 = i13 - i10;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[16];
            int i11 = this.f44683ki;
            long j10 = j6 >>> i11;
            long j11 = jArr2[8] >>> i11;
            long j12 = jArr2[9];
            int i12 = this.ki64;
            long j13 = j11 ^ (j12 << i12);
            long j14 = (j12 >>> i11) ^ (jArr2[10] << i12);
            long j15 = jArr2[1] ^ j14;
            int i13 = this.k164;
            int i14 = this.f44690k1;
            int i15 = this.k264;
            int i16 = this.f44691k2;
            long j16 = (((j15 ^ (j13 >>> i13)) ^ (j14 << i14)) ^ (j13 >>> i15)) ^ (j14 << i16);
            int i17 = this.k364;
            long j17 = j16 ^ (j13 >>> i17);
            int i18 = this.f44692k3;
            jArr[i10 + 1] = j17 ^ (j14 << i18);
            long j18 = j13 ^ (((j10 >>> this.ki_k3) ^ (j10 >>> this.ki_k2)) ^ (j10 >>> this.ki_k1));
            jArr[i10] = (j18 << i18) ^ (((jArr2[0] ^ j18) ^ (j18 << i14)) ^ (j18 << i16));
            long j19 = (jArr2[10] >>> i11) ^ (jArr2[11] << i12);
            jArr[i10 + 2] = ((((((jArr2[2] ^ j19) ^ (j14 >>> i13)) ^ (j19 << i14)) ^ (j14 >>> i15)) ^ (j19 << i16)) ^ (j14 >>> i17)) ^ (j19 << i18);
            long j20 = (jArr2[11] >>> i11) ^ (jArr2[12] << i12);
            jArr[i10 + 3] = ((((((jArr2[3] ^ j20) ^ (j19 >>> i13)) ^ (j20 << i14)) ^ (j19 >>> i15)) ^ (j20 << i16)) ^ (j19 >>> i17)) ^ (j20 << i18);
            long j21 = (jArr2[12] >>> i11) ^ (jArr2[13] << i12);
            jArr[i10 + 4] = ((((((jArr2[4] ^ j21) ^ (j20 >>> i13)) ^ (j21 << i14)) ^ (j20 >>> i15)) ^ (j21 << i16)) ^ (j20 >>> i17)) ^ (j21 << i18);
            long j22 = (jArr2[13] >>> i11) ^ (jArr2[14] << i12);
            jArr[i10 + 5] = ((((((jArr2[5] ^ j22) ^ (j21 >>> i13)) ^ (j22 << i14)) ^ (j21 >>> i15)) ^ (j22 << i16)) ^ (j21 >>> i17)) ^ (j22 << i18);
            long j23 = (jArr2[14] >>> i11) ^ (jArr2[15] << i12);
            jArr[i10 + 6] = ((((((jArr2[6] ^ j23) ^ (j22 >>> i13)) ^ (j23 << i14)) ^ (j22 >>> i15)) ^ (j23 << i16)) ^ (j22 >>> i17)) ^ (j23 << i18);
            long j24 = (jArr2[15] >>> i11) ^ (jArr2[16] << i12);
            jArr[i10 + 7] = ((j23 >>> i17) ^ (((((jArr2[7] ^ j24) ^ (j23 >>> i13)) ^ (j24 << i14)) ^ (j23 >>> i15)) ^ (j24 << i16))) ^ (j24 << i18);
            jArr[i10 + 8] = ((j10 << i18) ^ ((((((jArr2[8] ^ j10) ^ (j24 >>> i13)) ^ (j10 << i14)) ^ (j24 >>> i15)) ^ (j10 << i16)) ^ (j24 >>> i17))) & this.mask;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[16];
            int i11 = this.f44683ki;
            long j10 = j6 >>> i11;
            long j11 = jArr2[8] >>> i11;
            long j12 = jArr2[9];
            int i12 = this.ki64;
            long j13 = j11 ^ (j12 << i12);
            long j14 = (j12 >>> i11) ^ (jArr2[10] << i12);
            int i13 = i10 + 1;
            long j15 = jArr[i13];
            long j16 = jArr2[1] ^ j14;
            int i14 = this.k164;
            int i15 = this.f44690k1;
            int i16 = this.k264;
            long j17 = ((j16 ^ (j13 >>> i14)) ^ (j14 << i15)) ^ (j13 >>> i16);
            int i17 = this.f44691k2;
            long j18 = j17 ^ (j14 << i17);
            int i18 = this.k364;
            long j19 = j18 ^ (j13 >>> i18);
            int i19 = this.f44692k3;
            jArr[i13] = j15 ^ (j19 ^ (j14 << i19));
            long j20 = j13 ^ (((j10 >>> this.ki_k3) ^ (j10 >>> this.ki_k2)) ^ (j10 >>> this.ki_k1));
            jArr[i10] = ((j20 << i19) ^ (((jArr2[0] ^ j20) ^ (j20 << i15)) ^ (j20 << i17))) ^ jArr[i10];
            long j21 = (jArr2[10] >>> i11) ^ (jArr2[11] << i12);
            int i20 = i10 + 2;
            jArr[i20] = (((((((jArr2[2] ^ j21) ^ (j14 >>> i14)) ^ (j21 << i15)) ^ (j14 >>> i16)) ^ (j21 << i17)) ^ (j14 >>> i18)) ^ (j21 << i19)) ^ jArr[i20];
            long j22 = (jArr2[11] >>> i11) ^ (jArr2[12] << i12);
            int i21 = i10 + 3;
            jArr[i21] = (((((((jArr2[3] ^ j22) ^ (j21 >>> i14)) ^ (j22 << i15)) ^ (j21 >>> i16)) ^ (j22 << i17)) ^ (j21 >>> i18)) ^ (j22 << i19)) ^ jArr[i21];
            long j23 = (jArr2[12] >>> i11) ^ (jArr2[13] << i12);
            int i22 = i10 + 4;
            jArr[i22] = (((((((jArr2[4] ^ j23) ^ (j22 >>> i14)) ^ (j23 << i15)) ^ (j22 >>> i16)) ^ (j23 << i17)) ^ (j22 >>> i18)) ^ (j23 << i19)) ^ jArr[i22];
            long j24 = (jArr2[13] >>> i11) ^ (jArr2[14] << i12);
            int i23 = i10 + 5;
            jArr[i23] = (((((((jArr2[5] ^ j24) ^ (j23 >>> i14)) ^ (j24 << i15)) ^ (j23 >>> i16)) ^ (j24 << i17)) ^ (j23 >>> i18)) ^ (j24 << i19)) ^ jArr[i23];
            long j25 = (jArr2[14] >>> i11) ^ (jArr2[15] << i12);
            int i24 = i10 + 6;
            jArr[i24] = (((((((jArr2[6] ^ j25) ^ (j24 >>> i14)) ^ (j25 << i15)) ^ (j24 >>> i16)) ^ (j25 << i17)) ^ (j24 >>> i18)) ^ (j25 << i19)) ^ jArr[i24];
            long j26 = (jArr2[15] >>> i11) ^ (jArr2[16] << i12);
            int i25 = i10 + 7;
            jArr[i25] = (((j25 >>> i18) ^ (((((jArr2[7] ^ j26) ^ (j25 >>> i14)) ^ (j26 << i15)) ^ (j25 >>> i16)) ^ (j26 << i17))) ^ (j26 << i19)) ^ jArr[i25];
            int i26 = i10 + 8;
            jArr[i26] = (((j10 << i19) ^ ((j26 >>> i18) ^ (((j26 >>> i16) ^ (((jArr2[8] ^ j10) ^ (j26 >>> i14)) ^ (j10 << i15))) ^ (j10 << i17)))) & this.mask) ^ jArr[i26];
        }
    }

    public static class REM544_PENTANOMIAL_K3_IS_128_GF2X extends Rem_GF2n {

        /* renamed from: k1, reason: collision with root package name */
        private final int f44693k1;
        private final int k164;

        /* renamed from: k2, reason: collision with root package name */
        private final int f44694k2;
        private final int k264;

        public REM544_PENTANOMIAL_K3_IS_128_GF2X(int i10, int i11, int i12, int i13, int i14, int i15, long j6) {
            this.f44693k1 = i10;
            this.f44694k2 = i11;
            this.f44683ki = i12;
            this.ki64 = i13;
            this.k164 = i14;
            this.k264 = i15;
            this.mask = j6;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[10];
            int i11 = this.f44683ki;
            long j10 = jArr2[11];
            int i12 = this.ki64;
            long j11 = (j6 >>> i11) ^ (j10 << i12);
            long j12 = jArr2[12];
            long j13 = (j10 >>> i11) ^ (j12 << i12);
            long j14 = (j12 >>> i11) ^ (jArr2[13] << i12);
            long j15 = (jArr2[4] ^ j14) ^ j11;
            int i13 = this.k164;
            int i14 = this.f44693k1;
            int i15 = this.k264;
            int i16 = this.f44694k2;
            jArr[i10 + 4] = (((j15 ^ (j13 >>> i13)) ^ (j14 << i14)) ^ (j13 >>> i15)) ^ (j14 << i16);
            long j16 = (jArr2[13] >>> i11) ^ (jArr2[14] << i12);
            jArr[i10 + 5] = (((((jArr2[5] ^ j16) ^ j13) ^ (j14 >>> i13)) ^ (j16 << i14)) ^ (j14 >>> i15)) ^ (j16 << i16);
            long j17 = (jArr2[14] >>> i11) ^ (jArr2[15] << i12);
            jArr[i10 + 6] = (((((jArr2[6] ^ j17) ^ j14) ^ (j16 >>> i13)) ^ (j17 << i14)) ^ (j16 >>> i15)) ^ (j17 << i16);
            long j18 = (jArr2[15] >>> i11) ^ (jArr2[16] << i12);
            jArr[i10 + 7] = (((((jArr2[7] ^ j18) ^ j16) ^ (j17 >>> i13)) ^ (j18 << i14)) ^ (j17 >>> i15)) ^ (j18 << i16);
            long j19 = jArr2[16] >>> i11;
            jArr[i10 + 8] = ((((((jArr2[8] ^ j19) ^ j17) ^ (j18 >>> i13)) ^ (j19 << i14)) ^ (j18 >>> i15)) ^ (j19 << i16)) & this.mask;
            long j20 = (jArr2[8] ^ j17) >>> i11;
            long j21 = jArr2[9];
            long j22 = (j20 ^ ((j21 ^ j18) << i12)) ^ (jArr2[16] >>> i15);
            long j23 = ((j21 ^ j18) >>> i11) ^ ((jArr2[10] ^ j19) << i12);
            jArr[i10] = ((jArr2[0] ^ j22) ^ (j22 << i14)) ^ (j22 << i16);
            jArr[i10 + 1] = ((((jArr2[1] ^ j23) ^ (j22 >>> i13)) ^ (j23 << i14)) ^ (j22 >>> i15)) ^ (j23 << i16);
            jArr[i10 + 2] = (((((jArr2[2] ^ j11) ^ j22) ^ (j23 >>> i13)) ^ (j11 << i14)) ^ (j23 >>> i15)) ^ (j11 << i16);
            jArr[i10 + 3] = ((j11 >>> i15) ^ (((j23 ^ (jArr2[3] ^ j13)) ^ (j11 >>> i13)) ^ (j13 << i14))) ^ (j13 << i16);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i10, long[] jArr2) {
            long j6 = jArr2[10];
            int i11 = this.f44683ki;
            long j10 = jArr2[11];
            int i12 = this.ki64;
            long j11 = (j6 >>> i11) ^ (j10 << i12);
            long j12 = jArr2[12];
            long j13 = (j10 >>> i11) ^ (j12 << i12);
            long j14 = (j12 >>> i11) ^ (jArr2[13] << i12);
            int i13 = i10 + 4;
            long j15 = jArr[i13];
            long j16 = (jArr2[4] ^ j14) ^ j11;
            int i14 = this.k164;
            int i15 = this.f44693k1;
            long j17 = (j16 ^ (j13 >>> i14)) ^ (j14 << i15);
            int i16 = this.k264;
            long j18 = j17 ^ (j13 >>> i16);
            int i17 = this.f44694k2;
            jArr[i13] = j15 ^ (j18 ^ (j14 << i17));
            long j19 = (jArr2[13] >>> i11) ^ (jArr2[14] << i12);
            int i18 = i10 + 5;
            jArr[i18] = jArr[i18] ^ ((((((jArr2[5] ^ j19) ^ j13) ^ (j14 >>> i14)) ^ (j19 << i15)) ^ (j14 >>> i16)) ^ (j19 << i17));
            long j20 = (jArr2[14] >>> i11) ^ (jArr2[15] << i12);
            int i19 = i10 + 6;
            jArr[i19] = jArr[i19] ^ ((((((jArr2[6] ^ j20) ^ j14) ^ (j19 >>> i14)) ^ (j20 << i15)) ^ (j19 >>> i16)) ^ (j20 << i17));
            long j21 = (jArr2[15] >>> i11) ^ (jArr2[16] << i12);
            int i20 = i10 + 7;
            jArr[i20] = jArr[i20] ^ ((((((jArr2[7] ^ j21) ^ j19) ^ (j20 >>> i14)) ^ (j21 << i15)) ^ (j20 >>> i16)) ^ (j21 << i17));
            long j22 = jArr2[16] >>> i11;
            int i21 = i10 + 8;
            jArr[i21] = jArr[i21] ^ (((((((jArr2[8] ^ j22) ^ j20) ^ (j21 >>> i14)) ^ (j22 << i15)) ^ (j21 >>> i16)) ^ (j22 << i17)) & this.mask);
            long j23 = (jArr2[8] ^ j20) >>> i11;
            long j24 = jArr2[9];
            long j25 = (j23 ^ ((j24 ^ j21) << i12)) ^ (jArr2[16] >>> i16);
            long j26 = ((j21 ^ j24) >>> i11) ^ ((j22 ^ jArr2[10]) << i12);
            jArr[i10] = jArr[i10] ^ (((jArr2[0] ^ j25) ^ (j25 << i15)) ^ (j25 << i17));
            int i22 = i10 + 1;
            jArr[i22] = jArr[i22] ^ (((((jArr2[1] ^ j26) ^ (j25 >>> i14)) ^ (j26 << i15)) ^ (j25 >>> i16)) ^ (j26 << i17));
            int i23 = i10 + 2;
            jArr[i23] = (((((j25 ^ (jArr2[2] ^ j11)) ^ (j26 >>> i14)) ^ (j11 << i15)) ^ (j26 >>> i16)) ^ (j11 << i17)) ^ jArr[i23];
            int i24 = i10 + 3;
            jArr[i24] = ((j13 << i17) ^ ((((j26 ^ (jArr2[3] ^ j13)) ^ (j11 >>> i14)) ^ (j13 << i15)) ^ (j11 >>> i16))) ^ jArr[i24];
        }
    }

    public abstract void rem_gf2n(long[] jArr, int i10, long[] jArr2);

    public abstract void rem_gf2n_xor(long[] jArr, int i10, long[] jArr2);
}
