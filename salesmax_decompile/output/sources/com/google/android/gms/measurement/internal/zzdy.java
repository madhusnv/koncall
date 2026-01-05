package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzpj;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzdy extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    public zzdy(zzfr zzfrVar, long j) {
        super(zzfrVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(1:4)(21:87|6|(1:10)(2:11|(1:13))|83|14|(4:16|(1:18)(1:20)|85|21)|26|(1:31)(1:30)|32|33|43|(1:45)|89|46|(1:48)|49|(3:51|(1:53)(1:54)|55)|(3:57|(1:59)(1:60)|61)|65|(2:68|(1:70)(4:71|(3:74|(1:92)(1:93)|72)|91|77))(1:77)|(2:79|80)(2:81|82))|5|26|(2:28|31)(0)|32|33|43|(0)|89|46|(0)|49|(0)|(0)|65|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01db, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01dc, code lost:
    
        r11.zzt.zzay().zzd().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzeh.zzn(r0), r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0194 A[Catch: IllegalStateException -> 0x01db, TryCatch #3 {IllegalStateException -> 0x01db, blocks: (B:46:0x0173, B:49:0x018c, B:51:0x0194, B:55:0x01b2, B:54:0x01ae, B:57:0x01bc, B:59:0x01d2, B:61:0x01d7, B:60:0x01d5), top: B:89:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bc A[Catch: IllegalStateException -> 0x01db, TryCatch #3 {IllegalStateException -> 0x01db, blocks: (B:46:0x0173, B:49:0x018c, B:51:0x0194, B:55:0x01b2, B:54:0x01ae, B:57:0x01bc, B:59:0x01d2, B:61:0x01d7, B:60:0x01d5), top: B:89:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024c  */
    @Override // com.google.android.gms.measurement.internal.zzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd() throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        String str;
        String string;
        Object[] objArr;
        int iZza;
        List listZzp;
        String strZzc;
        String packageName = this.zzt.zzau().getPackageName();
        PackageManager packageManager = this.zzt.zzau().getPackageManager();
        int i = Integer.MIN_VALUE;
        String installerPackageName = "unknown";
        String str2 = "Unknown";
        if (packageManager != null) {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.zzt.zzay().zzd().zzb("Error retrieving app installer package name. appId", zzeh.zzn(packageName));
            }
            if (installerPackageName == null) {
                installerPackageName = "manual_install";
            } else if ("com.android.vending".equals(installerPackageName)) {
                installerPackageName = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.zzt.zzau().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                    try {
                        str2 = packageInfo.versionName;
                        i = packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = str2;
                        str2 = string;
                        this.zzt.zzay().zzd().zzc("Error retrieving package info. appId, appName", zzeh.zzn(packageName), str2);
                        string = str2;
                        str2 = str;
                        this.zza = packageName;
                        this.zzd = installerPackageName;
                        this.zzb = str2;
                        this.zzc = i;
                        this.zze = string;
                        this.zzf = 0L;
                        if (TextUtils.isEmpty(this.zzt.zzw())) {
                        }
                        iZza = this.zzt.zza();
                        switch (iZza) {
                        }
                        this.zzk = "";
                        this.zzl = "";
                        this.zzt.zzaw();
                        if (objArr != false) {
                        }
                        strZzc = zzid.zzc(this.zzt.zzau(), "google_app_id", this.zzt.zzz());
                        this.zzk = true != TextUtils.isEmpty(strZzc) ? strZzc : "";
                        if (!TextUtils.isEmpty(strZzc)) {
                        }
                        if (iZza == 0) {
                        }
                        this.zzh = null;
                        this.zzt.zzaw();
                        listZzp = this.zzt.zzf().zzp("analytics.safelisted_events");
                        if (listZzp == null) {
                        }
                        if (packageManager != null) {
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = "Unknown";
            }
            this.zza = packageName;
            this.zzd = installerPackageName;
            this.zzb = str2;
            this.zzc = i;
            this.zze = string;
            this.zzf = 0L;
            objArr = !TextUtils.isEmpty(this.zzt.zzw()) && "am".equals(this.zzt.zzx());
            iZza = this.zzt.zza();
            switch (iZza) {
                case 0:
                    this.zzt.zzay().zzj().zza("App measurement collection enabled");
                    break;
                case 1:
                    this.zzt.zzay().zzi().zza("App measurement deactivated via the manifest");
                    break;
                case 2:
                    this.zzt.zzay().zzj().zza("App measurement deactivated via the init parameters");
                    break;
                case 3:
                    this.zzt.zzay().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                    break;
                case 4:
                    this.zzt.zzay().zzi().zza("App measurement disabled via the manifest");
                    break;
                case 5:
                    this.zzt.zzay().zzj().zza("App measurement disabled via the init parameters");
                    break;
                case 6:
                    this.zzt.zzay().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                    break;
                case 7:
                    this.zzt.zzay().zzi().zza("App measurement disabled via the global data collection setting");
                    break;
                default:
                    this.zzt.zzay().zzi().zza("App measurement disabled due to denied storage consent");
                    break;
            }
            this.zzk = "";
            this.zzl = "";
            this.zzt.zzaw();
            if (objArr != false) {
                this.zzl = this.zzt.zzw();
            }
            strZzc = zzid.zzc(this.zzt.zzau(), "google_app_id", this.zzt.zzz());
            this.zzk = true != TextUtils.isEmpty(strZzc) ? strZzc : "";
            if (!TextUtils.isEmpty(strZzc)) {
                Context contextZzau = this.zzt.zzau();
                String strZzz = this.zzt.zzz();
                Preconditions.checkNotNull(contextZzau);
                Resources resources = contextZzau.getResources();
                if (TextUtils.isEmpty(strZzz)) {
                    strZzz = zzfj.zza(contextZzau);
                }
                this.zzl = zzfj.zzb("admob_app_id", resources, strZzz);
            }
            if (iZza == 0) {
                this.zzt.zzay().zzj().zzc("App measurement enabled for app package, google app id", this.zza, TextUtils.isEmpty(this.zzk) ? this.zzl : this.zzk);
            }
            this.zzh = null;
            this.zzt.zzaw();
            listZzp = this.zzt.zzf().zzp("analytics.safelisted_events");
            if (listZzp == null) {
                this.zzh = listZzp;
            } else if (listZzp.isEmpty()) {
                this.zzt.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
            } else {
                Iterator it = listZzp.iterator();
                while (it.hasNext()) {
                    if (!this.zzt.zzv().zzab("safelisted event", (String) it.next())) {
                    }
                }
                this.zzh = listZzp;
            }
            if (packageManager != null) {
                this.zzj = InstantApps.isInstantApp(this.zzt.zzau()) ? 1 : 0;
                return;
            } else {
                this.zzj = 0;
                return;
            }
        }
        this.zzt.zzay().zzd().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzeh.zzn(packageName));
        string = "Unknown";
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str2;
        this.zzc = i;
        this.zze = string;
        this.zzf = 0L;
        if (TextUtils.isEmpty(this.zzt.zzw())) {
        }
        iZza = this.zzt.zza();
        switch (iZza) {
        }
        this.zzk = "";
        this.zzl = "";
        this.zzt.zzaw();
        if (objArr != false) {
        }
        strZzc = zzid.zzc(this.zzt.zzau(), "google_app_id", this.zzt.zzz());
        this.zzk = true != TextUtils.isEmpty(strZzc) ? strZzc : "";
        if (!TextUtils.isEmpty(strZzc)) {
        }
        if (iZza == 0) {
        }
        this.zzh = null;
        this.zzt.zzaw();
        listZzp = this.zzt.zzf().zzp("analytics.safelisted_events");
        if (listZzp == null) {
        }
        if (packageManager != null) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return true;
    }

    public final int zzh() {
        zza();
        return this.zzj;
    }

    public final int zzi() {
        zza();
        return this.zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v38, types: [com.google.android.gms.measurement.internal.zzgk, com.google.android.gms.measurement.internal.zzlb] */
    /* JADX WARN: Type inference failed for: r9v39, types: [com.google.android.gms.measurement.internal.zzgk] */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    public final zzq zzj(String str) throws IllegalAccessException, NoSuchAlgorithmException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        String str2;
        Class<?> clsLoadClass;
        Object objInvoke;
        String str3;
        long jMin;
        String str4;
        long j;
        String str5;
        String str6;
        zzg();
        String strZzl = zzl();
        String strZzm = zzm();
        zza();
        String str7 = this.zzb;
        zza();
        long j2 = this.zzc;
        zza();
        Preconditions.checkNotNull(this.zzd);
        String str8 = this.zzd;
        this.zzt.zzf().zzh();
        zza();
        zzg();
        long j3 = this.zzf;
        if (j3 == 0) {
            ?? Zzv = this.zzt.zzv();
            Context contextZzau = this.zzt.zzau();
            String packageName = this.zzt.zzau().getPackageName();
            Zzv.zzg();
            Preconditions.checkNotNull(contextZzau);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = contextZzau.getPackageManager();
            MessageDigest messageDigestZzF = zzlb.zzF();
            long j4 = -1;
            if (messageDigestZzF == null) {
                Zzv.zzt.zzay().zzd().zza("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (Zzv.zzag(contextZzau, packageName)) {
                            j4 = 0;
                            Zzv = Zzv;
                        } else {
                            Signature[] signatureArr = Wrappers.packageManager(contextZzau).getPackageInfo(Zzv.zzt.zzau().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                Zzv.zzt.zzay().zzk().zza("Could not get signatures");
                                Zzv = Zzv;
                            } else {
                                long jZzp = zzlb.zzp(messageDigestZzF.digest(signatureArr[0].toByteArray()));
                                j4 = jZzp;
                                Zzv = jZzp;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Zzv.zzt.zzay().zzd().zzb("Package name not found", e);
                    }
                }
                j3 = 0;
                this.zzf = j3;
            }
            j3 = j4;
            this.zzf = j3;
        }
        long j5 = j3;
        boolean zZzJ = this.zzt.zzJ();
        boolean z = !this.zzt.zzm().zzl;
        zzg();
        if (this.zzt.zzJ()) {
            zzpj.zzc();
            if (this.zzt.zzf().zzs(null, zzdu.zzaa)) {
                this.zzt.zzay().zzj().zza("Disabled IID for tests.");
            } else {
                try {
                    clsLoadClass = this.zzt.zzau().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (clsLoadClass != null) {
                    try {
                        objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zzt.zzau());
                    } catch (Exception unused2) {
                        this.zzt.zzay().zzm().zza("Failed to obtain Firebase Analytics instance");
                    }
                    if (objInvoke == null) {
                        str2 = null;
                    } else {
                        try {
                            str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                        } catch (Exception unused3) {
                            this.zzt.zzay().zzl().zza("Failed to retrieve Firebase Instance Id");
                        }
                    }
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        zzfr zzfrVar = this.zzt;
        long jZza = zzfrVar.zzm().zzc.zza();
        if (jZza == 0) {
            str3 = strZzl;
            jMin = zzfrVar.zzc;
        } else {
            str3 = strZzl;
            jMin = Math.min(zzfrVar.zzc, jZza);
        }
        zza();
        int i = this.zzj;
        boolean zZzr = this.zzt.zzf().zzr();
        zzew zzewVarZzm = this.zzt.zzm();
        zzewVarZzm.zzg();
        boolean z2 = zzewVarZzm.zza().getBoolean("deferred_analytics_collection", false);
        zza();
        String str9 = this.zzl;
        Boolean boolValueOf = this.zzt.zzf().zzk("google_analytics_default_allow_ad_personalization_signals") == null ? null : Boolean.valueOf(!r2.booleanValue());
        long j6 = this.zzg;
        List list = this.zzh;
        String strZzh = this.zzt.zzm().zzc().zzh();
        if (this.zzi == null) {
            str4 = str9;
            j = j6;
            if (this.zzt.zzf().zzs(null, zzdu.zzap)) {
                this.zzi = this.zzt.zzv().zzC();
            } else {
                this.zzi = "";
            }
        } else {
            str4 = str9;
            j = j6;
        }
        String str10 = this.zzi;
        zzpd.zzc();
        if (this.zzt.zzf().zzs(null, zzdu.zzam)) {
            zzg();
            if (this.zzn == 0) {
                str5 = str10;
            } else {
                str5 = str10;
                long jCurrentTimeMillis = this.zzt.zzav().currentTimeMillis() - this.zzn;
                if (this.zzm != null && jCurrentTimeMillis > 86400000 && this.zzo == null) {
                    zzo();
                }
            }
            if (this.zzm == null) {
                zzo();
            }
            str6 = this.zzm;
        } else {
            str5 = str10;
            str6 = null;
        }
        return new zzq(str3, strZzm, str7, j2, str8, 74029L, j5, str, zZzJ, z, str2, 0L, jMin, i, zZzr, z2, str4, boolValueOf, j, list, (String) null, strZzh, str5, str6);
    }

    public final String zzk() {
        zza();
        return this.zzl;
    }

    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    public final String zzm() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    public final List zzn() {
        return this.zzh;
    }

    public final void zzo() {
        String str;
        zzg();
        if (this.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.zzt.zzv().zzG().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.zzt.zzay().zzc().zza("Analytics Storage consent is not granted");
            str = null;
        }
        zzef zzefVarZzc = this.zzt.zzay().zzc();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        zzefVarZzc.zza(String.format("Resetting session stitching token to %s", objArr));
        this.zzm = str;
        this.zzn = this.zzt.zzav().currentTimeMillis();
    }

    public final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzo = str;
        return z;
    }
}
