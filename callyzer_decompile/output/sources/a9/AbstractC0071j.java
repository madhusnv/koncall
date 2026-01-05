package a9;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7077w;
import y8.C8596e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a9.j */
/* loaded from: classes.dex */
public abstract class AbstractC0071j {

    /* renamed from: a */
    public static final /* synthetic */ int f262a = 0;

    static {
        AbstractC4154l.m8922e(C7077w.m13372b("NetworkStateTracker"), "tagWithPrefix(\"NetworkStateTracker\")");
    }

    /* renamed from: a */
    public static final C8596e m189a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        AbstractC4154l.m8923f(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z6 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException unused) {
            C7077w.m13371a().getClass();
        }
        boolean zHasCapability = networkCapabilities != null ? networkCapabilities.hasCapability(16) : false;
        return new C8596e(z6, zHasCapability, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
