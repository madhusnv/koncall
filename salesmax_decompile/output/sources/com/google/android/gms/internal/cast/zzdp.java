package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.CastRemoteDisplay;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

@Deprecated
/* loaded from: classes3.dex */
public final class zzdp extends GmsClient implements IBinder.DeathRecipient {
    private static final Logger zze = new Logger("CastRemoteDisplayClientImpl");
    private final CastRemoteDisplay.CastRemoteDisplaySessionCallbacks zzf;
    private final CastDevice zzg;
    private final Bundle zzh;

    public zzdp(Context context, Looper looper, ClientSettings clientSettings, CastDevice castDevice, Bundle bundle, CastRemoteDisplay.CastRemoteDisplaySessionCallbacks castRemoteDisplaySessionCallbacks, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 83, clientSettings, connectionCallbacks, onConnectionFailedListener);
        zze.m13795d("instance created", new Object[0]);
        this.zzf = castRemoteDisplaySessionCallbacks;
        this.zzg = castDevice;
        this.zzh = bundle;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        return iInterfaceQueryLocalInterface instanceof zzds ? (zzds) iInterfaceQueryLocalInterface : new zzds(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        zze.m13795d("disconnect", new Object[0]);
        try {
            ((zzds) getService()).zze();
        } catch (RemoteException | IllegalStateException unused) {
        } finally {
            super.disconnect();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.remote_display.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzr(zzdr zzdrVar, zzdu zzduVar, String str) {
        zze.m13795d("startRemoteDisplay", new Object[0]);
        ((zzds) getService()).zzg(zzdrVar, new zzdo(this, zzduVar), this.zzg.getDeviceId(), str, this.zzh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzs(zzdr zzdrVar) {
        zze.m13795d("stopRemoteDisplay", new Object[0]);
        ((zzds) getService()).zzi(zzdrVar);
    }
}
