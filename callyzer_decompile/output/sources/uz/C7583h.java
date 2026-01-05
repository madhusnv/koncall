package uz;

import bl.C0689a;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import tz.AbstractC7285d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uz.h */
/* loaded from: classes3.dex */
public final class C7583h implements InterfaceC7589n {

    /* renamed from: a */
    public static final C7581f f36462a = new C7581f();

    /* renamed from: b */
    public static final boolean f36463b;

    static {
        boolean z6 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC7582g.class.getClassLoader());
            z6 = true;
        } catch (ClassNotFoundException unused) {
        }
        f36463b = z6;
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: a */
    public final boolean mo14309a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: b */
    public final boolean mo14310b() {
        return f36463b;
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: c */
    public final String mo14311c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: d */
    public final void mo14312d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC4154l.m8923f(protocols, "protocols");
        if (mo14309a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            AbstractC7285d abstractC7285d = AbstractC7285d.f34750a;
            parameters.setApplicationProtocols((String[]) C0689a.m1983k(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
