package org.apache.http.impl.client;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.protocol.HttpContext;
import p001o.sia;

@Deprecated
/* loaded from: classes6.dex */
public class HttpAuthenticator extends org.apache.http.impl.auth.HttpAuthenticator {
    public HttpAuthenticator(sia siaVar) {
        super(siaVar);
    }

    public boolean authenticate(HttpHost httpHost, HttpResponse httpResponse, AuthenticationStrategy authenticationStrategy, AuthState authState, HttpContext httpContext) {
        return handleAuthChallenge(httpHost, httpResponse, authenticationStrategy, authState, httpContext);
    }

    public HttpAuthenticator() {
    }
}
