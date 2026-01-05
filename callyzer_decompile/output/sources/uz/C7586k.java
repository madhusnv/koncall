package uz;

import bl.C0689a;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4154l;
import org.conscrypt.Conscrypt;
import tz.AbstractC7285d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uz.k */
/* loaded from: classes3.dex */
public final class C7586k implements InterfaceC7589n {

    /* renamed from: a */
    public static final C7584i f36464a = new C7584i();

    /* renamed from: b */
    public static final boolean f36465b;

    static {
        boolean z6 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC7585j.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC7585j.m14315a()) {
                    z6 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f36465b = z6;
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: a */
    public final boolean mo14309a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: b */
    public final boolean mo14310b() {
        return f36465b;
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: c */
    public final String mo14311c(SSLSocket sSLSocket) {
        if (mo14309a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: d */
    public final void mo14312d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC4154l.m8923f(protocols, "protocols");
        if (mo14309a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            AbstractC7285d abstractC7285d = AbstractC7285d.f34750a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C0689a.m1983k(protocols).toArray(new String[0]));
        }
    }
}
