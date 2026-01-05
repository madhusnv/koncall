package com.google.android.gms.cast.framework.media.widget;

import android.content.res.Resources;
import com.google.android.gms.cast.framework.C10905R;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;

/* loaded from: classes5.dex */
final class zzp implements RemoteMediaClient.Listener {
    final /* synthetic */ ExpandedControllerActivity zza;

    public /* synthetic */ zzp(ExpandedControllerActivity expandedControllerActivity, zzo zzoVar) {
        this.zza = expandedControllerActivity;
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onAdBreakStatusUpdated() throws Resources.NotFoundException {
        this.zza.zzp();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onMetadataUpdated() {
        this.zza.zzo();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onPreloadStatusUpdated() {
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onQueueStatusUpdated() {
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onSendingRemoteMediaRequest() {
        ExpandedControllerActivity expandedControllerActivity = this.zza;
        expandedControllerActivity.zzw.setText(expandedControllerActivity.getResources().getString(C10905R.string.cast_expanded_controller_loading));
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onStatusUpdated() throws Resources.NotFoundException {
        RemoteMediaClient remoteMediaClientZzj = this.zza.zzj();
        if (remoteMediaClientZzj == null || !remoteMediaClientZzj.hasMediaSession()) {
            ExpandedControllerActivity expandedControllerActivity = this.zza;
            if (expandedControllerActivity.zzd) {
                return;
            }
            expandedControllerActivity.finish();
            return;
        }
        ExpandedControllerActivity expandedControllerActivity2 = this.zza;
        expandedControllerActivity2.zzd = false;
        expandedControllerActivity2.zzn();
        this.zza.zzp();
    }
}
