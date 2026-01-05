package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class NetworkApi23 {
    public static final Network getActiveNetworkCompat(ConnectivityManager connectivityManager) {
        sq8.m48649h(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
