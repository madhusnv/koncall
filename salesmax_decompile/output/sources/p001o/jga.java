package p001o;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.lifecycle.AbstractC2145n;

/* loaded from: classes2.dex */
public final class jga extends AbstractC2145n {

    /* renamed from: a */
    public final ConnectivityManager f30391a;

    /* renamed from: b */
    public ConnectivityManager.NetworkCallback f30392b;

    /* renamed from: o.jga$a */
    public static final class C14535a extends ConnectivityManager.NetworkCallback {
        public C14535a() {
        }

        /* renamed from: a */
        public final synchronized void m33798a(boolean z) {
            jga.this.postValue(Boolean.valueOf(z));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            sq8.m48649h(network, "network");
            super.onAvailable(network);
            jga jgaVar = jga.this;
            StringBuilder sb = new StringBuilder();
            sb.append(jgaVar);
            sb.append(" onAvailable: Network ");
            sb.append(network);
            sb.append(" is Available");
            m33798a(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            sq8.m48649h(network, "network");
            sq8.m48649h(networkCapabilities, "networkCapabilities");
            m33798a(networkCapabilities.hasCapability(12) || networkCapabilities.hasCapability(16));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            sq8.m48649h(network, "network");
            super.onLost(network);
            jga jgaVar = jga.this;
            StringBuilder sb = new StringBuilder();
            sb.append(jgaVar);
            sb.append(" onLost: ");
            sb.append(network);
            sb.append(" Network Lost");
            m33798a(false);
        }
    }

    public jga(ConnectivityManager connectivityManager) {
        sq8.m48649h(connectivityManager, "connectivityManager");
        this.f30391a = connectivityManager;
    }

    @Override // androidx.lifecycle.AbstractC2145n
    public void onActive() {
        super.onActive();
        if (this.f30392b == null) {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            this.f30392b = new C14535a();
            ConnectivityManager connectivityManager = this.f30391a;
            NetworkRequest networkRequestBuild = builder.addCapability(12).addTransportType(1).addTransportType(0).build();
            ConnectivityManager.NetworkCallback networkCallback = this.f30392b;
            sq8.m48646e(networkCallback);
            connectivityManager.registerNetworkCallback(networkRequestBuild, networkCallback);
        }
    }

    @Override // androidx.lifecycle.AbstractC2145n
    public void onInactive() {
        super.onInactive();
        ConnectivityManager.NetworkCallback networkCallback = this.f30392b;
        if (networkCallback != null) {
            try {
                ConnectivityManager connectivityManager = this.f30391a;
                sq8.m48646e(networkCallback);
                connectivityManager.unregisterNetworkCallback(networkCallback);
                this.f30392b = null;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jga(Application application) {
        sq8.m48649h(application, "appContext");
        Object systemService = application.getSystemService("connectivity");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this((ConnectivityManager) systemService);
    }
}
