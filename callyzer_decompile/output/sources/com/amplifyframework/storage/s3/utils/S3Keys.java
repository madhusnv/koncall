package com.amplifyframework.storage.s3.utils;

import com.amplifyframework.storage.StorageAccessLevel;
import java.util.Locale;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class S3Keys {
    private static final char BUCKET_SEPARATOR = '/';

    private S3Keys() {
    }

    public static String createServiceKey(StorageAccessLevel storageAccessLevel, String str, String str2) {
        return getAccessLevelPrefix(storageAccessLevel, str) + str2;
    }

    public static String extractAmplifyKey(String str, String str2) {
        return str.replace(str2, "");
    }

    public static String getAccessLevelPrefix(StorageAccessLevel storageAccessLevel, String str) {
        if (!StorageAccessLevel.PRIVATE.equals(storageAccessLevel) && !StorageAccessLevel.PROTECTED.equals(storageAccessLevel)) {
            return storageAccessLevel.name().toLowerCase(Locale.US) + BUCKET_SEPARATOR;
        }
        return storageAccessLevel.name().toLowerCase(Locale.US) + BUCKET_SEPARATOR + str + BUCKET_SEPARATOR;
    }
}
