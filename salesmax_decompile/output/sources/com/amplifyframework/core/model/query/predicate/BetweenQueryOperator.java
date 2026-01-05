package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryOperator;
import java.lang.Comparable;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class BetweenQueryOperator<T extends Comparable<T>> extends QueryOperator<T> {
    private final T end;
    private final T start;

    public BetweenQueryOperator(T t, T t2) {
        super(QueryOperator.Type.BETWEEN);
        this.start = t;
        this.end = t2;
    }

    public T end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BetweenQueryOperator.class != obj.getClass()) {
            return false;
        }
        BetweenQueryOperator betweenQueryOperator = (BetweenQueryOperator) obj;
        return s6c.m47909a(type(), betweenQueryOperator.type()) && s6c.m47909a(start(), betweenQueryOperator.start()) && s6c.m47909a(end(), betweenQueryOperator.end());
    }

    public int hashCode() {
        return s6c.m47910b(type(), start(), end());
    }

    public T start() {
        return this.start;
    }

    public String toString() {
        return "BetweenQueryOperator { type: " + type() + ", start: " + this.start + ", end: " + this.end + " }";
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(T t) {
        return t.compareTo(this.start) >= 0 && t.compareTo(this.end) <= 0;
    }
}
