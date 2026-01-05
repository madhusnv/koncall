package com.google.android.gms.internal.cast;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* loaded from: classes3.dex */
final class zzfg extends zzfh {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfh zzc;

    public zzfg(zzfh zzfhVar, int i, int i2) {
        this.zzc = zzfhVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzeu.zza(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.cast.zzfh, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.cast.zzfh
    /* renamed from: zzh */
    public final zzfh subList(int i, int i2) {
        zzeu.zzd(i, i2, this.zzb);
        zzfh zzfhVar = this.zzc;
        int i3 = this.zza;
        return zzfhVar.subList(i + i3, i2 + i3);
    }
}
