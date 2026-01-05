package com.amplifyframework.storage.s3.transfer;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TransferTable {
    public static final String COLUMN_BUCKET_NAME = "bucket_name";
    public static final String COLUMN_BYTES_CURRENT = "bytes_current";
    public static final String COLUMN_BYTES_TOTAL = "bytes_total";
    public static final String COLUMN_CANNED_ACL = "canned_acl";
    public static final String COLUMN_CONTENT_MD5 = "content_md5";
    public static final String COLUMN_DATA_RANGE_LAST = "range_last";
    public static final String COLUMN_DATA_RANGE_START = "range_start";
    public static final String COLUMN_ETAG = "etag";
    public static final String COLUMN_EXPIRATION_TIME_RULE_ID = "expiration_time_rule_id";
    public static final String COLUMN_FILE = "file";
    public static final String COLUMN_FILE_OFFSET = "file_offset";
    public static final String COLUMN_HEADER_CACHE_CONTROL = "header_cache_control";
    public static final String COLUMN_HEADER_CONTENT_DISPOSITION = "header_content_disposition";
    public static final String COLUMN_HEADER_CONTENT_ENCODING = "header_content_encoding";
    public static final String COLUMN_HEADER_CONTENT_LANGUAGE = "header_content_language";
    public static final String COLUMN_HEADER_CONTENT_TYPE = "header_content_type";
    public static final String COLUMN_HEADER_EXPIRE = "header_expire";
    public static final String COLUMN_HEADER_STORAGE_CLASS = "header_storage_class";
    public static final String COLUMN_HTTP_EXPIRES_DATE = "http_expires_date";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_IS_ENCRYPTED = "is_encrypted";
    public static final String COLUMN_IS_LAST_PART = "is_last_part";
    public static final String COLUMN_IS_MULTIPART = "is_multipart";
    public static final String COLUMN_IS_REQUESTER_PAYS = "is_requester_pays";
    public static final String COLUMN_KEY = "key";
    public static final String COLUMN_MAIN_UPLOAD_ID = "main_upload_id";
    public static final String COLUMN_MULTIPART_ID = "multipart_id";
    public static final String COLUMN_PART_NUM = "part_num";
    public static final String COLUMN_REGION = "region";
    public static final String COLUMN_SPEED = "speed";
    public static final String COLUMN_SSE_ALGORITHM = "sse_algorithm";
    public static final String COLUMN_SSE_KMS_KEY = "kms_key";
    public static final String COLUMN_STATE = "state";
    public static final String COLUMN_TRANSFER_ID = "transfer_id";
    public static final String COLUMN_TRANSFER_UTILITY_OPTIONS = "transfer_utility_options";
    public static final String COLUMN_TYPE = "type";
    public static final String COLUMN_USER_METADATA = "user_metadata";
    public static final String COLUMN_USE_ACCELERATE_ENDPOINT = "useAccelerateEndpoint";
    public static final String COLUMN_VERSION_ID = "version_id";
    public static final String COLUMN_WORKMANAGER_REQUEST_ID = "workmanager_request_id";
    public static final Companion Companion = new Companion(null);
    public static final String DATABASE_CREATE = "create table awstransfer (_id integer primary key autoincrement, main_upload_id integer, type  text not null, state text not null, bucket_name text not null, key text not null,version_id text, bytes_total bigint, bytes_current bigint, speed bigint, is_requester_pays integer, is_encrypted integer, file text not null, file_offset bigint, is_multipart int, part_num int not null, is_last_part integer, multipart_id text, etag text, range_start bigint, range_last bigint, header_content_type text, header_content_language text, header_content_disposition text, header_content_encoding text, header_cache_control text, header_expire text);";
    public static final String TABLE_TRANSFER = "awstransfer";
    private static final int TABLE_VERSION_10 = 10;
    private static final int TABLE_VERSION_2 = 2;
    private static final int TABLE_VERSION_3 = 3;
    private static final int TABLE_VERSION_4 = 4;
    private static final int TABLE_VERSION_5 = 5;
    private static final int TABLE_VERSION_6 = 6;
    private static final int TABLE_VERSION_7 = 7;
    private static final int TABLE_VERSION_8 = 8;
    private static final int TABLE_VERSION_9 = 9;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private final void addVersion10Columns(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN region text DEFAULT null;");
        }

        private final void addVersion2Columns(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN user_metadata text;");
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN expiration_time_rule_id text;");
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN http_expires_date text;");
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN sse_algorithm text;");
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN content_md5 text;");
        }

        private final void addVersion3Columns(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN kms_key text;");
        }

        private final void addVersion4Columns(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN canned_acl text;");
        }

        private final void addVersion5Columns(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN header_storage_class text;");
        }

        private final void addVersion6Columns(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN transfer_utility_options text;");
        }

        private final void addVersion7Columns(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN workmanager_request_id text;");
        }

        private final void addVersion8Columns(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN transfer_id text DEFAULT '" + UUID.randomUUID() + "';");
        }

        private final void addVersion9Columns(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("ALTER TABLE awstransfer ADD COLUMN useAccelerateEndpoint int DEFAULT 0;");
        }

        public final void onCreate(SQLiteDatabase database, int i10) {
            AbstractC4154l.m8923f(database, "database");
            database.execSQL(TransferTable.DATABASE_CREATE);
            onUpgrade(database, 1, i10);
        }

        public final void onUpgrade(SQLiteDatabase database, int i10, int i11) {
            AbstractC4154l.m8923f(database, "database");
            database.beginTransaction();
            int i12 = i10 + 1;
            if (i12 <= 2 && 2 <= i11) {
                addVersion2Columns(database);
            }
            if (i12 <= 3 && 3 <= i11) {
                addVersion3Columns(database);
            }
            if (i12 <= 4 && 4 <= i11) {
                addVersion4Columns(database);
            }
            if (i12 <= 5 && 5 <= i11) {
                addVersion5Columns(database);
            }
            if (i12 <= 6 && 6 <= i11) {
                addVersion6Columns(database);
            }
            if (i12 <= 7 && 7 <= i11) {
                addVersion7Columns(database);
            }
            if (i12 <= 8 && 8 <= i11) {
                addVersion8Columns(database);
            }
            if (i12 <= 9 && 9 <= i11) {
                addVersion9Columns(database);
            }
            if (i12 <= 10 && 10 <= i11) {
                addVersion10Columns(database);
            }
            database.setTransactionSuccessful();
            database.endTransaction();
        }

        private Companion() {
        }
    }

    public static final void onCreate(SQLiteDatabase sQLiteDatabase, int i10) {
        Companion.onCreate(sQLiteDatabase, i10);
    }

    public static final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        Companion.onUpgrade(sQLiteDatabase, i10, i11);
    }
}
