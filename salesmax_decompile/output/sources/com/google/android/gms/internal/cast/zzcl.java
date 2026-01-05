package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;

/* loaded from: classes3.dex */
public final class zzcl extends UIController {
    private final View zza;
    private final int zzb;

    public zzcl(View view, int i) {
        this.zza = view;
        this.zzb = i;
        view.setEnabled(false);
    }

    private final void zza() {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.zzs() || remoteMediaClient.isPlayingAd()) {
            this.zza.setVisibility(this.zzb);
            this.zza.setEnabled(false);
        } else {
            this.zza.setVisibility(0);
            this.zza.setEnabled(true);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSendingRemoteMediaRequest() {
        this.zza.setEnabled(false);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionConnected(CastSession castSession) {
        super.onSessionConnected(castSession);
        zza();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionEnded() {
        this.zza.setEnabled(false);
        super.onSessionEnded();
    }
}
