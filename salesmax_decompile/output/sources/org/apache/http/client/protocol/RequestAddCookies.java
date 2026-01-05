package org.apache.http.client.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class RequestAddCookies implements HttpRequestInterceptor {
    private final sia log;

    public RequestAddCookies() {
        eja.m25143k(getClass());
    }

    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        if (httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            return;
        }
        HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(httpContext);
        httpClientContextAdapt.getCookieStore().getClass();
        httpClientContextAdapt.getCookieSpecRegistry().getClass();
        httpClientContextAdapt.getTargetHost().getClass();
        httpClientContextAdapt.getHttpRoute().getClass();
        httpClientContextAdapt.getRequestConfig().getCookieSpec();
        throw null;
    }
}
