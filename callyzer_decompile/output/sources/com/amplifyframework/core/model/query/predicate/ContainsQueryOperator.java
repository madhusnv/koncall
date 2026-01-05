package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryOperator;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ContainsQueryOperator extends QueryOperator<String> {
    private final String value;

    public ContainsQueryOperator(String str) {
        super(QueryOperator.Type.CONTAINS);
        this.value = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ContainsQueryOperator.class == obj.getClass()) {
            ContainsQueryOperator containsQueryOperator = (ContainsQueryOperator) obj;
            if (Objects.equals(type(), containsQueryOperator.type()) && Objects.equals(value(), containsQueryOperator.value())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(type(), value());
    }

    public String toString() {
        return "ContainsQueryOperator { type: " + type() + ", value: " + value() + " }";
    }

    public Object value() {
        return this.value;
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(String str) {
        return str.contains(this.value);
    }
}
