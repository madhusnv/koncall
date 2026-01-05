package xz;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xz.b */
/* loaded from: classes3.dex */
public final class C8520b implements InterfaceC8522d {

    /* renamed from: a */
    public final LinkedHashMap f41445a;

    public C8520b(X509Certificate... caCerts) {
        AbstractC4154l.m8923f(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f41445a = linkedHashMap;
    }

    @Override // xz.InterfaceC8522d
    /* renamed from: a */
    public final X509Certificate mo13614a(X509Certificate x509Certificate) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        Set set = (Set) this.f41445a.get(x509Certificate.getIssuerX500Principal());
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
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C8520b) && AbstractC4154l.m8918a(((C8520b) obj).f41445a, this.f41445a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f41445a.hashCode();
    }
}
