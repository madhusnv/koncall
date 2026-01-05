package com.google.android.gms.internal.location;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* loaded from: classes3.dex */
final class zzew extends zzex {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzex zzc;

    public zzew(zzex zzexVar, int i, int i2) {
        this.zzc = zzexVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzer.zzc(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzex, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzex
    /* renamed from: zzh */
    public final zzex subList(int i, int i2) {
        zzer.zze(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
