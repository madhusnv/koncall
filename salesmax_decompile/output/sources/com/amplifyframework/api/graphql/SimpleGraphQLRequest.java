package com.amplifyframework.api.graphql;

import com.amplifyframework.api.graphql.GraphQLRequest;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class SimpleGraphQLRequest<R> extends GraphQLRequest<R> {
    private final String document;
    private final Map<String, Object> variables;

    public SimpleGraphQLRequest(String str, Type type2, GraphQLRequest.VariablesSerializer variablesSerializer) {
        this(str, Collections.emptyMap(), type2, variablesSerializer);
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
        return s6c.m47909a(this.document, simpleGraphQLRequest.document) && s6c.m47909a(this.variables, simpleGraphQLRequest.variables);
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
        return s6c.m47910b(Integer.valueOf(super.hashCode()), this.document, this.variables);
    }

    public SimpleGraphQLRequest(String str, Map<String, Object> map, Type type2, GraphQLRequest.VariablesSerializer variablesSerializer) {
        super(type2, variablesSerializer);
        this.variables = map;
        this.document = str;
    }
}
