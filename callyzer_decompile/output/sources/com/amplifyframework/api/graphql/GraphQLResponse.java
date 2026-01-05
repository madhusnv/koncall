package com.amplifyframework.api.graphql;

import com.amplifyframework.util.Immutable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class GraphQLResponse<R> {
    private final R data;
    private final List<Error> errors;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error {
        private final Map<String, Object> extensions;
        private final List<GraphQLLocation> locations;
        private final String message;
        private final List<GraphQLPathSegment> path;

        public Error(String str, List<GraphQLLocation> list, List<GraphQLPathSegment> list2, Map<String, Object> map) {
            Objects.requireNonNull(str);
            this.message = str;
            this.locations = list;
            this.path = list2;
            this.extensions = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Error.class == obj.getClass()) {
                Error error = (Error) obj;
                if (Objects.equals(this.message, error.message) && Objects.equals(this.locations, error.locations) && Objects.equals(this.path, error.path) && Objects.equals(this.extensions, error.extensions)) {
                    return true;
                }
            }
            return false;
        }

        public Map<String, Object> getExtensions() {
            return Immutable.of(this.extensions);
        }

        public List<GraphQLLocation> getLocations() {
            return Immutable.of(this.locations);
        }

        public String getMessage() {
            return this.message;
        }

        public List<GraphQLPathSegment> getPath() {
            return Immutable.of(this.path);
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            List<GraphQLLocation> list = this.locations;
            int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
            List<GraphQLPathSegment> list2 = this.path;
            int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
            Map<String, Object> map = this.extensions;
            return iHashCode3 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "GraphQLResponse.Error{message='" + this.message + "', locations='" + this.locations + "', path='" + this.path + "', extensions='" + this.extensions + "'}";
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public interface Factory {
        <R> GraphQLResponse<R> buildResponse(GraphQLRequest<R> graphQLRequest, String str);
    }

    public GraphQLResponse(R r9, List<Error> list) {
        this.data = r9;
        ArrayList arrayList = new ArrayList();
        this.errors = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GraphQLResponse.class != obj.getClass()) {
            return false;
        }
        GraphQLResponse graphQLResponse = (GraphQLResponse) obj;
        if (Objects.equals(this.data, graphQLResponse.data)) {
            return Objects.equals(this.errors, graphQLResponse.errors);
        }
        return false;
    }

    public R getData() {
        return this.data;
    }

    public List<Error> getErrors() {
        return this.errors;
    }

    public boolean hasData() {
        return this.data != null;
    }

    public boolean hasErrors() {
        return this.errors.size() > 0;
    }

    public int hashCode() {
        R r9 = this.data;
        int iHashCode = (r9 != null ? r9.hashCode() : 0) * 31;
        List<Error> list = this.errors;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GraphQLResponse{data='");
        sb2.append(this.data);
        sb2.append("', errors='");
        return AbstractC5601a.m11240k("'}", sb2, this.errors);
    }
}
