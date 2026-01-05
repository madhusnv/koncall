package com.amplifyframework.api.rest;

import com.amplifyframework.api.ApiException;
import com.amplifyframework.core.Consumer;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface RestBehavior {
    RestOperation delete(RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2);

    RestOperation delete(String str, RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2);

    RestOperation get(RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2);

    RestOperation get(String str, RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2);

    RestOperation head(RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2);

    RestOperation head(String str, RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2);

    RestOperation patch(RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2);

    RestOperation patch(String str, RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2);

    RestOperation post(RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2);

    RestOperation post(String str, RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2);

    RestOperation put(RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2);

    RestOperation put(String str, RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2);
}
