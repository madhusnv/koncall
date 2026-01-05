package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryOperator;
import java.lang.Comparable;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class LessThanQueryOperator<T extends Comparable<T>> extends QueryOperator<T> {
    private final T value;

    public LessThanQueryOperator(T t) {
        super(QueryOperator.Type.LESS_THAN);
        this.value = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LessThanQueryOperator.class != obj.getClass()) {
            return false;
        }
        LessThanQueryOperator lessThanQueryOperator = (LessThanQueryOperator) obj;
        return s6c.m47909a(type(), lessThanQueryOperator.type()) && s6c.m47909a(value(), lessThanQueryOperator.value());
    }

    public int hashCode() {
        return s6c.m47910b(type(), value());
    }

    public String toString() {
        return "LessThanQueryOperator { type: " + type() + ", value: " + value() + " }";
    }

    public T value() {
        return this.value;
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(T t) {
        return t.compareTo(this.value) < 0;
    }
}
