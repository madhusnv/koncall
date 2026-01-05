package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class G3413OFBBlockCipher extends StreamBlockCipher {

    /* renamed from: R */
    private byte[] f27713R;
    private byte[] R_init;

    /* renamed from: Y */
    private byte[] f27714Y;
    private int blockSize;
    private int byteCount;
    private BlockCipher cipher;
    private boolean initialized;

    /* renamed from: m */
    private int f27715m;

    public G3413OFBBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.initialized = false;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.cipher = blockCipher;
        this.f27714Y = new byte[blockSize];
    }

    private void generateR() {
        byte[] bArrLSB = GOST3413CipherUtil.LSB(this.f27713R, this.f27715m - this.blockSize);
        System.arraycopy(bArrLSB, 0, this.f27713R, 0, bArrLSB.length);
        System.arraycopy(this.f27714Y, 0, this.f27713R, bArrLSB.length, this.f27715m - bArrLSB.length);
    }

    private void generateY() {
        this.cipher.processBlock(GOST3413CipherUtil.MSB(this.f27713R, this.blockSize), 0, this.f27714Y, 0);
    }

    private void initArrays() {
        int i10 = this.f27715m;
        this.f27713R = new byte[i10];
        this.R_init = new byte[i10];
    }

    private void setupDefaultParams() {
        this.f27715m = this.blockSize * 2;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b10) {
        if (this.byteCount == 0) {
            generateY();
        }
        byte[] bArr = this.f27714Y;
        int i10 = this.byteCount;
        byte b11 = (byte) (b10 ^ bArr[i10]);
        int i11 = i10 + 1;
        this.byteCount = i11;
        if (i11 == getBlockSize()) {
            this.byteCount = 0;
            generateR();
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/OFB";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z6, CipherParameters cipherParameters) {
        BlockCipher blockCipher;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            if (iv2.length < this.blockSize) {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
            this.f27715m = iv2.length;
            initArrays();
            byte[] bArrClone = Arrays.clone(iv2);
            this.R_init = bArrClone;
            System.arraycopy(bArrClone, 0, this.f27713R, 0, bArrClone.length);
            if (parametersWithIV.getParameters() != null) {
                blockCipher = this.cipher;
                cipherParameters = parametersWithIV.getParameters();
                blockCipher.init(true, cipherParameters);
            }
        } else {
            setupDefaultParams();
            initArrays();
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.f27713R, 0, bArr.length);
            if (cipherParameters != null) {
                blockCipher = this.cipher;
                blockCipher.init(true, cipherParameters);
            }
        }
        this.initialized = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, this.blockSize, bArr2, i11);
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.initialized) {
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.f27713R, 0, bArr.length);
            Arrays.clear(this.f27714Y);
            this.byteCount = 0;
            this.cipher.reset();
        }
    }
}
