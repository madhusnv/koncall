package p001o;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* loaded from: classes6.dex */
public final class bl1 extends e9d {

    /* renamed from: e */
    public static final C12451a f16469e;

    /* renamed from: f */
    public static final boolean f16470f;

    /* renamed from: d */
    public final Provider f16471d;

    /* renamed from: o.bl1$a */
    public static final class C12451a {
        public C12451a() {
        }

        public /* synthetic */ C12451a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final bl1 m19314a() {
            id5 id5Var = null;
            if (m19315b()) {
                return new bl1(id5Var);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m19315b() {
            return bl1.f16470f;
        }
    }

    static {
        C12451a c12451a = new C12451a(null);
        f16469e = c12451a;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, c12451a.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f16470f = z;
    }

    public /* synthetic */ bl1(id5 id5Var) {
        this();
    }

    @Override // p001o.e9d
    /* renamed from: e */
    public void mo19310e(SSLSocket sSLSocket, String str, List list) {
        sq8.m48649h(sSLSocket, "sslSocket");
        sq8.m48649h(list, "protocols");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            super.mo19310e(sSLSocket, str, list);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
        BCSSLParameters parameters = bCSSLSocket.getParameters();
        parameters.setApplicationProtocols((String[]) e9d.f21191a.m24577b(list).toArray(new String[0]));
        bCSSLSocket.setParameters(parameters);
    }

    @Override // p001o.e9d
    /* renamed from: g */
    public String mo19311g(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            return super.mo19311g(sSLSocket);
        }
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : sq8.m48644c(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p001o.e9d
    /* renamed from: m */
    public SSLContext mo19312m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f16471d);
        sq8.m48648g(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    @Override // p001o.e9d
    /* renamed from: o */
    public X509TrustManager mo19313o() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        sq8.m48646e(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            sq8.m48647f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        sq8.m48648g(string, "toString(...)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public bl1() {
        this.f16471d = new BouncyCastleJsseProvider();
    }
}
