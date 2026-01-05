package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzag extends zzgk {
    private Boolean zza;
    private zzaf zzb;
    private Boolean zzc;

    public zzag(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzb = new zzaf() { // from class: com.google.android.gms.measurement.internal.zzae
            @Override // com.google.android.gms.measurement.internal.zzaf
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzA() {
        return ((Long) zzdu.zzC.zza(null)).longValue();
    }

    private final String zzB(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.zzt.zzay().zzd().zzb("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            this.zzt.zzay().zzd().zzb("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            this.zzt.zzay().zzd().zzb("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.zzt.zzay().zzd().zzb("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public static final long zzz() {
        return ((Long) zzdu.zzc.zza(null)).longValue();
    }

    public final double zza(String str, zzdt zzdtVar) {
        if (str == null) {
            return ((Double) zzdtVar.zza(null)).doubleValue();
        }
        String strZza = this.zzb.zza(str, zzdtVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Double) zzdtVar.zza(null)).doubleValue();
        }
        try {
            return ((Double) zzdtVar.zza(Double.valueOf(Double.parseDouble(strZza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzdtVar.zza(null)).doubleValue();
        }
    }

    public final int zzb(String str) {
        return zzf(str, zzdu.zzG, 500, 2000);
    }

    public final int zzc() {
        zzlb zzlbVarZzv = this.zzt.zzv();
        Boolean boolZzj = zzlbVarZzv.zzt.zzt().zzj();
        if (zzlbVarZzv.zzm() < 201500) {
            return (boolZzj == null || boolZzj.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int zzd(String str) {
        return zzf(str, zzdu.zzH, 25, 100);
    }

    public final int zze(String str, zzdt zzdtVar) {
        if (str == null) {
            return ((Integer) zzdtVar.zza(null)).intValue();
        }
        String strZza = this.zzb.zza(str, zzdtVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Integer) zzdtVar.zza(null)).intValue();
        }
        try {
            return ((Integer) zzdtVar.zza(Integer.valueOf(Integer.parseInt(strZza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzdtVar.zza(null)).intValue();
        }
    }

    public final int zzf(String str, zzdt zzdtVar, int i, int i2) {
        return Math.max(Math.min(zze(str, zzdtVar), i2), i);
    }

    public final long zzh() {
        this.zzt.zzaw();
        return 74029L;
    }

    public final long zzi(String str, zzdt zzdtVar) {
        if (str == null) {
            return ((Long) zzdtVar.zza(null)).longValue();
        }
        String strZza = this.zzb.zza(str, zzdtVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Long) zzdtVar.zza(null)).longValue();
        }
        try {
            return ((Long) zzdtVar.zza(Long.valueOf(Long.parseLong(strZza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzdtVar.zza(null)).longValue();
        }
    }

    @VisibleForTesting
    public final Bundle zzj() {
        try {
            if (this.zzt.zzau().getPackageManager() == null) {
                this.zzt.zzay().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzt.zzau()).getApplicationInfo(this.zzt.zzau().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.zzt.zzay().zzd().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.zzt.zzay().zzd().zzb("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    @VisibleForTesting
    public final Boolean zzk(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleZzj = zzj();
        if (bundleZzj == null) {
            this.zzt.zzay().zzd().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleZzj.containsKey(str)) {
            return Boolean.valueOf(bundleZzj.getBoolean(str));
        }
        return null;
    }

    public final String zzl() {
        return zzB("debug.firebase.analytics.app", "");
    }

    public final String zzm() {
        return zzB("debug.deferred.deeplink", "");
    }

    public final String zzn() {
        this.zzt.zzaw();
        return "FA";
    }

    public final String zzo(String str, zzdt zzdtVar) {
        return str == null ? (String) zzdtVar.zza(null) : (String) zzdtVar.zza(this.zzb.zza(str, zzdtVar.zzb()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzp(String str) throws Resources.NotFoundException {
        Integer numValueOf;
        Preconditions.checkNotEmpty("analytics.safelisted_events");
        Bundle bundleZzj = zzj();
        if (bundleZzj != null) {
            if (bundleZzj.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleZzj.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    String[] stringArray = this.zzt.zzau().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e) {
                    this.zzt.zzay().zzd().zzb("Failed to load string array from metadata: resource not found", e);
                }
            }
            return null;
        }
        this.zzt.zzay().zzd().zza("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
        }
        return null;
    }

    public final void zzq(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    public final boolean zzr() {
        Boolean boolZzk = zzk("google_analytics_adid_collection_enabled");
        return boolZzk == null || boolZzk.booleanValue();
    }

    public final boolean zzs(String str, zzdt zzdtVar) {
        if (str == null) {
            return ((Boolean) zzdtVar.zza(null)).booleanValue();
        }
        String strZza = this.zzb.zza(str, zzdtVar.zzb());
        return TextUtils.isEmpty(strZza) ? ((Boolean) zzdtVar.zza(null)).booleanValue() : ((Boolean) zzdtVar.zza(Boolean.valueOf("1".equals(strZza)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean boolZzk = zzk("google_analytics_automatic_screen_reporting_enabled");
        return boolZzk == null || boolZzk.booleanValue();
    }

    public final boolean zzv() {
        this.zzt.zzaw();
        Boolean boolZzk = zzk("firebase_analytics_collection_deactivated");
        return boolZzk != null && boolZzk.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    public final boolean zzx() {
        if (this.zza == null) {
            Boolean boolZzk = zzk("app_measurement_lite");
            this.zza = boolZzk;
            if (boolZzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzt.zzN();
    }

    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    ApplicationInfo applicationInfo = this.zzt.zzau().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(myProcessName)) {
                            z = true;
                        }
                        this.zzc = Boolean.valueOf(z);
                    }
                    if (this.zzc == null) {
                        this.zzc = Boolean.TRUE;
                        this.zzt.zzay().zzd().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
