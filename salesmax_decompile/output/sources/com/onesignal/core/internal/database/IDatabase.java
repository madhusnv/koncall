package com.onesignal.core.internal.database;

import android.content.ContentValues;
import p001o.xk7;

/* loaded from: classes6.dex */
public interface IDatabase {

    public static final class DefaultImpls {
        public static /* synthetic */ void query$default(IDatabase iDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, xk7 xk7Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
            }
            iDatabase.query(str, (i & 2) != 0 ? null : strArr, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : strArr2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, xk7Var);
        }
    }

    void delete(String str, String str2, String[] strArr);

    void insert(String str, String str2, ContentValues contentValues);

    void insertOrThrow(String str, String str2, ContentValues contentValues);

    void query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, xk7 xk7Var);

    int update(String str, ContentValues contentValues, String str2, String[] strArr);
}
