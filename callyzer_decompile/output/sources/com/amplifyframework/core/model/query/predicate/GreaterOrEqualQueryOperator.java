package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryOperator;
import java.lang.Comparable;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class GreaterOrEqualQueryOperator<T extends Comparable<T>> extends QueryOperator<T> {
    private final T value;

    public GreaterOrEqualQueryOperator(T t7) {
        super(QueryOperator.Type.GREATER_OR_EQUAL);
        this.value = t7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GreaterOrEqualQueryOperator.class == obj.getClass()) {
            GreaterOrEqualQueryOperator greaterOrEqualQueryOperator = (GreaterOrEqualQueryOperator) obj;
            if (Objects.equals(type(), greaterOrEqualQueryOperator.type()) && Objects.equals(value(), greaterOrEqualQueryOperator.value())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(type(), value());
    }

    public String toString() {
        return "GreaterOrEqualQueryOperator { type: " + type() + ", value: " + value() + " }";
    }

    public T value() {
        return this.value;
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(T t7) {
        return t7.compareTo(this.value) >= 0;
    }
}
