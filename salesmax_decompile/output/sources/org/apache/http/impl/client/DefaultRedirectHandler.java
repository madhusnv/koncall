package org.apache.http.impl.client;

import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.RedirectHandler;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes6.dex */
public class DefaultRedirectHandler implements RedirectHandler {
    private static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    private final sia log;

    public DefaultRedirectHandler() {
        eja.m25143k(getClass());
    }

    @Override // org.apache.http.client.RedirectHandler
    public URI getLocationURI(HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        Args.notNull(httpResponse, "HTTP response");
        Header firstHeader = httpResponse.getFirstHeader("location");
        if (firstHeader != null) {
            firstHeader.getValue();
            throw null;
        }
        throw new ProtocolException("Received redirect response " + httpResponse.getStatusLine() + " but no location header");
    }

    @Override // org.apache.http.client.RedirectHandler
    public boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(httpResponse, "HTTP response");
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode != 307) {
            switch (statusCode) {
                case 301:
                case 302:
                    break;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        String method = ((HttpRequest) httpContext.getAttribute("http.request")).getRequestLine().getMethod();
        return method.equalsIgnoreCase("GET") || method.equalsIgnoreCase("HEAD");
    }
}
