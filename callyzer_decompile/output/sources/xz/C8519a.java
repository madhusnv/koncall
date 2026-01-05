package xz;

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
import kotlin.jvm.internal.AbstractC4154l;
import pg.c8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xz.a */
/* loaded from: classes3.dex */
public final class C8519a extends c8 {

    /* renamed from: a */
    public final InterfaceC8522d f41444a;

    public C8519a(InterfaceC8522d trustRootIndex) {
        AbstractC4154l.m8923f(trustRootIndex, "trustRootIndex");
        this.f41444a = trustRootIndex;
    }

    /* renamed from: d */
    public static boolean m15793d(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i10) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        if (!AbstractC4154l.m8918a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i10) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // pg.c8
    /* renamed from: a */
    public final List mo11571a(String hostname, List chain) throws SSLPeerUnverifiedException {
        AbstractC4154l.m8923f(chain, "chain");
        AbstractC4154l.m8923f(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        AbstractC4154l.m8922e(objRemoveFirst, "removeFirst(...)");
        arrayList.add(objRemoveFirst);
        boolean z6 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateMo13614a = this.f41444a.mo13614a(x509Certificate);
            if (x509CertificateMo13614a == null) {
                Iterator it = arrayDeque.iterator();
                AbstractC4154l.m8922e(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC4154l.m8921d(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (m15793d(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z6) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo13614a)) {
                arrayList.add(x509CertificateMo13614a);
            }
            if (m15793d(x509CertificateMo13614a, x509CertificateMo13614a, arrayList.size() - 2)) {
                return arrayList;
            }
            z6 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C8519a) && AbstractC4154l.m8918a(((C8519a) obj).f41444a, this.f41444a);
    }

    public final int hashCode() {
        return this.f41444a.hashCode();
    }
}
