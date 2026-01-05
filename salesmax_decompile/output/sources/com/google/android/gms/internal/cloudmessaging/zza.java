package com.google.android.gms.internal.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.api.client.googleapis.media.MediaHttpDownloader;

/* loaded from: classes3.dex */
public final class zza {
    public static final int zza;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                if (str.length() != 1 || str.charAt(0) < 'S' || str.charAt(0) > 'Z') {
                    i2 = 0;
                }
            }
        }
        zza = i2;
    }

    public static PendingIntent zza(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }
}
