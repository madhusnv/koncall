package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryOperator;
import java.lang.Comparable;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class GreaterOrEqualQueryOperator<T extends Comparable<T>> extends QueryOperator<T> {
    private final T value;

    public GreaterOrEqualQueryOperator(T t) {
        super(QueryOperator.Type.GREATER_OR_EQUAL);
        this.value = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GreaterOrEqualQueryOperator.class != obj.getClass()) {
            return false;
        }
        GreaterOrEqualQueryOperator greaterOrEqualQueryOperator = (GreaterOrEqualQueryOperator) obj;
        return s6c.m47909a(type(), greaterOrEqualQueryOperator.type()) && s6c.m47909a(value(), greaterOrEqualQueryOperator.value());
    }

    public int hashCode() {
        return s6c.m47910b(type(), value());
    }

    public String toString() {
        return "GreaterOrEqualQueryOperator { type: " + type() + ", value: " + value() + " }";
    }

    public T value() {
        return this.value;
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(T t) {
        return t.compareTo(this.value) >= 0;
    }
}
