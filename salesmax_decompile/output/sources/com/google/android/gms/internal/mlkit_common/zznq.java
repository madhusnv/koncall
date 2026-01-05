package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes3.dex */
public enum zznq implements zzbl {
    SOURCE_UNKNOWN(0),
    APP_ASSET(1),
    LOCAL(2),
    CLOUD(3),
    SDK_BUILT_IN(4),
    URI(5);

    private final int zzh;

    zznq(int i) {
        this.zzh = i;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbl
    public final int zza() {
        return this.zzh;
    }
}
