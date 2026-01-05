package p001o;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes6.dex */
public final class jf1 extends of2 {

    /* renamed from: c */
    public static final C14515a f30305c = new C14515a(null);

    /* renamed from: b */
    public final xxh f30306b;

    /* renamed from: o.jf1$a */
    public static final class C14515a {
        public C14515a() {
        }

        public /* synthetic */ C14515a(id5 id5Var) {
            this();
        }
    }

    public jf1(xxh xxhVar) {
        sq8.m48649h(xxhVar, "trustRootIndex");
        this.f30306b = xxhVar;
    }

    @Override // p001o.of2
    /* renamed from: a */
    public List mo33679a(List list, String str) throws SSLPeerUnverifiedException {
        sq8.m48649h(list, "chain");
        sq8.m48649h(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        sq8.m48648g(objRemoveFirst, "removeFirst(...)");
        arrayList.add(objRemoveFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            sq8.m48647f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateMo24891a = this.f30306b.mo24891a(x509Certificate);
            if (x509CertificateMo24891a == null) {
                Iterator it = arrayDeque.iterator();
                sq8.m48648g(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    sq8.m48647f(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (m33680b(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !sq8.m48644c(x509Certificate, x509CertificateMo24891a)) {
                arrayList.add(x509CertificateMo24891a);
            }
            if (m33680b(x509CertificateMo24891a, x509CertificateMo24891a, arrayList.size() - 2)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    /* renamed from: b */
    public final boolean m33680b(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        if (!sq8.m48644c(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof jf1) && sq8.m48644c(((jf1) obj).f30306b, this.f30306b);
    }

    public int hashCode() {
        return this.f30306b.hashCode();
    }
}
