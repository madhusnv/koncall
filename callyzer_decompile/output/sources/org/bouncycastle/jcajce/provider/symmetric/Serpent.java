package org.bouncycastle.jcajce.provider.symmetric;

import com.sun.mail.util.AbstractC1452a;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.gnu.GNUObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.SerpentEngine;
import org.bouncycastle.crypto.engines.TnepresEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* loaded from: classes3.dex */
public final class Serpent {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Serpent IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new SerpentEngine()), 128);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new SerpentEngine();
                }
            });
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Serpent", BERTags.PRIVATE, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Serpent.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            AbstractC5601a.m11226A(str, "$TAlgParams", "AlgorithmParameters.Tnepres", AbstractC4801l.m9740n(str, "$TKeyGen", "KeyGenerator.Tnepres", AbstractC4801l.m9740n(str, "$TECB", "Cipher.Tnepres", AbstractC4801l.m9740n(str, "$AlgParams", "AlgorithmParameters.Serpent", AbstractC4801l.m9740n(str, "$KeyGen", "KeyGenerator.Serpent", AbstractC4801l.m9740n(str, "$ECB", "Cipher.Serpent", sb2, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            AbstractC4801l.m9723A(configurableProvider, str, "$ECB", "Cipher", GNUObjectIdentifiers.Serpent_128_ECB);
            AbstractC4801l.m9723A(configurableProvider, str, "$ECB", "Cipher", GNUObjectIdentifiers.Serpent_192_ECB);
            AbstractC4801l.m9723A(configurableProvider, str, "$ECB", "Cipher", GNUObjectIdentifiers.Serpent_256_ECB);
            AbstractC4801l.m9723A(configurableProvider, str, "$CBC", "Cipher", GNUObjectIdentifiers.Serpent_128_CBC);
            AbstractC4801l.m9723A(configurableProvider, str, "$CBC", "Cipher", GNUObjectIdentifiers.Serpent_192_CBC);
            AbstractC4801l.m9723A(configurableProvider, str, "$CBC", "Cipher", GNUObjectIdentifiers.Serpent_256_CBC);
            AbstractC4801l.m9723A(configurableProvider, str, "$CFB", "Cipher", GNUObjectIdentifiers.Serpent_128_CFB);
            AbstractC4801l.m9723A(configurableProvider, str, "$CFB", "Cipher", GNUObjectIdentifiers.Serpent_192_CFB);
            AbstractC4801l.m9723A(configurableProvider, str, "$CFB", "Cipher", GNUObjectIdentifiers.Serpent_256_CFB);
            AbstractC4801l.m9723A(configurableProvider, str, "$OFB", "Cipher", GNUObjectIdentifiers.Serpent_128_OFB);
            AbstractC4801l.m9723A(configurableProvider, str, "$OFB", "Cipher", GNUObjectIdentifiers.Serpent_192_OFB);
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_256_OFB, str + "$OFB");
            addGMacAlgorithm(configurableProvider, "SERPENT", AbstractC1452a.m4564k(new StringBuilder(), str, "$SerpentGMAC"), AbstractC1452a.m4561h(str, "$KeyGen"));
            addGMacAlgorithm(configurableProvider, "TNEPRES", AbstractC1452a.m4561h(str, "$TSerpentGMAC"), AbstractC1452a.m4561h(str, "$TKeyGen"));
            addPoly1305Algorithm(configurableProvider, "SERPENT", AbstractC1452a.m4561h(str, "$Poly1305"), AbstractC1452a.m4561h(str, "$Poly1305KeyGen"));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new SerpentEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Serpent", 256, new Poly1305KeyGenerator());
        }
    }

    public static class SerpentGMAC extends BaseMac {
        public SerpentGMAC() {
            super(new GMac(new GCMBlockCipher(new SerpentEngine())));
        }
    }

    public static class TAlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Tnepres IV";
        }
    }

    public static class TECB extends BaseBlockCipher {
        public TECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.TECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new TnepresEngine();
                }
            });
        }
    }

    public static class TKeyGen extends BaseKeyGenerator {
        public TKeyGen() {
            super("Tnepres", BERTags.PRIVATE, new CipherKeyGenerator());
        }
    }

    public static class TSerpentGMAC extends BaseMac {
        public TSerpentGMAC() {
            super(new GMac(new GCMBlockCipher(new TnepresEngine())));
        }
    }

    private Serpent() {
    }
}
