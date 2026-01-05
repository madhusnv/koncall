package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;

/* loaded from: classes5.dex */
public class ReconnectionService extends Service {
    private static final Logger zza = new Logger("ReconnectionService");
    private zzaj zzb;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        zzaj zzajVar = this.zzb;
        if (zzajVar != null) {
            try {
                return zzajVar.zzf(intent);
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "onBind", zzaj.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        CastContext sharedInstance = CastContext.getSharedInstance(this);
        zzaj zzajVarZzc = com.google.android.gms.internal.cast.zzaf.zzc(this, sharedInstance.getSessionManager().zzb(), sharedInstance.zzc().zza());
        this.zzb = zzajVarZzc;
        if (zzajVarZzc != null) {
            try {
                zzajVarZzc.zzg();
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "onCreate", zzaj.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        zzaj zzajVar = this.zzb;
        if (zzajVar != null) {
            try {
                zzajVar.zzh();
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "onDestroy", zzaj.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        zzaj zzajVar = this.zzb;
        if (zzajVar != null) {
            try {
                return zzajVar.zze(intent, i, i2);
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "onStartCommand", zzaj.class.getSimpleName());
            }
        }
        return 2;
    }
}
