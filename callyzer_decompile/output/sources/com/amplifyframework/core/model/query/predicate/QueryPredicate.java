package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryPredicateGroup;
import java.util.Collections;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface QueryPredicate extends Evaluable<Object> {
    static QueryPredicate not(QueryPredicate queryPredicate) {
        return new QueryPredicateGroup(QueryPredicateGroup.Type.NOT, Collections.singletonList(queryPredicate));
    }

    QueryPredicate and(QueryPredicate queryPredicate);

    QueryPredicate or(QueryPredicate queryPredicate);
}
