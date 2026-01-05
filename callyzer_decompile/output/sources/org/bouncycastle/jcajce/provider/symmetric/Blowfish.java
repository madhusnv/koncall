package org.bouncycastle.jcajce.provider.symmetric;

import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.BlowfishEngine;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes3.dex */
public final class Blowfish {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Blowfish IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new BlowfishEngine()), 64);
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new CMac(new BlowfishEngine()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlowfishEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Blowfish", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Blowfish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            AbstractC5601a.m11226A(str, "$ECB", "Cipher.BLOWFISH", AbstractC4801l.m9740n(str, "$CMAC", "Mac.BLOWFISHCMAC", sb2, configurableProvider), configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CBC;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, str + "$CBC");
            AbstractC5601a.m11226A(str, "$KeyGen", "KeyGenerator.BLOWFISH", new StringBuilder(), configurableProvider);
            AbstractC5601a.m11227B(AbstractC5601a.m11248s(configurableProvider, "Alg.Alias.KeyGenerator", "BLOWFISH", str, aSN1ObjectIdentifier), "$AlgParams", configurableProvider, "AlgorithmParameters.BLOWFISH");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", aSN1ObjectIdentifier, "BLOWFISH");
        }
    }

    private Blowfish() {
    }
}
