package com.onesignal.location.internal.common;

import android.content.Context;
import com.google.android.gms.location.LocationListener;
import com.huawei.hms.location.LocationCallback;
import com.onesignal.common.AndroidUtils;
import p001o.c64;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class LocationUtils {
    public static final LocationUtils INSTANCE = new LocationUtils();

    private LocationUtils() {
    }

    public final boolean hasGMSLocationLibrary() {
        try {
            return AndroidUtils.INSTANCE.opaqueHasClass(LocationListener.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean hasHMSLocationLibrary() {
        try {
            return AndroidUtils.INSTANCE.opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean hasLocationPermission(Context context) {
        sq8.m48649h(context, "context");
        return c64.checkSelfPermission(context, LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING) == 0 || c64.checkSelfPermission(context, LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING) == 0;
    }
}
