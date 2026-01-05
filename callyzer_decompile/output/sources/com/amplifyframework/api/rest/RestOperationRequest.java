package com.amplifyframework.api.rest;

import com.amplifyframework.util.Immutable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class RestOperationRequest {
    private final byte[] data;
    private final Map<String, String> headers;
    private final HttpMethod httpMethod;
    private final String path;
    private final Map<String, String> queryParameters;

    public RestOperationRequest(HttpMethod httpMethod, String str, byte[] bArr, Map<String, String> map, Map<String, String> map2) {
        this.httpMethod = httpMethod;
        this.path = str;
        this.headers = map == null ? Collections.EMPTY_MAP : Immutable.of(map);
        this.data = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.queryParameters = map2 == null ? Collections.EMPTY_MAP : Immutable.of(map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RestOperationRequest.class != obj.getClass()) {
            return false;
        }
        RestOperationRequest restOperationRequest = (RestOperationRequest) obj;
        if (Objects.equals(getHttpMethod(), restOperationRequest.getHttpMethod()) && Objects.equals(getPath(), restOperationRequest.getPath()) && Objects.equals(getData(), restOperationRequest.getData()) && Objects.equals(getHeaders(), restOperationRequest.getHeaders())) {
            return Objects.equals(getQueryParameters(), restOperationRequest.getQueryParameters());
        }
        return false;
    }

    public byte[] getData() {
        return this.data;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public String getPath() {
        return this.path;
    }

    public Map<String, String> getQueryParameters() {
        return this.queryParameters;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(getData()) + ((((getHttpMethod() != null ? getHttpMethod().hashCode() : 0) * 31) + (getPath() != null ? getPath().hashCode() : 0)) * 31)) * 31) + (getHeaders() != null ? getHeaders().hashCode() : 0)) * 31) + (getQueryParameters() != null ? getQueryParameters().hashCode() : 0);
    }

    public String toString() {
        return "RestOperationRequest{httpMethod=" + this.httpMethod + ", path='" + this.path + "', data=" + Arrays.toString(this.data) + ", headers=" + this.headers + ", queryParameters=" + this.queryParameters + '}';
    }

    public RestOperationRequest(HttpMethod httpMethod, String str, Map<String, String> map, Map<String, String> map2) {
        this(httpMethod, str, null, map, map2);
    }
}
