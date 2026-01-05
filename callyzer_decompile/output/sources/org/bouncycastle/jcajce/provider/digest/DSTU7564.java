package org.bouncycastle.jcajce.provider.digest;

import com.sun.mail.util.AbstractC1452a;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.DSTU7564Digest;
import org.bouncycastle.crypto.macs.DSTU7564Mac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* loaded from: classes3.dex */
public class DSTU7564 {

    public static class Digest256 extends DigestDSTU7564 {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest384 extends DigestDSTU7564 {
        public Digest384() {
            super(KyberEngine.KyberPolyBytes);
        }
    }

    public static class Digest512 extends DigestDSTU7564 {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestDSTU7564 extends BCMessageDigest implements Cloneable {
        public DigestDSTU7564(int i10) {
            super(new DSTU7564Digest(i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new DSTU7564Digest((DSTU7564Digest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new DSTU7564Mac(256));
        }
    }

    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new DSTU7564Mac(KyberEngine.KyberPolyBytes));
        }
    }

    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new DSTU7564Mac(512));
        }
    }

    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACDSTU7564-256", 256, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACDSTU7564-384", KyberEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACDSTU7564-512", 512, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = DSTU7564.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            AbstractC5601a.m11226A(str, "$Digest512", "MessageDigest.DSTU7564-512", AbstractC4801l.m9740n(str, "$Digest384", "MessageDigest.DSTU7564-384", AbstractC4801l.m9740n(str, "$Digest256", "MessageDigest.DSTU7564-256", sb2, configurableProvider), configurableProvider), configurableProvider);
            AbstractC4801l.m9723A(configurableProvider, str, "$Digest256", "MessageDigest", UAObjectIdentifiers.dstu7564digest_256);
            AbstractC4801l.m9723A(configurableProvider, str, "$Digest384", "MessageDigest", UAObjectIdentifiers.dstu7564digest_384);
            configurableProvider.addAlgorithm("MessageDigest", UAObjectIdentifiers.dstu7564digest_512, str + "$Digest512");
            addHMACAlgorithm(configurableProvider, "DSTU7564-256", AbstractC1452a.m4564k(new StringBuilder(), str, "$HashMac256"), AbstractC1452a.m4561h(str, "$KeyGenerator256"));
            addHMACAlgorithm(configurableProvider, "DSTU7564-384", AbstractC1452a.m4561h(str, "$HashMac384"), AbstractC1452a.m4561h(str, "$KeyGenerator384"));
            addHMACAlgorithm(configurableProvider, "DSTU7564-512", AbstractC1452a.m4561h(str, "$HashMac512"), AbstractC1452a.m4561h(str, "$KeyGenerator512"));
            addHMACAlias(configurableProvider, "DSTU7564-256", UAObjectIdentifiers.dstu7564mac_256);
            addHMACAlias(configurableProvider, "DSTU7564-384", UAObjectIdentifiers.dstu7564mac_384);
            addHMACAlias(configurableProvider, "DSTU7564-512", UAObjectIdentifiers.dstu7564mac_512);
        }
    }

    private DSTU7564() {
    }
}
