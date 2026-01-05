package androidx.work.impl.constraints.trackers;

import androidx.work.Logger;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class BatteryNotLowTrackerKt {
    public static final float BATTERY_LOW_THRESHOLD = 0.15f;
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("BatteryNotLowTracker");
        sq8.m48648g(strTagWithPrefix, "tagWithPrefix(\"BatteryNotLowTracker\")");
        TAG = strTagWithPrefix;
    }
}
