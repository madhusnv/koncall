package org.apache.http.impl.client;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.methods.AbortableHttpRequest;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.BasicManagedEntity;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.conn.ConnectionShutdownException;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;
import p001o.eja;
import p001o.sia;

@Deprecated
/* loaded from: classes6.dex */
public class DefaultRequestDirector implements RequestDirector {
    private final HttpAuthenticator authenticator;
    protected final ClientConnectionManager connManager;
    private int execCount;
    protected final HttpProcessor httpProcessor;
    protected final ConnectionKeepAliveStrategy keepAliveStrategy;
    private final sia log;
    protected ManagedClientConnection managedConn;
    private final int maxRedirects;
    protected final HttpParams params;
    protected final AuthenticationHandler proxyAuthHandler;
    protected final AuthState proxyAuthState;
    protected final AuthenticationStrategy proxyAuthStrategy;
    private int redirectCount;
    protected final RedirectHandler redirectHandler;
    protected final RedirectStrategy redirectStrategy;
    protected final HttpRequestExecutor requestExec;
    protected final HttpRequestRetryHandler retryHandler;
    protected final ConnectionReuseStrategy reuseStrategy;
    protected final HttpRoutePlanner routePlanner;
    protected final AuthenticationHandler targetAuthHandler;
    protected final AuthState targetAuthState;
    protected final AuthenticationStrategy targetAuthStrategy;
    protected final UserTokenHandler userTokenHandler;
    private HttpHost virtualHost;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultRequestDirector(HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor, HttpRequestRetryHandler httpRequestRetryHandler, RedirectHandler redirectHandler, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler, HttpParams httpParams) {
        this((sia) null, httpRequestExecutor, clientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpRoutePlanner, httpProcessor, httpRequestRetryHandler, new DefaultRedirectStrategyAdaptor(redirectHandler), new AuthenticationStrategyAdaptor(authenticationHandler), new AuthenticationStrategyAdaptor(authenticationHandler2), userTokenHandler, httpParams);
        eja.m25143k(DefaultRequestDirector.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void abortConnection() {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection != null) {
            this.managedConn = null;
            try {
                managedClientConnection.abortConnection();
                try {
                    managedClientConnection.releaseConnection();
                } catch (IOException unused) {
                    throw null;
                }
            } catch (IOException unused2) {
                throw null;
            }
        }
    }

    private void tryConnect(RoutedRequest routedRequest, HttpContext httpContext) throws HttpException, IOException {
        HttpRoute route = routedRequest.getRoute();
        httpContext.setAttribute("http.request", routedRequest.getRequest());
        int i = 0 + 1;
        try {
            if (this.managedConn.isOpen()) {
                this.managedConn.setSocketTimeout(HttpConnectionParams.getSoTimeout(this.params));
            } else {
                this.managedConn.open(route, httpContext, this.params);
            }
            establishRoute(route, httpContext);
        } catch (IOException e) {
            try {
                this.managedConn.close();
            } catch (IOException unused) {
            }
            if (!this.retryHandler.retryRequest(e, i, httpContext)) {
                throw e;
            }
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HttpResponse tryExecute(RoutedRequest routedRequest, HttpContext httpContext) {
        RequestWrapper request = routedRequest.getRequest();
        HttpRoute route = routedRequest.getRoute();
        this.execCount++;
        request.incrementExecCount();
        if (!request.isRepeatable()) {
            throw null;
        }
        try {
            if (this.managedConn.isOpen()) {
                throw null;
            }
            if (route.isTunnelled()) {
                throw null;
            }
            throw null;
        } catch (IOException unused) {
            throw null;
        }
    }

    private RequestWrapper wrapRequest(HttpRequest httpRequest) {
        return httpRequest instanceof HttpEntityEnclosingRequest ? new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpRequest) : new RequestWrapper(httpRequest);
    }

    public HttpRequest createConnectRequest(HttpRoute httpRoute, HttpContext httpContext) {
        HttpHost targetHost = httpRoute.getTargetHost();
        String hostName = targetHost.getHostName();
        int port = targetHost.getPort();
        if (port < 0) {
            port = this.connManager.getSchemeRegistry().getScheme(targetHost.getSchemeName()).getDefaultPort();
        }
        StringBuilder sb = new StringBuilder(hostName.length() + 6);
        sb.append(hostName);
        sb.append(':');
        sb.append(Integer.toString(port));
        return new BasicHttpRequest("CONNECT", sb.toString(), HttpProtocolParams.getVersion(this.params));
    }

    public boolean createTunnelToProxy(HttpRoute httpRoute, int i, HttpContext httpContext) throws HttpException {
        throw new HttpException("Proxy chains are not supported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        if (r8.getStatusLine().getStatusCode() <= 299) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        r10 = r8.getEntity();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        if (r10 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        r8.setEntity(new org.apache.http.entity.BufferedHttpEntity(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
    
        r9.managedConn.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d2, code lost:
    
        throw new org.apache.http.impl.client.TunnelRefusedException("CONNECT refused by proxy: " + r8.getStatusLine(), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d3, code lost:
    
        r9.managedConn.markReusable();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean createTunnelToTarget(HttpRoute httpRoute, HttpContext httpContext) throws HttpException, IOException {
        HttpHost proxyHost = httpRoute.getProxyHost();
        HttpHost targetHost = httpRoute.getTargetHost();
        while (true) {
            if (!this.managedConn.isOpen()) {
                this.managedConn.open(httpRoute, httpContext, this.params);
            }
            HttpRequest httpRequestCreateConnectRequest = createConnectRequest(httpRoute, httpContext);
            httpRequestCreateConnectRequest.setParams(this.params);
            httpContext.setAttribute("http.target_host", targetHost);
            httpContext.setAttribute("http.route", httpRoute);
            httpContext.setAttribute(ExecutionContext.HTTP_PROXY_HOST, proxyHost);
            httpContext.setAttribute("http.connection", this.managedConn);
            httpContext.setAttribute("http.request", httpRequestCreateConnectRequest);
            this.requestExec.preProcess(httpRequestCreateConnectRequest, this.httpProcessor, httpContext);
            HttpResponse httpResponseExecute = this.requestExec.execute(httpRequestCreateConnectRequest, this.managedConn, httpContext);
            httpResponseExecute.setParams(this.params);
            this.requestExec.postProcess(httpResponseExecute, this.httpProcessor, httpContext);
            if (httpResponseExecute.getStatusLine().getStatusCode() < 200) {
                throw new HttpException("Unexpected response to CONNECT request: " + httpResponseExecute.getStatusLine());
            }
            if (HttpClientParams.isAuthenticating(this.params)) {
                if (!this.authenticator.isAuthenticationRequested(proxyHost, httpResponseExecute, this.proxyAuthStrategy, this.proxyAuthState, httpContext) || !this.authenticator.authenticate(proxyHost, httpResponseExecute, this.proxyAuthStrategy, this.proxyAuthState, httpContext)) {
                    break;
                }
                if (this.reuseStrategy.keepAlive(httpResponseExecute, httpContext)) {
                    throw null;
                }
                this.managedConn.close();
            }
        }
    }

    public HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        HttpRoutePlanner httpRoutePlanner = this.routePlanner;
        if (httpHost == null) {
            httpHost = (HttpHost) httpRequest.getParams().getParameter(ClientPNames.DEFAULT_HOST);
        }
        return httpRoutePlanner.determineRoute(httpHost, httpRequest, httpContext);
    }

    public void establishRoute(HttpRoute httpRoute, HttpContext httpContext) throws HttpException, IOException {
        int iNextStep;
        BasicRouteDirector basicRouteDirector = new BasicRouteDirector();
        do {
            HttpRoute route = this.managedConn.getRoute();
            iNextStep = basicRouteDirector.nextStep(httpRoute, route);
            switch (iNextStep) {
                case -1:
                    throw new HttpException("Unable to establish route: planned = " + httpRoute + "; current = " + route);
                case 0:
                    break;
                case 1:
                case 2:
                    this.managedConn.open(httpRoute, httpContext, this.params);
                    break;
                case 3:
                    createTunnelToTarget(httpRoute, httpContext);
                    throw null;
                case 4:
                    createTunnelToProxy(httpRoute, route.getHopCount() - 1, httpContext);
                    throw null;
                case 5:
                    this.managedConn.layerProtocol(httpContext, this.params);
                    break;
                default:
                    throw new IllegalStateException("Unknown step indicator " + iNextStep + " from RouteDirector.");
            }
        } while (iNextStep > 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
    
        throw null;
     */
    @Override // org.apache.http.client.RequestDirector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        httpContext.setAttribute("http.auth.target-scope", this.targetAuthState);
        httpContext.setAttribute("http.auth.proxy-scope", this.proxyAuthState);
        RequestWrapper requestWrapperWrapRequest = wrapRequest(httpRequest);
        requestWrapperWrapRequest.setParams(this.params);
        HttpRoute httpRouteDetermineRoute = determineRoute(httpHost, requestWrapperWrapRequest, httpContext);
        HttpHost httpHost2 = (HttpHost) requestWrapperWrapRequest.getParams().getParameter(ClientPNames.VIRTUAL_HOST);
        this.virtualHost = httpHost2;
        if (httpHost2 != null && httpHost2.getPort() == -1) {
            int port = (httpHost != null ? httpHost : httpRouteDetermineRoute.getTargetHost()).getPort();
            if (port != -1) {
                this.virtualHost = new HttpHost(this.virtualHost.getHostName(), port, this.virtualHost.getSchemeName());
            }
        }
        RoutedRequest routedRequest = new RoutedRequest(requestWrapperWrapRequest, httpRouteDetermineRoute);
        boolean z = false;
        HttpResponse httpResponseTryExecute = null;
        RoutedRequest routedRequest2 = routedRequest;
        boolean zKeepAlive = false;
        while (!z) {
            try {
                try {
                    RequestWrapper request = routedRequest2.getRequest();
                    HttpRoute route = routedRequest2.getRoute();
                    Object attribute = httpContext.getAttribute("http.user-token");
                    if (this.managedConn == null) {
                        ClientConnectionRequest clientConnectionRequestRequestConnection = this.connManager.requestConnection(route, attribute);
                        if (httpRequest instanceof AbortableHttpRequest) {
                            ((AbortableHttpRequest) httpRequest).setConnectionRequest(clientConnectionRequestRequestConnection);
                        }
                        try {
                            this.managedConn = clientConnectionRequestRequestConnection.getConnection(HttpClientParams.getConnectionManagerTimeout(this.params), TimeUnit.MILLISECONDS);
                            if (HttpConnectionParams.isStaleCheckingEnabled(this.params) && this.managedConn.isOpen()) {
                                throw null;
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                    if (httpRequest instanceof AbortableHttpRequest) {
                        ((AbortableHttpRequest) httpRequest).setReleaseTrigger(this.managedConn);
                    }
                    try {
                        tryConnect(routedRequest2, httpContext);
                        String userInfo = request.getURI().getUserInfo();
                        if (userInfo != null) {
                            this.targetAuthState.update(new BasicScheme(), new UsernamePasswordCredentials(userInfo));
                        }
                        HttpHost httpHost3 = this.virtualHost;
                        if (httpHost3 != null) {
                            httpHost = httpHost3;
                        } else {
                            URI uri = request.getURI();
                            if (uri.isAbsolute()) {
                                httpHost = URIUtils.extractHost(uri);
                            }
                        }
                        if (httpHost == null) {
                            httpHost = route.getTargetHost();
                        }
                        request.resetHeaders();
                        rewriteRequestURI(request, route);
                        httpContext.setAttribute("http.target_host", httpHost);
                        httpContext.setAttribute("http.route", route);
                        httpContext.setAttribute("http.connection", this.managedConn);
                        this.requestExec.preProcess(request, this.httpProcessor, httpContext);
                        httpResponseTryExecute = tryExecute(routedRequest2, httpContext);
                        if (httpResponseTryExecute != null) {
                            httpResponseTryExecute.setParams(this.params);
                            this.requestExec.postProcess(httpResponseTryExecute, this.httpProcessor, httpContext);
                            zKeepAlive = this.reuseStrategy.keepAlive(httpResponseTryExecute, httpContext);
                            if (zKeepAlive) {
                                this.keepAliveStrategy.getKeepAliveDuration(httpResponseTryExecute, httpContext);
                                throw null;
                            }
                            RoutedRequest routedRequestHandleResponse = handleResponse(routedRequest2, httpResponseTryExecute, httpContext);
                            if (routedRequestHandleResponse == null) {
                                z = true;
                            } else {
                                if (zKeepAlive) {
                                    EntityUtils.consume(httpResponseTryExecute.getEntity());
                                    this.managedConn.markReusable();
                                } else {
                                    this.managedConn.close();
                                    AuthProtocolState state = this.proxyAuthState.getState();
                                    AuthProtocolState authProtocolState = AuthProtocolState.CHALLENGED;
                                    if (state.compareTo(authProtocolState) > 0 && this.proxyAuthState.getAuthScheme() != null && this.proxyAuthState.getAuthScheme().isConnectionBased()) {
                                        throw null;
                                    }
                                    if (this.targetAuthState.getState().compareTo(authProtocolState) > 0 && this.targetAuthState.getAuthScheme() != null && this.targetAuthState.getAuthScheme().isConnectionBased()) {
                                        throw null;
                                    }
                                }
                                if (!routedRequestHandleResponse.getRoute().equals(routedRequest2.getRoute())) {
                                    releaseConnection();
                                }
                                routedRequest2 = routedRequestHandleResponse;
                            }
                            if (this.managedConn != null) {
                                if (attribute == null) {
                                    attribute = this.userTokenHandler.getUserToken(httpContext);
                                    httpContext.setAttribute("http.user-token", attribute);
                                }
                                if (attribute != null) {
                                    this.managedConn.setState(attribute);
                                }
                            }
                        }
                    } catch (TunnelRefusedException unused2) {
                        throw null;
                    }
                } catch (RuntimeException e) {
                    abortConnection();
                    throw e;
                }
            } catch (IOException e2) {
                abortConnection();
                throw e2;
            } catch (HttpException e3) {
                abortConnection();
                throw e3;
            } catch (ConnectionShutdownException e4) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("Connection has been shut down");
                interruptedIOException.initCause(e4);
                throw interruptedIOException;
            }
        }
        if (httpResponseTryExecute == null || httpResponseTryExecute.getEntity() == null || !httpResponseTryExecute.getEntity().isStreaming()) {
            if (zKeepAlive) {
                this.managedConn.markReusable();
            }
            releaseConnection();
        } else {
            httpResponseTryExecute.setEntity(new BasicManagedEntity(httpResponseTryExecute.getEntity(), this.managedConn, zKeepAlive));
        }
        return httpResponseTryExecute;
    }

    public RoutedRequest handleResponse(RoutedRequest routedRequest, HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException, NumberFormatException {
        HttpHost httpHost;
        HttpRoute route = routedRequest.getRoute();
        RequestWrapper request = routedRequest.getRequest();
        HttpParams params = request.getParams();
        if (HttpClientParams.isAuthenticating(params)) {
            HttpHost targetHost = (HttpHost) httpContext.getAttribute("http.target_host");
            if (targetHost == null) {
                targetHost = route.getTargetHost();
            }
            if (targetHost.getPort() < 0) {
                httpHost = new HttpHost(targetHost.getHostName(), this.connManager.getSchemeRegistry().getScheme(targetHost).getDefaultPort(), targetHost.getSchemeName());
            } else {
                httpHost = targetHost;
            }
            boolean zIsAuthenticationRequested = this.authenticator.isAuthenticationRequested(httpHost, httpResponse, this.targetAuthStrategy, this.targetAuthState, httpContext);
            HttpHost proxyHost = route.getProxyHost();
            if (proxyHost == null) {
                proxyHost = route.getTargetHost();
            }
            HttpHost httpHost2 = proxyHost;
            boolean zIsAuthenticationRequested2 = this.authenticator.isAuthenticationRequested(httpHost2, httpResponse, this.proxyAuthStrategy, this.proxyAuthState, httpContext);
            if (zIsAuthenticationRequested) {
                if (this.authenticator.authenticate(httpHost, httpResponse, this.targetAuthStrategy, this.targetAuthState, httpContext)) {
                    return routedRequest;
                }
            }
            if (zIsAuthenticationRequested2 && this.authenticator.authenticate(httpHost2, httpResponse, this.proxyAuthStrategy, this.proxyAuthState, httpContext)) {
                return routedRequest;
            }
        }
        if (!HttpClientParams.isRedirecting(params) || !this.redirectStrategy.isRedirected(request, httpResponse, httpContext)) {
            return null;
        }
        int i = this.redirectCount;
        if (i >= this.maxRedirects) {
            throw new RedirectException("Maximum redirects (" + this.maxRedirects + ") exceeded");
        }
        this.redirectCount = i + 1;
        this.virtualHost = null;
        HttpUriRequest redirect = this.redirectStrategy.getRedirect(request, httpResponse, httpContext);
        redirect.setHeaders(request.getOriginal().getAllHeaders());
        URI uri = redirect.getURI();
        HttpHost httpHostExtractHost = URIUtils.extractHost(uri);
        if (httpHostExtractHost == null) {
            throw new ProtocolException("Redirect URI does not specify a valid host name: " + uri);
        }
        if (!route.getTargetHost().equals(httpHostExtractHost)) {
            throw null;
        }
        RequestWrapper requestWrapperWrapRequest = wrapRequest(redirect);
        requestWrapperWrapRequest.setParams(params);
        new RoutedRequest(requestWrapperWrapRequest, determineRoute(httpHostExtractHost, requestWrapperWrapRequest, httpContext));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void releaseConnection() {
        try {
            this.managedConn.releaseConnection();
            this.managedConn = null;
        } catch (IOException unused) {
            throw null;
        }
    }

    public void rewriteRequestURI(RequestWrapper requestWrapper, HttpRoute httpRoute) throws ProtocolException {
        try {
            URI uri = requestWrapper.getURI();
            requestWrapper.setURI((httpRoute.getProxyHost() == null || httpRoute.isTunnelled()) ? uri.isAbsolute() ? URIUtils.rewriteURI(uri, (HttpHost) null, URIUtils.DROP_FRAGMENT_AND_NORMALIZE) : URIUtils.rewriteURI(uri) : !uri.isAbsolute() ? URIUtils.rewriteURI(uri, httpRoute.getTargetHost(), URIUtils.DROP_FRAGMENT_AND_NORMALIZE) : URIUtils.rewriteURI(uri));
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid URI: " + requestWrapper.getRequestLine().getUri(), e);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultRequestDirector(sia siaVar, HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor, HttpRequestRetryHandler httpRequestRetryHandler, RedirectStrategy redirectStrategy, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler, HttpParams httpParams) {
        this((sia) null, httpRequestExecutor, clientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpRoutePlanner, httpProcessor, httpRequestRetryHandler, redirectStrategy, new AuthenticationStrategyAdaptor(authenticationHandler), new AuthenticationStrategyAdaptor(authenticationHandler2), userTokenHandler, httpParams);
        eja.m25143k(DefaultRequestDirector.class);
    }

    public DefaultRequestDirector(sia siaVar, HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor, HttpRequestRetryHandler httpRequestRetryHandler, RedirectStrategy redirectStrategy, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler, HttpParams httpParams) {
        Args.notNull(siaVar, "Log");
        Args.notNull(httpRequestExecutor, "Request executor");
        Args.notNull(clientConnectionManager, "Client connection manager");
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        Args.notNull(connectionKeepAliveStrategy, "Connection keep alive strategy");
        Args.notNull(httpRoutePlanner, "Route planner");
        Args.notNull(httpProcessor, "HTTP protocol processor");
        Args.notNull(httpRequestRetryHandler, "HTTP request retry handler");
        Args.notNull(redirectStrategy, "Redirect strategy");
        Args.notNull(authenticationStrategy, "Target authentication strategy");
        Args.notNull(authenticationStrategy2, "Proxy authentication strategy");
        Args.notNull(userTokenHandler, "User token handler");
        Args.notNull(httpParams, "HTTP parameters");
        this.authenticator = new HttpAuthenticator(siaVar);
        this.requestExec = httpRequestExecutor;
        this.connManager = clientConnectionManager;
        this.reuseStrategy = connectionReuseStrategy;
        this.keepAliveStrategy = connectionKeepAliveStrategy;
        this.routePlanner = httpRoutePlanner;
        this.httpProcessor = httpProcessor;
        this.retryHandler = httpRequestRetryHandler;
        this.redirectStrategy = redirectStrategy;
        this.targetAuthStrategy = authenticationStrategy;
        this.proxyAuthStrategy = authenticationStrategy2;
        this.userTokenHandler = userTokenHandler;
        this.params = httpParams;
        if (redirectStrategy instanceof DefaultRedirectStrategyAdaptor) {
            this.redirectHandler = ((DefaultRedirectStrategyAdaptor) redirectStrategy).getHandler();
        } else {
            this.redirectHandler = null;
        }
        if (authenticationStrategy instanceof AuthenticationStrategyAdaptor) {
            this.targetAuthHandler = ((AuthenticationStrategyAdaptor) authenticationStrategy).getHandler();
        } else {
            this.targetAuthHandler = null;
        }
        if (authenticationStrategy2 instanceof AuthenticationStrategyAdaptor) {
            this.proxyAuthHandler = ((AuthenticationStrategyAdaptor) authenticationStrategy2).getHandler();
        } else {
            this.proxyAuthHandler = null;
        }
        this.managedConn = null;
        this.execCount = 0;
        this.redirectCount = 0;
        this.targetAuthState = new AuthState();
        this.proxyAuthState = new AuthState();
        this.maxRedirects = httpParams.getIntParameter(ClientPNames.MAX_REDIRECTS, 100);
    }
}
