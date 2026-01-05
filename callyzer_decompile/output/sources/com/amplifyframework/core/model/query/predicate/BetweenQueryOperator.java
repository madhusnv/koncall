package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryOperator;
import java.lang.Comparable;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BetweenQueryOperator<T extends Comparable<T>> extends QueryOperator<T> {
    private final T end;
    private final T start;

    public BetweenQueryOperator(T t7, T t10) {
        super(QueryOperator.Type.BETWEEN);
        this.start = t7;
        this.end = t10;
    }

    public T end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BetweenQueryOperator.class == obj.getClass()) {
            BetweenQueryOperator betweenQueryOperator = (BetweenQueryOperator) obj;
            if (Objects.equals(type(), betweenQueryOperator.type()) && Objects.equals(start(), betweenQueryOperator.start()) && Objects.equals(end(), betweenQueryOperator.end())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(type(), start(), end());
    }

    public T start() {
        return this.start;
    }

    public String toString() {
        return "BetweenQueryOperator { type: " + type() + ", start: " + this.start + ", end: " + this.end + " }";
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(T t7) {
        return t7.compareTo(this.start) >= 0 && t7.compareTo(this.end) <= 0;
    }
}
