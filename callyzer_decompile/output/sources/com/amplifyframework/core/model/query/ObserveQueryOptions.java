package com.amplifyframework.core.model.query;

import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
        return Objects.equals(this.queryPredicate, observeQueryOptions.queryPredicate) && Objects.equals(this.sortBy, observeQueryOptions.sortBy);
    }

    public QueryPredicate getQueryPredicate() {
        return this.queryPredicate;
    }

    public List<QuerySortBy> getSortBy() {
        return this.sortBy;
    }

    public int hashCode() {
        return Objects.hash(this.queryPredicate, this.sortBy);
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
