package org.bouncycastle.crypto.digests;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class GOST3411Digest implements ExtendedDigest, Memoable {
    private static final byte[] C2 = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    private static final int DIGEST_LENGTH = 32;

    /* renamed from: C */
    private byte[][] f27584C;

    /* renamed from: H */
    private byte[] f27585H;

    /* renamed from: K */
    private byte[] f27586K;

    /* renamed from: L */
    private byte[] f27587L;

    /* renamed from: M */
    private byte[] f27588M;

    /* renamed from: S */
    byte[] f27589S;
    private byte[] Sum;

    /* renamed from: U */
    byte[] f27590U;

    /* renamed from: V */
    byte[] f27591V;

    /* renamed from: W */
    byte[] f27592W;

    /* renamed from: a */
    byte[] f27593a;
    private long byteCount;
    private BlockCipher cipher;
    private final CryptoServicePurpose purpose;
    private byte[] sBox;
    short[] wS;
    short[] w_S;
    private byte[] xBuf;
    private int xBufOff;

    public GOST3411Digest() {
        this(CryptoServicePurpose.ANY);
    }

    /* renamed from: A */
    private byte[] m11188A(byte[] bArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f27593a[i10] = (byte) (bArr[i10] ^ bArr[i10 + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.f27593a, 0, bArr, 24, 8);
        return bArr;
    }

    /* renamed from: E */
    private void m11189E(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, int i11) {
        this.cipher.init(true, new KeyParameter(bArr));
        this.cipher.processBlock(bArr3, i11, bArr2, i10);
    }

    /* renamed from: P */
    private byte[] m11190P(byte[] bArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            byte[] bArr2 = this.f27586K;
            int i11 = i10 * 4;
            bArr2[i11] = bArr[i10];
            bArr2[i11 + 1] = bArr[i10 + 8];
            bArr2[i11 + 2] = bArr[i10 + 16];
            bArr2[i11 + 3] = bArr[i10 + 24];
        }
        return this.f27586K;
    }

    private void cpyBytesToShort(byte[] bArr, short[] sArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            int i11 = i10 * 2;
            sArr[i10] = (short) ((bArr[i11] & 255) | ((bArr[i11 + 1] << 8) & 65280));
        }
    }

    private void cpyShortToBytes(short[] sArr, byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            int i11 = i10 * 2;
            short s5 = sArr[i10];
            bArr[i11 + 1] = (byte) (s5 >> 8);
            bArr[i11] = (byte) s5;
        }
    }

    private void finish() {
        Pack.longToLittleEndian(this.byteCount * 8, this.f27587L, 0);
        while (this.xBufOff != 0) {
            update((byte) 0);
        }
        processBlock(this.f27587L, 0);
        processBlock(this.Sum, 0);
    }

    private void fw(byte[] bArr) {
        cpyBytesToShort(bArr, this.wS);
        short[] sArr = this.w_S;
        short[] sArr2 = this.wS;
        sArr[15] = (short) (((((sArr2[0] ^ sArr2[1]) ^ sArr2[2]) ^ sArr2[3]) ^ sArr2[12]) ^ sArr2[15]);
        System.arraycopy(sArr2, 1, sArr, 0, 15);
        cpyShortToBytes(this.w_S, bArr);
    }

    private void sumByteArray(byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.Sum;
            if (i10 == bArr2.length) {
                return;
            }
            int i12 = (bArr2[i10] & 255) + (bArr[i10] & 255) + i11;
            bArr2[i10] = (byte) i12;
            i11 = i12 >>> 8;
            i10++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new GOST3411Digest(this);
    }

    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        byte[] bArr2 = this.f27585H;
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "GOST3411";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    public void processBlock(byte[] bArr, int i10) {
        System.arraycopy(bArr, i10, this.f27588M, 0, 32);
        System.arraycopy(this.f27585H, 0, this.f27590U, 0, 32);
        System.arraycopy(this.f27588M, 0, this.f27591V, 0, 32);
        for (int i11 = 0; i11 < 32; i11++) {
            this.f27592W[i11] = (byte) (this.f27590U[i11] ^ this.f27591V[i11]);
        }
        m11189E(m11190P(this.f27592W), this.f27589S, 0, this.f27585H, 0);
        for (int i12 = 1; i12 < 4; i12++) {
            byte[] bArrM11188A = m11188A(this.f27590U);
            for (int i13 = 0; i13 < 32; i13++) {
                this.f27590U[i13] = (byte) (bArrM11188A[i13] ^ this.f27584C[i12][i13]);
            }
            this.f27591V = m11188A(m11188A(this.f27591V));
            for (int i14 = 0; i14 < 32; i14++) {
                this.f27592W[i14] = (byte) (this.f27590U[i14] ^ this.f27591V[i14]);
            }
            int i15 = i12 * 8;
            m11189E(m11190P(this.f27592W), this.f27589S, i15, this.f27585H, i15);
        }
        for (int i16 = 0; i16 < 12; i16++) {
            fw(this.f27589S);
        }
        for (int i17 = 0; i17 < 32; i17++) {
            byte[] bArr2 = this.f27589S;
            bArr2[i17] = (byte) (bArr2[i17] ^ this.f27588M[i17]);
        }
        fw(this.f27589S);
        for (int i18 = 0; i18 < 32; i18++) {
            byte[] bArr3 = this.f27589S;
            bArr3[i18] = (byte) (this.f27585H[i18] ^ bArr3[i18]);
        }
        for (int i19 = 0; i19 < 61; i19++) {
            fw(this.f27589S);
        }
        byte[] bArr4 = this.f27589S;
        byte[] bArr5 = this.f27585H;
        System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f27585H;
            if (i10 >= bArr.length) {
                break;
            }
            bArr[i10] = 0;
            i10++;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.f27587L;
            if (i11 >= bArr2.length) {
                break;
            }
            bArr2[i11] = 0;
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr3 = this.f27588M;
            if (i12 >= bArr3.length) {
                break;
            }
            bArr3[i12] = 0;
            i12++;
        }
        int i13 = 0;
        while (true) {
            byte[] bArr4 = this.f27584C[1];
            if (i13 >= bArr4.length) {
                break;
            }
            bArr4[i13] = 0;
            i13++;
        }
        int i14 = 0;
        while (true) {
            byte[] bArr5 = this.f27584C[3];
            if (i14 >= bArr5.length) {
                break;
            }
            bArr5[i14] = 0;
            i14++;
        }
        int i15 = 0;
        while (true) {
            byte[] bArr6 = this.Sum;
            if (i15 >= bArr6.length) {
                break;
            }
            bArr6[i15] = 0;
            i15++;
        }
        int i16 = 0;
        while (true) {
            byte[] bArr7 = this.xBuf;
            if (i16 >= bArr7.length) {
                byte[] bArr8 = C2;
                System.arraycopy(bArr8, 0, this.f27584C[2], 0, bArr8.length);
                return;
            } else {
                bArr7[i16] = 0;
                i16++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        byte[] bArr = this.xBuf;
        int i10 = this.xBufOff;
        int i11 = i10 + 1;
        this.xBufOff = i11;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            sumByteArray(bArr);
            processBlock(this.xBuf, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }

    public GOST3411Digest(CryptoServicePurpose cryptoServicePurpose) {
        this.f27585H = new byte[32];
        this.f27587L = new byte[32];
        this.f27588M = new byte[32];
        this.Sum = new byte[32];
        this.f27584C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.f27586K = new byte[32];
        this.f27593a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.f27589S = new byte[32];
        this.f27590U = new byte[32];
        this.f27591V = new byte[32];
        this.f27592W = new byte[32];
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        byte[] sBox = GOST28147Engine.getSBox("D-A");
        this.sBox = sBox;
        this.cipher.init(true, new ParametersWithSBox(null, sBox));
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        GOST3411Digest gOST3411Digest = (GOST3411Digest) memoable;
        byte[] bArr = gOST3411Digest.sBox;
        this.sBox = bArr;
        this.cipher.init(true, new ParametersWithSBox(null, bArr));
        reset();
        byte[] bArr2 = gOST3411Digest.f27585H;
        System.arraycopy(bArr2, 0, this.f27585H, 0, bArr2.length);
        byte[] bArr3 = gOST3411Digest.f27587L;
        System.arraycopy(bArr3, 0, this.f27587L, 0, bArr3.length);
        byte[] bArr4 = gOST3411Digest.f27588M;
        System.arraycopy(bArr4, 0, this.f27588M, 0, bArr4.length);
        byte[] bArr5 = gOST3411Digest.Sum;
        System.arraycopy(bArr5, 0, this.Sum, 0, bArr5.length);
        byte[] bArr6 = gOST3411Digest.f27584C[1];
        System.arraycopy(bArr6, 0, this.f27584C[1], 0, bArr6.length);
        byte[] bArr7 = gOST3411Digest.f27584C[2];
        System.arraycopy(bArr7, 0, this.f27584C[2], 0, bArr7.length);
        byte[] bArr8 = gOST3411Digest.f27584C[3];
        System.arraycopy(bArr8, 0, this.f27584C[3], 0, bArr8.length);
        byte[] bArr9 = gOST3411Digest.xBuf;
        System.arraycopy(bArr9, 0, this.xBuf, 0, bArr9.length);
        this.xBufOff = gOST3411Digest.xBufOff;
        this.byteCount = gOST3411Digest.byteCount;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        while (this.xBufOff != 0 && i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        while (true) {
            byte[] bArr2 = this.xBuf;
            if (i11 < bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i10, bArr2, 0, bArr2.length);
            sumByteArray(this.xBuf);
            processBlock(this.xBuf, 0);
            byte[] bArr3 = this.xBuf;
            i10 += bArr3.length;
            i11 -= bArr3.length;
            this.byteCount += bArr3.length;
        }
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }

    public GOST3411Digest(GOST3411Digest gOST3411Digest) {
        this.f27585H = new byte[32];
        this.f27587L = new byte[32];
        this.f27588M = new byte[32];
        this.Sum = new byte[32];
        this.f27584C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.f27586K = new byte[32];
        this.f27593a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.f27589S = new byte[32];
        this.f27590U = new byte[32];
        this.f27591V = new byte[32];
        this.f27592W = new byte[32];
        this.purpose = gOST3411Digest.purpose;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset(gOST3411Digest);
    }

    public GOST3411Digest(byte[] bArr) {
        this(bArr, CryptoServicePurpose.ANY);
    }

    public GOST3411Digest(byte[] bArr, CryptoServicePurpose cryptoServicePurpose) {
        this.f27585H = new byte[32];
        this.f27587L = new byte[32];
        this.f27588M = new byte[32];
        this.Sum = new byte[32];
        this.f27584C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.f27586K = new byte[32];
        this.f27593a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.f27589S = new byte[32];
        this.f27590U = new byte[32];
        this.f27591V = new byte[32];
        this.f27592W = new byte[32];
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        byte[] bArrClone = Arrays.clone(bArr);
        this.sBox = bArrClone;
        this.cipher.init(true, new ParametersWithSBox(null, bArrClone));
        reset();
    }
}
