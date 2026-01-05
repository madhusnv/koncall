package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.os.Bundle;
import android.view.Display;
import com.google.android.gms.cast.CastRemoteDisplay;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

@TargetApi(19)
@Deprecated
/* loaded from: classes5.dex */
public class CastRemoteDisplayClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    private static final Api.AbstractClientBuilder zza;
    private static final Api zzb;
    private final Logger zzc;
    private VirtualDisplay zzd;

    static {
        zzab zzabVar = new zzab();
        zza = zzabVar;
        zzb = new Api("CastRemoteDisplay.API", zzabVar, com.google.android.gms.cast.internal.zzak.zzd);
    }

    public CastRemoteDisplayClient(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) zzb, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zzc = new Logger("CastRemoteDisplay");
    }

    public static /* bridge */ /* synthetic */ void zzd(CastRemoteDisplayClient castRemoteDisplayClient) {
        VirtualDisplay virtualDisplay = castRemoteDisplayClient.zzd;
        if (virtualDisplay != null) {
            if (virtualDisplay.getDisplay() != null) {
                castRemoteDisplayClient.zzc.m13795d("releasing virtual display: " + castRemoteDisplayClient.zzd.getDisplay().getDisplayId(), new Object[0]);
            }
            VirtualDisplay virtualDisplay2 = castRemoteDisplayClient.zzd;
            if (virtualDisplay2 != null) {
                virtualDisplay2.release();
                castRemoteDisplayClient.zzd = null;
            }
        }
    }

    public Task<Display> startRemoteDisplay(CastDevice castDevice, String str, @CastRemoteDisplay.Configuration int i, PendingIntent pendingIntent) {
        return zze(castDevice, str, i, pendingIntent, null);
    }

    public Task<Void> stopRemoteDisplay() {
        return doWrite(TaskApiCall.builder().setMethodKey(8402).run(new RemoteCall() { // from class: com.google.android.gms.cast.zzz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.cast.zzds) ((com.google.android.gms.internal.cast.zzdn) obj).getService()).zzi(new zzad(this.zza, (TaskCompletionSource) obj2));
            }
        }).build());
    }

    public final Task zze(final CastDevice castDevice, final String str, @CastRemoteDisplay.Configuration final int i, final PendingIntent pendingIntent, final zzal zzalVar) {
        return doWrite(TaskApiCall.builder().setMethodKey(8401).run(new RemoteCall() { // from class: com.google.android.gms.cast.zzaa
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                CastRemoteDisplayClient castRemoteDisplayClient = this.zza;
                int i2 = i;
                zzal zzalVar2 = zzalVar;
                PendingIntent pendingIntent2 = pendingIntent;
                CastDevice castDevice2 = castDevice;
                String str2 = str;
                com.google.android.gms.internal.cast.zzdn zzdnVar = (com.google.android.gms.internal.cast.zzdn) obj;
                Bundle bundle = new Bundle();
                bundle.putInt("configuration", i2);
                ((com.google.android.gms.internal.cast.zzds) zzdnVar.getService()).zzh(new zzac(castRemoteDisplayClient, (TaskCompletionSource) obj2, zzdnVar, zzalVar2), pendingIntent2, castDevice2.getDeviceId(), str2, bundle);
            }
        }).build());
    }
}
