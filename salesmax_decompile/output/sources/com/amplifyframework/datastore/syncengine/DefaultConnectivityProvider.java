package com.amplifyframework.datastore.syncengine;

import android.content.Context;
import android.net.ConnectivityManager;
import com.amplifyframework.datastore.DataStoreException;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes5.dex */
final class DefaultConnectivityProvider implements ConnectivityProvider {
    private ConnectivityManager connectivityManager;

    @Override // com.amplifyframework.datastore.syncengine.ConnectivityProvider
    public boolean getHasActiveNetwork() throws DataStoreException {
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetwork() != null;
        }
        throw new DataStoreException("ReachabilityMonitor has not been configured.", "Call ReachabilityMonitor.configure() before calling ReachabilityMonitor.getObservable()");
    }

    @Override // com.amplifyframework.datastore.syncengine.ConnectivityProvider
    public void registerDefaultNetworkCallback(Context context, ConnectivityManager.NetworkCallback networkCallback) throws DataStoreException {
        y3i y3iVar;
        sq8.m48649h(context, "context");
        sq8.m48649h(networkCallback, "callback");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        this.connectivityManager = connectivityManager;
        if (connectivityManager != null) {
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
            y3iVar = y3i.f54824a;
        } else {
            y3iVar = null;
        }
        if (y3iVar == null) {
            throw new DataStoreException("ConnectivityManager not available", "No recovery suggestion is available");
        }
    }
}
