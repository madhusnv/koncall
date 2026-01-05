package com.amplifyframework.datastore;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.util.Immutable;
import java.util.List;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public class DataStoreException extends AmplifyException {
    private static final long serialVersionUID = 1;

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
                return s6c.m47909a(this.errors, ((GraphQLResponseException) obj).errors);
            }
            return false;
        }

        public List<GraphQLResponse.Error> getErrors() {
            return Immutable.of(this.errors);
        }

        @Override // com.amplifyframework.AmplifyException
        public int hashCode() {
            return s6c.m47910b(Integer.valueOf(super.hashCode()), this.errors);
        }

        @Override // com.amplifyframework.AmplifyException, java.lang.Throwable
        public String toString() {
            return "GraphQLResponseException{message=" + getMessage() + ", errors=" + this.errors + ", recoverySuggestion=" + getRecoverySuggestion() + '}';
        }
    }

    public static class IrRecoverableException extends DataStoreException {
        private static final long serialVersionUID = 1;

        public IrRecoverableException(String str, String str2) {
            super(str, str2);
        }
    }

    public DataStoreException(String str, Throwable th, String str2) {
        super(str, th, str2);
    }

    public DataStoreException(String str, String str2) {
        super(str, str2);
    }
}
