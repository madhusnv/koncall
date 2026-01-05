package org.bouncycastle.jcajce.provider.digest;

import com.sun.mail.util.AbstractC1452a;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.KeccakDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* loaded from: classes3.dex */
public class Keccak {

    public static class Digest224 extends DigestKeccak {
        public Digest224() {
            super(BERTags.FLAGS);
        }
    }

    public static class Digest256 extends DigestKeccak {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest288 extends DigestKeccak {
        public Digest288() {
            super(288);
        }
    }

    public static class Digest384 extends DigestKeccak {
        public Digest384() {
            super(KyberEngine.KyberPolyBytes);
        }
    }

    public static class Digest512 extends DigestKeccak {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestKeccak extends BCMessageDigest implements Cloneable {
        public DigestKeccak(int i10) {
            super(new KeccakDigest(i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new KeccakDigest((KeccakDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class HashMac224 extends BaseMac {
        public HashMac224() {
            super(new HMac(new KeccakDigest(BERTags.FLAGS)));
        }
    }

    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new HMac(new KeccakDigest(256)));
        }
    }

    public static class HashMac288 extends BaseMac {
        public HashMac288() {
            super(new HMac(new KeccakDigest(288)));
        }
    }

    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new HMac(new KeccakDigest(KyberEngine.KyberPolyBytes)));
        }
    }

    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new HMac(new KeccakDigest(512)));
        }
    }

    public static class KeyGenerator224 extends BaseKeyGenerator {
        public KeyGenerator224() {
            super("HMACKECCAK224", BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACKECCAK256", 256, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator288 extends BaseKeyGenerator {
        public KeyGenerator288() {
            super("HMACKECCAK288", 288, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACKECCAK384", KyberEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACKECCAK512", 512, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Keccak.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            addHMACAlgorithm(configurableProvider, "KECCAK224", AbstractC1452a.m4564k(AbstractC4801l.m9740n(str, "$Digest512", "MessageDigest.KECCAK-512", AbstractC4801l.m9740n(str, "$Digest384", "MessageDigest.KECCAK-384", AbstractC4801l.m9740n(str, "$Digest256", "MessageDigest.KECCAK-256", AbstractC4801l.m9740n(str, "$Digest288", "MessageDigest.KECCAK-288", AbstractC4801l.m9740n(str, "$Digest224", "MessageDigest.KECCAK-224", sb2, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), str, "$HashMac224"), AbstractC1452a.m4561h(str, "$KeyGenerator224"));
            addHMACAlgorithm(configurableProvider, "KECCAK256", AbstractC1452a.m4561h(str, "$HashMac256"), AbstractC1452a.m4561h(str, "$KeyGenerator256"));
            addHMACAlgorithm(configurableProvider, "KECCAK288", AbstractC1452a.m4561h(str, "$HashMac288"), AbstractC1452a.m4561h(str, "$KeyGenerator288"));
            addHMACAlgorithm(configurableProvider, "KECCAK384", AbstractC1452a.m4561h(str, "$HashMac384"), AbstractC1452a.m4561h(str, "$KeyGenerator384"));
            addHMACAlgorithm(configurableProvider, "KECCAK512", AbstractC1452a.m4561h(str, "$HashMac512"), AbstractC1452a.m4561h(str, "$KeyGenerator512"));
        }
    }

    private Keccak() {
    }
}
