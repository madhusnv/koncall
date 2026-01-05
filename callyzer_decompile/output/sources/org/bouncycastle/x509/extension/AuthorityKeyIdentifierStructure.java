package org.bouncycastle.x509.extension;

import a2.AbstractC0030c;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.jce.PrincipalUtil;

/* loaded from: classes3.dex */
public class AuthorityKeyIdentifierStructure extends AuthorityKeyIdentifier {
    public AuthorityKeyIdentifierStructure(PublicKey publicKey) {
        super(fromKey(publicKey));
    }

    private static ASN1Sequence fromCertificate(X509Certificate x509Certificate) throws CertificateParsingException {
        AuthorityKeyIdentifier authorityKeyIdentifier;
        try {
            if (x509Certificate.getVersion() != 3) {
                authorityKeyIdentifier = new AuthorityKeyIdentifier(SubjectPublicKeyInfo.getInstance(x509Certificate.getPublicKey().getEncoded()), new GeneralNames(new GeneralName(PrincipalUtil.getIssuerX509Principal(x509Certificate))), x509Certificate.getSerialNumber());
            } else {
                GeneralName generalName = new GeneralName(PrincipalUtil.getIssuerX509Principal(x509Certificate));
                byte[] extensionValue = x509Certificate.getExtensionValue(Extension.subjectKeyIdentifier.getId());
                authorityKeyIdentifier = extensionValue != null ? new AuthorityKeyIdentifier(((ASN1OctetString) X509ExtensionUtil.fromExtensionValue(extensionValue)).getOctets(), new GeneralNames(generalName), x509Certificate.getSerialNumber()) : new AuthorityKeyIdentifier(SubjectPublicKeyInfo.getInstance(x509Certificate.getPublicKey().getEncoded()), new GeneralNames(generalName), x509Certificate.getSerialNumber());
            }
            return (ASN1Sequence) authorityKeyIdentifier.toASN1Primitive();
        } catch (Exception e2) {
            throw new CertificateParsingException(AbstractC4801l.m9732f(e2, new StringBuilder("Exception extracting certificate details: ")));
        }
    }

    private static ASN1Sequence fromKey(PublicKey publicKey) throws InvalidKeyException {
        try {
            return (ASN1Sequence) new AuthorityKeyIdentifier(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())).toASN1Primitive();
        } catch (Exception e2) {
            throw new InvalidKeyException(AbstractC0030c.m120k("can't process key: ", e2));
        }
    }

    public AuthorityKeyIdentifierStructure(X509Certificate x509Certificate) {
        super(fromCertificate(x509Certificate));
    }

    public AuthorityKeyIdentifierStructure(Extension extension) {
        super((ASN1Sequence) extension.getParsedValue());
    }

    public AuthorityKeyIdentifierStructure(X509Extension x509Extension) {
        super((ASN1Sequence) x509Extension.getParsedValue());
    }

    public AuthorityKeyIdentifierStructure(byte[] bArr) {
        super((ASN1Sequence) X509ExtensionUtil.fromExtensionValue(bArr));
    }
}
