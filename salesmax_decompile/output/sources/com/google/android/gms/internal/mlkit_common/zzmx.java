package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes3.dex */
public enum zzmx implements zzbl {
    UNKNOWN(0),
    TRANSLATE(1);

    private final int zzd;

    zzmx(int i) {
        this.zzd = i;
    }

    public static zzmx zzb(int i) {
        for (zzmx zzmxVar : values()) {
            if (zzmxVar.zzd == i) {
                return zzmxVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbl
    public final int zza() {
        return this.zzd;
    }
}
