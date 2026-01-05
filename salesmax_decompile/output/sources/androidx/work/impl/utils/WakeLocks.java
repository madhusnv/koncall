package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class WakeLocks {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WakeLocks");
        sq8.m48648g(strTagWithPrefix, "tagWithPrefix(\"WakeLocks\")");
        TAG = strTagWithPrefix;
    }

    public static final void checkWakeLocks() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        WakeLocksHolder wakeLocksHolder = WakeLocksHolder.INSTANCE;
        synchronized (wakeLocksHolder) {
            linkedHashMap.putAll(wakeLocksHolder.getWakeLocks());
            y3i y3iVar = y3i.f54824a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            boolean z = false;
            if (wakeLock != null && wakeLock.isHeld()) {
                z = true;
            }
            if (z) {
                Logger.get().warning(TAG, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock newWakeLock(Context context, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        WakeLocksHolder wakeLocksHolder = WakeLocksHolder.INSTANCE;
        synchronized (wakeLocksHolder) {
            wakeLocksHolder.getWakeLocks().put(wakeLockNewWakeLock, str2);
        }
        sq8.m48648g(wakeLockNewWakeLock, "wakeLock");
        return wakeLockNewWakeLock;
    }
}
