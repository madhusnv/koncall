package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryOperator;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
        if (obj != null && EqualQueryOperator.class == obj.getClass()) {
            EqualQueryOperator equalQueryOperator = (EqualQueryOperator) obj;
            if (Objects.equals(type(), equalQueryOperator.type()) && Objects.equals(value(), equalQueryOperator.value())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(Object obj) {
        return obj.equals(this.value);
    }

    public int hashCode() {
        return Objects.hash(type(), value());
    }

    public String toString() {
        return "EqualQueryOperator { type: " + type() + ", value: " + value() + " }";
    }

    public Object value() {
        return this.value;
    }
}
