package org.bouncycastle.pqc.crypto.saber;

/* loaded from: classes3.dex */
class Utils {
    private final int SABER_EP;
    private final int SABER_ET;
    private final int SABER_KEYBYTES;
    private final int SABER_L;
    private final int SABER_N;
    private final int SABER_POLYBYTES;
    private final boolean usingEffectiveMasking;

    public Utils(SABEREngine sABEREngine) {
        this.SABER_N = sABEREngine.getSABER_N();
        this.SABER_L = sABEREngine.getSABER_L();
        this.SABER_ET = sABEREngine.getSABER_ET();
        this.SABER_POLYBYTES = sABEREngine.getSABER_POLYBYTES();
        this.SABER_EP = sABEREngine.getSABER_EP();
        this.SABER_KEYBYTES = sABEREngine.getSABER_KEYBYTES();
        this.usingEffectiveMasking = sABEREngine.usingEffectiveMasking;
    }

    private void BS2POLq(byte[] bArr, int i10, short[] sArr) {
        short s5 = 0;
        if (this.usingEffectiveMasking) {
            while (s5 < this.SABER_N / 2) {
                short s10 = (short) (s5 * 2);
                int i11 = ((short) (s5 * 3)) + i10;
                int i12 = bArr[i11] & 255;
                byte b10 = bArr[i11 + 1];
                sArr[s10] = (short) (i12 | ((b10 & 15) << 8));
                sArr[s10 + 1] = (short) (((bArr[i11 + 2] & 255) << 4) | ((b10 >> 4) & 15));
                s5 = (short) (s5 + 1);
            }
            return;
        }
        while (s5 < this.SABER_N / 8) {
            short s11 = (short) (s5 * 8);
            int i13 = ((short) (s5 * 13)) + i10;
            int i14 = bArr[i13] & 255;
            byte b11 = bArr[i13 + 1];
            sArr[s11] = (short) (i14 | ((b11 & 31) << 8));
            int i15 = ((b11 >> 5) & 7) | ((bArr[i13 + 2] & 255) << 3);
            byte b12 = bArr[i13 + 3];
            sArr[s11 + 1] = (short) (i15 | ((b12 & 3) << 11));
            int i16 = (b12 >> 2) & 63;
            byte b13 = bArr[i13 + 4];
            sArr[s11 + 2] = (short) (i16 | ((b13 & 127) << 6));
            int i17 = ((b13 >> 7) & 1) | ((bArr[i13 + 5] & 255) << 1);
            byte b14 = bArr[i13 + 6];
            sArr[s11 + 3] = (short) (i17 | ((b14 & 15) << 9));
            int i18 = ((b14 >> 4) & 15) | ((bArr[i13 + 7] & 255) << 4);
            byte b15 = bArr[i13 + 8];
            sArr[s11 + 4] = (short) (i18 | ((b15 & 1) << 12));
            int i19 = (b15 >> 1) & 127;
            byte b16 = bArr[i13 + 9];
            sArr[s11 + 5] = (short) (i19 | ((b16 & 63) << 7));
            int i20 = ((b16 >> 6) & 3) | ((bArr[i13 + 10] & 255) << 2);
            byte b17 = bArr[i13 + 11];
            sArr[s11 + 6] = (short) (i20 | ((b17 & 7) << 10));
            sArr[s11 + 7] = (short) (((bArr[i13 + 12] & 255) << 5) | ((b17 >> 3) & 31));
            s5 = (short) (s5 + 1);
        }
    }

    private void POLp2BS(byte[] bArr, int i10, short[] sArr) {
        for (short s5 = 0; s5 < this.SABER_N / 4; s5 = (short) (s5 + 1)) {
            short s10 = (short) (s5 * 4);
            int i11 = ((short) (s5 * 5)) + i10;
            short s11 = sArr[s10];
            bArr[i11] = (byte) (s11 & 255);
            short s12 = sArr[s10 + 1];
            bArr[i11 + 1] = (byte) (((s11 >> 8) & 3) | ((s12 & 63) << 2));
            int i12 = (s12 >> 6) & 15;
            short s13 = sArr[s10 + 2];
            bArr[i11 + 2] = (byte) (i12 | ((s13 & 15) << 4));
            short s14 = sArr[s10 + 3];
            bArr[i11 + 3] = (byte) (((s13 >> 4) & 63) | ((s14 & 3) << 6));
            bArr[i11 + 4] = (byte) ((s14 >> 2) & 255);
        }
    }

    private void POLq2BS(byte[] bArr, int i10, short[] sArr) {
        short s5 = 0;
        if (this.usingEffectiveMasking) {
            while (s5 < this.SABER_N / 2) {
                short s10 = (short) (s5 * 2);
                int i11 = ((short) (s5 * 3)) + i10;
                short s11 = sArr[s10];
                bArr[i11] = (byte) (s11 & 255);
                short s12 = sArr[s10 + 1];
                bArr[i11 + 1] = (byte) (((s11 >> 8) & 15) | ((s12 & 15) << 4));
                bArr[i11 + 2] = (byte) ((s12 >> 4) & 255);
                s5 = (short) (s5 + 1);
            }
            return;
        }
        while (s5 < this.SABER_N / 8) {
            short s13 = (short) (s5 * 8);
            int i12 = ((short) (s5 * 13)) + i10;
            short s14 = sArr[s13];
            bArr[i12] = (byte) (s14 & 255);
            short s15 = sArr[s13 + 1];
            bArr[i12 + 1] = (byte) (((s14 >> 8) & 31) | ((s15 & 7) << 5));
            bArr[i12 + 2] = (byte) ((s15 >> 3) & 255);
            int i13 = (s15 >> 11) & 3;
            short s16 = sArr[s13 + 2];
            bArr[i12 + 3] = (byte) (i13 | ((s16 & 63) << 2));
            int i14 = (s16 >> 6) & 127;
            short s17 = sArr[s13 + 3];
            bArr[i12 + 4] = (byte) (i14 | ((s17 & 1) << 7));
            bArr[i12 + 5] = (byte) ((s17 >> 1) & 255);
            int i15 = (s17 >> 9) & 15;
            short s18 = sArr[s13 + 4];
            bArr[i12 + 6] = (byte) (i15 | ((s18 & 15) << 4));
            bArr[i12 + 7] = (byte) ((s18 >> 4) & 255);
            int i16 = (s18 >> 12) & 1;
            short s19 = sArr[s13 + 5];
            bArr[i12 + 8] = (byte) (i16 | ((s19 & 127) << 1));
            int i17 = (s19 >> 7) & 63;
            short s20 = sArr[s13 + 6];
            bArr[i12 + 9] = (byte) (i17 | ((s20 & 3) << 6));
            bArr[i12 + 10] = (byte) ((s20 >> 2) & 255);
            short s21 = sArr[s13 + 7];
            bArr[i12 + 11] = (byte) (((s20 >> 10) & 7) | ((s21 & 31) << 3));
            bArr[i12 + 12] = (byte) ((s21 >> 5) & 255);
            s5 = (short) (s5 + 1);
        }
    }

    public void BS2POLT(byte[] bArr, int i10, short[] sArr) {
        int i11 = this.SABER_ET;
        short s5 = 0;
        if (i11 == 3) {
            while (s5 < this.SABER_N / 8) {
                short s10 = (short) (s5 * 8);
                int i12 = ((short) (s5 * 3)) + i10;
                byte b10 = bArr[i12];
                sArr[s10] = (short) (b10 & 7);
                sArr[s10 + 1] = (short) ((b10 >> 3) & 7);
                byte b11 = bArr[i12 + 1];
                sArr[s10 + 2] = (short) (((b10 >> 6) & 3) | ((b11 & 1) << 2));
                sArr[s10 + 3] = (short) ((b11 >> 1) & 7);
                sArr[s10 + 4] = (short) ((b11 >> 4) & 7);
                byte b12 = bArr[i12 + 2];
                sArr[s10 + 5] = (short) (((b11 >> 7) & 1) | ((b12 & 3) << 1));
                sArr[s10 + 6] = (short) ((b12 >> 2) & 7);
                sArr[s10 + 7] = (short) ((b12 >> 5) & 7);
                s5 = (short) (s5 + 1);
            }
            return;
        }
        if (i11 == 4) {
            while (s5 < this.SABER_N / 2) {
                short s11 = (short) (s5 * 2);
                byte b13 = bArr[i10 + s5];
                sArr[s11] = (short) (b13 & 15);
                sArr[s11 + 1] = (short) ((b13 >> 4) & 15);
                s5 = (short) (s5 + 1);
            }
            return;
        }
        if (i11 == 6) {
            while (s5 < this.SABER_N / 4) {
                short s12 = (short) (s5 * 4);
                int i13 = ((short) (s5 * 3)) + i10;
                byte b14 = bArr[i13];
                sArr[s12] = (short) (b14 & 63);
                byte b15 = bArr[i13 + 1];
                sArr[s12 + 1] = (short) (((b14 >> 6) & 3) | ((b15 & 15) << 2));
                byte b16 = bArr[i13 + 2];
                sArr[s12 + 2] = (short) (((b15 & 255) >> 4) | ((b16 & 3) << 4));
                sArr[s12 + 3] = (short) ((b16 & 255) >> 2);
                s5 = (short) (s5 + 1);
            }
        }
    }

    public void BS2POLVECp(byte[] bArr, short[][] sArr) {
        for (byte b10 = 0; b10 < this.SABER_L; b10 = (byte) (b10 + 1)) {
            BS2POLp(bArr, ((this.SABER_EP * this.SABER_N) / 8) * b10, sArr[b10]);
        }
    }

    public void BS2POLVECq(byte[] bArr, int i10, short[][] sArr) {
        for (byte b10 = 0; b10 < this.SABER_L; b10 = (byte) (b10 + 1)) {
            BS2POLq(bArr, (this.SABER_POLYBYTES * b10) + i10, sArr[b10]);
        }
    }

    public void BS2POLmsg(byte[] bArr, short[] sArr) {
        for (byte b10 = 0; b10 < this.SABER_KEYBYTES; b10 = (byte) (b10 + 1)) {
            for (byte b11 = 0; b11 < 8; b11 = (byte) (b11 + 1)) {
                sArr[(b10 * 8) + b11] = (short) ((bArr[b10] >> b11) & 1);
            }
        }
    }

    public void BS2POLp(byte[] bArr, int i10, short[] sArr) {
        for (short s5 = 0; s5 < this.SABER_N / 4; s5 = (short) (s5 + 1)) {
            short s10 = (short) (s5 * 4);
            int i11 = ((short) (s5 * 5)) + i10;
            int i12 = bArr[i11] & 255;
            byte b10 = bArr[i11 + 1];
            sArr[s10] = (short) (i12 | ((b10 & 3) << 8));
            byte b11 = bArr[i11 + 2];
            sArr[s10 + 1] = (short) (((b10 >> 2) & 63) | ((b11 & 15) << 6));
            int i13 = (b11 >> 4) & 15;
            byte b12 = bArr[i11 + 3];
            sArr[s10 + 2] = (short) (i13 | ((b12 & 63) << 4));
            sArr[s10 + 3] = (short) (((bArr[i11 + 4] & 255) << 2) | ((b12 >> 6) & 3));
        }
    }

    public void POLT2BS(byte[] bArr, int i10, short[] sArr) {
        int i11 = this.SABER_ET;
        short s5 = 0;
        if (i11 == 3) {
            while (s5 < this.SABER_N / 8) {
                short s10 = (short) (s5 * 8);
                int i12 = ((short) (s5 * 3)) + i10;
                int i13 = (sArr[s10] & 7) | ((sArr[s10 + 1] & 7) << 3);
                short s11 = sArr[s10 + 2];
                bArr[i12] = (byte) (i13 | ((s11 & 3) << 6));
                int i14 = ((s11 >> 2) & 1) | ((sArr[s10 + 3] & 7) << 1) | ((sArr[s10 + 4] & 7) << 4);
                short s12 = sArr[s10 + 5];
                bArr[i12 + 1] = (byte) (i14 | ((s12 & 1) << 7));
                bArr[i12 + 2] = (byte) (((sArr[s10 + 7] & 7) << 5) | ((s12 >> 1) & 3) | ((sArr[s10 + 6] & 7) << 2));
                s5 = (short) (s5 + 1);
            }
            return;
        }
        if (i11 == 4) {
            while (s5 < this.SABER_N / 2) {
                short s13 = (short) (s5 * 2);
                bArr[i10 + s5] = (byte) (((sArr[s13 + 1] & 15) << 4) | (sArr[s13] & 15));
                s5 = (short) (s5 + 1);
            }
            return;
        }
        if (i11 == 6) {
            while (s5 < this.SABER_N / 4) {
                short s14 = (short) (s5 * 4);
                int i15 = ((short) (s5 * 3)) + i10;
                int i16 = sArr[s14] & 63;
                short s15 = sArr[s14 + 1];
                bArr[i15] = (byte) (i16 | ((s15 & 3) << 6));
                short s16 = sArr[s14 + 2];
                bArr[i15 + 1] = (byte) (((s15 >> 2) & 15) | ((s16 & 15) << 4));
                bArr[i15 + 2] = (byte) (((sArr[s14 + 3] & 63) << 2) | ((s16 >> 4) & 3));
                s5 = (short) (s5 + 1);
            }
        }
    }

    public void POLVECp2BS(byte[] bArr, short[][] sArr) {
        for (byte b10 = 0; b10 < this.SABER_L; b10 = (byte) (b10 + 1)) {
            POLp2BS(bArr, ((this.SABER_EP * this.SABER_N) / 8) * b10, sArr[b10]);
        }
    }

    public void POLVECq2BS(byte[] bArr, short[][] sArr) {
        for (byte b10 = 0; b10 < this.SABER_L; b10 = (byte) (b10 + 1)) {
            POLq2BS(bArr, this.SABER_POLYBYTES * b10, sArr[b10]);
        }
    }

    public void POLmsg2BS(byte[] bArr, short[] sArr) {
        for (byte b10 = 0; b10 < this.SABER_KEYBYTES; b10 = (byte) (b10 + 1)) {
            for (byte b11 = 0; b11 < 8; b11 = (byte) (b11 + 1)) {
                bArr[b10] = (byte) (bArr[b10] | ((sArr[(b10 * 8) + b11] & 1) << b11));
            }
        }
    }
}
