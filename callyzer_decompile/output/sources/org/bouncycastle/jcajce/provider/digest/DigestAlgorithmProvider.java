package org.bouncycastle.jcajce.provider.digest;

import i0.m0;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes3.dex */
abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strM7378k = m0.m7378k("HMAC", str);
        configurableProvider.addAlgorithm("Mac." + strM7378k, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-" + str, strM7378k);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/" + str, strM7378k);
        configurableProvider.addAlgorithm("KeyGenerator." + strM7378k, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + str, strM7378k);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + str, strM7378k);
    }

    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String strM7378k = m0.m7378k("HMAC", str);
        configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier, strM7378k);
        AbstractC4801l.m9750x(new StringBuilder("Alg.Alias.KeyGenerator."), aSN1ObjectIdentifier, configurableProvider, strM7378k);
    }

    public void addKMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strM7378k = m0.m7378k("KMAC", str);
        configurableProvider.addAlgorithm("Mac." + strM7378k, str2);
        configurableProvider.addAlgorithm("KeyGenerator." + strM7378k, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.KMAC" + str, strM7378k);
    }
}
