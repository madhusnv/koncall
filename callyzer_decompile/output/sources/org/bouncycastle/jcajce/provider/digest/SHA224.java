package org.bouncycastle.jcajce.provider.digest;

import com.sun.mail.util.AbstractC1452a;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes3.dex */
public class SHA224 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA224Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA224Digest((SHA224Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA224Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA224", BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA224.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            AbstractC5601a.m11226A(str, "$Digest", "MessageDigest.SHA-224", sb2, configurableProvider);
            StringBuilder sbM11246q = AbstractC5601a.m11246q("$HashMac", "Mac.PBEWITHHMACSHA224", str, AbstractC4801l.m9726D(McElieceCCA2KeyGenParameterSpec.SHA224, str, AbstractC4801l.m9742p(configurableProvider, "Alg.Alias.MessageDigest.SHA224", McElieceCCA2KeyGenParameterSpec.SHA224, "Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha224, configurableProvider), configurableProvider);
            sbM11246q.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA224", sbM11246q.toString(), AbstractC1452a.m4561h(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA224", PKCSObjectIdentifiers.id_hmacWithSHA224);
        }
    }

    private SHA224() {
    }
}
