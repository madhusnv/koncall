package com.amplifyframework.datastore.syncengine;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes5.dex */
public interface ConnectivityProvider {
    boolean getHasActiveNetwork();

    void registerDefaultNetworkCallback(Context context, ConnectivityManager.NetworkCallback networkCallback);
}
