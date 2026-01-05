package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class zzan {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[Catch: SQLiteException -> 0x00d5, TryCatch #3 {SQLiteException -> 0x00d5, blocks: (B:20:0x0044, B:22:0x006a, B:24:0x0079, B:26:0x0081, B:27:0x0084, B:28:0x00a2, B:30:0x00a5, B:32:0x00a8, B:34:0x00b0, B:35:0x00b7, B:36:0x00ba, B:38:0x00c0, B:41:0x00d1, B:42:0x00d4, B:21:0x0063), top: B:59:0x0044, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[Catch: SQLiteException -> 0x00d5, LOOP:1: B:30:0x00a5->B:35:0x00b7, LOOP_START, PHI: r13
      0x00a5: PHI (r13v1 int) = (r13v0 int), (r13v2 int) binds: [B:29:0x00a3, B:35:0x00b7] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {SQLiteException -> 0x00d5, blocks: (B:20:0x0044, B:22:0x006a, B:24:0x0079, B:26:0x0081, B:27:0x0084, B:28:0x00a2, B:30:0x00a5, B:32:0x00a8, B:34:0x00b0, B:35:0x00b7, B:36:0x00ba, B:38:0x00c0, B:41:0x00d1, B:42:0x00d4, B:21:0x0063), top: B:59:0x0044, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0 A[Catch: SQLiteException -> 0x00d5, TryCatch #3 {SQLiteException -> 0x00d5, blocks: (B:20:0x0044, B:22:0x006a, B:24:0x0079, B:26:0x0081, B:27:0x0084, B:28:0x00a2, B:30:0x00a5, B:32:0x00a8, B:34:0x00b0, B:35:0x00b7, B:36:0x00ba, B:38:0x00c0, B:41:0x00d1, B:42:0x00d4, B:21:0x0063), top: B:59:0x0044, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zza(zzeh zzehVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        Cursor cursorQuery;
        HashSet hashSet;
        Cursor cursorRawQuery;
        boolean zMoveToFirst;
        if (zzehVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        ?? r12 = 0;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                try {
                    zMoveToFirst = cursorQuery.moveToFirst();
                    cursorQuery.close();
                } catch (SQLiteException e) {
                    e = e;
                    zzehVar.zzk().zzc("Error querying for table", str, e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    sQLiteDatabase.execSQL(str2);
                    hashSet = new HashSet();
                    cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                    try {
                        Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                        cursorRawQuery.close();
                        while (i < r2) {
                        }
                        if (strArr != null) {
                        }
                        if (hashSet.isEmpty()) {
                        }
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r12 = str2;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r12 != 0) {
            }
            throw th;
        }
        if (!zMoveToFirst) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            hashSet = new HashSet();
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            cursorRawQuery.close();
            for (String str4 : str3.split(",")) {
                if (!hashSet.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i += 2) {
                    if (!hashSet.remove(strArr[i])) {
                        sQLiteDatabase.execSQL(strArr[i + 1]);
                    }
                }
            }
            if (hashSet.isEmpty()) {
                zzehVar.zzk().zzc("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
            }
        } catch (SQLiteException e3) {
            zzehVar.zzd().zzb("Failed to verify columns on table that was just created", str);
            throw e3;
        }
    }

    public static void zzb(zzeh zzehVar, SQLiteDatabase sQLiteDatabase) {
        if (zzehVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            zzehVar.zzk().zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzehVar.zzk().zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzehVar.zzk().zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzehVar.zzk().zza("Failed to turn on database write permission for owner");
    }
}
