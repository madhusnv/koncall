package com.google.android.gms.internal.cast;

/* loaded from: classes3.dex */
final class zztg implements zztn {
    private final zztn[] zza;

    public zztg(zztn... zztnVarArr) {
        this.zza = zztnVarArr;
    }

    @Override // com.google.android.gms.internal.cast.zztn
    public final zztm zzb(Class cls) {
        zztn[] zztnVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zztn zztnVar = zztnVarArr[i];
            if (zztnVar.zzc(cls)) {
                return zztnVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.cast.zztn
    public final boolean zzc(Class cls) {
        zztn[] zztnVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zztnVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
