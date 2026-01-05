package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import com.amplifyframework.datastore.DataStoreConfigurationProvider;
import com.amplifyframework.datastore.DataStoreSyncExpression;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p001o.iwc;
import p001o.rl7;
import p001o.x6c;

/* loaded from: classes5.dex */
final class QueryPredicateProvider {
    private final DataStoreConfigurationProvider dataStoreConfigurationProvider;
    private final Map<String, QueryPredicate> predicateMap = new HashMap();

    public QueryPredicateProvider(DataStoreConfigurationProvider dataStoreConfigurationProvider) {
        this.dataStoreConfigurationProvider = dataStoreConfigurationProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ iwc lambda$resolvePredicates$0(Map.Entry entry) {
        return iwc.m32868a((String) entry.getKey(), ((DataStoreSyncExpression) entry.getValue()).resolvePredicate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$resolvePredicates$1(iwc iwcVar) {
        return (String) iwcVar.f29291a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ QueryPredicate lambda$resolvePredicates$2(iwc iwcVar) {
        return (QueryPredicate) iwcVar.f29292b;
    }

    public QueryPredicate getPredicate(String str) {
        Map<String, QueryPredicate> map = this.predicateMap;
        Objects.requireNonNull(str);
        QueryPredicate queryPredicate = map.get(str);
        return queryPredicate == null ? QueryPredicates.all() : queryPredicate;
    }

    public void resolvePredicates() {
        Map<String, DataStoreSyncExpression> syncExpressions = this.dataStoreConfigurationProvider.getConfiguration().getSyncExpressions();
        this.predicateMap.clear();
        this.predicateMap.putAll((Map) x6c.m55699W(syncExpressions.entrySet()).d0(new rl7() { // from class: com.amplifyframework.datastore.syncengine.e0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return QueryPredicateProvider.lambda$resolvePredicates$0((Map.Entry) obj);
            }
        }).F0(new rl7() { // from class: com.amplifyframework.datastore.syncengine.f0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return QueryPredicateProvider.lambda$resolvePredicates$1((iwc) obj);
            }
        }, new rl7() { // from class: com.amplifyframework.datastore.syncengine.g0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return QueryPredicateProvider.lambda$resolvePredicates$2((iwc) obj);
            }
        }).m55012d());
    }
}
