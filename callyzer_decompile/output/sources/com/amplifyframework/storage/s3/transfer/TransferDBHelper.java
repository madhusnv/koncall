package com.amplifyframework.storage.s3.transfer;

import a2.AbstractC0030c;
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
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import i0.m0;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferDBHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 10);
        AbstractC4154l.m8923f(context, "context");
        this.context = context;
        Logger logger = Amplify.Logging.logger(CategoryType.STORAGE, String.format(AWSS3StoragePlugin.AWS_S3_STORAGE_LOG_NAMESPACE, Arrays.copyOf(new Object[]{"TransferDBHelper"}, 1)));
        AbstractC4154l.m8922e(logger, "logger(...)");
        this.logger = logger;
        String packageName = context.getApplicationContext().getPackageName();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        AbstractC4154l.m8922e(writableDatabase, "getWritableDatabase(...)");
        this.database = writableDatabase;
        Uri uri = Uri.parse("content://" + packageName + "/transfers");
        AbstractC4154l.m8922e(uri, "parse(...)");
        this.contentUri = uri;
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.uriMatcher = uriMatcher;
        uriMatcher.addURI(packageName, BASE_PATH, 10);
        uriMatcher.addURI(packageName, "transfers/#", 20);
        uriMatcher.addURI(packageName, "transfers/part/#", 30);
        uriMatcher.addURI(packageName, "transfers/state/*", 40);
        uriMatcher.addURI(packageName, "transfers/transferId/*", 50);
    }

    public static /* synthetic */ int delete$aws_storage_s3_release$default(TransferDBHelper transferDBHelper, Uri uri, String str, String[] strArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            strArr = null;
        }
        return transferDBHelper.delete$aws_storage_s3_release(uri, str, strArr);
    }

    private final synchronized void ensureDatabaseOpen() {
        if (!this.database.isOpen()) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            AbstractC4154l.m8922e(writableDatabase, "getWritableDatabase(...)");
            this.database = writableDatabase;
        }
    }

    public static /* synthetic */ Cursor query$aws_storage_s3_release$default(TransferDBHelper transferDBHelper, Uri uri, String[] strArr, String str, String[] strArr2, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            strArr = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            strArr2 = null;
        }
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        return transferDBHelper.query$aws_storage_s3_release(uri, strArr, str, strArr2, str2);
    }

    public final int bulkInsert$aws_storage_s3_release(Uri uri, ContentValues[] valuesArray) {
        AbstractC4154l.m8923f(uri, "uri");
        AbstractC4154l.m8923f(valuesArray, "valuesArray");
        int iMatch = this.uriMatcher.match(uri);
        ensureDatabaseOpen();
        if (iMatch != 10) {
            throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        int iInsertOrThrow = 0;
        try {
            try {
                this.database.beginTransaction();
                iInsertOrThrow = (int) this.database.insertOrThrow(TransferTable.TABLE_TRANSFER, null, valuesArray[0]);
                int length = valuesArray.length;
                for (int i10 = 1; i10 < length; i10++) {
                    ContentValues contentValues = valuesArray[i10];
                    if (contentValues != null) {
                        contentValues.put(TransferTable.COLUMN_MAIN_UPLOAD_ID, Integer.valueOf(iInsertOrThrow));
                    }
                    this.database.insertOrThrow(TransferTable.TABLE_TRANSFER, null, valuesArray[i10]);
                }
                this.database.setTransactionSuccessful();
            } catch (Exception e2) {
                this.logger.error("bulkInsert error : ", e2);
            }
            this.database.endTransaction();
            return iInsertOrThrow;
        } catch (Throwable th2) {
            this.database.endTransaction();
            throw th2;
        }
    }

    public final int delete$aws_storage_s3_release(Uri uri, String str, String[] strArr) {
        AbstractC4154l.m8923f(uri, "uri");
        int iMatch = this.uriMatcher.match(uri);
        ensureDatabaseOpen();
        if (iMatch == 10) {
            return this.database.delete(TransferTable.TABLE_TRANSFER, str, strArr);
        }
        if (iMatch != 20 && iMatch != 30 && iMatch != 50) {
            throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        String str2 = iMatch != 30 ? iMatch != 50 ? TransferTable.COLUMN_ID : TransferTable.COLUMN_TRANSFER_ID : TransferTable.COLUMN_MAIN_UPLOAD_ID;
        String lastPathSegment = uri.getLastPathSegment();
        if (TextUtils.isEmpty(str)) {
            return this.database.delete(TransferTable.TABLE_TRANSFER, m0.m7379l(str2, "=", lastPathSegment), null);
        }
        SQLiteDatabase sQLiteDatabase = this.database;
        StringBuilder sbM127r = AbstractC0030c.m127r("$", str2, "=", lastPathSegment, " and ");
        sbM127r.append(str);
        return sQLiteDatabase.delete(TransferTable.TABLE_TRANSFER, sbM127r.toString(), strArr);
    }

    public final Uri getContentUri$aws_storage_s3_release() {
        return this.contentUri;
    }

    public final Uri insert$aws_storage_s3_release(Uri uri, ContentValues values) throws SQLException {
        AbstractC4154l.m8923f(uri, "uri");
        AbstractC4154l.m8923f(values, "values");
        int iMatch = this.uriMatcher.match(uri);
        ensureDatabaseOpen();
        if (iMatch != 10) {
            throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        Uri uri2 = Uri.parse("transfers/" + this.database.insertOrThrow(TransferTable.TABLE_TRANSFER, null, values));
        AbstractC4154l.m8922e(uri2, "parse(...)");
        return uri2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase database) {
        AbstractC4154l.m8923f(database, "database");
        TransferTable.Companion.onCreate(database, 10);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase database, int i10, int i11) {
        AbstractC4154l.m8923f(database, "database");
        this.context.deleteDatabase(DATABASE_NAME);
        onCreate(database);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase database, int i10, int i11) {
        AbstractC4154l.m8923f(database, "database");
        TransferTable.Companion.onUpgrade(database, i10, i11);
    }

    public final Cursor query$aws_storage_s3_release(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC4154l.m8923f(uri, "uri");
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(TransferTable.TABLE_TRANSFER);
        int iMatch = this.uriMatcher.match(uri);
        if (iMatch == 10) {
            sQLiteQueryBuilder.appendWhere("part_num=0");
        } else if (iMatch == 20) {
            sQLiteQueryBuilder.appendWhere("_id=" + uri.getLastPathSegment());
        } else if (iMatch == 30) {
            sQLiteQueryBuilder.appendWhere("main_upload_id=" + uri.getLastPathSegment());
        } else if (iMatch == 40) {
            sQLiteQueryBuilder.appendWhere("state=");
            String lastPathSegment = uri.getLastPathSegment();
            AbstractC4154l.m8920c(lastPathSegment);
            sQLiteQueryBuilder.appendWhereEscapeString(lastPathSegment);
        } else {
            if (iMatch != 50) {
                throw new IllegalArgumentException("Unknown URI: " + uri);
            }
            sQLiteQueryBuilder.appendWhere("transfer_id='" + uri.getLastPathSegment() + "'");
        }
        ensureDatabaseOpen();
        Cursor cursorQuery = sQLiteQueryBuilder.query(this.database, strArr, str, strArr2, null, null, str2);
        AbstractC4154l.m8922e(cursorQuery, "query(...)");
        return cursorQuery;
    }

    public final synchronized int update$aws_storage_s3_release(Uri uri, ContentValues values, String str, String[] strArr) {
        int iUpdate;
        try {
            AbstractC4154l.m8923f(uri, "uri");
            AbstractC4154l.m8923f(values, "values");
            int iMatch = this.uriMatcher.match(uri);
            ensureDatabaseOpen();
            if (iMatch == 10) {
                iUpdate = this.database.update(TransferTable.TABLE_TRANSFER, values, str, strArr);
            } else {
                if (iMatch != 20) {
                    throw new IllegalArgumentException("Unknown URI: " + uri);
                }
                String lastPathSegment = uri.getLastPathSegment();
                if (TextUtils.isEmpty(str)) {
                    iUpdate = this.database.update(TransferTable.TABLE_TRANSFER, values, "_id=" + lastPathSegment, null);
                } else {
                    iUpdate = this.database.update(TransferTable.TABLE_TRANSFER, values, "_id=" + lastPathSegment + " and " + str, strArr);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iUpdate;
    }
}
