package com.amplifyframework.api.graphql;

import com.amplifyframework.api.graphql.GraphQLRequest;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SimpleGraphQLRequest<R> extends GraphQLRequest<R> {
    private final String document;
    private final Map<String, Object> variables;

    public SimpleGraphQLRequest(String str, Type type, GraphQLRequest.VariablesSerializer variablesSerializer) {
        this(str, Collections.EMPTY_MAP, type, variablesSerializer);
    }

    @Override // com.amplifyframework.api.graphql.GraphQLRequest
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SimpleGraphQLRequest.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        SimpleGraphQLRequest simpleGraphQLRequest = (SimpleGraphQLRequest) obj;
        return Objects.equals(this.document, simpleGraphQLRequest.document) && Objects.equals(this.variables, simpleGraphQLRequest.variables);
    }

    @Override // com.amplifyframework.api.graphql.GraphQLRequest
    public String getQuery() {
        return this.document;
    }

    @Override // com.amplifyframework.api.graphql.GraphQLRequest
    public Map<String, Object> getVariables() {
        return this.variables;
    }

    @Override // com.amplifyframework.api.graphql.GraphQLRequest
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.document, this.variables);
    }

    public SimpleGraphQLRequest(String str, Map<String, Object> map, Type type, GraphQLRequest.VariablesSerializer variablesSerializer) {
        super(type, variablesSerializer);
        this.variables = map;
        this.document = str;
    }
}
