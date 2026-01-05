package org.bouncycastle.crypto.encodings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class OAEPEncoding implements AsymmetricBlockCipher {
    private byte[] defHash;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private Digest mgf1Hash;
    private SecureRandom random;

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this(asymmetricBlockCipher, DigestFactory.createSHA1(), null);
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i10, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        int digestSize = this.mgf1Hash.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        this.mgf1Hash.reset();
        int i13 = 0;
        while (i13 < i12 / digestSize) {
            Pack.intToBigEndian(i13, bArr4, 0);
            this.mgf1Hash.update(bArr, i10, i11);
            this.mgf1Hash.update(bArr4, 0, 4);
            this.mgf1Hash.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i13 * digestSize, digestSize);
            i13++;
        }
        int i14 = digestSize * i13;
        if (i14 < i12) {
            Pack.intToBigEndian(i13, bArr4, 0);
            this.mgf1Hash.update(bArr, i10, i11);
            this.mgf1Hash.update(bArr4, 0, 4);
            this.mgf1Hash.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i14, i12 - i14);
        }
        return bArr2;
    }

    public byte[] decodeBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i10, i11);
        int outputBlockSize = this.engine.getOutputBlockSize();
        byte[] bArr4 = new byte[outputBlockSize];
        int length = (outputBlockSize - ((this.defHash.length * 2) + 1)) >> 31;
        if (bArrProcessBlock.length <= outputBlockSize) {
            System.arraycopy(bArrProcessBlock, 0, bArr4, outputBlockSize - bArrProcessBlock.length, bArrProcessBlock.length);
        } else {
            System.arraycopy(bArrProcessBlock, 0, bArr4, 0, outputBlockSize);
            length |= 1;
        }
        byte[] bArr5 = this.defHash;
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArr4, bArr5.length, outputBlockSize - bArr5.length, bArr5.length);
        int i12 = 0;
        while (true) {
            bArr2 = this.defHash;
            if (i12 == bArr2.length) {
                break;
            }
            bArr4[i12] = (byte) (bArr4[i12] ^ bArrMaskGeneratorFunction1[i12]);
            i12++;
        }
        byte[] bArrMaskGeneratorFunction12 = maskGeneratorFunction1(bArr4, 0, bArr2.length, outputBlockSize - bArr2.length);
        for (int length2 = this.defHash.length; length2 != outputBlockSize; length2++) {
            bArr4[length2] = (byte) (bArr4[length2] ^ bArrMaskGeneratorFunction12[length2 - this.defHash.length]);
        }
        int i13 = 0;
        while (true) {
            bArr3 = this.defHash;
            if (i13 == bArr3.length) {
                break;
            }
            length |= bArr4[bArr3.length + i13] ^ bArr3[i13];
            i13++;
        }
        int i14 = -1;
        for (int length3 = bArr3.length * 2; length3 != outputBlockSize; length3++) {
            i14 += (((-(bArr4[length3] & 255)) & i14) >> 31) & length3;
        }
        if (((i14 >> 31) | length | (bArr4[i14 + 1] ^ 1)) != 0) {
            Arrays.fill(bArr4, (byte) 0);
            throw new InvalidCipherTextException("data wrong");
        }
        int i15 = i14 + 2;
        int i16 = outputBlockSize - i15;
        byte[] bArr6 = new byte[i16];
        System.arraycopy(bArr4, i15, bArr6, 0, i16);
        Arrays.fill(bArr4, (byte) 0);
        return bArr6;
    }

    public byte[] encodeBlock(byte[] bArr, int i10, int i11) {
        if (i11 > getInputBlockSize()) {
            throw new DataLengthException("input data too long");
        }
        int length = (this.defHash.length * 2) + getInputBlockSize() + 1;
        byte[] bArr2 = new byte[length];
        int i12 = length - i11;
        System.arraycopy(bArr, i10, bArr2, i12, i11);
        bArr2[i12 - 1] = 1;
        byte[] bArr3 = this.defHash;
        System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
        int length2 = this.defHash.length;
        byte[] bArr4 = new byte[length2];
        this.random.nextBytes(bArr4);
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArr4, 0, length2, length - this.defHash.length);
        for (int length3 = this.defHash.length; length3 != length; length3++) {
            bArr2[length3] = (byte) (bArr2[length3] ^ bArrMaskGeneratorFunction1[length3 - this.defHash.length]);
        }
        System.arraycopy(bArr4, 0, bArr2, 0, this.defHash.length);
        byte[] bArr5 = this.defHash;
        byte[] bArrMaskGeneratorFunction12 = maskGeneratorFunction1(bArr2, bArr5.length, length - bArr5.length, bArr5.length);
        for (int i13 = 0; i13 != this.defHash.length; i13++) {
            bArr2[i13] = (byte) (bArr2[i13] ^ bArrMaskGeneratorFunction12[i13]);
        }
        return this.engine.processBlock(bArr2, 0, length);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize - 1) - (this.defHash.length * 2) : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize - 1) - (this.defHash.length * 2);
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z6, CipherParameters cipherParameters) {
        this.random = cipherParameters instanceof ParametersWithRandom ? ((ParametersWithRandom) cipherParameters).getRandom() : CryptoServicesRegistrar.getSecureRandom();
        this.engine.init(z6, cipherParameters);
        this.forEncryption = z6;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i10, int i11) {
        return this.forEncryption ? encodeBlock(bArr, i10, i11) : decodeBlock(bArr, i10, i11);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, null);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this.engine = asymmetricBlockCipher;
        this.mgf1Hash = digest2;
        this.defHash = new byte[digest.getDigestSize()];
        digest.reset();
        if (bArr != null) {
            digest.update(bArr, 0, bArr.length);
        }
        digest.doFinal(this.defHash, 0);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr);
    }
}
