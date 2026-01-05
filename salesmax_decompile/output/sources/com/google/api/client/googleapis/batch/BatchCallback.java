package com.google.api.client.googleapis.batch;

import com.google.api.client.http.HttpHeaders;

/* loaded from: classes3.dex */
public interface BatchCallback<T, E> {
    void onFailure(E e, HttpHeaders httpHeaders);

    void onSuccess(T t, HttpHeaders httpHeaders);
}
