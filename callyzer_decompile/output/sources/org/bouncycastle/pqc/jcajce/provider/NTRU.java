package org.bouncycastle.pqc.jcajce.provider;

import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi;

/* loaded from: classes3.dex */
public class NTRU {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.ntru.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyGenerator.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyGeneratorSpi");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.KeyGenerator.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_ntru;
            StringBuilder sbM9741o = AbstractC4801l.m9741o("NTRU", "Alg.Alias.KeyGenerator.", sb2, aSN1ObjectIdentifier, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.ntruhps2048509;
            StringBuilder sbM9741o2 = AbstractC4801l.m9741o("NTRU", "Alg.Alias.KeyGenerator.", sbM9741o, aSN1ObjectIdentifier2, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.ntruhps2048677;
            StringBuilder sbM9741o3 = AbstractC4801l.m9741o("NTRU", "Alg.Alias.KeyGenerator.", sbM9741o2, aSN1ObjectIdentifier3, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.ntruhps4096821;
            StringBuilder sbM9741o4 = AbstractC4801l.m9741o("NTRU", "Alg.Alias.KeyGenerator.", sbM9741o3, aSN1ObjectIdentifier4, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.ntruhrss701;
            sbM9741o4.append(aSN1ObjectIdentifier5);
            configurableProvider.addAlgorithm(sbM9741o4.toString(), "NTRU");
            NTRUKeyFactorySpi nTRUKeyFactorySpi = new NTRUKeyFactorySpi();
            configurableProvider.addAlgorithm("Cipher.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUCipherSpi$Base");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + aSN1ObjectIdentifier, "NTRU");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + aSN1ObjectIdentifier2, "NTRU");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + aSN1ObjectIdentifier3, "NTRU");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + aSN1ObjectIdentifier4, "NTRU");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + aSN1ObjectIdentifier5, "NTRU");
            registerOid(configurableProvider, aSN1ObjectIdentifier, "NTRU", nTRUKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier2, "NTRU", nTRUKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier3, "NTRU", nTRUKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier4, "NTRU", nTRUKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier5, "NTRU", nTRUKeyFactorySpi);
        }
    }
}
