package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import mm.AbstractC4801l;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier;
import org.bouncycastle.crypto.modes.kgcm.Tables16kKGCMMultiplier_512;
import org.bouncycastle.crypto.modes.kgcm.Tables4kKGCMMultiplier_128;
import org.bouncycastle.crypto.modes.kgcm.Tables8kKGCMMultiplier_256;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class KGCMBlockCipher implements AEADBlockCipher {
    private static final int MIN_MAC_BITS = 64;

    /* renamed from: b */
    private long[] f27720b;
    private final int blockSize;
    private BufferedBlockCipher ctrEngine;
    private BlockCipher engine;
    private boolean forEncryption;
    private byte[] initialAssociatedText;

    /* renamed from: iv, reason: collision with root package name */
    private byte[] f44608iv;
    private byte[] macBlock;
    private KGCMMultiplier multiplier;
    private ExposedByteArrayOutputStream associatedText = new ExposedByteArrayOutputStream();
    private ExposedByteArrayOutputStream data = new ExposedByteArrayOutputStream();
    private int macSize = -1;

    public static class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public KGCMBlockCipher(BlockCipher blockCipher) {
        this.engine = blockCipher;
        this.ctrEngine = new BufferedBlockCipher(new KCTRBlockCipher(blockCipher));
        int blockSize = this.engine.getBlockSize();
        this.blockSize = blockSize;
        this.initialAssociatedText = new byte[blockSize];
        this.f44608iv = new byte[blockSize];
        this.multiplier = createDefaultMultiplier(blockSize);
        this.f27720b = new long[blockSize >>> 3];
        this.macBlock = null;
    }

    private void calculateMac(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i11;
        while (i10 < i13) {
            xorWithInput(this.f27720b, bArr, i10);
            this.multiplier.multiplyH(this.f27720b);
            i10 += this.blockSize;
        }
        long[] jArr = this.f27720b;
        jArr[0] = ((i12 & 4294967295L) << 3) ^ jArr[0];
        int i14 = this.blockSize >>> 4;
        jArr[i14] = jArr[i14] ^ ((4294967295L & i11) << 3);
        byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(jArr);
        this.macBlock = bArrLongToLittleEndian;
        this.engine.processBlock(bArrLongToLittleEndian, 0, bArrLongToLittleEndian, 0);
    }

    private static KGCMMultiplier createDefaultMultiplier(int i10) {
        if (i10 == 16) {
            return new Tables4kKGCMMultiplier_128();
        }
        if (i10 == 32) {
            return new Tables8kKGCMMultiplier_256();
        }
        if (i10 == 64) {
            return new Tables16kKGCMMultiplier_512();
        }
        throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
    }

    private void processAAD(byte[] bArr, int i10, int i11) {
        int i12 = i11 + i10;
        while (i10 < i12) {
            xorWithInput(this.f27720b, bArr, i10);
            this.multiplier.multiplyH(this.f27720b);
            i10 += this.blockSize;
        }
    }

    private static void xorWithInput(long[] jArr, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < jArr.length; i11++) {
            jArr[i11] = jArr[i11] ^ Pack.littleEndianToLong(bArr, i10);
            i10 += 8;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IOException {
        int i11;
        int iDoFinal;
        int size = this.data.size();
        if (!this.forEncryption && size < this.macSize) {
            throw new InvalidCipherTextException("data too short");
        }
        byte[] bArr2 = new byte[this.blockSize];
        this.engine.processBlock(bArr2, 0, bArr2, 0);
        long[] jArr = new long[this.blockSize >>> 3];
        Pack.littleEndianToLong(bArr2, 0, jArr);
        this.multiplier.init(jArr);
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(jArr, 0L);
        int size2 = this.associatedText.size();
        if (size2 > 0) {
            processAAD(this.associatedText.getBuffer(), 0, size2);
        }
        if (!this.forEncryption) {
            i11 = size;
            int i12 = i11 - this.macSize;
            if (bArr.length - i10 < i12) {
                throw new OutputLengthException("Output buffer too short");
            }
            calculateMac(this.data.getBuffer(), 0, i12, size2);
            int iProcessBytes = this.ctrEngine.processBytes(this.data.getBuffer(), 0, i12, bArr, i10);
            iDoFinal = this.ctrEngine.doFinal(bArr, i10 + iProcessBytes) + iProcessBytes;
        } else {
            if ((bArr.length - i10) - this.macSize < size) {
                throw new OutputLengthException("Output buffer too short");
            }
            int iProcessBytes2 = this.ctrEngine.processBytes(this.data.getBuffer(), 0, size, bArr, i10);
            i11 = size;
            iDoFinal = this.ctrEngine.doFinal(bArr, i10 + iProcessBytes2) + iProcessBytes2;
            calculateMac(bArr, i10, i11, size2);
        }
        byte[] bArr3 = this.macBlock;
        if (bArr3 == null) {
            throw new IllegalStateException("mac is not calculated");
        }
        if (this.forEncryption) {
            System.arraycopy(bArr3, 0, bArr, i10 + iDoFinal, this.macSize);
            reset();
            return iDoFinal + this.macSize;
        }
        byte[] bArr4 = new byte[this.macSize];
        byte[] buffer = this.data.getBuffer();
        int i13 = this.macSize;
        System.arraycopy(buffer, i11 - i13, bArr4, 0, i13);
        int i14 = this.macSize;
        byte[] bArr5 = new byte[i14];
        System.arraycopy(this.macBlock, 0, bArr5, 0, i14);
        if (!Arrays.constantTimeAreEqual(bArr4, bArr5)) {
            throw new InvalidCipherTextException("mac verification failed");
        }
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName() + "/KGCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        int i10 = this.macSize;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.macBlock, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        int size = this.data.size() + i10;
        if (this.forEncryption) {
            return size + this.macSize;
        }
        int i11 = this.macSize;
        if (size < i11) {
            return 0;
        }
        return size - i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z6, CipherParameters cipherParameters) throws IOException {
        KeyParameter key;
        this.forEncryption = z6;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            byte[] nonce = aEADParameters.getNonce();
            byte[] bArr = this.f44608iv;
            int length = bArr.length - nonce.length;
            Arrays.fill(bArr, (byte) 0);
            System.arraycopy(nonce, 0, this.f44608iv, length, nonce.length);
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > (this.blockSize << 3) || (macSize & 7) != 0) {
                throw new IllegalArgumentException(AbstractC4801l.m9730d(macSize, "Invalid value for MAC size: "));
            }
            this.macSize = macSize >>> 3;
            key = aEADParameters.getKey();
            byte[] bArr2 = this.initialAssociatedText;
            if (bArr2 != null) {
                processAADBytes(bArr2, 0, bArr2.length);
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Invalid parameter passed");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            byte[] bArr3 = this.f44608iv;
            int length2 = bArr3.length - iv2.length;
            Arrays.fill(bArr3, (byte) 0);
            System.arraycopy(iv2, 0, this.f44608iv, length2, iv2.length);
            this.initialAssociatedText = null;
            this.macSize = this.blockSize;
            key = (KeyParameter) parametersWithIV.getParameters();
        }
        this.macBlock = new byte[this.blockSize];
        this.ctrEngine.init(true, new ParametersWithIV(key, this.f44608iv));
        this.engine.init(true, key);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) throws IOException {
        this.associatedText.write(b10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) throws IOException {
        this.associatedText.write(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws IOException {
        this.data.write(b10);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IOException {
        if (bArr.length < i10 + i11) {
            throw new DataLengthException("input buffer too short");
        }
        this.data.write(bArr, i10, i11);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() throws IOException {
        Arrays.fill(this.f27720b, 0L);
        this.engine.reset();
        this.data.reset();
        this.associatedText.reset();
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}
