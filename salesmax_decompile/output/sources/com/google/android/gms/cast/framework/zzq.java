package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes5.dex */
final class zzq extends com.google.android.gms.cast.zzq {
    final /* synthetic */ CastSession zza;

    public /* synthetic */ zzq(CastSession castSession, zzp zzpVar) {
        this.zza = castSession;
    }

    @Override // com.google.android.gms.cast.zzq
    public final void zza() {
        CastSession castSession = this.zza;
        if (castSession.zze != null) {
            try {
                if (castSession.zzj != null) {
                    castSession.zzj.zzp();
                }
                this.zza.zze.zzh(null);
            } catch (RemoteException e) {
                CastSession.zzb.m13796d(e, "Unable to call %s on %s.", "onConnected", zzac.class.getSimpleName());
            }
        }
    }

    @Override // com.google.android.gms.cast.zzq
    public final void zzb(int i) {
        CastSession castSession = this.zza;
        if (castSession.zze != null) {
            try {
                castSession.zze.zzi(new ConnectionResult(i));
            } catch (RemoteException e) {
                CastSession.zzb.m13796d(e, "Unable to call %s on %s.", "onConnectionFailed", zzac.class.getSimpleName());
            }
        }
    }

    @Override // com.google.android.gms.cast.zzq
    public final void zzc(int i) {
        CastSession castSession = this.zza;
        if (castSession.zze != null) {
            try {
                castSession.zze.zzj(i);
            } catch (RemoteException e) {
                CastSession.zzb.m13796d(e, "Unable to call %s on %s.", "onConnectionSuspended", zzac.class.getSimpleName());
            }
        }
    }

    @Override // com.google.android.gms.cast.zzq
    public final void zzd(int i) {
        CastSession castSession = this.zza;
        if (castSession.zze != null) {
            try {
                castSession.zze.zzi(new ConnectionResult(i));
            } catch (RemoteException e) {
                CastSession.zzb.m13796d(e, "Unable to call %s on %s.", "onDisconnected", zzac.class.getSimpleName());
            }
        }
    }
}
