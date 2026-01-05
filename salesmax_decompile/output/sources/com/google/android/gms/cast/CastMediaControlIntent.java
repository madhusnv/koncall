package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.CastUtils;
import java.util.Collection;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class CastMediaControlIntent {
    public static final String ACTION_SYNC_STATUS = "com.google.android.gms.cast.ACTION_SYNC_STATUS";
    public static final String DEFAULT_MEDIA_RECEIVER_APPLICATION_ID = "CC1AD845";
    public static final int ERROR_CODE_REQUEST_FAILED = 1;
    public static final int ERROR_CODE_SESSION_START_FAILED = 2;
    public static final int ERROR_CODE_TEMPORARILY_DISCONNECTED = 3;
    public static final String EXTRA_CAST_APPLICATION_ID = "com.google.android.gms.cast.EXTRA_CAST_APPLICATION_ID";
    public static final String EXTRA_CAST_LANGUAGE_CODE = "com.google.android.gms.cast.EXTRA_CAST_LANGUAGE_CODE";
    public static final String EXTRA_CAST_RELAUNCH_APPLICATION = "com.google.android.gms.cast.EXTRA_CAST_RELAUNCH_APPLICATION";
    public static final String EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS = "com.google.android.gms.cast.EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS";
    public static final String EXTRA_CUSTOM_DATA = "com.google.android.gms.cast.EXTRA_CUSTOM_DATA";
    public static final String EXTRA_DEBUG_LOGGING_ENABLED = "com.google.android.gms.cast.EXTRA_DEBUG_LOGGING_ENABLED";
    public static final String EXTRA_ERROR_CODE = "com.google.android.gms.cast.EXTRA_ERROR_CODE";

    private CastMediaControlIntent() {
    }

    public static String categoryForCast(String str) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        zzu zzuVar = new zzu(null);
        zzu.zza(zzuVar, str);
        return zzw.zza(zzu.zzd(zzuVar));
    }

    public static String categoryForRemotePlayback() {
        zzu zzuVar = new zzu(null);
        zzu.zzb(zzuVar, "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK");
        return zzw.zza(zzu.zzd(zzuVar));
    }

    public static String languageTagForLocale(Locale locale) {
        return CastUtils.zzb(locale);
    }

    public static String categoryForRemotePlayback(String str) {
        if (!TextUtils.isEmpty(str)) {
            zzu zzuVar = new zzu(null);
            zzu.zzb(zzuVar, "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK");
            zzu.zza(zzuVar, str);
            return zzw.zza(zzu.zzd(zzuVar));
        }
        throw new IllegalArgumentException("applicationId cannot be null or empty");
    }

    public static String categoryForCast(String str, Collection<String> collection) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        if (collection != null) {
            zzu zzuVar = new zzu(null);
            zzu.zza(zzuVar, str);
            zzu.zzc(zzuVar, collection);
            return zzw.zza(zzu.zzd(zzuVar));
        }
        throw new IllegalArgumentException("namespaces cannot be null");
    }

    public static String categoryForCast(Collection<String> collection) {
        if (collection != null) {
            zzu zzuVar = new zzu(null);
            zzu.zzc(zzuVar, collection);
            return zzw.zza(zzu.zzd(zzuVar));
        }
        throw new IllegalArgumentException("namespaces cannot be null");
    }
}
