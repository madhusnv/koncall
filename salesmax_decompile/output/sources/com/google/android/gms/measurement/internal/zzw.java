package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class zzw {
    final /* synthetic */ zzaa zza;
    private com.google.android.gms.internal.measurement.zzft zzb;
    private Long zzc;
    private long zzd;

    public /* synthetic */ zzw(zzaa zzaaVar, zzv zzvVar) {
        this.zza = zzaaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d5  */
    /* JADX WARN: Type inference failed for: r8v10, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.internal.measurement.zzft zza(String str, com.google.android.gms.internal.measurement.zzft zzftVar) {
        SQLiteException e;
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        long j;
        ArrayList arrayList;
        ?? LongValue;
        String strZzh = zzftVar.zzh();
        List listZzi = zzftVar.zzi();
        this.zza.zzf.zzu();
        Long l = (Long) zzkv.zzC(zzftVar, "_eid");
        if (l != null) {
            if (strZzh.equals("_ep")) {
                Preconditions.checkNotNull(l);
                this.zza.zzf.zzu();
                strZzh = (String) zzkv.zzC(zzftVar, "_en");
                Cursor cursor = null;
                if (TextUtils.isEmpty(strZzh)) {
                    this.zza.zzt.zzay().zzh().zzb("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (this.zzb == null || this.zzc == null) {
                    zzam zzamVarZzi = this.zza.zzf.zzi();
                    zzamVarZzi.zzg();
                    zzamVarZzi.zzW();
                    try {
                        try {
                            cursorRawQuery = zzamVarZzi.zzh().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                            } catch (SQLiteException e2) {
                                e = e2;
                                zzamVarZzi.zzt.zzay().zzd().zzb("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.zza.zzt.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = LongValue;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzft) ((com.google.android.gms.internal.measurement.zzfs) zzkv.zzl(com.google.android.gms.internal.measurement.zzft.zze(), cursorRawQuery.getBlob(0))).zzaC(), Long.valueOf(cursorRawQuery.getLong(1)));
                            cursorRawQuery.close();
                        } catch (IOException e4) {
                            zzamVarZzi.zzt.zzay().zzd().zzd("Failed to merge main event. appId, eventId", zzeh.zzn(str), l, e4);
                        }
                        if (pairCreate != null || (obj = pairCreate.first) == null) {
                            this.zza.zzt.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l);
                            return null;
                        }
                        this.zzb = (com.google.android.gms.internal.measurement.zzft) obj;
                        this.zzd = ((Long) pairCreate.second).longValue();
                        this.zza.zzf.zzu();
                        this.zzc = (Long) zzkv.zzC(this.zzb, "_eid");
                        j = this.zzd - 1;
                        this.zzd = j;
                        if (j > 0) {
                            zzam zzamVarZzi2 = this.zza.zzf.zzi();
                            zzamVarZzi2.zzg();
                            zzamVarZzi2.zzt.zzay().zzj().zzb("Clearing complex main event info. appId", str);
                            try {
                                zzamVarZzi2.zzh().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                            } catch (SQLiteException e5) {
                                zzamVarZzi2.zzt.zzay().zzd().zzb("Error clearing complex main event", e5);
                            }
                        } else {
                            this.zza.zzf.zzi().zzJ(str, l, this.zzd, this.zzb);
                        }
                        arrayList = new ArrayList();
                        for (com.google.android.gms.internal.measurement.zzfx zzfxVar : this.zzb.zzi()) {
                            this.zza.zzf.zzu();
                            if (zzkv.zzB(zzftVar, zzfxVar.zzg()) == null) {
                                arrayList.add(zzfxVar);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            arrayList.addAll(listZzi);
                            listZzi = arrayList;
                        } else {
                            this.zza.zzt.zzay().zzh().zzb("No unique parameters in main event. eventName", strZzh);
                        }
                    } else {
                        zzamVarZzi.zzt.zzay().zzj().zza("Main event not found");
                    }
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    this.zza.zzt.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l);
                    return null;
                }
                LongValue = l.longValue();
                if (LongValue != this.zzc.longValue()) {
                }
                j = this.zzd - 1;
                this.zzd = j;
                if (j > 0) {
                }
                arrayList = new ArrayList();
                while (r2.hasNext()) {
                }
                if (arrayList.isEmpty()) {
                }
            } else {
                this.zzc = l;
                this.zzb = zzftVar;
                this.zza.zzf.zzu();
                Object objZzC = zzkv.zzC(zzftVar, "_epc");
                long jLongValue = ((Long) (objZzC != null ? objZzC : 0L)).longValue();
                this.zzd = jLongValue;
                if (jLongValue <= 0) {
                    this.zza.zzt.zzay().zzh().zzb("Complex event with zero extra param count. eventName", strZzh);
                } else {
                    this.zza.zzf.zzi().zzJ(str, (Long) Preconditions.checkNotNull(l), this.zzd, zzftVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzftVar.zzby();
        zzfsVar.zzi(strZzh);
        zzfsVar.zzg();
        zzfsVar.zzd(listZzi);
        return (com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaC();
    }
}
