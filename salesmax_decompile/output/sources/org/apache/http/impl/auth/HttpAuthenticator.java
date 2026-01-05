package org.apache.http.impl.auth;

import java.util.Queue;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthOption;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Asserts;
import p001o.eja;
import p001o.sia;

/* loaded from: classes6.dex */
public class HttpAuthenticator {
    private final sia log;

    /* renamed from: org.apache.http.impl.auth.HttpAuthenticator$1 */
    public static /* synthetic */ class C187521 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$http$auth$AuthProtocolState;

        static {
            int[] iArr = new int[AuthProtocolState.values().length];
            $SwitchMap$org$apache$http$auth$AuthProtocolState = iArr;
            try {
                iArr[AuthProtocolState.CHALLENGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$http$auth$AuthProtocolState[AuthProtocolState.HANDSHAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$http$auth$AuthProtocolState[AuthProtocolState.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$http$auth$AuthProtocolState[AuthProtocolState.FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$apache$http$auth$AuthProtocolState[AuthProtocolState.UNCHALLENGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public HttpAuthenticator(sia siaVar) {
        if (siaVar != null) {
            return;
        }
        eja.m25143k(getClass());
    }

    private Header doAuth(AuthScheme authScheme, Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        return authScheme instanceof ContextAwareAuthScheme ? ((ContextAwareAuthScheme) authScheme).authenticate(credentials, httpRequest, httpContext) : authScheme.authenticate(credentials, httpRequest);
    }

    private void ensureAuthScheme(AuthScheme authScheme) {
        Asserts.notNull(authScheme, "Auth scheme");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void generateAuthResponse(HttpRequest httpRequest, AuthState authState, HttpContext httpContext) {
        AuthScheme authScheme = authState.getAuthScheme();
        Credentials credentials = authState.getCredentials();
        int i = C187521.$SwitchMap$org$apache$http$auth$AuthProtocolState[authState.getState().ordinal()];
        if (i == 1) {
            Queue<AuthOption> authOptions = authState.getAuthOptions();
            if (authOptions != null) {
                if (authOptions.isEmpty()) {
                    return;
                }
                AuthOption authOptionRemove = authOptions.remove();
                authState.update(authOptionRemove.getAuthScheme(), authOptionRemove.getCredentials());
                throw null;
            }
            ensureAuthScheme(authScheme);
        } else if (i == 3) {
            ensureAuthScheme(authScheme);
            if (authScheme.isConnectionBased()) {
                return;
            }
        } else if (i == 4) {
            return;
        }
        if (authScheme != null) {
            try {
                httpRequest.addHeader(doAuth(authScheme, credentials, httpRequest, httpContext));
            } catch (AuthenticationException unused) {
                throw null;
            }
        }
    }

    public boolean handleAuthChallenge(HttpHost httpHost, HttpResponse httpResponse, AuthenticationStrategy authenticationStrategy, AuthState authState, HttpContext httpContext) {
        throw null;
    }

    public boolean isAuthenticationRequested(HttpHost httpHost, HttpResponse httpResponse, AuthenticationStrategy authenticationStrategy, AuthState authState, HttpContext httpContext) {
        int i;
        if (authenticationStrategy.isAuthenticationRequested(httpHost, httpResponse, httpContext) || (i = C187521.$SwitchMap$org$apache$http$auth$AuthProtocolState[authState.getState().ordinal()]) == 1 || i == 2) {
            throw null;
        }
        if (i == 3) {
            return false;
        }
        authState.setState(AuthProtocolState.UNCHALLENGED);
        return false;
    }

    public HttpAuthenticator() {
        this(null);
    }
}
