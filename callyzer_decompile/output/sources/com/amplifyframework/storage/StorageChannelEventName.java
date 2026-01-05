package com.amplifyframework.storage;

import i0.m0;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum StorageChannelEventName {
    UPLOAD_ERROR("upload_error"),
    UPLOAD_STATE("upload_state"),
    DOWNLOAD_ERROR("download_error"),
    DOWNLOAD_STATE("download_state");

    private final String hubEventName;

    StorageChannelEventName(String str) {
        Objects.requireNonNull(str);
        this.hubEventName = str;
    }

    public static StorageChannelEventName fromString(String str) {
        for (StorageChannelEventName storageChannelEventName : values()) {
            if (storageChannelEventName.toString().equals(str)) {
                return storageChannelEventName;
            }
        }
        throw new IllegalArgumentException(m0.m7378k("Storage category does not publish any Hub event with name = ", str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.hubEventName;
    }
}
