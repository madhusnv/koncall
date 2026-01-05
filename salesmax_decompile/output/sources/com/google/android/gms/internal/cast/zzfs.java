package com.google.android.gms.internal.cast;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes3.dex */
final class zzfs extends zzfh {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzfs(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzeu.zza(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zza[i + i + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final boolean zzf() {
        return true;
    }
}
