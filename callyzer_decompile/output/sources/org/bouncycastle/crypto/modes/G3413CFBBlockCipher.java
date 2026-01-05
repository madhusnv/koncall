package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class G3413CFBBlockCipher extends StreamBlockCipher {

    /* renamed from: R */
    private byte[] f27709R;
    private byte[] R_init;
    private int blockSize;
    private int byteCount;
    private BlockCipher cipher;
    private boolean forEncryption;
    private byte[] gamma;
    private byte[] inBuf;
    private boolean initialized;

    /* renamed from: m */
    private int f27710m;

    /* renamed from: s */
    private final int f27711s;

    public G3413CFBBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }

    private void initArrays() {
        int i10 = this.f27710m;
        this.f27709R = new byte[i10];
        this.R_init = new byte[i10];
    }

    private void setupDefaultParams() {
        this.f27710m = this.blockSize * 2;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b10) {
        if (this.byteCount == 0) {
            this.gamma = createGamma();
        }
        byte[] bArr = this.gamma;
        int i10 = this.byteCount;
        byte b11 = (byte) (bArr[i10] ^ b10);
        byte[] bArr2 = this.inBuf;
        int i11 = i10 + 1;
        this.byteCount = i11;
        if (this.forEncryption) {
            b10 = b11;
        }
        bArr2[i10] = b10;
        if (i11 == getBlockSize()) {
            this.byteCount = 0;
            generateR(this.inBuf);
        }
        return b11;
    }

    public byte[] createGamma() {
        byte[] bArrMSB = GOST3413CipherUtil.MSB(this.f27709R, this.blockSize);
        byte[] bArr = new byte[bArrMSB.length];
        this.cipher.processBlock(bArrMSB, 0, bArr, 0);
        return GOST3413CipherUtil.MSB(bArr, this.f27711s);
    }

    public void generateR(byte[] bArr) {
        byte[] bArrLSB = GOST3413CipherUtil.LSB(this.f27709R, this.f27710m - this.f27711s);
        System.arraycopy(bArrLSB, 0, this.f27709R, 0, bArrLSB.length);
        System.arraycopy(bArr, 0, this.f27709R, bArrLSB.length, this.f27710m - bArrLSB.length);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CFB" + (this.blockSize * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f27711s;
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
            this.f27710m = iv2.length;
            initArrays();
            byte[] bArrClone = Arrays.clone(iv2);
            this.R_init = bArrClone;
            System.arraycopy(bArrClone, 0, this.f27709R, 0, bArrClone.length);
            if (parametersWithIV.getParameters() != null) {
                blockCipher = this.cipher;
                cipherParameters = parametersWithIV.getParameters();
                blockCipher.init(true, cipherParameters);
            }
        } else {
            setupDefaultParams();
            initArrays();
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.f27709R, 0, bArr.length);
            if (cipherParameters != null) {
                blockCipher = this.cipher;
                blockCipher.init(true, cipherParameters);
            }
        }
        this.initialized = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, getBlockSize(), bArr2, i11);
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.byteCount = 0;
        Arrays.clear(this.inBuf);
        Arrays.clear(this.gamma);
        if (this.initialized) {
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.f27709R, 0, bArr.length);
            this.cipher.reset();
        }
    }

    public G3413CFBBlockCipher(BlockCipher blockCipher, int i10) {
        super(blockCipher);
        this.initialized = false;
        if (i10 < 0 || i10 > blockCipher.getBlockSize() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (blockCipher.getBlockSize() * 8));
        }
        this.blockSize = blockCipher.getBlockSize();
        this.cipher = blockCipher;
        this.f27711s = i10 / 8;
        this.inBuf = new byte[getBlockSize()];
    }
}
