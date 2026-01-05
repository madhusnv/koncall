package com.amplifyframework.datastore.storage.sqlite;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.Empty;
import com.amplifyframework.util.Wrap;
import java.util.HashSet;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
final class SQLiteStorageHelper extends SQLiteOpenHelper implements ModelUpdateStrategy<SQLiteDatabase, String> {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private static final String SQLITE_SYSTEM_TABLE_PREFIX = "sqlite_";
    private final CreateSqlCommands createSqlCommands;

    private SQLiteStorageHelper(Context context, String str, int i, CreateSqlCommands createSqlCommands) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.createSqlCommands = createSqlCommands;
    }

    private void createTablesAndIndexes(SQLiteDatabase sQLiteDatabase) {
        Objects.requireNonNull(sQLiteDatabase);
        sQLiteDatabase.beginTransaction();
        try {
            for (SqlCommand sqlCommand : this.createSqlCommands.getCreateTableCommands()) {
                LOG.info("Creating table: " + sqlCommand.tableName());
                sQLiteDatabase.execSQL(sqlCommand.sqlStatement());
            }
            for (SqlCommand sqlCommand2 : this.createSqlCommands.getCreateIndexCommands()) {
                LOG.info("Creating index for table: " + sqlCommand2.tableName());
                sQLiteDatabase.execSQL(sqlCommand2.sqlStatement());
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private void dropAllTables(SQLiteDatabase sQLiteDatabase) throws SQLException {
        Objects.requireNonNull(sQLiteDatabase);
        sQLiteDatabase.execSQL("PRAGMA foreign_keys = OFF;");
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
            try {
                Objects.requireNonNull(cursorRawQuery);
                HashSet<String> hashSet = new HashSet();
                while (cursorRawQuery.moveToNext()) {
                    hashSet.add(cursorRawQuery.getString(0));
                }
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("PRAGMA foreign_keys = OFF;");
                for (String str : hashSet) {
                    if (!str.startsWith(SQLITE_SYSTEM_TABLE_PREFIX)) {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Wrap.inBackticks(str));
                        LOG.debug("Dropped table: " + str);
                    }
                }
                sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON;");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                cursorRawQuery.close();
            } finally {
            }
        } finally {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON;");
        }
    }

    public static SQLiteStorageHelper getInstance(Context context, String str, int i, CreateSqlCommands createSqlCommands) {
        return new SQLiteStorageHelper(context, str, i, createSqlCommands);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onCreate(SQLiteDatabase sQLiteDatabase) {
        createTablesAndIndexes(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON;");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            sQLiteDatabase.beginTransaction();
            try {
                for (SqlCommand sqlCommand : this.createSqlCommands.getCreateTableCommands()) {
                    if (!Empty.check(sqlCommand.tableName())) {
                        sQLiteDatabase.execSQL("drop table if exists " + Wrap.inBackticks(sqlCommand.tableName()));
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                onCreate(sQLiteDatabase);
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
    }

    @Override // com.amplifyframework.datastore.storage.sqlite.ModelUpdateStrategy
    public synchronized void update(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Objects.requireNonNull(sQLiteDatabase);
        Objects.requireNonNull(str);
        Objects.requireNonNull(str2);
        if (!s6c.m47909a(str, str2)) {
            dropAllTables(sQLiteDatabase);
            onCreate(sQLiteDatabase);
        }
    }
}
