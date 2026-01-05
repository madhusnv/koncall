package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzai extends zzad {
    final /* synthetic */ zzaj zza;

    public zzai(zzaj zzajVar) {
        this.zza = zzajVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzt.zza(i, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
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
