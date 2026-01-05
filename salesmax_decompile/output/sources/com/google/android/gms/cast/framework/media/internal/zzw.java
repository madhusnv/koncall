package com.google.android.gms.cast.framework.media.internal;

import android.os.RemoteException;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.internal.Logger;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzw {
    private static final Logger zza = new Logger("MediaSessionUtils");

    public static int zza(NotificationOptions notificationOptions, long j) {
        return j == 10000 ? notificationOptions.getForward10DrawableResId() : j != 30000 ? notificationOptions.getForwardDrawableResId() : notificationOptions.getForward30DrawableResId();
    }

    public static int zzb(NotificationOptions notificationOptions, long j) {
        return j == 10000 ? notificationOptions.zzb() : j != 30000 ? notificationOptions.zzd() : notificationOptions.zzc();
    }

    public static int zzc(NotificationOptions notificationOptions, long j) {
        return j == 10000 ? notificationOptions.getRewind10DrawableResId() : j != 30000 ? notificationOptions.getRewindDrawableResId() : notificationOptions.getRewind30DrawableResId();
    }

    public static int zzd(NotificationOptions notificationOptions, long j) {
        return j == 10000 ? notificationOptions.zzh() : j != 30000 ? notificationOptions.zzj() : notificationOptions.zzi();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[PHI: r1
      0x002c: PHI (r1v5 java.lang.String) = (r1v3 java.lang.String), (r1v4 java.lang.String) binds: [B:18:0x002a, B:21:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String zze(MediaMetadata mediaMetadata) {
        String str = MediaMetadata.KEY_SUBTITLE;
        if (!mediaMetadata.containsKey(MediaMetadata.KEY_SUBTITLE)) {
            int mediaType = mediaMetadata.getMediaType();
            if (mediaType == 1) {
                str = MediaMetadata.KEY_STUDIO;
            } else if (mediaType == 2) {
                str = MediaMetadata.KEY_SERIES_TITLE;
            } else if (mediaType != 3) {
                if (mediaType == 4) {
                    str = MediaMetadata.KEY_ARTIST;
                }
            } else if (!mediaMetadata.containsKey(MediaMetadata.KEY_ARTIST)) {
                String str2 = MediaMetadata.KEY_ALBUM_ARTIST;
                if (mediaMetadata.containsKey(MediaMetadata.KEY_ALBUM_ARTIST)) {
                    str = str2;
                } else {
                    str2 = MediaMetadata.KEY_COMPOSER;
                    if (mediaMetadata.containsKey(MediaMetadata.KEY_COMPOSER)) {
                    }
                }
            }
        }
        return mediaMetadata.getString(str);
    }

    public static List zzf(com.google.android.gms.cast.framework.media.zzg zzgVar) {
        try {
            return zzgVar.zzf();
        } catch (RemoteException e) {
            zza.m13798e(e, "Unable to call %s on %s.", "getNotificationActions", com.google.android.gms.cast.framework.media.zzg.class.getSimpleName());
            return null;
        }
    }

    public static int[] zzg(com.google.android.gms.cast.framework.media.zzg zzgVar) {
        try {
            return zzgVar.zzg();
        } catch (RemoteException e) {
            zza.m13798e(e, "Unable to call %s on %s.", "getCompactViewActionIndices", com.google.android.gms.cast.framework.media.zzg.class.getSimpleName());
            return null;
        }
    }
}
