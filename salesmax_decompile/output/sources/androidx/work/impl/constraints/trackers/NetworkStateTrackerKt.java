package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi21;
import androidx.work.impl.utils.NetworkApi23;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import p001o.ht3;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class NetworkStateTrackerKt {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("NetworkStateTracker");
        sq8.m48648g(strTagWithPrefix, "tagWithPrefix(\"NetworkStateTracker\")");
        TAG = strTagWithPrefix;
    }

    public static final ConstraintTracker<NetworkState> NetworkStateTracker(Context context, TaskExecutor taskExecutor) {
        sq8.m48649h(context, "context");
        sq8.m48649h(taskExecutor, "taskExecutor");
        return new NetworkStateTracker24(context, taskExecutor);
    }

    public static final NetworkState getActiveNetworkState(ConnectivityManager connectivityManager) {
        sq8.m48649h(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return new NetworkState(activeNetworkInfo != null && activeNetworkInfo.isConnected(), isActiveNetworkValidated(connectivityManager), ht3.m31099a(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    public static /* synthetic */ void getActiveNetworkState$annotations(ConnectivityManager connectivityManager) {
    }

    public static final boolean isActiveNetworkValidated(ConnectivityManager connectivityManager) {
        sq8.m48649h(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesCompat = NetworkApi21.getNetworkCapabilitiesCompat(connectivityManager, NetworkApi23.getActiveNetworkCompat(connectivityManager));
            if (networkCapabilitiesCompat != null) {
                return NetworkApi21.hasCapabilityCompat(networkCapabilitiesCompat, 16);
            }
            return false;
        } catch (SecurityException e) {
            Logger.get().error(TAG, "Unable to validate active network", e);
            return false;
        }
    }
}
