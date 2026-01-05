package com.google.android.gms.maps.model;

import com.google.android.gms.internal.maps.zzaq;
import com.google.android.gms.maps.model.FeatureLayer;

/* loaded from: classes3.dex */
final class zzd extends zzaq {
    final /* synthetic */ FeatureLayer.StyleFactory zza;

    public zzd(FeatureLayer featureLayer, FeatureLayer.StyleFactory styleFactory) {
        this.zza = styleFactory;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final FeatureStyle zzb(com.google.android.gms.internal.maps.zzp zzpVar) {
        Feature featureZza = Feature.zza(zzpVar);
        if (featureZza == null) {
            return null;
        }
        return this.zza.getStyle(featureZza);
    }
}
