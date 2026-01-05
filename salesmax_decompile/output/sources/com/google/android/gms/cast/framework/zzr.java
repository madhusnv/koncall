package com.google.android.gms.cast.framework;

import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes5.dex */
public final class zzr extends zzad {
    private final CastStateListener zza;

    public zzr(CastStateListener castStateListener) {
        this.zza = castStateListener;
    }

    @Override // com.google.android.gms.cast.framework.zzae
    public final IObjectWrapper zzb() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.cast.framework.zzae
    public final void zzc(int i) {
        this.zza.onCastStateChanged(i);
    }
}
