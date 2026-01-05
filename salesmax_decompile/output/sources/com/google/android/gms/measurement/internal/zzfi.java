package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import p001o.vo0;
import p001o.xma;

/* loaded from: classes3.dex */
public final class zzfi extends zzkh implements zzaf {

    @VisibleForTesting
    final Map zza;

    @VisibleForTesting
    final Map zzb;

    @VisibleForTesting
    final Map zzc;

    @VisibleForTesting
    final xma zzd;
    final com.google.android.gms.internal.measurement.zzr zze;
    private final Map zzg;
    private final Map zzh;
    private final Map zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;

    public zzfi(zzkt zzktVar) {
        super(zzktVar);
        this.zzg = new vo0();
        this.zza = new vo0();
        this.zzb = new vo0();
        this.zzc = new vo0();
        this.zzh = new vo0();
        this.zzj = new vo0();
        this.zzk = new vo0();
        this.zzl = new vo0();
        this.zzi = new vo0();
        this.zzd = new zzff(this, 20);
        this.zze = new zzfg(this);
    }

    private final com.google.android.gms.internal.measurement.zzff zzA(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzkv.zzl(com.google.android.gms.internal.measurement.zzff.zze(), bArr)).zzaC();
            this.zzt.zzay().zzj().zzc("Parsed config. version, gmp_app_id", zzffVar.zzs() ? Long.valueOf(zzffVar.zzc()) : null, zzffVar.zzr() ? zzffVar.zzh() : null);
            return zzffVar;
        } catch (com.google.android.gms.internal.measurement.zzkp e) {
            this.zzt.zzay().zzk().zzc("Unable to merge remote config. appId", zzeh.zzn(str), e);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        } catch (RuntimeException e2) {
            this.zzt.zzay().zzk().zzc("Unable to merge remote config. appId", zzeh.zzn(str), e2);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
    }

    private final void zzB(String str, com.google.android.gms.internal.measurement.zzfe zzfeVar) {
        HashSet hashSet = new HashSet();
        vo0 vo0Var = new vo0();
        vo0 vo0Var2 = new vo0();
        vo0 vo0Var3 = new vo0();
        Iterator it = zzfeVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.zzfb) it.next()).zzb());
        }
        for (int i = 0; i < zzfeVar.zza(); i++) {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) zzfeVar.zzb(i).zzby();
            if (zzfcVar.zzc().isEmpty()) {
                this.zzt.zzay().zzk().zza("EventConfig contained null event name");
            } else {
                String strZzc = zzfcVar.zzc();
                String strZzb = zzgo.zzb(zzfcVar.zzc());
                if (!TextUtils.isEmpty(strZzb)) {
                    zzfcVar.zzb(strZzb);
                    zzfeVar.zzd(i, zzfcVar);
                }
                if (zzfcVar.zzf() && zzfcVar.zzd()) {
                    vo0Var.put(strZzc, Boolean.TRUE);
                }
                if (zzfcVar.zzg() && zzfcVar.zze()) {
                    vo0Var2.put(zzfcVar.zzc(), Boolean.TRUE);
                }
                if (zzfcVar.zzh()) {
                    if (zzfcVar.zza() < 2 || zzfcVar.zza() > 65535) {
                        this.zzt.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    } else {
                        vo0Var3.put(zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, vo0Var);
        this.zzc.put(str, vo0Var2);
        this.zzi.put(str, vo0Var3);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x012a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:299), block:B:36:0x012a */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzC(String str) throws Throwable {
        SQLiteException e;
        Cursor cursorQuery;
        Cursor cursor;
        zzaj zzajVar;
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) != null) {
            return;
        }
        zzam zzamVarZzi = this.zzf.zzi();
        Preconditions.checkNotEmpty(str);
        zzamVarZzi.zzg();
        zzamVarZzi.zzW();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zzamVarZzi.zzh().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    zzamVarZzi.zzt.zzay().zzd().zzc("Error querying remote config. appId", zzeh.zzn(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    zzajVar = null;
                    if (zzajVar != null) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (cursorQuery.moveToFirst()) {
            byte[] blob = cursorQuery.getBlob(0);
            String string = cursorQuery.getString(1);
            String string2 = zzamVarZzi.zzt.zzf().zzs(null, zzdu.zzao) ? cursorQuery.getString(2) : null;
            if (cursorQuery.moveToNext()) {
                zzamVarZzi.zzt.zzay().zzd().zzb("Got multiple records for app config, expected one. appId", zzeh.zzn(str));
            }
            if (blob != null) {
                zzajVar = new zzaj(blob, string, string2);
                cursorQuery.close();
                if (zzajVar != null) {
                    com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) zzA(str, zzajVar.zza).zzby();
                    zzB(str, zzfeVar);
                    this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC()));
                    this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC());
                    zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC());
                    this.zzj.put(str, zzfeVar.zze());
                    this.zzk.put(str, zzajVar.zzb);
                    this.zzl.put(str, zzajVar.zzc);
                    return;
                }
                this.zzg.put(str, null);
                this.zzb.put(str, null);
                this.zza.put(str, null);
                this.zzc.put(str, null);
                this.zzh.put(str, null);
                this.zzj.put(str, null);
                this.zzk.put(str, null);
                this.zzl.put(str, null);
                this.zzi.put(str, null);
                return;
            }
        }
        cursorQuery.close();
        zzajVar = null;
        if (zzajVar != null) {
        }
    }

    private final void zzD(final String str, com.google.android.gms.internal.measurement.zzff zzffVar) {
        if (zzffVar.zza() == 0) {
            this.zzd.remove(str);
            return;
        }
        this.zzt.zzay().zzj().zzb("EES programs found", Integer.valueOf(zzffVar.zza()));
        com.google.android.gms.internal.measurement.zzgt zzgtVar = (com.google.android.gms.internal.measurement.zzgt) zzffVar.zzm().get(0);
        try {
            com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new zzfh(this.zza, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzfi zzfiVar = this.zza;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzfi zzfiVar2 = zzfiVar;
                            String str3 = str2;
                            zzh zzhVarZzj = zzfiVar2.zzf.zzi().zzj(str3);
                            HashMap map = new HashMap();
                            map.put("platform", CredentialsData.CREDENTIALS_TYPE_ANDROID);
                            map.put("package_name", str3);
                            zzfiVar2.zzt.zzf().zzh();
                            map.put("gmp_version", 74029L);
                            if (zzhVarZzj != null) {
                                String strZzw = zzhVarZzj.zzw();
                                if (strZzw != null) {
                                    map.put("app_version", strZzw);
                                }
                                map.put("app_version_int", Long.valueOf(zzhVarZzj.zzb()));
                                map.put("dynamite_version", Long.valueOf(zzhVarZzj.zzk()));
                            }
                            return map;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzt(this.zza.zze);
                }
            });
            zzcVar.zzc(zzgtVar);
            this.zzd.put(str, zzcVar);
            this.zzt.zzay().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgtVar.zza().zza()));
            Iterator it = zzgtVar.zza().zzd().iterator();
            while (it.hasNext()) {
                this.zzt.zzay().zzj().zzb("EES program activity", ((com.google.android.gms.internal.measurement.zzgr) it.next()).zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zzt.zzay().zzd().zzb("Failed to load EES program. appId", str);
        }
    }

    private static final Map zzE(com.google.android.gms.internal.measurement.zzff zzffVar) {
        vo0 vo0Var = new vo0();
        if (zzffVar != null) {
            for (com.google.android.gms.internal.measurement.zzfj zzfjVar : zzffVar.zzn()) {
                vo0Var.put(zzfjVar.zzb(), zzfjVar.zzc());
            }
        }
        return vo0Var;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(zzfi zzfiVar, String str) throws Throwable {
        zzfiVar.zzW();
        Preconditions.checkNotEmpty(str);
        if (!zzfiVar.zzo(str)) {
            return null;
        }
        if (!zzfiVar.zzh.containsKey(str) || zzfiVar.zzh.get(str) == null) {
            zzfiVar.zzC(str);
        } else {
            zzfiVar.zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfiVar.zzh.get(str));
        }
        return (com.google.android.gms.internal.measurement.zzc) zzfiVar.zzd.snapshot().get(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzaf
    public final String zza(String str, String str2) throws Throwable {
        zzg();
        zzC(str);
        Map map = (Map) this.zzg.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final boolean zzb() {
        return false;
    }

    public final int zzc(String str, String str2) throws Throwable {
        Integer num;
        zzg();
        zzC(str);
        Map map = (Map) this.zzi.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final com.google.android.gms.internal.measurement.zzff zze(String str) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzC(str);
        return (com.google.android.gms.internal.measurement.zzff) this.zzh.get(str);
    }

    public final String zzf(String str) {
        zzg();
        return (String) this.zzl.get(str);
    }

    public final String zzh(String str) {
        zzg();
        return (String) this.zzk.get(str);
    }

    public final String zzi(String str) throws Throwable {
        zzg();
        zzC(str);
        return (String) this.zzj.get(str);
    }

    public final Set zzk(String str) {
        zzg();
        zzC(str);
        return (Set) this.zza.get(str);
    }

    public final void zzl(String str) {
        zzg();
        this.zzk.put(str, null);
    }

    public final void zzm(String str) {
        zzg();
        this.zzh.remove(str);
    }

    public final boolean zzn(String str) {
        zzg();
        com.google.android.gms.internal.measurement.zzff zzffVarZze = zze(str);
        if (zzffVarZze == null) {
            return false;
        }
        return zzffVarZze.zzq();
    }

    public final boolean zzo(String str) {
        com.google.android.gms.internal.measurement.zzff zzffVar;
        return (TextUtils.isEmpty(str) || (zzffVar = (com.google.android.gms.internal.measurement.zzff) this.zzh.get(str)) == null || zzffVar.zza() == 0) ? false : true;
    }

    public final boolean zzp(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean zzq(String str, String str2) throws Throwable {
        Boolean bool;
        zzg();
        zzC(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzr(String str, String str2) throws Throwable {
        Boolean bool;
        zzg();
        zzC(str);
        if (zzp(str) && zzlb.zzah(str2)) {
            return true;
        }
        if (zzs(str) && zzlb.zzai(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzs(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    public final boolean zzt(String str, byte[] bArr, String str2, String str3) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) zzA(str, bArr).zzby();
        zzB(str, zzfeVar);
        zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC());
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC());
        this.zzj.put(str, zzfeVar.zze());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC()));
        this.zzf.zzi().zzB(str, new ArrayList(zzfeVar.zzf()));
        try {
            zzfeVar.zzc();
            bArr = ((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC()).zzbu();
        } catch (RuntimeException e) {
            this.zzt.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzeh.zzn(str), e);
        }
        zzam zzamVarZzi = this.zzf.zzi();
        Preconditions.checkNotEmpty(str);
        zzamVarZzi.zzg();
        zzamVarZzi.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (zzamVarZzi.zzt.zzf().zzs(null, zzdu.zzao)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (zzamVarZzi.zzh().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzamVarZzi.zzt.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzeh.zzn(str));
            }
        } catch (SQLiteException e2) {
            zzamVarZzi.zzt.zzay().zzd().zzc("Error storing remote config. appId", zzeh.zzn(str), e2);
        }
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC());
        return true;
    }

    public final boolean zzu(String str) throws Throwable {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("app_instance_id");
    }

    public final boolean zzv(String str) throws Throwable {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null) {
            return ((Set) this.zza.get(str)).contains("device_model") || ((Set) this.zza.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean zzw(String str) throws Throwable {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("enhanced_user_id");
    }

    public final boolean zzx(String str) throws Throwable {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("google_signals");
    }

    public final boolean zzy(String str) throws Throwable {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null) {
            return ((Set) this.zza.get(str)).contains("os_version") || ((Set) this.zza.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean zzz(String str) throws Throwable {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("user_id");
    }
}
