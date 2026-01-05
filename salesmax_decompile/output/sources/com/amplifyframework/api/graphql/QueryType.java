package com.amplifyframework.api.graphql;

/* loaded from: classes5.dex */
public enum QueryType implements Operation {
    GET,
    LIST,
    SYNC;

    @Override // com.amplifyframework.api.graphql.Operation
    public OperationType getOperationType() {
        return OperationType.QUERY;
    }
}
