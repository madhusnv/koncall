package tz;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import iz.d0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC4154l;
import pg.c8;
import rw.AbstractC6662l;
import uz.AbstractC7578c;
import uz.C7577b;
import uz.C7580e;
import uz.C7583h;
import uz.C7586k;
import uz.C7588m;
import uz.C7590o;
import uz.InterfaceC7589n;
import xz.C8519a;
import xz.InterfaceC8522d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tz.c */
/* loaded from: classes3.dex */
public final class C7284c extends AbstractC7285d {

    /* renamed from: d */
    public static final boolean f34748d;

    /* renamed from: c */
    public final ArrayList f34749c;

    static {
        f34748d = Build.VERSION.SDK_INT < 29;
    }

    public C7284c() throws ClassNotFoundException {
        C7590o c7590o;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c7590o = new C7590o(cls);
        } catch (Exception e2) {
            CopyOnWriteArraySet copyOnWriteArraySet = AbstractC7578c.f36454a;
            AbstractC7578c.m14313a(d0.class.getName(), 5, "unable to load android socket classes", e2);
            c7590o = null;
        }
        int i10 = 0;
        ArrayList arrayListM12729s = AbstractC6662l.m12729s(new InterfaceC7589n[]{c7590o, new C7588m(C7580e.f36457e), new C7588m(C7586k.f36464a), new C7588m(C7583h.f36462a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListM12729s.size();
        while (i10 < size) {
            Object obj = arrayListM12729s.get(i10);
            i10++;
            if (((InterfaceC7589n) obj).mo14310b()) {
                arrayList.add(obj);
            }
        }
        this.f34749c = arrayList;
    }

    @Override // tz.AbstractC7285d
    /* renamed from: a */
    public final c8 mo13606a(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C7577b c7577b = x509TrustManagerExtensions != null ? new C7577b(x509TrustManager, x509TrustManagerExtensions) : null;
        return c7577b != null ? c7577b : new C8519a(mo13607b(x509TrustManager));
    }

    @Override // tz.AbstractC7285d
    /* renamed from: b */
    public final InterfaceC8522d mo13607b(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C7283b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo13607b(x509TrustManager);
        }
    }

    @Override // tz.AbstractC7285d
    /* renamed from: c */
    public final void mo13608c(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        AbstractC4154l.m8923f(protocols, "protocols");
        ArrayList arrayList = this.f34749c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (((InterfaceC7589n) obj).mo14309a(sSLSocket)) {
                break;
            }
        }
        InterfaceC7589n interfaceC7589n = (InterfaceC7589n) obj;
        if (interfaceC7589n != null) {
            interfaceC7589n.mo14312d(sSLSocket, str, protocols);
        }
    }

    @Override // tz.AbstractC7285d
    /* renamed from: d */
    public final void mo13615d(Socket socket, InetSocketAddress address, int i10) throws IOException {
        AbstractC4154l.m8923f(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // tz.AbstractC7285d
    /* renamed from: e */
    public final String mo13609e(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f34749c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (((InterfaceC7589n) obj).mo14309a(sSLSocket)) {
                break;
            }
        }
        InterfaceC7589n interfaceC7589n = (InterfaceC7589n) obj;
        if (interfaceC7589n != null) {
            return interfaceC7589n.mo14311c(sSLSocket);
        }
        return null;
    }

    @Override // tz.AbstractC7285d
    /* renamed from: g */
    public final boolean mo13611g(String hostname) {
        AbstractC4154l.m8923f(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // tz.AbstractC7285d
    /* renamed from: h */
    public final void mo13616h(String message, int i10, Throwable th2) {
        AbstractC4154l.m8923f(message, "message");
    }

    @Override // tz.AbstractC7285d
    /* renamed from: j */
    public final SSLContext mo13613j() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.mo13613j();
    }
}
