package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzi implements SessionManagerListener {
    final /* synthetic */ zzk zza;

    public zzi(zzk zzkVar) {
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionEnded(Session session, int i) {
        this.zza.zzi = (CastSession) session;
        zzk.zzn(this.zza, i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void onSessionEnding(Session session) {
        this.zza.zzi = (CastSession) session;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResumeFailed(Session session, int i) {
        this.zza.zzi = (CastSession) session;
        zzk.zzn(this.zza, i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResumed(Session session, boolean z) {
        zzk.zza.m13795d("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
        this.zza.zzi = (CastSession) session;
        this.zza.zzu();
        Preconditions.checkNotNull(this.zza.zzh);
        zzk zzkVar = this.zza;
        this.zza.zzb.zzd(zzkVar.zzc.zzb(zzkVar.zzh, z), 227);
        zzk zzkVar2 = this.zza;
        zzkVar2.zzh.zzc(zzkVar2.zzg);
        this.zza.zzw();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResuming(Session session, String str) {
        zzk.zza.m13795d("onSessionResuming with sessionId = %s", str);
        this.zza.zzi = (CastSession) session;
        zzk zzkVar = this.zza;
        zzk.zzo(zzkVar, zzkVar.zzg, str);
        Preconditions.checkNotNull(this.zza.zzh);
        zzk zzkVar2 = this.zza;
        this.zza.zzb.zzd(zzkVar2.zzc.zzc(zzkVar2.zzh), 226);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStartFailed(Session session, int i) {
        this.zza.zzi = (CastSession) session;
        zzk.zzn(this.zza, i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStarted(Session session, String str) {
        zzk.zza.m13795d("onSessionStarted with sessionId = %s", str);
        this.zza.zzi = (CastSession) session;
        this.zza.zzu();
        zzk zzkVar = this.zza;
        zzkVar.zzh.zzf = str;
        this.zza.zzb.zzd(zzkVar.zzc.zza(zzkVar.zzh), 222);
        zzk zzkVar2 = this.zza;
        zzkVar2.zzh.zzc(zzkVar2.zzg);
        this.zza.zzw();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStarting(Session session) {
        zzk.zza.m13795d("onSessionStarting", new Object[0]);
        this.zza.zzi = (CastSession) session;
        if (this.zza.zzh != null) {
            zzk.zza.m13802w("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        this.zza.zzv();
        zzk zzkVar = this.zza;
        this.zza.zzb.zzd(zzkVar.zzc.zzd(zzkVar.zzh), 221);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionSuspended(Session session, int i) {
        zzk.zza.m13795d("onSessionSuspended with reason = %d", Integer.valueOf(i));
        this.zza.zzi = (CastSession) session;
        this.zza.zzu();
        Preconditions.checkNotNull(this.zza.zzh);
        zzk zzkVar = this.zza;
        this.zza.zzb.zzd(zzkVar.zzc.zze(zzkVar.zzh, i), 225);
        zzk zzkVar2 = this.zza;
        zzkVar2.zzh.zzc(zzkVar2.zzg);
        this.zza.zzt();
    }
}
