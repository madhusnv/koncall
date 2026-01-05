package com.amplifyframework.api.rest;

import com.amplifyframework.util.Immutable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class RestOptions {
    private final byte[] data;
    private final Map<String, String> headers;
    private final String path;
    private final Map<String, String> queryParameters;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private byte[] data;
        private Map<String, String> headers;
        private String path;
        private Map<String, String> queryParameters;

        public Builder addBody(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Builder addHeader(String str, String str2) {
            if (this.headers == null) {
                this.headers = new HashMap();
            }
            this.headers.put(str, str2);
            return this;
        }

        public Builder addHeaders(Map<String, String> map) {
            if (this.headers == null) {
                this.headers = new HashMap();
            }
            this.headers.putAll(map);
            return this;
        }

        public Builder addPath(String str) {
            this.path = str;
            return this;
        }

        public Builder addQueryParameters(Map<String, String> map) {
            if (this.queryParameters == null) {
                this.queryParameters = new HashMap();
            }
            this.queryParameters.putAll(map);
            return this;
        }

        public RestOptions build() {
            return new RestOptions(this.path, this.data, this.headers, this.queryParameters, 0);
        }
    }

    public /* synthetic */ RestOptions(String str, byte[] bArr, Map map, Map map2, int i10) {
        this(str, bArr, map, map2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RestOptions.class != obj.getClass()) {
            return false;
        }
        RestOptions restOptions = (RestOptions) obj;
        if (Objects.equals(getPath(), restOptions.getPath()) && Objects.equals(getData(), restOptions.getData()) && Objects.equals(getHeaders(), restOptions.getHeaders())) {
            return Objects.equals(getQueryParameters(), restOptions.getQueryParameters());
        }
        return false;
    }

    public byte[] getData() {
        return this.data;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getPath() {
        return this.path;
    }

    public Map<String, String> getQueryParameters() {
        return this.queryParameters;
    }

    public boolean hasData() {
        return this.data != null;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(getData()) + ((getPath() != null ? getPath().hashCode() : 0) * 31)) * 31) + (getHeaders() != null ? getHeaders().hashCode() : 0)) * 31) + (getQueryParameters() != null ? getQueryParameters().hashCode() : 0);
    }

    public String toString() {
        return "RestOptions{path='" + this.path + "', data=" + Arrays.toString(this.data) + ", headers=" + this.headers + ", queryParameters=" + this.queryParameters + '}';
    }

    private RestOptions(String str, byte[] bArr, Map<String, String> map, Map<String, String> map2) {
        this.path = str;
        this.data = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.headers = map == null ? Collections.EMPTY_MAP : Immutable.of(map);
        this.queryParameters = map2 == null ? Collections.EMPTY_MAP : Immutable.of(map2);
    }
}
