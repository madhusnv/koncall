package org.bouncycastle.pqc.legacy.math.linearalgebra;

import com.sun.mail.util.AbstractC1452a;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class GF2nONBElement extends GF2nElement {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    private long[] mPol;
    private static final long[] mBitmask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L, 1152921504606846976L, 2305843009213693952L, 4611686018427387904L, Long.MIN_VALUE};
    private static final long[] mMaxmask = {1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647L, 4294967295L, 8589934591L, 17179869183L, 34359738367L, 68719476735L, 137438953471L, 274877906943L, 549755813887L, 1099511627775L, 2199023255551L, 4398046511103L, 8796093022207L, 17592186044415L, 35184372088831L, 70368744177663L, 140737488355327L, 281474976710655L, 562949953421311L, 1125899906842623L, 2251799813685247L, 4503599627370495L, 9007199254740991L, 18014398509481983L, 36028797018963967L, 72057594037927935L, 144115188075855871L, 288230376151711743L, 576460752303423487L, 1152921504606846975L, 2305843009213693951L, 4611686018427387903L, Long.MAX_VALUE, -1};
    private static final int[] mIBY64 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

    public GF2nONBElement(GF2nONBElement gF2nONBElement) {
        GF2nField gF2nField = gF2nONBElement.mField;
        this.mField = gF2nField;
        this.mDegree = gF2nField.getDegree();
        this.mLength = ((GF2nONBField) this.mField).getONBLength();
        this.mBit = ((GF2nONBField) this.mField).getONBBit();
        this.mPol = new long[this.mLength];
        assign(gF2nONBElement.getElement());
    }

    public static GF2nONBElement ONE(GF2nONBField gF2nONBField) {
        int oNBLength = gF2nONBField.getONBLength();
        long[] jArr = new long[oNBLength];
        int i10 = 0;
        while (true) {
            int i11 = oNBLength - 1;
            if (i10 >= i11) {
                jArr[i11] = mMaxmask[gF2nONBField.getONBBit() - 1];
                return new GF2nONBElement(gF2nONBField, jArr);
            }
            jArr[i10] = -1;
            i10++;
        }
    }

    public static GF2nONBElement ZERO(GF2nONBField gF2nONBField) {
        return new GF2nONBElement(gF2nONBField, new long[gF2nONBField.getONBLength()]);
    }

    private void assign(BigInteger bigInteger) {
        assign(bigInteger.toByteArray());
    }

    private long[] getElement() {
        long[] jArr = this.mPol;
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    private long[] getElementReverseOrder() {
        long[] jArr = new long[this.mPol.length];
        int i10 = 0;
        while (true) {
            if (i10 >= this.mDegree) {
                return jArr;
            }
            if (testBit((r2 - i10) - 1)) {
                int i11 = i10 >>> 6;
                jArr[i11] = jArr[i11] | mBitmask[i10 & 63];
            }
            i10++;
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public GFElement add(GFElement gFElement) {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.addToThis(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public void addToThis(GFElement gFElement) {
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException();
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        for (int i10 = 0; i10 < this.mLength; i10++) {
            long[] jArr = this.mPol;
            jArr[i10] = jArr[i10] ^ gF2nONBElement.mPol[i10];
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void assignOne() {
        int i10 = 0;
        while (true) {
            int i11 = this.mLength;
            if (i10 >= i11 - 1) {
                this.mPol[i11 - 1] = mMaxmask[this.mBit - 1];
                return;
            } else {
                this.mPol[i10] = -1;
                i10++;
            }
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void assignZero() {
        this.mPol = new long[this.mLength];
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement, org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public Object clone() {
        return new GF2nONBElement(this);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nONBElement)) {
            return false;
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) obj;
        for (int i10 = 0; i10 < this.mLength; i10++) {
            if (this.mPol[i10] != gF2nONBElement.mPol[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public int hashCode() {
        return Arrays.hashCode(this.mPol);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement increase() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.increaseThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void increaseThis() {
        addToThis(ONE((GF2nONBField) this.mField));
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public GFElement invert() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.invertThis();
        return gF2nONBElement;
    }

    public void invertThis() {
        if (isZero()) {
            throw new ArithmeticException();
        }
        int i10 = 31;
        boolean z6 = false;
        while (!z6 && i10 >= 0) {
            if (((this.mDegree - 1) & mBitmask[i10]) != 0) {
                z6 = true;
            }
            i10--;
        }
        ZERO((GF2nONBField) this.mField);
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        int i11 = 1;
        while (i10 >= 0) {
            GF2nElement gF2nElement = (GF2nElement) gF2nONBElement.clone();
            for (int i12 = 1; i12 <= i11; i12++) {
                gF2nElement.squareThis();
            }
            gF2nONBElement.multiplyThisBy(gF2nElement);
            i11 <<= 1;
            if (((this.mDegree - 1) & mBitmask[i10]) != 0) {
                gF2nONBElement.squareThis();
                gF2nONBElement.multiplyThisBy(this);
                i11++;
            }
            i10--;
        }
        gF2nONBElement.squareThis();
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public boolean isOne() {
        int i10;
        boolean z6 = true;
        int i11 = 0;
        while (true) {
            i10 = this.mLength;
            if (i11 >= i10 - 1 || !z6) {
                break;
            }
            z6 = z6 && this.mPol[i11] == -1;
            i11++;
        }
        if (!z6) {
            return z6;
        }
        if (z6) {
            long j6 = this.mPol[i10 - 1];
            long[] jArr = mMaxmask;
            int i12 = this.mBit;
            if ((j6 & jArr[i12 - 1]) == jArr[i12 - 1]) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public boolean isZero() {
        boolean z6 = true;
        for (int i10 = 0; i10 < this.mLength && z6; i10++) {
            z6 = z6 && this.mPol[i10] == 0;
        }
        return z6;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public GFElement multiply(GFElement gFElement) {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.multiplyThisBy(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public void multiplyThisBy(GFElement gFElement) {
        char c2;
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException("The elements have different representation: not yet implemented");
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        if (equals(gFElement)) {
            squareThis();
            return;
        }
        long[] jArr = this.mPol;
        long[] jArr2 = gF2nONBElement.mPol;
        int i10 = this.mLength;
        long[] jArr3 = new long[i10];
        int[][] iArr = ((GF2nONBField) this.mField).mMult;
        int i11 = i10 - 1;
        char c10 = 1;
        int i12 = this.mBit - 1;
        long[] jArr4 = mBitmask;
        long j6 = jArr4[63];
        long j10 = jArr4[i12];
        int i13 = 0;
        while (i13 < this.mDegree) {
            int i14 = 0;
            boolean z6 = false;
            while (i14 < this.mDegree) {
                int[] iArr2 = mIBY64;
                int i15 = iArr2[i14];
                int[] iArr3 = iArr[i14];
                int i16 = iArr3[0];
                int i17 = iArr2[i16];
                int i18 = i16 & 63;
                long j11 = jArr[i15];
                long[] jArr5 = mBitmask;
                if ((j11 & jArr5[i14 & 63]) != 0) {
                    if ((jArr2[i17] & jArr5[i18]) != 0) {
                        z6 = !z6;
                    }
                    int i19 = iArr3[c10];
                    if (i19 != -1 && (jArr2[iArr2[i19]] & jArr5[i19 & 63]) != 0) {
                        z6 = !z6;
                    }
                }
                i14++;
                c10 = 1;
            }
            int i20 = mIBY64[i13];
            int i21 = i13 & 63;
            if (z6) {
                jArr3[i20] = jArr3[i20] ^ mBitmask[i21];
            }
            if (this.mLength > 1) {
                boolean z10 = (jArr[i11] & 1) == 1;
                int i22 = i10 - 2;
                int i23 = i22;
                while (i23 >= 0) {
                    long j12 = jArr[i23];
                    boolean z11 = (j12 & 1) != 0;
                    long j13 = j12 >>> 1;
                    jArr[i23] = j13;
                    if (z10) {
                        jArr[i23] = j13 ^ j6;
                    }
                    i23--;
                    z10 = z11;
                }
                long j14 = jArr[i11] >>> 1;
                jArr[i11] = j14;
                if (z10) {
                    jArr[i11] = j14 ^ j10;
                }
                boolean z12 = (jArr2[i11] & 1) == 1;
                while (i22 >= 0) {
                    long j15 = jArr2[i22];
                    boolean z13 = (j15 & 1) != 0;
                    long j16 = j15 >>> 1;
                    jArr2[i22] = j16;
                    if (z12) {
                        jArr2[i22] = j16 ^ j6;
                    }
                    i22--;
                    z12 = z13;
                }
                long j17 = jArr2[i11] >>> 1;
                jArr2[i11] = j17;
                if (z12) {
                    jArr2[i11] = j17 ^ j10;
                }
                c2 = 1;
            } else {
                long j18 = jArr[0];
                boolean z14 = (j18 & 1) == 1;
                long j19 = j18 >>> 1;
                jArr[0] = j19;
                if (z14) {
                    jArr[0] = j19 ^ j10;
                }
                long j20 = jArr2[0];
                boolean z15 = (j20 & 1) == 1;
                c2 = 1;
                long j21 = j20 >>> 1;
                jArr2[0] = j21;
                if (z15) {
                    jArr2[0] = j21 ^ j10;
                }
            }
            i13++;
            c10 = c2;
        }
        assign(jArr3);
    }

    public void reverseOrder() {
        this.mPol = getElementReverseOrder();
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement solveQuadraticEquation() {
        int i10;
        if (trace() == 1) {
            throw new RuntimeException();
        }
        long j6 = mBitmask[63];
        long[] jArr = new long[this.mLength];
        int i11 = 0;
        long j10 = 0;
        while (true) {
            i10 = this.mLength;
            if (i11 >= i10 - 1) {
                break;
            }
            for (int i12 = 1; i12 < 64; i12++) {
                long[] jArr2 = mBitmask;
                long j11 = jArr2[i12];
                long j12 = this.mPol[i11];
                if (((j11 & j12) == 0 || (j10 & jArr2[i12 - 1]) == 0) && ((j12 & j11) != 0 || (jArr2[i12 - 1] & j10) != 0)) {
                    j10 ^= j11;
                }
            }
            jArr[i11] = j10;
            long j13 = j10 & j6;
            j10 = ((j13 == 0 || (1 & this.mPol[i11 + 1]) != 1) && !(j13 == 0 && (this.mPol[i11 + 1] & 1) == 0)) ? 1L : 0L;
            i11++;
        }
        int i13 = 63 & this.mDegree;
        long j14 = this.mPol[i10 - 1];
        for (int i14 = 1; i14 < i13; i14++) {
            long[] jArr3 = mBitmask;
            long j15 = jArr3[i14];
            if (((j15 & j14) == 0 || (jArr3[i14 - 1] & j10) == 0) && ((j15 & j14) != 0 || (jArr3[i14 - 1] & j10) != 0)) {
                j10 ^= j15;
            }
        }
        jArr[this.mLength - 1] = j10;
        return new GF2nONBElement((GF2nONBField) this.mField, jArr);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement square() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement squareRoot() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareRootThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        long[] element = getElement();
        int i10 = this.mLength - 1;
        int i11 = this.mBit - 1;
        long j6 = mBitmask[63];
        boolean z6 = (element[0] & 1) != 0;
        int i12 = i10;
        while (i12 >= 0) {
            long j10 = element[i12];
            boolean z10 = (j10 & 1) != 0;
            long j11 = j10 >>> 1;
            element[i12] = j11;
            if (z6) {
                if (i12 == i10) {
                    element[i12] = j11 ^ mBitmask[i11];
                } else {
                    element[i12] = j11 ^ j6;
                }
            }
            i12--;
            z6 = z10;
        }
        assign(element);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void squareThis() {
        long[] element = getElement();
        int i10 = this.mLength - 1;
        int i11 = this.mBit;
        int i12 = i11 - 1;
        long[] jArr = mBitmask;
        long j6 = jArr[63];
        boolean z6 = (element[i10] & jArr[i12]) != 0;
        int i13 = 0;
        while (i13 < i10) {
            long j10 = element[i13];
            boolean z10 = (j10 & j6) != 0;
            long j11 = j10 << 1;
            element[i13] = j11;
            if (z6) {
                element[i13] = 1 ^ j11;
            }
            i13++;
            z6 = z10;
        }
        long j12 = element[i10];
        long[] jArr2 = mBitmask;
        boolean z11 = (jArr2[i12] & j12) != 0;
        long j13 = j12 << 1;
        element[i10] = j13;
        if (z6) {
            element[i10] = j13 ^ 1;
        }
        if (z11) {
            element[i10] = jArr2[i11] ^ element[i10];
        }
        assign(element);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public boolean testBit(int i10) {
        return i10 >= 0 && i10 <= this.mDegree && (this.mPol[i10 >>> 6] & mBitmask[i10 & 63]) != 0;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        return (this.mPol[this.mLength - 1] & mBitmask[this.mBit - 1]) != 0;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        int i10 = ((this.mDegree - 1) >> 3) + 1;
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = (i11 & 7) << 3;
            bArr[(i10 - i11) - 1] = (byte) ((this.mPol[i11 >>> 3] & (255 << i12)) >>> i12);
        }
        return bArr;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public BigInteger toFlexiBigInt() {
        return new BigInteger(1, toByteArray());
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public String toString() {
        return toString(16);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public int trace() {
        int i10 = this.mLength - 1;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            for (int i13 = 0; i13 < 64; i13++) {
                if ((this.mPol[i12] & mBitmask[i13]) != 0) {
                    i11 ^= 1;
                }
            }
        }
        int i14 = this.mBit;
        for (int i15 = 0; i15 < i14; i15++) {
            if ((this.mPol[i10] & mBitmask[i15]) != 0) {
                i11 ^= 1;
            }
        }
        return i11;
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, BigInteger bigInteger) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bigInteger);
    }

    private void assign(byte[] bArr) {
        this.mPol = new long[this.mLength];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            long[] jArr = this.mPol;
            int i11 = i10 >>> 3;
            jArr[i11] = jArr[i11] | ((bArr[(bArr.length - 1) - i10] & 255) << ((i10 & 7) << 3));
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public String toString(int i10) {
        long[] element = getElement();
        int i11 = this.mBit;
        String strM4561h = "";
        if (i10 == 2) {
            while (true) {
                i11--;
                if (i11 < 0) {
                    break;
                }
                strM4561h = (element[element.length + (-1)] & (1 << i11)) == 0 ? AbstractC1452a.m4561h(strM4561h, "0") : AbstractC1452a.m4561h(strM4561h, "1");
            }
            for (int length = element.length - 2; length >= 0; length--) {
                for (int i12 = 63; i12 >= 0; i12--) {
                    strM4561h = (element[length] & mBitmask[i12]) == 0 ? AbstractC1452a.m4561h(strM4561h, "0") : AbstractC1452a.m4561h(strM4561h, "1");
                }
            }
            return strM4561h;
        }
        if (i10 == 16) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            for (int length2 = element.length - 1; length2 >= 0; length2--) {
                StringBuilder sbM4568o = AbstractC1452a.m4568o(strM4561h);
                sbM4568o.append(cArr[((int) (element[length2] >>> 60)) & 15]);
                StringBuilder sbM4568o2 = AbstractC1452a.m4568o(sbM4568o.toString());
                sbM4568o2.append(cArr[((int) (element[length2] >>> 56)) & 15]);
                StringBuilder sbM4568o3 = AbstractC1452a.m4568o(sbM4568o2.toString());
                sbM4568o3.append(cArr[((int) (element[length2] >>> 52)) & 15]);
                StringBuilder sbM4568o4 = AbstractC1452a.m4568o(sbM4568o3.toString());
                sbM4568o4.append(cArr[((int) (element[length2] >>> 48)) & 15]);
                StringBuilder sbM4568o5 = AbstractC1452a.m4568o(sbM4568o4.toString());
                sbM4568o5.append(cArr[((int) (element[length2] >>> 44)) & 15]);
                StringBuilder sbM4568o6 = AbstractC1452a.m4568o(sbM4568o5.toString());
                sbM4568o6.append(cArr[((int) (element[length2] >>> 40)) & 15]);
                StringBuilder sbM4568o7 = AbstractC1452a.m4568o(sbM4568o6.toString());
                sbM4568o7.append(cArr[((int) (element[length2] >>> 36)) & 15]);
                StringBuilder sbM4568o8 = AbstractC1452a.m4568o(sbM4568o7.toString());
                sbM4568o8.append(cArr[((int) (element[length2] >>> 32)) & 15]);
                StringBuilder sbM4568o9 = AbstractC1452a.m4568o(sbM4568o8.toString());
                sbM4568o9.append(cArr[((int) (element[length2] >>> 28)) & 15]);
                StringBuilder sbM4568o10 = AbstractC1452a.m4568o(sbM4568o9.toString());
                sbM4568o10.append(cArr[((int) (element[length2] >>> 24)) & 15]);
                StringBuilder sbM4568o11 = AbstractC1452a.m4568o(sbM4568o10.toString());
                sbM4568o11.append(cArr[((int) (element[length2] >>> 20)) & 15]);
                StringBuilder sbM4568o12 = AbstractC1452a.m4568o(sbM4568o11.toString());
                sbM4568o12.append(cArr[((int) (element[length2] >>> 16)) & 15]);
                StringBuilder sbM4568o13 = AbstractC1452a.m4568o(sbM4568o12.toString());
                sbM4568o13.append(cArr[((int) (element[length2] >>> 12)) & 15]);
                StringBuilder sbM4568o14 = AbstractC1452a.m4568o(sbM4568o13.toString());
                sbM4568o14.append(cArr[((int) (element[length2] >>> 8)) & 15]);
                StringBuilder sbM4568o15 = AbstractC1452a.m4568o(sbM4568o14.toString());
                sbM4568o15.append(cArr[((int) (element[length2] >>> 4)) & 15]);
                StringBuilder sbM4568o16 = AbstractC1452a.m4568o(sbM4568o15.toString());
                sbM4568o16.append(cArr[((int) element[length2]) & 15]);
                strM4561h = AbstractC1452a.m4561h(sbM4568o16.toString(), " ");
            }
        }
        return strM4561h;
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, SecureRandom secureRandom) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        int i10 = this.mLength;
        long[] jArr = new long[i10];
        this.mPol = jArr;
        if (i10 <= 1) {
            jArr[0] = secureRandom.nextLong();
            long[] jArr2 = this.mPol;
            jArr2[0] = jArr2[0] >>> (64 - this.mBit);
        } else {
            for (int i11 = 0; i11 < this.mLength - 1; i11++) {
                this.mPol[i11] = secureRandom.nextLong();
            }
            this.mPol[this.mLength - 1] = secureRandom.nextLong() >>> (64 - this.mBit);
        }
    }

    private void assign(long[] jArr) {
        System.arraycopy(jArr, 0, this.mPol, 0, this.mLength);
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, byte[] bArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bArr);
    }

    private GF2nONBElement(GF2nONBField gF2nONBField, long[] jArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = jArr;
    }
}
