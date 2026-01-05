package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zznw {
    private final zzns zza;
    private final zznu zzb = null;
    private final zznu zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zznw(zznt zzntVar, zznv zznvVar) {
        this.zza = zzntVar.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zznw) && Objects.equal(this.zza, ((zznw) obj).zza) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, null, null);
    }

    @zzbn(zza = 1)
    public final zzns zza() {
        return this.zza;
    }
}
