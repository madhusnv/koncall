package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryOperator;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class NotContainsQueryOperator extends QueryOperator<String> {
    private final String value;

    public NotContainsQueryOperator(String str) {
        super(QueryOperator.Type.NOT_CONTAINS);
        this.value = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NotContainsQueryOperator.class != obj.getClass()) {
            return false;
        }
        NotContainsQueryOperator notContainsQueryOperator = (NotContainsQueryOperator) obj;
        return s6c.m47909a(type(), notContainsQueryOperator.type()) && s6c.m47909a(value(), notContainsQueryOperator.value());
    }

    public int hashCode() {
        return s6c.m47910b(type(), value());
    }

    public String toString() {
        return "NotContainsQueryOperator { type: " + type() + ", value: " + value() + " }";
    }

    public Object value() {
        return this.value;
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(String str) {
        return !str.contains(this.value);
    }
}
