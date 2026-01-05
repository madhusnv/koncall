package p001o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.File;

/* loaded from: classes2.dex */
public final class geg {

    /* renamed from: a */
    public static final geg f25050a = new geg();

    /* renamed from: a */
    public static final void m28530a(CancellationSignal cancellationSignal) {
        sq8.m48649h(cancellationSignal, "cancellationSignal");
        cancellationSignal.cancel();
    }

    /* renamed from: b */
    public static final CancellationSignal m28531b() {
        return new CancellationSignal();
    }

    /* renamed from: c */
    public static final boolean m28532c(File file) {
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        return SQLiteDatabase.deleteDatabase(file);
    }

    /* renamed from: d */
    public static final void m28533d(SQLiteDatabase sQLiteDatabase) {
        sq8.m48649h(sQLiteDatabase, "sQLiteDatabase");
        sQLiteDatabase.disableWriteAheadLogging();
    }

    /* renamed from: e */
    public static final boolean m28534e(SQLiteDatabase sQLiteDatabase) {
        sq8.m48649h(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    /* renamed from: f */
    public static final Cursor m28535f(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        sq8.m48649h(sQLiteDatabase, "sQLiteDatabase");
        sq8.m48649h(str, "sql");
        sq8.m48649h(strArr, "selectionArgs");
        sq8.m48649h(cancellationSignal, "cancellationSignal");
        sq8.m48649h(cursorFactory, "cursorFactory");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        sq8.m48648g(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }

    /* renamed from: g */
    public static final void m28536g(SQLiteDatabase sQLiteDatabase, boolean z) {
        sq8.m48649h(sQLiteDatabase, "sQLiteDatabase");
        sQLiteDatabase.setForeignKeyConstraintsEnabled(z);
    }

    /* renamed from: h */
    public static final void m28537h(SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
        sq8.m48649h(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
    }
}
