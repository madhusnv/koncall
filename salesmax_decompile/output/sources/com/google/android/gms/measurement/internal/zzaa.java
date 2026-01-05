package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zznz;
import com.google.android.gms.internal.measurement.zzoc;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.vo0;

/* loaded from: classes3.dex */
final class zzaa extends zzkh {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzaa(zzkt zzktVar) {
        super(zzktVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i, int i2) {
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzuVar == null) {
            return false;
        }
        return zzuVar.zze.get(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:397:0x0a31, code lost:
    
        r7 = r63.zzt.zzay().zzk();
        r9 = com.google.android.gms.measurement.internal.zzeh.zzn(r63.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0a45, code lost:
    
        if (r8.zzj() == false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0a47, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0a50, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0a51, code lost:
    
        r7.zzc("Invalid property filter ID. appId, id", r9, java.lang.String.valueOf(r8));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0915 A[PHI: r0 r9
      0x0915: PHI (r0v147 java.util.Map) = (r0v149 java.util.Map), (r0v156 java.util.Map) binds: [B:363:0x093c, B:349:0x0911] A[DONT_GENERATE, DONT_INLINE]
      0x0915: PHI (r9v30 android.database.Cursor) = (r9v31 android.database.Cursor), (r9v34 android.database.Cursor) binds: [B:363:0x093c, B:349:0x0911] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b5 A[Catch: SQLiteException -> 0x021c, all -> 0x0b17, TRY_LEAVE, TryCatch #8 {SQLiteException -> 0x021c, blocks: (B:58:0x01af, B:60:0x01b5, B:62:0x01c1, B:63:0x01c6, B:64:0x01d0, B:65:0x01e0, B:67:0x01ed), top: B:440:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c1 A[Catch: SQLiteException -> 0x021c, all -> 0x0b17, TRY_ENTER, TryCatch #8 {SQLiteException -> 0x021c, blocks: (B:58:0x01af, B:60:0x01b5, B:62:0x01c1, B:63:0x01c6, B:64:0x01d0, B:65:0x01e0, B:67:0x01ed), top: B:440:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0251  */
    /* JADX WARN: Type inference failed for: r0v199, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r4v29, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v63, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zza(String str, List list, List list2, Long l, Long l2) throws Throwable {
        int i;
        int i2;
        boolean z;
        Cursor cursor;
        Map map;
        zzam zzamVarZzi;
        String str2;
        Cursor cursor2;
        String str3;
        Cursor cursorQuery;
        Map map2;
        String str4;
        Map map3;
        Iterator it;
        String str5;
        String str6;
        String str7;
        List<com.google.android.gms.internal.measurement.zzek> list3;
        String str8;
        Cursor cursorRawQuery;
        Map map4;
        Iterator it2;
        String str9;
        zzas zzasVar;
        zzw zzwVar;
        Iterator it3;
        zzas zzasVar2;
        String str10;
        Iterator it4;
        Cursor cursor3;
        List arrayList;
        Iterator it5;
        Iterator it6;
        Cursor cursor4;
        Cursor cursorQuery2;
        vo0 vo0Var;
        Cursor cursorQuery3;
        List arrayList2;
        String str11 = "current_results";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new vo0();
        this.zzd = l;
        this.zze = l2;
        Iterator it7 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it7.hasNext()) {
                z = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzft) it7.next()).zzh())) {
                z = true;
                break;
            }
        }
        zznz.zzc();
        boolean zZzs = this.zzt.zzf().zzs(this.zza, zzdu.zzW);
        zznz.zzc();
        boolean zZzs2 = this.zzt.zzf().zzs(this.zza, zzdu.zzV);
        if (z) {
            zzam zzamVarZzi2 = this.zzf.zzi();
            String str12 = this.zza;
            zzamVarZzi2.zzW();
            zzamVarZzi2.zzg();
            Preconditions.checkNotEmpty(str12);
            ?? contentValues = new ContentValues();
            int i3 = 0;
            contentValues.put("current_session_count", 0);
            try {
                i3 = new String[]{str12};
                zzamVarZzi2.zzh().update("events", contentValues, "app_id = ?", i3);
                cursor = i3;
            } catch (SQLiteException e) {
                zzamVarZzi2.zzt.zzay().zzd().zzc("Error resetting session-scoped event counts. appId", zzeh.zzn(str12), e);
                cursor = i3;
            }
        }
        Map mapEmptyMap = Collections.emptyMap();
        String str13 = "Failed to merge filter. appId";
        String str14 = "Database error querying filters. appId";
        String str15 = "audience_id";
        if (zZzs2 && zZzs) {
            zzam zzamVarZzi3 = this.zzf.zzi();
            String str16 = this.zza;
            Preconditions.checkNotEmpty(str16);
            vo0 vo0Var2 = new vo0();
            try {
                try {
                    cursorQuery3 = zzamVarZzi3.zzh().query("event_filters", new String[]{"audience_id", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, "app_id=?", new String[]{str16}, null, null, null);
                    try {
                    } catch (SQLiteException e2) {
                        e = e2;
                        zzamVarZzi3.zzt.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(str16), e);
                        mapEmptyMap = Collections.emptyMap();
                        if (cursorQuery3 != null) {
                            cursorQuery3.close();
                        }
                        map = mapEmptyMap;
                        zzamVarZzi = this.zzf.zzi();
                        str2 = this.zza;
                        zzamVarZzi.zzW();
                        zzamVarZzi.zzg();
                        Preconditions.checkNotEmpty(str2);
                        cursorQuery = zzamVarZzi.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str2}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                str3 = "audience_id";
                            }
                            if (map2.isEmpty()) {
                            }
                            if (!list.isEmpty()) {
                            }
                            String str17 = str11;
                            if (!list2.isEmpty()) {
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Set setKeySet = this.zzc.keySet();
                            setKeySet.removeAll(this.zzb);
                            it5 = setKeySet.iterator();
                            while (it5.hasNext()) {
                            }
                            return arrayList3;
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursorQuery;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                cursorQuery3 = null;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
            if (cursorQuery3.moveToFirst()) {
                while (true) {
                    try {
                        com.google.android.gms.internal.measurement.zzek zzekVar = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzkv.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery3.getBlob(i2))).zzaC();
                        if (zzekVar.zzo()) {
                            Integer numValueOf = Integer.valueOf(cursorQuery3.getInt(i));
                            List list4 = (List) vo0Var2.get(numValueOf);
                            if (list4 == null) {
                                arrayList2 = new ArrayList();
                                vo0Var2.put(numValueOf, arrayList2);
                            } else {
                                arrayList2 = list4;
                            }
                            arrayList2.add(zzekVar);
                        }
                    } catch (IOException e5) {
                        zzamVarZzi3.zzt.zzay().zzd().zzc("Failed to merge filter. appId", zzeh.zzn(str16), e5);
                    }
                    if (!cursorQuery3.moveToNext()) {
                        break;
                    }
                    i = 0;
                    i2 = 1;
                }
                cursorQuery3.close();
                map = vo0Var2;
            } else {
                mapEmptyMap = Collections.emptyMap();
                cursorQuery3.close();
                map = mapEmptyMap;
            }
        } else {
            map = mapEmptyMap;
        }
        zzamVarZzi = this.zzf.zzi();
        str2 = this.zza;
        zzamVarZzi.zzW();
        zzamVarZzi.zzg();
        Preconditions.checkNotEmpty(str2);
        try {
            cursorQuery = zzamVarZzi.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str2}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map mapEmptyMap2 = Collections.emptyMap();
                cursorQuery.close();
                map2 = mapEmptyMap2;
                str3 = "audience_id";
            } else {
                vo0 vo0Var3 = new vo0();
                while (true) {
                    int i4 = cursorQuery.getInt(0);
                    try {
                        vo0Var3.put(Integer.valueOf(i4), (com.google.android.gms.internal.measurement.zzgi) ((com.google.android.gms.internal.measurement.zzgh) zzkv.zzl(com.google.android.gms.internal.measurement.zzgi.zzf(), cursorQuery.getBlob(1))).zzaC());
                        vo0Var = vo0Var3;
                        str3 = str15;
                    } catch (IOException e6) {
                        vo0Var = vo0Var3;
                        str3 = str15;
                        try {
                            zzamVarZzi.zzt.zzay().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzeh.zzn(str2), Integer.valueOf(i4), e6);
                        } catch (SQLiteException e7) {
                            e = e7;
                            zzamVarZzi.zzt.zzay().zzd().zzc("Database error querying filter results. appId", zzeh.zzn(str2), e);
                            Map mapEmptyMap3 = Collections.emptyMap();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            map2 = mapEmptyMap3;
                            if (map2.isEmpty()) {
                            }
                            if (!list.isEmpty()) {
                            }
                            String str172 = str11;
                            if (!list2.isEmpty()) {
                            }
                            ArrayList arrayList32 = new ArrayList();
                            Set setKeySet2 = this.zzc.keySet();
                            setKeySet2.removeAll(this.zzb);
                            it5 = setKeySet2.iterator();
                            while (it5.hasNext()) {
                            }
                            return arrayList32;
                        }
                    }
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    vo0Var3 = vo0Var;
                    str15 = str3;
                }
                cursorQuery.close();
                map2 = vo0Var;
            }
        } catch (SQLiteException e8) {
            e = e8;
            str3 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            cursor2 = null;
        }
        if (map2.isEmpty()) {
            str7 = "Database error querying filters. appId";
            str5 = "Failed to merge filter. appId";
            str6 = str3;
        } else {
            HashSet hashSet = new HashSet(map2.keySet());
            if (z) {
                String str18 = this.zza;
                zzam zzamVarZzi4 = this.zzf.zzi();
                String str19 = this.zza;
                zzamVarZzi4.zzW();
                zzamVarZzi4.zzg();
                Preconditions.checkNotEmpty(str19);
                Map vo0Var4 = new vo0();
                ?? Zzh = zzamVarZzi4.zzh();
                try {
                    try {
                        cursorRawQuery = Zzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str19, str19});
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                do {
                                    Integer numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                    List arrayList4 = (List) vo0Var4.get(numValueOf2);
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                        vo0Var4.put(numValueOf2, arrayList4);
                                    }
                                    arrayList4.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                } while (cursorRawQuery.moveToNext());
                            } else {
                                vo0Var4 = Collections.emptyMap();
                            }
                        } catch (SQLiteException e9) {
                            e = e9;
                            zzamVarZzi4.zzt.zzay().zzd().zzc("Database error querying scoped filters. appId", zzeh.zzn(str19), e);
                            vo0Var4 = Collections.emptyMap();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            Preconditions.checkNotEmpty(str18);
                            Preconditions.checkNotNull(map2);
                            vo0 vo0Var5 = new vo0();
                            if (!map2.isEmpty()) {
                            }
                            str4 = str14;
                            map3 = vo0Var5;
                            it = hashSet.iterator();
                            while (it.hasNext()) {
                            }
                            str5 = str13;
                            str6 = str3;
                            str7 = str4;
                            if (!list.isEmpty()) {
                            }
                            String str1722 = str11;
                            if (!list2.isEmpty()) {
                            }
                            ArrayList arrayList322 = new ArrayList();
                            Set setKeySet22 = this.zzc.keySet();
                            setKeySet22.removeAll(this.zzb);
                            it5 = setKeySet22.iterator();
                            while (it5.hasNext()) {
                            }
                            return arrayList322;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (Zzh != 0) {
                            Zzh.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    cursorRawQuery = null;
                } catch (Throwable th6) {
                    th = th6;
                    Zzh = 0;
                    if (Zzh != 0) {
                    }
                    throw th;
                }
                cursorRawQuery.close();
                Preconditions.checkNotEmpty(str18);
                Preconditions.checkNotNull(map2);
                vo0 vo0Var52 = new vo0();
                if (!map2.isEmpty()) {
                    Iterator it8 = map2.keySet().iterator();
                    while (it8.hasNext()) {
                        int iIntValue = ((Integer) it8.next()).intValue();
                        Integer numValueOf3 = Integer.valueOf(iIntValue);
                        com.google.android.gms.internal.measurement.zzgi zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map2.get(numValueOf3);
                        List list5 = (List) vo0Var4.get(numValueOf3);
                        if (list5 == null || list5.isEmpty()) {
                            map4 = vo0Var4;
                            it2 = it8;
                            str9 = str14;
                            vo0Var52.put(numValueOf3, zzgiVar);
                            vo0Var4 = map4;
                            it8 = it2;
                            str14 = str9;
                        } else {
                            map4 = vo0Var4;
                            List listZzq = this.zzf.zzu().zzq(zzgiVar.zzk(), list5);
                            if (listZzq.isEmpty()) {
                                vo0Var4 = map4;
                            } else {
                                com.google.android.gms.internal.measurement.zzgh zzghVar = (com.google.android.gms.internal.measurement.zzgh) zzgiVar.zzby();
                                zzghVar.zzf();
                                zzghVar.zzb(listZzq);
                                it2 = it8;
                                List listZzq2 = this.zzf.zzu().zzq(zzgiVar.zzn(), list5);
                                zzghVar.zzh();
                                zzghVar.zzd(listZzq2);
                                zzoc.zzc();
                                str9 = str14;
                                if (this.zzt.zzf().zzs(null, zzdu.zzas)) {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it9 = zzgiVar.zzj().iterator();
                                    while (it9.hasNext()) {
                                        com.google.android.gms.internal.measurement.zzfr zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it9.next();
                                        Iterator it10 = it9;
                                        if (!list5.contains(Integer.valueOf(zzfrVar.zza()))) {
                                            arrayList5.add(zzfrVar);
                                        }
                                        it9 = it10;
                                    }
                                    zzghVar.zze();
                                    zzghVar.zza(arrayList5);
                                    ArrayList arrayList6 = new ArrayList();
                                    for (com.google.android.gms.internal.measurement.zzgk zzgkVar : zzgiVar.zzm()) {
                                        if (!list5.contains(Integer.valueOf(zzgkVar.zzb()))) {
                                            arrayList6.add(zzgkVar);
                                        }
                                    }
                                    zzghVar.zzg();
                                    zzghVar.zzc(arrayList6);
                                } else {
                                    for (int i5 = 0; i5 < zzgiVar.zza(); i5++) {
                                        if (list5.contains(Integer.valueOf(zzgiVar.zze(i5).zza()))) {
                                            zzghVar.zzi(i5);
                                        }
                                    }
                                    for (int i6 = 0; i6 < zzgiVar.zzc(); i6++) {
                                        if (list5.contains(Integer.valueOf(zzgiVar.zzi(i6).zzb()))) {
                                            zzghVar.zzj(i6);
                                        }
                                    }
                                }
                                vo0Var52.put(Integer.valueOf(iIntValue), (com.google.android.gms.internal.measurement.zzgi) zzghVar.zzaC());
                                vo0Var4 = map4;
                                it8 = it2;
                                str14 = str9;
                            }
                        }
                    }
                }
                str4 = str14;
                map3 = vo0Var52;
            } else {
                str4 = "Database error querying filters. appId";
                map3 = map2;
            }
            it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                com.google.android.gms.internal.measurement.zzgi zzgiVar2 = (com.google.android.gms.internal.measurement.zzgi) map3.get(Integer.valueOf(iIntValue2));
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                vo0 vo0Var6 = new vo0();
                if (zzgiVar2 != null && zzgiVar2.zza() != 0) {
                    for (com.google.android.gms.internal.measurement.zzfr zzfrVar2 : zzgiVar2.zzj()) {
                        if (zzfrVar2.zzh()) {
                            vo0Var6.put(Integer.valueOf(zzfrVar2.zza()), zzfrVar2.zzg() ? Long.valueOf(zzfrVar2.zzb()) : null);
                        }
                    }
                }
                vo0 vo0Var7 = new vo0();
                if (zzgiVar2 != null && zzgiVar2.zzc() != 0) {
                    for (com.google.android.gms.internal.measurement.zzgk zzgkVar2 : zzgiVar2.zzm()) {
                        if (zzgkVar2.zzi() && zzgkVar2.zza() > 0) {
                            vo0Var7.put(Integer.valueOf(zzgkVar2.zzb()), Long.valueOf(zzgkVar2.zzc(zzgkVar2.zza() - 1)));
                            map3 = map3;
                        }
                    }
                }
                Map map5 = map3;
                if (zzgiVar2 != null) {
                    int i7 = 0;
                    while (i7 < zzgiVar2.zzd() * 64) {
                        if (zzkv.zzv(zzgiVar2.zzn(), i7)) {
                            str8 = str13;
                            this.zzt.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue2), Integer.valueOf(i7));
                            bitSet2.set(i7);
                            if (zzkv.zzv(zzgiVar2.zzk(), i7)) {
                                bitSet.set(i7);
                            }
                            i7++;
                            str13 = str8;
                        } else {
                            str8 = str13;
                        }
                        vo0Var6.remove(Integer.valueOf(i7));
                        i7++;
                        str13 = str8;
                    }
                }
                String str20 = str13;
                Integer numValueOf4 = Integer.valueOf(iIntValue2);
                com.google.android.gms.internal.measurement.zzgi zzgiVar3 = (com.google.android.gms.internal.measurement.zzgi) map2.get(numValueOf4);
                if (zZzs2 && zZzs && (list3 = (List) map.get(numValueOf4)) != null && this.zze != null && this.zzd != null) {
                    for (com.google.android.gms.internal.measurement.zzek zzekVar2 : list3) {
                        int iZzb = zzekVar2.zzb();
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzekVar2.zzm()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf5 = Integer.valueOf(iZzb);
                        if (vo0Var6.containsKey(numValueOf5)) {
                            vo0Var6.put(numValueOf5, Long.valueOf(jLongValue));
                        }
                        if (vo0Var7.containsKey(numValueOf5)) {
                            vo0Var7.put(numValueOf5, Long.valueOf(jLongValue));
                        }
                    }
                }
                this.zzc.put(Integer.valueOf(iIntValue2), new zzu(this, this.zza, zzgiVar3, bitSet, bitSet2, vo0Var6, vo0Var7, null));
                str13 = str20;
                map = map;
                map3 = map5;
                map2 = map2;
            }
            str5 = str13;
            str6 = str3;
            str7 = str4;
        }
        if (!list.isEmpty()) {
            zzw zzwVar2 = new zzw(this, null);
            vo0 vo0Var8 = new vo0();
            Iterator it11 = list.iterator();
            while (it11.hasNext()) {
                com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) it11.next();
                com.google.android.gms.internal.measurement.zzft zzftVarZza = zzwVar2.zza(this.zza, zzftVar);
                if (zzftVarZza != null) {
                    zzam zzamVarZzi5 = this.zzf.zzi();
                    String str21 = this.zza;
                    String strZzh = zzftVarZza.zzh();
                    zzas zzasVarZzn = zzamVarZzi5.zzn(str21, zzftVar.zzh());
                    if (zzasVarZzn == null) {
                        zzamVarZzi5.zzt.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeh.zzn(str21), zzamVarZzi5.zzt.zzj().zzd(strZzh));
                        zzasVar = new zzas(str21, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                    } else {
                        zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                    }
                    this.zzf.zzi().zzE(zzasVar);
                    long j = zzasVar.zzc;
                    String strZzh2 = zzftVarZza.zzh();
                    Map mapEmptyMap4 = (Map) vo0Var8.get(strZzh2);
                    if (mapEmptyMap4 == null) {
                        zzam zzamVarZzi6 = this.zzf.zzi();
                        String str22 = this.zza;
                        zzamVarZzi6.zzW();
                        zzamVarZzi6.zzg();
                        Preconditions.checkNotEmpty(str22);
                        Preconditions.checkNotEmpty(strZzh2);
                        zzwVar = zzwVar2;
                        vo0 vo0Var9 = new vo0();
                        SQLiteDatabase sQLiteDatabaseZzh = zzamVarZzi6.zzh();
                        it3 = it11;
                        try {
                            try {
                                String[] strArr = new String[2];
                                String str23 = str6;
                                try {
                                    strArr[0] = str23;
                                    strArr[1] = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                    str10 = str11;
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    str6 = str23;
                                    zzasVar2 = zzasVar;
                                    str10 = str11;
                                    cursor3 = null;
                                    try {
                                        zzamVarZzi6.zzt.zzay().zzd().zzc(str7, zzeh.zzn(str22), e);
                                        mapEmptyMap4 = Collections.emptyMap();
                                        if (cursor3 != null) {
                                        }
                                        vo0Var8.put(strZzh2, mapEmptyMap4);
                                        it4 = mapEmptyMap4.keySet().iterator();
                                        while (it4.hasNext()) {
                                        }
                                        zzwVar2 = zzwVar;
                                        it11 = it3;
                                        str11 = str10;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        throw th;
                                    }
                                }
                                try {
                                    Cursor cursorQuery4 = sQLiteDatabaseZzh.query("event_filters", strArr, "app_id=? AND event_name=?", new String[]{str22, strZzh2}, null, null, null);
                                    try {
                                        try {
                                            if (cursorQuery4.moveToFirst()) {
                                                str6 = str23;
                                                while (true) {
                                                    try {
                                                        try {
                                                            com.google.android.gms.internal.measurement.zzek zzekVar3 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzkv.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery4.getBlob(1))).zzaC();
                                                            Integer numValueOf6 = Integer.valueOf(cursorQuery4.getInt(0));
                                                            List list6 = (List) vo0Var9.get(numValueOf6);
                                                            if (list6 == null) {
                                                                zzasVar2 = zzasVar;
                                                                try {
                                                                    arrayList = new ArrayList();
                                                                    vo0Var9.put(numValueOf6, arrayList);
                                                                } catch (SQLiteException e12) {
                                                                    e = e12;
                                                                    cursor3 = cursorQuery4;
                                                                    zzamVarZzi6.zzt.zzay().zzd().zzc(str7, zzeh.zzn(str22), e);
                                                                    mapEmptyMap4 = Collections.emptyMap();
                                                                    if (cursor3 != null) {
                                                                    }
                                                                    vo0Var8.put(strZzh2, mapEmptyMap4);
                                                                    it4 = mapEmptyMap4.keySet().iterator();
                                                                    while (it4.hasNext()) {
                                                                    }
                                                                    zzwVar2 = zzwVar;
                                                                    it11 = it3;
                                                                    str11 = str10;
                                                                }
                                                            } else {
                                                                zzasVar2 = zzasVar;
                                                                arrayList = list6;
                                                            }
                                                            arrayList.add(zzekVar3);
                                                        } catch (IOException e13) {
                                                            zzasVar2 = zzasVar;
                                                            zzamVarZzi6.zzt.zzay().zzd().zzc(str5, zzeh.zzn(str22), e13);
                                                        }
                                                        if (!cursorQuery4.moveToNext()) {
                                                            break;
                                                        }
                                                        zzasVar = zzasVar2;
                                                    } catch (SQLiteException e14) {
                                                        e = e14;
                                                        zzasVar2 = zzasVar;
                                                        cursor3 = cursorQuery4;
                                                        zzamVarZzi6.zzt.zzay().zzd().zzc(str7, zzeh.zzn(str22), e);
                                                        mapEmptyMap4 = Collections.emptyMap();
                                                        if (cursor3 != null) {
                                                            cursor3.close();
                                                        }
                                                        vo0Var8.put(strZzh2, mapEmptyMap4);
                                                        it4 = mapEmptyMap4.keySet().iterator();
                                                        while (it4.hasNext()) {
                                                        }
                                                        zzwVar2 = zzwVar;
                                                        it11 = it3;
                                                        str11 = str10;
                                                    }
                                                }
                                                cursorQuery4.close();
                                                mapEmptyMap4 = vo0Var9;
                                            } else {
                                                str6 = str23;
                                                zzasVar2 = zzasVar;
                                                mapEmptyMap4 = Collections.emptyMap();
                                                cursorQuery4.close();
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            cursor3 = cursorQuery4;
                                            if (cursor3 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e15) {
                                        e = e15;
                                        str6 = str23;
                                    }
                                } catch (SQLiteException e16) {
                                    e = e16;
                                    str6 = str23;
                                    zzasVar2 = zzasVar;
                                    cursor3 = null;
                                    zzamVarZzi6.zzt.zzay().zzd().zzc(str7, zzeh.zzn(str22), e);
                                    mapEmptyMap4 = Collections.emptyMap();
                                    if (cursor3 != null) {
                                    }
                                    vo0Var8.put(strZzh2, mapEmptyMap4);
                                    it4 = mapEmptyMap4.keySet().iterator();
                                    while (it4.hasNext()) {
                                    }
                                    zzwVar2 = zzwVar;
                                    it11 = it3;
                                    str11 = str10;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                cursor3 = null;
                            }
                        } catch (SQLiteException e17) {
                            e = e17;
                        }
                        vo0Var8.put(strZzh2, mapEmptyMap4);
                    } else {
                        zzwVar = zzwVar2;
                        it3 = it11;
                        zzasVar2 = zzasVar;
                        str10 = str11;
                    }
                    it4 = mapEmptyMap4.keySet().iterator();
                    while (it4.hasNext()) {
                        int iIntValue3 = ((Integer) it4.next()).intValue();
                        Set set = this.zzb;
                        Integer numValueOf7 = Integer.valueOf(iIntValue3);
                        if (set.contains(numValueOf7)) {
                            this.zzt.zzay().zzj().zzb("Skipping failed audience ID", numValueOf7);
                        } else {
                            Iterator it12 = ((List) mapEmptyMap4.get(numValueOf7)).iterator();
                            boolean zZzd = true;
                            while (true) {
                                if (!it12.hasNext()) {
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zzek zzekVar4 = (com.google.android.gms.internal.measurement.zzek) it12.next();
                                zzx zzxVar = new zzx(this, this.zza, iIntValue3, zzekVar4);
                                zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j, zzasVar2, zzf(iIntValue3, zzekVar4.zzb()));
                                if (!zZzd) {
                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                    break;
                                }
                                zzd(Integer.valueOf(iIntValue3)).zzc(zzxVar);
                            }
                            if (!zZzd) {
                                this.zzb.add(Integer.valueOf(iIntValue3));
                            }
                        }
                    }
                    zzwVar2 = zzwVar;
                    it11 = it3;
                    str11 = str10;
                }
            }
        }
        String str17222 = str11;
        if (!list2.isEmpty()) {
            vo0 vo0Var10 = new vo0();
            Iterator it13 = list2.iterator();
            while (it13.hasNext()) {
                com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) it13.next();
                String strZzf = zzgmVar.zzf();
                Map mapEmptyMap5 = (Map) vo0Var10.get(strZzf);
                if (mapEmptyMap5 == null) {
                    zzam zzamVarZzi7 = this.zzf.zzi();
                    String str24 = this.zza;
                    zzamVarZzi7.zzW();
                    zzamVarZzi7.zzg();
                    Preconditions.checkNotEmpty(str24);
                    Preconditions.checkNotEmpty(strZzf);
                    vo0 vo0Var11 = new vo0();
                    SQLiteDatabase sQLiteDatabaseZzh2 = zzamVarZzi7.zzh();
                    try {
                        try {
                            String[] strArr2 = new String[2];
                            try {
                                strArr2[0] = str6;
                                strArr2[1] = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                cursorQuery2 = sQLiteDatabaseZzh2.query("property_filters", strArr2, "app_id=? AND property_name=?", new String[]{str24, strZzf}, null, null, null);
                            } catch (SQLiteException e18) {
                                e = e18;
                                cursorQuery2 = null;
                                zzamVarZzi7.zzt.zzay().zzd().zzc(str7, zzeh.zzn(str24), e);
                                mapEmptyMap5 = Collections.emptyMap();
                                if (cursorQuery2 != null) {
                                }
                                vo0Var10.put(strZzf, mapEmptyMap5);
                                it6 = mapEmptyMap5.keySet().iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                    }
                                }
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            cursor4 = null;
                        }
                    } catch (SQLiteException e19) {
                        e = e19;
                    }
                    try {
                        try {
                        } catch (SQLiteException e20) {
                            e = e20;
                        }
                        if (cursorQuery2.moveToFirst()) {
                            do {
                                try {
                                    com.google.android.gms.internal.measurement.zzet zzetVar = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzkv.zzl(com.google.android.gms.internal.measurement.zzet.zzc(), cursorQuery2.getBlob(1))).zzaC();
                                    try {
                                        Integer numValueOf8 = Integer.valueOf(cursorQuery2.getInt(0));
                                        List arrayList7 = (List) vo0Var11.get(numValueOf8);
                                        if (arrayList7 == null) {
                                            arrayList7 = new ArrayList();
                                            vo0Var11.put(numValueOf8, arrayList7);
                                        }
                                        arrayList7.add(zzetVar);
                                    } catch (SQLiteException e21) {
                                        e = e21;
                                        zzamVarZzi7.zzt.zzay().zzd().zzc(str7, zzeh.zzn(str24), e);
                                        mapEmptyMap5 = Collections.emptyMap();
                                        if (cursorQuery2 != null) {
                                            cursorQuery2.close();
                                        }
                                        vo0Var10.put(strZzf, mapEmptyMap5);
                                        it6 = mapEmptyMap5.keySet().iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                break;
                                            }
                                        }
                                    }
                                } catch (IOException e22) {
                                    zzamVarZzi7.zzt.zzay().zzd().zzc("Failed to merge filter", zzeh.zzn(str24), e22);
                                }
                            } while (cursorQuery2.moveToNext());
                            cursorQuery2.close();
                            mapEmptyMap5 = vo0Var11;
                            vo0Var10.put(strZzf, mapEmptyMap5);
                        } else {
                            mapEmptyMap5 = Collections.emptyMap();
                            cursorQuery2.close();
                            vo0Var10.put(strZzf, mapEmptyMap5);
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        cursor4 = cursorQuery2;
                        if (cursor4 != null) {
                            cursor4.close();
                        }
                        throw th;
                    }
                }
                it6 = mapEmptyMap5.keySet().iterator();
                while (true) {
                    if (it6.hasNext()) {
                        int iIntValue4 = ((Integer) it6.next()).intValue();
                        Set set2 = this.zzb;
                        Integer numValueOf9 = Integer.valueOf(iIntValue4);
                        if (set2.contains(numValueOf9)) {
                            this.zzt.zzay().zzj().zzb("Skipping failed audience ID", numValueOf9);
                            break;
                        }
                        Iterator it14 = ((List) mapEmptyMap5.get(numValueOf9)).iterator();
                        boolean zZzd2 = true;
                        while (true) {
                            if (!it14.hasNext()) {
                                break;
                            }
                            com.google.android.gms.internal.measurement.zzet zzetVar2 = (com.google.android.gms.internal.measurement.zzet) it14.next();
                            if (Log.isLoggable(this.zzt.zzay().zzq(), 2)) {
                                this.zzt.zzay().zzj().zzd("Evaluating filter. audience, filter, property", Integer.valueOf(iIntValue4), zzetVar2.zzj() ? Integer.valueOf(zzetVar2.zza()) : null, this.zzt.zzj().zzf(zzetVar2.zze()));
                                this.zzt.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzetVar2));
                            }
                            if (!zzetVar2.zzj() || zzetVar2.zza() > 256) {
                                break;
                            }
                            zzz zzzVar = new zzz(this, this.zza, iIntValue4, zzetVar2);
                            zZzd2 = zzzVar.zzd(this.zzd, this.zze, zzgmVar, zzf(iIntValue4, zzetVar2.zza()));
                            if (!zZzd2) {
                                this.zzb.add(Integer.valueOf(iIntValue4));
                                break;
                            }
                            zzd(Integer.valueOf(iIntValue4)).zzc(zzzVar);
                        }
                        if (!zZzd2) {
                            this.zzb.add(Integer.valueOf(iIntValue4));
                        }
                    }
                }
            }
        }
        ArrayList arrayList3222 = new ArrayList();
        Set setKeySet222 = this.zzc.keySet();
        setKeySet222.removeAll(this.zzb);
        it5 = setKeySet222.iterator();
        while (it5.hasNext()) {
            int iIntValue5 = ((Integer) it5.next()).intValue();
            Map map6 = this.zzc;
            Integer numValueOf10 = Integer.valueOf(iIntValue5);
            zzu zzuVar = (zzu) map6.get(numValueOf10);
            Preconditions.checkNotNull(zzuVar);
            com.google.android.gms.internal.measurement.zzfp zzfpVarZza = zzuVar.zza(iIntValue5);
            arrayList3222.add(zzfpVarZza);
            zzam zzamVarZzi8 = this.zzf.zzi();
            String str25 = this.zza;
            com.google.android.gms.internal.measurement.zzgi zzgiVarZzd = zzfpVarZza.zzd();
            zzamVarZzi8.zzW();
            zzamVarZzi8.zzg();
            Preconditions.checkNotEmpty(str25);
            Preconditions.checkNotNull(zzgiVarZzd);
            byte[] bArrZzbu = zzgiVarZzd.zzbu();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str25);
            String str26 = str6;
            contentValues2.put(str26, numValueOf10);
            String str27 = str17222;
            contentValues2.put(str27, bArrZzbu);
            try {
                try {
                    if (zzamVarZzi8.zzh().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                        zzamVarZzi8.zzt.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeh.zzn(str25));
                    }
                } catch (SQLiteException e23) {
                    e = e23;
                    zzamVarZzi8.zzt.zzay().zzd().zzc("Error storing filter results. appId", zzeh.zzn(str25), e);
                    str17222 = str27;
                    str6 = str26;
                }
            } catch (SQLiteException e24) {
                e = e24;
            }
            str17222 = str27;
            str6 = str26;
        }
        return arrayList3222;
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final boolean zzb() {
        return false;
    }
}
