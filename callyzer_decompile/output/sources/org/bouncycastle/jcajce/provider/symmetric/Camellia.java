package org.bouncycastle.jcajce.provider.symmetric;

import com.sun.mail.util.AbstractC1452a;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.CamelliaEngine;
import org.bouncycastle.crypto.engines.CamelliaWrapEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* loaded from: classes3.dex */
public final class Camellia {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() throws InvalidParameterSpecException {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("Camellia");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e2) {
                throw new RuntimeException(e2.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Camellia parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Camellia IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new CamelliaEngine()), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Camellia.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new CamelliaEngine();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(new GCMBlockCipher(new CamelliaEngine())));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("Camellia", null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i10) {
            super("Camellia", i10, new CipherKeyGenerator());
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(BERTags.PRIVATE);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Camellia.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            AbstractC5601a.m11226A(str, "$AlgParams", "AlgorithmParameters.CAMELLIA", sb2, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NTTObjectIdentifiers.id_camellia128_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", aSN1ObjectIdentifier, "CAMELLIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NTTObjectIdentifiers.id_camellia192_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", aSN1ObjectIdentifier2, "CAMELLIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NTTObjectIdentifiers.id_camellia256_cbc;
            AbstractC5601a.m11227B(AbstractC5601a.m11248s(configurableProvider, "Alg.Alias.AlgorithmParameters", "CAMELLIA", str, aSN1ObjectIdentifier3), "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier2, "CAMELLIA");
            AbstractC5601a.m11226A(str, "$Wrap", "Cipher.CAMELLIAWRAP", AbstractC4801l.m9740n(str, "$RFC3211Wrap", "Cipher.CAMELLIARFC3211WRAP", AbstractC5601a.m11247r("$CBC", "Cipher", AbstractC5601a.m11248s(configurableProvider, "Cipher", AbstractC1452a.m4564k(AbstractC5601a.m11247r("$CBC", "Cipher", AbstractC5601a.m11246q("$ECB", "Cipher.CAMELLIA", str, AbstractC5601a.m11248s(configurableProvider, "Alg.Alias.AlgorithmParameterGenerator", "CAMELLIA", str, aSN1ObjectIdentifier3), configurableProvider), aSN1ObjectIdentifier, configurableProvider), str, "$CBC"), str, aSN1ObjectIdentifier2), aSN1ObjectIdentifier3, configurableProvider), configurableProvider), configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NTTObjectIdentifiers.id_camellia128_wrap;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier4, "CAMELLIAWRAP");
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NTTObjectIdentifiers.id_camellia192_wrap;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier5, "CAMELLIAWRAP");
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NTTObjectIdentifiers.id_camellia256_wrap;
            AbstractC5601a.m11227B(AbstractC5601a.m11248s(configurableProvider, "Alg.Alias.Cipher", "CAMELLIAWRAP", str, aSN1ObjectIdentifier6), "$KeyFactory", configurableProvider, "SecretKeyFactory.CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier2, "CAMELLIA");
            StringBuilder sbM11248s = AbstractC5601a.m11248s(configurableProvider, "KeyGenerator", AbstractC1452a.m4564k(AbstractC5601a.m11247r("$KeyGen192", "KeyGenerator", AbstractC5601a.m11248s(configurableProvider, "KeyGenerator", AbstractC1452a.m4564k(AbstractC5601a.m11247r("$KeyGen256", "KeyGenerator", AbstractC5601a.m11248s(configurableProvider, "KeyGenerator", AbstractC1452a.m4564k(AbstractC5601a.m11247r("$KeyGen128", "KeyGenerator", AbstractC5601a.m11246q("$KeyGen", "KeyGenerator.CAMELLIA", str, AbstractC5601a.m11248s(configurableProvider, "Alg.Alias.SecretKeyFactory", "CAMELLIA", str, aSN1ObjectIdentifier3), configurableProvider), aSN1ObjectIdentifier4, configurableProvider), str, "$KeyGen192"), str, aSN1ObjectIdentifier5), aSN1ObjectIdentifier6, configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier), aSN1ObjectIdentifier2, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier3);
            sbM11248s.append("$GMAC");
            addGMacAlgorithm(configurableProvider, "CAMELLIA", sbM11248s.toString(), AbstractC1452a.m4561h(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "CAMELLIA", AbstractC1452a.m4561h(str, "$Poly1305"), AbstractC1452a.m4561h(str, "$Poly1305KeyGen"));
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new CamelliaEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Camellia", 256, new Poly1305KeyGenerator());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new RFC3211WrapEngine(new CamelliaEngine()), 16);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new CamelliaWrapEngine());
        }
    }

    private Camellia() {
    }
}
