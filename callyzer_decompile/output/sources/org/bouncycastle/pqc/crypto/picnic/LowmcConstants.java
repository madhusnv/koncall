package org.bouncycastle.pqc.crypto.picnic;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Properties;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
abstract class LowmcConstants {
    protected KMatrices KMatrix;
    protected KMatrices KMatrix_full;
    protected KMatrices KMatrix_inv;
    protected KMatrices LMatrix;
    protected KMatrices LMatrix_full;
    protected KMatrices LMatrix_inv;
    protected KMatrices RConstants;
    protected KMatrices RConstants_full;
    protected int[] keyMatrices;
    protected int[] keyMatrices_full;
    protected int[] keyMatrices_inv;
    protected int[] linearMatrices;
    protected int[] linearMatrices_full;
    protected int[] linearMatrices_inv;
    protected int[] roundConstants;
    protected int[] roundConstants_full;

    private KMatricesWithPointer GET_MAT(KMatrices kMatrices, int i10) {
        KMatricesWithPointer kMatricesWithPointer = new KMatricesWithPointer(kMatrices);
        kMatricesWithPointer.setMatrixPointer(i10 * kMatricesWithPointer.getSize());
        return kMatricesWithPointer;
    }

    public static int[] ReadFromProperty(Properties properties, String str, int i10) {
        byte[] bArrDecode = Hex.decode(removeCommas(properties.getProperty(str)));
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < bArrDecode.length / 4; i11++) {
            iArr[i11] = Pack.littleEndianToInt(bArrDecode, i11 * 4);
        }
        return iArr;
    }

    public static int[] readArray(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 != i10; i11++) {
            iArr[i11] = dataInputStream.readInt();
        }
        return iArr;
    }

    private static byte[] removeCommas(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i10 = 0; i10 != str.length(); i10++) {
            if (str.charAt(i10) != ',') {
                byteArrayOutputStream.write(str.charAt(i10));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer KMatrix(org.bouncycastle.pqc.crypto.picnic.PicnicEngine r3, int r4) {
        /*
            r2 = this;
            int r0 = r3.stateSizeBits
            r1 = 128(0x80, float:1.8E-43)
            if (r0 != r1) goto Ld
        L6:
            org.bouncycastle.pqc.crypto.picnic.KMatrices r3 = r2.KMatrix
        L8:
            org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer r3 = r2.GET_MAT(r3, r4)
            return r3
        Ld:
            r1 = 129(0x81, float:1.81E-43)
            if (r0 != r1) goto L14
        L11:
            org.bouncycastle.pqc.crypto.picnic.KMatrices r3 = r2.KMatrix_full
            goto L8
        L14:
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L1e
            int r3 = r3.numRounds
            r0 = 4
            if (r3 != r0) goto L6
            goto L11
        L1e:
            r3 = 255(0xff, float:3.57E-43)
            if (r0 != r3) goto L23
            goto L11
        L23:
            r3 = 256(0x100, float:3.59E-43)
            if (r0 != r3) goto L28
            goto L6
        L28:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.picnic.LowmcConstants.KMatrix(org.bouncycastle.pqc.crypto.picnic.PicnicEngine, int):org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer");
    }

    public KMatricesWithPointer KMatrixInv(PicnicEngine picnicEngine) {
        int i10 = picnicEngine.stateSizeBits;
        if (i10 == 129 || ((i10 == 192 && picnicEngine.numRounds == 4) || i10 == 255)) {
            return GET_MAT(this.KMatrix_inv, 0);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer LMatrix(org.bouncycastle.pqc.crypto.picnic.PicnicEngine r3, int r4) {
        /*
            r2 = this;
            int r0 = r3.stateSizeBits
            r1 = 128(0x80, float:1.8E-43)
            if (r0 != r1) goto Ld
        L6:
            org.bouncycastle.pqc.crypto.picnic.KMatrices r3 = r2.LMatrix
        L8:
            org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer r3 = r2.GET_MAT(r3, r4)
            return r3
        Ld:
            r1 = 129(0x81, float:1.81E-43)
            if (r0 != r1) goto L14
        L11:
            org.bouncycastle.pqc.crypto.picnic.KMatrices r3 = r2.LMatrix_full
            goto L8
        L14:
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L1e
            int r3 = r3.numRounds
            r0 = 4
            if (r3 != r0) goto L6
            goto L11
        L1e:
            r3 = 255(0xff, float:3.57E-43)
            if (r0 != r3) goto L23
            goto L11
        L23:
            r3 = 256(0x100, float:3.59E-43)
            if (r0 != r3) goto L28
            goto L6
        L28:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.picnic.LowmcConstants.LMatrix(org.bouncycastle.pqc.crypto.picnic.PicnicEngine, int):org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer");
    }

    public KMatricesWithPointer LMatrixInv(PicnicEngine picnicEngine, int i10) {
        int i11 = picnicEngine.stateSizeBits;
        if (i11 == 129 || ((i11 == 192 && picnicEngine.numRounds == 4) || i11 == 255)) {
            return GET_MAT(this.LMatrix_inv, i10);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer RConstant(org.bouncycastle.pqc.crypto.picnic.PicnicEngine r3, int r4) {
        /*
            r2 = this;
            int r0 = r3.stateSizeBits
            r1 = 128(0x80, float:1.8E-43)
            if (r0 != r1) goto Ld
        L6:
            org.bouncycastle.pqc.crypto.picnic.KMatrices r3 = r2.RConstants
        L8:
            org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer r3 = r2.GET_MAT(r3, r4)
            return r3
        Ld:
            r1 = 129(0x81, float:1.81E-43)
            if (r0 != r1) goto L14
        L11:
            org.bouncycastle.pqc.crypto.picnic.KMatrices r3 = r2.RConstants_full
            goto L8
        L14:
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L1e
            int r3 = r3.numRounds
            r0 = 4
            if (r3 != r0) goto L6
            goto L11
        L1e:
            r3 = 255(0xff, float:3.57E-43)
            if (r0 != r3) goto L23
            goto L11
        L23:
            r3 = 256(0x100, float:3.59E-43)
            if (r0 != r3) goto L28
            goto L6
        L28:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.picnic.LowmcConstants.RConstant(org.bouncycastle.pqc.crypto.picnic.PicnicEngine, int):org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer");
    }
}
