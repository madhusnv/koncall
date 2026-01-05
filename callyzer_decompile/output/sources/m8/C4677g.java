package m8;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import il.AbstractC3295c;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k4.C4001v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import l8.AbstractC4428b;
import l8.InterfaceC4427a;
import n8.C4976a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m8.g */
/* loaded from: classes.dex */
public final class C4677g extends SQLiteOpenHelper {

    /* renamed from: h */
    public static final /* synthetic */ int f23121h = 0;

    /* renamed from: a */
    public final Context f23122a;

    /* renamed from: b */
    public final C4001v f23123b;

    /* renamed from: c */
    public final AbstractC4428b f23124c;

    /* renamed from: d */
    public final boolean f23125d;

    /* renamed from: e */
    public boolean f23126e;

    /* renamed from: f */
    public final C4976a f23127f;

    /* renamed from: g */
    public boolean f23128g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4677g(Context context, String str, final C4001v c4001v, final AbstractC4428b callback, boolean z6) {
        String string;
        super(context, str, null, callback.f22147a, new DatabaseErrorHandler() { // from class: m8.c
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i10 = C4677g.f23121h;
                AbstractC4154l.m8920c(sQLiteDatabase);
                C4672b c4672bM7639a = AbstractC3295c.m7639a(c4001v, sQLiteDatabase);
                callback.getClass();
                SQLiteDatabase sQLiteDatabase2 = c4672bM7639a.f23115a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        AbstractC4428b.m9266a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object second = ((Pair) it.next()).second;
                                AbstractC4154l.m8922e(second, "second");
                                AbstractC4428b.m9266a((String) second);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                AbstractC4428b.m9266a(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    c4672bM7639a.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(callback, "callback");
        this.f23122a = context;
        this.f23123b = c4001v;
        this.f23124c = callback;
        this.f23125d = z6;
        if (str == null) {
            string = UUID.randomUUID().toString();
            AbstractC4154l.m8922e(string, "toString(...)");
        } else {
            string = str;
        }
        this.f23127f = new C4976a(string, context.getCacheDir(), false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() throws IOException {
        C4976a c4976a = this.f23127f;
        try {
            c4976a.m9893a(c4976a.f24698a);
            super.close();
            this.f23123b.f20704b = null;
            this.f23128g = false;
        } finally {
            c4976a.m9894b();
        }
    }

    /* renamed from: h */
    public final InterfaceC4427a m9571h(boolean z6) throws IOException {
        C4976a c4976a = this.f23127f;
        try {
            c4976a.m9893a((this.f23128g || getDatabaseName() == null) ? false : true);
            this.f23126e = false;
            SQLiteDatabase sQLiteDatabaseM9572j = m9572j(z6);
            if (!this.f23126e) {
                C4672b c4672bM7639a = AbstractC3295c.m7639a(this.f23123b, sQLiteDatabaseM9572j);
                c4976a.m9894b();
                return c4672bM7639a;
            }
            close();
            InterfaceC4427a interfaceC4427aM9571h = m9571h(z6);
            c4976a.m9894b();
            return interfaceC4427aM9571h;
        } catch (Throwable th2) {
            c4976a.m9894b();
            throw th2;
        }
    }

    /* renamed from: j */
    public final SQLiteDatabase m9572j(boolean z6) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z10 = this.f23128g;
        Context context = this.f23122a;
        if (databaseName != null && !z10 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            if (z6) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                AbstractC4154l.m8920c(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            AbstractC4154l.m8920c(readableDatabase3);
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z6) {
                    readableDatabase2 = getWritableDatabase();
                    AbstractC4154l.m8920c(readableDatabase2);
                } else {
                    readableDatabase2 = getReadableDatabase();
                    AbstractC4154l.m8920c(readableDatabase2);
                }
                return readableDatabase2;
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof C4674d) {
                    C4674d c4674d = (C4674d) th;
                    int i10 = AbstractC4676f.f23120a[c4674d.f23118a.ordinal()];
                    th = c4674d.f23119b;
                    if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                        throw th;
                    }
                    if (i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f23125d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z6) {
                        readableDatabase = getWritableDatabase();
                        AbstractC4154l.m8920c(readableDatabase);
                    } else {
                        readableDatabase = getReadableDatabase();
                        AbstractC4154l.m8920c(readableDatabase);
                    }
                    return readableDatabase;
                } catch (C4674d e2) {
                    throw e2.f23119b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db2) {
        AbstractC4154l.m8923f(db2, "db");
        boolean z6 = this.f23126e;
        AbstractC4428b abstractC4428b = this.f23124c;
        if (!z6 && abstractC4428b.f22147a != db2.getVersion()) {
            db2.setMaxSqlCacheSize(1);
        }
        try {
            abstractC4428b.mo9267b(AbstractC3295c.m7639a(this.f23123b, db2));
        } catch (Throwable th2) {
            throw new C4674d(EnumC4675e.ON_CONFIGURE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        AbstractC4154l.m8923f(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f23124c.mo9268c(AbstractC3295c.m7639a(this.f23123b, sqLiteDatabase));
        } catch (Throwable th2) {
            throw new C4674d(EnumC4675e.ON_CREATE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
        AbstractC4154l.m8923f(db2, "db");
        this.f23126e = true;
        try {
            this.f23124c.mo9269d(AbstractC3295c.m7639a(this.f23123b, db2), i10, i11);
        } catch (Throwable th2) {
            throw new C4674d(EnumC4675e.ON_DOWNGRADE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db2) {
        AbstractC4154l.m8923f(db2, "db");
        if (!this.f23126e) {
            try {
                this.f23124c.mo9270e(AbstractC3295c.m7639a(this.f23123b, db2));
            } catch (Throwable th2) {
                throw new C4674d(EnumC4675e.ON_OPEN, th2);
            }
        }
        this.f23128g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
        AbstractC4154l.m8923f(sqLiteDatabase, "sqLiteDatabase");
        this.f23126e = true;
        try {
            this.f23124c.mo9271f(AbstractC3295c.m7639a(this.f23123b, sqLiteDatabase), i10, i11);
        } catch (Throwable th2) {
            throw new C4674d(EnumC4675e.ON_UPGRADE, th2);
        }
    }
}
