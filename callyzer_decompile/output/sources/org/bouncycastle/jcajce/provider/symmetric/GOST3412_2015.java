package org.bouncycastle.jcajce.provider.symmetric;

import mm.AbstractC4801l;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.GOST3412_2015Engine;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.modes.G3413CBCBlockCipher;
import org.bouncycastle.crypto.modes.G3413CFBBlockCipher;
import org.bouncycastle.crypto.modes.G3413CTRBlockCipher;
import org.bouncycastle.crypto.modes.G3413OFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes3.dex */
public class GOST3412_2015 {

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((BlockCipher) new G3413CBCBlockCipher(new GOST3412_2015Engine()), false, 128);
        }
    }

    public static class CTR extends BaseBlockCipher {
        public CTR() {
            super(new BufferedBlockCipher(new G3413CTRBlockCipher(new GOST3412_2015Engine())), true, 64);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new GOST3412_2015Engine());
        }
    }

    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new BufferedBlockCipher(new G3413CFBBlockCipher(new GOST3412_2015Engine())), false, 128);
        }
    }

    public static class GCFB8 extends BaseBlockCipher {
        public GCFB8() {
            super(new BufferedBlockCipher(new G3413CFBBlockCipher(new GOST3412_2015Engine(), 8)), false, 128);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i10) {
            super("GOST3412-2015", i10, new CipherKeyGenerator());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new CMac(new GOST3412_2015Engine()));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = GOST3412_2015.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            AbstractC5601a.m11226A(str, "$Mac", "Mac.GOST3412MAC", AbstractC4801l.m9740n(str, "$KeyGen", "KeyGenerator.GOST3412-2015", AbstractC4801l.m9740n(str, "$CTR", "Cipher.GOST3412-2015/CTR", AbstractC4801l.m9740n(str, "$CBC", "Cipher.GOST3412-2015/CBC", AbstractC4801l.m9740n(str, "$OFB", "Cipher.GOST3412-2015/OFB", AbstractC4801l.m9740n(str, "$GCFB8", "Cipher.GOST3412-2015/CFB8", AbstractC4801l.m9740n(str, "$GCFB", "Cipher.GOST3412-2015/CFB", AbstractC4801l.m9740n(str, "$ECB", "Cipher.GOST3412-2015", sb2, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST3412-2015", "GOST3412MAC");
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new BufferedBlockCipher(new G3413OFBBlockCipher(new GOST3412_2015Engine())), false, 128);
        }
    }
}
