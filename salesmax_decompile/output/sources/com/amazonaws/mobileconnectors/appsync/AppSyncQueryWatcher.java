package com.amazonaws.mobileconnectors.appsync;

import com.apollographql.apollo.api.Operation;
import p001o.dre;
import p001o.wu7;

/* loaded from: classes4.dex */
public interface AppSyncQueryWatcher<T> {
    void cancel();

    AppSyncQueryWatcher<T> enqueueAndWatch(wu7.AbstractC17964a abstractC17964a);

    /* synthetic */ boolean isCanceled();

    Operation operation();

    void refetch();

    AppSyncQueryWatcher<T> refetchResponseFetcher(dre dreVar);
}
