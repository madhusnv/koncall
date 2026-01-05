package p001o;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p001o.u2e;

/* loaded from: classes3.dex */
public final class rac extends ProxySelector {

    /* renamed from: a */
    public final y2e f43321a;

    public rac(y2e y2eVar) {
        sq8.m48649h(y2eVar, "sdkSelector");
        this.f43321a = y2eVar;
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public List select(URI uri) {
        if (uri == null) {
            return ch3.m21246k();
        }
        u2e u2eVarMo52844a = this.f43321a.mo52844a(tac.m49659i(uri));
        if (!(u2eVarMo52844a instanceof u2e.C17286b)) {
            return ch3.m21246k();
        }
        u2e.C17286b c17286b = (u2e.C17286b) u2eVarMo52844a;
        return bh3.m18963e(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(c17286b.m50869a().m36755b().toString(), c17286b.m50869a().m36758e())));
    }
}
