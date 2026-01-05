package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;

/* loaded from: classes6.dex */
public interface HttpRequestHandler {
    void handle(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext);
}
