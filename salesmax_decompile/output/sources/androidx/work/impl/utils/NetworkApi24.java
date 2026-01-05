package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class NetworkApi24 {
    public static final void registerDefaultNetworkCallbackCompat(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        sq8.m48649h(connectivityManager, "<this>");
        sq8.m48649h(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
