package com.amplifyframework.core.model.query;

import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class QueryOptions {
    private QueryPaginationInput paginationInput;
    private QueryPredicate queryPredicate;
    private List<QuerySortBy> sortBy;

    public QueryOptions(QueryPredicate queryPredicate, QueryPaginationInput queryPaginationInput, List<QuerySortBy> list) {
        this.queryPredicate = queryPredicate == null ? QueryPredicates.all() : queryPredicate;
        this.paginationInput = queryPaginationInput;
        this.sortBy = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryOptions)) {
            return false;
        }
        QueryOptions queryOptions = (QueryOptions) obj;
        return Objects.equals(this.queryPredicate, queryOptions.queryPredicate) && Objects.equals(this.paginationInput, queryOptions.paginationInput) && Objects.equals(this.sortBy, queryOptions.sortBy);
    }

    public QueryPaginationInput getPaginationInput() {
        return this.paginationInput;
    }

    public QueryPredicate getQueryPredicate() {
        return this.queryPredicate;
    }

    public List<QuerySortBy> getSortBy() {
        return this.sortBy;
    }

    public int hashCode() {
        return Objects.hash(this.queryPredicate, this.paginationInput, this.sortBy);
    }

    public QueryOptions matches(QueryPredicate queryPredicate) {
        Objects.requireNonNull(queryPredicate);
        return new QueryOptions(queryPredicate, this.paginationInput, this.sortBy);
    }

    public QueryOptions paginated(QueryPaginationInput queryPaginationInput) {
        QueryPredicate queryPredicate = this.queryPredicate;
        Objects.requireNonNull(queryPaginationInput);
        return new QueryOptions(queryPredicate, queryPaginationInput, this.sortBy);
    }

    public QueryOptions sorted(QuerySortBy... querySortByArr) {
        QueryPredicate queryPredicate = this.queryPredicate;
        QueryPaginationInput queryPaginationInput = this.paginationInput;
        Objects.requireNonNull(querySortByArr);
        return new QueryOptions(queryPredicate, queryPaginationInput, Arrays.asList(querySortByArr));
    }

    public String toString() {
        return "QueryOptions{queryPredicate=" + this.queryPredicate + ", paginationInput=" + this.paginationInput + ", sortBy=" + this.sortBy + '}';
    }

    public QueryOptions() {
        this(null, null, null);
    }
}
