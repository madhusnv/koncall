package org.bouncycastle.jcajce.provider.digest;

import com.sun.mail.util.AbstractC1452a;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.digests.GOST3411_2012_256Digest;
import org.bouncycastle.crypto.digests.GOST3411_2012_512Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes3.dex */
public class GOST3411 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new GOST3411Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new GOST3411Digest((GOST3411Digest) this.digest);
            return digest;
        }
    }

    public static class Digest2012_256 extends BCMessageDigest implements Cloneable {
        public Digest2012_256() {
            super(new GOST3411_2012_256Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest2012_256 digest2012_256 = (Digest2012_256) super.clone();
            digest2012_256.digest = new GOST3411_2012_256Digest((GOST3411_2012_256Digest) this.digest);
            return digest2012_256;
        }
    }

    public static class Digest2012_512 extends BCMessageDigest implements Cloneable {
        public Digest2012_512() {
            super(new GOST3411_2012_512Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest2012_512 digest2012_512 = (Digest2012_512) super.clone();
            digest2012_512.digest = new GOST3411_2012_512Digest((GOST3411_2012_512Digest) this.digest);
            return digest2012_512;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new GOST3411Digest()));
        }
    }

    public static class HashMac2012_256 extends BaseMac {
        public HashMac2012_256() {
            super(new HMac(new GOST3411_2012_256Digest()));
        }
    }

    public static class HashMac2012_512 extends BaseMac {
        public HashMac2012_512() {
            super(new HMac(new GOST3411_2012_512Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACGOST3411", 256, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator2012_256 extends BaseKeyGenerator {
        public KeyGenerator2012_256() {
            super("HMACGOST3411", 256, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator2012_512 extends BaseKeyGenerator {
        public KeyGenerator2012_512() {
            super("HMACGOST3411", 512, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = GOST3411.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            AbstractC5601a.m11226A(str, "$Digest", "MessageDigest.GOST3411", sb2, configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST", "GOST3411");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411", "GOST3411");
            StringBuilder sb3 = new StringBuilder("Alg.Alias.MessageDigest.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.gostR3411;
            StringBuilder sbM9726D = AbstractC4801l.m9726D("GOST3411", str, sb3, aSN1ObjectIdentifier, configurableProvider);
            sbM9726D.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "GOST3411", sbM9726D.toString(), AbstractC1452a.m4561h(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "GOST3411", aSN1ObjectIdentifier);
            configurableProvider.addAlgorithm("MessageDigest.GOST3411-2012-256", str + "$Digest2012_256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-2012-256", "GOST3411-2012-256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411-2012-256", "GOST3411-2012-256");
            StringBuilder sbM9726D2 = AbstractC4801l.m9726D("GOST3411-2012-256", str, new StringBuilder("Alg.Alias.MessageDigest."), RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256, configurableProvider);
            sbM9726D2.append("$HashMac2012_256");
            addHMACAlgorithm(configurableProvider, "GOST3411-2012-256", sbM9726D2.toString(), AbstractC1452a.m4561h(str, "$KeyGenerator2012_256"));
            addHMACAlias(configurableProvider, "GOST3411-2012-256", RosstandartObjectIdentifiers.id_tc26_hmac_gost_3411_12_256);
            configurableProvider.addAlgorithm("MessageDigest.GOST3411-2012-512", str + "$Digest2012_512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-2012-512", "GOST3411-2012-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411-2012-512", "GOST3411-2012-512");
            StringBuilder sbM9726D3 = AbstractC4801l.m9726D("GOST3411-2012-512", str, new StringBuilder("Alg.Alias.MessageDigest."), RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512, configurableProvider);
            sbM9726D3.append("$HashMac2012_512");
            addHMACAlgorithm(configurableProvider, "GOST3411-2012-512", sbM9726D3.toString(), AbstractC1452a.m4561h(str, "$KeyGenerator2012_512"));
            addHMACAlias(configurableProvider, "GOST3411-2012-512", RosstandartObjectIdentifiers.id_tc26_hmac_gost_3411_12_512);
            AbstractC4801l.m9750x(AbstractC4801l.m9739m(str, "$PBEWithMacKeyFactory", "SecretKeyFactory.PBEWITHHMACGOST3411", "Alg.Alias.SecretKeyFactory.", configurableProvider), aSN1ObjectIdentifier, configurableProvider, "PBEWITHHMACGOST3411");
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacGOST3411", null, false, 2, 6, 256, 0);
        }
    }

    private GOST3411() {
    }
}
