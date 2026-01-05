package com.amplifyframework.core.model.query.predicate;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class QueryOperator<T> implements Evaluable<T> {
    private final Type type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public enum Type {
        NOT_EQUAL,
        EQUAL,
        LESS_OR_EQUAL,
        LESS_THAN,
        GREATER_OR_EQUAL,
        GREATER_THAN,
        CONTAINS,
        NOT_CONTAINS,
        BETWEEN,
        BEGINS_WITH
    }

    public QueryOperator(Type type) {
        this.type = type;
    }

    public Type type() {
        return this.type;
    }
}
