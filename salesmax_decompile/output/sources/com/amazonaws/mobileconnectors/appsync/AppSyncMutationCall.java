package com.amazonaws.mobileconnectors.appsync;

import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
import p001o.wu7;
import p001o.yr1;

/* loaded from: classes4.dex */
public interface AppSyncMutationCall<T> extends wu7 {

    public interface Factory {
        <D extends Operation.Data, T, V extends Operation.Variables> AppSyncMutationCall<T> mutate(Mutation<D, T, V> mutation);

        <D extends Operation.Data, T, V extends Operation.Variables> AppSyncMutationCall<T> mutate(Mutation<D, T, V> mutation, D d);
    }

    AppSyncMutationCall<T> cacheHeaders(yr1 yr1Var);

    /* renamed from: cacheHeaders, reason: collision with other method in class */
    /* synthetic */ wu7 m68707cacheHeaders(yr1 yr1Var);

    /* synthetic */ void cancel();

    AppSyncMutationCall<T> clone();

    /* renamed from: clone, reason: collision with other method in class */
    /* synthetic */ wu7 m68708clone();

    /* synthetic */ void enqueue(wu7.AbstractC17964a abstractC17964a);

    /* synthetic */ boolean isCanceled();

    /* synthetic */ Operation operation();

    AppSyncMutationCall<T> refetchQueries(OperationName... operationNameArr);

    AppSyncMutationCall<T> refetchQueries(Query... queryArr);
}
