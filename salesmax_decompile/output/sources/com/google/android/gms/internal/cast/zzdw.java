package com.google.android.gms.internal.cast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p001o.c64;

/* loaded from: classes3.dex */
public final class zzdw extends c64 {
    @Deprecated
    public static Intent zza(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (zzdv.zza()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != zzdv.zza() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
