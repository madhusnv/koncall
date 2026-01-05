package com.google.android.gms.internal.cast;

import android.hardware.display.VirtualDisplay;
import com.google.android.gms.cast.CastRemoteDisplay;
import com.google.android.gms.cast.CastRemoteDisplayApi;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

@Deprecated
/* loaded from: classes3.dex */
public final class zzdm implements CastRemoteDisplayApi {
    private static final Logger zza = new Logger("CastRemoteDisplayApiImpl");
    private final Api zzb;
    private VirtualDisplay zzc;
    private final zzdu zzd = new zzde(this);

    public zzdm(Api api) {
        this.zzb = api;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzdm zzdmVar) {
        VirtualDisplay virtualDisplay = zzdmVar.zzc;
        if (virtualDisplay != null) {
            if (virtualDisplay.getDisplay() != null) {
                zza.m13795d("releasing virtual display: " + virtualDisplay.getDisplay().getDisplayId(), new Object[0]);
            }
            virtualDisplay.release();
        }
        zzdmVar.zzc = null;
    }

    @Override // com.google.android.gms.cast.CastRemoteDisplayApi
    public final PendingResult<CastRemoteDisplay.CastRemoteDisplaySessionResult> startRemoteDisplay(GoogleApiClient googleApiClient, String str) {
        zza.m13795d("startRemoteDisplay", new Object[0]);
        return googleApiClient.execute(new zzdf(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.cast.CastRemoteDisplayApi
    public final PendingResult<CastRemoteDisplay.CastRemoteDisplaySessionResult> stopRemoteDisplay(GoogleApiClient googleApiClient) {
        zza.m13795d("stopRemoteDisplay", new Object[0]);
        return googleApiClient.execute(new zzdg(this, googleApiClient));
    }
}
