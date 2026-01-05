package org.bouncycastle.pqc.jcajce.provider.hqc;

import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.jcajce.spec.KEMParameterSpec;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.pqc.crypto.hqc.HQCKEMExtractor;
import org.bouncycastle.pqc.crypto.hqc.HQCKEMGenerator;
import org.bouncycastle.pqc.crypto.hqc.HQCParameters;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.bouncycastle.pqc.jcajce.provider.util.WrapUtil;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
class HQCCipherSpi extends CipherSpi {
    private final String algorithmName;
    private AlgorithmParameters engineParams;
    private HQCParameters hqcParameters;
    private HQCKEMGenerator kemGen;
    private KTSParameterSpec kemParameterSpec;
    private BCHQCPrivateKey unwrapKey;
    private BCHQCPublicKey wrapKey;

    public static class Base extends HQCCipherSpi {
        public Base() {
            super("HQC");
        }
    }

    public static class HQC128 extends HQCCipherSpi {
        public HQC128() {
            super(HQCParameters.hqc128);
        }
    }

    public static class HQC192 extends HQCCipherSpi {
        public HQC192() {
            super(HQCParameters.hqc192);
        }
    }

    public static class HQC256 extends HQCCipherSpi {
        public HQC256() {
            super(HQCParameters.hqc256);
        }
    }

    public HQCCipherSpi(String str) {
        this.algorithmName = str;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return NewHope.SENDB_BYTES;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() throws NoSuchAlgorithmException, InvalidParameterSpecException, NoSuchProviderException {
        if (this.engineParams == null) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.algorithmName, "BCPQC");
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.kemParameterSpec);
            } catch (Exception e2) {
                throw Exceptions.illegalStateException(e2.toString(), e2);
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidParameterSpecException, InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(KEMParameterSpec.class);
            } catch (Exception unused) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        } else {
            parameterSpec = null;
        }
        engineInit(i10, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(m0.m7378k("Cannot support mode ", str));
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(AbstractC5601a.m11238i("Padding ", str, " unknown"));
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i10) throws NoSuchAlgorithmException, InvalidKeyException {
        if (i10 != 3) {
            throw new InvalidKeyException("only SECRET_KEY supported");
        }
        try {
            HQCKEMExtractor hQCKEMExtractor = new HQCKEMExtractor(this.unwrapKey.getKeyParams());
            byte[] bArrExtractSecret = hQCKEMExtractor.extractSecret(Arrays.copyOfRange(bArr, 0, hQCKEMExtractor.getEncapsulationLength()));
            Wrapper wrapper = WrapUtil.getWrapper(this.kemParameterSpec.getKeyAlgorithmName());
            KeyParameter keyParameter = new KeyParameter(bArrExtractSecret);
            Arrays.clear(bArrExtractSecret);
            wrapper.init(false, keyParameter);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, hQCKEMExtractor.getEncapsulationLength(), bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(wrapper.unwrap(bArrCopyOfRange, 0, bArrCopyOfRange.length), str);
            Arrays.clear(keyParameter.getKey());
            return secretKeySpec;
        } catch (IllegalArgumentException e2) {
            throw new NoSuchAlgorithmException("unable to extract KTS secret: " + e2.getMessage());
        } catch (InvalidCipherTextException e10) {
            throw new InvalidKeyException("unable to extract KTS secret: " + e10.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws DestroyFailedException, IllegalBlockSizeException, InvalidKeyException {
        if (key.getEncoded() == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            SecretWithEncapsulation secretWithEncapsulationGenerateEncapsulated = this.kemGen.generateEncapsulated(this.wrapKey.getKeyParams());
            Wrapper wrapper = WrapUtil.getWrapper(this.kemParameterSpec.getKeyAlgorithmName());
            wrapper.init(true, new KeyParameter(secretWithEncapsulationGenerateEncapsulated.getSecret()));
            byte[] encapsulation = secretWithEncapsulationGenerateEncapsulated.getEncapsulation();
            secretWithEncapsulationGenerateEncapsulated.destroy();
            byte[] encoded = key.getEncoded();
            byte[] bArrConcatenate = Arrays.concatenate(encapsulation, wrapper.wrap(encoded, 0, encoded.length));
            Arrays.clear(encoded);
            return bArrConcatenate;
        } catch (IllegalArgumentException e2) {
            throw new IllegalBlockSizeException("unable to generate KTS secret: " + e2.getMessage());
        } catch (DestroyFailedException e10) {
            throw new IllegalBlockSizeException("unable to destroy interim values: " + e10.getMessage());
        }
    }

    public HQCCipherSpi(HQCParameters hQCParameters) {
        this.hqcParameters = hQCParameters;
        this.algorithmName = Strings.toUpperCase(hQCParameters.getName());
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e2) {
            throw Exceptions.illegalArgumentException(e2.getMessage(), e2);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i10, int i11) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        KTSParameterSpec kEMParameterSpec;
        if (algorithmParameterSpec == null) {
            kEMParameterSpec = new KEMParameterSpec("AES-KWP");
        } else {
            if (!(algorithmParameterSpec instanceof KTSParameterSpec)) {
                throw new InvalidAlgorithmParameterException(AbstractC1452a.m4564k(new StringBuilder(), this.algorithmName, " can only accept KTSParameterSpec"));
            }
            kEMParameterSpec = (KTSParameterSpec) algorithmParameterSpec;
        }
        this.kemParameterSpec = kEMParameterSpec;
        if (i10 == 3) {
            if (!(key instanceof BCHQCPublicKey)) {
                throw new InvalidKeyException(AbstractC1452a.m4564k(new StringBuilder("Only a "), this.algorithmName, " public key can be used for wrapping"));
            }
            this.wrapKey = (BCHQCPublicKey) key;
            this.kemGen = new HQCKEMGenerator(CryptoServicesRegistrar.getSecureRandom(secureRandom));
        } else {
            if (i10 != 4) {
                throw new InvalidParameterException("Cipher only valid for wrapping/unwrapping");
            }
            if (!(key instanceof BCHQCPrivateKey)) {
                throw new InvalidKeyException(AbstractC1452a.m4564k(new StringBuilder("Only a "), this.algorithmName, " private key can be used for unwrapping"));
            }
            this.unwrapKey = (BCHQCPrivateKey) key;
        }
        HQCParameters hQCParameters = this.hqcParameters;
        if (hQCParameters != null) {
            String upperCase = Strings.toUpperCase(hQCParameters.getName());
            if (!upperCase.equals(key.getAlgorithm())) {
                throw new InvalidKeyException("cipher locked to ".concat(upperCase));
            }
        }
    }
}
