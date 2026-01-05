package org.bouncycastle.x509;

import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.PKIXParameters;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.util.StoreException;

/* loaded from: classes3.dex */
abstract class PKIXCRLUtil {
    public static Set findCRLs(X509CRLStoreSelector x509CRLStoreSelector, PKIXParameters pKIXParameters) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        try {
            findCRLs(hashSet, x509CRLStoreSelector, pKIXParameters.getCertStores());
            return hashSet;
        } catch (AnnotatedException e2) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e2);
        }
    }

    private static void findCRLs(HashSet hashSet, X509CRLStoreSelector x509CRLStoreSelector, List list) throws AnnotatedException {
        AnnotatedException annotatedException;
        AnnotatedException annotatedException2 = null;
        boolean z6 = false;
        for (Object obj : list) {
            if (obj instanceof X509Store) {
                try {
                    hashSet.addAll(((X509Store) obj).getMatches(x509CRLStoreSelector));
                    z6 = true;
                } catch (StoreException e2) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e2);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(((CertStore) obj).getCRLs(x509CRLStoreSelector));
                    z6 = true;
                } catch (CertStoreException e10) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e10);
                    annotatedException2 = annotatedException;
                }
            }
        }
        if (!z6 && annotatedException2 != null) {
            throw annotatedException2;
        }
    }
}
