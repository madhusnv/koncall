package org.bouncycastle.crypto.engines;

import mm.AbstractC4801l;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class SM4Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: X */
    private final int[] f27668X = new int[4];

    /* renamed from: rk, reason: collision with root package name */
    private int[] f44573rk;
    private static final byte[] Sbox = {-42, -112, -23, -2, -52, -31, 61, -73, 22, -74, 20, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, 11, 67, -19, -49, -84, 98, -28, -77, 28, -87, -55, 8, -24, -107, -128, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, 23, -70, -125, 89, 60, 25, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, 15, 75, 112, 86, -99, 53, 30, 36, 14, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, 21, -95, -32, -82, 93, -92, -101, 52, 26, 85, -83, -109, 50, 48, -11, -116, -79, -29, 29, -10, -30, 46, -126, 102, -54, 96, -64, 41, 35, -85, 13, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, 27, -81, -110, -69, -35, PSSSigner.TRAILER_IMPLICIT, 127, 17, -39, 92, 65, 31, 16, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, 18, -72, -27, -76, -80, -119, 105, -105, 74, 12, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, 24, -16, 125, -20, 58, -36, 77, 32, 121, -18, 95, 62, -41, -53, 57, 72};
    private static final int[] CK = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};
    private static final int[] FK = {-1548633402, 1453994832, 1736282519, -1301273892};

    private int F0(int[] iArr, int i10) {
        return m11216T((iArr[3] ^ (iArr[1] ^ iArr[2])) ^ i10) ^ iArr[0];
    }

    private int F1(int[] iArr, int i10) {
        return m11216T((iArr[0] ^ (iArr[2] ^ iArr[3])) ^ i10) ^ iArr[1];
    }

    private int F2(int[] iArr, int i10) {
        return m11216T((iArr[1] ^ (iArr[3] ^ iArr[0])) ^ i10) ^ iArr[2];
    }

    private int F3(int[] iArr, int i10) {
        return m11216T((iArr[2] ^ (iArr[0] ^ iArr[1])) ^ i10) ^ iArr[3];
    }

    /* renamed from: L */
    private int m11215L(int i10) {
        return rotateLeft(i10, 24) ^ (((rotateLeft(i10, 2) ^ i10) ^ rotateLeft(i10, 10)) ^ rotateLeft(i10, 18));
    }

    private int L_ap(int i10) {
        return rotateLeft(i10, 23) ^ (rotateLeft(i10, 13) ^ i10);
    }

    /* renamed from: T */
    private int m11216T(int i10) {
        return m11215L(tau(i10));
    }

    private int T_ap(int i10) {
        return L_ap(tau(i10));
    }

    private int[] expandKey(boolean z6, byte[] bArr) {
        int[] iArr = new int[32];
        int[] iArr2 = {Pack.bigEndianToInt(bArr, 0), Pack.bigEndianToInt(bArr, 4), Pack.bigEndianToInt(bArr, 8), Pack.bigEndianToInt(bArr, 12)};
        int i10 = iArr2[0];
        int[] iArr3 = FK;
        int[] iArr4 = {i10 ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        if (z6) {
            int i11 = iArr4[0];
            int i12 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr5 = CK;
            int iT_ap = i11 ^ T_ap(i12 ^ iArr5[0]);
            iArr[0] = iT_ap;
            int iT_ap2 = T_ap((iT_ap ^ (iArr4[2] ^ iArr4[3])) ^ iArr5[1]) ^ iArr4[1];
            iArr[1] = iT_ap2;
            int iT_ap3 = T_ap((iT_ap2 ^ (iArr4[3] ^ iArr[0])) ^ iArr5[2]) ^ iArr4[2];
            iArr[2] = iT_ap3;
            iArr[3] = T_ap((iT_ap3 ^ (iArr[0] ^ iArr[1])) ^ iArr5[3]) ^ iArr4[3];
            for (int i13 = 4; i13 < 32; i13++) {
                iArr[i13] = iArr[i13 - 4] ^ T_ap(((iArr[i13 - 3] ^ iArr[i13 - 2]) ^ iArr[i13 - 1]) ^ CK[i13]);
            }
        } else {
            int i14 = iArr4[0];
            int i15 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr6 = CK;
            int iT_ap4 = i14 ^ T_ap(i15 ^ iArr6[0]);
            iArr[31] = iT_ap4;
            int iT_ap5 = T_ap((iT_ap4 ^ (iArr4[2] ^ iArr4[3])) ^ iArr6[1]) ^ iArr4[1];
            iArr[30] = iT_ap5;
            int iT_ap6 = T_ap((iT_ap5 ^ (iArr4[3] ^ iArr[31])) ^ iArr6[2]) ^ iArr4[2];
            iArr[29] = iT_ap6;
            iArr[28] = T_ap((iT_ap6 ^ (iArr[31] ^ iArr[30])) ^ iArr6[3]) ^ iArr4[3];
            for (int i16 = 27; i16 >= 0; i16--) {
                iArr[i16] = iArr[i16 + 4] ^ T_ap(((iArr[i16 + 3] ^ iArr[i16 + 2]) ^ iArr[i16 + 1]) ^ CK[31 - i16]);
            }
        }
        return iArr;
    }

    private int rotateLeft(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    private int tau(int i10) {
        byte[] bArr = Sbox;
        return (bArr[i10 & 255] & 255) | ((bArr[(i10 >> 24) & 255] & 255) << 24) | ((bArr[(i10 >> 16) & 255] & 255) << 16) | ((bArr[(i10 >> 8) & 255] & 255) << 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "SM4";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z6, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(AbstractC4801l.m9736j("invalid parameter passed to SM4 init - ", cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("SM4 requires a 128 bit key");
        }
        this.f44573rk = expandKey(z6, key);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z6)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f44573rk == null) {
            throw new IllegalStateException("SM4 not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        this.f27668X[0] = Pack.bigEndianToInt(bArr, i10);
        this.f27668X[1] = Pack.bigEndianToInt(bArr, i10 + 4);
        this.f27668X[2] = Pack.bigEndianToInt(bArr, i10 + 8);
        this.f27668X[3] = Pack.bigEndianToInt(bArr, i10 + 12);
        for (int i12 = 0; i12 < 32; i12 += 4) {
            int[] iArr = this.f27668X;
            iArr[0] = F0(iArr, this.f44573rk[i12]);
            int[] iArr2 = this.f27668X;
            iArr2[1] = F1(iArr2, this.f44573rk[i12 + 1]);
            int[] iArr3 = this.f27668X;
            iArr3[2] = F2(iArr3, this.f44573rk[i12 + 2]);
            int[] iArr4 = this.f27668X;
            iArr4[3] = F3(iArr4, this.f44573rk[i12 + 3]);
        }
        Pack.intToBigEndian(this.f27668X[3], bArr2, i11);
        Pack.intToBigEndian(this.f27668X[2], bArr2, i11 + 4);
        Pack.intToBigEndian(this.f27668X[1], bArr2, i11 + 8);
        Pack.intToBigEndian(this.f27668X[0], bArr2, i11 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
