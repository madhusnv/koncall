package com.amplifyframework.storage.s3.transfer;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import java.util.Arrays;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class TransferDBHelper extends SQLiteOpenHelper {
    private static final String BASE_PATH = "transfers";
    public static final Companion Companion = new Companion(null);
    private static final String DATABASE_NAME = "awss3transfertable.db";
    private static final int DATABASE_VERSION = 10;
    private static final int TRANSFERS = 10;
    private static final int TRANSFER_ID = 20;
    private static final int TRANSFER_PART = 30;
    private static final int TRANSFER_RECORD_ID = 50;
    private static final int TRANSFER_STATE = 40;
    private final Uri contentUri;
    private final Context context;
    private SQLiteDatabase database;
    private final Logger logger;
    private final UriMatcher uriMatcher;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferDBHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 10);
        sq8.m48649h(context, "context");
        this.context = context;
        LoggingCategory loggingCategory = Amplify.Logging;
        CategoryType categoryType = CategoryType.STORAGE;
        String str = String.format(AWSS3StoragePlugin.AWS_S3_STORAGE_LOG_NAMESPACE, Arrays.copyOf(new Object[]{TransferDBHelper.class.getSimpleName()}, 1));
        sq8.m48648g(str, "format(...)");
        Logger logger = loggingCategory.logger(categoryType, str);
        sq8.m48648g(logger, "logger(...)");
        this.logger = logger;
        String packageName = context.getApplicationContext().getPackageName();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        sq8.m48648g(writableDatabase, "getWritableDatabase(...)");
        this.database = writableDatabase;
        Uri uri = Uri.parse("content://" + packageName + "/transfers");
        sq8.m48648g(uri, "parse(...)");
        this.contentUri = uri;
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.uriMatcher = uriMatcher;
        uriMatcher.addURI(packageName, BASE_PATH, 10);
        uriMatcher.addURI(packageName, "transfers/#", 20);
        uriMatcher.addURI(packageName, "transfers/part/#", TRANSFER_PART);
        uriMatcher.addURI(packageName, "transfers/state/*", 40);
        uriMatcher.addURI(packageName, "transfers/transferId/*", 50);
    }

    public static /* synthetic */ int delete$aws_storage_s3_release$default(TransferDBHelper transferDBHelper, Uri uri, String str, String[] strArr, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            strArr = null;
        }
        return transferDBHelper.delete$aws_storage_s3_release(uri, str, strArr);
    }

    private final synchronized void ensureDatabaseOpen() {
        if (!this.database.isOpen()) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            sq8.m48648g(writableDatabase, "getWritableDatabase(...)");
            this.database = writableDatabase;
        }
    }

    public final int bulkInsert$aws_storage_s3_release(Uri uri, ContentValues[] contentValuesArr) {
        sq8.m48649h(uri, "uri");
        sq8.m48649h(contentValuesArr, "valuesArray");
        int iMatch = this.uriMatcher.match(uri);
        ensureDatabaseOpen();
        if (iMatch != 10) {
            throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        int iInsertOrThrow = 0;
        try {
            try {
                this.database.beginTransaction();
                iInsertOrThrow = (int) this.database.insertOrThrow(TransferTable.TABLE_TRANSFER, null, contentValuesArr[0]);
                int length = contentValuesArr.length;
                for (int i = 1; i < length; i++) {
                    ContentValues contentValues = contentValuesArr[i];
                    if (contentValues != null) {
                        contentValues.put(TransferTable.COLUMN_MAIN_UPLOAD_ID, Integer.valueOf(iInsertOrThrow));
                    }
                    this.database.insertOrThrow(TransferTable.TABLE_TRANSFER, null, contentValuesArr[i]);
                }
                this.database.setTransactionSuccessful();
            } catch (Exception e) {
                this.logger.error("bulkInsert error : ", e);
            }
            return iInsertOrThrow;
        } finally {
            this.database.endTransaction();
        }
    }

    public final int delete$aws_storage_s3_release(Uri uri, String str, String[] strArr) {
        sq8.m48649h(uri, "uri");
        int iMatch = this.uriMatcher.match(uri);
        ensureDatabaseOpen();
        if (iMatch == 10) {
            return this.database.delete(TransferTable.TABLE_TRANSFER, str, strArr);
        }
        if (iMatch != 20 && iMatch != TRANSFER_PART && iMatch != 50) {
            throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        String str2 = iMatch != TRANSFER_PART ? iMatch != 50 ? "_id" : TransferTable.COLUMN_TRANSFER_ID : TransferTable.COLUMN_MAIN_UPLOAD_ID;
        String lastPathSegment = uri.getLastPathSegment();
        if (TextUtils.isEmpty(str)) {
            return this.database.delete(TransferTable.TABLE_TRANSFER, str2 + "=" + lastPathSegment, null);
        }
        return this.database.delete(TransferTable.TABLE_TRANSFER, "$" + str2 + "=" + lastPathSegment + " and " + str, strArr);
    }

    public final Uri getContentUri$aws_storage_s3_release() {
        return this.contentUri;
    }

    public final Uri insert$aws_storage_s3_release(Uri uri, ContentValues contentValues) throws SQLException {
        sq8.m48649h(uri, "uri");
        sq8.m48649h(contentValues, "values");
        int iMatch = this.uriMatcher.match(uri);
        ensureDatabaseOpen();
        if (iMatch != 10) {
            throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        Uri uri2 = Uri.parse("transfers/" + this.database.insertOrThrow(TransferTable.TABLE_TRANSFER, null, contentValues));
        sq8.m48648g(uri2, "parse(...)");
        return uri2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sq8.m48649h(sQLiteDatabase, "database");
        TransferTable.Companion.onCreate(sQLiteDatabase, 10);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sq8.m48649h(sQLiteDatabase, "database");
        this.context.deleteDatabase(DATABASE_NAME);
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sq8.m48649h(sQLiteDatabase, "database");
        TransferTable.Companion.onUpgrade(sQLiteDatabase, i, i2);
    }

    public final Cursor query$aws_storage_s3_release(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        sq8.m48649h(uri, "uri");
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(TransferTable.TABLE_TRANSFER);
        int iMatch = this.uriMatcher.match(uri);
        if (iMatch == 10) {
            sQLiteQueryBuilder.appendWhere("part_num=0");
        } else if (iMatch == 20) {
            sQLiteQueryBuilder.appendWhere("_id=" + uri.getLastPathSegment());
        } else if (iMatch == TRANSFER_PART) {
            sQLiteQueryBuilder.appendWhere("main_upload_id=" + uri.getLastPathSegment());
        } else if (iMatch == 40) {
            sQLiteQueryBuilder.appendWhere("state=");
            String lastPathSegment = uri.getLastPathSegment();
            sq8.m48646e(lastPathSegment);
            sQLiteQueryBuilder.appendWhereEscapeString(lastPathSegment);
        } else {
            if (iMatch != 50) {
                throw new IllegalArgumentException("Unknown URI: " + uri);
            }
            sQLiteQueryBuilder.appendWhere("transfer_id='" + uri.getLastPathSegment() + "'");
        }
        ensureDatabaseOpen();
        Cursor cursorQuery = sQLiteQueryBuilder.query(this.database, strArr, str, strArr2, null, null, str2);
        sq8.m48648g(cursorQuery, "query(...)");
        return cursorQuery;
    }

    public final synchronized int update$aws_storage_s3_release(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int iUpdate;
        sq8.m48649h(uri, "uri");
        sq8.m48649h(contentValues, "values");
        int iMatch = this.uriMatcher.match(uri);
        ensureDatabaseOpen();
        if (iMatch == 10) {
            iUpdate = this.database.update(TransferTable.TABLE_TRANSFER, contentValues, str, strArr);
        } else {
            if (iMatch != 20) {
                throw new IllegalArgumentException("Unknown URI: " + uri);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (TextUtils.isEmpty(str)) {
                iUpdate = this.database.update(TransferTable.TABLE_TRANSFER, contentValues, "_id=" + lastPathSegment, null);
            } else {
                iUpdate = this.database.update(TransferTable.TABLE_TRANSFER, contentValues, "_id=" + lastPathSegment + " and " + str, strArr);
            }
        }
        return iUpdate;
    }
}
