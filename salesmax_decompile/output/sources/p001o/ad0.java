package p001o;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes6.dex */
public final class ad0 implements dyf {

    /* renamed from: a */
    public static final C12143a f14521a = new C12143a(null);

    /* renamed from: o.ad0$a */
    public static final class C12143a {
        public C12143a() {
        }

        public /* synthetic */ C12143a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final dyf m16890a() {
            if (m16891b()) {
                return new ad0();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m16891b() {
            return e9d.f21191a.m24583h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // p001o.dyf
    /* renamed from: a */
    public boolean mo16886a() {
        return f14521a.m16891b();
    }

    @Override // p001o.dyf
    /* renamed from: b */
    public boolean mo16887b(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p001o.dyf
    /* renamed from: c */
    public String mo16888c(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : sq8.m48644c(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // p001o.dyf
    /* renamed from: d */
    public void mo16889d(SSLSocket sSLSocket, String str, List list) throws IOException {
        sq8.m48649h(sSLSocket, "sslSocket");
        sq8.m48649h(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) e9d.f21191a.m24577b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
