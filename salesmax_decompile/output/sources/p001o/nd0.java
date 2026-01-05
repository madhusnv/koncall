package p001o;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes6.dex */
public final class nd0 extends of2 {

    /* renamed from: d */
    public static final C15546a f36693d = new C15546a(null);

    /* renamed from: b */
    public final X509TrustManager f36694b;

    /* renamed from: c */
    public final X509TrustManagerExtensions f36695c;

    /* renamed from: o.nd0$a */
    public static final class C15546a {
        public C15546a() {
        }

        public /* synthetic */ C15546a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final nd0 m40366a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            sq8.m48649h(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new nd0(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public nd0(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        sq8.m48649h(x509TrustManager, "trustManager");
        sq8.m48649h(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f36694b = x509TrustManager;
        this.f36695c = x509TrustManagerExtensions;
    }

    @Override // p001o.of2
    /* renamed from: a */
    public List mo33679a(List list, String str) throws CertificateException, SSLPeerUnverifiedException {
        sq8.m48649h(list, "chain");
        sq8.m48649h(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f36695c.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            sq8.m48648g(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof nd0) && ((nd0) obj).f36694b == this.f36694b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f36694b);
    }
}
