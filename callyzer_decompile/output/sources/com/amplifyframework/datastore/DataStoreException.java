package com.amplifyframework.datastore;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.util.Immutable;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class DataStoreException extends AmplifyException {
    private static final long serialVersionUID = 1;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class GraphQLResponseException extends DataStoreException {
        private static final long serialVersionUID = 1;
        private final List<GraphQLResponse.Error> errors;

        public GraphQLResponseException(String str, List<GraphQLResponse.Error> list) {
            super(str, "See attached list of GraphQLResponse.Error objects.");
            Objects.requireNonNull(list);
            this.errors = list;
        }

        @Override // com.amplifyframework.AmplifyException
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && GraphQLResponseException.class == obj.getClass() && super.equals(obj)) {
                return Objects.equals(this.errors, ((GraphQLResponseException) obj).errors);
            }
            return false;
        }

        public List<GraphQLResponse.Error> getErrors() {
            return Immutable.of(this.errors);
        }

        @Override // com.amplifyframework.AmplifyException
        public int hashCode() {
            return Objects.hash(Integer.valueOf(super.hashCode()), this.errors);
        }

        @Override // com.amplifyframework.AmplifyException, java.lang.Throwable
        public String toString() {
            return "GraphQLResponseException{message=" + getMessage() + ", errors=" + this.errors + ", recoverySuggestion=" + getRecoverySuggestion() + '}';
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class IrRecoverableException extends DataStoreException {
        private static final long serialVersionUID = 1;

        public IrRecoverableException(String str, String str2) {
            super(str, str2);
        }
    }

    public DataStoreException(String str, Throwable th2, String str2) {
        super(str, th2, str2);
    }

    public DataStoreException(String str, String str2) {
        super(str, str2);
    }
}
