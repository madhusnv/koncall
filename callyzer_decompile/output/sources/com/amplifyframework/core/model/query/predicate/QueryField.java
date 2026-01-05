package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.QuerySortBy;
import com.amplifyframework.core.model.query.QuerySortOrder;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class QueryField {
    private final String fieldName;
    private final String modelName;

    private QueryField(String str, String str2) {
        this.modelName = str;
        this.fieldName = str2;
    }

    public static QueryField field(String str) {
        return field(null, str);
    }

    public QuerySortBy ascending() {
        return new QuerySortBy(this.modelName, this.fieldName, QuerySortOrder.ASCENDING);
    }

    public QueryPredicateOperation<String> beginsWith(String str) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new BeginsWithQueryOperator(str));
    }

    public <T extends Comparable<T>> QueryPredicateOperation<T> between(T t7, T t10) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new BetweenQueryOperator(t7, t10));
    }

    public QueryPredicateOperation<String> contains(String str) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new ContainsQueryOperator(str));
    }

    public QuerySortBy descending() {
        return new QuerySortBy(this.modelName, this.fieldName, QuerySortOrder.DESCENDING);
    }

    public QueryPredicateOperation<Object> eq(Object obj) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new EqualQueryOperator(obj));
    }

    public <T extends Comparable<T>> QueryPredicateOperation<T> ge(T t7) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new GreaterOrEqualQueryOperator(t7));
    }

    public <T extends Comparable<T>> QueryPredicateOperation<T> gt(T t7) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new GreaterThanQueryOperator(t7));
    }

    public <T extends Comparable<T>> QueryPredicateOperation<T> le(T t7) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new LessOrEqualQueryOperator(t7));
    }

    public <T extends Comparable<T>> QueryPredicateOperation<T> lt(T t7) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new LessThanQueryOperator(t7));
    }

    public QueryPredicateOperation<Object> ne(Object obj) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new NotEqualQueryOperator(obj));
    }

    public QueryPredicateOperation<String> notContains(String str) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new NotContainsQueryOperator(str));
    }

    public static QueryField field(String str, String str2) {
        return new QueryField(str, str2);
    }
}
