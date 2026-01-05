package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;

/* loaded from: classes3.dex */
final class zzbl implements SessionManagerListener {
    final /* synthetic */ zzbm zza;

    public /* synthetic */ zzbl(zzbm zzbmVar, zzbk zzbkVar) {
        this.zza = zzbmVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionEnded(Session session, int i) {
        zzbm.zza.m13795d("onSessionEnded with error = %d", Integer.valueOf(i));
        zzbm.zzg(this.zza);
        zzbm zzbmVar = this.zza;
        if (zzbmVar.zzf == 2) {
            return;
        }
        zzbmVar.zzq();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionEnding(Session session) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResumeFailed(Session session, int i) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResumed(Session session, boolean z) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResuming(Session session, String str) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStartFailed(Session session, int i) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStarted(Session session, String str) {
        zzbm.zza.m13795d("onSessionStarted with transferType = %d", Integer.valueOf(this.zza.zzf));
        if (this.zza.zzb.zzg()) {
            zzbm zzbmVar = this.zza;
            if (zzbmVar.zzf == 2) {
                zzbm.zzi(zzbmVar);
            }
        }
        this.zza.zzq();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStarting(Session session) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionSuspended(Session session, int i) {
    }
}
