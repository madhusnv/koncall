package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryOperator;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class BeginsWithQueryOperator extends QueryOperator<String> {
    private final String value;

    public BeginsWithQueryOperator(String str) {
        super(QueryOperator.Type.BEGINS_WITH);
        this.value = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BeginsWithQueryOperator.class != obj.getClass()) {
            return false;
        }
        BeginsWithQueryOperator beginsWithQueryOperator = (BeginsWithQueryOperator) obj;
        return s6c.m47909a(type(), beginsWithQueryOperator.type()) && s6c.m47909a(value(), beginsWithQueryOperator.value());
    }

    public int hashCode() {
        return s6c.m47910b(type(), value());
    }

    public String toString() {
        return "BeginsWithQueryOperator { type: " + type() + ", value: " + value() + " }";
    }

    public Object value() {
        return this.value;
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(String str) {
        return str.indexOf(this.value) == 0;
    }
}
