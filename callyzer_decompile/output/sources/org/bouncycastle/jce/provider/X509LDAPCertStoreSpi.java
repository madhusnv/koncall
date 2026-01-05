package org.bouncycastle.jce.provider;

import a2.AbstractC0030c;
import com.amplifyframework.core.model.ModelIdentifier;
import i0.m0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchProviderException;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import javax.naming.NamingEnumeration;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.security.auth.x500.X500Principal;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;

/* loaded from: classes3.dex */
public class X509LDAPCertStoreSpi extends CertStoreSpi {
    private static String[] FILTER_ESCAPE_TABLE = new String[93];
    private static String LDAP_PROVIDER = null;
    private static String REFERRALS_IGNORE = null;
    private static final String SEARCH_SECURITY_LEVEL = "none";
    private static final String URL_CONTEXT_PREFIX = "com.sun.jndi.url";
    private X509LDAPCertStoreParameters params;

    static {
        char c2 = 0;
        while (true) {
            String[] strArr = FILTER_ESCAPE_TABLE;
            if (c2 >= strArr.length) {
                strArr[42] = "\\2a";
                strArr[40] = "\\28";
                strArr[41] = "\\29";
                strArr[92] = "\\5c";
                strArr[0] = "\\00";
                LDAP_PROVIDER = "com.sun.jndi.ldap.LdapCtxFactory";
                REFERRALS_IGNORE = "ignore";
                return;
            }
            strArr[c2] = String.valueOf(c2);
            c2 = (char) (c2 + 1);
        }
    }

    public X509LDAPCertStoreSpi(CertStoreParameters certStoreParameters) throws InvalidAlgorithmParameterException {
        super(certStoreParameters);
        if (certStoreParameters instanceof X509LDAPCertStoreParameters) {
            this.params = (X509LDAPCertStoreParameters) certStoreParameters;
            return;
        }
        throw new InvalidAlgorithmParameterException(X509LDAPCertStoreSpi.class.getName() + ": parameter must be a " + X509LDAPCertStoreParameters.class.getName() + " object\n" + certStoreParameters.toString());
    }

    private Set certSubjectSerialSearch(X509CertSelector x509CertSelector, String[] strArr, String str, String str2) throws CertStoreException {
        String name;
        String string;
        Set setSearch;
        HashSet hashSet = new HashSet();
        try {
            if (x509CertSelector.getSubjectAsBytes() == null && x509CertSelector.getSubjectAsString() == null && x509CertSelector.getCertificate() == null) {
                setSearch = search(str, "*", strArr);
            } else {
                if (x509CertSelector.getCertificate() != null) {
                    name = x509CertSelector.getCertificate().getSubjectX500Principal().getName("RFC1779");
                    string = x509CertSelector.getCertificate().getSerialNumber().toString();
                } else {
                    name = x509CertSelector.getSubjectAsBytes() != null ? new X500Principal(x509CertSelector.getSubjectAsBytes()).getName("RFC1779") : x509CertSelector.getSubjectAsString();
                    string = null;
                }
                hashSet.addAll(search(str, "*" + parseDN(name, str2) + "*", strArr));
                if (string == null || this.params.getSearchForSerialNumberIn() == null) {
                    return hashSet;
                }
                setSearch = search(this.params.getSearchForSerialNumberIn(), "*" + string + "*", strArr);
            }
            hashSet.addAll(setSearch);
            return hashSet;
        } catch (IOException e2) {
            throw new CertStoreException(AbstractC4801l.m9733g("exception processing selector: ", e2));
        }
    }

    private DirContext connectLDAP() {
        Properties properties = new Properties();
        properties.setProperty("java.naming.factory.initial", LDAP_PROVIDER);
        properties.setProperty("java.naming.batchsize", "0");
        properties.setProperty("java.naming.provider.url", this.params.getLdapURL());
        properties.setProperty("java.naming.factory.url.pkgs", URL_CONTEXT_PREFIX);
        properties.setProperty("java.naming.referral", REFERRALS_IGNORE);
        properties.setProperty("java.naming.security.authentication", SEARCH_SECURITY_LEVEL);
        return new InitialDirContext(properties);
    }

    private String filterEncode(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str.length() * 2);
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            String[] strArr = FILTER_ESCAPE_TABLE;
            if (cCharAt < strArr.length) {
                sb2.append(strArr[cCharAt]);
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    private Set getCACertificates(X509CertSelector x509CertSelector) throws CertStoreException {
        String[] strArr = {this.params.getCACertificateAttribute()};
        Set setCertSubjectSerialSearch = certSubjectSerialSearch(x509CertSelector, strArr, this.params.getLdapCACertificateAttributeName(), this.params.getCACertificateSubjectAttributeName());
        if (setCertSubjectSerialSearch.isEmpty()) {
            setCertSubjectSerialSearch.addAll(search(null, "*", strArr));
        }
        return setCertSubjectSerialSearch;
    }

    private Set getCrossCertificates(X509CertSelector x509CertSelector) throws CertStoreException {
        String[] strArr = {this.params.getCrossCertificateAttribute()};
        Set setCertSubjectSerialSearch = certSubjectSerialSearch(x509CertSelector, strArr, this.params.getLdapCrossCertificateAttributeName(), this.params.getCrossCertificateSubjectAttributeName());
        if (setCertSubjectSerialSearch.isEmpty()) {
            setCertSubjectSerialSearch.addAll(search(null, "*", strArr));
        }
        return setCertSubjectSerialSearch;
    }

    private Set getEndCertificates(X509CertSelector x509CertSelector) {
        return certSubjectSerialSearch(x509CertSelector, new String[]{this.params.getUserCertificateAttribute()}, this.params.getLdapUserCertificateAttributeName(), this.params.getUserCertificateSubjectAttributeName());
    }

    private String parseDN(String str, String str2) {
        String strSubstring = str.substring(str2.length() + str.toLowerCase().indexOf(str2.toLowerCase()));
        int iIndexOf = strSubstring.indexOf(44);
        if (iIndexOf == -1) {
            iIndexOf = strSubstring.length();
        }
        while (strSubstring.charAt(iIndexOf - 1) == '\\') {
            iIndexOf = strSubstring.indexOf(44, iIndexOf + 1);
            if (iIndexOf == -1) {
                iIndexOf = strSubstring.length();
            }
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(61) + 1);
        if (strSubstring3.charAt(0) == ' ') {
            strSubstring3 = strSubstring3.substring(1);
        }
        if (strSubstring3.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)) {
            strSubstring3 = strSubstring3.substring(1);
        }
        if (strSubstring3.endsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)) {
            strSubstring3 = strSubstring3.substring(0, strSubstring3.length() - 1);
        }
        return filterEncode(strSubstring3);
    }

    private Set search(String str, String str2, String[] strArr) {
        String strM7379l = m0.m7379l(str, "=", str2);
        DirContext dirContextConnectLDAP = null;
        if (str == null) {
            strM7379l = null;
        }
        HashSet hashSet = new HashSet();
        try {
            try {
                dirContextConnectLDAP = connectLDAP();
                SearchControls searchControls = new SearchControls();
                searchControls.setSearchScope(2);
                searchControls.setCountLimit(0L);
                for (String str3 : strArr) {
                    String[] strArr2 = {str3};
                    searchControls.setReturningAttributes(strArr2);
                    String str4 = "(&(" + strM7379l + ")(" + strArr2[0] + "=*))";
                    if (strM7379l == null) {
                        str4 = "(" + strArr2[0] + "=*)";
                    }
                    NamingEnumeration namingEnumerationSearch = dirContextConnectLDAP.search(this.params.getBaseDN(), str4, searchControls);
                    while (namingEnumerationSearch.hasMoreElements()) {
                        NamingEnumeration all = ((Attribute) ((SearchResult) namingEnumerationSearch.next()).getAttributes().getAll().next()).getAll();
                        while (all.hasMore()) {
                            hashSet.add(all.next());
                        }
                    }
                }
                if (dirContextConnectLDAP != null) {
                    try {
                        dirContextConnectLDAP.close();
                    } catch (Exception unused) {
                    }
                }
                return hashSet;
            } catch (Exception e2) {
                throw new CertStoreException("Error getting results from LDAP directory " + e2);
            }
        } catch (Throwable th2) {
            if (dirContextConnectLDAP != null) {
                try {
                    dirContextConnectLDAP.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCRLs(CRLSelector cRLSelector) throws CertificateException, CRLException, NoSuchProviderException, CertStoreException {
        String certificateRevocationListIssuerAttributeName;
        String name;
        String[] strArr = {this.params.getCertificateRevocationListAttribute()};
        if (!(cRLSelector instanceof X509CRLSelector)) {
            throw new CertStoreException("selector is not a X509CRLSelector");
        }
        X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
        HashSet hashSet = new HashSet();
        String ldapCertificateRevocationListAttributeName = this.params.getLdapCertificateRevocationListAttributeName();
        HashSet hashSet2 = new HashSet();
        if (x509CRLSelector.getIssuerNames() != null) {
            for (Object obj : x509CRLSelector.getIssuerNames()) {
                if (obj instanceof String) {
                    certificateRevocationListIssuerAttributeName = this.params.getCertificateRevocationListIssuerAttributeName();
                    name = (String) obj;
                } else {
                    certificateRevocationListIssuerAttributeName = this.params.getCertificateRevocationListIssuerAttributeName();
                    name = new X500Principal((byte[]) obj).getName("RFC1779");
                }
                hashSet2.addAll(search(ldapCertificateRevocationListAttributeName, AbstractC5601a.m11238i("*", parseDN(name, certificateRevocationListIssuerAttributeName), "*"), strArr));
            }
        } else {
            hashSet2.addAll(search(ldapCertificateRevocationListAttributeName, "*", strArr));
        }
        hashSet2.addAll(search(null, "*", strArr));
        Iterator it = hashSet2.iterator();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509", "BC");
            while (it.hasNext()) {
                CRL crlGenerateCRL = certificateFactory.generateCRL(new ByteArrayInputStream((byte[]) it.next()));
                if (x509CRLSelector.match(crlGenerateCRL)) {
                    hashSet.add(crlGenerateCRL);
                }
            }
            return hashSet;
        } catch (Exception e2) {
            throw new CertStoreException(AbstractC0030c.m120k("CRL cannot be constructed from LDAP result ", e2));
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCertificates(CertSelector certSelector) throws CertificateException, NoSuchProviderException, CertStoreException {
        if (!(certSelector instanceof X509CertSelector)) {
            throw new CertStoreException("selector is not a X509CertSelector");
        }
        X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
        HashSet hashSet = new HashSet();
        Set<byte[]> endCertificates = getEndCertificates(x509CertSelector);
        endCertificates.addAll(getCACertificates(x509CertSelector));
        endCertificates.addAll(getCrossCertificates(x509CertSelector));
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509", "BC");
            for (byte[] bArr : endCertificates) {
                if (bArr != null && bArr.length != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bArr);
                    try {
                        CertificatePair certificatePair = CertificatePair.getInstance(new ASN1InputStream(bArr).readObject());
                        arrayList.clear();
                        if (certificatePair.getForward() != null) {
                            arrayList.add(certificatePair.getForward().getEncoded());
                        }
                        if (certificatePair.getReverse() != null) {
                            arrayList.add(certificatePair.getReverse().getEncoded());
                        }
                    } catch (IOException | IllegalArgumentException unused) {
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream((byte[]) it.next()));
                            if (x509CertSelector.match(certificateGenerateCertificate)) {
                                hashSet.add(certificateGenerateCertificate);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            return hashSet;
        } catch (Exception e2) {
            throw new CertStoreException(AbstractC0030c.m120k("certificate cannot be constructed from LDAP result: ", e2));
        }
    }
}
