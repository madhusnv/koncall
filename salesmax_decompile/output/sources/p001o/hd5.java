package p001o;

import android.content.Context;
import android.util.Log;
import p001o.it3;

/* loaded from: classes5.dex */
public class hd5 implements jt3 {
    @Override // p001o.jt3
    /* renamed from: a */
    public it3 mo30251a(Context context, it3.InterfaceC14366a interfaceC14366a) {
        boolean z = c64.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z ? new gd5(context, interfaceC14366a) : new v4c();
    }
}
