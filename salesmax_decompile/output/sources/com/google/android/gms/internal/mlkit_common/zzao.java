package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes3.dex */
final class zzao extends zzag {
    private final zzaq zza;

    public zzao(zzaq zzaqVar, int i) {
        super(zzaqVar.size(), i);
        this.zza = zzaqVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzag
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
