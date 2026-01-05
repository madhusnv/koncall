package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class PolyVec {
    private KyberEngine engine;
    private int kyberK;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVec() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public static void pointwiseAccountMontgomery(Poly poly, PolyVec polyVec, PolyVec polyVec2, KyberEngine kyberEngine) {
        Poly poly2 = new Poly(kyberEngine);
        Poly.baseMultMontgomery(poly, polyVec.getVectorIndex(0), polyVec2.getVectorIndex(0));
        for (int i10 = 1; i10 < kyberEngine.getKyberK(); i10++) {
            Poly.baseMultMontgomery(poly2, polyVec.getVectorIndex(i10), polyVec2.getVectorIndex(i10));
            poly.addCoeffs(poly2);
        }
        poly.reduce();
    }

    public void addPoly(PolyVec polyVec) {
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            getVectorIndex(i10).addCoeffs(polyVec.getVectorIndex(i10));
        }
    }

    public byte[] compressPolyVec() {
        conditionalSubQ();
        byte[] bArr = new byte[this.engine.getKyberPolyVecCompressedBytes()];
        char c2 = 3;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * DilithiumEngine.DilithiumPolyT1PackedBytes) {
            short[] sArr = new short[4];
            int i10 = 0;
            for (int i11 = 0; i11 < this.kyberK; i11++) {
                for (int i12 = 0; i12 < 64; i12++) {
                    for (int i13 = 0; i13 < 4; i13++) {
                        sArr[i13] = (short) ((((getVectorIndex(i11).getCoeffIndex((i12 * 4) + i13) << 10) + 1664) / KyberEngine.KyberQ) & 1023);
                    }
                    short s5 = sArr[0];
                    bArr[i10] = (byte) s5;
                    short s10 = sArr[1];
                    bArr[i10 + 1] = (byte) ((s5 >> 8) | (s10 << 2));
                    int i14 = s10 >> 6;
                    short s11 = sArr[2];
                    bArr[i10 + 2] = (byte) (i14 | (s11 << 4));
                    int i15 = s11 >> 4;
                    short s12 = sArr[3];
                    bArr[i10 + 3] = (byte) (i15 | (s12 << 6));
                    bArr[i10 + 4] = (byte) (s12 >> 2);
                    i10 += 5;
                }
            }
        } else {
            if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
                throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
            }
            short[] sArr2 = new short[8];
            int i16 = 0;
            for (int i17 = 0; i17 < this.kyberK; i17++) {
                int i18 = 0;
                while (i18 < 32) {
                    for (int i19 = 0; i19 < 8; i19++) {
                        sArr2[i19] = (short) ((((getVectorIndex(i17).getCoeffIndex((i18 * 8) + i19) << 11) + 1664) / KyberEngine.KyberQ) & 2047);
                    }
                    short s13 = sArr2[0];
                    bArr[i16] = (byte) s13;
                    short s14 = sArr2[1];
                    bArr[i16 + 1] = (byte) ((s13 >> 8) | (s14 << 3));
                    short s15 = sArr2[2];
                    bArr[i16 + 2] = (byte) ((s14 >> 5) | (s15 << 6));
                    bArr[i16 + 3] = (byte) (s15 >> 2);
                    int i20 = s15 >> 10;
                    short s16 = sArr2[c2];
                    bArr[i16 + 4] = (byte) (i20 | (s16 << 1));
                    short s17 = sArr2[4];
                    bArr[i16 + 5] = (byte) ((s16 >> 7) | (s17 << 4));
                    short s18 = sArr2[5];
                    bArr[i16 + 6] = (byte) ((s17 >> 4) | (s18 << 7));
                    bArr[i16 + 7] = (byte) (s18 >> 1);
                    int i21 = s18 >> 9;
                    short s19 = sArr2[6];
                    bArr[i16 + 8] = (byte) (i21 | (s19 << 2));
                    int i22 = s19 >> 6;
                    short s20 = sArr2[7];
                    bArr[i16 + 9] = (byte) (i22 | (s20 << 5));
                    bArr[i16 + 10] = (byte) (s20 >> 3);
                    i16 += 11;
                    i18++;
                    c2 = c2;
                }
            }
        }
        return bArr;
    }

    public void conditionalSubQ() {
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            getVectorIndex(i10).conditionalSubQ();
        }
    }

    public void decompressPolyVec(byte[] bArr) {
        int i10 = 3;
        int i11 = 6;
        short s5 = 2;
        short s10 = 4;
        short s11 = 1;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * DilithiumEngine.DilithiumPolyT1PackedBytes) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.kyberK; i13++) {
                for (int i14 = 0; i14 < 64; i14++) {
                    int i15 = bArr[i12] & 255;
                    byte b10 = bArr[i12 + 1];
                    byte b11 = bArr[i12 + 2];
                    byte b12 = bArr[i12 + 3];
                    short[] sArr = {(short) (i15 | ((short) ((b10 & 255) << 8))), (short) (((b10 & 255) >> 2) | ((short) ((b11 & 255) << 6))), (short) (((b11 & 255) >> 4) | ((short) ((b12 & 255) << 4))), (short) (((b12 & 255) >> 6) | ((short) ((bArr[i12 + 4] & 255) << 2)))};
                    i12 += 5;
                    for (int i16 = 0; i16 < 4; i16++) {
                        this.vec[i13].setCoeffIndex((i14 * 4) + i16, (short) ((((sArr[i16] & 1023) * KyberEngine.KyberQ) + 512) >> 10));
                    }
                }
            }
            return;
        }
        if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
            throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.kyberK; i18++) {
            int i19 = 0;
            while (i19 < 32) {
                int i20 = bArr[i17] & 255;
                byte b13 = bArr[i17 + 1];
                short s12 = (short) (i20 | (((short) (b13 & 255)) << 8));
                byte b14 = bArr[i17 + 2];
                short s13 = (short) (((b13 & 255) >> i10) | (((short) (b14 & 255)) << 5));
                int i21 = ((b14 & 255) >> i11) | (((short) (bArr[i17 + 3] & 255)) << s5);
                byte b15 = bArr[i17 + 4];
                int i22 = i10;
                short s14 = (short) (((short) ((b15 & 255) << 10)) | i21);
                int i23 = (b15 & 255) >> s11;
                byte b16 = bArr[i17 + 5];
                int i24 = i11;
                short s15 = (short) ((((short) (b16 & 255)) << 7) | i23);
                int i25 = (b16 & 255) >> s10;
                byte b17 = bArr[i17 + 6];
                short s16 = s5;
                short s17 = (short) ((((short) (b17 & 255)) << s10) | i25);
                int i26 = ((b17 & 255) >> 7) | (((short) (bArr[i17 + 7] & 255)) << s11);
                byte b18 = bArr[i17 + 8];
                short s18 = s10;
                short s19 = (short) (((short) ((b18 & 255) << 9)) | i26);
                int i27 = (b18 & 255) >> 2;
                byte b19 = bArr[i17 + 9];
                short s20 = s11;
                short s21 = (short) ((((short) (b19 & 255)) << 6) | i27);
                short s22 = (short) (((b19 & 255) >> 5) | (((short) (bArr[i17 + 10] & 255)) << 3));
                short[] sArr2 = new short[8];
                sArr2[0] = s12;
                sArr2[s20] = s13;
                sArr2[s16] = s14;
                sArr2[i22] = s15;
                sArr2[s18] = s17;
                sArr2[5] = s19;
                sArr2[i24] = s21;
                sArr2[7] = s22;
                i17 += 11;
                for (int i28 = 0; i28 < 8; i28++) {
                    this.vec[i18].setCoeffIndex((i19 * 8) + i28, (short) ((((sArr2[i28] & 2047) * KyberEngine.KyberQ) + 1024) >> 11));
                }
                i19++;
                i10 = i22;
                i11 = i24;
                s5 = s16;
                s10 = s18;
                s11 = s20;
            }
        }
    }

    public void fromBytes(byte[] bArr) {
        int i10 = 0;
        while (i10 < this.kyberK) {
            Poly vectorIndex = getVectorIndex(i10);
            int i11 = i10 * KyberEngine.KyberPolyBytes;
            i10++;
            vectorIndex.fromBytes(Arrays.copyOfRange(bArr, i11, i10 * KyberEngine.KyberPolyBytes));
        }
    }

    public Poly getVectorIndex(int i10) {
        return this.vec[i10];
    }

    public void polyVecInverseNttToMont() {
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            getVectorIndex(i10).polyInverseNttToMont();
        }
    }

    public void polyVecNtt() {
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            getVectorIndex(i10).polyNtt();
        }
    }

    public void reducePoly() {
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            getVectorIndex(i10).reduce();
        }
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[this.polyVecBytes];
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            System.arraycopy(this.vec[i10].toBytes(), 0, bArr, i10 * KyberEngine.KyberPolyBytes, KyberEngine.KyberPolyBytes);
        }
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            stringBuffer.append(this.vec[i10].toString());
            if (i10 != this.kyberK - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public PolyVec(KyberEngine kyberEngine) {
        this.engine = kyberEngine;
        this.kyberK = kyberEngine.getKyberK();
        this.polyVecBytes = kyberEngine.getKyberPolyVecBytes();
        this.vec = new Poly[this.kyberK];
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            this.vec[i10] = new Poly(kyberEngine);
        }
    }
}
