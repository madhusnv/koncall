package com.amplifyframework.core;

import i0.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum InitializationStatus {
    SUCCEEDED,
    FAILED;

    public static InitializationStatus fromString(String str) {
        for (InitializationStatus initializationStatus : values()) {
            if (initializationStatus.toString().equals(str)) {
                return initializationStatus;
            }
        }
        throw new IllegalArgumentException(m0.m7378k("Unknown status = ", str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }
}
