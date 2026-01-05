package com.amplifyframework.api.graphql;

/* loaded from: classes5.dex */
public enum MutationType implements Operation {
    CREATE,
    UPDATE,
    DELETE;

    @Override // com.amplifyframework.api.graphql.Operation
    public OperationType getOperationType() {
        return OperationType.MUTATION;
    }
}
