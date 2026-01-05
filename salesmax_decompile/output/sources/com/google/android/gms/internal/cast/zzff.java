package com.google.android.gms.internal.cast;

/* loaded from: classes3.dex */
final class zzff extends zzex {
    private final zzfh zza;

    public zzff(zzfh zzfhVar, int i) {
        super(zzfhVar.size(), i);
        this.zza = zzfhVar;
    }

    @Override // com.google.android.gms.internal.cast.zzex
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
