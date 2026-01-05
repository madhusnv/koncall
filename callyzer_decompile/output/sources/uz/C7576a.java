package uz;

import android.net.ssl.SSLSockets;
import android.os.Build;
import bl.C0689a;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4154l;
import tz.AbstractC7285d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uz.a */
/* loaded from: classes3.dex */
public final class C7576a implements InterfaceC7589n {
    @Override // uz.InterfaceC7589n
    /* renamed from: a */
    public final boolean mo14309a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: b */
    public final boolean mo14310b() {
        AbstractC7285d abstractC7285d = AbstractC7285d.f34750a;
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: c */
    public final String mo14311c(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: d */
    public final void mo14312d(SSLSocket sSLSocket, String str, List protocols) throws IOException {
        AbstractC4154l.m8923f(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            AbstractC7285d abstractC7285d = AbstractC7285d.f34750a;
            sSLParameters.setApplicationProtocols((String[]) C0689a.m1983k(protocols).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e2) {
            throw new IOException("Android internal error", e2);
        }
    }
}
