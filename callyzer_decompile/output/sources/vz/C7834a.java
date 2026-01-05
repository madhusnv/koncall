package vz;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import og.pe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vz.a */
/* loaded from: classes3.dex */
public final class C7834a extends ProxySelector {

    /* renamed from: a */
    public static final C7834a f37586a = new C7834a();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return pe.m10833h(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
