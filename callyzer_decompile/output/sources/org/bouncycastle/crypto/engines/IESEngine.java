package org.bouncycastle.crypto.engines;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import mm.AbstractC4801l;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.EphemeralKeyPair;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.IESParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class IESEngine {
    private byte[] IV;

    /* renamed from: V */
    byte[] f27649V;
    BasicAgreement agree;
    BufferedBlockCipher cipher;
    boolean forEncryption;
    DerivationFunction kdf;
    private EphemeralKeyPairGenerator keyPairGenerator;
    private KeyParser keyParser;
    Mac mac;
    byte[] macBuf;
    IESParameters param;
    CipherParameters privParam;
    CipherParameters pubParam;

    public IESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac) {
        this.agree = basicAgreement;
        this.kdf = derivationFunction;
        this.mac = mac;
        this.macBuf = new byte[mac.getMacSize()];
        this.cipher = null;
    }

    private byte[] decryptBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        int iProcessBytes;
        byte[] bArr4;
        if (i11 < this.mac.getMacSize() + this.f27649V.length) {
            throw new InvalidCipherTextException("Length of input must be greater than the MAC and V combined");
        }
        if (this.cipher == null) {
            int length = (i11 - this.f27649V.length) - this.mac.getMacSize();
            byte[] bArr5 = new byte[length];
            int macKeySize = this.param.getMacKeySize() / 8;
            bArr2 = new byte[macKeySize];
            int i12 = length + macKeySize;
            byte[] bArr6 = new byte[i12];
            this.kdf.generateBytes(bArr6, 0, i12);
            if (this.f27649V.length != 0) {
                System.arraycopy(bArr6, 0, bArr2, 0, macKeySize);
                System.arraycopy(bArr6, macKeySize, bArr5, 0, length);
            } else {
                System.arraycopy(bArr6, 0, bArr5, 0, length);
                System.arraycopy(bArr6, length, bArr2, 0, macKeySize);
            }
            bArr4 = new byte[length];
            for (int i13 = 0; i13 != length; i13++) {
                bArr4[i13] = (byte) (bArr[(this.f27649V.length + i10) + i13] ^ bArr5[i13]);
            }
            bArr3 = bArr;
            iProcessBytes = 0;
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.param).getCipherKeySize() / 8;
            byte[] bArr7 = new byte[cipherKeySize];
            int macKeySize2 = this.param.getMacKeySize() / 8;
            bArr2 = new byte[macKeySize2];
            int i14 = cipherKeySize + macKeySize2;
            byte[] bArr8 = new byte[i14];
            this.kdf.generateBytes(bArr8, 0, i14);
            System.arraycopy(bArr8, 0, bArr7, 0, cipherKeySize);
            System.arraycopy(bArr8, cipherKeySize, bArr2, 0, macKeySize2);
            CipherParameters keyParameter = new KeyParameter(bArr7);
            byte[] bArr9 = this.IV;
            if (bArr9 != null) {
                keyParameter = new ParametersWithIV(keyParameter, bArr9);
            }
            this.cipher.init(false, keyParameter);
            byte[] bArr10 = new byte[this.cipher.getOutputSize((i11 - this.f27649V.length) - this.mac.getMacSize())];
            BufferedBlockCipher bufferedBlockCipher = this.cipher;
            byte[] bArr11 = this.f27649V;
            bArr3 = bArr;
            iProcessBytes = bufferedBlockCipher.processBytes(bArr3, i10 + bArr11.length, (i11 - bArr11.length) - this.mac.getMacSize(), bArr10, 0);
            bArr4 = bArr10;
        }
        byte[] encodingV = this.param.getEncodingV();
        byte[] lengthTag = this.f27649V.length != 0 ? getLengthTag(encodingV) : null;
        int i15 = i10 + i11;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, i15 - this.mac.getMacSize(), i15);
        int length2 = bArrCopyOfRange.length;
        byte[] bArr12 = new byte[length2];
        this.mac.init(new KeyParameter(bArr2));
        Mac mac = this.mac;
        byte[] bArr13 = this.f27649V;
        mac.update(bArr3, i10 + bArr13.length, (i11 - bArr13.length) - length2);
        if (encodingV != null) {
            this.mac.update(encodingV, 0, encodingV.length);
        }
        if (this.f27649V.length != 0) {
            this.mac.update(lengthTag, 0, lengthTag.length);
        }
        this.mac.doFinal(bArr12, 0);
        if (!Arrays.constantTimeAreEqual(bArrCopyOfRange, bArr12)) {
            throw new InvalidCipherTextException("invalid MAC");
        }
        BufferedBlockCipher bufferedBlockCipher2 = this.cipher;
        return bufferedBlockCipher2 == null ? bArr4 : Arrays.copyOfRange(bArr4, 0, bufferedBlockCipher2.doFinal(bArr4, iProcessBytes) + iProcessBytes);
    }

    private byte[] encryptBlock(byte[] bArr, int i10, int i11) {
        BufferedBlockCipher bufferedBlockCipher;
        CipherParameters keyParameter;
        byte[] bArr2;
        byte[] bArr3;
        if (this.cipher == null) {
            byte[] bArr4 = new byte[i11];
            int macKeySize = this.param.getMacKeySize() / 8;
            bArr2 = new byte[macKeySize];
            int i12 = i11 + macKeySize;
            byte[] bArr5 = new byte[i12];
            this.kdf.generateBytes(bArr5, 0, i12);
            if (this.f27649V.length != 0) {
                System.arraycopy(bArr5, 0, bArr2, 0, macKeySize);
                System.arraycopy(bArr5, macKeySize, bArr4, 0, i11);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, i11);
                System.arraycopy(bArr5, i11, bArr2, 0, macKeySize);
            }
            bArr3 = new byte[i11];
            for (int i13 = 0; i13 != i11; i13++) {
                bArr3[i13] = (byte) (bArr[i10 + i13] ^ bArr4[i13]);
            }
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.param).getCipherKeySize() / 8;
            byte[] bArr6 = new byte[cipherKeySize];
            int macKeySize2 = this.param.getMacKeySize() / 8;
            byte[] bArr7 = new byte[macKeySize2];
            int i14 = cipherKeySize + macKeySize2;
            byte[] bArr8 = new byte[i14];
            this.kdf.generateBytes(bArr8, 0, i14);
            System.arraycopy(bArr8, 0, bArr6, 0, cipherKeySize);
            System.arraycopy(bArr8, cipherKeySize, bArr7, 0, macKeySize2);
            if (this.IV != null) {
                bufferedBlockCipher = this.cipher;
                keyParameter = new ParametersWithIV(new KeyParameter(bArr6), this.IV);
            } else {
                bufferedBlockCipher = this.cipher;
                keyParameter = new KeyParameter(bArr6);
            }
            bufferedBlockCipher.init(true, keyParameter);
            byte[] bArr9 = new byte[this.cipher.getOutputSize(i11)];
            int iProcessBytes = this.cipher.processBytes(bArr, i10, i11, bArr9, 0);
            i11 = this.cipher.doFinal(bArr9, iProcessBytes) + iProcessBytes;
            bArr2 = bArr7;
            bArr3 = bArr9;
        }
        byte[] encodingV = this.param.getEncodingV();
        byte[] lengthTag = this.f27649V.length != 0 ? getLengthTag(encodingV) : null;
        int macSize = this.mac.getMacSize();
        byte[] bArr10 = new byte[macSize];
        this.mac.init(new KeyParameter(bArr2));
        this.mac.update(bArr3, 0, bArr3.length);
        if (encodingV != null) {
            this.mac.update(encodingV, 0, encodingV.length);
        }
        if (this.f27649V.length != 0) {
            this.mac.update(lengthTag, 0, lengthTag.length);
        }
        this.mac.doFinal(bArr10, 0);
        byte[] bArr11 = this.f27649V;
        byte[] bArr12 = new byte[bArr11.length + i11 + macSize];
        System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
        System.arraycopy(bArr3, 0, bArr12, this.f27649V.length, i11);
        System.arraycopy(bArr10, 0, bArr12, this.f27649V.length + i11, macSize);
        return bArr12;
    }

    private void extractParams(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.IV = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        } else {
            this.IV = null;
        }
        this.param = (IESParameters) cipherParameters;
    }

    public BufferedBlockCipher getCipher() {
        return this.cipher;
    }

    public byte[] getLengthTag(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            Pack.longToBigEndian(bArr.length * 8, bArr2, 0);
        }
        return bArr2;
    }

    public Mac getMac() {
        return this.mac;
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, KeyParser keyParser) {
        this.forEncryption = false;
        this.privParam = asymmetricKeyParameter;
        this.keyParser = keyParser;
        extractParams(cipherParameters);
    }

    public byte[] processBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (this.forEncryption) {
            EphemeralKeyPairGenerator ephemeralKeyPairGenerator = this.keyPairGenerator;
            if (ephemeralKeyPairGenerator != null) {
                EphemeralKeyPair ephemeralKeyPairGenerate = ephemeralKeyPairGenerator.generate();
                this.privParam = ephemeralKeyPairGenerate.getKeyPair().getPrivate();
                this.f27649V = ephemeralKeyPairGenerate.getEncodedPublicKey();
            }
        } else if (this.keyParser != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i10, i11);
            try {
                this.pubParam = this.keyParser.readKey(byteArrayInputStream);
                this.f27649V = Arrays.copyOfRange(bArr, i10, (i11 - byteArrayInputStream.available()) + i10);
            } catch (IOException e2) {
                throw new InvalidCipherTextException(AbstractC4801l.m9731e(e2, new StringBuilder("unable to recover ephemeral public key: ")), e2);
            } catch (IllegalArgumentException e10) {
                throw new InvalidCipherTextException("unable to recover ephemeral public key: " + e10.getMessage(), e10);
            }
        }
        this.agree.init(this.privParam);
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.agree.getFieldSize(), this.agree.calculateAgreement(this.pubParam));
        byte[] bArr2 = this.f27649V;
        if (bArr2.length != 0) {
            byte[] bArrConcatenate = Arrays.concatenate(bArr2, bArrAsUnsignedByteArray);
            Arrays.fill(bArrAsUnsignedByteArray, (byte) 0);
            bArrAsUnsignedByteArray = bArrConcatenate;
        }
        try {
            this.kdf.init(new KDFParameters(bArrAsUnsignedByteArray, this.param.getDerivationV()));
            byte[] bArrEncryptBlock = this.forEncryption ? encryptBlock(bArr, i10, i11) : decryptBlock(bArr, i10, i11);
            Arrays.fill(bArrAsUnsignedByteArray, (byte) 0);
            return bArrEncryptBlock;
        } catch (Throwable th2) {
            Arrays.fill(bArrAsUnsignedByteArray, (byte) 0);
            throw th2;
        }
    }

    public IESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac, BufferedBlockCipher bufferedBlockCipher) {
        this.agree = basicAgreement;
        this.kdf = derivationFunction;
        this.mac = mac;
        this.macBuf = new byte[mac.getMacSize()];
        this.cipher = bufferedBlockCipher;
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, EphemeralKeyPairGenerator ephemeralKeyPairGenerator) {
        this.forEncryption = true;
        this.pubParam = asymmetricKeyParameter;
        this.keyPairGenerator = ephemeralKeyPairGenerator;
        extractParams(cipherParameters);
    }

    public void init(boolean z6, CipherParameters cipherParameters, CipherParameters cipherParameters2, CipherParameters cipherParameters3) {
        this.forEncryption = z6;
        this.privParam = cipherParameters;
        this.pubParam = cipherParameters2;
        this.f27649V = new byte[0];
        extractParams(cipherParameters3);
    }
}
