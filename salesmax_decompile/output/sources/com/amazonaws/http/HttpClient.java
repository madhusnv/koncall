package com.amazonaws.http;

/* loaded from: classes4.dex */
public interface HttpClient {
    HttpResponse execute(HttpRequest httpRequest);

    void shutdown();
}
