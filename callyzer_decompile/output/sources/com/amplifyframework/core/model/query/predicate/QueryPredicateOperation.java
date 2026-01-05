package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryPredicateGroup;
import com.amplifyframework.util.FieldFinder;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class QueryPredicateOperation<T> implements QueryPredicate {
    private final String field;
    private final String modelName;
    private final QueryOperator<T> operator;

    public QueryPredicateOperation(String str, QueryOperator<T> queryOperator) {
        this(null, str, queryOperator);
    }

    public static QueryPredicateGroup not(QueryPredicateOperation<?> queryPredicateOperation) {
        return new QueryPredicateGroup(QueryPredicateGroup.Type.NOT, Collections.singletonList(queryPredicateOperation));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && QueryPredicateOperation.class == obj.getClass()) {
            QueryPredicateOperation queryPredicateOperation = (QueryPredicateOperation) obj;
            if (Objects.equals(modelName(), queryPredicateOperation.modelName()) && Objects.equals(field(), queryPredicateOperation.field()) && Objects.equals(operator(), queryPredicateOperation.operator())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(Object obj) {
        try {
            return this.operator.evaluate(FieldFinder.extractFieldValue(obj, this.field));
        } catch (ClassCastException e2) {
            throw new IllegalArgumentException(this.field + " field inside provided object cannot be evaluated by the operator type: " + this.operator.type().name(), e2);
        } catch (Exception unused) {
            return false;
        }
    }

    public String field() {
        return this.field;
    }

    public int hashCode() {
        return Objects.hash(modelName(), field(), operator());
    }

    public String modelName() {
        return this.modelName;
    }

    public QueryOperator<T> operator() {
        return this.operator;
    }

    public String toString() {
        return "QueryPredicateOperation { model: " + modelName() + ", field: " + field() + ", operator: " + operator() + " }";
    }

    public QueryPredicateOperation(String str, String str2, QueryOperator<T> queryOperator) {
        this.modelName = str;
        Objects.requireNonNull(str2);
        this.field = str2;
        Objects.requireNonNull(queryOperator);
        this.operator = queryOperator;
    }

    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicateGroup and(QueryPredicate queryPredicate) {
        return new QueryPredicateGroup(QueryPredicateGroup.Type.AND, Arrays.asList(this, queryPredicate));
    }

    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicateGroup or(QueryPredicate queryPredicate) {
        return new QueryPredicateGroup(QueryPredicateGroup.Type.OR, Arrays.asList(this, queryPredicate));
    }
}
