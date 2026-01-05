package p001o;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p001o.j3g;

/* loaded from: classes6.dex */
public final class ef0 extends e9d {

    /* renamed from: e */
    public static final C13171a f21513e = new C13171a(null);

    /* renamed from: f */
    public static final boolean f21514f;

    /* renamed from: d */
    public final List f21515d;

    /* renamed from: o.ef0$a */
    public static final class C13171a {
        public C13171a() {
        }

        public /* synthetic */ C13171a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final e9d m24889a() {
            if (m24890b()) {
                return new ef0();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m24890b() {
            return ef0.f21514f;
        }
    }

    /* renamed from: o.ef0$b */
    public static final class C13172b implements xxh {

        /* renamed from: a */
        public final X509TrustManager f21516a;

        /* renamed from: b */
        public final Method f21517b;

        public C13172b(X509TrustManager x509TrustManager, Method method) {
            sq8.m48649h(x509TrustManager, "trustManager");
            sq8.m48649h(method, "findByIssuerAndSignatureMethod");
            this.f21516a = x509TrustManager;
            this.f21517b = method;
        }

        @Override // p001o.xxh
        /* renamed from: a */
        public X509Certificate mo24891a(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            sq8.m48649h(x509Certificate, "cert");
            try {
                Object objInvoke = this.f21517b.invoke(this.f21516a, x509Certificate);
                sq8.m48647f(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13172b)) {
                return false;
            }
            C13172b c13172b = (C13172b) obj;
            return sq8.m48644c(this.f21516a, c13172b.f21516a) && sq8.m48644c(this.f21517b, c13172b.f21517b);
        }

        public int hashCode() {
            return (this.f21516a.hashCode() * 31) + this.f21517b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f21516a + ", findByIssuerAndSignatureMethod=" + this.f21517b + ')';
        }
    }

    static {
        boolean z = false;
        if (e9d.f21191a.m24583h() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f21514f = z;
    }

    public ef0() {
        List listM21251p = ch3.m21251p(j3g.C14445a.m33177b(j3g.f29725j, null, 1, null), new kk5(pf0.f39972f.m43549d()), new kk5(nt3.f37282a.m41108a()), new kk5(cl1.f18286a.m21374a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM21251p) {
            if (((dyf) obj).mo16886a()) {
                arrayList.add(obj);
            }
        }
        this.f21515d = arrayList;
    }

    @Override // p001o.e9d
    /* renamed from: c */
    public of2 mo24568c(X509TrustManager x509TrustManager) {
        sq8.m48649h(x509TrustManager, "trustManager");
        nd0 nd0VarM40366a = nd0.f36693d.m40366a(x509TrustManager);
        return nd0VarM40366a != null ? nd0VarM40366a : super.mo24568c(x509TrustManager);
    }

    @Override // p001o.e9d
    /* renamed from: d */
    public xxh mo24569d(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        sq8.m48649h(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            sq8.m48646e(declaredMethod);
            return new C13172b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo24569d(x509TrustManager);
        }
    }

    @Override // p001o.e9d
    /* renamed from: e */
    public void mo19310e(SSLSocket sSLSocket, String str, List list) {
        Object next;
        sq8.m48649h(sSLSocket, "sslSocket");
        sq8.m48649h(list, "protocols");
        Iterator it = this.f21515d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((dyf) next).mo16887b(sSLSocket)) {
                    break;
                }
            }
        }
        dyf dyfVar = (dyf) next;
        if (dyfVar != null) {
            dyfVar.mo16889d(sSLSocket, str, list);
        }
    }

    @Override // p001o.e9d
    /* renamed from: f */
    public void mo24570f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        sq8.m48649h(socket, "socket");
        sq8.m48649h(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // p001o.e9d
    /* renamed from: g */
    public String mo19311g(SSLSocket sSLSocket) {
        Object next;
        sq8.m48649h(sSLSocket, "sslSocket");
        Iterator it = this.f21515d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((dyf) next).mo16887b(sSLSocket)) {
                break;
            }
        }
        dyf dyfVar = (dyf) next;
        if (dyfVar != null) {
            return dyfVar.mo16888c(sSLSocket);
        }
        return null;
    }

    @Override // p001o.e9d
    /* renamed from: i */
    public boolean mo24572i(String str) {
        sq8.m48649h(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
