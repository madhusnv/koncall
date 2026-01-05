package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.BCStyle;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.jcajce.PKIXCertRevocationChecker;
import org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class RFC3280CertPathUtilities {
    public static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    private static final Class revChkClass = ClassUtil.loadClass(RFC3280CertPathUtilities.class, "java.security.cert.PKIXRevocationChecker");
    public static final String CERTIFICATE_POLICIES = Extension.certificatePolicies.getId();
    public static final String POLICY_MAPPINGS = Extension.policyMappings.getId();
    public static final String INHIBIT_ANY_POLICY = Extension.inhibitAnyPolicy.getId();
    public static final String ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
    public static final String FRESHEST_CRL = Extension.freshestCRL.getId();
    public static final String DELTA_CRL_INDICATOR = Extension.deltaCRLIndicator.getId();
    public static final String POLICY_CONSTRAINTS = Extension.policyConstraints.getId();
    public static final String BASIC_CONSTRAINTS = Extension.basicConstraints.getId();
    public static final String CRL_DISTRIBUTION_POINTS = Extension.cRLDistributionPoints.getId();
    public static final String SUBJECT_ALTERNATIVE_NAME = Extension.subjectAlternativeName.getId();
    public static final String NAME_CONSTRAINTS = Extension.nameConstraints.getId();
    public static final String AUTHORITY_KEY_IDENTIFIER = Extension.authorityKeyIdentifier.getId();
    public static final String KEY_USAGE = Extension.keyUsage.getId();
    public static final String CRL_NUMBER = Extension.cRLNumber.getId();
    protected static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    private static void checkCRL(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, DistributionPoint distributionPoint, PKIXExtendedParameters pKIXExtendedParameters, Date date, Date date2, X509Certificate x509Certificate, X509Certificate x509Certificate2, PublicKey publicKey, CertStatus certStatus, ReasonsMask reasonsMask, List list, JcaJceHelper jcaJceHelper) throws AnnotatedException {
        Set<String> criticalExtensionOIDs;
        if (date2.getTime() > date.getTime()) {
            throw new AnnotatedException("Validation time is in future.");
        }
        Iterator it = CertPathValidatorUtilities.getCompleteCRLs(pKIXCertRevocationCheckerParameters, distributionPoint, x509Certificate, pKIXExtendedParameters, date2).iterator();
        boolean z6 = false;
        AnnotatedException e2 = null;
        while (it.hasNext() && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
            try {
                X509CRL x509crl = (X509CRL) it.next();
                ReasonsMask reasonsMaskProcessCRLD = processCRLD(x509crl, distributionPoint);
                if (reasonsMaskProcessCRLD.hasNewReasons(reasonsMask)) {
                    try {
                        X509CRL x509crlProcessCRLH = pKIXExtendedParameters.isUseDeltasEnabled() ? processCRLH(CertPathValidatorUtilities.getDeltaCRLs(date2, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores(), jcaJceHelper), processCRLG(x509crl, processCRLF(x509crl, x509Certificate, x509Certificate2, publicKey, pKIXExtendedParameters, list, jcaJceHelper))) : null;
                        if (pKIXExtendedParameters.getValidityModel() != 1 && x509Certificate.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                            throw new AnnotatedException("No valid CRL for current time found.");
                        }
                        processCRLB1(distributionPoint, x509Certificate, x509crl);
                        processCRLB2(distributionPoint, x509Certificate, x509crl);
                        processCRLC(x509crlProcessCRLH, x509crl, pKIXExtendedParameters);
                        processCRLI(date2, x509crlProcessCRLH, x509Certificate, certStatus, pKIXExtendedParameters);
                        processCRLJ(date2, x509crl, x509Certificate, certStatus);
                        if (certStatus.getCertStatus() == 8) {
                            certStatus.setCertStatus(11);
                        }
                        reasonsMask.addReasons(reasonsMaskProcessCRLD);
                        Set<String> criticalExtensionOIDs2 = x509crl.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs2 != null) {
                            HashSet hashSet = new HashSet(criticalExtensionOIDs2);
                            hashSet.remove(Extension.issuingDistributionPoint.getId());
                            hashSet.remove(Extension.deltaCRLIndicator.getId());
                            if (!hashSet.isEmpty()) {
                                throw new AnnotatedException("CRL contains unsupported critical extensions.");
                            }
                        }
                        if (x509crlProcessCRLH != null && (criticalExtensionOIDs = x509crlProcessCRLH.getCriticalExtensionOIDs()) != null) {
                            HashSet hashSet2 = new HashSet(criticalExtensionOIDs);
                            hashSet2.remove(Extension.issuingDistributionPoint.getId());
                            hashSet2.remove(Extension.deltaCRLIndicator.getId());
                            if (!hashSet2.isEmpty()) {
                                throw new AnnotatedException("Delta CRL contains unsupported critical extension.");
                            }
                        }
                        z6 = true;
                    } catch (AnnotatedException e10) {
                        e2 = e10;
                    }
                } else {
                    continue;
                }
            } catch (AnnotatedException e11) {
                e2 = e11;
            }
        }
        if (!z6) {
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void checkCRLs(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters r19, org.bouncycastle.jcajce.PKIXExtendedParameters r20, java.util.Date r21, java.util.Date r22, java.security.cert.X509Certificate r23, java.security.cert.X509Certificate r24, java.security.PublicKey r25, java.util.List r26, org.bouncycastle.jcajce.util.JcaJceHelper r27) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.checkCRLs(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters, org.bouncycastle.jcajce.PKIXExtendedParameters, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.security.PublicKey, java.util.List, org.bouncycastle.jcajce.util.JcaJceHelper):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0076, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        r5 = r18[r7].iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (r5.hasNext() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        r6 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(r6.getValidPolicy()) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        r5 = ((org.bouncycastle.asn1.ASN1Sequence) org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r4, org.bouncycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES)).getObjects();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (r5.hasMoreElements() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        r8 = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(r5.nextElement());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:
    
        if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(r8.getPolicyIdentifier().getId()) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
    
        r5 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getQualifierSet(r8.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f8, code lost:
    
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0102, code lost:
    
        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy qualifier info set could not be decoded.", r0, r16, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0103, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010b, code lost:
    
        throw new java.security.cert.CertPathValidatorException("Policy information could not be decoded.", r0, r16, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010c, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0112, code lost:
    
        if (r4.getCriticalExtensionOIDs() == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        r12 = r4.getCriticalExtensionOIDs().contains(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0121, code lost:
    
        r5 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r6.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012f, code lost:
    
        if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(r5.getValidPolicy()) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0131, code lost:
    
        r5 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r7, (java.util.Set) r13.get(r11), r5, r10, r11, r12);
        r5.addChild(r5);
        r18[r7].add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0154, code lost:
    
        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Certificate policies extension could not be decoded.", r0, r16, r17);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.bouncycastle.jce.provider.PKIXPolicyNode prepareCertB(java.security.cert.CertPath r16, int r17, java.util.List[] r18, org.bouncycastle.jce.provider.PKIXPolicyNode r19, int r20) throws java.security.cert.CertPathValidatorException {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareCertB(java.security.cert.CertPath, int, java.util.List[], org.bouncycastle.jce.provider.PKIXPolicyNode, int):org.bouncycastle.jce.provider.PKIXPolicyNode");
    }

    public static void prepareNextCertA(CertPath certPath, int i10) throws CertPathValidatorException {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i10), POLICY_MAPPINGS));
            if (aSN1Sequence != null) {
                for (int i11 = 0; i11 < aSN1Sequence.size(); i11++) {
                    try {
                        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i11));
                        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(0));
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(1));
                        if (ANY_POLICY.equals(aSN1ObjectIdentifier.getId())) {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certPath, i10);
                        }
                        if (ANY_POLICY.equals(aSN1ObjectIdentifier2.getId())) {
                            throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy", null, certPath, i10);
                        }
                    } catch (Exception e2) {
                        throw new ExtCertPathValidatorException("Policy mappings extension contents could not be decoded.", e2, certPath, i10);
                    }
                }
            }
        } catch (AnnotatedException e10) {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", e10, certPath, i10);
        }
    }

    public static void prepareNextCertG(CertPath certPath, int i10, PKIXNameConstraintValidator pKIXNameConstraintValidator) throws ExtCertPathValidatorException {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i10), NAME_CONSTRAINTS));
            NameConstraints nameConstraints = aSN1Sequence != null ? NameConstraints.getInstance(aSN1Sequence) : null;
            if (nameConstraints != null) {
                GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                if (permittedSubtrees != null) {
                    try {
                        pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                    } catch (Exception e2) {
                        throw new ExtCertPathValidatorException("Permitted subtrees cannot be build from name constraints extension.", e2, certPath, i10);
                    }
                }
                GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                if (excludedSubtrees != null) {
                    for (int i11 = 0; i11 != excludedSubtrees.length; i11++) {
                        try {
                            pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i11]);
                        } catch (Exception e10) {
                            throw new ExtCertPathValidatorException("Excluded subtrees cannot be build from name constraints extension.", e10, certPath, i10);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            throw new ExtCertPathValidatorException("Name constraints extension could not be decoded.", e11, certPath, i10);
        }
    }

    public static int prepareNextCertH1(CertPath certPath, int i10, int i11) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i10)) || i11 == 0) ? i11 : i11 - 1;
    }

    public static int prepareNextCertH2(CertPath certPath, int i10, int i11) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i10)) || i11 == 0) ? i11 : i11 - 1;
    }

    public static int prepareNextCertH3(CertPath certPath, int i10, int i11) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i10)) || i11 == 0) ? i11 : i11 - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r3 = org.bouncycastle.asn1.ASN1Integer.getInstance(r1, false).intValueExact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r3 >= r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int prepareNextCertI1(java.security.cert.CertPath r3, int r4, int r5) throws org.bouncycastle.jce.exception.ExtCertPathValidatorException {
        /*
            java.util.List r0 = r3.getCertificates()
            java.lang.Object r0 = r0.get(r4)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L44
            org.bouncycastle.asn1.ASN1Primitive r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L44
            org.bouncycastle.asn1.ASN1Sequence r0 = org.bouncycastle.asn1.ASN1Sequence.getInstance(r0)     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L43
            java.util.Enumeration r0 = r0.getObjects()
        L1a:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3a
            org.bouncycastle.asn1.ASN1TaggedObject r1 = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(r1)     // Catch: java.lang.IllegalArgumentException -> L3a
            int r2 = r1.getTagNo()     // Catch: java.lang.IllegalArgumentException -> L3a
            if (r2 != 0) goto L1a
            r0 = 0
            org.bouncycastle.asn1.ASN1Integer r0 = org.bouncycastle.asn1.ASN1Integer.getInstance(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3a
            int r3 = r0.intValueExact()     // Catch: java.lang.IllegalArgumentException -> L3a
            if (r3 >= r5) goto L43
            return r3
        L3a:
            r5 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension contents cannot be decoded."
            r0.<init>(r1, r5, r3, r4)
            throw r0
        L43:
            return r5
        L44:
            r5 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension cannot be decoded."
            r0.<init>(r1, r5, r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI1(java.security.cert.CertPath, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        r4 = org.bouncycastle.asn1.ASN1Integer.getInstance(r1, false).intValueExact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r4 >= r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int prepareNextCertI2(java.security.cert.CertPath r4, int r5, int r6) throws org.bouncycastle.jce.exception.ExtCertPathValidatorException {
        /*
            java.util.List r0 = r4.getCertificates()
            java.lang.Object r0 = r0.get(r5)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L45
            org.bouncycastle.asn1.ASN1Primitive r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L45
            org.bouncycastle.asn1.ASN1Sequence r0 = org.bouncycastle.asn1.ASN1Sequence.getInstance(r0)     // Catch: java.lang.Exception -> L45
            if (r0 == 0) goto L44
            java.util.Enumeration r0 = r0.getObjects()
        L1a:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3b
            org.bouncycastle.asn1.ASN1TaggedObject r1 = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(r1)     // Catch: java.lang.IllegalArgumentException -> L3b
            int r2 = r1.getTagNo()     // Catch: java.lang.IllegalArgumentException -> L3b
            r3 = 1
            if (r2 != r3) goto L1a
            r0 = 0
            org.bouncycastle.asn1.ASN1Integer r0 = org.bouncycastle.asn1.ASN1Integer.getInstance(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3b
            int r4 = r0.intValueExact()     // Catch: java.lang.IllegalArgumentException -> L3b
            if (r4 >= r6) goto L44
            return r4
        L3b:
            r6 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension contents cannot be decoded."
            r0.<init>(r1, r6, r4, r5)
            throw r0
        L44:
            return r6
        L45:
            r6 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension cannot be decoded."
            r0.<init>(r1, r6, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI2(java.security.cert.CertPath, int, int):int");
    }

    public static int prepareNextCertJ(CertPath certPath, int i10, int i11) throws ExtCertPathValidatorException {
        int iIntValueExact;
        try {
            ASN1Integer aSN1Integer = ASN1Integer.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i10), INHIBIT_ANY_POLICY));
            return (aSN1Integer == null || (iIntValueExact = aSN1Integer.intValueExact()) >= i11) ? i11 : iIntValueExact;
        } catch (Exception e2) {
            throw new ExtCertPathValidatorException("Inhibit any-policy extension cannot be decoded.", e2, certPath, i10);
        }
    }

    public static void prepareNextCertK(CertPath certPath, int i10) throws CertPathValidatorException {
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i10), BASIC_CONSTRAINTS));
            if (basicConstraints == null) {
                throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints", null, certPath, i10);
            }
            if (!basicConstraints.isCA()) {
                throw new CertPathValidatorException("Not a CA certificate", null, certPath, i10);
            }
        } catch (Exception e2) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e2, certPath, i10);
        }
    }

    public static int prepareNextCertL(CertPath certPath, int i10, int i11) throws ExtCertPathValidatorException {
        if (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i10))) {
            return i11;
        }
        if (i11 > 0) {
            return i11 - 1;
        }
        throw new ExtCertPathValidatorException("Max path length not greater than zero", null, certPath, i10);
    }

    public static int prepareNextCertM(CertPath certPath, int i10, int i11) throws ExtCertPathValidatorException {
        ASN1Integer pathLenConstraintInteger;
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i10), BASIC_CONSTRAINTS));
            return (basicConstraints == null || !basicConstraints.isCA() || (pathLenConstraintInteger = basicConstraints.getPathLenConstraintInteger()) == null) ? i11 : Math.min(i11, pathLenConstraintInteger.intPositiveValueExact());
        } catch (Exception e2) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e2, certPath, i10);
        }
    }

    public static void prepareNextCertN(CertPath certPath, int i10) throws ExtCertPathValidatorException {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i10)).getKeyUsage();
        if (keyUsage != null) {
            if (keyUsage.length <= 5 || !keyUsage[5]) {
                throw new ExtCertPathValidatorException("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certPath, i10);
            }
        }
    }

    public static void prepareNextCertO(CertPath certPath, int i10, Set set, List list) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e2) {
                throw new CertPathValidatorException(e2.getMessage(), e2.getCause(), certPath, i10);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i10);
    }

    public static void processCRLB1(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) throws AnnotatedException {
        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
        boolean z6 = true;
        boolean z10 = extensionValue != null && IssuingDistributionPoint.getInstance(extensionValue).isIndirectCRL();
        try {
            byte[] encoded = PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded();
            if (distributionPoint.getCRLIssuer() != null) {
                GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                boolean z11 = false;
                for (int i10 = 0; i10 < names.length; i10++) {
                    if (names[i10].getTagNo() == 4) {
                        try {
                            if (Arrays.areEqual(names[i10].getName().toASN1Primitive().getEncoded(), encoded)) {
                                z11 = true;
                            }
                        } catch (IOException e2) {
                            throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e2);
                        }
                    }
                }
                if (z11 && !z10) {
                    throw new AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect.");
                }
                if (!z11) {
                    throw new AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point.");
                }
                z6 = z11;
            } else if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getEncodedIssuerPrincipal(obj))) {
                z6 = false;
            }
            if (!z6) {
                throw new AnnotatedException("Cannot find matching CRL issuer for certificate.");
            }
        } catch (IOException e10) {
            throw new AnnotatedException(AbstractC4801l.m9731e(e10, new StringBuilder("Exception encoding CRL issuer: ")), e10);
        }
    }

    public static void processCRLB2(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) throws AnnotatedException {
        int i10;
        GeneralName[] names;
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (issuingDistributionPoint != null) {
                if (issuingDistributionPoint.getDistributionPoint() != null) {
                    DistributionPointName distributionPoint2 = IssuingDistributionPoint.getInstance(issuingDistributionPoint).getDistributionPoint();
                    ArrayList arrayList = new ArrayList();
                    if (distributionPoint2.getType() == 0) {
                        for (GeneralName generalName : GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                            arrayList.add(generalName);
                        }
                    }
                    if (distributionPoint2.getType() == 1) {
                        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                        try {
                            Enumeration objects = ASN1Sequence.getInstance(PrincipalUtils.getIssuerPrincipal(x509crl)).getObjects();
                            while (objects.hasMoreElements()) {
                                aSN1EncodableVector.add((ASN1Encodable) objects.nextElement());
                            }
                            aSN1EncodableVector.add(distributionPoint2.getName());
                            arrayList.add(new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector))));
                        } catch (Exception e2) {
                            throw new AnnotatedException("Could not read CRL issuer.", e2);
                        }
                    }
                    if (distributionPoint.getDistributionPoint() == null) {
                        if (distributionPoint.getCRLIssuer() == null) {
                            throw new AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                        }
                        GeneralName[] names2 = distributionPoint.getCRLIssuer().getNames();
                        while (i10 < names2.length) {
                            i10 = arrayList.contains(names2[i10]) ? 0 : i10 + 1;
                        }
                        throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                    }
                    DistributionPointName distributionPoint3 = distributionPoint.getDistributionPoint();
                    GeneralName[] names3 = distributionPoint3.getType() == 0 ? GeneralNames.getInstance(distributionPoint3.getName()).getNames() : null;
                    if (distributionPoint3.getType() == 1) {
                        if (distributionPoint.getCRLIssuer() != null) {
                            names = distributionPoint.getCRLIssuer().getNames();
                        } else {
                            names = new GeneralName[1];
                            try {
                                names[0] = new GeneralName(PrincipalUtils.getEncodedIssuerPrincipal(obj));
                            } catch (Exception e10) {
                                throw new AnnotatedException("Could not read certificate issuer.", e10);
                            }
                        }
                        names3 = names;
                        for (int i11 = 0; i11 < names3.length; i11++) {
                            Enumeration objects2 = ASN1Sequence.getInstance(names3[i11].getName().toASN1Primitive()).getObjects();
                            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                            while (objects2.hasMoreElements()) {
                                aSN1EncodableVector2.add((ASN1Encodable) objects2.nextElement());
                            }
                            aSN1EncodableVector2.add(distributionPoint3.getName());
                            names3[i11] = new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector2)));
                        }
                    }
                    if (names3 != null) {
                        while (i10 < names3.length) {
                            i10 = arrayList.contains(names3[i10]) ? 0 : i10 + 1;
                        }
                    }
                    throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                }
                try {
                    BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Extension) obj, BASIC_CONSTRAINTS));
                    if (obj instanceof X509Certificate) {
                        if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                            throw new AnnotatedException("CA Cert CRL only contains user certificates.");
                        }
                        if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                            throw new AnnotatedException("End CRL only contains CA certificates.");
                        }
                    }
                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                        throw new AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
                    }
                } catch (Exception e11) {
                    throw new AnnotatedException("Basic constraints extension could not be decoded.", e11);
                }
            }
        } catch (Exception e12) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e12);
        }
    }

    public static void processCRLC(X509CRL x509crl, X509CRL x509crl2, PKIXExtendedParameters pKIXExtendedParameters) throws AnnotatedException {
        if (x509crl == null) {
            return;
        }
        if (x509crl.hasUnsupportedCriticalExtension()) {
            throw new AnnotatedException("delta CRL has unsupported critical extensions");
        }
        try {
            String str = ISSUING_DISTRIBUTION_POINT;
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl2, str));
            if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getIssuerPrincipal(x509crl2))) {
                    throw new AnnotatedException("Complete CRL issuer does not match delta CRL issuer.");
                }
                try {
                    IssuingDistributionPoint issuingDistributionPoint2 = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, str));
                    if (issuingDistributionPoint != null ? !issuingDistributionPoint.equals(issuingDistributionPoint2) : issuingDistributionPoint2 != null) {
                        throw new AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                    }
                    try {
                        String str2 = AUTHORITY_KEY_IDENTIFIER;
                        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl2, str2);
                        try {
                            ASN1Primitive extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl, str2);
                            if (extensionValue == null) {
                                throw new AnnotatedException("CRL authority key identifier is null.");
                            }
                            if (extensionValue2 == null) {
                                throw new AnnotatedException("Delta CRL authority key identifier is null.");
                            }
                            if (!extensionValue.equals(extensionValue2)) {
                                throw new AnnotatedException("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                            }
                        } catch (AnnotatedException e2) {
                            throw new AnnotatedException("Authority key identifier extension could not be extracted from delta CRL.", e2);
                        }
                    } catch (AnnotatedException e10) {
                        throw new AnnotatedException("Authority key identifier extension could not be extracted from complete CRL.", e10);
                    }
                } catch (Exception e11) {
                    throw new AnnotatedException("Issuing distribution point extension from delta CRL could not be decoded.", e11);
                }
            }
        } catch (Exception e12) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e12);
        }
    }

    public static ReasonsMask processCRLD(X509CRL x509crl, DistributionPoint distributionPoint) throws AnnotatedException {
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (issuingDistributionPoint != null && issuingDistributionPoint.getOnlySomeReasons() != null && distributionPoint.getReasons() != null) {
                return new ReasonsMask(distributionPoint.getReasons()).intersect(new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
            }
            if ((issuingDistributionPoint == null || issuingDistributionPoint.getOnlySomeReasons() == null) && distributionPoint.getReasons() == null) {
                return ReasonsMask.allReasons;
            }
            return (distributionPoint.getReasons() == null ? ReasonsMask.allReasons : new ReasonsMask(distributionPoint.getReasons())).intersect(issuingDistributionPoint == null ? ReasonsMask.allReasons : new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
        } catch (Exception e2) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e2);
        }
    }

    public static Set processCRLF(X509CRL x509crl, Object obj, X509Certificate x509Certificate, PublicKey publicKey, PKIXExtendedParameters pKIXExtendedParameters, List list, JcaJceHelper jcaJceHelper) throws AnnotatedException, IOException {
        int i10;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            PKIXCertStoreSelector<? extends Certificate> pKIXCertStoreSelectorBuild = new PKIXCertStoreSelector.Builder(x509CertSelector).build();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                CertPathValidatorUtilities.findCertificates(linkedHashSet, pKIXCertStoreSelectorBuild, pKIXExtendedParameters.getCertificateStores());
                CertPathValidatorUtilities.findCertificates(linkedHashSet, pKIXCertStoreSelectorBuild, pKIXExtendedParameters.getCertStores());
                linkedHashSet.add(x509Certificate);
                Iterator it = linkedHashSet.iterator();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            CertPathBuilderSpi pKIXCertPathBuilderSpi_8 = revChkClass != null ? new PKIXCertPathBuilderSpi_8(true) : new PKIXCertPathBuilderSpi(true);
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            PKIXExtendedParameters.Builder targetConstraints = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTargetConstraints(new PKIXCertStoreSelector.Builder(x509CertSelector2).build());
                            if (list.contains(x509Certificate2)) {
                                targetConstraints.setRevocationEnabled(false);
                            } else {
                                targetConstraints.setRevocationEnabled(true);
                            }
                            List<? extends Certificate> certificates = pKIXCertPathBuilderSpi_8.engineBuild(new PKIXExtendedBuilderParameters.Builder(targetConstraints.build()).build()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(CertPathValidatorUtilities.getNextWorkingKey(certificates, 0, jcaJceHelper));
                        } catch (CertPathBuilderException e2) {
                            throw new AnnotatedException("CertPath for CRL signer failed to validate.", e2);
                        } catch (CertPathValidatorException e10) {
                            throw new AnnotatedException("Public key of issuer certificate of CRL could not be retrieved.", e10);
                        } catch (Exception e11) {
                            throw new AnnotatedException(e11.getMessage());
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                AnnotatedException annotatedException = null;
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    boolean[] keyUsage = ((X509Certificate) arrayList.get(i10)).getKeyUsage();
                    if (keyUsage == null || (keyUsage.length > 6 && keyUsage[6])) {
                        hashSet.add(arrayList2.get(i10));
                    } else {
                        annotatedException = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    throw new AnnotatedException("Cannot find a valid issuer certificate.");
                }
                if (!hashSet.isEmpty() || annotatedException == null) {
                    return hashSet;
                }
                throw annotatedException;
            } catch (AnnotatedException e12) {
                throw new AnnotatedException("Issuer certificate for CRL cannot be searched.", e12);
            }
        } catch (IOException e13) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", e13);
        }
    }

    public static PublicKey processCRLG(X509CRL x509crl, Set set) throws NoSuchAlgorithmException, SignatureException, AnnotatedException, InvalidKeyException, CRLException, NoSuchProviderException {
        Iterator it = set.iterator();
        Exception e2 = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e10) {
                e2 = e10;
            }
        }
        throw new AnnotatedException("Cannot verify CRL.", e2);
    }

    public static X509CRL processCRLH(Set set, PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, AnnotatedException, InvalidKeyException, CRLException, NoSuchProviderException {
        Iterator it = set.iterator();
        Exception e2 = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e10) {
                e2 = e10;
            }
        }
        if (e2 == null) {
            return null;
        }
        throw new AnnotatedException("Cannot verify delta CRL.", e2);
    }

    public static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certStatus, PKIXExtendedParameters pKIXExtendedParameters) throws AnnotatedException {
        if (!pKIXExtendedParameters.isUseDeltasEnabled() || x509crl == null) {
            return;
        }
        CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
    }

    public static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        if (certStatus.getCertStatus() == 11) {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
        }
    }

    public static void processCertA(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, Date date, PKIXCertRevocationChecker pKIXCertRevocationChecker, int i10, PublicKey publicKey, boolean z6, X500Name x500Name, X509Certificate x509Certificate) throws CertificateNotYetValidException, ExtCertPathValidatorException, CertificateExpiredException {
        X509Certificate x509Certificate2 = (X509Certificate) certPath.getCertificates().get(i10);
        if (!z6) {
            try {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, publicKey, pKIXExtendedParameters.getSigProvider());
            } catch (GeneralSecurityException e2) {
                throw new ExtCertPathValidatorException("Could not validate certificate signature.", e2, certPath, i10);
            }
        }
        try {
            Date validCertDateFromValidityModel = CertPathValidatorUtilities.getValidCertDateFromValidityModel(date, pKIXExtendedParameters.getValidityModel(), certPath, i10);
            try {
                x509Certificate2.checkValidity(validCertDateFromValidityModel);
                if (pKIXCertRevocationChecker != null) {
                    pKIXCertRevocationChecker.initialize(new PKIXCertRevocationCheckerParameters(pKIXExtendedParameters, validCertDateFromValidityModel, certPath, i10, x509Certificate, publicKey));
                    pKIXCertRevocationChecker.check(x509Certificate2);
                }
                X500Name issuerPrincipal = PrincipalUtils.getIssuerPrincipal(x509Certificate2);
                if (issuerPrincipal.equals(x500Name)) {
                    return;
                }
                throw new ExtCertPathValidatorException("IssuerName(" + issuerPrincipal + ") does not match SubjectName(" + x500Name + ") of signing certificate.", null, certPath, i10);
            } catch (CertificateExpiredException e10) {
                throw new ExtCertPathValidatorException("Could not validate certificate: " + e10.getMessage(), e10, certPath, i10);
            } catch (CertificateNotYetValidException e11) {
                throw new ExtCertPathValidatorException("Could not validate certificate: " + e11.getMessage(), e11, certPath, i10);
            }
        } catch (AnnotatedException e12) {
            throw new ExtCertPathValidatorException("Could not validate time of certificate.", e12, certPath, i10);
        }
    }

    public static void processCertBC(CertPath certPath, int i10, PKIXNameConstraintValidator pKIXNameConstraintValidator, boolean z6) throws CertPathValidatorException {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i10);
        int size = certificates.size();
        int i11 = size - i10;
        if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate) || (i11 >= size && !z6)) {
            try {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(PrincipalUtils.getSubjectPrincipal(x509Certificate));
                try {
                    pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                    pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                    try {
                        GeneralNames generalNames = GeneralNames.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME));
                        RDN[] rDNs = X500Name.getInstance(aSN1Sequence).getRDNs(BCStyle.EmailAddress);
                        for (int i12 = 0; i12 != rDNs.length; i12++) {
                            GeneralName generalName = new GeneralName(1, ((ASN1String) rDNs[i12].getFirst().getValue()).getString());
                            try {
                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                pKIXNameConstraintValidator.checkExcluded(generalName);
                            } catch (PKIXNameConstraintValidatorException e2) {
                                throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e2, certPath, i10);
                            }
                        }
                        if (generalNames != null) {
                            try {
                                GeneralName[] names = generalNames.getNames();
                                for (int i13 = 0; i13 < names.length; i13++) {
                                    try {
                                        pKIXNameConstraintValidator.checkPermitted(names[i13]);
                                        pKIXNameConstraintValidator.checkExcluded(names[i13]);
                                    } catch (PKIXNameConstraintValidatorException e10) {
                                        throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e10, certPath, i10);
                                    }
                                }
                            } catch (Exception e11) {
                                throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e11, certPath, i10);
                            }
                        }
                    } catch (Exception e12) {
                        throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e12, certPath, i10);
                    }
                } catch (PKIXNameConstraintValidatorException e13) {
                    throw new CertPathValidatorException("Subtree check for certificate subject failed.", e13, certPath, i10);
                }
            } catch (Exception e14) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e14, certPath, i10);
            }
        }
    }

    public static PKIXPolicyNode processCertD(CertPath certPath, int i10, Set set, PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i11, boolean z6) throws ExtCertPathValidatorException {
        String id2;
        int i12;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i10);
        int size = certificates.size();
        int i13 = size - i10;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CERTIFICATE_POLICIES));
            if (aSN1Sequence == null || pKIXPolicyNode == null) {
                return null;
            }
            Enumeration objects = aSN1Sequence.getObjects();
            HashSet hashSet = new HashSet();
            while (objects.hasMoreElements()) {
                PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                hashSet.add(policyIdentifier.getId());
                if (!ANY_POLICY.equals(policyIdentifier.getId())) {
                    try {
                        Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                        if (!CertPathValidatorUtilities.processCertD1i(i13, listArr, policyIdentifier, qualifierSet)) {
                            CertPathValidatorUtilities.processCertD1ii(i13, listArr, policyIdentifier, qualifierSet);
                        }
                    } catch (CertPathValidatorException e2) {
                        throw new ExtCertPathValidatorException("Policy qualifier info set could not be build.", e2, certPath, i10);
                    }
                }
            }
            if (set.isEmpty() || set.contains(ANY_POLICY)) {
                set.clear();
                set.addAll(hashSet);
            } else {
                HashSet hashSet2 = new HashSet();
                for (Object obj : set) {
                    if (hashSet.contains(obj)) {
                        hashSet2.add(obj);
                    }
                }
                set.clear();
                set.addAll(hashSet2);
            }
            if (i11 > 0 || ((i13 < size || z6) && CertPathValidatorUtilities.isSelfIssued(x509Certificate))) {
                Enumeration objects2 = aSN1Sequence.getObjects();
                while (true) {
                    if (!objects2.hasMoreElements()) {
                        break;
                    }
                    PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                    if (ANY_POLICY.equals(policyInformation2.getPolicyIdentifier().getId())) {
                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(policyInformation2.getPolicyQualifiers());
                        List list = listArr[i13 - 1];
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i14);
                            for (Object obj2 : pKIXPolicyNode2.getExpectedPolicies()) {
                                if (obj2 instanceof String) {
                                    id2 = (String) obj2;
                                } else if (obj2 instanceof ASN1ObjectIdentifier) {
                                    id2 = ((ASN1ObjectIdentifier) obj2).getId();
                                }
                                String str = id2;
                                Iterator children = pKIXPolicyNode2.getChildren();
                                boolean z10 = false;
                                while (children.hasNext()) {
                                    if (str.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                        z10 = true;
                                    }
                                }
                                if (!z10) {
                                    HashSet hashSet3 = new HashSet();
                                    hashSet3.add(str);
                                    PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), i13, hashSet3, pKIXPolicyNode2, qualifierSet2, str, false);
                                    pKIXPolicyNode2.addChild(pKIXPolicyNode3);
                                    listArr[i13].add(pKIXPolicyNode3);
                                }
                            }
                        }
                    }
                }
            }
            PKIXPolicyNode pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode;
            for (int i15 = i13 - 1; i15 >= 0; i15--) {
                List list2 = listArr[i15];
                for (0; i12 < list2.size(); i12 + 1) {
                    PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) list2.get(i12);
                    i12 = (pKIXPolicyNode4.hasChildren() || (pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, listArr, pKIXPolicyNode4)) != null) ? i12 + 1 : 0;
                }
            }
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null) {
                boolean zContains = criticalExtensionOIDs.contains(CERTIFICATE_POLICIES);
                List list3 = listArr[i13];
                for (int i16 = 0; i16 < list3.size(); i16++) {
                    ((PKIXPolicyNode) list3.get(i16)).setCritical(zContains);
                }
            }
            return pKIXPolicyNodeRemovePolicyNode;
        } catch (AnnotatedException e10) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e10, certPath, i10);
        }
    }

    public static PKIXPolicyNode processCertE(CertPath certPath, int i10, PKIXPolicyNode pKIXPolicyNode) throws ExtCertPathValidatorException {
        try {
            if (ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i10), CERTIFICATE_POLICIES)) == null) {
                return null;
            }
            return pKIXPolicyNode;
        } catch (AnnotatedException e2) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e2, certPath, i10);
        }
    }

    public static void processCertF(CertPath certPath, int i10, PKIXPolicyNode pKIXPolicyNode, int i11) throws ExtCertPathValidatorException {
        if (i11 <= 0 && pKIXPolicyNode == null) {
            throw new ExtCertPathValidatorException("No valid policy tree found when one expected.", null, certPath, i10);
        }
    }

    public static int wrapupCertA(int i10, X509Certificate x509Certificate) {
        return (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i10 == 0) ? i10 : i10 - 1;
    }

    public static int wrapupCertB(CertPath certPath, int i10, int i11) throws ExtCertPathValidatorException {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i10), POLICY_CONSTRAINTS));
            if (aSN1Sequence != null) {
                Enumeration objects = aSN1Sequence.getObjects();
                while (objects.hasMoreElements()) {
                    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
                    if (aSN1TaggedObject.getTagNo() == 0) {
                        try {
                            if (ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact() == 0) {
                                return 0;
                            }
                        } catch (Exception e2) {
                            throw new ExtCertPathValidatorException("Policy constraints requireExplicitPolicy field could not be decoded.", e2, certPath, i10);
                        }
                    }
                }
            }
            return i11;
        } catch (AnnotatedException e10) {
            throw new ExtCertPathValidatorException("Policy constraints could not be decoded.", e10, certPath, i10);
        }
    }

    public static void wrapupCertF(CertPath certPath, int i10, List list, Set set) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e2) {
                throw new ExtCertPathValidatorException(e2.getMessage(), e2, certPath, i10);
            } catch (Exception e10) {
                throw new CertPathValidatorException("Additional certificate path checker failed.", e10, certPath, i10);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i10);
    }

    public static PKIXPolicyNode wrapupCertG(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, Set set, int i10, List[] listArr, PKIXPolicyNode pKIXPolicyNode, Set set2) throws ExtCertPathValidatorException {
        int size = certPath.getCertificates().size();
        if (pKIXPolicyNode == null) {
            if (pKIXExtendedParameters.isExplicitPolicyRequired()) {
                throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i10);
            }
            return null;
        }
        if (CertPathValidatorUtilities.isAnyPolicy(set)) {
            if (!pKIXExtendedParameters.isExplicitPolicyRequired()) {
                return pKIXPolicyNode;
            }
            if (set2.isEmpty()) {
                throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i10);
            }
            HashSet hashSet = new HashSet();
            for (List list : listArr) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i11);
                    if (ANY_POLICY.equals(pKIXPolicyNode2.getValidPolicy())) {
                        Iterator children = pKIXPolicyNode2.getChildren();
                        while (children.hasNext()) {
                            hashSet.add(children.next());
                        }
                    }
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                set2.contains(((PKIXPolicyNode) it.next()).getValidPolicy());
            }
            for (int i12 = size - 1; i12 >= 0; i12--) {
                List list2 = listArr[i12];
                for (int i13 = 0; i13 < list2.size(); i13++) {
                    PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) list2.get(i13);
                    if (!pKIXPolicyNode3.hasChildren()) {
                        pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode3);
                    }
                }
            }
            return pKIXPolicyNode;
        }
        HashSet hashSet2 = new HashSet();
        for (List list3 : listArr) {
            for (int i14 = 0; i14 < list3.size(); i14++) {
                PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) list3.get(i14);
                if (ANY_POLICY.equals(pKIXPolicyNode4.getValidPolicy())) {
                    Iterator children2 = pKIXPolicyNode4.getChildren();
                    while (children2.hasNext()) {
                        PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) children2.next();
                        if (!ANY_POLICY.equals(pKIXPolicyNode5.getValidPolicy())) {
                            hashSet2.add(pKIXPolicyNode5);
                        }
                    }
                }
            }
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) it2.next();
            if (!set.contains(pKIXPolicyNode6.getValidPolicy())) {
                pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode6);
            }
        }
        if (pKIXPolicyNode != null) {
            for (int i15 = size - 1; i15 >= 0; i15--) {
                List list4 = listArr[i15];
                for (int i16 = 0; i16 < list4.size(); i16++) {
                    PKIXPolicyNode pKIXPolicyNode7 = (PKIXPolicyNode) list4.get(i16);
                    if (!pKIXPolicyNode7.hasChildren()) {
                        pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode7);
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }
}
