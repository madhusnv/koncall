package org.apache.http.client.protocol;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.Iterator;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class ResponseProcessCookies implements HttpResponseInterceptor {
    private final sia log;

    public ResponseProcessCookies() {
        eja.m25143k(getClass());
    }

    private static String formatCooke(Cookie cookie) {
        StringBuilder sb = new StringBuilder();
        sb.append(cookie.getName());
        sb.append("=\"");
        String value = cookie.getValue();
        if (value != null) {
            if (value.length() > 100) {
                value = value.substring(0, 100) + "...";
            }
            sb.append(value);
        }
        sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        sb.append(", version:");
        sb.append(Integer.toString(cookie.getVersion()));
        sb.append(", domain:");
        sb.append(cookie.getDomain());
        sb.append(", path:");
        sb.append(cookie.getPath());
        sb.append(", expiry:");
        sb.append(cookie.getExpiryDate());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void processCookies(HeaderIterator headerIterator, CookieSpec cookieSpec, CookieOrigin cookieOrigin, CookieStore cookieStore) {
        while (headerIterator.hasNext()) {
            try {
                Iterator<Cookie> it = cookieSpec.parse(headerIterator.nextHeader(), cookieOrigin).iterator();
                if (it.hasNext()) {
                    Cookie next = it.next();
                    try {
                        cookieSpec.validate(next, cookieOrigin);
                        cookieStore.addCookie(next);
                        throw null;
                    } catch (MalformedCookieException unused) {
                        throw null;
                    }
                }
            } catch (MalformedCookieException unused2) {
                throw null;
            }
        }
    }

    @Override // org.apache.http.HttpResponseInterceptor
    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(httpResponse, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(httpContext);
        CookieSpec cookieSpec = httpClientContextAdapt.getCookieSpec();
        cookieSpec.getClass();
        CookieStore cookieStore = httpClientContextAdapt.getCookieStore();
        cookieStore.getClass();
        CookieOrigin cookieOrigin = httpClientContextAdapt.getCookieOrigin();
        cookieOrigin.getClass();
        processCookies(httpResponse.headerIterator(SM.SET_COOKIE), cookieSpec, cookieOrigin, cookieStore);
        if (cookieSpec.getVersion() > 0) {
            processCookies(httpResponse.headerIterator(SM.SET_COOKIE2), cookieSpec, cookieOrigin, cookieStore);
        }
    }
}
