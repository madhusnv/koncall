package com.google.android.gms.internal.cast;

import android.annotation.TargetApi;
import android.view.Choreographer;

@TargetApi(16)
/* loaded from: classes3.dex */
final class zzeh extends zzei {
    private final Choreographer zza = Choreographer.getInstance();

    @Override // com.google.android.gms.internal.cast.zzei
    public final void zza(zzef zzefVar) {
        this.zza.postFrameCallback(zzefVar.zzb());
    }
}
