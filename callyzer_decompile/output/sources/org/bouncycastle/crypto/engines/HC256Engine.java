package org.bouncycastle.crypto.engines;

import mm.AbstractC4801l;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes3.dex */
public class HC256Engine implements StreamCipher {
    private boolean initialised;

    /* renamed from: iv, reason: collision with root package name */
    private byte[] f44559iv;
    private byte[] key;

    /* renamed from: p */
    private int[] f27647p = new int[1024];

    /* renamed from: q */
    private int[] f27648q = new int[1024];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

    private byte getByte() {
        if (this.idx == 0) {
            int iStep = step();
            byte[] bArr = this.buf;
            bArr[0] = (byte) (iStep & 255);
            bArr[1] = (byte) ((iStep >> 8) & 255);
            bArr[2] = (byte) ((iStep >> 16) & 255);
            bArr[3] = (byte) ((iStep >> 24) & 255);
        }
        byte[] bArr2 = this.buf;
        int i10 = this.idx;
        byte b10 = bArr2[i10];
        this.idx = 3 & (i10 + 1);
        return b10;
    }

    private void init() {
        byte[] bArr = this.key;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (this.f44559iv.length < 16) {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (bArr.length != 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.key;
            System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
            this.key = bArr2;
        }
        byte[] bArr4 = this.f44559iv;
        if (bArr4.length < 32) {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            byte[] bArr6 = this.f44559iv;
            System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
            this.f44559iv = bArr5;
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[2560];
        for (int i10 = 0; i10 < 32; i10++) {
            int i11 = i10 >> 2;
            iArr[i11] = iArr[i11] | ((this.key[i10] & 255) << ((i10 & 3) * 8));
        }
        for (int i12 = 0; i12 < 32; i12++) {
            int i13 = (i12 >> 2) + 8;
            iArr[i13] = iArr[i13] | ((this.f44559iv[i12] & 255) << ((i12 & 3) * 8));
        }
        for (int i14 = 16; i14 < 2560; i14++) {
            int i15 = iArr[i14 - 2];
            int i16 = iArr[i14 - 15];
            iArr[i14] = ((i15 >>> 10) ^ (rotateRight(i15, 17) ^ rotateRight(i15, 19))) + iArr[i14 - 7] + ((i16 >>> 3) ^ (rotateRight(i16, 7) ^ rotateRight(i16, 18))) + iArr[i14 - 16] + i14;
        }
        System.arraycopy(iArr, 512, this.f27647p, 0, 1024);
        System.arraycopy(iArr, 1536, this.f27648q, 0, 1024);
        for (int i17 = 0; i17 < 4096; i17++) {
            step();
        }
        this.cnt = 0;
    }

    private static int rotateRight(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    private int step() {
        int i10;
        int i11;
        int i12 = this.cnt;
        int i13 = i12 & 1023;
        if (i12 < 1024) {
            int[] iArr = this.f27647p;
            int i14 = iArr[(i13 - 3) & 1023];
            int i15 = iArr[(i13 - 1023) & 1023];
            int i16 = iArr[i13];
            int iRotateRight = iArr[(i13 - 10) & 1023] + (rotateRight(i15, 23) ^ rotateRight(i14, 10));
            int[] iArr2 = this.f27648q;
            iArr[i13] = iRotateRight + iArr2[(i14 ^ i15) & 1023] + i16;
            int[] iArr3 = this.f27647p;
            int i17 = iArr3[(i13 - 12) & 1023];
            i10 = iArr2[i17 & 255] + iArr2[((i17 >> 8) & 255) + 256] + iArr2[((i17 >> 16) & 255) + 512] + iArr2[((i17 >> 24) & 255) + 768];
            i11 = iArr3[i13];
        } else {
            int[] iArr4 = this.f27648q;
            int i18 = iArr4[(i13 - 3) & 1023];
            int i19 = iArr4[(i13 - 1023) & 1023];
            int i20 = iArr4[i13];
            int iRotateRight2 = iArr4[(i13 - 10) & 1023] + (rotateRight(i19, 23) ^ rotateRight(i18, 10));
            int[] iArr5 = this.f27647p;
            iArr4[i13] = iRotateRight2 + iArr5[(i18 ^ i19) & 1023] + i20;
            int[] iArr6 = this.f27648q;
            int i21 = iArr6[(i13 - 12) & 1023];
            i10 = iArr5[i21 & 255] + iArr5[((i21 >> 8) & 255) + 256] + iArr5[((i21 >> 16) & 255) + 512] + iArr5[((i21 >> 24) & 255) + 768];
            i11 = iArr6[i13];
        }
        int i22 = i11 ^ i10;
        this.cnt = (this.cnt + 1) & 2047;
        return i22;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-256";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2[i12 + i13] = (byte) (bArr[i10 + i13] ^ getByte());
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        init();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b10) {
        return (byte) (b10 ^ getByte());
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z6, CipherParameters cipherParameters) {
        CipherParameters parameters;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f44559iv = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        } else {
            this.f44559iv = new byte[0];
            parameters = cipherParameters;
        }
        if (!(parameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(AbstractC4801l.m9736j("Invalid parameter passed to HC256 init - ", cipherParameters));
        }
        this.key = ((KeyParameter) parameters).getKey();
        init();
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), this.key.length * 8, cipherParameters, Utils.getPurpose(z6)));
        this.initialised = true;
    }
}
