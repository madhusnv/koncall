package p001o;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes6.dex */
public final class uf1 implements xxh {

    /* renamed from: a */
    public final Map f48867a;

    public uf1(X509Certificate... x509CertificateArr) {
        sq8.m48649h(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            sq8.m48648g(subjectX500Principal, "getSubjectX500Principal(...)");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f48867a = linkedHashMap;
    }

    @Override // p001o.xxh
    /* renamed from: a */
    public X509Certificate mo24891a(X509Certificate x509Certificate) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        boolean z;
        sq8.m48649h(x509Certificate, "cert");
        Set set = (Set) this.f48867a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof uf1) && sq8.m48644c(((uf1) obj).f48867a, this.f48867a));
    }

    public int hashCode() {
        return this.f48867a.hashCode();
    }
}
