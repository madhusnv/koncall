package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznt;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class zzam extends zzkh {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzal zzj;
    private final zzkd zzk;

    public zzam(zzkt zzktVar) {
        super(zzktVar);
        this.zzk = new zzkd(this.zzt.zzav());
        this.zzt.zzf();
        this.zzj = new zzal(this, this.zzt.zzau(), "google_app_measurement.db");
    }

    public static final void zzV(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = zzh().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                this.zzt.zzay().zzd().zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zzaa(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzh().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j;
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                this.zzt.zzay().zzd().zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzd("Error deleting user property. appId", zzeh.zzn(str), this.zzt.zzj().zzf(str2), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0345, code lost:
    
        if (zzh().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0347, code lost:
    
        r23.zzt.zzay().zzd().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzeh.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x035b, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x035f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0360, code lost:
    
        r23.zzt.zzay().zzd().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzeh.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0373, code lost:
    
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        r0 = zzh();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03aa, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0178, code lost:
    
        r11 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0184, code lost:
    
        if (r11.hasNext() == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0190, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzet) r11.next()).zzj() != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0192, code lost:
    
        r23.zzt.zzay().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzeh.zzn(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ab, code lost:
    
        r11 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c1, code lost:
    
        if (r11.hasNext() == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c3, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.zzek) r11.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01dd, code lost:
    
        if (r12.zzg().isEmpty() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01df, code lost:
    
        r0 = r23.zzt.zzay().zzk();
        r9 = com.google.android.gms.measurement.internal.zzeh.zzn(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f7, code lost:
    
        if (r12.zzp() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f9, code lost:
    
        r20 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0204, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0206, code lost:
    
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0211, code lost:
    
        r3 = r12.zzbu();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x022a, code lost:
    
        if (r12.zzp() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x022c, code lost:
    
        r9 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0235, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0236, code lost:
    
        r7.put("filter_id", r9);
        r7.put("event_name", r12.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0246, code lost:
    
        if (r12.zzq() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0248, code lost:
    
        r9 = java.lang.Boolean.valueOf(r12.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0251, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0252, code lost:
    
        r7.put("session_scoped", r9);
        r7.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0266, code lost:
    
        if (zzh().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0268, code lost:
    
        r23.zzt.zzay().zzd().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzeh.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x027b, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0281, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0282, code lost:
    
        r23.zzt.zzay().zzd().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzeh.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0297, code lost:
    
        r21 = r7;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02a5, code lost:
    
        if (r0.hasNext() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02a7, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzet) r0.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02c1, code lost:
    
        if (r3.zze().isEmpty() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02c3, code lost:
    
        r0 = r23.zzt.zzay().zzk();
        r8 = com.google.android.gms.measurement.internal.zzeh.zzn(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02db, code lost:
    
        if (r3.zzj() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02dd, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02e6, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02e7, code lost:
    
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02f0, code lost:
    
        r7 = r3.zzbu();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0307, code lost:
    
        if (r3.zzj() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0309, code lost:
    
        r12 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0312, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0313, code lost:
    
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0325, code lost:
    
        if (r3.zzk() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0327, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0330, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0331, code lost:
    
        r11.put("session_scoped", r0);
        r11.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzB(String str, List list) {
        boolean z;
        String str2 = "app_id=? and audience_id=?";
        Preconditions.checkNotNull(list);
        int i = 0;
        while (i < list.size()) {
            com.google.android.gms.internal.measurement.zzeh zzehVar = (com.google.android.gms.internal.measurement.zzeh) ((com.google.android.gms.internal.measurement.zzei) list.get(i)).zzby();
            if (zzehVar.zza() != 0) {
                int i2 = 0;
                while (i2 < zzehVar.zza()) {
                    com.google.android.gms.internal.measurement.zzej zzejVar = (com.google.android.gms.internal.measurement.zzej) zzehVar.zze(i2).zzby();
                    com.google.android.gms.internal.measurement.zzej zzejVar2 = (com.google.android.gms.internal.measurement.zzej) zzejVar.clone();
                    String strZzb = zzgo.zzb(zzejVar.zze());
                    if (strZzb != null) {
                        zzejVar2.zzb(strZzb);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < zzejVar.zza()) {
                        com.google.android.gms.internal.measurement.zzem zzemVarZzd = zzejVar.zzd(i3);
                        com.google.android.gms.internal.measurement.zzej zzejVar3 = zzejVar;
                        String str3 = str2;
                        String strZzb2 = zzid.zzb(zzemVarZzd.zze(), zzgp.zza, zzgp.zzb);
                        if (strZzb2 != null) {
                            com.google.android.gms.internal.measurement.zzel zzelVar = (com.google.android.gms.internal.measurement.zzel) zzemVarZzd.zzby();
                            zzelVar.zza(strZzb2);
                            zzejVar2.zzc(i3, (com.google.android.gms.internal.measurement.zzem) zzelVar.zzaC());
                            z = true;
                        }
                        i3++;
                        zzejVar = zzejVar3;
                        str2 = str3;
                    }
                    String str4 = str2;
                    if (z) {
                        zzehVar.zzc(i2, zzejVar2);
                        list.set(i, (com.google.android.gms.internal.measurement.zzei) zzehVar.zzaC());
                    }
                    i2++;
                    str2 = str4;
                }
            }
            String str5 = str2;
            if (zzehVar.zzb() != 0) {
                for (int i4 = 0; i4 < zzehVar.zzb(); i4++) {
                    com.google.android.gms.internal.measurement.zzet zzetVarZzf = zzehVar.zzf(i4);
                    String strZzb3 = zzid.zzb(zzetVarZzf.zze(), zzgq.zza, zzgq.zzb);
                    if (strZzb3 != null) {
                        com.google.android.gms.internal.measurement.zzes zzesVar = (com.google.android.gms.internal.measurement.zzes) zzetVarZzf.zzby();
                        zzesVar.zza(strZzb3);
                        zzehVar.zzd(i4, zzesVar);
                        list.set(i, (com.google.android.gms.internal.measurement.zzei) zzehVar.zzaC());
                    }
                }
            }
            i++;
            str2 = str5;
        }
        String str6 = str2;
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase sQLiteDatabaseZzh = zzh();
        sQLiteDatabaseZzh.beginTransaction();
        try {
            zzW();
            zzg();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseZzh2 = zzh();
            sQLiteDatabaseZzh2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseZzh2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzei zzeiVar = (com.google.android.gms.internal.measurement.zzei) it.next();
                zzW();
                zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzeiVar);
                if (zzeiVar.zzk()) {
                    int iZza = zzeiVar.zza();
                    Iterator it2 = zzeiVar.zzg().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzek) it2.next()).zzp()) {
                                this.zzt.zzay().zzk().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzeh.zzn(str), Integer.valueOf(iZza));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    this.zzt.zzay().zzk().zzb("Audience with no ID. appId", zzeh.zzn(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                com.google.android.gms.internal.measurement.zzei zzeiVar2 = (com.google.android.gms.internal.measurement.zzei) it3.next();
                arrayList.add(zzeiVar2.zzk() ? Integer.valueOf(zzeiVar2.zza()) : null);
            }
            Preconditions.checkNotEmpty(str);
            zzW();
            zzg();
            SQLiteDatabase sQLiteDatabaseZzh3 = zzh();
            try {
                long jZzZ = zzZ("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, this.zzt.zzf().zze(str, zzdu.zzE)));
                if (jZzZ > iMax) {
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList.size()) {
                            String strJoin = TextUtils.join(",", arrayList2);
                            StringBuilder sb = new StringBuilder();
                            sb.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb.append("(" + strJoin + ")");
                            sb.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseZzh3.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i5);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i5++;
                    }
                }
            } catch (SQLiteException e) {
                this.zzt.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(str), e);
            }
            sQLiteDatabaseZzh.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseZzh.endTransaction();
        }
    }

    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    public final void zzD(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzW();
        String strZzt = zzhVar.zzt();
        Preconditions.checkNotNull(strZzt);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strZzt);
        contentValues.put("app_instance_id", zzhVar.zzu());
        contentValues.put("gmp_app_id", zzhVar.zzy());
        contentValues.put("resettable_device_id_hash", zzhVar.zzA());
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("app_version", zzhVar.zzw());
        contentValues.put("app_store", zzhVar.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzai()));
        contentValues.put("day", Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzb()));
        contentValues.put("firebase_instance_id", zzhVar.zzx());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzh()));
        contentValues.put("health_monitor_sample", zzhVar.zzz());
        zzhVar.zza();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzah()));
        contentValues.put("admob_app_id", zzhVar.zzr());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzk()));
        contentValues.put("session_stitching_token", zzhVar.zzB());
        List listZzC = zzhVar.zzC();
        if (listZzC != null) {
            if (listZzC.isEmpty()) {
                this.zzt.zzay().zzk().zzb("Safelisted events should not be an empty list. appId", strZzt);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listZzC));
            }
        }
        zznt.zzc();
        if (this.zzt.zzf().zzs(null, zzdu.zzai) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            if (sQLiteDatabaseZzh.update("apps", contentValues, "app_id = ?", new String[]{strZzt}) == 0 && sQLiteDatabaseZzh.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzt.zzay().zzd().zzb("Failed to insert/update app (got -1). appId", zzeh.zzn(strZzt));
            }
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzc("Error storing app. appId", zzeh.zzn(strZzt), e);
        }
    }

    public final void zzE(zzas zzasVar) {
        Preconditions.checkNotNull(zzasVar);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzasVar.zza);
        contentValues.put("name", zzasVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzasVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzasVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzasVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzasVar.zzg));
        contentValues.put("last_bundled_day", zzasVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzasVar.zzi);
        contentValues.put("last_sampling_rate", zzasVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzasVar.zze));
        Boolean bool = zzasVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzh().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzt.zzay().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzeh.zzn(zzasVar.zza));
            }
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzc("Error storing event aggregates. appId", zzeh.zzn(zzasVar.zza), e);
        }
    }

    public final boolean zzF() {
        return zzZ("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzG() {
        return zzZ("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzH() {
        return zzZ("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    @VisibleForTesting
    public final boolean zzI() {
        Context contextZzau = this.zzt.zzau();
        this.zzt.zzf();
        return contextZzau.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l, long j, com.google.android.gms.internal.measurement.zzft zzftVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzftVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] bArrZzbu = zzftVar.zzbu();
        this.zzt.zzay().zzj().zzc("Saving complex main event, appId, data size", this.zzt.zzj().zzd(str), Integer.valueOf(bArrZzbu.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrZzbu);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzt.zzay().zzd().zzb("Failed to insert complex main event (got -1). appId", zzeh.zzn(str));
            return false;
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzc("Error storing complex main event. appId", zzeh.zzn(str), e);
            return false;
        }
    }

    public final boolean zzK(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zzW();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzacVar.zzc.zzb) == null) {
            long jZzZ = zzZ("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzt.zzf();
            if (jZzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.zzb);
        contentValues.put("name", zzacVar.zzc.zzb);
        zzV(contentValues, "value", Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzacVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzacVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzacVar.zzh));
        contentValues.put("timed_out_event", this.zzt.zzv().zzan(zzacVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        contentValues.put("triggered_event", this.zzt.zzv().zzan(zzacVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        contentValues.put("expired_event", this.zzt.zzv().zzan(zzacVar.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzt.zzay().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzeh.zzn(str));
            return true;
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzc("Error storing conditional user property", zzeh.zzn(str), e);
            return true;
        }
    }

    public final boolean zzL(zzky zzkyVar) {
        Preconditions.checkNotNull(zzkyVar);
        zzg();
        zzW();
        if (zzp(zzkyVar.zza, zzkyVar.zzc) == null) {
            if (zzlb.zzai(zzkyVar.zzc)) {
                if (zzZ("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzkyVar.zza}) >= this.zzt.zzf().zzf(zzkyVar.zza, zzdu.zzF, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzkyVar.zzc)) {
                long jZzZ = zzZ("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzkyVar.zza, zzkyVar.zzb});
                this.zzt.zzf();
                if (jZzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzkyVar.zza);
        contentValues.put("origin", zzkyVar.zzb);
        contentValues.put("name", zzkyVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzkyVar.zzd));
        zzV(contentValues, "value", zzkyVar.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzt.zzay().zzd().zzb("Failed to insert/update user property (got -1). appId", zzeh.zzn(zzkyVar.zza));
            return true;
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzc("Error storing user property. appId", zzeh.zzn(zzkyVar.zza), e);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x022a: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:555), block:B:99:0x022a */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void zzU(String str, long j, long j2, zzkq zzkqVar) throws Throwable {
        ?? IsEmpty;
        Cursor cursor;
        Cursor cursorRawQuery;
        String string;
        String str2;
        String[] strArr;
        Preconditions.checkNotNull(zzkqVar);
        zzg();
        zzW();
        Cursor cursor2 = null;
        string = null;
        string = null;
        String string2 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZzh = zzh();
                IsEmpty = TextUtils.isEmpty(null);
                try {
                    if (IsEmpty != 0) {
                        cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j2 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)});
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string2 = cursorRawQuery.getString(0);
                            string = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                        }
                    } else {
                        cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j2 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j2 != -1 ? new String[]{null, String.valueOf(j2)} : new String[]{null});
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                        }
                    }
                    Cursor cursor3 = cursorRawQuery;
                    String str3 = string;
                    try {
                        String str4 = str3;
                        Cursor cursorQuery = sQLiteDatabaseZzh.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, str3}, null, null, "rowid", "2");
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                this.zzt.zzay().zzd().zzb("Raw event metadata record is missing. appId", zzeh.zzn(string2));
                                cursorQuery.close();
                                return;
                            }
                            try {
                                try {
                                    com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((com.google.android.gms.internal.measurement.zzgc) zzkv.zzl(com.google.android.gms.internal.measurement.zzgd.zzt(), cursorQuery.getBlob(0))).zzaC();
                                    if (cursorQuery.moveToNext()) {
                                        this.zzt.zzay().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzeh.zzn(string2));
                                    }
                                    cursorQuery.close();
                                    Preconditions.checkNotNull(zzgdVar);
                                    zzkqVar.zza = zzgdVar;
                                    if (j2 != -1) {
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{string2, str4, String.valueOf(j2)};
                                    } else {
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{string2, str4};
                                    }
                                    Cursor cursorQuery2 = sQLiteDatabaseZzh.query("raw_events", new String[]{"rowid", "name", "timestamp", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, str2, strArr, null, null, "rowid", null);
                                    if (!cursorQuery2.moveToFirst()) {
                                        this.zzt.zzay().zzk().zzb("Raw event data disappeared while in transaction. appId", zzeh.zzn(string2));
                                        cursorQuery2.close();
                                        return;
                                    }
                                    do {
                                        long j3 = cursorQuery2.getLong(0);
                                        try {
                                            com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzkv.zzl(com.google.android.gms.internal.measurement.zzft.zze(), cursorQuery2.getBlob(3));
                                            zzfsVar.zzi(cursorQuery2.getString(1));
                                            zzfsVar.zzm(cursorQuery2.getLong(2));
                                            if (!zzkqVar.zza(j3, (com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaC())) {
                                                cursorQuery2.close();
                                                return;
                                            }
                                        } catch (IOException e) {
                                            this.zzt.zzay().zzd().zzc("Data loss. Failed to merge raw event. appId", zzeh.zzn(string2), e);
                                        }
                                    } while (cursorQuery2.moveToNext());
                                    cursorQuery2.close();
                                } catch (IOException e2) {
                                    this.zzt.zzay().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzeh.zzn(string2), e2);
                                    cursorQuery.close();
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                IsEmpty = str4;
                                this.zzt.zzay().zzd().zzc("Data loss. Error selecting raw event. appId", zzeh.zzn(string2), e);
                                if (IsEmpty != 0) {
                                    IsEmpty.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = str4;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            str4 = cursorQuery;
                        } catch (Throwable th2) {
                            th = th2;
                            str4 = cursorQuery;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        IsEmpty = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
            }
        } catch (SQLiteException e7) {
            e = e7;
            IsEmpty = 0;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzd("Error deleting conditional property", zzeh.zzn(str), this.zzt.zzj().zzf(str2), e);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final boolean zzb() {
        return false;
    }

    @VisibleForTesting
    public final long zzc(String str, String str2) {
        SQLiteException e;
        long jZzaa;
        ContentValues contentValues;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase sQLiteDatabaseZzh = zzh();
        sQLiteDatabaseZzh.beginTransaction();
        try {
            try {
                jZzaa = zzaa("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jZzaa == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseZzh.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.zzt.zzay().zzd().zzc("Failed to insert column (got -1). appId", zzeh.zzn(str), "first_open_count");
                        return -1L;
                    }
                    jZzaa = 0;
                }
            } finally {
                sQLiteDatabaseZzh.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
            jZzaa = 0;
        }
        try {
            contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("first_open_count", Long.valueOf(1 + jZzaa));
        } catch (SQLiteException e3) {
            e = e3;
            this.zzt.zzay().zzd().zzd("Error inserting column. appId", zzeh.zzn(str), "first_open_count", e);
            return jZzaa;
        }
        if (sQLiteDatabaseZzh.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
            this.zzt.zzay().zzd().zzc("Failed to update column (got 0). appId", zzeh.zzn(str), "first_open_count");
            return -1L;
        }
        sQLiteDatabaseZzh.setTransactionSuccessful();
        return jZzaa;
    }

    public final long zzd() {
        return zzaa("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long zze() {
        return zzaa("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaa("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @VisibleForTesting
    public final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e) {
            this.zzt.zzay().zzk().zzb("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d5: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:214), block:B:45:0x00d5 */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zzi(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = zzh().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        this.zzt.zzay().zzj().zza("Default event parameters not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) ((com.google.android.gms.internal.measurement.zzfs) zzkv.zzl(com.google.android.gms.internal.measurement.zzft.zze(), cursorRawQuery.getBlob(0))).zzaC();
                        this.zzf.zzu();
                        List<com.google.android.gms.internal.measurement.zzfx> listZzi = zzftVar.zzi();
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfx zzfxVar : listZzi) {
                            String strZzg = zzfxVar.zzg();
                            if (zzfxVar.zzu()) {
                                bundle.putDouble(strZzg, zzfxVar.zza());
                            } else if (zzfxVar.zzv()) {
                                bundle.putFloat(strZzg, zzfxVar.zzb());
                            } else if (zzfxVar.zzy()) {
                                bundle.putString(strZzg, zzfxVar.zzh());
                            } else if (zzfxVar.zzw()) {
                                bundle.putLong(strZzg, zzfxVar.zzd());
                            }
                        }
                        cursorRawQuery.close();
                        return bundle;
                    } catch (IOException e) {
                        this.zzt.zzay().zzd().zzc("Failed to retrieve default event parameters. appId", zzeh.zzn(str), e);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzt.zzay().zzd().zzb("Error selecting default event parameters", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
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
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0273: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:628), block:B:52:0x0273 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzh zzj(String str) {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zzh().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    zzh zzhVar = new zzh(this.zzf.zzq(), str);
                    zzhVar.zzH(cursorQuery.getString(0));
                    zzhVar.zzW(cursorQuery.getString(1));
                    zzhVar.zzae(cursorQuery.getString(2));
                    zzhVar.zzaa(cursorQuery.getLong(3));
                    zzhVar.zzab(cursorQuery.getLong(4));
                    zzhVar.zzZ(cursorQuery.getLong(5));
                    zzhVar.zzJ(cursorQuery.getString(6));
                    zzhVar.zzI(cursorQuery.getString(7));
                    zzhVar.zzX(cursorQuery.getLong(8));
                    zzhVar.zzS(cursorQuery.getLong(9));
                    zzhVar.zzac(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    zzhVar.zzR(cursorQuery.getLong(11));
                    zzhVar.zzP(cursorQuery.getLong(12));
                    zzhVar.zzO(cursorQuery.getLong(13));
                    zzhVar.zzM(cursorQuery.getLong(14));
                    zzhVar.zzL(cursorQuery.getLong(15));
                    zzhVar.zzU(cursorQuery.getLong(16));
                    zzhVar.zzK(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    zzhVar.zzV(cursorQuery.getString(18));
                    zzhVar.zzN(cursorQuery.getLong(19));
                    zzhVar.zzQ(cursorQuery.getLong(20));
                    zzhVar.zzY(cursorQuery.getString(21));
                    zzhVar.zzG(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                    zzhVar.zzF(cursorQuery.getString(24));
                    zzhVar.zzT(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        zzhVar.zzaf(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    zzpd.zzc();
                    if (this.zzt.zzf().zzs(null, zzdu.zzal) && this.zzt.zzf().zzs(str, zzdu.zzan)) {
                        zzhVar.zzag(cursorQuery.getString(28));
                    }
                    zzhVar.zzD();
                    if (cursorQuery.moveToNext()) {
                        this.zzt.zzay().zzd().zzb("Got multiple records for app, expected one. appId", zzeh.zzn(str));
                    }
                    cursorQuery.close();
                    return zzhVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzay().zzd().zzc("Error querying app. appId", zzeh.zzn(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0151: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:338), block:B:31:0x0151 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzac zzk(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zzh().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object objZzq = zzq(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    zzkv zzkvVarZzu = this.zzf.zzu();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzac zzacVar = new zzac(str, str3, new zzkw(str2, cursorQuery.getLong(8), objZzq, str3), cursorQuery.getLong(6), z, string2, (zzaw) zzkvVarZzu.zzh(blob, creator), j, (zzaw) this.zzf.zzu().zzh(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzaw) this.zzf.zzu().zzh(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        this.zzt.zzay().zzd().zzc("Got multiple records for conditional property, expected one", zzeh.zzn(str), this.zzt.zzj().zzf(str2));
                    }
                    cursorQuery.close();
                    return zzacVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzay().zzd().zzd("Error querying conditional property", zzeh.zzn(str), this.zzt.zzj().zzf(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final zzak zzl(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return zzm(j, str, 1L, false, false, z3, false, z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzak zzm(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) throws Throwable {
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzak zzakVar = new zzak();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            Cursor cursorQuery = sQLiteDatabaseZzh.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    this.zzt.zzay().zzk().zzb("Not updating daily counts, app is not known. appId", zzeh.zzn(str));
                    cursorQuery.close();
                    return zzakVar;
                }
                if (cursorQuery.getLong(0) == j) {
                    zzakVar.zzb = cursorQuery.getLong(1);
                    zzakVar.zza = cursorQuery.getLong(2);
                    zzakVar.zzc = cursorQuery.getLong(3);
                    zzakVar.zzd = cursorQuery.getLong(4);
                    zzakVar.zze = cursorQuery.getLong(5);
                }
                if (z) {
                    zzakVar.zzb += j2;
                }
                if (z2) {
                    zzakVar.zza += j2;
                }
                if (z3) {
                    zzakVar.zzc += j2;
                }
                if (z4) {
                    zzakVar.zzd += j2;
                }
                if (z5) {
                    zzakVar.zze += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(zzakVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzakVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzakVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzakVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzakVar.zze));
                sQLiteDatabaseZzh.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return zzakVar;
            } catch (SQLiteException e) {
                e = e;
                cursor = cursorQuery;
                try {
                    this.zzt.zzay().zzd().zzc("Error updating daily counts. appId", zzeh.zzn(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzakVar;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzas zzn(String str, String str2) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor = null;
        try {
            cursorQuery = zzh().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j = cursorQuery.getLong(0);
                    long j2 = cursorQuery.getLong(1);
                    long j3 = cursorQuery.getLong(2);
                    long j4 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                    Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                    Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
                    zzas zzasVar = new zzas(str, str2, j, j2, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j3, j4, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursorQuery.moveToNext()) {
                        this.zzt.zzay().zzd().zzb("Got multiple records for event aggregates, expected one. appId", zzeh.zzn(str));
                    }
                    cursorQuery.close();
                    return zzasVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzay().zzd().zzd("Error querying events. appId", zzeh.zzn(str), this.zzt.zzj().zzd(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00a1: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:162), block:B:28:0x00a1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzky zzp(String str, String str2) {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zzh().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j = cursorQuery.getLong(0);
                    Object objZzq = zzq(cursorQuery, 1);
                    if (objZzq == null) {
                        cursorQuery.close();
                        return null;
                    }
                    zzky zzkyVar = new zzky(str, cursorQuery.getString(2), str2, j, objZzq);
                    if (cursorQuery.moveToNext()) {
                        this.zzt.zzay().zzd().zzb("Got multiple records for user property, expected one. appId", zzeh.zzn(str));
                    }
                    cursorQuery.close();
                    return zzkyVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzay().zzd().zzd("Error querying user property. appId", zzeh.zzn(str), this.zzt.zzj().zzf(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    @VisibleForTesting
    public final Object zzq(Cursor cursor, int i) {
        int type2 = cursor.getType(i);
        if (type2 == 0) {
            this.zzt.zzay().zzd().zza("Loaded invalid null value from database");
            return null;
        }
        if (type2 == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type2 == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type2 == 3) {
            return cursor.getString(i);
        }
        if (type2 != 4) {
            this.zzt.zzay().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type2));
            return null;
        }
        this.zzt.zzay().zzd().zza("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzr() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseZzh = zzh();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzt.zzay().zzd().zzb("Database error getting next bundle app id", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                r1 = sQLiteDatabaseZzh;
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
            }
            throw th;
        }
    }

    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return zzt(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x008f, code lost:
    
        r3 = r41.zzt.zzay().zzd();
        r41.zzt.zzf();
        r3.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzt(String str, String[] strArr) throws Throwable {
        Cursor cursor;
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            String[] strArr2 = {"app_id", "origin", "name", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
            this.zzt.zzf();
            int i = 4;
            Cursor cursorQuery = sQLiteDatabaseZzh.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (true) {
                    int size = arrayList.size();
                    this.zzt.zzf();
                    if (size >= 1000) {
                        break;
                    }
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objZzq = zzq(cursorQuery, 3);
                    boolean z = cursorQuery.getInt(i) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j = cursorQuery.getLong(6);
                    zzkv zzkvVarZzu = this.zzf.zzu();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    arrayList.add(new zzac(string, string2, new zzkw(string3, cursorQuery.getLong(10), objZzq, string2), cursorQuery.getLong(8), z, string4, (zzaw) zzkvVarZzu.zzh(blob, creator), j, (zzaw) this.zzf.zzu().zzh(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzaw) this.zzf.zzu().zzh(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    i = 4;
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                e = e;
                cursor = cursorQuery;
                try {
                    this.zzt.zzay().zzd().zzb("Error querying conditional user property value", e);
                    List listEmptyList = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return listEmptyList;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final List zzu(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                this.zzt.zzf();
                cursorQuery = zzh().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = cursorQuery.getLong(2);
                    Object objZzq = zzq(cursorQuery, 3);
                    if (objZzq == null) {
                        this.zzt.zzay().zzd().zzb("Read invalid user property value, ignoring it. appId", zzeh.zzn(str));
                    } else {
                        arrayList.add(new zzky(str, str2, string, j, objZzq));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                this.zzt.zzay().zzd().zzc("Error querying user properties. appId", zzeh.zzn(str), e);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b6, code lost:
    
        r0 = r20.zzt.zzay().zzd();
        r20.zzt.zzf();
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzv(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String string;
        ArrayList arrayList;
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList2 = new ArrayList();
        try {
            try {
                arrayList = new ArrayList(3);
            } catch (SQLiteException e) {
                e = e;
            }
            try {
                arrayList.add(str);
                StringBuilder sb = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    string = str2;
                } else {
                    string = str2;
                    try {
                        arrayList.add(string);
                        sb.append(" and origin=?");
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor = null;
                        try {
                            this.zzt.zzay().zzd().zzd("(2)Error querying user properties", zzeh.zzn(str), string, e);
                            List listEmptyList = Collections.emptyList();
                            if (cursor != null) {
                                cursor.close();
                            }
                            return listEmptyList;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    arrayList.add(str3 + "*");
                    sb.append(" and name glob ?");
                }
                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                String string2 = sb.toString();
                this.zzt.zzf();
                cursorQuery = zzh().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string2, strArr, null, null, "rowid", "1001");
            } catch (SQLiteException e3) {
                e = e3;
                string = str2;
                cursor = null;
                this.zzt.zzay().zzd().zzd("(2)Error querying user properties", zzeh.zzn(str), string, e);
                List listEmptyList2 = Collections.emptyList();
                if (cursor != null) {
                }
                return listEmptyList2;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        try {
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return arrayList2;
            }
            while (true) {
                int size = arrayList2.size();
                this.zzt.zzf();
                if (size < 1000) {
                    String string3 = cursorQuery.getString(0);
                    long j = cursorQuery.getLong(1);
                    Object objZzq = zzq(cursorQuery, 2);
                    string = cursorQuery.getString(3);
                    if (objZzq == null) {
                        this.zzt.zzay().zzd().zzd("(2)Read invalid user property value, ignoring it", zzeh.zzn(str), string, str3);
                    } else {
                        arrayList2.add(new zzky(str, string, string3, j, objZzq));
                    }
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                } else {
                    break;
                }
            }
            cursorQuery.close();
            return arrayList2;
        } catch (SQLiteException e4) {
            e = e4;
            cursor = cursorQuery;
            this.zzt.zzay().zzd().zzd("(2)Error querying user properties", zzeh.zzn(str), string, e);
            List listEmptyList22 = Collections.emptyList();
            if (cursor != null) {
            }
            return listEmptyList22;
        } catch (Throwable th3) {
            th = th3;
            cursor = cursorQuery;
            if (cursor != null) {
            }
            throw th;
        }
    }

    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    @VisibleForTesting
    public final void zzy(List list) throws SQLException {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzI()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzZ("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.zzt.zzay().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                zzh().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.zzt.zzay().zzd().zzb("Error incrementing retry count. error", e);
            }
        }
    }

    public final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long jZza = this.zzf.zzs().zza.zza();
            long jElapsedRealtime = this.zzt.zzav().elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            this.zzt.zzf();
            if (jAbs > ((Long) zzdu.zzx.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(jElapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase sQLiteDatabaseZzh = zzh();
                    String strValueOf = String.valueOf(this.zzt.zzav().currentTimeMillis());
                    this.zzt.zzf();
                    int iDelete = sQLiteDatabaseZzh.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(zzag.zzA())});
                    if (iDelete > 0) {
                        this.zzt.zzay().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }
}
