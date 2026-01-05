package org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.qualified.ETSIQCObjectIdentifiers;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.asn1.x509.qualified.RFC3739QCObjectIdentifiers;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidator;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    private static final String RESOURCE_NAME = "org.bouncycastle.x509.CertPathReviewerMessages";
    protected CertPath certPath;
    protected List certs;
    protected Date currentDate;
    protected List[] errors;
    private boolean initialized;

    /* renamed from: n */
    protected int f28186n;
    protected List[] notifications;
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;
    private static final String QC_STATEMENT = Extension.qCStatements.getId();
    private static final String CRL_DIST_POINTS = Extension.cRLDistributionPoints.getId();
    private static final String AUTH_INFO_ACCESS = Extension.authorityInfoAccess.getId();

    public PKIXCertPathReviewer() {
    }

    private String IPtoString(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = 0; i10 != bArr.length; i10++) {
                stringBuffer.append(Integer.toHexString(bArr[i10] & 255));
                stringBuffer.append(' ');
            }
            return stringBuffer.toString();
        }
    }

    private void checkCriticalExtensions() throws CertPathReviewerException, CertPathValidatorException {
        List<PKIXCertPathChecker> certPathCheckers = this.pkixParams.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> it = certPathCheckers.iterator();
        while (it.hasNext()) {
            try {
                try {
                    it.next().init(false);
                } catch (CertPathValidatorException e2) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathCheckerError", new Object[]{e2.getMessage(), e2, e2.getClass().getName()}), e2);
                }
            } catch (CertPathReviewerException e10) {
                addError(e10.getErrorMessage(), e10.getIndex());
                return;
            }
        }
        for (int size = this.certs.size() - 1; size >= 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.KEY_USAGE);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_MAPPINGS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.BASIC_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.NAME_CONSTRAINTS);
                if (size == 0) {
                    criticalExtensionOIDs.remove(Extension.extendedKeyUsage.getId());
                }
                String str = QC_STATEMENT;
                if (criticalExtensionOIDs.contains(str) && processQcStatements(x509Certificate, size)) {
                    criticalExtensionOIDs.remove(str);
                }
                Iterator<PKIXCertPathChecker> it2 = certPathCheckers.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().check(x509Certificate, criticalExtensionOIDs);
                    } catch (CertPathValidatorException e11) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.criticalExtensionError", new Object[]{e11.getMessage(), e11, e11.getClass().getName()}), e11.getCause(), this.certPath, size);
                    }
                }
                if (!criticalExtensionOIDs.isEmpty()) {
                    Iterator<String> it3 = criticalExtensionOIDs.iterator();
                    while (it3.hasNext()) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it3.next())}), size);
                    }
                }
            }
        }
    }

    private void checkNameConstraints() throws CertPathReviewerException {
        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
        try {
            for (int size = this.certs.size() - 1; size > 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
                if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                    X500Principal subjectPrincipal = CertPathValidatorUtilities.getSubjectPrincipal(x509Certificate);
                    try {
                        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        try {
                            pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                            try {
                                pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                                try {
                                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    if (aSN1Sequence2 != null) {
                                        for (int i10 = 0; i10 < aSN1Sequence2.size(); i10++) {
                                            GeneralName generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i10));
                                            try {
                                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                                pKIXNameConstraintValidator.checkExcluded(generalName);
                                            } catch (PKIXNameConstraintValidatorException e2) {
                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(generalName)}), e2, this.certPath, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e10) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.subjAltNameExtError"), e10, this.certPath, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e11) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e11, this.certPath, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e12) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e12, this.certPath, size);
                        }
                    } catch (IOException e13) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e13, this.certPath, size);
                    }
                }
                try {
                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.NAME_CONSTRAINTS);
                    if (aSN1Sequence3 != null) {
                        NameConstraints nameConstraints = NameConstraints.getInstance(aSN1Sequence3);
                        GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                        }
                        GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            for (int i11 = 0; i11 != excludedSubtrees.length; i11++) {
                                pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i11]);
                            }
                        }
                    }
                } catch (AnnotatedException e14) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncExtError"), e14, this.certPath, size);
                }
            }
        } catch (CertPathReviewerException e15) {
            addError(e15.getErrorMessage(), e15.getIndex());
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        ASN1Integer pathLenConstraintInteger;
        int iMin = this.f28186n;
        int i10 = 0;
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                if (iMin <= 0) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.pathLengthExtended"));
                }
                iMin--;
                i10++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.processLengthConstError"), size);
                basicConstraints = null;
            }
            if (basicConstraints != null && basicConstraints.isCA() && (pathLenConstraintInteger = basicConstraints.getPathLenConstraintInteger()) != null) {
                iMin = Math.min(iMin, pathLenConstraintInteger.intPositiveValueExact());
            }
        }
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i10)}));
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0147, code lost:
    
        r22 = org.bouncycastle.x509.CertPathValidatorUtilities.getQualifierSet(r10.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0151, code lost:
    
        r9 = r5[r14 - 1];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0158, code lost:
    
        if (r10 >= r9.size()) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
    
        r21 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r9.get(r10);
        r11 = r21.getExpectedPolicies().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016e, code lost:
    
        if (r11.hasNext() == false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0170, code lost:
    
        r30 = r9;
        r9 = r11.next();
        r31 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017a, code lost:
    
        if ((r9 instanceof java.lang.String) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017c, code lost:
    
        r9 = (java.lang.String) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0181, code lost:
    
        if ((r9 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        r9 = ((org.bouncycastle.asn1.ASN1ObjectIdentifier) r9).getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0189, code lost:
    
        r10 = r21.getChildren();
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0193, code lost:
    
        if (r10.hasNext() == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0195, code lost:
    
        r19 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a5, code lost:
    
        if (r9.equals(((org.bouncycastle.jce.provider.PKIXPolicyNode) r10.next()).getValidPolicy()) == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a7, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a9, code lost:
    
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ac, code lost:
    
        if (r17 != false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ae, code lost:
    
        r10 = new java.util.HashSet();
        r10.add(r9);
        r17 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r14, r10, r21, r22, r9, false);
        r9 = r21;
        r9.addChild(r17);
        r21 = r9;
        r5[r14].add(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d6, code lost:
    
        r9 = r30;
        r10 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01db, code lost:
    
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void checkPolicy() throws org.bouncycastle.x509.CertPathReviewerException {
        /*
            Method dump skipped, instructions count: 1521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkPolicy():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:57|(2:162|59)(2:64|(2:150|66)(3:70|(2:74|(1:76))|77))|(2:175|78)|83|(16:166|85|(1:87)(1:90)|152|91|(1:93)(1:96)|97|(2:100|98)|181|101|(2:104|102)|160|105|106|171|107)(1:114)|(1:118)|119|(1:141)(7:121|(1:125)|156|126|(2:128|(1:130))(1:131)|134|(2:136|(1:140))(0))|142|164|143|180|146) */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0399, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle(org.bouncycastle.x509.PKIXCertPathReviewer.RESOURCE_NAME, "CertPathReviewer.pubKeyError"), r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void checkSignatures() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkSignatures():void");
    }

    private X509CRL getCRL(String str) throws Exception {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals("http") && !url.getProtocol().equals("https")) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance("X.509", "BC").generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e2) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.loadCrlDistPointError", new Object[]{new UntrustedInput(str), e2.getMessage(), e2, e2.getClass().getName()}));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i10) {
        ErrorBundle errorBundle;
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z6 = false;
            for (int i11 = 0; i11 < aSN1Sequence.size(); i11++) {
                QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(i11));
                if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcCompliance.equals((ASN1Primitive) qCStatement.getStatementId())) {
                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcEuCompliance");
                } else {
                    if (!RFC3739QCObjectIdentifiers.id_qcs_pkixQCSyntax_v1.equals((ASN1Primitive) qCStatement.getStatementId())) {
                        if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcSSCD.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcSSCD");
                        } else if (ETSIQCObjectIdentifiers.id_etsi_qcs_LimiteValue.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            double dDoubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                            addNotification(monetaryValue.getCurrency().isAlphabetic() ? new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueAlpha", new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(dDoubleValue)), monetaryValue}) : new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(dDoubleValue)), monetaryValue}), i10);
                        } else {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcUnknownStatement", new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i10);
                            z6 = true;
                        }
                    }
                }
                addNotification(errorBundle, i10);
            }
            return !z6;
        } catch (AnnotatedException unused) {
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcStatementExtError"), i10);
            return false;
        }
    }

    public void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0239  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void checkCRLs(java.security.cert.PKIXParameters r23, java.security.cert.X509Certificate r24, java.util.Date r25, java.security.cert.X509Certificate r26, java.security.PublicKey r27, java.util.Vector r28, int r29) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkCRLs(java.security.cert.PKIXParameters, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, java.util.Vector, int):void");
    }

    public void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i10) throws Exception {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i10);
    }

    public void doChecks() throws Exception {
        if (!this.initialized) {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        }
        if (this.notifications != null) {
            return;
        }
        int i10 = this.f28186n;
        this.notifications = new List[i10 + 1];
        this.errors = new List[i10 + 1];
        int i11 = 0;
        while (true) {
            List[] listArr = this.notifications;
            if (i11 >= listArr.length) {
                checkSignatures();
                checkNameConstraints();
                checkPathLength();
                checkPolicy();
                checkCriticalExtensions();
                return;
            }
            listArr[i11] = new ArrayList();
            this.errors[i11] = new ArrayList();
            i11++;
        }
    }

    public Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i10 = 0; i10 < names.length; i10++) {
                        if (names[i10].getTagNo() == 6) {
                            vector.add(((ASN1IA5String) names[i10].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.f28186n;
    }

    public List getErrors(int i10) throws Exception {
        doChecks();
        return this.errors[i10 + 1];
    }

    public List getNotifications(int i10) throws Exception {
        doChecks();
        return this.notifications[i10 + 1];
    }

    public Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i10 = 0; i10 < accessDescriptions.length; i10++) {
                if (accessDescriptions[i10].getAccessMethod().equals((ASN1Primitive) AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i10].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((ASN1IA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() throws Exception {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() throws Exception {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() throws Exception {
        doChecks();
        return this.trustAnchor;
    }

    public Collection getTrustAnchors(X509Certificate x509Certificate, Set set) throws CertPathReviewerException, IOException {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1Primitive.fromByteArray(((ASN1OctetString) ASN1Primitive.fromByteArray(extensionValue)).getOctets()));
                if (authorityKeyIdentifier.getAuthorityCertSerialNumber() != null) {
                    x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                } else {
                    byte[] keyIdentifier = authorityKeyIdentifier.getKeyIdentifier();
                    if (keyIdentifier != null) {
                        x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(keyIdentifier).getEncoded());
                    }
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public void init(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        if (this.initialized) {
            throw new IllegalStateException("object is already initialized!");
        }
        this.initialized = true;
        if (certPath == null) {
            throw new NullPointerException("certPath was null");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        if (certificates.size() != 1) {
            HashSet hashSet = new HashSet();
            Iterator<TrustAnchor> it = pKIXParameters.getTrustAnchors().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getTrustedCert());
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 != certificates.size(); i10++) {
                if (!hashSet.contains(certificates.get(i10))) {
                    arrayList.add(certificates.get(i10));
                }
            }
            try {
                this.certPath = CertificateFactory.getInstance("X.509", "BC").generateCertPath(arrayList);
                this.certs = arrayList;
            } catch (GeneralSecurityException unused) {
                throw new IllegalStateException("unable to rebuild certpath");
            }
        } else {
            this.certPath = certPath;
            this.certs = certPath.getCertificates();
        }
        this.f28186n = this.certs.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.emptyCertPath"));
        }
        this.pkixParams = (PKIXParameters) pKIXParameters.clone();
        Date date = new Date();
        this.currentDate = date;
        this.validDate = CertPathValidatorUtilities.getValidityDate(this.pkixParams, date);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    public boolean isValidCertPath() throws Exception {
        doChecks();
        int i10 = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i10 >= listArr.length) {
                return true;
            }
            if (!listArr[i10].isEmpty()) {
                return false;
            }
            i10++;
        }
    }

    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        init(certPath, pKIXParameters);
    }

    public void addError(ErrorBundle errorBundle, int i10) {
        if (i10 < -1 || i10 >= this.f28186n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i10 + 1].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle, int i10) {
        if (i10 < -1 || i10 >= this.f28186n) {
            throw new IndexOutOfBoundsException();
        }
        this.notifications[i10 + 1].add(errorBundle);
    }

    public List[] getErrors() throws Exception {
        doChecks();
        return this.errors;
    }

    public List[] getNotifications() throws Exception {
        doChecks();
        return this.notifications;
    }
}
