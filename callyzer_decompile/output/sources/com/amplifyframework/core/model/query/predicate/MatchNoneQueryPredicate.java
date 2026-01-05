package com.amplifyframework.core.model.query.predicate;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class MatchNoneQueryPredicate implements QueryPredicate {
    private MatchNoneQueryPredicate() {
    }

    public static MatchNoneQueryPredicate instance() {
        return new MatchNoneQueryPredicate();
    }

    public boolean equals(Object obj) {
        return obj instanceof MatchNoneQueryPredicate;
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(Object obj) {
        return false;
    }

    public int hashCode() {
        return MatchNoneQueryPredicate.class.hashCode();
    }

    public String toString() {
        return "MatchNoneQueryPredicate";
    }

    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicate and(QueryPredicate queryPredicate) {
        return this;
    }

    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicate or(QueryPredicate queryPredicate) {
        return queryPredicate;
    }
}
