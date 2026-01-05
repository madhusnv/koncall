package com.google.android.gms.internal.maps;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzbp extends zzbi {
    final /* synthetic */ zzbq zza;

    public zzbp(zzbq zzbqVar) {
        this.zza = zzbqVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzba.zza(i, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        int i2 = i + i;
        Object obj = this.zza.zzb[i2];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
