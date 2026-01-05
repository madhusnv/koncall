package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.zzbt;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzbf;
import com.google.android.gms.internal.cast.zzbq;
import com.google.android.gms.internal.cast.zzbr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public class CastSession extends Session {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = new Logger("CastSession");
    private final Context zzc;
    private final Set zzd;
    private final zzac zze;
    private final CastOptions zzf;
    private final zzbf zzg;
    private final com.google.android.gms.cast.framework.media.internal.zzv zzh;
    private com.google.android.gms.cast.zzr zzi;
    private RemoteMediaClient zzj;
    private CastDevice zzk;
    private Cast.ApplicationConnectionResult zzl;
    private final zzi zzm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastSession(Context context, String str, String str2, CastOptions castOptions, zzbf zzbfVar, com.google.android.gms.cast.framework.media.internal.zzv zzvVar) {
        super(context, str, str2);
        zzi zziVar = new Object() { // from class: com.google.android.gms.cast.framework.zzi
        };
        this.zzd = new HashSet();
        this.zzc = context.getApplicationContext();
        this.zzf = castOptions;
        this.zzg = zzbfVar;
        this.zzh = zzvVar;
        this.zzm = zziVar;
        this.zze = com.google.android.gms.internal.cast.zzaf.zzb(context, castOptions, zzl(), new zzm(this, null));
    }

    public static /* bridge */ /* synthetic */ void zzg(CastSession castSession, int i) {
        castSession.zzh.zzi(i);
        com.google.android.gms.cast.zzr zzrVar = castSession.zzi;
        if (zzrVar != null) {
            zzrVar.zzf();
            castSession.zzi = null;
        }
        castSession.zzk = null;
        RemoteMediaClient remoteMediaClient = castSession.zzj;
        if (remoteMediaClient != null) {
            remoteMediaClient.zzr(null);
            castSession.zzj = null;
        }
        castSession.zzl = null;
    }

    public static /* bridge */ /* synthetic */ void zzh(CastSession castSession, String str, Task task) {
        if (castSession.zze == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                Cast.ApplicationConnectionResult applicationConnectionResult = (Cast.ApplicationConnectionResult) task.getResult();
                castSession.zzl = applicationConnectionResult;
                if (applicationConnectionResult.getStatus() != null && applicationConnectionResult.getStatus().isSuccess()) {
                    zzb.m13795d("%s() -> success result", str);
                    RemoteMediaClient remoteMediaClient = new RemoteMediaClient(new com.google.android.gms.cast.internal.zzaq(null));
                    castSession.zzj = remoteMediaClient;
                    remoteMediaClient.zzr(castSession.zzi);
                    castSession.zzj.zzp();
                    castSession.zzh.zzh(castSession.zzj, castSession.getCastDevice());
                    castSession.zze.zzf((ApplicationMetadata) Preconditions.checkNotNull(applicationConnectionResult.getApplicationMetadata()), applicationConnectionResult.getApplicationStatus(), (String) Preconditions.checkNotNull(applicationConnectionResult.getSessionId()), applicationConnectionResult.getWasLaunched());
                    return;
                }
                if (applicationConnectionResult.getStatus() != null) {
                    zzb.m13795d("%s() -> failure result", str);
                    castSession.zze.zzg(applicationConnectionResult.getStatus().getStatusCode());
                    return;
                }
            } else {
                Exception exception = task.getException();
                if (exception instanceof ApiException) {
                    castSession.zze.zzg(((ApiException) exception).getStatusCode());
                    return;
                }
            }
            castSession.zze.zzg(2476);
        } catch (RemoteException e) {
            zzb.m13796d(e, "Unable to call %s on %s.", "methods", zzac.class.getSimpleName());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzm(Bundle bundle) {
        CastDevice fromBundle = CastDevice.getFromBundle(bundle);
        this.zzk = fromBundle;
        if (fromBundle == null) {
            if (isResuming()) {
                notifyFailedToResumeSession(2153);
                return;
            } else {
                notifyFailedToStartSession(2151);
                return;
            }
        }
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        zzn zznVar = null;
        Object[] objArr = 0;
        if (zzrVar != null) {
            zzrVar.zzf();
            this.zzi = null;
        }
        zzb.m13795d("Acquiring a connection to Google Play Services for %s", this.zzk);
        CastDevice castDevice = (CastDevice) Preconditions.checkNotNull(this.zzk);
        Bundle bundle2 = new Bundle();
        CastOptions castOptions = this.zzf;
        CastMediaOptions castMediaOptions = castOptions == null ? null : castOptions.getCastMediaOptions();
        NotificationOptions notificationOptions = castMediaOptions == null ? null : castMediaOptions.getNotificationOptions();
        boolean z = castMediaOptions != null && castMediaOptions.zza();
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", notificationOptions != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.zzg.zzs());
        Cast.CastOptions.Builder builder = new Cast.CastOptions.Builder(castDevice, new zzo(this, zznVar));
        builder.zzc(bundle2);
        com.google.android.gms.cast.zzr zzrVarZza = Cast.zza(this.zzc, builder.build());
        zzrVarZza.zzk(new zzq(this, objArr == true ? 1 : 0));
        this.zzi = zzrVarZza;
        zzrVarZza.zze();
    }

    public void addCastListener(Cast.Listener listener) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (listener != null) {
            this.zzd.add(listener);
        }
    }

    @Override // com.google.android.gms.cast.framework.Session
    public void end(boolean z) {
        zzac zzacVar = this.zze;
        if (zzacVar != null) {
            try {
                zzacVar.zze(z, 0);
            } catch (RemoteException e) {
                zzb.m13796d(e, "Unable to call %s on %s.", "disconnectFromDevice", zzac.class.getSimpleName());
            }
            notifySessionEnded(0);
        }
    }

    public int getActiveInputState() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar == null || !zzrVar.zzl()) {
            return -1;
        }
        return zzrVar.zzb();
    }

    public Cast.ApplicationConnectionResult getApplicationConnectionResult() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzl;
    }

    public ApplicationMetadata getApplicationMetadata() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar == null || !zzrVar.zzl()) {
            return null;
        }
        return zzrVar.zzd();
    }

    public String getApplicationStatus() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar == null || !zzrVar.zzl()) {
            return null;
        }
        return zzrVar.zzj();
    }

    public CastDevice getCastDevice() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzk;
    }

    public RemoteMediaClient getRemoteMediaClient() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzj;
    }

    @Override // com.google.android.gms.cast.framework.Session
    public long getSessionRemainingTimeMs() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        RemoteMediaClient remoteMediaClient = this.zzj;
        if (remoteMediaClient == null) {
            return 0L;
        }
        return remoteMediaClient.getStreamDuration() - this.zzj.getApproximateStreamPosition();
    }

    public int getStandbyState() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar == null || !zzrVar.zzl()) {
            return -1;
        }
        return zzrVar.zzc();
    }

    public double getVolume() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        return (zzrVar == null || !zzrVar.zzl()) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : zzrVar.zza();
    }

    public boolean isMute() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        return zzrVar != null && zzrVar.zzl() && zzrVar.zzm();
    }

    @Override // com.google.android.gms.cast.framework.Session
    public void onResuming(Bundle bundle) {
        this.zzk = CastDevice.getFromBundle(bundle);
    }

    @Override // com.google.android.gms.cast.framework.Session
    public void onStarting(Bundle bundle) {
        this.zzk = CastDevice.getFromBundle(bundle);
    }

    public void removeCastListener(Cast.Listener listener) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (listener != null) {
            this.zzd.remove(listener);
        }
    }

    public void removeMessageReceivedCallbacks(String str) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar != null) {
            zzrVar.zzg(str);
        }
    }

    public void requestStatus() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar != null) {
            ((zzbt) zzrVar).doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzbb
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    int i = zzbt.zzf;
                    ((com.google.android.gms.cast.internal.zzag) ((com.google.android.gms.cast.internal.zzx) obj).getService()).zzl();
                    ((TaskCompletionSource) obj2).setResult(null);
                }
            }).setMethodKey(8404).build());
        }
    }

    @Override // com.google.android.gms.cast.framework.Session
    public void resume(Bundle bundle) {
        zzm(bundle);
    }

    public PendingResult<Status> sendMessage(String str, String str2) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        return zzrVar == null ? PendingResults.immediatePendingResult(new Status(17)) : zzbr.zza(zzrVar.zzh(str, str2), new zzbq() { // from class: com.google.android.gms.cast.framework.zzg
        }, new zzbq() { // from class: com.google.android.gms.cast.framework.zzh
        });
    }

    public void setMessageReceivedCallbacks(String str, Cast.MessageReceivedCallback messageReceivedCallback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar == null || !zzrVar.zzl()) {
            return;
        }
        zzrVar.zzi(str, messageReceivedCallback);
    }

    public void setMute(final boolean z) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar == null || !zzrVar.zzl()) {
            return;
        }
        final zzbt zzbtVar = (zzbt) zzrVar;
        zzbtVar.doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzbc
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzbtVar.zzL(z, (com.google.android.gms.cast.internal.zzx) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(8412).build());
    }

    public void setVolume(final double d) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        com.google.android.gms.cast.zzr zzrVar = this.zzi;
        if (zzrVar == null || !zzrVar.zzl()) {
            return;
        }
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            final zzbt zzbtVar = (zzbt) zzrVar;
            zzbtVar.doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzbh
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    zzbtVar.zzM(d, (com.google.android.gms.cast.internal.zzx) obj, (TaskCompletionSource) obj2);
                }
            }).setMethodKey(8411).build());
        } else {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
    }

    @Override // com.google.android.gms.cast.framework.Session
    public void start(Bundle bundle) {
        zzm(bundle);
    }

    public final com.google.android.gms.cast.framework.media.internal.zzv zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.cast.framework.Session
    public final void zzi(Bundle bundle) {
        CastDevice castDevice;
        CastDevice castDevice2;
        CastDevice fromBundle = CastDevice.getFromBundle(bundle);
        if (fromBundle == null || fromBundle.equals(this.zzk)) {
            return;
        }
        boolean z = !TextUtils.isEmpty(fromBundle.getFriendlyName()) && ((castDevice2 = this.zzk) == null || !TextUtils.equals(castDevice2.getFriendlyName(), fromBundle.getFriendlyName()));
        this.zzk = fromBundle;
        Logger logger = zzb;
        Object[] objArr = new Object[2];
        objArr[0] = fromBundle;
        objArr[1] = true != z ? "unchanged" : "changed";
        logger.m13795d("update to device (%s) with name %s", objArr);
        if (!z || (castDevice = this.zzk) == null) {
            return;
        }
        com.google.android.gms.cast.framework.media.internal.zzv zzvVar = this.zzh;
        if (zzvVar != null) {
            zzvVar.zzk(castDevice);
        }
        Iterator it = new HashSet(this.zzd).iterator();
        while (it.hasNext()) {
            ((Cast.Listener) it.next()).onDeviceNameChanged();
        }
    }

    public final boolean zzj() {
        return this.zzg.zzs();
    }
}
