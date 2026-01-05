package com.amazonaws.mobileconnectors.appsync;

import com.apollographql.apollo.api.Operation;
import p001o.fj0;
import p001o.gj0;
import p001o.hj0;
import p001o.ij0;

/* loaded from: classes4.dex */
public interface AppSyncPrefetch {

    public static abstract class Callback {
        public void onCanceledError(fj0 fj0Var) {
            onFailure(fj0Var);
        }

        public abstract void onFailure(gj0 gj0Var);

        public void onHttpError(hj0 hj0Var) {
            onFailure(hj0Var);
            throw null;
        }

        public void onNetworkError(ij0 ij0Var) {
            onFailure(ij0Var);
        }

        public abstract void onSuccess();
    }

    public interface Factory {
        <D extends Operation.Data, T, V extends Operation.Variables> AppSyncPrefetch prefetch(Operation<D, T, V> operation);
    }

    void cancel();

    AppSyncPrefetch clone();

    void enqueue(Callback callback);

    /* synthetic */ boolean isCanceled();

    Operation operation();
}
