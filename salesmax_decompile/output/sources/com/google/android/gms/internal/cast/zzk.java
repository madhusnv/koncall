package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzk {
    private static final Logger zza = new Logger("ApplicationAnalytics");
    private final zzf zzb;
    private final zzm zzc;
    private final SharedPreferences zzg;
    private zzl zzh;
    private CastSession zzi;
    private boolean zzj;
    private boolean zzk;
    private final zzh zzd = new zzh(this);
    private final Handler zzf = new zzdy(Looper.getMainLooper());
    private final Runnable zze = new Runnable() { // from class: com.google.android.gms.internal.cast.zzg
        @Override // java.lang.Runnable
        public final void run() {
            zzk.zzg(this.zza);
        }
    };

    public zzk(SharedPreferences sharedPreferences, zzf zzfVar, Bundle bundle, String str) {
        this.zzg = sharedPreferences;
        this.zzb = zzfVar;
        this.zzc = new zzm(bundle, str);
    }

    public static /* synthetic */ void zzg(zzk zzkVar) {
        zzl zzlVar = zzkVar.zzh;
        if (zzlVar != null) {
            zzkVar.zzb.zzd(zzkVar.zzc.zza(zzlVar), 223);
        }
        zzkVar.zzw();
    }

    public static /* bridge */ /* synthetic */ void zzn(zzk zzkVar, int i) {
        zza.m13795d("log session ended with error = %d", Integer.valueOf(i));
        zzkVar.zzu();
        zzkVar.zzb.zzd(zzkVar.zzc.zze(zzkVar.zzh, i), 228);
        zzkVar.zzt();
        if (zzkVar.zzk) {
            return;
        }
        zzkVar.zzh = null;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzk zzkVar, SharedPreferences sharedPreferences, String str) {
        boolean z = false;
        if (zzkVar.zzz(str)) {
            zza.m13795d("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            Preconditions.checkNotNull(zzkVar.zzh);
            return;
        }
        zzkVar.zzh = zzl.zzb(sharedPreferences);
        if (zzkVar.zzz(str)) {
            zza.m13795d("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
            Preconditions.checkNotNull(zzkVar.zzh);
            zzl.zza = zzkVar.zzh.zzd + 1;
            return;
        }
        zza.m13795d("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
        zzl zzlVarZza = zzl.zza(zzkVar.zzj);
        zzkVar.zzh = zzlVarZza;
        zzl zzlVar = (zzl) Preconditions.checkNotNull(zzlVarZza);
        CastSession castSession = zzkVar.zzi;
        if (castSession != null && castSession.zzj()) {
            z = true;
        }
        zzlVar.zzj = z;
        ((zzl) Preconditions.checkNotNull(zzkVar.zzh)).zzb = zzs();
        ((zzl) Preconditions.checkNotNull(zzkVar.zzh)).zzf = str;
    }

    public static /* bridge */ /* synthetic */ void zzr(zzk zzkVar, boolean z) {
        Logger logger = zza;
        Object[] objArr = new Object[1];
        objArr[0] = true != z ? "foreground" : "background";
        logger.m13795d("update app visibility to %s", objArr);
        zzkVar.zzj = z;
        zzl zzlVar = zzkVar.zzh;
        if (zzlVar != null) {
            zzlVar.zzi = z;
        }
    }

    private static String zzs() {
        return ((CastContext) Preconditions.checkNotNull(CastContext.getSharedInstance())).getCastOptions().getReceiverApplicationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzt() {
        this.zzf.removeCallbacks(this.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        if (!zzy()) {
            zza.m13802w("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
            zzv();
            return;
        }
        CastSession castSession = this.zzi;
        CastDevice castDevice = castSession != null ? castSession.getCastDevice() : null;
        if (castDevice != null && !TextUtils.equals(this.zzh.zzc, castDevice.zzc())) {
            zzx(castDevice);
        }
        Preconditions.checkNotNull(this.zzh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        zza.m13795d("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        zzl zzlVarZza = zzl.zza(this.zzj);
        this.zzh = zzlVarZza;
        zzl zzlVar = (zzl) Preconditions.checkNotNull(zzlVarZza);
        CastSession castSession = this.zzi;
        zzlVar.zzj = castSession != null && castSession.zzj();
        ((zzl) Preconditions.checkNotNull(this.zzh)).zzb = zzs();
        CastSession castSession2 = this.zzi;
        CastDevice castDevice = castSession2 == null ? null : castSession2.getCastDevice();
        if (castDevice != null) {
            zzx(castDevice);
        }
        zzl zzlVar2 = (zzl) Preconditions.checkNotNull(this.zzh);
        CastSession castSession3 = this.zzi;
        zzlVar2.zzk = castSession3 != null ? castSession3.zzk() : 0;
        Preconditions.checkNotNull(this.zzh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw() {
        ((Handler) Preconditions.checkNotNull(this.zzf)).postDelayed((Runnable) Preconditions.checkNotNull(this.zze), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
    }

    private final void zzx(CastDevice castDevice) {
        zzl zzlVar = this.zzh;
        if (zzlVar == null) {
            return;
        }
        zzlVar.zzc = castDevice.zzc();
        zzlVar.zzg = castDevice.zza();
        zzlVar.zzh = castDevice.getModelName();
    }

    private final boolean zzy() {
        String str;
        if (this.zzh == null) {
            zza.m13795d("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        String strZzs = zzs();
        if (strZzs == null || (str = this.zzh.zzb) == null || !TextUtils.equals(str, strZzs)) {
            zza.m13795d("The analytics session doesn't match the application ID %s", strZzs);
            return false;
        }
        Preconditions.checkNotNull(this.zzh);
        return true;
    }

    private final boolean zzz(String str) {
        String str2;
        if (!zzy()) {
            return false;
        }
        Preconditions.checkNotNull(this.zzh);
        if (str != null && (str2 = this.zzh.zzf) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        zza.m13795d("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }

    public final zzh zzc() {
        return this.zzd;
    }
}
