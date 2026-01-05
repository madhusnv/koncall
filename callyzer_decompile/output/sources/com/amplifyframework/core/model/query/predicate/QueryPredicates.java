package com.amplifyframework.core.model.query.predicate;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class QueryPredicates {
    private QueryPredicates() {
    }

    public static QueryPredicate all() {
        return MatchAllQueryPredicate.instance();
    }

    public static QueryPredicate none() {
        return MatchNoneQueryPredicate.instance();
    }
}
