package androidx.room;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p001o.ch3;
import p001o.heg;
import p001o.jeg;
import p001o.keg;
import p001o.leg;
import p001o.meg;
import p001o.oeg;
import p001o.peg;
import p001o.sq8;
import p001o.tpb;
import p001o.wrd;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class AutoClosingRoomOpenHelper implements meg, DelegatingOpenHelper {
    public final AutoCloser autoCloser;
    private final AutoClosingSupportSQLiteDatabase autoClosingDb;
    private final meg delegate;

    public static final class AutoClosingSupportSQLiteDatabase implements leg {
        private final AutoCloser autoCloser;

        public AutoClosingSupportSQLiteDatabase(AutoCloser autoCloser) {
            sq8.m48649h(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        @Override // p001o.leg
        public void beginTransaction() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // p001o.leg
        public void beginTransactionNonExclusive() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // p001o.leg
        public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
            sq8.m48649h(sQLiteTransactionListener, "transactionListener");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(sQLiteTransactionListener);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // p001o.leg
        public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
            sq8.m48649h(sQLiteTransactionListener, "transactionListener");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.autoCloser.closeDatabaseIfOpen();
        }

        @Override // p001o.leg
        public peg compileStatement(String str) {
            sq8.m48649h(str, "sql");
            return new AutoClosingSupportSqliteStatement(str, this.autoCloser);
        }

        @Override // p001o.leg
        public int delete(String str, String str2, Object[] objArr) {
            sq8.m48649h(str, "table");
            return ((Number) this.autoCloser.executeRefCountingFunction(new C2418xa7295701(str, str2, objArr))).intValue();
        }

        @Override // p001o.leg
        public void disableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // p001o.leg
        public boolean enableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // p001o.leg
        public void endTransaction() {
            if (this.autoCloser.getDelegateDatabase$room_runtime_release() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null".toString());
            }
            try {
                leg delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
                sq8.m48646e(delegateDatabase$room_runtime_release);
                delegateDatabase$room_runtime_release.endTransaction();
            } finally {
                this.autoCloser.decrementCountAndScheduleClose();
            }
        }

        @Override // p001o.leg
        public /* bridge */ /* synthetic */ void execPerConnectionSQL(String str, @SuppressLint({"ArrayReturn"}) Object[] objArr) {
            super.execPerConnectionSQL(str, objArr);
        }

        @Override // p001o.leg
        public void execSQL(String str) {
            sq8.m48649h(str, "sql");
            this.autoCloser.executeRefCountingFunction(new C2419x106d7261(str));
        }

        @Override // p001o.leg
        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.autoCloser.executeRefCountingFunction(C2417x882a29d5.INSTANCE);
        }

        @Override // p001o.leg
        public long getMaximumSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new wrd() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1
                @Override // p001o.cc9
                public Object get(Object obj) {
                    return Long.valueOf(((leg) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // p001o.leg
        public long getPageSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new tpb() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1
                @Override // p001o.tpb, p001o.cc9
                public Object get(Object obj) {
                    return Long.valueOf(((leg) obj).getPageSize());
                }

                public void set(Object obj, Object obj2) {
                    ((leg) obj).setPageSize(((Number) obj2).longValue());
                }
            })).longValue();
        }

        @Override // p001o.leg
        public String getPath() {
            return (String) this.autoCloser.executeRefCountingFunction(C2431x4ec8cd3b.INSTANCE);
        }

        @Override // p001o.leg
        public int getVersion() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new tpb() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1
                @Override // p001o.tpb, p001o.cc9
                public Object get(Object obj) {
                    return Integer.valueOf(((leg) obj).getVersion());
                }

                public void set(Object obj, Object obj2) {
                    ((leg) obj).setVersion(((Number) obj2).intValue());
                }
            })).intValue();
        }

        @Override // p001o.leg
        public boolean inTransaction() {
            if (this.autoCloser.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(C2421x5693171d.INSTANCE)).booleanValue();
        }

        @Override // p001o.leg
        public long insert(String str, int i, ContentValues contentValues) {
            sq8.m48649h(str, "table");
            sq8.m48649h(contentValues, "values");
            return ((Number) this.autoCloser.executeRefCountingFunction(new C2422x9698888f(str, i, contentValues))).longValue();
        }

        @Override // p001o.leg
        public boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(C2423x7d1b80e8.INSTANCE)).booleanValue();
        }

        @Override // p001o.leg
        public boolean isDbLockedByCurrentThread() {
            if (this.autoCloser.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new wrd() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1
                @Override // p001o.cc9
                public Object get(Object obj) {
                    return Boolean.valueOf(((leg) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // p001o.leg
        public /* bridge */ /* synthetic */ boolean isExecPerConnectionSQLSupported() {
            return super.isExecPerConnectionSQLSupported();
        }

        @Override // p001o.leg
        public boolean isOpen() {
            leg delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
            if (delegateDatabase$room_runtime_release == null) {
                return false;
            }
            return delegateDatabase$room_runtime_release.isOpen();
        }

        @Override // p001o.leg
        public boolean isReadOnly() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(C2425x928ac242.INSTANCE)).booleanValue();
        }

        @Override // p001o.leg
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(C2426x1aa74a04.INSTANCE)).booleanValue();
        }

        @Override // p001o.leg
        public boolean needUpgrade(int i) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new C2428xfb73a9ca(i))).booleanValue();
        }

        public final void pokeOpen() {
            this.autoCloser.executeRefCountingFunction(C2432x1a023a99.INSTANCE);
        }

        @Override // p001o.leg
        public Cursor query(String str) {
            sq8.m48649h(str, SearchIntents.EXTRA_QUERY);
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(str), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // p001o.leg
        public void setForeignKeyConstraintsEnabled(boolean z) {
            this.autoCloser.executeRefCountingFunction(new C2433xeb7db11c(z));
        }

        @Override // p001o.leg
        public void setLocale(Locale locale) {
            sq8.m48649h(locale, "locale");
            this.autoCloser.executeRefCountingFunction(new C2434xf1df5ec0(locale));
        }

        @Override // p001o.leg
        public void setMaxSqlCacheSize(int i) {
            this.autoCloser.executeRefCountingFunction(new C2435x9778840d(i));
        }

        @Override // p001o.leg
        public long setMaximumSize(long j) {
            return ((Number) this.autoCloser.executeRefCountingFunction(new C2436xd48b87d5(j))).longValue();
        }

        @Override // p001o.leg
        public void setPageSize(long j) {
            this.autoCloser.executeRefCountingFunction(new C2430x65399d07(j));
        }

        @Override // p001o.leg
        public void setTransactionSuccessful() {
            y3i y3iVar;
            leg delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
            if (delegateDatabase$room_runtime_release != null) {
                delegateDatabase$room_runtime_release.setTransactionSuccessful();
                y3iVar = y3i.f54824a;
            } else {
                y3iVar = null;
            }
            if (y3iVar == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        @Override // p001o.leg
        public void setVersion(int i) {
            this.autoCloser.executeRefCountingFunction(new C2439xff8530fd(i));
        }

        @Override // p001o.leg
        public int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
            sq8.m48649h(str, "table");
            sq8.m48649h(contentValues, "values");
            return ((Number) this.autoCloser.executeRefCountingFunction(new C2437xc522ba9f(str, i, contentValues, str2, objArr))).intValue();
        }

        @Override // p001o.leg
        public boolean yieldIfContendedSafely() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(C2440x2da6dfee.INSTANCE)).booleanValue();
        }

        @Override // p001o.leg
        public void execSQL(String str, Object[] objArr) {
            sq8.m48649h(str, "sql");
            sq8.m48649h(objArr, "bindArgs");
            this.autoCloser.executeRefCountingFunction(new C2420x106d7262(str, objArr));
        }

        @Override // p001o.leg
        public boolean yieldIfContendedSafely(long j) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(C2441x2da6dfef.INSTANCE)).booleanValue();
        }

        @Override // p001o.leg
        public Cursor query(String str, Object[] objArr) {
            sq8.m48649h(str, SearchIntents.EXTRA_QUERY);
            sq8.m48649h(objArr, "bindArgs");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(str, objArr), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // p001o.leg
        public Cursor query(oeg oegVar) {
            sq8.m48649h(oegVar, SearchIntents.EXTRA_QUERY);
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(oegVar), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // p001o.leg
        public Cursor query(oeg oegVar, CancellationSignal cancellationSignal) {
            sq8.m48649h(oegVar, SearchIntents.EXTRA_QUERY);
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(oegVar, cancellationSignal), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }
    }

    public static final class AutoClosingSupportSqliteStatement implements peg {
        private final AutoCloser autoCloser;
        private final ArrayList<Object> binds;
        private final String sql;

        public AutoClosingSupportSqliteStatement(String str, AutoCloser autoCloser) {
            sq8.m48649h(str, "sql");
            sq8.m48649h(autoCloser, "autoCloser");
            this.sql = str;
            this.autoCloser = autoCloser;
            this.binds = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void doBinds(peg pegVar) {
            Iterator<T> it = this.binds.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                int i2 = i + 1;
                if (i < 0) {
                    ch3.m21256u();
                }
                Object obj = this.binds.get(i);
                if (obj == null) {
                    pegVar.bindNull(i2);
                } else if (obj instanceof Long) {
                    pegVar.bindLong(i2, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    pegVar.bindDouble(i2, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    pegVar.bindString(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    pegVar.bindBlob(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        private final <T> T executeSqliteStatementWithRefCount(xk7 xk7Var) {
            return (T) this.autoCloser.executeRefCountingFunction(new C2444xdd6c1cf2(this, xk7Var));
        }

        private final void saveBinds(int i, Object obj) {
            int size;
            int i2 = i - 1;
            if (i2 >= this.binds.size() && (size = this.binds.size()) <= i2) {
                while (true) {
                    this.binds.add(null);
                    if (size == i2) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.binds.set(i2, obj);
        }

        @Override // p001o.neg
        public void bindBlob(int i, byte[] bArr) {
            sq8.m48649h(bArr, "value");
            saveBinds(i, bArr);
        }

        @Override // p001o.neg
        public void bindDouble(int i, double d) {
            saveBinds(i, Double.valueOf(d));
        }

        @Override // p001o.neg
        public void bindLong(int i, long j) {
            saveBinds(i, Long.valueOf(j));
        }

        @Override // p001o.neg
        public void bindNull(int i) {
            saveBinds(i, null);
        }

        @Override // p001o.neg
        public void bindString(int i, String str) {
            sq8.m48649h(str, "value");
            saveBinds(i, str);
        }

        @Override // p001o.neg
        public void clearBindings() {
            this.binds.clear();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // p001o.peg
        public void execute() {
            executeSqliteStatementWithRefCount(C2442xc356304d.INSTANCE);
        }

        @Override // p001o.peg
        public long executeInsert() {
            return ((Number) executeSqliteStatementWithRefCount(C2443xe79bbce6.INSTANCE)).longValue();
        }

        @Override // p001o.peg
        public int executeUpdateDelete() {
            return ((Number) executeSqliteStatementWithRefCount(C2445x7fb2e741.INSTANCE)).intValue();
        }

        @Override // p001o.peg
        public long simpleQueryForLong() {
            return ((Number) executeSqliteStatementWithRefCount(C2446x6100e31.INSTANCE)).longValue();
        }

        @Override // p001o.peg
        public String simpleQueryForString() {
            return (String) executeSqliteStatementWithRefCount(C2447xa8feac86.INSTANCE);
        }
    }

    public static final class KeepAliveCursor implements Cursor {
        private final AutoCloser autoCloser;
        private final Cursor delegate;

        public KeepAliveCursor(Cursor cursor, AutoCloser autoCloser) {
            sq8.m48649h(cursor, "delegate");
            sq8.m48649h(autoCloser, "autoCloser");
            this.delegate = cursor;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.delegate.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i) {
            return this.delegate.getBlob(i);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.delegate.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.delegate.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i) {
            return this.delegate.getColumnName(i);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i) {
            return this.delegate.getDouble(i);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i) {
            return this.delegate.getFloat(i);
        }

        @Override // android.database.Cursor
        public int getInt(int i) {
            return this.delegate.getInt(i);
        }

        @Override // android.database.Cursor
        public long getLong(int i) {
            return this.delegate.getLong(i);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return heg.m30315a(this.delegate);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return keg.m35550a(this.delegate);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i) {
            return this.delegate.getShort(i);
        }

        @Override // android.database.Cursor
        public String getString(int i) {
            return this.delegate.getString(i);
        }

        @Override // android.database.Cursor
        public int getType(int i) {
            return this.delegate.getType(i);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i) {
            return this.delegate.isNull(i);
        }

        @Override // android.database.Cursor
        public boolean move(int i) {
            return this.delegate.move(i);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i) {
            return this.delegate.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.delegate.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.delegate.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.delegate.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            sq8.m48649h(bundle, "extras");
            jeg.m33666a(this.delegate, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.delegate.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List<? extends Uri> list) {
            sq8.m48649h(contentResolver, "cr");
            sq8.m48649h(list, "uris");
            keg.m35551b(this.delegate, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.delegate.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.delegate.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public AutoClosingRoomOpenHelper(meg megVar, AutoCloser autoCloser) {
        sq8.m48649h(megVar, "delegate");
        sq8.m48649h(autoCloser, "autoCloser");
        this.delegate = megVar;
        this.autoCloser = autoCloser;
        autoCloser.init(getDelegate());
        this.autoClosingDb = new AutoClosingSupportSQLiteDatabase(autoCloser);
    }

    @Override // p001o.meg, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.autoClosingDb.close();
    }

    @Override // p001o.meg
    public String getDatabaseName() {
        return this.delegate.getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    public meg getDelegate() {
        return this.delegate;
    }

    @Override // p001o.meg
    public leg getReadableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // p001o.meg
    public leg getWritableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // p001o.meg
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.delegate.setWriteAheadLoggingEnabled(z);
    }
}
