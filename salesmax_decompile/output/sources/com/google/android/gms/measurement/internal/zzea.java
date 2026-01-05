package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzea extends zzf {
    private final zzdz zza;
    private boolean zzb;

    public zzea(zzfr zzfrVar) {
        super(zzfrVar);
        Context contextZzau = this.zzt.zzau();
        this.zzt.zzf();
        this.zza = new zzdz(this, contextZzau, "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116 A[PHI: r8
      0x0116: PHI (r8v3 android.database.sqlite.SQLiteDatabase) = (r8v2 android.database.sqlite.SQLiteDatabase), (r8v4 android.database.sqlite.SQLiteDatabase) binds: [B:55:0x00e6, B:70:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzq(int i, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseZzh;
        ?? RawQuery;
        Cursor cursor;
        zzg();
        ?? r2 = 0;
        if (this.zzb) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        this.zzt.zzf();
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            Cursor cursor2 = null;
            cursor2 = null;
            cursor2 = null;
            sQLiteDatabase = null;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseZzh = zzh();
                try {
                    if (sQLiteDatabaseZzh == null) {
                        this.zzb = true;
                        return r2;
                    }
                    sQLiteDatabaseZzh.beginTransaction();
                    RawQuery = sQLiteDatabaseZzh.rawQuery("select count(1) from messages", null);
                    long j = 0;
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j = RawQuery.getLong(r2);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            cursor2 = RawQuery;
                            try {
                                SystemClock.sleep(i3);
                                i3 += 20;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabaseZzh != null) {
                                    sQLiteDatabaseZzh.close();
                                }
                                i2++;
                                r2 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabaseZzh != null) {
                                    sQLiteDatabaseZzh.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e) {
                            e = e;
                            sQLiteDatabase = sQLiteDatabaseZzh;
                            cursor = RawQuery;
                            this.zzt.zzay().zzd().zzb("Error writing entry; local database full", e);
                            this.zzb = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteDatabase = sQLiteDatabaseZzh;
                            RawQuery = RawQuery;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabaseZzh = sQLiteDatabase;
                                    cursor2 = RawQuery;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                    }
                                    throw th;
                                }
                            }
                            this.zzt.zzay().zzd().zzb("Error writing entry to local database", e);
                            this.zzb = true;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            if (sQLiteDatabase != null) {
                            }
                            i2++;
                            r2 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = RawQuery;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabaseZzh != null) {
                            }
                            throw th;
                        }
                    }
                    if (j >= 100000) {
                        this.zzt.zzay().zzd().zza("Data loss, local db full");
                        long j2 = (100000 - j) + 1;
                        String[] strArr = new String[1];
                        strArr[r2] = Long.toString(j2);
                        long jDelete = sQLiteDatabaseZzh.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (jDelete != j2) {
                            this.zzt.zzay().zzd().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                        }
                    }
                    sQLiteDatabaseZzh.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabaseZzh.setTransactionSuccessful();
                    sQLiteDatabaseZzh.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseZzh.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e3) {
                    e = e3;
                    RawQuery = 0;
                } catch (SQLiteException e4) {
                    e = e4;
                    RawQuery = 0;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseZzh = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                cursor = null;
            } catch (SQLiteException e6) {
                e = e6;
                RawQuery = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabaseZzh = null;
                if (cursor2 != null) {
                }
                if (sQLiteDatabaseZzh != null) {
                }
                throw th;
            }
        }
        this.zzt.zzay().zzj().zza("Failed to write entry to local database");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    @VisibleForTesting
    public final SQLiteDatabase zzh() {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0239 A[PHI: r9 r15
      0x0239: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:143:0x0227, B:158:0x0254, B:151:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r15v7 android.database.sqlite.SQLiteDatabase) = 
      (r15v5 android.database.sqlite.SQLiteDatabase)
      (r15v6 android.database.sqlite.SQLiteDatabase)
      (r15v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:143:0x0227, B:158:0x0254, B:151:0x0237] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0257 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzi(int i) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursorQuery2;
        long j;
        long j2;
        String str;
        String[] strArr;
        Parcel parcelObtain;
        zzkw zzkwVarCreateFromParcel;
        zzac zzacVarCreateFromParcel;
        zzg();
        Cursor cursor = null;
        if (this.zzb) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzl()) {
            return arrayList;
        }
        int i2 = 5;
        int i3 = 0;
        for (int i4 = 5; i3 < i4; i4 = 5) {
            try {
                SQLiteDatabase sQLiteDatabaseZzh = zzh();
                if (sQLiteDatabaseZzh == null) {
                    this.zzb = true;
                    return null;
                }
                try {
                    sQLiteDatabaseZzh.beginTransaction();
                    try {
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                    }
                    try {
                        cursorQuery2 = sQLiteDatabaseZzh.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                        try {
                            j = -1;
                            if (cursorQuery2.moveToFirst()) {
                                j2 = cursorQuery2.getLong(0);
                                try {
                                    cursorQuery2.close();
                                } catch (SQLiteDatabaseLockedException unused) {
                                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                                    cursorQuery = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursorQuery != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    i3++;
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                                    cursorQuery = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursorQuery != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    i3++;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                                    cursorQuery = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (sQLiteDatabase != null) {
                                    }
                                    this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursorQuery != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    i3++;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                cursorQuery2.close();
                                j2 = -1;
                            }
                            if (j2 != -1) {
                                str = "rowid<?";
                                strArr = new String[]{String.valueOf(j2)};
                            } else {
                                str = null;
                                strArr = null;
                            }
                            cursorQuery = sQLiteDatabaseZzh.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                            while (cursorQuery.moveToNext()) {
                                try {
                                    j = cursorQuery.getLong(0);
                                    int i5 = cursorQuery.getInt(1);
                                    byte[] blob = cursorQuery.getBlob(2);
                                    if (i5 == 0) {
                                        parcelObtain = Parcel.obtain();
                                        try {
                                            try {
                                                parcelObtain.unmarshall(blob, 0, blob.length);
                                                parcelObtain.setDataPosition(0);
                                                zzaw zzawVarCreateFromParcel = zzaw.CREATOR.createFromParcel(parcelObtain);
                                                if (zzawVarCreateFromParcel != null) {
                                                    arrayList.add(zzawVarCreateFromParcel);
                                                }
                                            } catch (SafeParcelReader.ParseException unused2) {
                                                this.zzt.zzay().zzd().zza("Failed to load event from local database");
                                                parcelObtain.recycle();
                                            }
                                        } finally {
                                        }
                                    } else if (i5 == 1) {
                                        parcelObtain = Parcel.obtain();
                                        try {
                                            try {
                                                parcelObtain.unmarshall(blob, 0, blob.length);
                                                parcelObtain.setDataPosition(0);
                                                zzkwVarCreateFromParcel = zzkw.CREATOR.createFromParcel(parcelObtain);
                                            } catch (SafeParcelReader.ParseException unused3) {
                                                this.zzt.zzay().zzd().zza("Failed to load user property from local database");
                                                parcelObtain.recycle();
                                                zzkwVarCreateFromParcel = null;
                                            }
                                            if (zzkwVarCreateFromParcel != null) {
                                                arrayList.add(zzkwVarCreateFromParcel);
                                            }
                                        } finally {
                                        }
                                    } else if (i5 == 2) {
                                        parcelObtain = Parcel.obtain();
                                        try {
                                            try {
                                                parcelObtain.unmarshall(blob, 0, blob.length);
                                                parcelObtain.setDataPosition(0);
                                                zzacVarCreateFromParcel = zzac.CREATOR.createFromParcel(parcelObtain);
                                            } finally {
                                            }
                                        } catch (SafeParcelReader.ParseException unused4) {
                                            this.zzt.zzay().zzd().zza("Failed to load conditional user property from local database");
                                            parcelObtain.recycle();
                                            zzacVarCreateFromParcel = null;
                                        }
                                        if (zzacVarCreateFromParcel != null) {
                                            arrayList.add(zzacVarCreateFromParcel);
                                        }
                                    } else if (i5 == 3) {
                                        this.zzt.zzay().zzk().zza("Skipping app launch break");
                                    } else {
                                        this.zzt.zzay().zzd().zza("Unknown record type in local database");
                                    }
                                } catch (SQLiteDatabaseLockedException unused5) {
                                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                                } catch (SQLiteFullException e3) {
                                    e = e3;
                                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                                } catch (Throwable th3) {
                                    th = th3;
                                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                                }
                            }
                            sQLiteDatabase2 = sQLiteDatabaseZzh;
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteDatabase2 = sQLiteDatabaseZzh;
                            if (cursorQuery2 != null) {
                                try {
                                    cursorQuery2.close();
                                } catch (SQLiteDatabaseLockedException unused6) {
                                    cursorQuery = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    i3++;
                                } catch (SQLiteFullException e5) {
                                    e = e5;
                                    cursorQuery = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    i3++;
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    cursorQuery = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (sQLiteDatabase != null) {
                                        try {
                                            if (sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    i3++;
                                } catch (Throwable th6) {
                                    th = th6;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                        cursorQuery2 = null;
                        if (cursorQuery2 != null) {
                        }
                        throw th;
                    }
                } catch (SQLiteDatabaseLockedException unused7) {
                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                } catch (SQLiteFullException e7) {
                    e = e7;
                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                } catch (SQLiteException e8) {
                    e = e8;
                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                } catch (Throwable th8) {
                    th = th8;
                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                }
                try {
                    if (sQLiteDatabase2.delete("messages", "rowid <= ?", new String[]{Long.toString(j)}) < arrayList.size()) {
                        this.zzt.zzay().zzd().zza("Fewer entries removed from local database than expected");
                    }
                    sQLiteDatabase2.setTransactionSuccessful();
                    sQLiteDatabase2.endTransaction();
                    cursorQuery.close();
                    sQLiteDatabase2.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused8) {
                    sQLiteDatabase = sQLiteDatabase2;
                    SystemClock.sleep(i2);
                    i2 += 20;
                    if (cursorQuery != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    i3++;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    sQLiteDatabase = sQLiteDatabase2;
                    this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                    this.zzb = true;
                    if (cursorQuery != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    i3++;
                } catch (SQLiteException e10) {
                    e = e10;
                    sQLiteDatabase = sQLiteDatabase2;
                    if (sQLiteDatabase != null) {
                    }
                    this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                    this.zzb = true;
                    if (cursorQuery != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    i3++;
                } catch (Throwable th9) {
                    th = th9;
                    cursor = cursorQuery;
                    sQLiteDatabase = sQLiteDatabase2;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused9) {
                cursorQuery = null;
                sQLiteDatabase = null;
            } catch (SQLiteFullException e11) {
                e = e11;
                cursorQuery = null;
                sQLiteDatabase = null;
            } catch (SQLiteException e12) {
                e = e12;
                cursorQuery = null;
                sQLiteDatabase = null;
            } catch (Throwable th10) {
                th = th10;
                sQLiteDatabase = null;
            }
        }
        this.zzt.zzay().zzk().zza("Failed to read events from database in reasonable time");
        return null;
    }

    public final void zzj() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            if (sQLiteDatabaseZzh == null || (iDelete = sQLiteDatabaseZzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzt.zzay().zzj().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzb("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @VisibleForTesting
    public final boolean zzl() {
        Context contextZzau = this.zzt.zzau();
        this.zzt.zzf();
        return contextZzau.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[PHI: r4
      0x0069: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v4 int) binds: [B:29:0x0060, B:35:0x007c, B:32:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzm() {
        zzg();
        if (!this.zzb && zzl()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase sQLiteDatabaseZzh = zzh();
                    if (sQLiteDatabaseZzh == null) {
                        this.zzb = true;
                        return false;
                    }
                    sQLiteDatabaseZzh.beginTransaction();
                    sQLiteDatabaseZzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    sQLiteDatabaseZzh.setTransactionSuccessful();
                    sQLiteDatabaseZzh.endTransaction();
                    sQLiteDatabaseZzh.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e) {
                    this.zzt.zzay().zzd().zzb("Error deleting app launch break from local database", e);
                    this.zzb = true;
                    if (0 != 0) {
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    this.zzt.zzay().zzd().zzb("Error deleting app launch break from local database", e2);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.zzt.zzay().zzk().zza("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] bArrZzan = this.zzt.zzv().zzan(zzacVar);
        if (bArrZzan.length <= 131072) {
            return zzq(2, bArrZzan);
        }
        this.zzt.zzay().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzaw zzawVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzax.zza(zzawVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzq(0, bArrMarshall);
        }
        this.zzt.zzay().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzp(zzkw zzkwVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzkx.zza(zzkwVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzq(1, bArrMarshall);
        }
        this.zzt.zzay().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
