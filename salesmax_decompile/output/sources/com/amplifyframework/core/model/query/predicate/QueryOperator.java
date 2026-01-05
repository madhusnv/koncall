package com.amplifyframework.core.model.query.predicate;

/* loaded from: classes5.dex */
public abstract class QueryOperator<T> implements Evaluable<T> {

    /* renamed from: type, reason: collision with root package name */
    private final Type f58097type;

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

    public QueryOperator(Type type2) {
        this.f58097type = type2;
    }

    public Type type() {
        return this.f58097type;
    }
}
