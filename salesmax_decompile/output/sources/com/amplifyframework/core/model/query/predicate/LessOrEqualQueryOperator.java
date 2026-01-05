package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryOperator;
import java.lang.Comparable;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class LessOrEqualQueryOperator<T extends Comparable<T>> extends QueryOperator<T> {
    private final T value;

    public LessOrEqualQueryOperator(T t) {
        super(QueryOperator.Type.LESS_OR_EQUAL);
        this.value = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LessOrEqualQueryOperator.class != obj.getClass()) {
            return false;
        }
        LessOrEqualQueryOperator lessOrEqualQueryOperator = (LessOrEqualQueryOperator) obj;
        return s6c.m47909a(type(), lessOrEqualQueryOperator.type()) && s6c.m47909a(value(), lessOrEqualQueryOperator.value());
    }

    public int hashCode() {
        return s6c.m47910b(type(), value());
    }

    public String toString() {
        return "LessOrEqualQueryOperator { type: " + type() + ", value: " + value() + " }";
    }

    public T value() {
        return this.value;
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(T t) {
        return t.compareTo(this.value) <= 0;
    }
}
