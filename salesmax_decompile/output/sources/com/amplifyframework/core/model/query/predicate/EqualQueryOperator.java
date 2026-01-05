package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryOperator;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class EqualQueryOperator extends QueryOperator<Object> {
    private final Object value;

    public EqualQueryOperator(Object obj) {
        super(QueryOperator.Type.EQUAL);
        this.value = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EqualQueryOperator.class != obj.getClass()) {
            return false;
        }
        EqualQueryOperator equalQueryOperator = (EqualQueryOperator) obj;
        return s6c.m47909a(type(), equalQueryOperator.type()) && s6c.m47909a(value(), equalQueryOperator.value());
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(Object obj) {
        return obj.equals(this.value);
    }

    public int hashCode() {
        return s6c.m47910b(type(), value());
    }

    public String toString() {
        return "EqualQueryOperator { type: " + type() + ", value: " + value() + " }";
    }

    public Object value() {
        return this.value;
    }
}
