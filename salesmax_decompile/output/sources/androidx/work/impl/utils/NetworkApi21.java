package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class NetworkApi21 {
    public static final NetworkCapabilities getNetworkCapabilitiesCompat(ConnectivityManager connectivityManager, Network network) {
        sq8.m48649h(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean hasCapabilityCompat(NetworkCapabilities networkCapabilities, int i) {
        sq8.m48649h(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i);
    }

    public static final void unregisterNetworkCallbackCompat(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        sq8.m48649h(connectivityManager, "<this>");
        sq8.m48649h(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
