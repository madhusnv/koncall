package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* loaded from: classes3.dex */
final class zzap extends zzaq {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzaq zzc;

    public zzap(zzaq zzaqVar, int i, int i2) {
        this.zzc = zzaqVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzae.zza(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaq, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaq
    /* renamed from: zzf */
    public final zzaq subList(int i, int i2) {
        zzae.zzd(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
