package m8;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import hq.C3008m;
import hq.C3011p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4154l;
import l8.InterfaceC4427a;
import l8.InterfaceC4433g;
import og.nd;
import qw.EnumC6359i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m8.b */
/* loaded from: classes.dex */
public final class C4672b implements InterfaceC4427a {

    /* renamed from: b */
    public static final String[] f23111b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c */
    public static final String[] f23112c = new String[0];

    /* renamed from: d */
    public static final Object f23113d;

    /* renamed from: e */
    public static final Object f23114e;

    /* renamed from: a */
    public final SQLiteDatabase f23115a;

    static {
        EnumC6359i enumC6359i = EnumC6359i.NONE;
        f23113d = nd.m10781b(enumC6359i, new C3008m(26));
        f23114e = nd.m10781b(enumC6359i, new C3008m(27));
    }

    public C4672b(SQLiteDatabase sQLiteDatabase) {
        this.f23115a = sQLiteDatabase;
    }

    @Override // l8.InterfaceC4427a
    /* renamed from: E */
    public final void mo9258E(Object[] objArr) throws SQLException {
        this.f23115a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // l8.InterfaceC4427a
    /* renamed from: F */
    public final void mo9259F() {
        this.f23115a.setTransactionSuccessful();
    }

    @Override // l8.InterfaceC4427a
    /* renamed from: I */
    public final void mo9260I() {
        this.f23115a.beginTransactionNonExclusive();
    }

    @Override // l8.InterfaceC4427a
    /* renamed from: T */
    public final void mo9261T() {
        this.f23115a.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23115a.close();
    }

    @Override // l8.InterfaceC4427a
    public final boolean d0() {
        return this.f23115a.inTransaction();
    }

    @Override // l8.InterfaceC4427a
    public final int getVersion() {
        return this.f23115a.getVersion();
    }

    @Override // l8.InterfaceC4427a
    public final boolean isOpen() {
        return this.f23115a.isOpen();
    }

    @Override // l8.InterfaceC4427a
    /* renamed from: k */
    public final void mo9262k() {
        this.f23115a.beginTransaction();
    }

    @Override // l8.InterfaceC4427a
    public final boolean k0() {
        return this.f23115a.isWriteAheadLoggingEnabled();
    }

    @Override // l8.InterfaceC4427a
    /* renamed from: p */
    public final void mo9263p(String sql) {
        AbstractC4154l.m8923f(sql, "sql");
        this.f23115a.execSQL(sql);
    }

    @Override // l8.InterfaceC4427a
    public final Cursor q0(InterfaceC4433g interfaceC4433g) {
        final C3011p c3011p = new C3011p(1, interfaceC4433g);
        Cursor cursorRawQueryWithFactory = this.f23115a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: m8.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) c3011p.mo1450c(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, interfaceC4433g.mo5740n(), f23112c, null);
        AbstractC4154l.m8922e(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // l8.InterfaceC4427a
    /* renamed from: t */
    public final C4680j mo9264t(String sql) throws SQLException {
        AbstractC4154l.m8923f(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f23115a.compileStatement(sql);
        AbstractC4154l.m8922e(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new C4680j(sQLiteStatementCompileStatement);
    }

    @Override // l8.InterfaceC4427a
    public final int u0(ContentValues contentValues, Object[] objArr) throws SQLException {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(f23111b[3]);
        sb2.append("WorkSpec SET ");
        int i10 = 0;
        for (String str : contentValues.keySet()) {
            sb2.append(i10 > 0 ? "," : "");
            sb2.append(str);
            objArr2[i10] = contentValues.get(str);
            sb2.append("=?");
            i10++;
        }
        for (int i11 = size; i11 < length; i11++) {
            objArr2[i11] = objArr[i11 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        C4680j c4680jMo9264t = mo9264t(sb2.toString());
        int length2 = objArr2.length;
        int i12 = 0;
        while (i12 < length2) {
            Object obj = objArr2[i12];
            i12++;
            if (obj == null) {
                c4680jMo9264t.mo9277i(i12);
            } else if (obj instanceof byte[]) {
                c4680jMo9264t.mo9274L(i12, (byte[]) obj);
            } else if (obj instanceof Float) {
                c4680jMo9264t.mo9275Z(((Number) obj).floatValue(), i12);
            } else if (obj instanceof Double) {
                c4680jMo9264t.mo9275Z(((Number) obj).doubleValue(), i12);
            } else if (obj instanceof Long) {
                c4680jMo9264t.mo9276g(i12, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                c4680jMo9264t.mo9276g(i12, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                c4680jMo9264t.mo9276g(i12, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                c4680jMo9264t.mo9276g(i12, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                c4680jMo9264t.mo9278q(i12, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i12 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                c4680jMo9264t.mo9276g(i12, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return c4680jMo9264t.f23137b.executeUpdateDelete();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, qw.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qw.g] */
    @Override // l8.InterfaceC4427a
    /* renamed from: x */
    public final void mo9265x() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ?? r12 = f23114e;
        if (((Method) r12.getValue()) != null) {
            ?? r22 = f23113d;
            if (((Method) r22.getValue()) != null) {
                Method method = (Method) r12.getValue();
                AbstractC4154l.m8920c(method);
                Method method2 = (Method) r22.getValue();
                AbstractC4154l.m8920c(method2);
                Object objInvoke = method2.invoke(this.f23115a, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        mo9262k();
    }
}
