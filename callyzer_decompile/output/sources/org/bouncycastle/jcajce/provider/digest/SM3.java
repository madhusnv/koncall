package org.bouncycastle.jcajce.provider.digest;

import com.sun.mail.util.AbstractC1452a;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes3.dex */
public class SM3 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SM3Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SM3Digest((SM3Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SM3Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSM3", 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SM3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            AbstractC5601a.m11226A(str, "$Digest", "MessageDigest.SM3", sb2, configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SM3", "SM3");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.1.2.156.197.1.401", "SM3");
            StringBuilder sbM9726D = AbstractC4801l.m9726D("SM3", str, new StringBuilder("Alg.Alias.MessageDigest."), GMObjectIdentifiers.sm3, configurableProvider);
            sbM9726D.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SM3", sbM9726D.toString(), AbstractC1452a.m4561h(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "SM3", GMObjectIdentifiers.hmac_sm3);
        }
    }

    private SM3() {
    }
}
