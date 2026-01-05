package org.bouncycastle.jcajce.provider.symmetric;

import mm.AbstractC4801l;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.Salsa20Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes3.dex */
public final class Salsa20 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Salsa20 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new Salsa20Engine(), 8);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Salsa20", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Salsa20.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            AbstractC5601a.m11226A(str, "$AlgParams", "AlgorithmParameters.SALSA20", AbstractC4801l.m9740n(str, "$KeyGen", "KeyGenerator.SALSA20", AbstractC4801l.m9740n(str, "$Base", "Cipher.SALSA20", sb2, configurableProvider), configurableProvider), configurableProvider);
        }
    }

    private Salsa20() {
    }
}
