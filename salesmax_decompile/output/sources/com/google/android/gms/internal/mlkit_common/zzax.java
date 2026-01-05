package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* loaded from: classes3.dex */
final class zzax extends zzaq {
    final /* synthetic */ zzay zza;

    public zzax(zzay zzayVar) {
        this.zza = zzayVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzae.zza(i, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zzay zzayVar = this.zza;
        int i2 = i + i;
        Object obj = zzayVar.zzb[i2];
        obj.getClass();
        Object obj2 = zzayVar.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
