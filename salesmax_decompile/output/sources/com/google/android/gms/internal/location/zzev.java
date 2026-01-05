package com.google.android.gms.internal.location;

/* loaded from: classes3.dex */
final class zzev extends zzet {
    private final zzex zza;

    public zzev(zzex zzexVar, int i) {
        super(zzexVar.size(), i);
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.location.zzet
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
