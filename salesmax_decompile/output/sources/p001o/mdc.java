package p001o;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* loaded from: classes6.dex */
public final class mdc extends e9d {

    /* renamed from: e */
    public static final C15286a f35210e;

    /* renamed from: f */
    public static final boolean f35211f;

    /* renamed from: d */
    public final Provider f35212d;

    /* renamed from: o.mdc$a */
    public static final class C15286a {
        public C15286a() {
        }

        public /* synthetic */ C15286a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final mdc m38761a() {
            id5 id5Var = null;
            if (m38762b()) {
                return new mdc(id5Var);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m38762b() {
            return mdc.f35211f;
        }
    }

    static {
        C15286a c15286a = new C15286a(null);
        f35210e = c15286a;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, c15286a.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f35211f = z;
    }

    public /* synthetic */ mdc(id5 id5Var) {
        this();
    }

    @Override // p001o.e9d
    /* renamed from: e */
    public void mo19310e(SSLSocket sSLSocket, String str, List list) {
        sq8.m48649h(sSLSocket, "sslSocket");
        sq8.m48649h(list, "protocols");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            super.mo19310e(sSLSocket, str, list);
            return;
        }
        org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
        SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
        if (sSLParameters instanceof SSLParameters) {
            sSLParameters.setApplicationProtocols((String[]) e9d.f21191a.m24577b(list).toArray(new String[0]));
            sSLSocket2.setSSLParameters(sSLParameters);
        }
    }

    @Override // p001o.e9d
    /* renamed from: g */
    public String mo19311g(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            return super.mo19311g(sSLSocket);
        }
        String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : sq8.m48644c(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p001o.e9d
    /* renamed from: m */
    public SSLContext mo19312m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f35212d);
        sq8.m48648g(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    @Override // p001o.e9d
    /* renamed from: o */
    public X509TrustManager mo19313o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f35212d);
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

    public mdc() {
        this.f35212d = new OpenJSSE();
    }
}
