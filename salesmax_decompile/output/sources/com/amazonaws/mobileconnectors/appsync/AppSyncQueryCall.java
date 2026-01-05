package com.amazonaws.mobileconnectors.appsync;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.cache.http.HttpCachePolicy;
import p001o.dre;
import p001o.wu7;
import p001o.yr1;

/* loaded from: classes4.dex */
public interface AppSyncQueryCall<T> extends wu7 {

    public interface Factory {
        <D extends Operation.Data, T, V extends Operation.Variables> AppSyncQueryCall<T> query(Query<D, T, V> query);
    }

    AppSyncQueryCall<T> cacheHeaders(yr1 yr1Var);

    /* renamed from: cacheHeaders, reason: collision with other method in class */
    /* synthetic */ wu7 m68709cacheHeaders(yr1 yr1Var);

    /* synthetic */ void cancel();

    AppSyncQueryCall<T> clone();

    /* renamed from: clone, reason: collision with other method in class */
    /* synthetic */ wu7 m68710clone();

    /* synthetic */ void enqueue(wu7.AbstractC17964a abstractC17964a);

    AppSyncQueryCall<T> httpCachePolicy(HttpCachePolicy.Policy policy);

    /* synthetic */ boolean isCanceled();

    /* synthetic */ Operation operation();

    AppSyncQueryCall<T> responseFetcher(dre dreVar);

    AppSyncQueryWatcher<T> watcher();
}
