package org.apache.http.conn.scheme;

import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes6.dex */
class SchemeLayeredSocketFactoryAdaptor2 implements SchemeLayeredSocketFactory {
    private final LayeredSchemeSocketFactory factory;

    public SchemeLayeredSocketFactoryAdaptor2(LayeredSchemeSocketFactory layeredSchemeSocketFactory) {
        this.factory = layeredSchemeSocketFactory;
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpParams httpParams) {
        return this.factory.connectSocket(socket, inetSocketAddress, inetSocketAddress2, httpParams);
    }

    @Override // org.apache.http.conn.scheme.SchemeLayeredSocketFactory
    public Socket createLayeredSocket(Socket socket, String str, int i, HttpParams httpParams) {
        return this.factory.createLayeredSocket(socket, str, i, true);
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket createSocket(HttpParams httpParams) {
        return this.factory.createSocket(httpParams);
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public boolean isSecure(Socket socket) {
        return this.factory.isSecure(socket);
    }
}
