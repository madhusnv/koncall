package com.onesignal.core.internal.database.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.outcomes.impl.OutcomeTableProvider;
import com.onesignal.session.internal.outcomes.impl.OutcomesDbContract;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import p001o.e9g;
import p001o.id5;
import p001o.sq8;
import p001o.tb3;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public class OSDatabase extends SQLiteOpenHelper implements IDatabase {
    private static final String COMMA_SEP = ",";
    private static final String DATABASE_NAME = "OneSignal.db";
    private static final int DB_OPEN_RETRY_BACKOFF = 400;
    private static final int DB_OPEN_RETRY_MAX = 5;
    private static final int DB_VERSION = 9;
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final String FLOAT_TYPE = " FLOAT";
    private static final String INTEGER_PRIMARY_KEY_TYPE = " INTEGER PRIMARY KEY";
    private static final String INT_TYPE = " INTEGER";
    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);";
    private static final String SQL_CREATE_IN_APP_MESSAGE_ENTRIES = "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);";
    private static final String TEXT_TYPE = " TEXT";
    private static final String TIMESTAMP_TYPE = " TIMESTAMP";
    private final OutcomeTableProvider _outcomeTableProvider;
    public static final Companion Companion = new Companion(null);
    private static final Object LOCK = new Object();
    private static final String[] SQL_INDEX_ENTRIES = {OneSignalDbContract.NotificationTable.INDEX_CREATE_NOTIFICATION_ID, OneSignalDbContract.NotificationTable.INDEX_CREATE_ANDROID_NOTIFICATION_ID, OneSignalDbContract.NotificationTable.INDEX_CREATE_GROUP_ID, OneSignalDbContract.NotificationTable.INDEX_CREATE_COLLAPSE_ID, OneSignalDbContract.NotificationTable.INDEX_CREATE_CREATED_TIME, OneSignalDbContract.NotificationTable.INDEX_CREATE_EXPIRE_TIME};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ OSDatabase(OutcomeTableProvider outcomeTableProvider, Context context, int i, int i2, id5 id5Var) {
        this(outcomeTableProvider, context, (i2 & 4) != 0 ? 9 : i);
    }

    private final SQLiteDatabase getSQLiteDatabase() {
        SQLiteDatabase writableDatabase;
        synchronized (LOCK) {
            try {
                writableDatabase = getWritableDatabase();
                sq8.m48648g(writableDatabase, "{\n                writableDatabase\n            }");
            } catch (SQLiteCantOpenDatabaseException e) {
                throw e;
            } catch (SQLiteDatabaseLockedException e2) {
                throw e2;
            }
        }
        return writableDatabase;
    }

    private final SQLiteDatabase getSQLiteDatabaseWithRetries() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (LOCK) {
            int i = 0;
            while (true) {
                try {
                    sQLiteDatabase = getSQLiteDatabase();
                } catch (SQLiteCantOpenDatabaseException e) {
                    i++;
                    if (i >= 5) {
                        throw e;
                    }
                    SystemClock.sleep(i * 400);
                } catch (SQLiteDatabaseLockedException e2) {
                    i++;
                    if (i >= 5) {
                        throw e2;
                    }
                    SystemClock.sleep(i * 400);
                }
            }
        }
        return sQLiteDatabase;
    }

    private final synchronized void internalOnUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2 && i2 >= 2) {
            try {
                upgradeToV2(sQLiteDatabase);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i < 3 && i2 >= 3) {
            upgradeToV3(sQLiteDatabase);
        }
        if (i < 4 && i2 >= 4) {
            upgradeToV4(sQLiteDatabase);
        }
        if (i < 5 && i2 >= 5) {
            upgradeToV5(sQLiteDatabase);
        }
        if (i == 5 && i2 >= 6) {
            upgradeFromV5ToV6(sQLiteDatabase);
        }
        if (i < 7 && i2 >= 7) {
            upgradeToV7(sQLiteDatabase);
        }
        if (i < 8 && i2 >= 8) {
            upgradeToV8(sQLiteDatabase);
        }
        if (i < 9 && i2 >= 9) {
            upgradeToV9(sQLiteDatabase);
        }
    }

    private final void safeExecSQL(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }

    private final void upgradeFromV5ToV6(SQLiteDatabase sQLiteDatabase) throws SQLException {
        this._outcomeTableProvider.upgradeOutcomeTableRevision1To2(sQLiteDatabase);
    }

    private final void upgradeToV2(SQLiteDatabase sQLiteDatabase) throws SQLException {
        safeExecSQL(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        safeExecSQL(sQLiteDatabase, OneSignalDbContract.NotificationTable.INDEX_CREATE_GROUP_ID);
    }

    private final void upgradeToV3(SQLiteDatabase sQLiteDatabase) throws SQLException {
        safeExecSQL(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        safeExecSQL(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
        safeExecSQL(sQLiteDatabase, OneSignalDbContract.NotificationTable.INDEX_CREATE_EXPIRE_TIME);
    }

    private final void upgradeToV4(SQLiteDatabase sQLiteDatabase) throws SQLException {
        safeExecSQL(sQLiteDatabase, OutcomesDbContract.SQL_CREATE_OUTCOME_ENTRIES_V1);
    }

    private final void upgradeToV5(SQLiteDatabase sQLiteDatabase) throws SQLException {
        safeExecSQL(sQLiteDatabase, OutcomesDbContract.SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V1);
        upgradeFromV5ToV6(sQLiteDatabase);
    }

    private final void upgradeToV7(SQLiteDatabase sQLiteDatabase) throws SQLException {
        safeExecSQL(sQLiteDatabase, SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
    }

    private final synchronized void upgradeToV8(SQLiteDatabase sQLiteDatabase) {
        this._outcomeTableProvider.upgradeOutcomeTableRevision2To3(sQLiteDatabase);
        this._outcomeTableProvider.upgradeCacheOutcomeTableRevision1To2(sQLiteDatabase);
    }

    private final void upgradeToV9(SQLiteDatabase sQLiteDatabase) throws SQLException {
        this._outcomeTableProvider.upgradeOutcomeTableRevision3To4(sQLiteDatabase);
    }

    @Override // com.onesignal.core.internal.database.IDatabase
    public void delete(String str, String str2, String[] strArr) {
        String str3;
        String str4;
        sq8.m48649h(str, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    try {
                        sQLiteDatabaseWithRetries.beginTransaction();
                        sQLiteDatabaseWithRetries.delete(str, str2, strArr);
                        sQLiteDatabaseWithRetries.setTransactionSuccessful();
                    } catch (IllegalStateException e) {
                        Logging.error("Error under delete transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e);
                        try {
                            sQLiteDatabaseWithRetries.endTransaction();
                        } catch (SQLiteException e2) {
                            e = e2;
                            str4 = "Error closing transaction! ";
                            Logging.error(str4, e);
                            y3i y3iVar = y3i.f54824a;
                        } catch (IllegalStateException e3) {
                            e = e3;
                            str3 = "Error closing transaction! ";
                            Logging.error(str3, e);
                            y3i y3iVar2 = y3i.f54824a;
                        }
                    }
                } catch (SQLiteException e4) {
                    Logging.error("Error deleting on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e4);
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e5) {
                        e = e5;
                        str4 = "Error closing transaction! ";
                        Logging.error(str4, e);
                        y3i y3iVar22 = y3i.f54824a;
                    } catch (IllegalStateException e6) {
                        e = e6;
                        str3 = "Error closing transaction! ";
                        Logging.error(str3, e);
                        y3i y3iVar222 = y3i.f54824a;
                    }
                }
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e7) {
                    e = e7;
                    str4 = "Error closing transaction! ";
                    Logging.error(str4, e);
                    y3i y3iVar2222 = y3i.f54824a;
                } catch (IllegalStateException e8) {
                    e = e8;
                    str3 = "Error closing transaction! ";
                    Logging.error(str3, e);
                    y3i y3iVar22222 = y3i.f54824a;
                }
                y3i y3iVar222222 = y3i.f54824a;
            } finally {
            }
        }
    }

    @Override // com.onesignal.core.internal.database.IDatabase
    public void insert(String str, String str2, ContentValues contentValues) {
        String str3;
        String str4;
        sq8.m48649h(str, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    try {
                        sQLiteDatabaseWithRetries.beginTransaction();
                        sQLiteDatabaseWithRetries.insert(str, str2, contentValues);
                        sQLiteDatabaseWithRetries.setTransactionSuccessful();
                    } catch (IllegalStateException e) {
                        Logging.error("Error under inserting transaction under table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e);
                        try {
                            sQLiteDatabaseWithRetries.endTransaction();
                        } catch (SQLiteException e2) {
                            e = e2;
                            str4 = "Error closing transaction! ";
                            Logging.error(str4, e);
                            y3i y3iVar = y3i.f54824a;
                        } catch (IllegalStateException e3) {
                            e = e3;
                            str3 = "Error closing transaction! ";
                            Logging.error(str3, e);
                            y3i y3iVar2 = y3i.f54824a;
                        }
                    }
                } catch (SQLiteException e4) {
                    Logging.error("Error inserting on table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e4);
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e5) {
                        e = e5;
                        str4 = "Error closing transaction! ";
                        Logging.error(str4, e);
                        y3i y3iVar22 = y3i.f54824a;
                    } catch (IllegalStateException e6) {
                        e = e6;
                        str3 = "Error closing transaction! ";
                        Logging.error(str3, e);
                        y3i y3iVar222 = y3i.f54824a;
                    }
                }
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e7) {
                    e = e7;
                    str4 = "Error closing transaction! ";
                    Logging.error(str4, e);
                    y3i y3iVar2222 = y3i.f54824a;
                } catch (IllegalStateException e8) {
                    e = e8;
                    str3 = "Error closing transaction! ";
                    Logging.error(str3, e);
                    y3i y3iVar22222 = y3i.f54824a;
                }
                y3i y3iVar222222 = y3i.f54824a;
            } finally {
            }
        }
    }

    @Override // com.onesignal.core.internal.database.IDatabase
    public void insertOrThrow(String str, String str2, ContentValues contentValues) {
        String str3;
        String str4;
        sq8.m48649h(str, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    try {
                        sQLiteDatabaseWithRetries.beginTransaction();
                        sQLiteDatabaseWithRetries.insertOrThrow(str, str2, contentValues);
                        sQLiteDatabaseWithRetries.setTransactionSuccessful();
                    } catch (IllegalStateException e) {
                        Logging.error("Error under inserting or throw transaction under table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e);
                        try {
                            sQLiteDatabaseWithRetries.endTransaction();
                        } catch (SQLiteException e2) {
                            e = e2;
                            str4 = "Error closing transaction! ";
                            Logging.error(str4, e);
                            y3i y3iVar = y3i.f54824a;
                        } catch (IllegalStateException e3) {
                            e = e3;
                            str3 = "Error closing transaction! ";
                            Logging.error(str3, e);
                            y3i y3iVar2 = y3i.f54824a;
                        }
                    }
                } catch (SQLiteException e4) {
                    Logging.error("Error inserting or throw on table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e4);
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e5) {
                        e = e5;
                        str4 = "Error closing transaction! ";
                        Logging.error(str4, e);
                        y3i y3iVar22 = y3i.f54824a;
                    } catch (IllegalStateException e6) {
                        e = e6;
                        str3 = "Error closing transaction! ";
                        Logging.error(str3, e);
                        y3i y3iVar222 = y3i.f54824a;
                    }
                }
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e7) {
                    e = e7;
                    str4 = "Error closing transaction! ";
                    Logging.error(str4, e);
                    y3i y3iVar2222 = y3i.f54824a;
                } catch (IllegalStateException e8) {
                    e = e8;
                    str3 = "Error closing transaction! ";
                    Logging.error(str3, e);
                    y3i y3iVar22222 = y3i.f54824a;
                }
                y3i y3iVar222222 = y3i.f54824a;
            } finally {
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sq8.m48649h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
        sQLiteDatabase.execSQL(OutcomesDbContract.SQL_CREATE_OUTCOME_ENTRIES_V4);
        sQLiteDatabase.execSQL(OutcomesDbContract.SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V2);
        sQLiteDatabase.execSQL(SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
        for (String str : SQL_INDEX_ENTRIES) {
            sQLiteDatabase.execSQL(str);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws IllegalAccessException, IOException, SQLException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(sQLiteDatabase, "db");
        Logging.warn$default("SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.", null, 2, null);
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        try {
            ArrayList<String> arrayList = new ArrayList(cursorRawQuery.getCount());
            while (cursorRawQuery.moveToNext()) {
                String string = cursorRawQuery.getString(0);
                sq8.m48648g(string, "it.getString(0)");
                arrayList.add(string);
            }
            for (String str : arrayList) {
                if (!e9g.m24597K(str, "sqlite_", false, 2, null)) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                }
            }
            y3i y3iVar = y3i.f54824a;
            tb3.m49666a(cursorRawQuery, null);
            onCreate(sQLiteDatabase);
        } finally {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sq8.m48649h(sQLiteDatabase, "db");
        Logging.debug$default("OneSignal Database onUpgrade from: " + i + " to: " + i2, null, 2, null);
        try {
            internalOnUpgrade(sQLiteDatabase, i, i2);
        } catch (SQLiteException e) {
            Logging.error("Error in upgrade, migration may have already run! Skipping!", e);
        }
    }

    @Override // com.onesignal.core.internal.database.IDatabase
    public void query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, xk7 xk7Var) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Cursor cursorQuery;
        sq8.m48649h(str, "table");
        sq8.m48649h(xk7Var, "action");
        synchronized (LOCK) {
            if (str6 == null) {
                cursorQuery = getSQLiteDatabaseWithRetries().query(str, strArr, str2, strArr2, str3, str4, str5);
                sq8.m48648g(cursorQuery, "getSQLiteDatabaseWithRet…By,\n                    )");
            } else {
                cursorQuery = getSQLiteDatabaseWithRetries().query(str, strArr, str2, strArr2, str3, str4, str5, str6);
                sq8.m48648g(cursorQuery, "getSQLiteDatabaseWithRet…it,\n                    )");
            }
            y3i y3iVar = y3i.f54824a;
        }
        try {
            xk7Var.invoke(new DatabaseCursor(cursorQuery));
            tb3.m49666a(cursorQuery, null);
        } finally {
        }
    }

    @Override // com.onesignal.core.internal.database.IDatabase
    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        String str3;
        String str4;
        sq8.m48649h(str, "table");
        sq8.m48649h(contentValues, "values");
        String string = contentValues.toString();
        sq8.m48648g(string, "values.toString()");
        int iUpdate = 0;
        if (string.length() == 0) {
            return 0;
        }
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    iUpdate = sQLiteDatabaseWithRetries.update(str, contentValues, str2, strArr);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } catch (SQLiteException e) {
                    Logging.error("Error updating on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e);
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e2) {
                        e = e2;
                        str4 = "Error closing transaction! ";
                        Logging.error(str4, e);
                        y3i y3iVar = y3i.f54824a;
                        return iUpdate;
                    } catch (IllegalStateException e3) {
                        e = e3;
                        str3 = "Error closing transaction! ";
                        Logging.error(str3, e);
                        y3i y3iVar2 = y3i.f54824a;
                        return iUpdate;
                    }
                } catch (IllegalStateException e4) {
                    Logging.error("Error under update transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e4);
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e5) {
                        e = e5;
                        str4 = "Error closing transaction! ";
                        Logging.error(str4, e);
                        y3i y3iVar22 = y3i.f54824a;
                        return iUpdate;
                    } catch (IllegalStateException e6) {
                        e = e6;
                        str3 = "Error closing transaction! ";
                        Logging.error(str3, e);
                        y3i y3iVar222 = y3i.f54824a;
                        return iUpdate;
                    }
                }
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e7) {
                    e = e7;
                    str4 = "Error closing transaction! ";
                    Logging.error(str4, e);
                    y3i y3iVar2222 = y3i.f54824a;
                    return iUpdate;
                } catch (IllegalStateException e8) {
                    e = e8;
                    str3 = "Error closing transaction! ";
                    Logging.error(str3, e);
                    y3i y3iVar22222 = y3i.f54824a;
                    return iUpdate;
                }
                y3i y3iVar222222 = y3i.f54824a;
            } finally {
            }
        }
        return iUpdate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSDatabase(OutcomeTableProvider outcomeTableProvider, Context context, int i) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, i);
        sq8.m48649h(outcomeTableProvider, "_outcomeTableProvider");
        this._outcomeTableProvider = outcomeTableProvider;
    }
}
