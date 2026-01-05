package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes6.dex */
public class e9d {

    /* renamed from: a */
    public static final C13131a f21191a;

    /* renamed from: b */
    public static volatile e9d f21192b;

    /* renamed from: c */
    public static final Logger f21193c;

    /* renamed from: o.e9d$a */
    public static final class C13131a {
        public C13131a() {
        }

        public /* synthetic */ C13131a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final List m24577b(List list) {
            sq8.m48649h(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((a2e) obj) != a2e.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(dh3.m23088v(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((a2e) it.next()).toString());
            }
            return arrayList2;
        }

        /* renamed from: c */
        public final byte[] m24578c(List list) {
            sq8.m48649h(list, "protocols");
            rl1 rl1Var = new rl1();
            for (String str : m24577b(list)) {
                rl1Var.T1(str.length());
                rl1Var.n0(str);
            }
            return rl1Var.mo32310m();
        }

        /* renamed from: d */
        public final e9d m24579d() {
            ve0.f50224a.m52649b();
            e9d e9dVarM55963a = xc0.f53477e.m55963a();
            if (e9dVarM55963a != null) {
                return e9dVarM55963a;
            }
            e9d e9dVarM24889a = ef0.f21513e.m24889a();
            sq8.m48646e(e9dVarM24889a);
            return e9dVarM24889a;
        }

        /* renamed from: e */
        public final e9d m24580e() {
            mdc mdcVarM38761a;
            bl1 bl1VarM19314a;
            mt3 mt3VarM39632b;
            if (m24585j() && (mt3VarM39632b = mt3.f35938e.m39632b()) != null) {
                return mt3VarM39632b;
            }
            if (m24584i() && (bl1VarM19314a = bl1.f16469e.m19314a()) != null) {
                return bl1VarM19314a;
            }
            if (m24586k() && (mdcVarM38761a = mdc.f35210e.m38761a()) != null) {
                return mdcVarM38761a;
            }
            o69 o69VarM41640a = o69.f37825d.m41640a();
            if (o69VarM41640a != null) {
                return o69VarM41640a;
            }
            e9d e9dVarM36619a = l69.f33301i.m36619a();
            return e9dVarM36619a != null ? e9dVarM36619a : new e9d();
        }

        /* renamed from: f */
        public final e9d m24581f() {
            return m24583h() ? m24579d() : m24580e();
        }

        /* renamed from: g */
        public final e9d m24582g() {
            return e9d.f21192b;
        }

        /* renamed from: h */
        public final boolean m24583h() {
            return sq8.m48644c("Dalvik", System.getProperty("java.vm.name"));
        }

        /* renamed from: i */
        public final boolean m24584i() {
            return sq8.m48644c("BC", Security.getProviders()[0].getName());
        }

        /* renamed from: j */
        public final boolean m24585j() {
            return sq8.m48644c("Conscrypt", Security.getProviders()[0].getName());
        }

        /* renamed from: k */
        public final boolean m24586k() {
            return sq8.m48644c("OpenJSSE", Security.getProviders()[0].getName());
        }
    }

    static {
        C13131a c13131a = new C13131a(null);
        f21191a = c13131a;
        f21192b = c13131a.m24581f();
        f21193c = Logger.getLogger(hac.class.getName());
    }

    /* renamed from: k */
    public static /* synthetic */ void m24566k(e9d e9dVar, String str, int i, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        e9dVar.m24573j(str, i, th);
    }

    /* renamed from: b */
    public void mo24567b(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
    }

    /* renamed from: c */
    public of2 mo24568c(X509TrustManager x509TrustManager) {
        sq8.m48649h(x509TrustManager, "trustManager");
        return new jf1(mo24569d(x509TrustManager));
    }

    /* renamed from: d */
    public xxh mo24569d(X509TrustManager x509TrustManager) {
        sq8.m48649h(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        sq8.m48648g(acceptedIssuers, "getAcceptedIssuers(...)");
        return new uf1((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: e */
    public void mo19310e(SSLSocket sSLSocket, String str, List list) {
        sq8.m48649h(sSLSocket, "sslSocket");
        sq8.m48649h(list, "protocols");
    }

    /* renamed from: f */
    public void mo24570f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        sq8.m48649h(socket, "socket");
        sq8.m48649h(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: g */
    public String mo19311g(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        return null;
    }

    /* renamed from: h */
    public Object mo24571h(String str) {
        sq8.m48649h(str, "closer");
        if (f21193c.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: i */
    public boolean mo24572i(String str) {
        sq8.m48649h(str, "hostname");
        return true;
    }

    /* renamed from: j */
    public void m24573j(String str, int i, Throwable th) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        f21193c.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: l */
    public void mo24574l(String str, Object obj) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m24573j(str, 5, (Throwable) obj);
    }

    /* renamed from: m */
    public SSLContext mo19312m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sq8.m48648g(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    /* renamed from: n */
    public SSLSocketFactory mo24575n(X509TrustManager x509TrustManager) throws KeyManagementException {
        sq8.m48649h(x509TrustManager, "trustManager");
        try {
            SSLContext sSLContextMo19312m = mo19312m();
            sSLContextMo19312m.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo19312m.getSocketFactory();
            sq8.m48648g(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* renamed from: o */
    public X509TrustManager mo19313o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public String toString() {
        String simpleName = getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
