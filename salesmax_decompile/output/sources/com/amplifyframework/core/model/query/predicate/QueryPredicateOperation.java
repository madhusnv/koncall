package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryPredicateGroup;
import com.amplifyframework.util.FieldFinder;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
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
        if (obj == null || QueryPredicateOperation.class != obj.getClass()) {
            return false;
        }
        QueryPredicateOperation queryPredicateOperation = (QueryPredicateOperation) obj;
        return s6c.m47909a(modelName(), queryPredicateOperation.modelName()) && s6c.m47909a(field(), queryPredicateOperation.field()) && s6c.m47909a(operator(), queryPredicateOperation.operator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(Object obj) {
        try {
            return this.operator.evaluate(FieldFinder.extractFieldValue(obj, this.field));
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(this.field + " field inside provided object cannot be evaluated by the operator type: " + this.operator.type().name(), e);
        } catch (Exception unused) {
            return false;
        }
    }

    public String field() {
        return this.field;
    }

    public int hashCode() {
        return s6c.m47910b(modelName(), field(), operator());
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
