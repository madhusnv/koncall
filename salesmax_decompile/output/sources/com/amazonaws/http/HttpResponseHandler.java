package com.amazonaws.http;

/* loaded from: classes4.dex */
public interface HttpResponseHandler<T> {
    T handle(HttpResponse httpResponse);

    boolean needsConnectionLeftOpen();
}
