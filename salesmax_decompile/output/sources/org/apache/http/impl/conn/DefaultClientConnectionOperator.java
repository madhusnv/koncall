package org.apache.http.impl.conn;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpInetSocketAddress;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeLayeredSocketFactory;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SchemeSocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: classes6.dex */
public class DefaultClientConnectionOperator implements ClientConnectionOperator {
    protected final DnsResolver dnsResolver;
    private final sia log;
    protected final SchemeRegistry schemeRegistry;

    public DefaultClientConnectionOperator(SchemeRegistry schemeRegistry) {
        eja.m25143k(getClass());
        Args.notNull(schemeRegistry, "Scheme registry");
        this.schemeRegistry = schemeRegistry;
        this.dnsResolver = new SystemDefaultDnsResolver();
    }

    private SchemeRegistry getSchemeRegistry(HttpContext httpContext) {
        SchemeRegistry schemeRegistry = (SchemeRegistry) httpContext.getAttribute(ClientContext.SCHEME_REGISTRY);
        return schemeRegistry == null ? this.schemeRegistry : schemeRegistry;
    }

    @Override // org.apache.http.conn.ClientConnectionOperator
    public OperatedClientConnection createConnection() {
        return new DefaultClientConnection();
    }

    @Override // org.apache.http.conn.ClientConnectionOperator
    public void openConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, InetAddress inetAddress, HttpContext httpContext, HttpParams httpParams) {
        Args.notNull(operatedClientConnection, "Connection");
        Args.notNull(httpHost, "Target host");
        Args.notNull(httpParams, "HTTP parameters");
        Asserts.check(!operatedClientConnection.isOpen(), "Connection must not be open");
        Scheme scheme = getSchemeRegistry(httpContext).getScheme(httpHost.getSchemeName());
        SchemeSocketFactory schemeSocketFactory = scheme.getSchemeSocketFactory();
        InetAddress[] inetAddressArrResolveHostname = resolveHostname(httpHost.getHostName());
        int iResolvePort = scheme.resolvePort(httpHost.getPort());
        if (inetAddressArrResolveHostname.length > 0) {
            InetAddress inetAddress2 = inetAddressArrResolveHostname[0];
            operatedClientConnection.opening(schemeSocketFactory.createSocket(httpParams), httpHost);
            new HttpInetSocketAddress(httpHost, inetAddress2, iResolvePort);
            if (inetAddress != null) {
                new InetSocketAddress(inetAddress, 0);
            }
            throw null;
        }
    }

    public void prepareSocket(Socket socket, HttpContext httpContext, HttpParams httpParams) throws SocketException {
        socket.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(httpParams));
        socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
        int linger = HttpConnectionParams.getLinger(httpParams);
        if (linger >= 0) {
            socket.setSoLinger(linger > 0, linger);
        }
    }

    public InetAddress[] resolveHostname(String str) {
        return this.dnsResolver.resolve(str);
    }

    @Override // org.apache.http.conn.ClientConnectionOperator
    public void updateSecureConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, HttpContext httpContext, HttpParams httpParams) throws SocketException {
        Args.notNull(operatedClientConnection, "Connection");
        Args.notNull(httpHost, "Target host");
        Args.notNull(httpParams, "Parameters");
        Asserts.check(operatedClientConnection.isOpen(), "Connection must be open");
        Scheme scheme = getSchemeRegistry(httpContext).getScheme(httpHost.getSchemeName());
        Asserts.check(scheme.getSchemeSocketFactory() instanceof SchemeLayeredSocketFactory, "Socket factory must implement SchemeLayeredSocketFactory");
        SchemeLayeredSocketFactory schemeLayeredSocketFactory = (SchemeLayeredSocketFactory) scheme.getSchemeSocketFactory();
        Socket socketCreateLayeredSocket = schemeLayeredSocketFactory.createLayeredSocket(operatedClientConnection.getSocket(), httpHost.getHostName(), scheme.resolvePort(httpHost.getPort()), httpParams);
        prepareSocket(socketCreateLayeredSocket, httpContext, httpParams);
        operatedClientConnection.update(socketCreateLayeredSocket, httpHost, schemeLayeredSocketFactory.isSecure(socketCreateLayeredSocket), httpParams);
    }

    public DefaultClientConnectionOperator(SchemeRegistry schemeRegistry, DnsResolver dnsResolver) {
        eja.m25143k(getClass());
        Args.notNull(schemeRegistry, "Scheme registry");
        Args.notNull(dnsResolver, "DNS resolver");
        this.schemeRegistry = schemeRegistry;
        this.dnsResolver = dnsResolver;
    }
}
