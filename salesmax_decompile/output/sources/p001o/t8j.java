package p001o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class t8j implements itb {

    /* renamed from: a */
    public final String f46637a = "wifi-network-access";

    @Override // p001o.itb
    /* renamed from: a */
    public boolean mo32726a(Context context, Network network) {
        sq8.m48649h(context, "context");
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return false;
        }
        if (network == null) {
            network = connectivityManager.getActiveNetwork();
        }
        uia.m51627b(uia.f48971a, this.f46637a, "Active network: " + network, null, null, 12, null);
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasTransport(1) && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }
}
