package org.bouncycastle.jcajce.provider.symmetric;

import com.sun.mail.util.AbstractC1452a;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.misc.IDEACBCPar;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.IDEAEngine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes3.dex */
public final class IDEA {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() throws InvalidParameterSpecException {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("IDEA");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e2) {
                throw new RuntimeException(e2.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for IDEA parameter generation.");
        }
    }

    public static class AlgParams extends BaseAlgorithmParameters {

        /* renamed from: iv, reason: collision with root package name */
        private byte[] f44633iv;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return engineGetEncoded("ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            }
            this.f44633iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "IDEA Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new IvParameterSpec(this.f44633iv);
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return new IDEACBCPar(engineGetEncoded("RAW")).getEncoded();
            }
            if (!str.equals("RAW")) {
                return null;
            }
            byte[] bArr = this.f44633iv;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) {
            byte[] bArr2 = new byte[bArr.length];
            this.f44633iv = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (str.equals("RAW")) {
                engineInit(bArr);
            } else {
                if (!str.equals("ASN.1")) {
                    throw new IOException("Unknown parameters format in IV parameters object");
                }
                engineInit(IDEACBCPar.getInstance(bArr).getIV());
            }
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(CBCBlockCipher.newInstance(new IDEAEngine()), 64);
        }
    }

    public static class CFB8Mac extends BaseMac {
        public CFB8Mac() {
            super(new CFBBlockCipherMac(new IDEAEngine()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new IDEAEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("IDEA", 128, new CipherKeyGenerator());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new CBCBlockCipherMac(new IDEAEngine()));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = IDEA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            AbstractC5601a.m11226A(str, "$AlgParams", "AlgorithmParameters.1.3.6.1.4.1.188.7.1.1.2", AbstractC4801l.m9740n(str, "$AlgParams", "AlgorithmParameters.IDEA", AbstractC4801l.m9740n(str, "$AlgParamGen", "AlgorithmParameterGenerator.1.3.6.1.4.1.188.7.1.1.2", AbstractC4801l.m9740n(str, "$AlgParamGen", "AlgorithmParameterGenerator.IDEA", sb2, configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA-CBC", "PKCS12PBE");
            AbstractC5601a.m11226A(str, "$ECB", "Cipher.IDEA", new StringBuilder(), configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.as_sys_sec_alg_ideaCBC;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, str + "$CBC");
            AbstractC5601a.m11227B(AbstractC5601a.m11246q("$PBEWithSHAAndIDEAKeyGen", "SecretKeyFactory.PBEWITHSHAANDIDEA-CBC", str, AbstractC5601a.m11248s(configurableProvider, "KeyGenerator", AbstractC1452a.m4564k(AbstractC4801l.m9740n(str, "$KeyGen", "KeyGenerator.IDEA", AbstractC4801l.m9740n(str, "$PBEWithSHAAndIDEA", "Cipher.PBEWITHSHAANDIDEA-CBC", new StringBuilder(), configurableProvider), configurableProvider), str, "$KeyGen"), str, aSN1ObjectIdentifier), configurableProvider), "$Mac", configurableProvider, "Mac.IDEAMAC");
            configurableProvider.addAlgorithm("Mac.IDEAMAC/CFB8", AbstractC5601a.m11239j("Alg.Alias.Mac.IDEA", "IDEAMAC", str, "$CFB8Mac", configurableProvider));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.IDEA/CFB8", "IDEAMAC/CFB8");
        }
    }

    public static class PBEWithSHAAndIDEA extends BaseBlockCipher {
        public PBEWithSHAAndIDEA() {
            super(CBCBlockCipher.newInstance(new IDEAEngine()));
        }
    }

    public static class PBEWithSHAAndIDEAKeyGen extends PBESecretKeyFactory {
        public PBEWithSHAAndIDEAKeyGen() {
            super("PBEwithSHAandIDEA-CBC", null, true, 2, 1, 128, 64);
        }
    }

    private IDEA() {
    }
}
