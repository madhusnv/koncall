package org.bouncycastle.jcajce.provider.symmetric;

import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.modes.ChaCha20Poly1305;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes3.dex */
public final class ChaCha {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "ChaCha7539 IV";
        }
    }

    public static class AlgParamsCC1305 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "ChaCha20-Poly1305 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new ChaChaEngine(), 8);
        }
    }

    public static class Base7539 extends BaseStreamCipher {
        public Base7539() {
            super(new ChaCha7539Engine(), 12);
        }
    }

    public static class BaseCC20P1305 extends BaseBlockCipher {
        public BaseCC20P1305() {
            super((AEADCipher) new ChaCha20Poly1305(), true, 12);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("ChaCha", 128, new CipherKeyGenerator());
        }
    }

    public static class KeyGen7539 extends BaseKeyGenerator {
        public KeyGen7539() {
            super("ChaCha7539", 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = ChaCha.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            AbstractC5601a.m11226A(str, "$AlgParams", "AlgorithmParameters.CHACHA7539", AbstractC4801l.m9740n(str, "$KeyGen7539", "KeyGenerator.CHACHA7539", AbstractC4801l.m9740n(str, "$Base7539", "Cipher.CHACHA7539", AbstractC4801l.m9740n(str, "$KeyGen", "KeyGenerator.CHACHA", AbstractC4801l.m9740n(str, "$Base", "Cipher.CHACHA", sb2, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20-POLY1305", "CHACHA7539");
            StringBuilder sb3 = new StringBuilder("Alg.Alias.KeyGenerator.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305;
            StringBuilder sbM11246q = AbstractC5601a.m11246q("$BaseCC20P1305", "Cipher.CHACHA20-POLY1305", str, AbstractC4801l.m9726D("CHACHA7539", str, sb3, aSN1ObjectIdentifier, configurableProvider), configurableProvider);
            sbM11246q.append("$AlgParamsCC1305");
            configurableProvider.addAlgorithm("AlgorithmParameters.CHACHA20-POLY1305", sbM11246q.toString());
            AbstractC4801l.m9750x(AbstractC4801l.m9741o("CHACHA20-POLY1305", "Alg.Alias.AlgorithmParameters.OID.", AbstractC4801l.m9741o("CHACHA20-POLY1305", "Alg.Alias.Cipher.OID.", AbstractC4801l.m9741o("CHACHA20-POLY1305", "Alg.Alias.AlgorithmParameters.", new StringBuilder("Alg.Alias.Cipher."), aSN1ObjectIdentifier, configurableProvider), aSN1ObjectIdentifier, configurableProvider), aSN1ObjectIdentifier, configurableProvider), aSN1ObjectIdentifier, configurableProvider, "CHACHA20-POLY1305");
        }
    }

    private ChaCha() {
    }
}
