package org.bouncycastle.jcajce.provider.symmetric;

import mm.AbstractC4801l;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes3.dex */
public class Poly1305 {

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Poly1305", 256, new Poly1305KeyGenerator());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new org.bouncycastle.crypto.macs.Poly1305());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Poly1305.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            AbstractC5601a.m11226A(str, "$KeyGen", "KeyGenerator.POLY1305", AbstractC4801l.m9740n(str, "$Mac", "Mac.POLY1305", sb2, configurableProvider), configurableProvider);
        }
    }

    private Poly1305() {
    }
}
