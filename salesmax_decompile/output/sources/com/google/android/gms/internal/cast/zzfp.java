package com.google.android.gms.internal.cast;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* loaded from: classes3.dex */
final class zzfp extends zzfh {
    final /* synthetic */ zzfq zza;

    public zzfp(zzfq zzfqVar) {
        this.zza = zzfqVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzeu.zza(i, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zzfq zzfqVar = this.zza;
        int i2 = i + i;
        Object obj = zzfqVar.zzb[i2];
        obj.getClass();
        Object obj2 = zzfqVar.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final boolean zzf() {
        return true;
    }
}
