package org.bouncycastle.x509.util;

import a2.AbstractC0030c;
import com.amplifyframework.core.model.ModelIdentifier;
import com.sun.mail.util.AbstractC1452a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.security.auth.x500.X500Principal;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.jce.provider.X509AttrCertParser;
import org.bouncycastle.jce.provider.X509CRLParser;
import org.bouncycastle.jce.provider.X509CertPairParser;
import org.bouncycastle.jce.provider.X509CertParser;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509CRLStoreSelector;
import org.bouncycastle.x509.X509CertPairStoreSelector;
import org.bouncycastle.x509.X509CertStoreSelector;
import org.bouncycastle.x509.X509CertificatePair;
import p020v.a1;

/* loaded from: classes3.dex */
public class LDAPStoreHelper {
    private static String LDAP_PROVIDER = "com.sun.jndi.ldap.LdapCtxFactory";
    private static String REFERRALS_IGNORE = "ignore";
    private static final String SEARCH_SECURITY_LEVEL = "none";
    private static final String URL_CONTEXT_PREFIX = "com.sun.jndi.url";
    private static int cacheSize = 32;
    private static long lifeTime = 60000;
    private Map cacheMap = new HashMap(cacheSize);
    private X509LDAPCertStoreParameters params;

    public LDAPStoreHelper(X509LDAPCertStoreParameters x509LDAPCertStoreParameters) {
        this.params = x509LDAPCertStoreParameters;
    }

    private synchronized void addToCache(String str, List list) {
        try {
            Date date = new Date(System.currentTimeMillis());
            ArrayList arrayList = new ArrayList();
            arrayList.add(date);
            arrayList.add(list);
            if (!this.cacheMap.containsKey(str) && this.cacheMap.size() >= cacheSize) {
                long time = date.getTime();
                Object key = null;
                for (Map.Entry entry : this.cacheMap.entrySet()) {
                    long time2 = ((Date) ((List) entry.getValue()).get(0)).getTime();
                    if (time2 < time) {
                        key = entry.getKey();
                        time = time2;
                    }
                }
                this.cacheMap.remove(key);
            }
            this.cacheMap.put(str, arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List attrCertSubjectSerialSearch(org.bouncycastle.x509.X509AttributeCertStoreSelector r6, java.lang.String[] r7, java.lang.String[] r8, java.lang.String[] r9) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            org.bouncycastle.x509.AttributeCertificateHolder r2 = r6.getHolder()
            r3 = 0
            if (r2 == 0) goto L3d
            org.bouncycastle.x509.AttributeCertificateHolder r2 = r6.getHolder()
            java.math.BigInteger r2 = r2.getSerialNumber()
            if (r2 == 0) goto L2a
            org.bouncycastle.x509.AttributeCertificateHolder r2 = r6.getHolder()
            java.math.BigInteger r2 = r2.getSerialNumber()
            java.lang.String r2 = r2.toString()
            r1.add(r2)
        L2a:
            org.bouncycastle.x509.AttributeCertificateHolder r2 = r6.getHolder()
            java.security.Principal[] r2 = r2.getEntityNames()
            if (r2 == 0) goto L3d
            org.bouncycastle.x509.AttributeCertificateHolder r2 = r6.getHolder()
            java.security.Principal[] r2 = r2.getEntityNames()
            goto L3e
        L3d:
            r2 = r3
        L3e:
            org.bouncycastle.x509.X509AttributeCertificate r4 = r6.getAttributeCert()
            if (r4 == 0) goto L6d
            org.bouncycastle.x509.X509AttributeCertificate r4 = r6.getAttributeCert()
            org.bouncycastle.x509.AttributeCertificateHolder r4 = r4.getHolder()
            java.security.Principal[] r4 = r4.getEntityNames()
            if (r4 == 0) goto L5e
            org.bouncycastle.x509.X509AttributeCertificate r2 = r6.getAttributeCert()
            org.bouncycastle.x509.AttributeCertificateHolder r2 = r2.getHolder()
            java.security.Principal[] r2 = r2.getEntityNames()
        L5e:
            org.bouncycastle.x509.X509AttributeCertificate r4 = r6.getAttributeCert()
            java.math.BigInteger r4 = r4.getSerialNumber()
            java.lang.String r4 = r4.toString()
            r1.add(r4)
        L6d:
            r4 = 0
            if (r2 == 0) goto L83
            r2 = r2[r4]
            boolean r3 = r2 instanceof javax.security.auth.x500.X500Principal
            if (r3 == 0) goto L7f
            javax.security.auth.x500.X500Principal r2 = (javax.security.auth.x500.X500Principal) r2
            java.lang.String r3 = "RFC1779"
            java.lang.String r3 = r2.getName(r3)
            goto L83
        L7f:
            java.lang.String r3 = r2.getName()
        L83:
            java.math.BigInteger r2 = r6.getSerialNumber()
            if (r2 == 0) goto L94
            java.math.BigInteger r6 = r6.getSerialNumber()
            java.lang.String r6 = r6.toString()
            r1.add(r6)
        L94:
            java.lang.String r6 = "*"
            if (r3 == 0) goto Laf
        L98:
            int r2 = r9.length
            if (r4 >= r2) goto Laf
            r2 = r9[r4]
            java.lang.String r2 = r5.parseDN(r3, r2)
            java.lang.String r2 = org.bouncycastle.jcajce.provider.digest.AbstractC5601a.m11238i(r6, r2, r6)
            java.util.List r2 = r5.search(r8, r2, r7)
            r0.addAll(r2)
            int r4 = r4 + 1
            goto L98
        Laf:
            int r9 = r1.size()
            if (r9 <= 0) goto Ldf
            org.bouncycastle.jce.X509LDAPCertStoreParameters r9 = r5.params
            java.lang.String r9 = r9.getSearchForSerialNumberIn()
            if (r9 == 0) goto Ldf
            java.util.Iterator r9 = r1.iterator()
        Lc1:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Ldf
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            org.bouncycastle.jce.X509LDAPCertStoreParameters r4 = r5.params
            java.lang.String r4 = r4.getSearchForSerialNumberIn()
            java.lang.String[] r4 = r5.splitString(r4)
            java.util.List r2 = r5.search(r4, r2, r7)
            r0.addAll(r2)
            goto Lc1
        Ldf:
            int r9 = r1.size()
            if (r9 != 0) goto Lee
            if (r3 != 0) goto Lee
            java.util.List r6 = r5.search(r8, r6, r7)
            r0.addAll(r6)
        Lee:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.util.LDAPStoreHelper.attrCertSubjectSerialSearch(org.bouncycastle.x509.X509AttributeCertStoreSelector, java.lang.String[], java.lang.String[], java.lang.String[]):java.util.List");
    }

    private List cRLIssuerSearch(X509CRLStoreSelector x509CRLStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (x509CRLStoreSelector.getIssuers() != null) {
            hashSet.addAll(x509CRLStoreSelector.getIssuers());
        }
        if (x509CRLStoreSelector.getCertificateChecking() != null) {
            hashSet.add(getCertificateIssuer(x509CRLStoreSelector.getCertificateChecking()));
        }
        if (x509CRLStoreSelector.getAttrCertificateChecking() != null) {
            for (Principal principal : x509CRLStoreSelector.getAttrCertificateChecking().getIssuer().getPrincipals()) {
                if (principal instanceof X500Principal) {
                    hashSet.add(principal);
                }
            }
        }
        Iterator it = hashSet.iterator();
        String name = null;
        while (it.hasNext()) {
            name = ((X500Principal) it.next()).getName("RFC1779");
            for (String str : strArr3) {
                arrayList.addAll(search(strArr2, AbstractC5601a.m11238i("*", parseDN(name, str), "*"), strArr));
            }
        }
        if (name == null) {
            arrayList.addAll(search(strArr2, "*", strArr));
        }
        return arrayList;
    }

    private List certSubjectSerialSearch(X509CertStoreSelector x509CertStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws IOException {
        ArrayList arrayList = new ArrayList();
        String subjectAsString = getSubjectAsString(x509CertStoreSelector);
        String string = x509CertStoreSelector.getSerialNumber() != null ? x509CertStoreSelector.getSerialNumber().toString() : null;
        if (x509CertStoreSelector.getCertificate() != null) {
            subjectAsString = x509CertStoreSelector.getCertificate().getSubjectX500Principal().getName("RFC1779");
            string = x509CertStoreSelector.getCertificate().getSerialNumber().toString();
        }
        if (subjectAsString != null) {
            for (String str : strArr3) {
                arrayList.addAll(search(strArr2, AbstractC5601a.m11238i("*", parseDN(subjectAsString, str), "*"), strArr));
            }
        }
        if (string != null && this.params.getSearchForSerialNumberIn() != null) {
            arrayList.addAll(search(splitString(this.params.getSearchForSerialNumberIn()), string, strArr));
        }
        if (string == null && subjectAsString == null) {
            arrayList.addAll(search(strArr2, "*", strArr));
        }
        return arrayList;
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

    private Set createAttributeCertificates(List list, X509AttributeCertStoreSelector x509AttributeCertStoreSelector) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        X509AttrCertParser x509AttrCertParser = new X509AttrCertParser();
        while (it.hasNext()) {
            try {
                x509AttrCertParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509AttributeCertificate x509AttributeCertificate = (X509AttributeCertificate) x509AttrCertParser.engineRead();
                if (x509AttributeCertStoreSelector.match(x509AttributeCertificate)) {
                    hashSet.add(x509AttributeCertificate);
                }
            } catch (StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    private Set createCRLs(List list, X509CRLStoreSelector x509CRLStoreSelector) {
        HashSet hashSet = new HashSet();
        X509CRLParser x509CRLParser = new X509CRLParser();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                x509CRLParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509CRL x509crl = (X509CRL) x509CRLParser.engineRead();
                if (x509CRLStoreSelector.match((Object) x509crl)) {
                    hashSet.add(x509crl);
                }
            } catch (StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    private Set createCerts(List list, X509CertStoreSelector x509CertStoreSelector) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        X509CertParser x509CertParser = new X509CertParser();
        while (it.hasNext()) {
            try {
                x509CertParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509Certificate x509Certificate = (X509Certificate) x509CertParser.engineRead();
                if (x509CertStoreSelector.match((Object) x509Certificate)) {
                    hashSet.add(x509Certificate);
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    private Set createCrossCertificatePairs(List list, X509CertPairStoreSelector x509CertPairStoreSelector) {
        X509CertificatePair x509CertificatePair;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (i10 < list.size()) {
            try {
                try {
                    X509CertPairParser x509CertPairParser = new X509CertPairParser();
                    x509CertPairParser.engineInit(new ByteArrayInputStream((byte[]) list.get(i10)));
                    x509CertificatePair = (X509CertificatePair) x509CertPairParser.engineRead();
                } catch (IOException | CertificateParsingException unused) {
                }
            } catch (StreamParsingException unused2) {
                int i11 = i10 + 1;
                i10 = i11;
                x509CertificatePair = new X509CertificatePair(new CertificatePair(Certificate.getInstance(new ASN1InputStream((byte[]) list.get(i10)).readObject()), Certificate.getInstance(new ASN1InputStream((byte[]) list.get(i11)).readObject())));
            }
            if (x509CertPairStoreSelector.match(x509CertificatePair)) {
                hashSet.add(x509CertificatePair);
            }
            i10++;
        }
        return hashSet;
    }

    private List crossCertificatePairSubjectSearch(X509CertPairStoreSelector x509CertPairStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) {
        ArrayList arrayList = new ArrayList();
        String subjectAsString = x509CertPairStoreSelector.getForwardSelector() != null ? getSubjectAsString(x509CertPairStoreSelector.getForwardSelector()) : null;
        if (x509CertPairStoreSelector.getCertPair() != null && x509CertPairStoreSelector.getCertPair().getForward() != null) {
            subjectAsString = x509CertPairStoreSelector.getCertPair().getForward().getSubjectX500Principal().getName("RFC1779");
        }
        if (subjectAsString != null) {
            for (String str : strArr3) {
                arrayList.addAll(search(strArr2, AbstractC5601a.m11238i("*", parseDN(subjectAsString, str), "*"), strArr));
            }
        }
        if (subjectAsString == null) {
            arrayList.addAll(search(strArr2, "*", strArr));
        }
        return arrayList;
    }

    private X500Principal getCertificateIssuer(X509Certificate x509Certificate) {
        return x509Certificate.getIssuerX500Principal();
    }

    private List getFromCache(String str) {
        List list = (List) this.cacheMap.get(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (list == null || ((Date) list.get(0)).getTime() < jCurrentTimeMillis - lifeTime) {
            return null;
        }
        return (List) list.get(1);
    }

    private String getSubjectAsString(X509CertStoreSelector x509CertStoreSelector) throws IOException {
        try {
            byte[] subjectAsBytes = x509CertStoreSelector.getSubjectAsBytes();
            if (subjectAsBytes != null) {
                return new X500Principal(subjectAsBytes).getName("RFC1779");
            }
            return null;
        } catch (IOException e2) {
            throw new StoreException(AbstractC4801l.m9731e(e2, new StringBuilder("exception processing name: ")), e2);
        }
    }

    private String parseDN(String str, String str2) {
        int iIndexOf = str.toLowerCase().indexOf(str2.toLowerCase() + "=");
        if (iIndexOf == -1) {
            return "";
        }
        String strSubstring = str.substring(str2.length() + iIndexOf);
        int iIndexOf2 = strSubstring.indexOf(44);
        if (iIndexOf2 == -1) {
            iIndexOf2 = strSubstring.length();
        }
        while (strSubstring.charAt(iIndexOf2 - 1) == '\\') {
            iIndexOf2 = strSubstring.indexOf(44, iIndexOf2 + 1);
            if (iIndexOf2 == -1) {
                iIndexOf2 = strSubstring.length();
            }
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf2);
        String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(61) + 1);
        if (strSubstring3.charAt(0) == ' ') {
            strSubstring3 = strSubstring3.substring(1);
        }
        if (strSubstring3.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)) {
            strSubstring3 = strSubstring3.substring(1);
        }
        return strSubstring3.endsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR) ? strSubstring3.substring(0, strSubstring3.length() - 1) : strSubstring3;
    }

    private List search(String[] strArr, String str, String[] strArr2) {
        String strM11238i;
        DirContext dirContextConnectLDAP = null;
        if (strArr == null) {
            strM11238i = null;
        } else {
            if (str.equals("**")) {
                str = "*";
            }
            String strM124o = "";
            for (String str2 : strArr) {
                strM124o = AbstractC0030c.m124o(AbstractC5601a.m11245p(strM124o, "("), str2, "=", str, ")");
            }
            strM11238i = AbstractC5601a.m11238i("(|", strM124o, ")");
        }
        String strM4564k = "";
        for (String str3 : strArr2) {
            strM4564k = AbstractC1452a.m4564k(AbstractC5601a.m11245p(strM4564k, "("), str3, "=*)");
        }
        String strM11238i2 = AbstractC5601a.m11238i("(|", strM4564k, ")");
        String strM14333m = a1.m14333m("(&", strM11238i, "", strM11238i2, ")");
        if (strM11238i != null) {
            strM11238i2 = strM14333m;
        }
        List fromCache = getFromCache(strM11238i2);
        if (fromCache != null) {
            return fromCache;
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                dirContextConnectLDAP = connectLDAP();
                SearchControls searchControls = new SearchControls();
                searchControls.setSearchScope(2);
                searchControls.setCountLimit(0L);
                searchControls.setReturningAttributes(strArr2);
                NamingEnumeration namingEnumerationSearch = dirContextConnectLDAP.search(this.params.getBaseDN(), strM11238i2, searchControls);
                while (namingEnumerationSearch.hasMoreElements()) {
                    NamingEnumeration all = ((Attribute) ((SearchResult) namingEnumerationSearch.next()).getAttributes().getAll().next()).getAll();
                    while (all.hasMore()) {
                        arrayList.add(all.next());
                    }
                }
                addToCache(strM11238i2, arrayList);
                dirContextConnectLDAP.close();
                return arrayList;
            } catch (Exception unused) {
                return arrayList;
            }
        } catch (NamingException unused2) {
            if (dirContextConnectLDAP != null) {
                dirContextConnectLDAP.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            if (dirContextConnectLDAP != null) {
                try {
                    dirContextConnectLDAP.close();
                } catch (Exception unused3) {
                }
            }
            throw th2;
        }
    }

    private String[] splitString(String str) {
        return str.split("\\s+");
    }

    public Collection getAACertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) {
        String[] strArrSplitString = splitString(this.params.getAACertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAACertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAACertificateSubjectAttributeName());
        Set setCreateAttributeCertificates = createAttributeCertificates(attrCertSubjectSerialSearch(x509AttributeCertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector);
        if (setCreateAttributeCertificates.size() == 0) {
            setCreateAttributeCertificates.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector));
        }
        return setCreateAttributeCertificates;
    }

    public Collection getAttributeAuthorityRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) {
        String[] strArrSplitString = splitString(this.params.getAttributeAuthorityRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAttributeAuthorityRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAttributeAuthorityRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
        }
        return setCreateCRLs;
    }

    public Collection getAttributeCertificateAttributes(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) {
        String[] strArrSplitString = splitString(this.params.getAttributeCertificateAttributeAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAttributeCertificateAttributeAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAttributeCertificateAttributeSubjectAttributeName());
        Set setCreateAttributeCertificates = createAttributeCertificates(attrCertSubjectSerialSearch(x509AttributeCertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector);
        if (setCreateAttributeCertificates.size() == 0) {
            setCreateAttributeCertificates.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector));
        }
        return setCreateAttributeCertificates;
    }

    public Collection getAttributeCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) {
        String[] strArrSplitString = splitString(this.params.getAttributeCertificateRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAttributeCertificateRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAttributeCertificateRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
        }
        return setCreateCRLs;
    }

    public Collection getAttributeDescriptorCertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) {
        String[] strArrSplitString = splitString(this.params.getAttributeDescriptorCertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAttributeDescriptorCertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAttributeDescriptorCertificateSubjectAttributeName());
        Set setCreateAttributeCertificates = createAttributeCertificates(attrCertSubjectSerialSearch(x509AttributeCertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector);
        if (setCreateAttributeCertificates.size() == 0) {
            setCreateAttributeCertificates.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector));
        }
        return setCreateAttributeCertificates;
    }

    public Collection getAuthorityRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) {
        String[] strArrSplitString = splitString(this.params.getAuthorityRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAuthorityRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAuthorityRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
        }
        return setCreateCRLs;
    }

    public Collection getCACertificates(X509CertStoreSelector x509CertStoreSelector) {
        String[] strArrSplitString = splitString(this.params.getCACertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapCACertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getCACertificateSubjectAttributeName());
        Set setCreateCerts = createCerts(certSubjectSerialSearch(x509CertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertStoreSelector);
        if (setCreateCerts.size() == 0) {
            setCreateCerts.addAll(createCerts(certSubjectSerialSearch(new X509CertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertStoreSelector));
        }
        return setCreateCerts;
    }

    public Collection getCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) {
        String[] strArrSplitString = splitString(this.params.getCertificateRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapCertificateRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getCertificateRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
        }
        return setCreateCRLs;
    }

    public Collection getCrossCertificatePairs(X509CertPairStoreSelector x509CertPairStoreSelector) {
        String[] strArrSplitString = splitString(this.params.getCrossCertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapCrossCertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getCrossCertificateSubjectAttributeName());
        Set setCreateCrossCertificatePairs = createCrossCertificatePairs(crossCertificatePairSubjectSearch(x509CertPairStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertPairStoreSelector);
        if (setCreateCrossCertificatePairs.size() == 0) {
            X509CertStoreSelector x509CertStoreSelector = new X509CertStoreSelector();
            X509CertPairStoreSelector x509CertPairStoreSelector2 = new X509CertPairStoreSelector();
            x509CertPairStoreSelector2.setForwardSelector(x509CertStoreSelector);
            x509CertPairStoreSelector2.setReverseSelector(x509CertStoreSelector);
            setCreateCrossCertificatePairs.addAll(createCrossCertificatePairs(crossCertificatePairSubjectSearch(x509CertPairStoreSelector2, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertPairStoreSelector));
        }
        return setCreateCrossCertificatePairs;
    }

    public Collection getDeltaCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) {
        String[] strArrSplitString = splitString(this.params.getDeltaRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapDeltaRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getDeltaRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
        }
        return setCreateCRLs;
    }

    public Collection getUserCertificates(X509CertStoreSelector x509CertStoreSelector) {
        String[] strArrSplitString = splitString(this.params.getUserCertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapUserCertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getUserCertificateSubjectAttributeName());
        Set setCreateCerts = createCerts(certSubjectSerialSearch(x509CertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertStoreSelector);
        if (setCreateCerts.size() == 0) {
            setCreateCerts.addAll(createCerts(certSubjectSerialSearch(new X509CertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertStoreSelector));
        }
        return setCreateCerts;
    }
}
