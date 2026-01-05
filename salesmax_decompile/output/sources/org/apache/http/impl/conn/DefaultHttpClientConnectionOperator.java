package org.apache.http.impl.conn;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Lookup;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpClientConnectionOperator;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.UnsupportedSchemeException;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public class DefaultHttpClientConnectionOperator implements HttpClientConnectionOperator {
    static final String SOCKET_FACTORY_REGISTRY = "http.socket-factory-registry";
    private final DnsResolver dnsResolver;
    private final sia log;
    private final SchemePortResolver schemePortResolver;
    private final Lookup<ConnectionSocketFactory> socketFactoryRegistry;

    public DefaultHttpClientConnectionOperator(Lookup<ConnectionSocketFactory> lookup, SchemePortResolver schemePortResolver, DnsResolver dnsResolver) {
        eja.m25143k(getClass());
        Args.notNull(lookup, "Socket factory registry");
        this.socketFactoryRegistry = lookup;
        this.schemePortResolver = schemePortResolver == null ? DefaultSchemePortResolver.INSTANCE : schemePortResolver;
        this.dnsResolver = dnsResolver == null ? SystemDefaultDnsResolver.INSTANCE : dnsResolver;
    }

    private Lookup<ConnectionSocketFactory> getSocketFactoryRegistry(HttpContext httpContext) {
        Lookup<ConnectionSocketFactory> lookup = (Lookup) httpContext.getAttribute("http.socket-factory-registry");
        return lookup == null ? this.socketFactoryRegistry : lookup;
    }

    @Override // org.apache.http.conn.HttpClientConnectionOperator
    public void connect(ManagedHttpClientConnection managedHttpClientConnection, HttpHost httpHost, InetSocketAddress inetSocketAddress, int i, SocketConfig socketConfig, HttpContext httpContext) throws SocketException, UnsupportedSchemeException {
        ConnectionSocketFactory connectionSocketFactoryLookup = getSocketFactoryRegistry(httpContext).lookup(httpHost.getSchemeName());
        if (connectionSocketFactoryLookup == null) {
            throw new UnsupportedSchemeException(httpHost.getSchemeName() + " protocol is not supported");
        }
        InetAddress[] inetAddressArrResolve = httpHost.getAddress() != null ? new InetAddress[]{httpHost.getAddress()} : this.dnsResolver.resolve(httpHost.getHostName());
        int iResolve = this.schemePortResolver.resolve(httpHost);
        if (inetAddressArrResolve.length > 0) {
            InetAddress inetAddress = inetAddressArrResolve[0];
            Socket socketCreateSocket = connectionSocketFactoryLookup.createSocket(httpContext);
            socketCreateSocket.setSoTimeout(socketConfig.getSoTimeout());
            socketCreateSocket.setReuseAddress(socketConfig.isSoReuseAddress());
            socketCreateSocket.setTcpNoDelay(socketConfig.isTcpNoDelay());
            socketCreateSocket.setKeepAlive(socketConfig.isSoKeepAlive());
            if (socketConfig.getRcvBufSize() > 0) {
                socketCreateSocket.setReceiveBufferSize(socketConfig.getRcvBufSize());
            }
            if (socketConfig.getSndBufSize() > 0) {
                socketCreateSocket.setSendBufferSize(socketConfig.getSndBufSize());
            }
            int soLinger = socketConfig.getSoLinger();
            if (soLinger >= 0) {
                socketCreateSocket.setSoLinger(true, soLinger);
            }
            managedHttpClientConnection.bind(socketCreateSocket);
            new InetSocketAddress(inetAddress, iResolve);
            throw null;
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionOperator
    public void upgrade(ManagedHttpClientConnection managedHttpClientConnection, HttpHost httpHost, HttpContext httpContext) throws UnsupportedSchemeException {
        ConnectionSocketFactory connectionSocketFactoryLookup = getSocketFactoryRegistry(HttpClientContext.adapt(httpContext)).lookup(httpHost.getSchemeName());
        if (connectionSocketFactoryLookup == null) {
            throw new UnsupportedSchemeException(httpHost.getSchemeName() + " protocol is not supported");
        }
        if (connectionSocketFactoryLookup instanceof LayeredConnectionSocketFactory) {
            managedHttpClientConnection.bind(((LayeredConnectionSocketFactory) connectionSocketFactoryLookup).createLayeredSocket(managedHttpClientConnection.getSocket(), httpHost.getHostName(), this.schemePortResolver.resolve(httpHost), httpContext));
        } else {
            throw new UnsupportedSchemeException(httpHost.getSchemeName() + " protocol does not support connection upgrade");
        }
    }
}
