package com.google.android.gms.cast.framework.media.widget;

import android.view.View;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;

/* loaded from: classes5.dex */
final class zzi implements View.OnClickListener {
    final /* synthetic */ ExpandedControllerActivity zza;

    public zzi(ExpandedControllerActivity expandedControllerActivity) {
        this.zza = expandedControllerActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RemoteMediaClient remoteMediaClientZzj;
        if (!this.zza.zzI.isClickable() || (remoteMediaClientZzj = this.zza.zzj()) == null) {
            return;
        }
        remoteMediaClientZzj.skipAd();
    }
}
