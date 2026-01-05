package org.apache.http.client.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class RequestClientConnControl implements HttpRequestInterceptor {
    private static final String PROXY_CONN_DIRECTIVE = "Proxy-Connection";
    private final sia log;

    public RequestClientConnControl() {
        eja.m25143k(getClass());
    }

    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        if (httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            httpRequest.setHeader(PROXY_CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
            return;
        }
        RouteInfo httpRoute = HttpClientContext.adapt(httpContext).getHttpRoute();
        httpRoute.getClass();
        if ((httpRoute.getHopCount() == 1 || httpRoute.isTunnelled()) && !httpRequest.containsHeader("Connection")) {
            httpRequest.addHeader("Connection", HTTP.CONN_KEEP_ALIVE);
        }
        if (httpRoute.getHopCount() != 2 || httpRoute.isTunnelled() || httpRequest.containsHeader(PROXY_CONN_DIRECTIVE)) {
            return;
        }
        httpRequest.addHeader(PROXY_CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
    }
}
