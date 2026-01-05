package com.amazonaws.mobileconnectors.appsync;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.api.Subscription;
import p001o.gj0;

/* loaded from: classes4.dex */
public interface AppSyncSubscriptionCall<T> {

    public interface Callback<T> {
        void onCompleted();

        void onFailure(gj0 gj0Var);

        void onResponse(Response<T> response);
    }

    public interface Factory {
        <D extends Operation.Data, T, V extends Operation.Variables> AppSyncSubscriptionCall<T> subscribe(Subscription<D, T, V> subscription);
    }

    public interface StartedCallback<T> extends Callback<T> {
        void onStarted();
    }

    /* synthetic */ void cancel();

    AppSyncSubscriptionCall<T> clone();

    void execute(Callback<T> callback);

    /* synthetic */ boolean isCanceled();
}
