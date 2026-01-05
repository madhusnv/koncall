package org.bouncycastle.jcajce.provider.util;

import i0.m0;
import java.util.Map;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* loaded from: classes3.dex */
public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addCipherAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Cipher." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + aSN1ObjectIdentifier, str);
            AbstractC4801l.m9750x(new StringBuilder("Alg.Alias.Cipher.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }

    public void addKeyFactoryAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("KeyFactory." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier, str);
            AbstractC4801l.m9750x(new StringBuilder("Alg.Alias.KeyFactory.OID."), aSN1ObjectIdentifier, configurableProvider, str);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    public void addKeyGeneratorAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("KeyGenerator." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + aSN1ObjectIdentifier, str);
            AbstractC4801l.m9750x(new StringBuilder("Alg.Alias.KeyGenerator.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }

    public void addKeyPairGeneratorAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("KeyPairGenerator." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator." + aSN1ObjectIdentifier, str);
            AbstractC4801l.m9750x(new StringBuilder("Alg.Alias.KeyPairGenerator.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        addSignatureAlgorithm(configurableProvider, str, str2, str3, null);
    }

    public void addSignatureAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, str);
        AbstractC4801l.m9750x(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, str);
    }

    public void registerKeyFactoryOid(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier, str);
        AbstractC4801l.m9750x(new StringBuilder("Alg.Alias.KeyFactory.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
    }

    public void registerOid(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier, str);
        AbstractC4801l.m9750x(new StringBuilder("Alg.Alias.KeyPairGenerator."), aSN1ObjectIdentifier, configurableProvider, str);
        configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
    }

    public void registerOidAlgorithmParameterGenerator(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier, str);
        AbstractC4801l.m9750x(new StringBuilder("Alg.Alias.AlgorithmParameters."), aSN1ObjectIdentifier, configurableProvider, str);
    }

    public void registerOidAlgorithmParameters(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier, str);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String strM7379l = m0.m7379l(str, "WITH", str2);
        String strM7379l2 = m0.m7379l(str, "with", str2);
        String strM7379l3 = m0.m7379l(str, "With", str2);
        String strM7379l4 = m0.m7379l(str, "/", str2);
        configurableProvider.addAlgorithm("Signature." + strM7379l, str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM7379l2, strM7379l);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM7379l3, strM7379l);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM7379l4, strM7379l);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, strM7379l);
            AbstractC4801l.m9750x(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, strM7379l);
        }
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier, Map<String, String> map) {
        String strM7379l = m0.m7379l(str, "WITH", str2);
        String strM7379l2 = m0.m7379l(str, "with", str2);
        String strM7379l3 = m0.m7379l(str, "With", str2);
        String strM7379l4 = m0.m7379l(str, "/", str2);
        configurableProvider.addAlgorithm("Signature." + strM7379l, str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM7379l2, strM7379l);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM7379l3, strM7379l);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM7379l4, strM7379l);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, strM7379l);
            AbstractC4801l.m9750x(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, strM7379l);
        }
        configurableProvider.addAttributes("Signature." + strM7379l, map);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Signature." + str, str2);
        AbstractC4801l.m9750x(AbstractC4801l.m9741o(str, "Alg.Alias.Signature.OID.", new StringBuilder("Alg.Alias.Signature."), aSN1ObjectIdentifier, configurableProvider), aSN1ObjectIdentifier, configurableProvider, str);
    }
}
