package p001o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class lk7 implements leg {

    /* renamed from: b */
    public static final C15091b f33943b = new C15091b(null);

    /* renamed from: c */
    public static final String[] f33944c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: d */
    public static final String[] f33945d = new String[0];

    /* renamed from: a */
    public final SQLiteDatabase f33946a;

    /* renamed from: o.lk7$a */
    public static final class C15090a {

        /* renamed from: a */
        public static final C15090a f33947a = new C15090a();

        /* renamed from: a */
        public final void m37374a(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) throws SQLException {
            sq8.m48649h(sQLiteDatabase, "sQLiteDatabase");
            sq8.m48649h(str, "sql");
            sQLiteDatabase.execPerConnectionSQL(str, objArr);
        }
    }

    /* renamed from: o.lk7$b */
    public static final class C15091b {
        public C15091b() {
        }

        public /* synthetic */ C15091b(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.lk7$c */
    public static final class C15092c extends kf9 implements sl7 {

        /* renamed from: a */
        public final /* synthetic */ oeg f33948a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15092c(oeg oegVar) {
            super(4);
            this.f33948a = oegVar;
        }

        @Override // p001o.sl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor mo37376j(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            oeg oegVar = this.f33948a;
            sq8.m48646e(sQLiteQuery);
            oegVar.bindTo(new pk7(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public lk7(SQLiteDatabase sQLiteDatabase) {
        sq8.m48649h(sQLiteDatabase, "delegate");
        this.f33946a = sQLiteDatabase;
    }

    /* renamed from: f */
    public static final Cursor m37371f(sl7 sl7Var, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        sq8.m48649h(sl7Var, "$tmp0");
        return (Cursor) sl7Var.mo37376j(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* renamed from: g */
    public static final Cursor m37372g(oeg oegVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        sq8.m48649h(oegVar, "$query");
        sq8.m48646e(sQLiteQuery);
        oegVar.bindTo(new pk7(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // p001o.leg
    public void beginTransaction() {
        this.f33946a.beginTransaction();
    }

    @Override // p001o.leg
    public void beginTransactionNonExclusive() {
        this.f33946a.beginTransactionNonExclusive();
    }

    @Override // p001o.leg
    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        sq8.m48649h(sQLiteTransactionListener, "transactionListener");
        this.f33946a.beginTransactionWithListener(sQLiteTransactionListener);
    }

    @Override // p001o.leg
    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        sq8.m48649h(sQLiteTransactionListener, "transactionListener");
        this.f33946a.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f33946a.close();
    }

    @Override // p001o.leg
    public peg compileStatement(String str) throws SQLException {
        sq8.m48649h(str, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f33946a.compileStatement(str);
        sq8.m48648g(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new qk7(sQLiteStatementCompileStatement);
    }

    /* renamed from: d */
    public final boolean m37373d(SQLiteDatabase sQLiteDatabase) {
        sq8.m48649h(sQLiteDatabase, "sqLiteDatabase");
        return sq8.m48644c(this.f33946a, sQLiteDatabase);
    }

    @Override // p001o.leg
    public int delete(String str, String str2, Object[] objArr) throws SQLException {
        sq8.m48649h(str, "table");
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(str);
        if (!(str2 == null || str2.length() == 0)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        String string = sb.toString();
        sq8.m48648g(string, "StringBuilder().apply(builderAction).toString()");
        peg pegVarCompileStatement = compileStatement(string);
        ttf.f47772c.m50585b(pegVarCompileStatement, objArr);
        return pegVarCompileStatement.executeUpdateDelete();
    }

    @Override // p001o.leg
    public void disableWriteAheadLogging() {
        geg.m28533d(this.f33946a);
    }

    @Override // p001o.leg
    public boolean enableWriteAheadLogging() {
        return this.f33946a.enableWriteAheadLogging();
    }

    @Override // p001o.leg
    public void endTransaction() {
        this.f33946a.endTransaction();
    }

    @Override // p001o.leg
    public void execPerConnectionSQL(String str, Object[] objArr) throws SQLException {
        sq8.m48649h(str, "sql");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            C15090a.f33947a.m37374a(this.f33946a, str, objArr);
            return;
        }
        throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + i);
    }

    @Override // p001o.leg
    public void execSQL(String str) throws SQLException {
        sq8.m48649h(str, "sql");
        this.f33946a.execSQL(str);
    }

    @Override // p001o.leg
    public List getAttachedDbs() {
        return this.f33946a.getAttachedDbs();
    }

    @Override // p001o.leg
    public long getMaximumSize() {
        return this.f33946a.getMaximumSize();
    }

    @Override // p001o.leg
    public long getPageSize() {
        return this.f33946a.getPageSize();
    }

    @Override // p001o.leg
    public String getPath() {
        return this.f33946a.getPath();
    }

    @Override // p001o.leg
    public int getVersion() {
        return this.f33946a.getVersion();
    }

    @Override // p001o.leg
    public boolean inTransaction() {
        return this.f33946a.inTransaction();
    }

    @Override // p001o.leg
    public long insert(String str, int i, ContentValues contentValues) {
        sq8.m48649h(str, "table");
        sq8.m48649h(contentValues, "values");
        return this.f33946a.insertWithOnConflict(str, null, contentValues, i);
    }

    @Override // p001o.leg
    public boolean isDatabaseIntegrityOk() {
        return this.f33946a.isDatabaseIntegrityOk();
    }

    @Override // p001o.leg
    public boolean isDbLockedByCurrentThread() {
        return this.f33946a.isDbLockedByCurrentThread();
    }

    @Override // p001o.leg
    public boolean isExecPerConnectionSQLSupported() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // p001o.leg
    public boolean isOpen() {
        return this.f33946a.isOpen();
    }

    @Override // p001o.leg
    public boolean isReadOnly() {
        return this.f33946a.isReadOnly();
    }

    @Override // p001o.leg
    public boolean isWriteAheadLoggingEnabled() {
        return geg.m28534e(this.f33946a);
    }

    @Override // p001o.leg
    public boolean needUpgrade(int i) {
        return this.f33946a.needUpgrade(i);
    }

    @Override // p001o.leg
    public Cursor query(String str) {
        sq8.m48649h(str, SearchIntents.EXTRA_QUERY);
        return query(new ttf(str));
    }

    @Override // p001o.leg
    public void setForeignKeyConstraintsEnabled(boolean z) {
        geg.m28536g(this.f33946a, z);
    }

    @Override // p001o.leg
    public void setLocale(Locale locale) {
        sq8.m48649h(locale, "locale");
        this.f33946a.setLocale(locale);
    }

    @Override // p001o.leg
    public void setMaxSqlCacheSize(int i) {
        this.f33946a.setMaxSqlCacheSize(i);
    }

    @Override // p001o.leg
    public long setMaximumSize(long j) {
        this.f33946a.setMaximumSize(j);
        return this.f33946a.getMaximumSize();
    }

    @Override // p001o.leg
    public void setPageSize(long j) {
        this.f33946a.setPageSize(j);
    }

    @Override // p001o.leg
    public void setTransactionSuccessful() {
        this.f33946a.setTransactionSuccessful();
    }

    @Override // p001o.leg
    public void setVersion(int i) {
        this.f33946a.setVersion(i);
    }

    @Override // p001o.leg
    public int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) throws SQLException {
        sq8.m48649h(str, "table");
        sq8.m48649h(contentValues, "values");
        int i2 = 0;
        if (!(contentValues.size() != 0)) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(f33944c[i]);
        sb.append(str);
        sb.append(" SET ");
        for (String str3 : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str3);
            objArr2[i2] = contentValues.get(str3);
            sb.append("=?");
            i2++;
        }
        if (objArr != null) {
            for (int i3 = size; i3 < length; i3++) {
                objArr2[i3] = objArr[i3 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        String string = sb.toString();
        sq8.m48648g(string, "StringBuilder().apply(builderAction).toString()");
        peg pegVarCompileStatement = compileStatement(string);
        ttf.f47772c.m50585b(pegVarCompileStatement, objArr2);
        return pegVarCompileStatement.executeUpdateDelete();
    }

    @Override // p001o.leg
    public boolean yieldIfContendedSafely() {
        return this.f33946a.yieldIfContendedSafely();
    }

    @Override // p001o.leg
    public void execSQL(String str, Object[] objArr) throws SQLException {
        sq8.m48649h(str, "sql");
        sq8.m48649h(objArr, "bindArgs");
        this.f33946a.execSQL(str, objArr);
    }

    @Override // p001o.leg
    public Cursor query(String str, Object[] objArr) {
        sq8.m48649h(str, SearchIntents.EXTRA_QUERY);
        sq8.m48649h(objArr, "bindArgs");
        return query(new ttf(str, objArr));
    }

    @Override // p001o.leg
    public boolean yieldIfContendedSafely(long j) {
        return this.f33946a.yieldIfContendedSafely(j);
    }

    @Override // p001o.leg
    public Cursor query(oeg oegVar) {
        sq8.m48649h(oegVar, SearchIntents.EXTRA_QUERY);
        final C15092c c15092c = new C15092c(oegVar);
        Cursor cursorRawQueryWithFactory = this.f33946a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: o.kk7
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return lk7.m37371f(c15092c, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, oegVar.getSql(), f33945d, null);
        sq8.m48648g(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // p001o.leg
    public Cursor query(final oeg oegVar, CancellationSignal cancellationSignal) {
        sq8.m48649h(oegVar, SearchIntents.EXTRA_QUERY);
        SQLiteDatabase sQLiteDatabase = this.f33946a;
        String sql = oegVar.getSql();
        String[] strArr = f33945d;
        sq8.m48646e(cancellationSignal);
        return geg.m28535f(sQLiteDatabase, sql, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: o.jk7
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return lk7.m37372g(oegVar, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }
}
