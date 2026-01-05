package org.apache.http.client.protocol;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class RequestAuthCache implements HttpRequestInterceptor {
    private final sia log;

    public RequestAuthCache() {
        eja.m25143k(getClass());
    }

    private void doPreemptiveAuth(HttpHost httpHost, AuthScheme authScheme, AuthState authState, CredentialsProvider credentialsProvider) {
        authScheme.getSchemeName();
        throw null;
    }

    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        AuthScheme authScheme;
        AuthScheme authScheme2;
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(httpContext);
        AuthCache authCache = httpClientContextAdapt.getAuthCache();
        authCache.getClass();
        CredentialsProvider credentialsProvider = httpClientContextAdapt.getCredentialsProvider();
        credentialsProvider.getClass();
        RouteInfo httpRoute = httpClientContextAdapt.getHttpRoute();
        httpRoute.getClass();
        HttpHost targetHost = httpClientContextAdapt.getTargetHost();
        targetHost.getClass();
        if (targetHost.getPort() < 0) {
            targetHost = new HttpHost(targetHost.getHostName(), httpRoute.getTargetHost().getPort(), targetHost.getSchemeName());
        }
        AuthState targetAuthState = httpClientContextAdapt.getTargetAuthState();
        if (targetAuthState != null && targetAuthState.getState() == AuthProtocolState.UNCHALLENGED && (authScheme2 = authCache.get(targetHost)) != null) {
            doPreemptiveAuth(targetHost, authScheme2, targetAuthState, credentialsProvider);
        }
        HttpHost proxyHost = httpRoute.getProxyHost();
        AuthState proxyAuthState = httpClientContextAdapt.getProxyAuthState();
        if (proxyHost == null || proxyAuthState == null || proxyAuthState.getState() != AuthProtocolState.UNCHALLENGED || (authScheme = authCache.get(proxyHost)) == null) {
            return;
        }
        doPreemptiveAuth(proxyHost, authScheme, proxyAuthState, credentialsProvider);
    }
}
