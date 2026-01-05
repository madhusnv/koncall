package com.google.android.gms.cast.framework.media.uicontroller;

import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

/* loaded from: classes5.dex */
final class zzh extends com.google.android.gms.cast.framework.media.widget.zzd {
    final /* synthetic */ UIMediaController zza;

    public zzh(UIMediaController uIMediaController) {
        this.zza = uIMediaController;
    }

    @Override // com.google.android.gms.cast.framework.media.widget.zzd
    public final void zza(CastSeekBar castSeekBar, int i, boolean z) {
        this.zza.zzc(castSeekBar, i, z);
    }

    @Override // com.google.android.gms.cast.framework.media.widget.zzd
    public final void zzb(CastSeekBar castSeekBar) {
        this.zza.zzd(castSeekBar);
    }

    @Override // com.google.android.gms.cast.framework.media.widget.zzd
    public final void zzc(CastSeekBar castSeekBar) {
        this.zza.zze(castSeekBar);
    }
}
