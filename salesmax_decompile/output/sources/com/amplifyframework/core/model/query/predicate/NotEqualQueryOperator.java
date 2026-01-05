package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryOperator;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class NotEqualQueryOperator extends QueryOperator<Object> {
    private final Object value;

    public NotEqualQueryOperator(Object obj) {
        super(QueryOperator.Type.NOT_EQUAL);
        this.value = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NotEqualQueryOperator.class != obj.getClass()) {
            return false;
        }
        NotEqualQueryOperator notEqualQueryOperator = (NotEqualQueryOperator) obj;
        return s6c.m47909a(type(), notEqualQueryOperator.type()) && s6c.m47909a(value(), notEqualQueryOperator.value());
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(Object obj) {
        return !obj.equals(this.value);
    }

    public int hashCode() {
        return s6c.m47910b(type(), value());
    }

    public String toString() {
        return "NotEqualQueryOperator { type: " + type() + ", value: " + value() + " }";
    }

    public Object value() {
        return this.value;
    }
}
