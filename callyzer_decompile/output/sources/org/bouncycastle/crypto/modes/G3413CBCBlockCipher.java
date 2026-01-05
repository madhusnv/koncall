package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class G3413CBCBlockCipher implements BlockCipher {

    /* renamed from: R */
    private byte[] f27707R;
    private byte[] R_init;
    private int blockSize;
    private BlockCipher cipher;
    private boolean forEncryption;
    private boolean initialized = false;

    /* renamed from: m */
    private int f27708m;

    public G3413CBCBlockCipher(BlockCipher blockCipher) {
        this.blockSize = blockCipher.getBlockSize();
        this.cipher = blockCipher;
    }

    private int decrypt(byte[] bArr, int i10, byte[] bArr2, int i11) {
        byte[] bArrMSB = GOST3413CipherUtil.MSB(this.f27707R, this.blockSize);
        byte[] bArrCopyFromInput = GOST3413CipherUtil.copyFromInput(bArr, this.blockSize, i10);
        byte[] bArr3 = new byte[bArrCopyFromInput.length];
        this.cipher.processBlock(bArrCopyFromInput, 0, bArr3, 0);
        byte[] bArrSum = GOST3413CipherUtil.sum(bArr3, bArrMSB);
        System.arraycopy(bArrSum, 0, bArr2, i11, bArrSum.length);
        if (bArr2.length > i11 + bArrSum.length) {
            generateR(bArrCopyFromInput);
        }
        return bArrSum.length;
    }

    private int encrypt(byte[] bArr, int i10, byte[] bArr2, int i11) {
        byte[] bArrSum = GOST3413CipherUtil.sum(GOST3413CipherUtil.copyFromInput(bArr, this.blockSize, i10), GOST3413CipherUtil.MSB(this.f27707R, this.blockSize));
        int length = bArrSum.length;
        byte[] bArr3 = new byte[length];
        this.cipher.processBlock(bArrSum, 0, bArr3, 0);
        System.arraycopy(bArr3, 0, bArr2, i11, length);
        if (bArr2.length > i11 + bArrSum.length) {
            generateR(bArr3);
        }
        return length;
    }

    private void generateR(byte[] bArr) {
        byte[] bArrLSB = GOST3413CipherUtil.LSB(this.f27707R, this.f27708m - this.blockSize);
        System.arraycopy(bArrLSB, 0, this.f27707R, 0, bArrLSB.length);
        System.arraycopy(bArr, 0, this.f27707R, bArrLSB.length, this.f27708m - bArrLSB.length);
    }

    private void initArrays() {
        int i10 = this.f27708m;
        this.f27707R = new byte[i10];
        this.R_init = new byte[i10];
    }

    private void setupDefaultParams() {
        this.f27708m = this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CBC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z6, CipherParameters cipherParameters) {
        BlockCipher blockCipher;
        this.forEncryption = z6;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            if (iv2.length < this.blockSize) {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
            this.f27708m = iv2.length;
            initArrays();
            byte[] bArrClone = Arrays.clone(iv2);
            this.R_init = bArrClone;
            System.arraycopy(bArrClone, 0, this.f27707R, 0, bArrClone.length);
            if (parametersWithIV.getParameters() != null) {
                blockCipher = this.cipher;
                cipherParameters = parametersWithIV.getParameters();
                blockCipher.init(z6, cipherParameters);
            }
        } else {
            setupDefaultParams();
            initArrays();
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.f27707R, 0, bArr.length);
            if (cipherParameters != null) {
                blockCipher = this.cipher;
                blockCipher.init(z6, cipherParameters);
            }
        }
        this.initialized = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        return this.forEncryption ? encrypt(bArr, i10, bArr2, i11) : decrypt(bArr, i10, bArr2, i11);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.initialized) {
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.f27707R, 0, bArr.length);
            this.cipher.reset();
        }
    }
}
