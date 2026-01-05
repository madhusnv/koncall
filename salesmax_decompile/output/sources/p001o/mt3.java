package p001o;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* loaded from: classes6.dex */
public final class mt3 extends e9d {

    /* renamed from: e */
    public static final C15422a f35938e;

    /* renamed from: f */
    public static final boolean f35939f;

    /* renamed from: d */
    public final Provider f35940d;

    /* renamed from: o.mt3$a */
    public static final class C15422a {
        public C15422a() {
        }

        public /* synthetic */ C15422a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final boolean m39631a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            if (version == null) {
                return false;
            }
            return version.major() != i ? version.major() > i : version.minor() != i2 ? version.minor() > i2 : version.patch() >= i3;
        }

        /* renamed from: b */
        public final mt3 m39632b() {
            id5 id5Var = null;
            if (m39633c()) {
                return new mt3(id5Var);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m39633c() {
            return mt3.f35939f;
        }
    }

    /* renamed from: o.mt3$b */
    public static final class C15423b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final C15423b f35941a = new C15423b();
    }

    static {
        C15422a c15422a = new C15422a(null);
        f35938e = c15422a;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, c15422a.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (c15422a.m39631a(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f35939f = z;
    }

    public /* synthetic */ mt3(id5 id5Var) {
        this();
    }

    @Override // p001o.e9d
    /* renamed from: e */
    public void mo19310e(SSLSocket sSLSocket, String str, List list) {
        sq8.m48649h(sSLSocket, "sslSocket");
        sq8.m48649h(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.mo19310e(sSLSocket, str, list);
        } else {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) e9d.f21191a.m24577b(list).toArray(new String[0]));
        }
    }

    @Override // p001o.e9d
    /* renamed from: g */
    public String mo19311g(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo19311g(sSLSocket);
    }

    @Override // p001o.e9d
    /* renamed from: m */
    public SSLContext mo19312m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f35940d);
        sq8.m48648g(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    @Override // p001o.e9d
    /* renamed from: n */
    public SSLSocketFactory mo24575n(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        sq8.m48649h(x509TrustManager, "trustManager");
        SSLContext sSLContextMo19312m = mo19312m();
        sSLContextMo19312m.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContextMo19312m.getSocketFactory();
        sq8.m48648g(socketFactory, "getSocketFactory(...)");
        return socketFactory;
    }

    @Override // p001o.e9d
    /* renamed from: o */
    public X509TrustManager mo19313o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        sq8.m48646e(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            sq8.m48647f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, C15423b.f35941a);
            return x509TrustManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        sq8.m48648g(string, "toString(...)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public mt3() {
        Provider providerNewProvider = Conscrypt.newProvider();
        sq8.m48648g(providerNewProvider, "newProvider(...)");
        this.f35940d = providerNewProvider;
    }
}
