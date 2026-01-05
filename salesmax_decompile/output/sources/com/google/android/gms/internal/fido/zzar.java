package com.google.android.gms.internal.fido;

/* loaded from: classes3.dex */
final class zzar extends zzao {
    private final zzat zza;

    public zzar(zzat zzatVar, int i) {
        super(zzatVar.size(), i);
        this.zza = zzatVar;
    }

    @Override // com.google.android.gms.internal.fido.zzao
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
