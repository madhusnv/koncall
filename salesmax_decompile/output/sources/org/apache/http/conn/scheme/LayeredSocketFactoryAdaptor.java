package org.apache.http.conn.scheme;

import java.net.Socket;

@Deprecated
/* loaded from: classes6.dex */
class LayeredSocketFactoryAdaptor extends SocketFactoryAdaptor implements LayeredSocketFactory {
    private final LayeredSchemeSocketFactory factory;

    public LayeredSocketFactoryAdaptor(LayeredSchemeSocketFactory layeredSchemeSocketFactory) {
        super(layeredSchemeSocketFactory);
        this.factory = layeredSchemeSocketFactory;
    }

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.factory.createLayeredSocket(socket, str, i, z);
    }
}
