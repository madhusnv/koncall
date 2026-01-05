package tz;

import android.os.Build;
import android.util.Log;
import iz.d0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import pg.c8;
import uz.AbstractC7578c;
import uz.C7579d;
import xz.C8520b;
import xz.InterfaceC8522d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tz.d */
/* loaded from: classes3.dex */
public abstract class AbstractC7285d {

    /* renamed from: a */
    public static volatile AbstractC7285d f34750a;

    /* renamed from: b */
    public static final Logger f34751b;

    static {
        try {
            for (Map.Entry entry : AbstractC7578c.f36455b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (AbstractC7578c.f36454a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(C7579d.f36456a);
                }
            }
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }
        AbstractC7285d c7282a = C7282a.f34744d ? new C7282a() : null;
        if (c7282a == null) {
            c7282a = C7284c.f34748d ? new C7284c() : null;
        }
        if (c7282a == null) {
            throw new IllegalStateException(AbstractC4801l.m9730d(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        f34750a = c7282a;
        f34751b = Logger.getLogger(d0.class.getName());
    }

    /* renamed from: a */
    public abstract c8 mo13606a(X509TrustManager x509TrustManager);

    /* renamed from: b */
    public InterfaceC8522d mo13607b(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new C8520b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: c */
    public abstract void mo13608c(SSLSocket sSLSocket, String str, List list);

    /* renamed from: d */
    public void mo13615d(Socket socket, InetSocketAddress address, int i10) throws IOException {
        AbstractC4154l.m8923f(address, "address");
        socket.connect(address, i10);
    }

    /* renamed from: e */
    public abstract String mo13609e(SSLSocket sSLSocket);

    /* renamed from: f */
    public Object mo13610f() {
        if (f34751b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* renamed from: g */
    public abstract boolean mo13611g(String str);

    /* renamed from: h */
    public void mo13616h(String message, int i10, Throwable th2) {
        AbstractC4154l.m8923f(message, "message");
        f34751b.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    /* renamed from: i */
    public void mo13612i(Object obj, String message) {
        AbstractC4154l.m8923f(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo13616h(message, 5, (Throwable) obj);
    }

    /* renamed from: j */
    public SSLContext mo13613j() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC4154l.m8922e(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
