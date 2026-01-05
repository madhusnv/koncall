package com.google.android.gms.internal.cast;

/* loaded from: classes3.dex */
final class zztb extends zztd {
    public /* synthetic */ zztb(zzta zztaVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.cast.zztd
    public final void zza(Object obj, long j) {
        ((zzsp) zzvb.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.cast.zztd
    public final void zzb(Object obj, Object obj2, long j) {
        zzsp zzspVarZzg = (zzsp) zzvb.zzf(obj, j);
        zzsp zzspVar = (zzsp) zzvb.zzf(obj2, j);
        int size = zzspVarZzg.size();
        int size2 = zzspVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzspVarZzg.zzc()) {
                zzspVarZzg = zzspVarZzg.zzg(size2 + size);
            }
            zzspVarZzg.addAll(zzspVar);
        }
        if (size > 0) {
            zzspVar = zzspVarZzg;
        }
        zzvb.zzs(obj, j, zzspVar);
    }

    private zztb() {
        super(null);
    }
}
