package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes5.dex */
public abstract class Session {
    private static final Logger zza = new Logger("Session");
    private final zzam zzb;
    private final zzay zzc;

    public Session(Context context, String str, String str2) {
        zzay zzayVar = new zzay(this, null);
        this.zzc = zzayVar;
        this.zzb = com.google.android.gms.internal.cast.zzaf.zzd(context, str, str2, zzayVar);
    }

    public abstract void end(boolean z);

    public final String getCategory() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                return zzamVar.zzh();
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "getCategory", zzam.class.getSimpleName());
            }
        }
        return null;
    }

    public final String getSessionId() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                return zzamVar.zzi();
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "getSessionId", zzam.class.getSimpleName());
            }
        }
        return null;
    }

    public long getSessionRemainingTimeMs() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return 0L;
    }

    public boolean isConnected() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                return zzamVar.zzp();
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "isConnected", zzam.class.getSimpleName());
            }
        }
        return false;
    }

    public boolean isConnecting() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                return zzamVar.zzq();
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "isConnecting", zzam.class.getSimpleName());
            }
        }
        return false;
    }

    public boolean isDisconnected() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                return zzamVar.zzr();
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "isDisconnected", zzam.class.getSimpleName());
            }
        }
        return true;
    }

    public boolean isDisconnecting() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                return zzamVar.zzs();
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "isDisconnecting", zzam.class.getSimpleName());
            }
        }
        return false;
    }

    public boolean isResuming() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                return zzamVar.zzt();
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "isResuming", zzam.class.getSimpleName());
            }
        }
        return false;
    }

    public boolean isSuspended() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                return zzamVar.zzu();
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "isSuspended", zzam.class.getSimpleName());
            }
        }
        return false;
    }

    public final void notifyFailedToResumeSession(int i) {
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                zzamVar.zzj(i);
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "notifyFailedToResumeSession", zzam.class.getSimpleName());
            }
        }
    }

    public final void notifyFailedToStartSession(int i) {
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                zzamVar.zzk(i);
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "notifyFailedToStartSession", zzam.class.getSimpleName());
            }
        }
    }

    public final void notifySessionEnded(int i) {
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                zzamVar.zzl(i);
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "notifySessionEnded", zzam.class.getSimpleName());
            }
        }
    }

    public final void notifySessionResumed(boolean z) {
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                zzamVar.zzm(z);
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "notifySessionResumed", zzam.class.getSimpleName());
            }
        }
    }

    public final void notifySessionStarted(String str) {
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                zzamVar.zzn(str);
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "notifySessionStarted", zzam.class.getSimpleName());
            }
        }
    }

    public final void notifySessionSuspended(int i) {
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                zzamVar.zzo(i);
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "notifySessionSuspended", zzam.class.getSimpleName());
            }
        }
    }

    public void onResuming(Bundle bundle) {
    }

    public void onStarting(Bundle bundle) {
    }

    public abstract void resume(Bundle bundle);

    public abstract void start(Bundle bundle);

    public void zzi(Bundle bundle) {
    }

    public final int zzk() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                if (zzamVar.zze() >= 211100000) {
                    return this.zzb.zzf();
                }
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "getSessionStartType", zzam.class.getSimpleName());
            }
        }
        return 0;
    }

    public final IObjectWrapper zzl() {
        zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            try {
                return zzamVar.zzg();
            } catch (RemoteException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "getWrappedObject", zzam.class.getSimpleName());
            }
        }
        return null;
    }
}
