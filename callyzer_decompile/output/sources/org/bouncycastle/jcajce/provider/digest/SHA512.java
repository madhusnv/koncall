package org.bouncycastle.jcajce.provider.digest;

import com.sun.mail.util.AbstractC1452a;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHA512tDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.OldHMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;

/* loaded from: classes3.dex */
public class SHA512 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA512Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA512Digest((SHA512Digest) this.digest);
            return digest;
        }
    }

    public static class DigestT extends BCMessageDigest implements Cloneable {
        public DigestT(int i10) {
            super(new SHA512tDigest(i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            DigestT digestT = (DigestT) super.clone();
            digestT.digest = new SHA512tDigest((SHA512tDigest) this.digest);
            return digestT;
        }
    }

    public static class DigestT224 extends DigestT {
        public DigestT224() {
            super(BERTags.FLAGS);
        }
    }

    public static class DigestT256 extends DigestT {
        public DigestT256() {
            super(256);
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA512Digest()));
        }
    }

    public static class HashMacT224 extends BaseMac {
        public HashMacT224() {
            super(new HMac(new SHA512tDigest(BERTags.FLAGS)));
        }
    }

    public static class HashMacT256 extends BaseMac {
        public HashMacT256() {
            super(new HMac(new SHA512tDigest(256)));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA512", 512, new CipherKeyGenerator());
        }
    }

    public static class KeyGeneratorT224 extends BaseKeyGenerator {
        public KeyGeneratorT224() {
            super("HMACSHA512/224", BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public static class KeyGeneratorT256 extends BaseKeyGenerator {
        public KeyGeneratorT256() {
            super("HMACSHA512/256", 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA512.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            AbstractC5601a.m11226A(str, "$Digest", "MessageDigest.SHA-512", sb2, configurableProvider);
            AbstractC5601a.m11227B(AbstractC4801l.m9726D("SHA-512", str, AbstractC4801l.m9742p(configurableProvider, "Alg.Alias.MessageDigest.SHA512", "SHA-512", "Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha512, configurableProvider), "$DigestT224", configurableProvider, "MessageDigest.SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/224", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512224", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA-512(224)", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512(224)", "SHA-512/224");
            AbstractC5601a.m11227B(AbstractC4801l.m9726D("SHA-512/224", str, new StringBuilder("Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha512_224, configurableProvider), "$DigestT256", configurableProvider, "MessageDigest.SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/256", SPHINCSKeyParameters.SHA512_256);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512256", SPHINCSKeyParameters.SHA512_256);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA-512(256)", SPHINCSKeyParameters.SHA512_256);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512(256)", SPHINCSKeyParameters.SHA512_256);
            StringBuilder sbM11246q = AbstractC5601a.m11246q("$HashMac", "Mac.PBEWITHHMACSHA512", str, AbstractC5601a.m11246q("$OldSHA512", "Mac.OLDHMACSHA512", str, AbstractC4801l.m9726D(SPHINCSKeyParameters.SHA512_256, str, new StringBuilder("Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha512_256, configurableProvider), configurableProvider), configurableProvider);
            sbM11246q.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA512", sbM11246q.toString(), AbstractC1452a.m4561h(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA512", PKCSObjectIdentifiers.id_hmacWithSHA512);
            addHMACAlgorithm(configurableProvider, "SHA512/224", AbstractC1452a.m4561h(str, "$HashMacT224"), AbstractC1452a.m4561h(str, "$KeyGeneratorT224"));
            addHMACAlgorithm(configurableProvider, "SHA512/256", AbstractC1452a.m4561h(str, "$HashMacT256"), AbstractC1452a.m4561h(str, "$KeyGeneratorT256"));
        }
    }

    public static class OldSHA512 extends BaseMac {
        public OldSHA512() {
            super(new OldHMac(new SHA512Digest()));
        }
    }

    private SHA512() {
    }
}
