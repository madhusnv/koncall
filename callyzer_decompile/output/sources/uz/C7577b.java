package uz;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC4154l;
import pg.c8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uz.b */
/* loaded from: classes3.dex */
public final class C7577b extends c8 {

    /* renamed from: a */
    public final X509TrustManager f36452a;

    /* renamed from: b */
    public final X509TrustManagerExtensions f36453b;

    public C7577b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f36452a = x509TrustManager;
        this.f36453b = x509TrustManagerExtensions;
    }

    @Override // pg.c8
    /* renamed from: a */
    public final List mo11571a(String hostname, List chain) throws CertificateException, SSLPeerUnverifiedException {
        AbstractC4154l.m8923f(chain, "chain");
        AbstractC4154l.m8923f(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f36453b.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            AbstractC4154l.m8922e(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7577b) && ((C7577b) obj).f36452a == this.f36452a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f36452a);
    }
}
