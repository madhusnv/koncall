package p001o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public interface leg extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener);

    void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener);

    peg compileStatement(String str);

    int delete(String str, String str2, Object[] objArr);

    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    default void execPerConnectionSQL(String str, Object[] objArr) {
        sq8.m48649h(str, "sql");
        throw new UnsupportedOperationException();
    }

    void execSQL(String str);

    void execSQL(String str, Object[] objArr);

    List getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    String getPath();

    int getVersion();

    boolean inTransaction();

    long insert(String str, int i, ContentValues contentValues);

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    default boolean isExecPerConnectionSQLSupported() {
        return false;
    }

    boolean isOpen();

    boolean isReadOnly();

    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int i);

    Cursor query(String str);

    Cursor query(String str, Object[] objArr);

    Cursor query(oeg oegVar);

    Cursor query(oeg oegVar, CancellationSignal cancellationSignal);

    void setForeignKeyConstraintsEnabled(boolean z);

    void setLocale(Locale locale);

    void setMaxSqlCacheSize(int i);

    long setMaximumSize(long j);

    void setPageSize(long j);

    void setTransactionSuccessful();

    void setVersion(int i);

    int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    boolean yieldIfContendedSafely();

    boolean yieldIfContendedSafely(long j);
}
