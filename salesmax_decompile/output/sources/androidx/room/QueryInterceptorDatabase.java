package androidx.room;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.QueryInterceptorDatabase;
import androidx.room.RoomDatabase;
import com.google.android.gms.actions.SearchIntents;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import p001o.bh3;
import p001o.ch3;
import p001o.gp0;
import p001o.hh3;
import p001o.leg;
import p001o.oeg;
import p001o.peg;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class QueryInterceptorDatabase implements leg {
    private final leg delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;

    public QueryInterceptorDatabase(leg legVar, Executor executor, RoomDatabase.QueryCallback queryCallback) {
        sq8.m48649h(legVar, "delegate");
        sq8.m48649h(executor, "queryCallbackExecutor");
        sq8.m48649h(queryCallback, "queryCallback");
        this.delegate = legVar;
        this.queryCallbackExecutor = executor;
        this.queryCallback = queryCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransaction$lambda$0(QueryInterceptorDatabase queryInterceptorDatabase) {
        sq8.m48649h(queryInterceptorDatabase, "this$0");
        queryInterceptorDatabase.queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", ch3.m21246k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransactionNonExclusive$lambda$1(QueryInterceptorDatabase queryInterceptorDatabase) {
        sq8.m48649h(queryInterceptorDatabase, "this$0");
        queryInterceptorDatabase.queryCallback.onQuery("BEGIN DEFERRED TRANSACTION", ch3.m21246k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransactionWithListener$lambda$2(QueryInterceptorDatabase queryInterceptorDatabase) {
        sq8.m48649h(queryInterceptorDatabase, "this$0");
        queryInterceptorDatabase.queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", ch3.m21246k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransactionWithListenerNonExclusive$lambda$3(QueryInterceptorDatabase queryInterceptorDatabase) {
        sq8.m48649h(queryInterceptorDatabase, "this$0");
        queryInterceptorDatabase.queryCallback.onQuery("BEGIN DEFERRED TRANSACTION", ch3.m21246k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endTransaction$lambda$4(QueryInterceptorDatabase queryInterceptorDatabase) {
        sq8.m48649h(queryInterceptorDatabase, "this$0");
        queryInterceptorDatabase.queryCallback.onQuery("END TRANSACTION", ch3.m21246k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execSQL$lambda$10(QueryInterceptorDatabase queryInterceptorDatabase, String str) {
        sq8.m48649h(queryInterceptorDatabase, "this$0");
        sq8.m48649h(str, "$sql");
        queryInterceptorDatabase.queryCallback.onQuery(str, ch3.m21246k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execSQL$lambda$12(QueryInterceptorDatabase queryInterceptorDatabase, String str, List list) {
        sq8.m48649h(queryInterceptorDatabase, "this$0");
        sq8.m48649h(str, "$sql");
        sq8.m48649h(list, "$inputArguments");
        queryInterceptorDatabase.queryCallback.onQuery(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$6(QueryInterceptorDatabase queryInterceptorDatabase, String str) {
        sq8.m48649h(queryInterceptorDatabase, "this$0");
        sq8.m48649h(str, "$query");
        queryInterceptorDatabase.queryCallback.onQuery(str, ch3.m21246k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$7(QueryInterceptorDatabase queryInterceptorDatabase, String str, Object[] objArr) {
        sq8.m48649h(queryInterceptorDatabase, "this$0");
        sq8.m48649h(str, "$query");
        sq8.m48649h(objArr, "$bindArgs");
        queryInterceptorDatabase.queryCallback.onQuery(str, gp0.D0(objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$8(QueryInterceptorDatabase queryInterceptorDatabase, oeg oegVar, QueryInterceptorProgram queryInterceptorProgram) {
        sq8.m48649h(queryInterceptorDatabase, "this$0");
        sq8.m48649h(oegVar, "$query");
        sq8.m48649h(queryInterceptorProgram, "$queryInterceptorProgram");
        queryInterceptorDatabase.queryCallback.onQuery(oegVar.getSql(), queryInterceptorProgram.getBindArgsCache$room_runtime_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$9(QueryInterceptorDatabase queryInterceptorDatabase, oeg oegVar, QueryInterceptorProgram queryInterceptorProgram) {
        sq8.m48649h(queryInterceptorDatabase, "this$0");
        sq8.m48649h(oegVar, "$query");
        sq8.m48649h(queryInterceptorProgram, "$queryInterceptorProgram");
        queryInterceptorDatabase.queryCallback.onQuery(oegVar.getSql(), queryInterceptorProgram.getBindArgsCache$room_runtime_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTransactionSuccessful$lambda$5(QueryInterceptorDatabase queryInterceptorDatabase) {
        sq8.m48649h(queryInterceptorDatabase, "this$0");
        queryInterceptorDatabase.queryCallback.onQuery("TRANSACTION SUCCESSFUL", ch3.m21246k());
    }

    @Override // p001o.leg
    public void beginTransaction() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.s4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransaction$lambda$0(this.f44806a);
            }
        });
        this.delegate.beginTransaction();
    }

    @Override // p001o.leg
    public void beginTransactionNonExclusive() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.k4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransactionNonExclusive$lambda$1(this.f31459a);
            }
        });
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // p001o.leg
    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        sq8.m48649h(sQLiteTransactionListener, "transactionListener");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.m4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransactionWithListener$lambda$2(this.f34784a);
            }
        });
        this.delegate.beginTransactionWithListener(sQLiteTransactionListener);
    }

    @Override // p001o.leg
    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        sq8.m48649h(sQLiteTransactionListener, "transactionListener");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.q4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransactionWithListenerNonExclusive$lambda$3(this.f41301a);
            }
        });
        this.delegate.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // p001o.leg
    public peg compileStatement(String str) {
        sq8.m48649h(str, "sql");
        return new QueryInterceptorStatement(this.delegate.compileStatement(str), str, this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // p001o.leg
    public int delete(String str, String str2, Object[] objArr) {
        sq8.m48649h(str, "table");
        return this.delegate.delete(str, str2, objArr);
    }

    @Override // p001o.leg
    public void disableWriteAheadLogging() {
        this.delegate.disableWriteAheadLogging();
    }

    @Override // p001o.leg
    public boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // p001o.leg
    public void endTransaction() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.u4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.endTransaction$lambda$4(this.f48324a);
            }
        });
        this.delegate.endTransaction();
    }

    @Override // p001o.leg
    public void execPerConnectionSQL(String str, @SuppressLint({"ArrayReturn"}) Object[] objArr) {
        sq8.m48649h(str, "sql");
        this.delegate.execPerConnectionSQL(str, objArr);
    }

    @Override // p001o.leg
    public void execSQL(final String str) {
        sq8.m48649h(str, "sql");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.l4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.execSQL$lambda$10(this.f33246a, str);
            }
        });
        this.delegate.execSQL(str);
    }

    @Override // p001o.leg
    public List<Pair<String, String>> getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // p001o.leg
    public long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    @Override // p001o.leg
    public long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // p001o.leg
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // p001o.leg
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // p001o.leg
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // p001o.leg
    public long insert(String str, int i, ContentValues contentValues) {
        sq8.m48649h(str, "table");
        sq8.m48649h(contentValues, "values");
        return this.delegate.insert(str, i, contentValues);
    }

    @Override // p001o.leg
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // p001o.leg
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // p001o.leg
    public boolean isExecPerConnectionSQLSupported() {
        return this.delegate.isExecPerConnectionSQLSupported();
    }

    @Override // p001o.leg
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // p001o.leg
    public boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // p001o.leg
    public boolean isWriteAheadLoggingEnabled() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // p001o.leg
    public boolean needUpgrade(int i) {
        return this.delegate.needUpgrade(i);
    }

    @Override // p001o.leg
    public Cursor query(final String str) {
        sq8.m48649h(str, SearchIntents.EXTRA_QUERY);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.t4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$6(this.f46363a, str);
            }
        });
        return this.delegate.query(str);
    }

    @Override // p001o.leg
    public void setForeignKeyConstraintsEnabled(boolean z) {
        this.delegate.setForeignKeyConstraintsEnabled(z);
    }

    @Override // p001o.leg
    public void setLocale(Locale locale) {
        sq8.m48649h(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // p001o.leg
    public void setMaxSqlCacheSize(int i) {
        this.delegate.setMaxSqlCacheSize(i);
    }

    @Override // p001o.leg
    public long setMaximumSize(long j) {
        return this.delegate.setMaximumSize(j);
    }

    @Override // p001o.leg
    public void setPageSize(long j) {
        this.delegate.setPageSize(j);
    }

    @Override // p001o.leg
    public void setTransactionSuccessful() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.p4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.setTransactionSuccessful$lambda$5(this.f39325a);
            }
        });
        this.delegate.setTransactionSuccessful();
    }

    @Override // p001o.leg
    public void setVersion(int i) {
        this.delegate.setVersion(i);
    }

    @Override // p001o.leg
    public int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        sq8.m48649h(str, "table");
        sq8.m48649h(contentValues, "values");
        return this.delegate.update(str, i, contentValues, str2, objArr);
    }

    @Override // p001o.leg
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // p001o.leg
    public boolean yieldIfContendedSafely(long j) {
        return this.delegate.yieldIfContendedSafely(j);
    }

    @Override // p001o.leg
    public void execSQL(final String str, Object[] objArr) {
        sq8.m48649h(str, "sql");
        sq8.m48649h(objArr, "bindArgs");
        List listM18961c = bh3.m18961c();
        hh3.m30442B(listM18961c, objArr);
        final List listM18959a = bh3.m18959a(listM18961c);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.v4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.execSQL$lambda$12(this.f49864a, str, listM18959a);
            }
        });
        this.delegate.execSQL(str, listM18959a.toArray(new Object[0]));
    }

    @Override // p001o.leg
    public Cursor query(final String str, final Object[] objArr) {
        sq8.m48649h(str, SearchIntents.EXTRA_QUERY);
        sq8.m48649h(objArr, "bindArgs");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.o4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$7(this.f37760a, str, objArr);
            }
        });
        return this.delegate.query(str, objArr);
    }

    @Override // p001o.leg
    public Cursor query(final oeg oegVar) {
        sq8.m48649h(oegVar, SearchIntents.EXTRA_QUERY);
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        oegVar.bindTo(queryInterceptorProgram);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.r4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$8(this.f42981a, oegVar, queryInterceptorProgram);
            }
        });
        return this.delegate.query(oegVar);
    }

    @Override // p001o.leg
    public Cursor query(final oeg oegVar, CancellationSignal cancellationSignal) {
        sq8.m48649h(oegVar, SearchIntents.EXTRA_QUERY);
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        oegVar.bindTo(queryInterceptorProgram);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.n4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$9(this.f36366a, oegVar, queryInterceptorProgram);
            }
        });
        return this.delegate.query(oegVar);
    }
}
