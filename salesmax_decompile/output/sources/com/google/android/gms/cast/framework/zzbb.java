package com.google.android.gms.cast.framework;

import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes5.dex */
final class zzbb extends zzar {
    final /* synthetic */ SessionProvider zza;

    public /* synthetic */ zzbb(SessionProvider sessionProvider, zzba zzbaVar) {
        this.zza = sessionProvider;
    }

    @Override // com.google.android.gms.cast.framework.zzas
    public final IObjectWrapper zzb(String str) {
        Session sessionCreateSession = this.zza.createSession(str);
        if (sessionCreateSession == null) {
            return null;
        }
        return sessionCreateSession.zzl();
    }

    @Override // com.google.android.gms.cast.framework.zzas
    public final String zzc() {
        return this.zza.getCategory();
    }

    @Override // com.google.android.gms.cast.framework.zzas
    public final boolean zzd() {
        return this.zza.isSessionRecoverable();
    }
}
