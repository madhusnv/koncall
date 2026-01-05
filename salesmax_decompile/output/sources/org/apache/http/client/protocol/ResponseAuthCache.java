package org.apache.http.client.protocol;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthCache;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes6.dex */
public class ResponseAuthCache implements HttpResponseInterceptor {
    private final sia log;

    /* renamed from: org.apache.http.client.protocol.ResponseAuthCache$1 */
    public static /* synthetic */ class C187471 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$http$auth$AuthProtocolState;

        static {
            int[] iArr = new int[AuthProtocolState.values().length];
            $SwitchMap$org$apache$http$auth$AuthProtocolState = iArr;
            try {
                iArr[AuthProtocolState.CHALLENGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$http$auth$AuthProtocolState[AuthProtocolState.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ResponseAuthCache() {
        eja.m25143k(getClass());
    }

    private void cache(AuthCache authCache, HttpHost httpHost, AuthScheme authScheme) {
        throw null;
    }

    private boolean isCachable(AuthState authState) {
        AuthScheme authScheme = authState.getAuthScheme();
        if (authScheme == null || !authScheme.isComplete()) {
            return false;
        }
        String schemeName = authScheme.getSchemeName();
        return schemeName.equalsIgnoreCase("Basic") || schemeName.equalsIgnoreCase("Digest");
    }

    private void uncache(AuthCache authCache, HttpHost httpHost, AuthScheme authScheme) {
        throw null;
    }

    @Override // org.apache.http.HttpResponseInterceptor
    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(httpResponse, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
        AuthState authState = (AuthState) httpContext.getAttribute("http.auth.target-scope");
        if (httpHost != null && authState != null) {
            throw null;
        }
        HttpHost httpHost2 = (HttpHost) httpContext.getAttribute(ExecutionContext.HTTP_PROXY_HOST);
        AuthState authState2 = (AuthState) httpContext.getAttribute("http.auth.proxy-scope");
        if (httpHost2 != null && authState2 != null) {
            throw null;
        }
    }
}
