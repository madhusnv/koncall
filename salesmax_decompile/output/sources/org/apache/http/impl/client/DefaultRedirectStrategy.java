package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class DefaultRedirectStrategy implements RedirectStrategy {
    public static final DefaultRedirectStrategy INSTANCE = new DefaultRedirectStrategy();

    @Deprecated
    public static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    public static final int SC_PERMANENT_REDIRECT = 308;
    private final sia log;
    private final String[] redirectMethods;

    public DefaultRedirectStrategy() {
        this(new String[]{"GET", "HEAD"});
    }

    public URI createLocationURI(String str) throws ProtocolException {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid redirect URI: " + str, e);
        }
    }

    public URI getLocationURI(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpResponse, "HTTP response");
        Args.notNull(httpContext, "HTTP context");
        HttpClientContext.adapt(httpContext);
        Header firstHeader = httpResponse.getFirstHeader("location");
        if (firstHeader != null) {
            firstHeader.getValue();
            throw null;
        }
        throw new ProtocolException("Received redirect response " + httpResponse.getStatusLine() + " but no location header");
    }

    @Override // org.apache.http.client.RedirectStrategy
    public HttpUriRequest getRedirect(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        URI locationURI = getLocationURI(httpRequest, httpResponse, httpContext);
        String method = httpRequest.getRequestLine().getMethod();
        if (method.equalsIgnoreCase("HEAD")) {
            return new HttpHead(locationURI);
        }
        if (method.equalsIgnoreCase("GET")) {
            return new HttpGet(locationURI);
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        return (statusCode == 307 || statusCode == 308) ? RequestBuilder.copy(httpRequest).setUri(locationURI).build() : new HttpGet(locationURI);
    }

    public boolean isRedirectable(String str) {
        return Arrays.binarySearch(this.redirectMethods, str) >= 0;
    }

    @Override // org.apache.http.client.RedirectStrategy
    public boolean isRedirected(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpResponse, "HTTP response");
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String method = httpRequest.getRequestLine().getMethod();
        Header firstHeader = httpResponse.getFirstHeader("location");
        if (statusCode != 307 && statusCode != 308) {
            switch (statusCode) {
                case 301:
                    break;
                case 302:
                    return isRedirectable(method) && firstHeader != null;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        return isRedirectable(method);
    }

    public DefaultRedirectStrategy(String[] strArr) {
        eja.m25143k(getClass());
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        this.redirectMethods = strArr2;
    }
}
