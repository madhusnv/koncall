package org.apache.http.impl.client;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthOption;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes6.dex */
class AuthenticationStrategyAdaptor implements AuthenticationStrategy {
    private final AuthenticationHandler handler;
    private final sia log;

    public AuthenticationStrategyAdaptor(AuthenticationHandler authenticationHandler) {
        eja.m25143k(getClass());
        this.handler = authenticationHandler;
    }

    private boolean isCachable(AuthScheme authScheme) {
        if (authScheme == null || !authScheme.isComplete()) {
            return false;
        }
        return authScheme.getSchemeName().equalsIgnoreCase("Basic");
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public void authFailed(HttpHost httpHost, AuthScheme authScheme, HttpContext httpContext) {
        if (((AuthCache) httpContext.getAttribute("http.auth.auth-cache")) != null) {
            throw null;
        }
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public void authSucceeded(HttpHost httpHost, AuthScheme authScheme, HttpContext httpContext) {
        AuthCache authCache = (AuthCache) httpContext.getAttribute("http.auth.auth-cache");
        if (isCachable(authScheme)) {
            if (authCache == null) {
                httpContext.setAttribute("http.auth.auth-cache", new BasicAuthCache());
            }
            throw null;
        }
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public Map<String, Header> getChallenges(HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        return this.handler.getChallenges(httpResponse, httpContext);
    }

    public AuthenticationHandler getHandler() {
        return this.handler;
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public boolean isAuthenticationRequested(HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        return this.handler.isAuthenticationRequested(httpResponse, httpContext);
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public Queue<AuthOption> select(Map<String, Header> map, HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(map, "Map of auth challenges");
        Args.notNull(httpHost, "Host");
        Args.notNull(httpResponse, "HTTP response");
        Args.notNull(httpContext, "HTTP context");
        LinkedList linkedList = new LinkedList();
        CredentialsProvider credentialsProvider = (CredentialsProvider) httpContext.getAttribute("http.auth.credentials-provider");
        credentialsProvider.getClass();
        try {
            AuthScheme authSchemeSelectScheme = this.handler.selectScheme(map, httpResponse, httpContext);
            authSchemeSelectScheme.processChallenge(map.get(authSchemeSelectScheme.getSchemeName().toLowerCase(Locale.ROOT)));
            Credentials credentials = credentialsProvider.getCredentials(new AuthScope(httpHost.getHostName(), httpHost.getPort(), authSchemeSelectScheme.getRealm(), authSchemeSelectScheme.getSchemeName()));
            if (credentials != null) {
                linkedList.add(new AuthOption(authSchemeSelectScheme, credentials));
            }
            return linkedList;
        } catch (AuthenticationException unused) {
            throw null;
        }
    }
}
