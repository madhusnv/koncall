package p001o;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* loaded from: classes6.dex */
public final class x4c extends ProxySelector {

    /* renamed from: a */
    public static final x4c f53186a = new x4c();

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public List select(URI uri) {
        if (uri != null) {
            return bh3.m18963e(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
