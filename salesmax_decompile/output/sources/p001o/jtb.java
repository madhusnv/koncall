package p001o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;

/* loaded from: classes.dex */
public final class jtb {

    /* renamed from: a */
    public final Context f31070a;

    /* renamed from: b */
    public final ztb f31071b;

    /* renamed from: c */
    public final String f31072c;

    /* renamed from: d */
    public final ConnectivityManager f31073d;

    /* renamed from: e */
    public final C14656a f31074e;

    /* renamed from: o.jtb$a */
    public static final class C14656a extends ConnectivityManager.NetworkCallback {
        public C14656a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            sq8.m48649h(network, "network");
            uia.m51627b(uia.f48971a, jtb.this.f31072c, "Network is available: " + network, null, null, 12, null);
            jtb.this.f31071b.m59888f(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            sq8.m48649h(network, "network");
            uia.m51627b(uia.f48971a, jtb.this.f31072c, "Network is lost: " + network, null, null, 12, null);
            jtb.this.f31071b.m59888f(network, false);
        }
    }

    public jtb(Context context, ztb ztbVar) {
        sq8.m48649h(context, "context");
        sq8.m48649h(ztbVar, "networkManager");
        this.f31070a = context;
        this.f31071b = ztbVar;
        this.f31072c = "network-access-listener";
        Object systemService = context.getSystemService("connectivity");
        this.f31073d = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        this.f31074e = new C14656a();
    }

    /* renamed from: c */
    public final void m34499c() {
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addCapability(16).addTransportType(1).addTransportType(0).build();
        ConnectivityManager connectivityManager = this.f31073d;
        if (connectivityManager != null) {
            connectivityManager.registerNetworkCallback(networkRequestBuild, this.f31074e);
        }
    }
}
