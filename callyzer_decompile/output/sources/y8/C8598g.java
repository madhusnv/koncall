package y8;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.fragment.app.C0348m;
import ex.InterfaceC2139c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7077w;
import wr.C8158n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y8.g */
/* loaded from: classes.dex */
public final class C8598g extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public static final C8598g f41846a = new C8598g();

    /* renamed from: b */
    public static final Object f41847b = new Object();

    /* renamed from: c */
    public static final LinkedHashMap f41848c = new LinkedHashMap();

    /* renamed from: d */
    public static NetworkCapabilities f41849d;

    /* renamed from: e */
    public static boolean f41850e;

    /* renamed from: a */
    public final C0348m m15953a(ConnectivityManager connectivityManager, NetworkRequest networkRequest, C8158n c8158n) {
        NetworkCapabilities networkCapabilities;
        synchronized (f41847b) {
            try {
                LinkedHashMap linkedHashMap = f41848c;
                boolean zIsEmpty = linkedHashMap.isEmpty();
                linkedHashMap.put(c8158n, networkRequest);
                if (zIsEmpty) {
                    C7077w c7077wM13371a = C7077w.m13371a();
                    int i10 = AbstractC8600i.f41852a;
                    c7077wM13371a.getClass();
                    connectivityManager.registerDefaultNetworkCallback(this);
                }
                C7077w c7077wM13371a2 = C7077w.m13371a();
                int i11 = AbstractC8600i.f41852a;
                c7077wM13371a2.getClass();
                f41846a.getClass();
                if (f41850e) {
                    networkCapabilities = f41849d;
                } else {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    f41849d = networkCapabilities;
                    f41850e = true;
                }
                c8158n.invoke(networkRequest.canBeSatisfiedBy(networkCapabilities) ? C8592a.f41839a : new C8593b(7));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new C0348m(11, c8158n, connectivityManager, this);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        AbstractC4154l.m8923f(network, "network");
        AbstractC4154l.m8923f(networkCapabilities, "networkCapabilities");
        C7077w c7077wM13371a = C7077w.m13371a();
        int i10 = AbstractC8600i.f41852a;
        c7077wM13371a.getClass();
        synchronized (f41847b) {
            try {
                f41849d = networkCapabilities;
                for (Map.Entry entry : f41848c.entrySet()) {
                    ((InterfaceC2139c) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? C8592a.f41839a : new C8593b(7));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC4154l.m8923f(network, "network");
        C7077w c7077wM13371a = C7077w.m13371a();
        int i10 = AbstractC8600i.f41852a;
        c7077wM13371a.getClass();
        synchronized (f41847b) {
            f41849d = null;
            Iterator it = f41848c.keySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC2139c) it.next()).invoke(new C8593b(7));
            }
        }
    }
}
