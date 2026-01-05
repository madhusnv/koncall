package p001o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class kf2 implements itb {

    /* renamed from: a */
    public final String f32134a = "cellular-network-access";

    @Override // p001o.itb
    /* renamed from: a */
    public boolean mo32726a(Context context, Network network) {
        sq8.m48649h(context, "context");
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        boolean z = false;
        if (connectivityManager != null) {
            if (network == null) {
                network = connectivityManager.getActiveNetwork();
            }
            uia uiaVar = uia.f48971a;
            uia.m51627b(uiaVar, this.f32134a, "Active network: " + network, null, null, 12, null);
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(0) && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                    z = true;
                }
                uia.m51627b(uiaVar, this.f32134a, "Cellular network status: " + z, null, null, 12, null);
            }
        }
        return z;
    }
}
