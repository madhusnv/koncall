package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.android.gms.common.api.Api;

/* loaded from: classes3.dex */
public final class zznu {
    private Long zza;
    private zzmk zzb;
    private zzlq zzc;
    private Integer zzd;

    public final zznu zzc(Long l) {
        this.zza = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzd(zzmk zzmkVar) {
        this.zzb = zzmkVar;
        return this;
    }

    public final zznu zze(zzlq zzlqVar) {
        this.zzc = zzlqVar;
        return this;
    }

    public final zznu zzf(Integer num) {
        this.zzd = Integer.valueOf(num.intValue() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return this;
    }

    public final zznw zzg() {
        return new zznw(this, null);
    }
}
