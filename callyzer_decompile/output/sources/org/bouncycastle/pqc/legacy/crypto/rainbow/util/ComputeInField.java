package org.bouncycastle.pqc.legacy.crypto.rainbow.util;

import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public class ComputeInField {

    /* renamed from: A */
    private short[][] f28177A;

    /* renamed from: x */
    short[] f28178x;

    private void computeZerosAbove() {
        for (int length = this.f28177A.length - 1; length > 0; length--) {
            for (int i10 = length - 1; i10 >= 0; i10--) {
                short[][] sArr = this.f28177A;
                short s5 = sArr[i10][length];
                short sInvElem = GF2Field.invElem(sArr[length][length]);
                if (sInvElem == 0) {
                    throw new RuntimeException("The matrix is not invertible");
                }
                int i11 = length;
                while (true) {
                    short[][] sArr2 = this.f28177A;
                    if (i11 < sArr2.length * 2) {
                        short sMultElem = GF2Field.multElem(s5, GF2Field.multElem(sArr2[length][i11], sInvElem));
                        short[] sArr3 = this.f28177A[i10];
                        sArr3[i11] = GF2Field.addElem(sArr3[i11], sMultElem);
                        i11++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r0 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void computeZerosUnder(boolean r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L8
            short[][] r10 = r9.f28177A
            int r10 = r10.length
            int r10 = r10 * 2
            goto Ld
        L8:
            short[][] r10 = r9.f28177A
            int r10 = r10.length
            int r10 = r10 + 1
        Ld:
            r0 = 0
        Le:
            short[][] r1 = r9.f28177A
            int r1 = r1.length
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L58
            int r1 = r0 + 1
            r2 = r1
        L18:
            short[][] r3 = r9.f28177A
            int r4 = r3.length
            if (r2 >= r4) goto L56
            r4 = r3[r2]
            short r4 = r4[r0]
            r3 = r3[r0]
            short r3 = r3[r0]
            short r3 = org.bouncycastle.pqc.legacy.crypto.rainbow.util.GF2Field.invElem(r3)
            if (r3 == 0) goto L4e
            r5 = r0
        L2c:
            if (r5 >= r10) goto L4b
            short[][] r6 = r9.f28177A
            r6 = r6[r0]
            short r6 = r6[r5]
            short r6 = org.bouncycastle.pqc.legacy.crypto.rainbow.util.GF2Field.multElem(r6, r3)
            short r6 = org.bouncycastle.pqc.legacy.crypto.rainbow.util.GF2Field.multElem(r4, r6)
            short[][] r7 = r9.f28177A
            r7 = r7[r2]
            short r8 = r7[r5]
            short r6 = org.bouncycastle.pqc.legacy.crypto.rainbow.util.GF2Field.addElem(r8, r6)
            r7[r5] = r6
            int r5 = r5 + 1
            goto L2c
        L4b:
            int r2 = r2 + 1
            goto L18
        L4e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Matrix not invertible! We have to choose another one!"
            r10.<init>(r0)
            throw r10
        L56:
            r0 = r1
            goto Le
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.legacy.crypto.rainbow.util.ComputeInField.computeZerosUnder(boolean):void");
    }

    private void substitute() {
        short sInvElem = GF2Field.invElem(this.f28177A[r0.length - 1][r0.length - 1]);
        if (sInvElem == 0) {
            throw new IllegalStateException("The equation system is not solvable");
        }
        short[] sArr = this.f28178x;
        short[][] sArr2 = this.f28177A;
        sArr[sArr2.length - 1] = GF2Field.multElem(sArr2[sArr2.length - 1][sArr2.length], sInvElem);
        for (int length = this.f28177A.length - 2; length >= 0; length--) {
            short[][] sArr3 = this.f28177A;
            short sAddElem = sArr3[length][sArr3.length];
            for (int length2 = sArr3.length - 1; length2 > length; length2--) {
                sAddElem = GF2Field.addElem(sAddElem, GF2Field.multElem(this.f28177A[length][length2], this.f28178x[length2]));
            }
            short sInvElem2 = GF2Field.invElem(this.f28177A[length][length]);
            if (sInvElem2 == 0) {
                throw new IllegalStateException("Not solvable equation system");
            }
            this.f28178x[length] = GF2Field.multElem(sAddElem, sInvElem2);
        }
    }

    public short[][] addSquareMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length || sArr[0].length != sArr2[0].length) {
            throw new RuntimeException("Addition is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                sArr3[i10][i11] = GF2Field.addElem(sArr[i10][i11], sArr2[i10][i11]);
            }
        }
        return sArr3;
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        int length = sArr.length;
        short[] sArr3 = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr3[i10] = GF2Field.addElem(sArr[i10], sArr2[i10]);
        }
        return sArr3;
    }

    public short[][] inverse(short[][] sArr) {
        Class cls = Short.TYPE;
        try {
            int i10 = 0;
            this.f28177A = (short[][]) Array.newInstance((Class<?>) cls, sArr.length, sArr.length * 2);
            if (sArr.length != sArr[0].length) {
                throw new RuntimeException("The matrix is not invertible. Please choose another one!");
            }
            for (int i11 = 0; i11 < sArr.length; i11++) {
                for (int i12 = 0; i12 < sArr.length; i12++) {
                    this.f28177A[i11][i12] = sArr[i11][i12];
                }
                for (int length = sArr.length; length < sArr.length * 2; length++) {
                    this.f28177A[i11][length] = 0;
                }
                short[][] sArr2 = this.f28177A;
                sArr2[i11][sArr2.length + i11] = 1;
            }
            computeZerosUnder(true);
            int i13 = 0;
            while (true) {
                short[][] sArr3 = this.f28177A;
                if (i13 >= sArr3.length) {
                    break;
                }
                short sInvElem = GF2Field.invElem(sArr3[i13][i13]);
                int i14 = i13;
                while (true) {
                    short[][] sArr4 = this.f28177A;
                    if (i14 < sArr4.length * 2) {
                        short[] sArr5 = sArr4[i13];
                        sArr5[i14] = GF2Field.multElem(sArr5[i14], sInvElem);
                        i14++;
                    }
                }
                i13++;
            }
            computeZerosAbove();
            short[][] sArr6 = this.f28177A;
            short[][] sArr7 = (short[][]) Array.newInstance((Class<?>) cls, sArr6.length, sArr6.length);
            while (true) {
                short[][] sArr8 = this.f28177A;
                if (i10 >= sArr8.length) {
                    return sArr7;
                }
                int length2 = sArr8.length;
                while (true) {
                    short[][] sArr9 = this.f28177A;
                    if (length2 < sArr9.length * 2) {
                        sArr7[i10][length2 - sArr9.length] = sArr9[i10][length2];
                        length2++;
                    }
                }
                i10++;
            }
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multMatrix(short s5, short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr[0].length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr[0].length; i11++) {
                sArr2[i10][i11] = GF2Field.multElem(s5, sArr[i10][i11]);
            }
        }
        return sArr2;
    }

    public short[] multVect(short s5, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr2[i10] = GF2Field.multElem(s5, sArr[i10]);
        }
        return sArr2;
    }

    public short[][] multVects(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2.length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                sArr3[i10][i11] = GF2Field.multElem(sArr[i10], sArr2[i11]);
            }
        }
        return sArr3;
    }

    public short[] multiplyMatrix(short[][] sArr, short[] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[] sArr3 = new short[sArr.length];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                sArr3[i10] = GF2Field.addElem(sArr3[i10], GF2Field.multElem(sArr[i10][i11], sArr2[i11]));
            }
        }
        return sArr3;
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return null;
        }
        try {
            this.f28177A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length + 1);
            this.f28178x = new short[sArr.length];
            for (int i10 = 0; i10 < sArr.length; i10++) {
                for (int i11 = 0; i11 < sArr[0].length; i11++) {
                    this.f28177A[i10][i11] = sArr[i10][i11];
                }
            }
            for (int i12 = 0; i12 < sArr2.length; i12++) {
                short[] sArr3 = this.f28177A[i12];
                sArr3[sArr2.length] = GF2Field.addElem(sArr2[i12], sArr3[sArr2.length]);
            }
            computeZerosUnder(false);
            substitute();
            return this.f28178x;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        this.f28177A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                for (int i12 = 0; i12 < sArr2[0].length; i12++) {
                    short sMultElem = GF2Field.multElem(sArr[i10][i11], sArr2[i11][i12]);
                    short[] sArr3 = this.f28177A[i10];
                    sArr3[i12] = GF2Field.addElem(sArr3[i12], sMultElem);
                }
            }
        }
        return this.f28177A;
    }
}
