package com.amplifyframework.core.model.query;

import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ObserveQueryOptions {
    private final QueryPredicate queryPredicate;
    private final List<QuerySortBy> sortBy;

    public ObserveQueryOptions(QueryPredicate queryPredicate, List<QuerySortBy> list) {
        this.queryPredicate = queryPredicate == null ? QueryPredicates.all() : queryPredicate;
        this.sortBy = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObserveQueryOptions)) {
            return false;
        }
        ObserveQueryOptions observeQueryOptions = (ObserveQueryOptions) obj;
        return s6c.m47909a(this.queryPredicate, observeQueryOptions.queryPredicate) && s6c.m47909a(this.sortBy, observeQueryOptions.sortBy);
    }

    public QueryPredicate getQueryPredicate() {
        return this.queryPredicate;
    }

    public List<QuerySortBy> getSortBy() {
        return this.sortBy;
    }

    public int hashCode() {
        return s6c.m47910b(this.queryPredicate, this.sortBy);
    }

    public ObserveQueryOptions matches(QueryPredicate queryPredicate) {
        Objects.requireNonNull(queryPredicate);
        return new ObserveQueryOptions(queryPredicate, this.sortBy);
    }

    public ObserveQueryOptions sorted(QuerySortBy... querySortByArr) {
        QueryPredicate queryPredicate = this.queryPredicate;
        Objects.requireNonNull(querySortByArr);
        return new ObserveQueryOptions(queryPredicate, Arrays.asList(querySortByArr));
    }

    public String toString() {
        return "QueryOptions{queryPredicate=" + this.queryPredicate + ", sortBy=" + this.sortBy + '}';
    }

    public ObserveQueryOptions() {
        this(null, null);
    }
}
