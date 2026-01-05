package com.google.android.gms.internal.cast;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import androidx.mediarouter.media.C2319g;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.SessionTransferCallback;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p001o.g32;

@TargetApi(30)
/* loaded from: classes3.dex */
public final class zzbm {
    private static final Logger zza = new Logger("SessionTransController");
    private final CastOptions zzb;
    private SessionManager zzg;
    private g32.C13614a zzh;
    private SessionState zzi;
    private final Set zzc = Collections.synchronizedSet(new HashSet());
    private int zzf = 0;
    private final Handler zzd = new zzdy(Looper.getMainLooper());
    private final Runnable zze = new Runnable() { // from class: com.google.android.gms.internal.cast.zzbh
        @Override // java.lang.Runnable
        public final void run() {
            zzbm.zze(this.zza);
        }
    };

    public zzbm(CastOptions castOptions) {
        this.zzb = castOptions;
    }

    public static /* synthetic */ void zzd(zzbm zzbmVar, SessionState sessionState) {
        zzbmVar.zzi = sessionState;
        g32.C13614a c13614a = zzbmVar.zzh;
        if (c13614a != null) {
            c13614a.m28005c(null);
        }
    }

    public static /* synthetic */ void zze(zzbm zzbmVar) {
        zza.m13799i("transfer with type = %d has timed out", Integer.valueOf(zzbmVar.zzf));
        zzbmVar.zzp(101);
    }

    public static /* bridge */ /* synthetic */ void zzg(zzbm zzbmVar) {
        int i = zzbmVar.zzf;
        if (i == 0) {
            zza.m13795d("No need to notify transferred if the transfer type is unknown", new Object[0]);
            return;
        }
        SessionState sessionState = zzbmVar.zzi;
        if (sessionState == null) {
            zza.m13795d("No need to notify with null sessionState", new Object[0]);
            return;
        }
        zza.m13795d("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i), zzbmVar.zzi);
        Iterator it = new HashSet(zzbmVar.zzc).iterator();
        while (it.hasNext()) {
            ((SessionTransferCallback) it.next()).onTransferred(zzbmVar.zzf, sessionState);
        }
    }

    public static /* bridge */ /* synthetic */ void zzi(zzbm zzbmVar) {
        if (zzbmVar.zzi == null) {
            zza.m13795d("skip restoring session state due to null SessionState", new Object[0]);
            return;
        }
        RemoteMediaClient remoteMediaClientZzo = zzbmVar.zzo();
        if (remoteMediaClientZzo == null) {
            zza.m13795d("skip restoring session state due to null RemoteMediaClient", new Object[0]);
        } else {
            zza.m13795d("resume SessionState to current session", new Object[0]);
            remoteMediaClientZzo.zzq(zzbmVar.zzi);
        }
    }

    private final RemoteMediaClient zzo() {
        SessionManager sessionManager = this.zzg;
        if (sessionManager == null) {
            zza.m13795d("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        CastSession currentCastSession = sessionManager.getCurrentCastSession();
        if (currentCastSession != null) {
            return currentCastSession.getRemoteMediaClient();
        }
        zza.m13795d("skip transferring as CastSession is null", new Object[0]);
        return null;
    }

    private final void zzp(int i) {
        g32.C13614a c13614a = this.zzh;
        if (c13614a != null) {
            c13614a.m28006d();
        }
        zza.m13795d("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.zzf), Integer.valueOf(i));
        Iterator it = new HashSet(this.zzc).iterator();
        while (it.hasNext()) {
            ((SessionTransferCallback) it.next()).onTransferFailed(this.zzf, i);
        }
        zzq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq() {
        ((Handler) Preconditions.checkNotNull(this.zzd)).removeCallbacks((Runnable) Preconditions.checkNotNull(this.zze));
        this.zzf = 0;
        this.zzi = null;
    }

    public final void zzj(SessionManager sessionManager) {
        this.zzg = sessionManager;
        ((Handler) Preconditions.checkNotNull(this.zzd)).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbg
            @Override // java.lang.Runnable
            public final void run() {
                zzbm zzbmVar = this.zza;
                ((SessionManager) Preconditions.checkNotNull(zzbmVar.zzg)).addSessionManagerListener(new zzbl(zzbmVar, null), CastSession.class);
            }
        });
    }

    public final /* synthetic */ void zzk(Exception exc) {
        zza.m13803w(exc, "Fail to store SessionState", new Object[0]);
        zzp(100);
    }

    public final void zzl(C2319g.h hVar, C2319g.h hVar2, g32.C13614a c13614a) {
        if (new HashSet(this.zzc).isEmpty()) {
            zza.m13795d("No need to prepare transfer without any callback", new Object[0]);
            c13614a.m28005c(null);
            return;
        }
        int i = 1;
        if (hVar.m8361o() != 1) {
            zza.m13795d("No need to prepare transfer when transferring from local", new Object[0]);
            c13614a.m28005c(null);
            return;
        }
        RemoteMediaClient remoteMediaClientZzo = zzo();
        if (remoteMediaClientZzo == null || !remoteMediaClientZzo.hasMediaSession()) {
            zza.m13795d("No need to prepare transfer when there is no media session", new Object[0]);
            c13614a.m28005c(null);
            return;
        }
        Logger logger = zza;
        logger.m13795d("Prepare route transfer for changing endpoint", new Object[0]);
        if (hVar2.m8361o() == 0) {
            zzr.zzd(zzln.CAST_TRANSFER_TO_LOCAL_USED);
        } else {
            i = CastDevice.getFromBundle(hVar2.m8355i()) == null ? 3 : 2;
        }
        this.zzf = i;
        this.zzh = c13614a;
        logger.m13795d("notify transferring with type = %d", Integer.valueOf(i));
        Iterator it = new HashSet(this.zzc).iterator();
        while (it.hasNext()) {
            ((SessionTransferCallback) it.next()).onTransferring(this.zzf);
        }
        this.zzi = null;
        remoteMediaClientZzo.zzk(null).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast.zzbi
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                zzbm.zzd(this.zza, (SessionState) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast.zzbj
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.zza.zzk(exc);
            }
        });
        ((Handler) Preconditions.checkNotNull(this.zzd)).postDelayed((Runnable) Preconditions.checkNotNull(this.zze), 10000L);
    }

    public final void zzm(SessionTransferCallback sessionTransferCallback) {
        zza.m13795d("register callback = %s", sessionTransferCallback);
        Preconditions.checkMainThread("Must be called from the main thread.");
        Preconditions.checkNotNull(sessionTransferCallback);
        this.zzc.add(sessionTransferCallback);
    }

    public final void zzn(SessionTransferCallback sessionTransferCallback) {
        zza.m13795d("unregister callback = %s", sessionTransferCallback);
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (sessionTransferCallback != null) {
            this.zzc.remove(sessionTransferCallback);
        }
    }
}
