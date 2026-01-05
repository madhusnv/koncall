package com.google.android.gms.internal.cast;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes3.dex */
public enum zzvh {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzrm.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzvh(Object obj) {
        this.zzk = obj;
    }
}
