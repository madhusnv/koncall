package org.bouncycastle.jcajce.provider.asymmetric.x509;

import com.sun.mail.util.AbstractC1452a;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
class X509SignatureUtil {
    private static final Map<ASN1ObjectIdentifier, String> algNames;
    private static final ASN1Null derNull;

    static {
        HashMap map = new HashMap();
        algNames = map;
        map.put(EdECObjectIdentifiers.id_Ed25519, EdDSAParameterSpec.Ed25519);
        map.put(EdECObjectIdentifiers.id_Ed448, EdDSAParameterSpec.Ed448);
        map.put(OIWObjectIdentifiers.dsaWithSHA1, "SHA1withDSA");
        map.put(X9ObjectIdentifiers.id_dsa_with_sha1, "SHA1withDSA");
        derNull = DERNull.INSTANCE;
    }

    private static String findAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String strLookupAlg;
        String strLookupAlg2;
        Provider provider = Security.getProvider("BC");
        if (provider != null && (strLookupAlg2 = lookupAlg(provider, aSN1ObjectIdentifier)) != null) {
            return strLookupAlg2;
        }
        Provider[] providers = Security.getProviders();
        for (int i10 = 0; i10 != providers.length; i10++) {
            Provider provider2 = providers[i10];
            if (provider != provider2 && (strLookupAlg = lookupAlg(provider2, aSN1ObjectIdentifier)) != null) {
                return strLookupAlg;
            }
        }
        return aSN1ObjectIdentifier.getId();
    }

    private static String getDigestAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String digestName = MessageDigestUtils.getDigestName(aSN1ObjectIdentifier);
        int iIndexOf = digestName.indexOf(45);
        if (iIndexOf <= 0 || digestName.startsWith("SHA3")) {
            return digestName;
        }
        return digestName.substring(0, iIndexOf) + digestName.substring(iIndexOf + 1);
    }

    public static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters != null && !derNull.equals(parameters)) {
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                return AbstractC1452a.m4564k(new StringBuilder(), getDigestAlgName(RSASSAPSSparams.getInstance(parameters).getHashAlgorithm().getAlgorithm()), "withRSAandMGF1");
            }
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) X9ObjectIdentifiers.ecdsa_with_SHA2)) {
                return AbstractC1452a.m4564k(new StringBuilder(), getDigestAlgName((ASN1ObjectIdentifier) ASN1Sequence.getInstance(parameters).getObjectAt(0)), "withECDSA");
            }
        }
        String str = algNames.get(algorithmIdentifier.getAlgorithm());
        return str != null ? str : findAlgName(algorithmIdentifier.getAlgorithm());
    }

    public static boolean isCompositeAlgorithm(AlgorithmIdentifier algorithmIdentifier) {
        return MiscObjectIdentifiers.id_alg_composite.equals((ASN1Primitive) algorithmIdentifier.getAlgorithm());
    }

    private static String lookupAlg(Provider provider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String property = provider.getProperty("Alg.Alias.Signature." + aSN1ObjectIdentifier);
        if (property != null) {
            return property;
        }
        String property2 = provider.getProperty("Alg.Alias.Signature.OID." + aSN1ObjectIdentifier);
        if (property2 != null) {
            return property2;
        }
        return null;
    }

    public static void prettyPrintSignature(byte[] bArr, StringBuffer stringBuffer, String str) {
        int length = bArr.length;
        stringBuffer.append("            Signature: ");
        if (length <= 20) {
            stringBuffer.append(Hex.toHexString(bArr));
            stringBuffer.append(str);
            return;
        }
        stringBuffer.append(Hex.toHexString(bArr, 0, 20));
        stringBuffer.append(str);
        int i10 = 20;
        while (i10 < bArr.length) {
            int length2 = bArr.length - 20;
            stringBuffer.append("                       ");
            stringBuffer.append(i10 < length2 ? Hex.toHexString(bArr, i10, 20) : Hex.toHexString(bArr, i10, bArr.length - i10));
            stringBuffer.append(str);
            i10 += 20;
        }
    }

    public static void setSignatureParameters(Signature signature, ASN1Encodable aSN1Encodable) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidAlgorithmParameterException {
        if (aSN1Encodable == null || derNull.equals(aSN1Encodable)) {
            return;
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try {
            algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded());
            if (signature.getAlgorithm().endsWith("MGF1")) {
                try {
                    signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (GeneralSecurityException e2) {
                    throw new SignatureException("Exception extracting parameters: " + e2.getMessage());
                }
            }
        } catch (IOException e10) {
            throw new SignatureException(AbstractC4801l.m9731e(e10, new StringBuilder("IOException decoding parameters: ")));
        }
    }
}
