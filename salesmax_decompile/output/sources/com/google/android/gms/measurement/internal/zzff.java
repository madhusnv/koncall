package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import p001o.xma;

/* loaded from: classes3.dex */
final class zzff extends xma {
    final /* synthetic */ zzfi zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzff(zzfi zzfiVar, int i) {
        super(20);
        this.zza = zzfiVar;
    }

    @Override // p001o.xma
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfi.zzd(this.zza, str);
    }
}
