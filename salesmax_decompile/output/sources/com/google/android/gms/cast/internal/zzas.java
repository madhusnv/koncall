package com.google.android.gms.cast.internal;

import android.content.Context;
import p001o.c64;

/* loaded from: classes5.dex */
public final class zzas {
    public static boolean zza(Context context) {
        return c64.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
    }
}
